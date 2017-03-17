package codeskills.designer.data.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import codeskills.designer.data.services.DataGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOL", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'{'", "'name'", "':'", "','", "'files'", "'['", "']'", "'folders'", "'}'", "'ext'", "'changed'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_BOOL=5;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDataParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDataParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDataParser.tokenNames; }
    public String getGrammarFileName() { return "InternalData.g"; }



     	private DataGrammarAccess grammarAccess;

        public InternalDataParser(TokenStream input, DataGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Resource";
       	}

       	@Override
       	protected DataGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleResource"
    // InternalData.g:64:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalData.g:64:49: (iv_ruleResource= ruleResource EOF )
            // InternalData.g:65:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalData.g:71:1: ruleResource returns [EObject current=null] : (this_ContainerResource_0= ruleContainerResource | this_File_1= ruleFile ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        EObject this_ContainerResource_0 = null;

        EObject this_File_1 = null;



        	enterRule();

        try {
            // InternalData.g:77:2: ( (this_ContainerResource_0= ruleContainerResource | this_File_1= ruleFile ) )
            // InternalData.g:78:2: (this_ContainerResource_0= ruleContainerResource | this_File_1= ruleFile )
            {
            // InternalData.g:78:2: (this_ContainerResource_0= ruleContainerResource | this_File_1= ruleFile )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==14) ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3==15) ) {
                        int LA1_4 = input.LA(4);

                        if ( (LA1_4==RULE_STRING) ) {
                            int LA1_5 = input.LA(5);

                            if ( (LA1_5==16) ) {
                                int LA1_6 = input.LA(6);

                                if ( (LA1_6==17||LA1_6==20) ) {
                                    alt1=1;
                                }
                                else if ( (LA1_6==22) ) {
                                    alt1=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 6, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA1_5==21) ) {
                                alt1=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalData.g:79:3: this_ContainerResource_0= ruleContainerResource
                    {

                    			newCompositeNode(grammarAccess.getResourceAccess().getContainerResourceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContainerResource_0=ruleContainerResource();

                    state._fsp--;


                    			current = this_ContainerResource_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalData.g:88:3: this_File_1= ruleFile
                    {

                    			newCompositeNode(grammarAccess.getResourceAccess().getFileParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_File_1=ruleFile();

                    state._fsp--;


                    			current = this_File_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleContainerResource"
    // InternalData.g:100:1: entryRuleContainerResource returns [EObject current=null] : iv_ruleContainerResource= ruleContainerResource EOF ;
    public final EObject entryRuleContainerResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerResource = null;


        try {
            // InternalData.g:100:58: (iv_ruleContainerResource= ruleContainerResource EOF )
            // InternalData.g:101:2: iv_ruleContainerResource= ruleContainerResource EOF
            {
             newCompositeNode(grammarAccess.getContainerResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainerResource=ruleContainerResource();

            state._fsp--;

             current =iv_ruleContainerResource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerResource"


    // $ANTLR start "ruleContainerResource"
    // InternalData.g:107:1: ruleContainerResource returns [EObject current=null] : (this_Project_0= ruleProject | this_Folder_1= ruleFolder ) ;
    public final EObject ruleContainerResource() throws RecognitionException {
        EObject current = null;

        EObject this_Project_0 = null;

        EObject this_Folder_1 = null;



        	enterRule();

        try {
            // InternalData.g:113:2: ( (this_Project_0= ruleProject | this_Folder_1= ruleFolder ) )
            // InternalData.g:114:2: (this_Project_0= ruleProject | this_Folder_1= ruleFolder )
            {
            // InternalData.g:114:2: (this_Project_0= ruleProject | this_Folder_1= ruleFolder )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalData.g:115:3: this_Project_0= ruleProject
                    {

                    			newCompositeNode(grammarAccess.getContainerResourceAccess().getProjectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Project_0=ruleProject();

                    state._fsp--;


                    			current = this_Project_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalData.g:124:3: this_Folder_1= ruleFolder
                    {

                    			newCompositeNode(grammarAccess.getContainerResourceAccess().getFolderParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Folder_1=ruleFolder();

                    state._fsp--;


                    			current = this_Folder_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerResource"


    // $ANTLR start "entryRuleProject"
    // InternalData.g:136:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalData.g:136:48: (iv_ruleProject= ruleProject EOF )
            // InternalData.g:137:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalData.g:143:1: ruleProject returns [EObject current=null] : (otherlv_0= 'project' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'files' otherlv_7= ':' otherlv_8= '[' ( (lv_files_9_0= ruleFile ) )* otherlv_10= ']' )? (otherlv_11= ',' otherlv_12= 'folders' otherlv_13= ':' otherlv_14= '[' ( (lv_folders_15_0= ruleFolder ) )* otherlv_16= ']' )? otherlv_17= '}' ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_files_9_0 = null;

        EObject lv_folders_15_0 = null;



        	enterRule();

        try {
            // InternalData.g:149:2: ( (otherlv_0= 'project' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'files' otherlv_7= ':' otherlv_8= '[' ( (lv_files_9_0= ruleFile ) )* otherlv_10= ']' )? (otherlv_11= ',' otherlv_12= 'folders' otherlv_13= ':' otherlv_14= '[' ( (lv_folders_15_0= ruleFolder ) )* otherlv_16= ']' )? otherlv_17= '}' ) )
            // InternalData.g:150:2: (otherlv_0= 'project' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'files' otherlv_7= ':' otherlv_8= '[' ( (lv_files_9_0= ruleFile ) )* otherlv_10= ']' )? (otherlv_11= ',' otherlv_12= 'folders' otherlv_13= ':' otherlv_14= '[' ( (lv_folders_15_0= ruleFolder ) )* otherlv_16= ']' )? otherlv_17= '}' )
            {
            // InternalData.g:150:2: (otherlv_0= 'project' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'files' otherlv_7= ':' otherlv_8= '[' ( (lv_files_9_0= ruleFile ) )* otherlv_10= ']' )? (otherlv_11= ',' otherlv_12= 'folders' otherlv_13= ':' otherlv_14= '[' ( (lv_folders_15_0= ruleFolder ) )* otherlv_16= ']' )? otherlv_17= '}' )
            // InternalData.g:151:3: otherlv_0= 'project' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'files' otherlv_7= ':' otherlv_8= '[' ( (lv_files_9_0= ruleFile ) )* otherlv_10= ']' )? (otherlv_11= ',' otherlv_12= 'folders' otherlv_13= ':' otherlv_14= '[' ( (lv_folders_15_0= ruleFolder ) )* otherlv_16= ']' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getColonKeyword_3());
            		
            // InternalData.g:167:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalData.g:168:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalData.g:168:4: (lv_name_4_0= RULE_STRING )
            // InternalData.g:169:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_4_0, grammarAccess.getProjectAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalData.g:185:3: (otherlv_5= ',' otherlv_6= 'files' otherlv_7= ':' otherlv_8= '[' ( (lv_files_9_0= ruleFile ) )* otherlv_10= ']' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==17) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // InternalData.g:186:4: otherlv_5= ',' otherlv_6= 'files' otherlv_7= ':' otherlv_8= '[' ( (lv_files_9_0= ruleFile ) )* otherlv_10= ']'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getProjectAccess().getCommaKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getProjectAccess().getFilesKeyword_5_1());
                    			
                    otherlv_7=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getProjectAccess().getColonKeyword_5_2());
                    			
                    otherlv_8=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getProjectAccess().getLeftSquareBracketKeyword_5_3());
                    			
                    // InternalData.g:202:4: ( (lv_files_9_0= ruleFile ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalData.g:203:5: (lv_files_9_0= ruleFile )
                    	    {
                    	    // InternalData.g:203:5: (lv_files_9_0= ruleFile )
                    	    // InternalData.g:204:6: lv_files_9_0= ruleFile
                    	    {

                    	    						newCompositeNode(grammarAccess.getProjectAccess().getFilesFileParserRuleCall_5_4_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_files_9_0=ruleFile();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getProjectRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"files",
                    	    							lv_files_9_0,
                    	    							"codeskills.designer.data.Data.File");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getProjectAccess().getRightSquareBracketKeyword_5_5());
                    			

                    }
                    break;

            }

            // InternalData.g:226:3: (otherlv_11= ',' otherlv_12= 'folders' otherlv_13= ':' otherlv_14= '[' ( (lv_folders_15_0= ruleFolder ) )* otherlv_16= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalData.g:227:4: otherlv_11= ',' otherlv_12= 'folders' otherlv_13= ':' otherlv_14= '[' ( (lv_folders_15_0= ruleFolder ) )* otherlv_16= ']'
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getProjectAccess().getCommaKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getProjectAccess().getFoldersKeyword_6_1());
                    			
                    otherlv_13=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getProjectAccess().getColonKeyword_6_2());
                    			
                    otherlv_14=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getProjectAccess().getLeftSquareBracketKeyword_6_3());
                    			
                    // InternalData.g:243:4: ( (lv_folders_15_0= ruleFolder ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalData.g:244:5: (lv_folders_15_0= ruleFolder )
                    	    {
                    	    // InternalData.g:244:5: (lv_folders_15_0= ruleFolder )
                    	    // InternalData.g:245:6: lv_folders_15_0= ruleFolder
                    	    {

                    	    						newCompositeNode(grammarAccess.getProjectAccess().getFoldersFolderParserRuleCall_6_4_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_folders_15_0=ruleFolder();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getProjectRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"folders",
                    	    							lv_folders_15_0,
                    	    							"codeskills.designer.data.Data.Folder");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_16, grammarAccess.getProjectAccess().getRightSquareBracketKeyword_6_5());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleFolder"
    // InternalData.g:275:1: entryRuleFolder returns [EObject current=null] : iv_ruleFolder= ruleFolder EOF ;
    public final EObject entryRuleFolder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFolder = null;


        try {
            // InternalData.g:275:47: (iv_ruleFolder= ruleFolder EOF )
            // InternalData.g:276:2: iv_ruleFolder= ruleFolder EOF
            {
             newCompositeNode(grammarAccess.getFolderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFolder=ruleFolder();

            state._fsp--;

             current =iv_ruleFolder; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFolder"


    // $ANTLR start "ruleFolder"
    // InternalData.g:282:1: ruleFolder returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) (otherlv_4= ',' otherlv_5= 'folders' otherlv_6= ':' otherlv_7= '[' ( (lv_folders_8_0= ruleFolder ) )* otherlv_9= ']' )? (otherlv_10= ',' otherlv_11= 'files' otherlv_12= ':' otherlv_13= '[' ( (lv_files_14_0= ruleFile ) )* otherlv_15= ']' )? otherlv_16= '}' ) ;
    public final EObject ruleFolder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_folders_8_0 = null;

        EObject lv_files_14_0 = null;



        	enterRule();

        try {
            // InternalData.g:288:2: ( (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) (otherlv_4= ',' otherlv_5= 'folders' otherlv_6= ':' otherlv_7= '[' ( (lv_folders_8_0= ruleFolder ) )* otherlv_9= ']' )? (otherlv_10= ',' otherlv_11= 'files' otherlv_12= ':' otherlv_13= '[' ( (lv_files_14_0= ruleFile ) )* otherlv_15= ']' )? otherlv_16= '}' ) )
            // InternalData.g:289:2: (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) (otherlv_4= ',' otherlv_5= 'folders' otherlv_6= ':' otherlv_7= '[' ( (lv_folders_8_0= ruleFolder ) )* otherlv_9= ']' )? (otherlv_10= ',' otherlv_11= 'files' otherlv_12= ':' otherlv_13= '[' ( (lv_files_14_0= ruleFile ) )* otherlv_15= ']' )? otherlv_16= '}' )
            {
            // InternalData.g:289:2: (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) (otherlv_4= ',' otherlv_5= 'folders' otherlv_6= ':' otherlv_7= '[' ( (lv_folders_8_0= ruleFolder ) )* otherlv_9= ']' )? (otherlv_10= ',' otherlv_11= 'files' otherlv_12= ':' otherlv_13= '[' ( (lv_files_14_0= ruleFile ) )* otherlv_15= ']' )? otherlv_16= '}' )
            // InternalData.g:290:3: otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) (otherlv_4= ',' otherlv_5= 'folders' otherlv_6= ':' otherlv_7= '[' ( (lv_folders_8_0= ruleFolder ) )* otherlv_9= ']' )? (otherlv_10= ',' otherlv_11= 'files' otherlv_12= ':' otherlv_13= '[' ( (lv_files_14_0= ruleFile ) )* otherlv_15= ']' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFolderAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFolderAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFolderAccess().getColonKeyword_2());
            		
            // InternalData.g:302:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalData.g:303:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalData.g:303:4: (lv_name_3_0= RULE_STRING )
            // InternalData.g:304:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFolderAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFolderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalData.g:320:3: (otherlv_4= ',' otherlv_5= 'folders' otherlv_6= ':' otherlv_7= '[' ( (lv_folders_8_0= ruleFolder ) )* otherlv_9= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==20) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalData.g:321:4: otherlv_4= ',' otherlv_5= 'folders' otherlv_6= ':' otherlv_7= '[' ( (lv_folders_8_0= ruleFolder ) )* otherlv_9= ']'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getFolderAccess().getCommaKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getFolderAccess().getFoldersKeyword_4_1());
                    			
                    otherlv_6=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getFolderAccess().getColonKeyword_4_2());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getFolderAccess().getLeftSquareBracketKeyword_4_3());
                    			
                    // InternalData.g:337:4: ( (lv_folders_8_0= ruleFolder ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalData.g:338:5: (lv_folders_8_0= ruleFolder )
                    	    {
                    	    // InternalData.g:338:5: (lv_folders_8_0= ruleFolder )
                    	    // InternalData.g:339:6: lv_folders_8_0= ruleFolder
                    	    {

                    	    						newCompositeNode(grammarAccess.getFolderAccess().getFoldersFolderParserRuleCall_4_4_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_folders_8_0=ruleFolder();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFolderRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"folders",
                    	    							lv_folders_8_0,
                    	    							"codeskills.designer.data.Data.Folder");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getFolderAccess().getRightSquareBracketKeyword_4_5());
                    			

                    }
                    break;

            }

            // InternalData.g:361:3: (otherlv_10= ',' otherlv_11= 'files' otherlv_12= ':' otherlv_13= '[' ( (lv_files_14_0= ruleFile ) )* otherlv_15= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalData.g:362:4: otherlv_10= ',' otherlv_11= 'files' otherlv_12= ':' otherlv_13= '[' ( (lv_files_14_0= ruleFile ) )* otherlv_15= ']'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getFolderAccess().getCommaKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getFolderAccess().getFilesKeyword_5_1());
                    			
                    otherlv_12=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getFolderAccess().getColonKeyword_5_2());
                    			
                    otherlv_13=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getFolderAccess().getLeftSquareBracketKeyword_5_3());
                    			
                    // InternalData.g:378:4: ( (lv_files_14_0= ruleFile ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==13) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalData.g:379:5: (lv_files_14_0= ruleFile )
                    	    {
                    	    // InternalData.g:379:5: (lv_files_14_0= ruleFile )
                    	    // InternalData.g:380:6: lv_files_14_0= ruleFile
                    	    {

                    	    						newCompositeNode(grammarAccess.getFolderAccess().getFilesFileParserRuleCall_5_4_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_files_14_0=ruleFile();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFolderRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"files",
                    	    							lv_files_14_0,
                    	    							"codeskills.designer.data.Data.File");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getFolderAccess().getRightSquareBracketKeyword_5_5());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getFolderAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFolder"


    // $ANTLR start "entryRuleFile"
    // InternalData.g:410:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalData.g:410:45: (iv_ruleFile= ruleFile EOF )
            // InternalData.g:411:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalData.g:417:1: ruleFile returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'ext' otherlv_6= ':' ( (lv_ext_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'changed' otherlv_10= ':' ( (lv_changed_11_0= RULE_BOOL ) )? (otherlv_12= ',' ( (otherlv_13= RULE_ID ) )* )? otherlv_14= '}' ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_ext_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_changed_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalData.g:423:2: ( (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'ext' otherlv_6= ':' ( (lv_ext_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'changed' otherlv_10= ':' ( (lv_changed_11_0= RULE_BOOL ) )? (otherlv_12= ',' ( (otherlv_13= RULE_ID ) )* )? otherlv_14= '}' ) )
            // InternalData.g:424:2: (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'ext' otherlv_6= ':' ( (lv_ext_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'changed' otherlv_10= ':' ( (lv_changed_11_0= RULE_BOOL ) )? (otherlv_12= ',' ( (otherlv_13= RULE_ID ) )* )? otherlv_14= '}' )
            {
            // InternalData.g:424:2: (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'ext' otherlv_6= ':' ( (lv_ext_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'changed' otherlv_10= ':' ( (lv_changed_11_0= RULE_BOOL ) )? (otherlv_12= ',' ( (otherlv_13= RULE_ID ) )* )? otherlv_14= '}' )
            // InternalData.g:425:3: otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'ext' otherlv_6= ':' ( (lv_ext_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'changed' otherlv_10= ':' ( (lv_changed_11_0= RULE_BOOL ) )? (otherlv_12= ',' ( (otherlv_13= RULE_ID ) )* )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFileAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFileAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFileAccess().getColonKeyword_2());
            		
            // InternalData.g:437:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalData.g:438:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalData.g:438:4: (lv_name_3_0= RULE_STRING )
            // InternalData.g:439:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFileAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getFileAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getFileAccess().getExtKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getFileAccess().getColonKeyword_6());
            		
            // InternalData.g:467:3: ( (lv_ext_7_0= RULE_STRING ) )
            // InternalData.g:468:4: (lv_ext_7_0= RULE_STRING )
            {
            // InternalData.g:468:4: (lv_ext_7_0= RULE_STRING )
            // InternalData.g:469:5: lv_ext_7_0= RULE_STRING
            {
            lv_ext_7_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_ext_7_0, grammarAccess.getFileAccess().getExtSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ext",
            						lv_ext_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getFileAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getFileAccess().getChangedKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getFileAccess().getColonKeyword_10());
            		
            // InternalData.g:497:3: ( (lv_changed_11_0= RULE_BOOL ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_BOOL) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalData.g:498:4: (lv_changed_11_0= RULE_BOOL )
                    {
                    // InternalData.g:498:4: (lv_changed_11_0= RULE_BOOL )
                    // InternalData.g:499:5: lv_changed_11_0= RULE_BOOL
                    {
                    lv_changed_11_0=(Token)match(input,RULE_BOOL,FOLLOW_7); 

                    					newLeafNode(lv_changed_11_0, grammarAccess.getFileAccess().getChangedBOOLTerminalRuleCall_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFileRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"changed",
                    						true,
                    						"codeskills.designer.data.Data.BOOL");
                    				

                    }


                    }
                    break;

            }

            // InternalData.g:515:3: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalData.g:516:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )*
                    {
                    otherlv_12=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_12, grammarAccess.getFileAccess().getCommaKeyword_12_0());
                    			
                    // InternalData.g:520:4: ( (otherlv_13= RULE_ID ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalData.g:521:5: (otherlv_13= RULE_ID )
                    	    {
                    	    // InternalData.g:521:5: (otherlv_13= RULE_ID )
                    	    // InternalData.g:522:6: otherlv_13= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getFileRule());
                    	    						}
                    	    					
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_17); 

                    	    						newLeafNode(otherlv_13, grammarAccess.getFileAccess().getModelEObjectCrossReference_12_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getFileAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFile"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000210020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200040L});

}