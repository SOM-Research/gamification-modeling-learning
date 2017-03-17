package codeskills.resource;

import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.AESCipherImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.equinox.security.storage.ISecurePreferences;
import org.eclipse.equinox.security.storage.SecurePreferencesFactory;
import org.eclipse.equinox.security.storage.StorageException;

public class EncryptionXMIFactoryImpl extends XMIResourceFactoryImpl {
	
	private Logger logger = Logger.getAnonymousLogger();
	
	private static final String SECURE_PREFERENCES_NODE = "vault";
	private static final String VALUE = "value";

	private ISecurePreferences preferences;
	
	private void loadVault() {
		if (this.preferences == null) {
			this.preferences = SecurePreferencesFactory.getDefault();
		}
		
		try {
			if(!preferences.nodeExists(SECURE_PREFERENCES_NODE)) {
				logger.log(Level.FINE, "[EncryptionXMIFactoryImpl] init secure preferences node.");
				preferences.node(SECURE_PREFERENCES_NODE).put(VALUE, UUID.randomUUID().toString(), true);
			}
			
		} catch (StorageException  e) {
			logger.log(Level.SEVERE, "[EncryptionXMIFactoryImpl] failed to init secure preferences node!", e);
		}
	}
	
	private String getVault() {
		String found = null;
		try {
			this.loadVault();
			found = preferences.node(SECURE_PREFERENCES_NODE).get(VALUE, null);
		}
		catch(StorageException e1) {
			logger.log(Level.SEVERE, "[EncryptionXMIFactoryImpl] failed to load secure preferences node!", e1);
		}
		
		return found;
	}
	
	private void clearVault() {
		try {
			for(String name : preferences.childrenNames())
				preferences.node(name).removeNode();
		}	
		catch(Exception e1) {
			logger.log(Level.WARNING, "[EncryptionXMIFactoryImpl] nothing to clean in vault!");
		}
	}
	
	public void resetVault() {
		this.clearVault();
		this.loadVault();
	}

    @Override
    public Resource createResource(URI uri) {
        XMIResourceFactoryImpl resFactory = new XMIResourceFactoryImpl();
        XMIResource resource = (XMIResource) resFactory.createResource(uri);
        try {
                resource.getDefaultLoadOptions().put(Resource.OPTION_CIPHER,
                                new AESCipherImpl(this.getVault()));
                resource.getDefaultSaveOptions().put(Resource.OPTION_CIPHER,
                                new AESCipherImpl(this.getVault()));
        } catch (Exception e) {
                e.printStackTrace();
        }
        return resource;
    }
}
