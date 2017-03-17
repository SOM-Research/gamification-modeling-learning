package codeskills.handlers;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

import codeskills.game.GameManager;

public class SubmitManager {
	
	private GameManager gameManager;
	private Logger logger = Logger.getAnonymousLogger();
	
	public SubmitManager() {
		this.gameManager = GameManager.getInstance();
	}
	
	private String getServerUrl(Map<String, String> data) {
		return data.get("url");
	}
	
	private String prepareContent(Map<String, String> data) {
		String json = "";
		if (!data.isEmpty()) {
			json = "{\"user_info\" : {";
			
			//user info
			for (String key : data.keySet()) {
				if (!key.equals("url"))
					json = json + this.toJSON(key, data.get(key)) + ",";
			}
			
			json = json.replaceFirst(",$", "");
			json = json + "} , ";
			
			//status info
			json = json + this.gameManager.toJSON();
			
			json = json + "}";
		}
		
		return json;
		
	}
	
	private String toJSON(String key, String value) {
		return "\"" + key.toLowerCase() + "\" : \"" + value + "\""; 
	}
	
	public void sendData(Map<String, String> data) {
		String serverURL = this.getServerUrl(data);
		String jsonContent = this.prepareContent(data);
		
		if (!serverURL.equals("") && !jsonContent.equals(""))
			System.out.println("ok");
			//this.upload(serverURL, jsonContent);
		else
			logger.log(java.util.logging.Level.SEVERE, "[SubmitManager] data cannot be sent to the server " + serverURL);
	}
	
	private void upload(String serverURL, String jsonContent) {
		try {
	        URL url = new URL(serverURL);
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setConnectTimeout(5000);
	        conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
	        conn.setDoOutput(true);
	        conn.setDoInput(true);
	        conn.setRequestMethod("POST");
	
	        OutputStream os = conn.getOutputStream();
	        os.write(jsonContent.getBytes("UTF-8"));
	        os.close();
	
	        // read the response
	        InputStream in = new BufferedInputStream(conn.getInputStream());
	        String response = new Scanner(in, "UTF-8").useDelimiter("\\A").next();
	
	        System.out.println(response);
	
	        in.close();
	        conn.disconnect();
		}
		catch (Exception e) {
			logger.log(java.util.logging.Level.SEVERE, "[SubmitManager] something went wrong when uploading the data ", e);
		}

}
	

}
