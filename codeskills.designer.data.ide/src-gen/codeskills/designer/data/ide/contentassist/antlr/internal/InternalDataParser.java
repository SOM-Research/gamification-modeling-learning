package codeskills.designer.data.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import codeskills.designer.data.services.DataGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOL", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'{'", "'name'", "':'", "'}'", "','", "'files'", "'['", "']'", "'folders'", "'ext'", "'changed'"
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

    	public void setGrammarAccess(DataGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleResource"
    // InternalData.g:53:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalData.g:54:1: ( ruleResource EOF )
            // InternalData.g:55:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalData.g:62:1: ruleResource : ( ( rule__Resource__Alternatives ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:66:2: ( ( ( rule__Resource__Alternatives ) ) )
            // InternalData.g:67:2: ( ( rule__Resource__Alternatives ) )
            {
            // InternalData.g:67:2: ( ( rule__Resource__Alternatives ) )
            // InternalData.g:68:3: ( rule__Resource__Alternatives )
            {
             before(grammarAccess.getResourceAccess().getAlternatives()); 
            // InternalData.g:69:3: ( rule__Resource__Alternatives )
            // InternalData.g:69:4: rule__Resource__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleContainerResource"
    // InternalData.g:78:1: entryRuleContainerResource : ruleContainerResource EOF ;
    public final void entryRuleContainerResource() throws RecognitionException {
        try {
            // InternalData.g:79:1: ( ruleContainerResource EOF )
            // InternalData.g:80:1: ruleContainerResource EOF
            {
             before(grammarAccess.getContainerResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleContainerResource();

            state._fsp--;

             after(grammarAccess.getContainerResourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContainerResource"


    // $ANTLR start "ruleContainerResource"
    // InternalData.g:87:1: ruleContainerResource : ( ( rule__ContainerResource__Alternatives ) ) ;
    public final void ruleContainerResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:91:2: ( ( ( rule__ContainerResource__Alternatives ) ) )
            // InternalData.g:92:2: ( ( rule__ContainerResource__Alternatives ) )
            {
            // InternalData.g:92:2: ( ( rule__ContainerResource__Alternatives ) )
            // InternalData.g:93:3: ( rule__ContainerResource__Alternatives )
            {
             before(grammarAccess.getContainerResourceAccess().getAlternatives()); 
            // InternalData.g:94:3: ( rule__ContainerResource__Alternatives )
            // InternalData.g:94:4: rule__ContainerResource__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ContainerResource__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContainerResourceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainerResource"


    // $ANTLR start "entryRuleProject"
    // InternalData.g:103:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalData.g:104:1: ( ruleProject EOF )
            // InternalData.g:105:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalData.g:112:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:116:2: ( ( ( rule__Project__Group__0 ) ) )
            // InternalData.g:117:2: ( ( rule__Project__Group__0 ) )
            {
            // InternalData.g:117:2: ( ( rule__Project__Group__0 ) )
            // InternalData.g:118:3: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // InternalData.g:119:3: ( rule__Project__Group__0 )
            // InternalData.g:119:4: rule__Project__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleFolder"
    // InternalData.g:128:1: entryRuleFolder : ruleFolder EOF ;
    public final void entryRuleFolder() throws RecognitionException {
        try {
            // InternalData.g:129:1: ( ruleFolder EOF )
            // InternalData.g:130:1: ruleFolder EOF
            {
             before(grammarAccess.getFolderRule()); 
            pushFollow(FOLLOW_1);
            ruleFolder();

            state._fsp--;

             after(grammarAccess.getFolderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFolder"


    // $ANTLR start "ruleFolder"
    // InternalData.g:137:1: ruleFolder : ( ( rule__Folder__Group__0 ) ) ;
    public final void ruleFolder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:141:2: ( ( ( rule__Folder__Group__0 ) ) )
            // InternalData.g:142:2: ( ( rule__Folder__Group__0 ) )
            {
            // InternalData.g:142:2: ( ( rule__Folder__Group__0 ) )
            // InternalData.g:143:3: ( rule__Folder__Group__0 )
            {
             before(grammarAccess.getFolderAccess().getGroup()); 
            // InternalData.g:144:3: ( rule__Folder__Group__0 )
            // InternalData.g:144:4: rule__Folder__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Folder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFolderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFolder"


    // $ANTLR start "entryRuleFile"
    // InternalData.g:153:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // InternalData.g:154:1: ( ruleFile EOF )
            // InternalData.g:155:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getFileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalData.g:162:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:166:2: ( ( ( rule__File__Group__0 ) ) )
            // InternalData.g:167:2: ( ( rule__File__Group__0 ) )
            {
            // InternalData.g:167:2: ( ( rule__File__Group__0 ) )
            // InternalData.g:168:3: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // InternalData.g:169:3: ( rule__File__Group__0 )
            // InternalData.g:169:4: rule__File__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "rule__Resource__Alternatives"
    // InternalData.g:177:1: rule__Resource__Alternatives : ( ( ruleContainerResource ) | ( ruleFile ) );
    public final void rule__Resource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:181:1: ( ( ruleContainerResource ) | ( ruleFile ) )
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

                            if ( (LA1_5==17) ) {
                                int LA1_6 = input.LA(6);

                                if ( (LA1_6==18||LA1_6==21) ) {
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
                            else if ( (LA1_5==16) ) {
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
                    // InternalData.g:182:2: ( ruleContainerResource )
                    {
                    // InternalData.g:182:2: ( ruleContainerResource )
                    // InternalData.g:183:3: ruleContainerResource
                    {
                     before(grammarAccess.getResourceAccess().getContainerResourceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleContainerResource();

                    state._fsp--;

                     after(grammarAccess.getResourceAccess().getContainerResourceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalData.g:188:2: ( ruleFile )
                    {
                    // InternalData.g:188:2: ( ruleFile )
                    // InternalData.g:189:3: ruleFile
                    {
                     before(grammarAccess.getResourceAccess().getFileParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFile();

                    state._fsp--;

                     after(grammarAccess.getResourceAccess().getFileParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Alternatives"


    // $ANTLR start "rule__ContainerResource__Alternatives"
    // InternalData.g:198:1: rule__ContainerResource__Alternatives : ( ( ruleProject ) | ( ruleFolder ) );
    public final void rule__ContainerResource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:202:1: ( ( ruleProject ) | ( ruleFolder ) )
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
                    // InternalData.g:203:2: ( ruleProject )
                    {
                    // InternalData.g:203:2: ( ruleProject )
                    // InternalData.g:204:3: ruleProject
                    {
                     before(grammarAccess.getContainerResourceAccess().getProjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleProject();

                    state._fsp--;

                     after(grammarAccess.getContainerResourceAccess().getProjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalData.g:209:2: ( ruleFolder )
                    {
                    // InternalData.g:209:2: ( ruleFolder )
                    // InternalData.g:210:3: ruleFolder
                    {
                     before(grammarAccess.getContainerResourceAccess().getFolderParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFolder();

                    state._fsp--;

                     after(grammarAccess.getContainerResourceAccess().getFolderParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerResource__Alternatives"


    // $ANTLR start "rule__Project__Group__0"
    // InternalData.g:219:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:223:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalData.g:224:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // InternalData.g:231:1: rule__Project__Group__0__Impl : ( 'project' ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:235:1: ( ( 'project' ) )
            // InternalData.g:236:1: ( 'project' )
            {
            // InternalData.g:236:1: ( 'project' )
            // InternalData.g:237:2: 'project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // InternalData.g:246:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:250:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // InternalData.g:251:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // InternalData.g:258:1: rule__Project__Group__1__Impl : ( '{' ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:262:1: ( ( '{' ) )
            // InternalData.g:263:1: ( '{' )
            {
            // InternalData.g:263:1: ( '{' )
            // InternalData.g:264:2: '{'
            {
             before(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__2"
    // InternalData.g:273:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:277:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // InternalData.g:278:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Project__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2"


    // $ANTLR start "rule__Project__Group__2__Impl"
    // InternalData.g:285:1: rule__Project__Group__2__Impl : ( 'name' ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:289:1: ( ( 'name' ) )
            // InternalData.g:290:1: ( 'name' )
            {
            // InternalData.g:290:1: ( 'name' )
            // InternalData.g:291:2: 'name'
            {
             before(grammarAccess.getProjectAccess().getNameKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2__Impl"


    // $ANTLR start "rule__Project__Group__3"
    // InternalData.g:300:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:304:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // InternalData.g:305:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Project__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3"


    // $ANTLR start "rule__Project__Group__3__Impl"
    // InternalData.g:312:1: rule__Project__Group__3__Impl : ( ':' ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:316:1: ( ( ':' ) )
            // InternalData.g:317:1: ( ':' )
            {
            // InternalData.g:317:1: ( ':' )
            // InternalData.g:318:2: ':'
            {
             before(grammarAccess.getProjectAccess().getColonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3__Impl"


    // $ANTLR start "rule__Project__Group__4"
    // InternalData.g:327:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:331:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // InternalData.g:332:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Project__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__4"


    // $ANTLR start "rule__Project__Group__4__Impl"
    // InternalData.g:339:1: rule__Project__Group__4__Impl : ( ( rule__Project__NameAssignment_4 ) ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:343:1: ( ( ( rule__Project__NameAssignment_4 ) ) )
            // InternalData.g:344:1: ( ( rule__Project__NameAssignment_4 ) )
            {
            // InternalData.g:344:1: ( ( rule__Project__NameAssignment_4 ) )
            // InternalData.g:345:2: ( rule__Project__NameAssignment_4 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_4()); 
            // InternalData.g:346:2: ( rule__Project__NameAssignment_4 )
            // InternalData.g:346:3: rule__Project__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Project__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__4__Impl"


    // $ANTLR start "rule__Project__Group__5"
    // InternalData.g:354:1: rule__Project__Group__5 : rule__Project__Group__5__Impl rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:358:1: ( rule__Project__Group__5__Impl rule__Project__Group__6 )
            // InternalData.g:359:2: rule__Project__Group__5__Impl rule__Project__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Project__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__5"


    // $ANTLR start "rule__Project__Group__5__Impl"
    // InternalData.g:366:1: rule__Project__Group__5__Impl : ( ( rule__Project__Group_5__0 )? ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:370:1: ( ( ( rule__Project__Group_5__0 )? ) )
            // InternalData.g:371:1: ( ( rule__Project__Group_5__0 )? )
            {
            // InternalData.g:371:1: ( ( rule__Project__Group_5__0 )? )
            // InternalData.g:372:2: ( rule__Project__Group_5__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_5()); 
            // InternalData.g:373:2: ( rule__Project__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==18) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // InternalData.g:373:3: rule__Project__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Project__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__5__Impl"


    // $ANTLR start "rule__Project__Group__6"
    // InternalData.g:381:1: rule__Project__Group__6 : rule__Project__Group__6__Impl rule__Project__Group__7 ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:385:1: ( rule__Project__Group__6__Impl rule__Project__Group__7 )
            // InternalData.g:386:2: rule__Project__Group__6__Impl rule__Project__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Project__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__6"


    // $ANTLR start "rule__Project__Group__6__Impl"
    // InternalData.g:393:1: rule__Project__Group__6__Impl : ( ( rule__Project__Group_6__0 )? ) ;
    public final void rule__Project__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:397:1: ( ( ( rule__Project__Group_6__0 )? ) )
            // InternalData.g:398:1: ( ( rule__Project__Group_6__0 )? )
            {
            // InternalData.g:398:1: ( ( rule__Project__Group_6__0 )? )
            // InternalData.g:399:2: ( rule__Project__Group_6__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_6()); 
            // InternalData.g:400:2: ( rule__Project__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalData.g:400:3: rule__Project__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Project__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__6__Impl"


    // $ANTLR start "rule__Project__Group__7"
    // InternalData.g:408:1: rule__Project__Group__7 : rule__Project__Group__7__Impl ;
    public final void rule__Project__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:412:1: ( rule__Project__Group__7__Impl )
            // InternalData.g:413:2: rule__Project__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__7"


    // $ANTLR start "rule__Project__Group__7__Impl"
    // InternalData.g:419:1: rule__Project__Group__7__Impl : ( '}' ) ;
    public final void rule__Project__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:423:1: ( ( '}' ) )
            // InternalData.g:424:1: ( '}' )
            {
            // InternalData.g:424:1: ( '}' )
            // InternalData.g:425:2: '}'
            {
             before(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__7__Impl"


    // $ANTLR start "rule__Project__Group_5__0"
    // InternalData.g:435:1: rule__Project__Group_5__0 : rule__Project__Group_5__0__Impl rule__Project__Group_5__1 ;
    public final void rule__Project__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:439:1: ( rule__Project__Group_5__0__Impl rule__Project__Group_5__1 )
            // InternalData.g:440:2: rule__Project__Group_5__0__Impl rule__Project__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Project__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_5__0"


    // $ANTLR start "rule__Project__Group_5__0__Impl"
    // InternalData.g:447:1: rule__Project__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Project__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:451:1: ( ( ',' ) )
            // InternalData.g:452:1: ( ',' )
            {
            // InternalData.g:452:1: ( ',' )
            // InternalData.g:453:2: ','
            {
             before(grammarAccess.getProjectAccess().getCommaKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_5__0__Impl"


    // $ANTLR start "rule__Project__Group_5__1"
    // InternalData.g:462:1: rule__Project__Group_5__1 : rule__Project__Group_5__1__Impl rule__Project__Group_5__2 ;
    public final void rule__Project__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:466:1: ( rule__Project__Group_5__1__Impl rule__Project__Group_5__2 )
            // InternalData.g:467:2: rule__Project__Group_5__1__Impl rule__Project__Group_5__2
            {
            pushFollow(FOLLOW_5);
            rule__Project__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_5__1"


    // $ANTLR start "rule__Project__Group_5__1__Impl"
    // InternalData.g:474:1: rule__Project__Group_5__1__Impl : ( 'files' ) ;
    public final void rule__Project__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:478:1: ( ( 'files' ) )
            // InternalData.g:479:1: ( 'files' )
            {
            // InternalData.g:479:1: ( 'files' )
            // InternalData.g:480:2: 'files'
            {
             before(grammarAccess.getProjectAccess().getFilesKeyword_5_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getFilesKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_5__1__Impl"


    // $ANTLR start "rule__Project__Group_5__2"
    // InternalData.g:489:1: rule__Project__Group_5__2 : rule__Project__Group_5__2__Impl rule__Project__Group_5__3 ;
    public final void rule__Project__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:493:1: ( rule__Project__Group_5__2__Impl rule__Project__Group_5__3 )
            // InternalData.g:494:2: rule__Project__Group_5__2__Impl rule__Project__Group_5__3
            {
            pushFollow(FOLLOW_9);
            rule__Project__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_5__2"


    // $ANTLR start "rule__Project__Group_5__2__Impl"
    // InternalData.g:501:1: rule__Project__Group_5__2__Impl : ( ':' ) ;
    public final void rule__Project__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:505:1: ( ( ':' ) )
            // InternalData.g:506:1: ( ':' )
            {
            // InternalData.g:506:1: ( ':' )
            // InternalData.g:507:2: ':'
            {
             before(grammarAccess.getProjectAccess().getColonKeyword_5_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getColonKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_5__2__Impl"


    // $ANTLR start "rule__Project__Group_5__3"
    // InternalData.g:516:1: rule__Project__Group_5__3 : rule__Project__Group_5__3__Impl rule__Project__Group_5__4 ;
    public final void rule__Project__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:520:1: ( rule__Project__Group_5__3__Impl rule__Project__Group_5__4 )
            // InternalData.g:521:2: rule__Project__Group_5__3__Impl rule__Project__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__Project__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_5__3"


    // $ANTLR start "rule__Project__Group_5__3__Impl"
    // InternalData.g:528:1: rule__Project__Group_5__3__Impl : ( '[' ) ;
    public final void rule__Project__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:532:1: ( ( '[' ) )
            // InternalData.g:533:1: ( '[' )
            {
            // InternalData.g:533:1: ( '[' )
            // InternalData.g:534:2: '['
            {
             before(grammarAccess.getProjectAccess().getLeftSquareBracketKeyword_5_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getLeftSquareBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_5__3__Impl"


    // $ANTLR start "rule__Project__Group_5__4"
    // InternalData.g:543:1: rule__Project__Group_5__4 : rule__Project__Group_5__4__Impl rule__Project__Group_5__5 ;
    public final void rule__Project__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:547:1: ( rule__Project__Group_5__4__Impl rule__Project__Group_5__5 )
            // InternalData.g:548:2: rule__Project__Group_5__4__Impl rule__Project__Group_5__5
            {
            pushFollow(FOLLOW_10);
            rule__Project__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_5__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_5__4"


    // $ANTLR start "rule__Project__Group_5__4__Impl"
    // InternalData.g:555:1: rule__Project__Group_5__4__Impl : ( ( rule__Project__FilesAssignment_5_4 )* ) ;
    public final void rule__Project__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:559:1: ( ( ( rule__Project__FilesAssignment_5_4 )* ) )
            // InternalData.g:560:1: ( ( rule__Project__FilesAssignment_5_4 )* )
            {
            // InternalData.g:560:1: ( ( rule__Project__FilesAssignment_5_4 )* )
            // InternalData.g:561:2: ( rule__Project__FilesAssignment_5_4 )*
            {
             before(grammarAccess.getProjectAccess().getFilesAssignment_5_4()); 
            // InternalData.g:562:2: ( rule__Project__FilesAssignment_5_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalData.g:562:3: rule__Project__FilesAssignment_5_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Project__FilesAssignment_5_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getFilesAssignment_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_5__4__Impl"


    // $ANTLR start "rule__Project__Group_5__5"
    // InternalData.g:570:1: rule__Project__Group_5__5 : rule__Project__Group_5__5__Impl ;
    public final void rule__Project__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:574:1: ( rule__Project__Group_5__5__Impl )
            // InternalData.g:575:2: rule__Project__Group_5__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group_5__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_5__5"


    // $ANTLR start "rule__Project__Group_5__5__Impl"
    // InternalData.g:581:1: rule__Project__Group_5__5__Impl : ( ']' ) ;
    public final void rule__Project__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:585:1: ( ( ']' ) )
            // InternalData.g:586:1: ( ']' )
            {
            // InternalData.g:586:1: ( ']' )
            // InternalData.g:587:2: ']'
            {
             before(grammarAccess.getProjectAccess().getRightSquareBracketKeyword_5_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getRightSquareBracketKeyword_5_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_5__5__Impl"


    // $ANTLR start "rule__Project__Group_6__0"
    // InternalData.g:597:1: rule__Project__Group_6__0 : rule__Project__Group_6__0__Impl rule__Project__Group_6__1 ;
    public final void rule__Project__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:601:1: ( rule__Project__Group_6__0__Impl rule__Project__Group_6__1 )
            // InternalData.g:602:2: rule__Project__Group_6__0__Impl rule__Project__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__Project__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_6__0"


    // $ANTLR start "rule__Project__Group_6__0__Impl"
    // InternalData.g:609:1: rule__Project__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Project__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:613:1: ( ( ',' ) )
            // InternalData.g:614:1: ( ',' )
            {
            // InternalData.g:614:1: ( ',' )
            // InternalData.g:615:2: ','
            {
             before(grammarAccess.getProjectAccess().getCommaKeyword_6_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_6__0__Impl"


    // $ANTLR start "rule__Project__Group_6__1"
    // InternalData.g:624:1: rule__Project__Group_6__1 : rule__Project__Group_6__1__Impl rule__Project__Group_6__2 ;
    public final void rule__Project__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:628:1: ( rule__Project__Group_6__1__Impl rule__Project__Group_6__2 )
            // InternalData.g:629:2: rule__Project__Group_6__1__Impl rule__Project__Group_6__2
            {
            pushFollow(FOLLOW_5);
            rule__Project__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_6__1"


    // $ANTLR start "rule__Project__Group_6__1__Impl"
    // InternalData.g:636:1: rule__Project__Group_6__1__Impl : ( 'folders' ) ;
    public final void rule__Project__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:640:1: ( ( 'folders' ) )
            // InternalData.g:641:1: ( 'folders' )
            {
            // InternalData.g:641:1: ( 'folders' )
            // InternalData.g:642:2: 'folders'
            {
             before(grammarAccess.getProjectAccess().getFoldersKeyword_6_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getFoldersKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_6__1__Impl"


    // $ANTLR start "rule__Project__Group_6__2"
    // InternalData.g:651:1: rule__Project__Group_6__2 : rule__Project__Group_6__2__Impl rule__Project__Group_6__3 ;
    public final void rule__Project__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:655:1: ( rule__Project__Group_6__2__Impl rule__Project__Group_6__3 )
            // InternalData.g:656:2: rule__Project__Group_6__2__Impl rule__Project__Group_6__3
            {
            pushFollow(FOLLOW_9);
            rule__Project__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_6__2"


    // $ANTLR start "rule__Project__Group_6__2__Impl"
    // InternalData.g:663:1: rule__Project__Group_6__2__Impl : ( ':' ) ;
    public final void rule__Project__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:667:1: ( ( ':' ) )
            // InternalData.g:668:1: ( ':' )
            {
            // InternalData.g:668:1: ( ':' )
            // InternalData.g:669:2: ':'
            {
             before(grammarAccess.getProjectAccess().getColonKeyword_6_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getColonKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_6__2__Impl"


    // $ANTLR start "rule__Project__Group_6__3"
    // InternalData.g:678:1: rule__Project__Group_6__3 : rule__Project__Group_6__3__Impl rule__Project__Group_6__4 ;
    public final void rule__Project__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:682:1: ( rule__Project__Group_6__3__Impl rule__Project__Group_6__4 )
            // InternalData.g:683:2: rule__Project__Group_6__3__Impl rule__Project__Group_6__4
            {
            pushFollow(FOLLOW_10);
            rule__Project__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_6__3"


    // $ANTLR start "rule__Project__Group_6__3__Impl"
    // InternalData.g:690:1: rule__Project__Group_6__3__Impl : ( '[' ) ;
    public final void rule__Project__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:694:1: ( ( '[' ) )
            // InternalData.g:695:1: ( '[' )
            {
            // InternalData.g:695:1: ( '[' )
            // InternalData.g:696:2: '['
            {
             before(grammarAccess.getProjectAccess().getLeftSquareBracketKeyword_6_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getLeftSquareBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_6__3__Impl"


    // $ANTLR start "rule__Project__Group_6__4"
    // InternalData.g:705:1: rule__Project__Group_6__4 : rule__Project__Group_6__4__Impl rule__Project__Group_6__5 ;
    public final void rule__Project__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:709:1: ( rule__Project__Group_6__4__Impl rule__Project__Group_6__5 )
            // InternalData.g:710:2: rule__Project__Group_6__4__Impl rule__Project__Group_6__5
            {
            pushFollow(FOLLOW_10);
            rule__Project__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_6__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_6__4"


    // $ANTLR start "rule__Project__Group_6__4__Impl"
    // InternalData.g:717:1: rule__Project__Group_6__4__Impl : ( ( rule__Project__FoldersAssignment_6_4 )* ) ;
    public final void rule__Project__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:721:1: ( ( ( rule__Project__FoldersAssignment_6_4 )* ) )
            // InternalData.g:722:1: ( ( rule__Project__FoldersAssignment_6_4 )* )
            {
            // InternalData.g:722:1: ( ( rule__Project__FoldersAssignment_6_4 )* )
            // InternalData.g:723:2: ( rule__Project__FoldersAssignment_6_4 )*
            {
             before(grammarAccess.getProjectAccess().getFoldersAssignment_6_4()); 
            // InternalData.g:724:2: ( rule__Project__FoldersAssignment_6_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalData.g:724:3: rule__Project__FoldersAssignment_6_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Project__FoldersAssignment_6_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getFoldersAssignment_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_6__4__Impl"


    // $ANTLR start "rule__Project__Group_6__5"
    // InternalData.g:732:1: rule__Project__Group_6__5 : rule__Project__Group_6__5__Impl ;
    public final void rule__Project__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:736:1: ( rule__Project__Group_6__5__Impl )
            // InternalData.g:737:2: rule__Project__Group_6__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group_6__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_6__5"


    // $ANTLR start "rule__Project__Group_6__5__Impl"
    // InternalData.g:743:1: rule__Project__Group_6__5__Impl : ( ']' ) ;
    public final void rule__Project__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:747:1: ( ( ']' ) )
            // InternalData.g:748:1: ( ']' )
            {
            // InternalData.g:748:1: ( ']' )
            // InternalData.g:749:2: ']'
            {
             before(grammarAccess.getProjectAccess().getRightSquareBracketKeyword_6_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getRightSquareBracketKeyword_6_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_6__5__Impl"


    // $ANTLR start "rule__Folder__Group__0"
    // InternalData.g:759:1: rule__Folder__Group__0 : rule__Folder__Group__0__Impl rule__Folder__Group__1 ;
    public final void rule__Folder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:763:1: ( rule__Folder__Group__0__Impl rule__Folder__Group__1 )
            // InternalData.g:764:2: rule__Folder__Group__0__Impl rule__Folder__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Folder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Folder__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__0"


    // $ANTLR start "rule__Folder__Group__0__Impl"
    // InternalData.g:771:1: rule__Folder__Group__0__Impl : ( '{' ) ;
    public final void rule__Folder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:775:1: ( ( '{' ) )
            // InternalData.g:776:1: ( '{' )
            {
            // InternalData.g:776:1: ( '{' )
            // InternalData.g:777:2: '{'
            {
             before(grammarAccess.getFolderAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFolderAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__0__Impl"


    // $ANTLR start "rule__Folder__Group__1"
    // InternalData.g:786:1: rule__Folder__Group__1 : rule__Folder__Group__1__Impl rule__Folder__Group__2 ;
    public final void rule__Folder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:790:1: ( rule__Folder__Group__1__Impl rule__Folder__Group__2 )
            // InternalData.g:791:2: rule__Folder__Group__1__Impl rule__Folder__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Folder__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Folder__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__1"


    // $ANTLR start "rule__Folder__Group__1__Impl"
    // InternalData.g:798:1: rule__Folder__Group__1__Impl : ( 'name' ) ;
    public final void rule__Folder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:802:1: ( ( 'name' ) )
            // InternalData.g:803:1: ( 'name' )
            {
            // InternalData.g:803:1: ( 'name' )
            // InternalData.g:804:2: 'name'
            {
             before(grammarAccess.getFolderAccess().getNameKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFolderAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__1__Impl"


    // $ANTLR start "rule__Folder__Group__2"
    // InternalData.g:813:1: rule__Folder__Group__2 : rule__Folder__Group__2__Impl rule__Folder__Group__3 ;
    public final void rule__Folder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:817:1: ( rule__Folder__Group__2__Impl rule__Folder__Group__3 )
            // InternalData.g:818:2: rule__Folder__Group__2__Impl rule__Folder__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Folder__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Folder__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__2"


    // $ANTLR start "rule__Folder__Group__2__Impl"
    // InternalData.g:825:1: rule__Folder__Group__2__Impl : ( ':' ) ;
    public final void rule__Folder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:829:1: ( ( ':' ) )
            // InternalData.g:830:1: ( ':' )
            {
            // InternalData.g:830:1: ( ':' )
            // InternalData.g:831:2: ':'
            {
             before(grammarAccess.getFolderAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFolderAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__2__Impl"


    // $ANTLR start "rule__Folder__Group__3"
    // InternalData.g:840:1: rule__Folder__Group__3 : rule__Folder__Group__3__Impl rule__Folder__Group__4 ;
    public final void rule__Folder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:844:1: ( rule__Folder__Group__3__Impl rule__Folder__Group__4 )
            // InternalData.g:845:2: rule__Folder__Group__3__Impl rule__Folder__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Folder__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Folder__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__3"


    // $ANTLR start "rule__Folder__Group__3__Impl"
    // InternalData.g:852:1: rule__Folder__Group__3__Impl : ( ( rule__Folder__NameAssignment_3 ) ) ;
    public final void rule__Folder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:856:1: ( ( ( rule__Folder__NameAssignment_3 ) ) )
            // InternalData.g:857:1: ( ( rule__Folder__NameAssignment_3 ) )
            {
            // InternalData.g:857:1: ( ( rule__Folder__NameAssignment_3 ) )
            // InternalData.g:858:2: ( rule__Folder__NameAssignment_3 )
            {
             before(grammarAccess.getFolderAccess().getNameAssignment_3()); 
            // InternalData.g:859:2: ( rule__Folder__NameAssignment_3 )
            // InternalData.g:859:3: rule__Folder__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Folder__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFolderAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__3__Impl"


    // $ANTLR start "rule__Folder__Group__4"
    // InternalData.g:867:1: rule__Folder__Group__4 : rule__Folder__Group__4__Impl rule__Folder__Group__5 ;
    public final void rule__Folder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:871:1: ( rule__Folder__Group__4__Impl rule__Folder__Group__5 )
            // InternalData.g:872:2: rule__Folder__Group__4__Impl rule__Folder__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Folder__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Folder__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__4"


    // $ANTLR start "rule__Folder__Group__4__Impl"
    // InternalData.g:879:1: rule__Folder__Group__4__Impl : ( ( rule__Folder__Group_4__0 )? ) ;
    public final void rule__Folder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:883:1: ( ( ( rule__Folder__Group_4__0 )? ) )
            // InternalData.g:884:1: ( ( rule__Folder__Group_4__0 )? )
            {
            // InternalData.g:884:1: ( ( rule__Folder__Group_4__0 )? )
            // InternalData.g:885:2: ( rule__Folder__Group_4__0 )?
            {
             before(grammarAccess.getFolderAccess().getGroup_4()); 
            // InternalData.g:886:2: ( rule__Folder__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==21) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalData.g:886:3: rule__Folder__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Folder__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFolderAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__4__Impl"


    // $ANTLR start "rule__Folder__Group__5"
    // InternalData.g:894:1: rule__Folder__Group__5 : rule__Folder__Group__5__Impl rule__Folder__Group__6 ;
    public final void rule__Folder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:898:1: ( rule__Folder__Group__5__Impl rule__Folder__Group__6 )
            // InternalData.g:899:2: rule__Folder__Group__5__Impl rule__Folder__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Folder__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Folder__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__5"


    // $ANTLR start "rule__Folder__Group__5__Impl"
    // InternalData.g:906:1: rule__Folder__Group__5__Impl : ( ( rule__Folder__Group_5__0 )? ) ;
    public final void rule__Folder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:910:1: ( ( ( rule__Folder__Group_5__0 )? ) )
            // InternalData.g:911:1: ( ( rule__Folder__Group_5__0 )? )
            {
            // InternalData.g:911:1: ( ( rule__Folder__Group_5__0 )? )
            // InternalData.g:912:2: ( rule__Folder__Group_5__0 )?
            {
             before(grammarAccess.getFolderAccess().getGroup_5()); 
            // InternalData.g:913:2: ( rule__Folder__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalData.g:913:3: rule__Folder__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Folder__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFolderAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__5__Impl"


    // $ANTLR start "rule__Folder__Group__6"
    // InternalData.g:921:1: rule__Folder__Group__6 : rule__Folder__Group__6__Impl ;
    public final void rule__Folder__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:925:1: ( rule__Folder__Group__6__Impl )
            // InternalData.g:926:2: rule__Folder__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Folder__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__6"


    // $ANTLR start "rule__Folder__Group__6__Impl"
    // InternalData.g:932:1: rule__Folder__Group__6__Impl : ( '}' ) ;
    public final void rule__Folder__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:936:1: ( ( '}' ) )
            // InternalData.g:937:1: ( '}' )
            {
            // InternalData.g:937:1: ( '}' )
            // InternalData.g:938:2: '}'
            {
             before(grammarAccess.getFolderAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFolderAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__6__Impl"


    // $ANTLR start "rule__Folder__Group_4__0"
    // InternalData.g:948:1: rule__Folder__Group_4__0 : rule__Folder__Group_4__0__Impl rule__Folder__Group_4__1 ;
    public final void rule__Folder__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:952:1: ( rule__Folder__Group_4__0__Impl rule__Folder__Group_4__1 )
            // InternalData.g:953:2: rule__Folder__Group_4__0__Impl rule__Folder__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Folder__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Folder__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_4__0"


    // $ANTLR start "rule__Folder__Group_4__0__Impl"
    // InternalData.g:960:1: rule__Folder__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Folder__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:964:1: ( ( ',' ) )
            // InternalData.g:965:1: ( ',' )
            {
            // InternalData.g:965:1: ( ',' )
            // InternalData.g:966:2: ','
            {
             before(grammarAccess.getFolderAccess().getCommaKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFolderAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_4__0__Impl"


    // $ANTLR start "rule__Folder__Group_4__1"
    // InternalData.g:975:1: rule__Folder__Group_4__1 : rule__Folder__Group_4__1__Impl rule__Folder__Group_4__2 ;
    public final void rule__Folder__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:979:1: ( rule__Folder__Group_4__1__Impl rule__Folder__Group_4__2 )
            // InternalData.g:980:2: rule__Folder__Group_4__1__Impl rule__Folder__Group_4__2
            {
            pushFollow(FOLLOW_5);
            rule__Folder__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Folder__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_4__1"


    // $ANTLR start "rule__Folder__Group_4__1__Impl"
    // InternalData.g:987:1: rule__Folder__Group_4__1__Impl : ( 'folders' ) ;
    public final void rule__Folder__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:991:1: ( ( 'folders' ) )
            // InternalData.g:992:1: ( 'folders' )
            {
            // InternalData.g:992:1: ( 'folders' )
            // InternalData.g:993:2: 'folders'
            {
             before(grammarAccess.getFolderAccess().getFoldersKeyword_4_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFolderAccess().getFoldersKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_4__1__Impl"


    // $ANTLR start "rule__Folder__Group_4__2"
    // InternalData.g:1002:1: rule__Folder__Group_4__2 : rule__Folder__Group_4__2__Impl rule__Folder__Group_4__3 ;
    public final void rule__Folder__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1006:1: ( rule__Folder__Group_4__2__Impl rule__Folder__Group_4__3 )
            // InternalData.g:1007:2: rule__Folder__Group_4__2__Impl rule__Folder__Group_4__3
            {
            pushFollow(FOLLOW_9);
            rule__Folder__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Folder__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_4__2"


    // $ANTLR start "rule__Folder__Group_4__2__Impl"
    // InternalData.g:1014:1: rule__Folder__Group_4__2__Impl : ( ':' ) ;
    public final void rule__Folder__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1018:1: ( ( ':' ) )
            // InternalData.g:1019:1: ( ':' )
            {
            // InternalData.g:1019:1: ( ':' )
            // InternalData.g:1020:2: ':'
            {
             before(grammarAccess.getFolderAccess().getColonKeyword_4_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFolderAccess().getColonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_4__2__Impl"


    // $ANTLR start "rule__Folder__Group_4__3"
    // InternalData.g:1029:1: rule__Folder__Group_4__3 : rule__Folder__Group_4__3__Impl rule__Folder__Group_4__4 ;
    public final void rule__Folder__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1033:1: ( rule__Folder__Group_4__3__Impl rule__Folder__Group_4__4 )
            // InternalData.g:1034:2: rule__Folder__Group_4__3__Impl rule__Folder__Group_4__4
            {
            pushFollow(FOLLOW_10);
            rule__Folder__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Folder__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_4__3"


    // $ANTLR start "rule__Folder__Group_4__3__Impl"
    // InternalData.g:1041:1: rule__Folder__Group_4__3__Impl : ( '[' ) ;
    public final void rule__Folder__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1045:1: ( ( '[' ) )
            // InternalData.g:1046:1: ( '[' )
            {
            // InternalData.g:1046:1: ( '[' )
            // InternalData.g:1047:2: '['
            {
             before(grammarAccess.getFolderAccess().getLeftSquareBracketKeyword_4_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFolderAccess().getLeftSquareBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_4__3__Impl"


    // $ANTLR start "rule__Folder__Group_4__4"
    // InternalData.g:1056:1: rule__Folder__Group_4__4 : rule__Folder__Group_4__4__Impl rule__Folder__Group_4__5 ;
    public final void rule__Folder__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1060:1: ( rule__Folder__Group_4__4__Impl rule__Folder__Group_4__5 )
            // InternalData.g:1061:2: rule__Folder__Group_4__4__Impl rule__Folder__Group_4__5
            {
            pushFollow(FOLLOW_10);
            rule__Folder__Group_4__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Folder__Group_4__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_4__4"


    // $ANTLR start "rule__Folder__Group_4__4__Impl"
    // InternalData.g:1068:1: rule__Folder__Group_4__4__Impl : ( ( rule__Folder__FoldersAssignment_4_4 )* ) ;
    public final void rule__Folder__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1072:1: ( ( ( rule__Folder__FoldersAssignment_4_4 )* ) )
            // InternalData.g:1073:1: ( ( rule__Folder__FoldersAssignment_4_4 )* )
            {
            // InternalData.g:1073:1: ( ( rule__Folder__FoldersAssignment_4_4 )* )
            // InternalData.g:1074:2: ( rule__Folder__FoldersAssignment_4_4 )*
            {
             before(grammarAccess.getFolderAccess().getFoldersAssignment_4_4()); 
            // InternalData.g:1075:2: ( rule__Folder__FoldersAssignment_4_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalData.g:1075:3: rule__Folder__FoldersAssignment_4_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Folder__FoldersAssignment_4_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getFolderAccess().getFoldersAssignment_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_4__4__Impl"


    // $ANTLR start "rule__Folder__Group_4__5"
    // InternalData.g:1083:1: rule__Folder__Group_4__5 : rule__Folder__Group_4__5__Impl ;
    public final void rule__Folder__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1087:1: ( rule__Folder__Group_4__5__Impl )
            // InternalData.g:1088:2: rule__Folder__Group_4__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Folder__Group_4__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_4__5"


    // $ANTLR start "rule__Folder__Group_4__5__Impl"
    // InternalData.g:1094:1: rule__Folder__Group_4__5__Impl : ( ']' ) ;
    public final void rule__Folder__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1098:1: ( ( ']' ) )
            // InternalData.g:1099:1: ( ']' )
            {
            // InternalData.g:1099:1: ( ']' )
            // InternalData.g:1100:2: ']'
            {
             before(grammarAccess.getFolderAccess().getRightSquareBracketKeyword_4_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFolderAccess().getRightSquareBracketKeyword_4_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_4__5__Impl"


    // $ANTLR start "rule__Folder__Group_5__0"
    // InternalData.g:1110:1: rule__Folder__Group_5__0 : rule__Folder__Group_5__0__Impl rule__Folder__Group_5__1 ;
    public final void rule__Folder__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1114:1: ( rule__Folder__Group_5__0__Impl rule__Folder__Group_5__1 )
            // InternalData.g:1115:2: rule__Folder__Group_5__0__Impl rule__Folder__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Folder__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Folder__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_5__0"


    // $ANTLR start "rule__Folder__Group_5__0__Impl"
    // InternalData.g:1122:1: rule__Folder__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Folder__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1126:1: ( ( ',' ) )
            // InternalData.g:1127:1: ( ',' )
            {
            // InternalData.g:1127:1: ( ',' )
            // InternalData.g:1128:2: ','
            {
             before(grammarAccess.getFolderAccess().getCommaKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFolderAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_5__0__Impl"


    // $ANTLR start "rule__Folder__Group_5__1"
    // InternalData.g:1137:1: rule__Folder__Group_5__1 : rule__Folder__Group_5__1__Impl rule__Folder__Group_5__2 ;
    public final void rule__Folder__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1141:1: ( rule__Folder__Group_5__1__Impl rule__Folder__Group_5__2 )
            // InternalData.g:1142:2: rule__Folder__Group_5__1__Impl rule__Folder__Group_5__2
            {
            pushFollow(FOLLOW_5);
            rule__Folder__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Folder__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_5__1"


    // $ANTLR start "rule__Folder__Group_5__1__Impl"
    // InternalData.g:1149:1: rule__Folder__Group_5__1__Impl : ( 'files' ) ;
    public final void rule__Folder__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1153:1: ( ( 'files' ) )
            // InternalData.g:1154:1: ( 'files' )
            {
            // InternalData.g:1154:1: ( 'files' )
            // InternalData.g:1155:2: 'files'
            {
             before(grammarAccess.getFolderAccess().getFilesKeyword_5_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFolderAccess().getFilesKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_5__1__Impl"


    // $ANTLR start "rule__Folder__Group_5__2"
    // InternalData.g:1164:1: rule__Folder__Group_5__2 : rule__Folder__Group_5__2__Impl rule__Folder__Group_5__3 ;
    public final void rule__Folder__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1168:1: ( rule__Folder__Group_5__2__Impl rule__Folder__Group_5__3 )
            // InternalData.g:1169:2: rule__Folder__Group_5__2__Impl rule__Folder__Group_5__3
            {
            pushFollow(FOLLOW_9);
            rule__Folder__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Folder__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_5__2"


    // $ANTLR start "rule__Folder__Group_5__2__Impl"
    // InternalData.g:1176:1: rule__Folder__Group_5__2__Impl : ( ':' ) ;
    public final void rule__Folder__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1180:1: ( ( ':' ) )
            // InternalData.g:1181:1: ( ':' )
            {
            // InternalData.g:1181:1: ( ':' )
            // InternalData.g:1182:2: ':'
            {
             before(grammarAccess.getFolderAccess().getColonKeyword_5_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFolderAccess().getColonKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_5__2__Impl"


    // $ANTLR start "rule__Folder__Group_5__3"
    // InternalData.g:1191:1: rule__Folder__Group_5__3 : rule__Folder__Group_5__3__Impl rule__Folder__Group_5__4 ;
    public final void rule__Folder__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1195:1: ( rule__Folder__Group_5__3__Impl rule__Folder__Group_5__4 )
            // InternalData.g:1196:2: rule__Folder__Group_5__3__Impl rule__Folder__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__Folder__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Folder__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_5__3"


    // $ANTLR start "rule__Folder__Group_5__3__Impl"
    // InternalData.g:1203:1: rule__Folder__Group_5__3__Impl : ( '[' ) ;
    public final void rule__Folder__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1207:1: ( ( '[' ) )
            // InternalData.g:1208:1: ( '[' )
            {
            // InternalData.g:1208:1: ( '[' )
            // InternalData.g:1209:2: '['
            {
             before(grammarAccess.getFolderAccess().getLeftSquareBracketKeyword_5_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFolderAccess().getLeftSquareBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_5__3__Impl"


    // $ANTLR start "rule__Folder__Group_5__4"
    // InternalData.g:1218:1: rule__Folder__Group_5__4 : rule__Folder__Group_5__4__Impl rule__Folder__Group_5__5 ;
    public final void rule__Folder__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1222:1: ( rule__Folder__Group_5__4__Impl rule__Folder__Group_5__5 )
            // InternalData.g:1223:2: rule__Folder__Group_5__4__Impl rule__Folder__Group_5__5
            {
            pushFollow(FOLLOW_10);
            rule__Folder__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Folder__Group_5__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_5__4"


    // $ANTLR start "rule__Folder__Group_5__4__Impl"
    // InternalData.g:1230:1: rule__Folder__Group_5__4__Impl : ( ( rule__Folder__FilesAssignment_5_4 )* ) ;
    public final void rule__Folder__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1234:1: ( ( ( rule__Folder__FilesAssignment_5_4 )* ) )
            // InternalData.g:1235:1: ( ( rule__Folder__FilesAssignment_5_4 )* )
            {
            // InternalData.g:1235:1: ( ( rule__Folder__FilesAssignment_5_4 )* )
            // InternalData.g:1236:2: ( rule__Folder__FilesAssignment_5_4 )*
            {
             before(grammarAccess.getFolderAccess().getFilesAssignment_5_4()); 
            // InternalData.g:1237:2: ( rule__Folder__FilesAssignment_5_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalData.g:1237:3: rule__Folder__FilesAssignment_5_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Folder__FilesAssignment_5_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFolderAccess().getFilesAssignment_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_5__4__Impl"


    // $ANTLR start "rule__Folder__Group_5__5"
    // InternalData.g:1245:1: rule__Folder__Group_5__5 : rule__Folder__Group_5__5__Impl ;
    public final void rule__Folder__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1249:1: ( rule__Folder__Group_5__5__Impl )
            // InternalData.g:1250:2: rule__Folder__Group_5__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Folder__Group_5__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_5__5"


    // $ANTLR start "rule__Folder__Group_5__5__Impl"
    // InternalData.g:1256:1: rule__Folder__Group_5__5__Impl : ( ']' ) ;
    public final void rule__Folder__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1260:1: ( ( ']' ) )
            // InternalData.g:1261:1: ( ']' )
            {
            // InternalData.g:1261:1: ( ']' )
            // InternalData.g:1262:2: ']'
            {
             before(grammarAccess.getFolderAccess().getRightSquareBracketKeyword_5_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFolderAccess().getRightSquareBracketKeyword_5_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group_5__5__Impl"


    // $ANTLR start "rule__File__Group__0"
    // InternalData.g:1272:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1276:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalData.g:1277:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__File__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0"


    // $ANTLR start "rule__File__Group__0__Impl"
    // InternalData.g:1284:1: rule__File__Group__0__Impl : ( '{' ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1288:1: ( ( '{' ) )
            // InternalData.g:1289:1: ( '{' )
            {
            // InternalData.g:1289:1: ( '{' )
            // InternalData.g:1290:2: '{'
            {
             before(grammarAccess.getFileAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0__Impl"


    // $ANTLR start "rule__File__Group__1"
    // InternalData.g:1299:1: rule__File__Group__1 : rule__File__Group__1__Impl rule__File__Group__2 ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1303:1: ( rule__File__Group__1__Impl rule__File__Group__2 )
            // InternalData.g:1304:2: rule__File__Group__1__Impl rule__File__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__File__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1"


    // $ANTLR start "rule__File__Group__1__Impl"
    // InternalData.g:1311:1: rule__File__Group__1__Impl : ( 'name' ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1315:1: ( ( 'name' ) )
            // InternalData.g:1316:1: ( 'name' )
            {
            // InternalData.g:1316:1: ( 'name' )
            // InternalData.g:1317:2: 'name'
            {
             before(grammarAccess.getFileAccess().getNameKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1__Impl"


    // $ANTLR start "rule__File__Group__2"
    // InternalData.g:1326:1: rule__File__Group__2 : rule__File__Group__2__Impl rule__File__Group__3 ;
    public final void rule__File__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1330:1: ( rule__File__Group__2__Impl rule__File__Group__3 )
            // InternalData.g:1331:2: rule__File__Group__2__Impl rule__File__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__File__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__2"


    // $ANTLR start "rule__File__Group__2__Impl"
    // InternalData.g:1338:1: rule__File__Group__2__Impl : ( ':' ) ;
    public final void rule__File__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1342:1: ( ( ':' ) )
            // InternalData.g:1343:1: ( ':' )
            {
            // InternalData.g:1343:1: ( ':' )
            // InternalData.g:1344:2: ':'
            {
             before(grammarAccess.getFileAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__2__Impl"


    // $ANTLR start "rule__File__Group__3"
    // InternalData.g:1353:1: rule__File__Group__3 : rule__File__Group__3__Impl rule__File__Group__4 ;
    public final void rule__File__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1357:1: ( rule__File__Group__3__Impl rule__File__Group__4 )
            // InternalData.g:1358:2: rule__File__Group__3__Impl rule__File__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__File__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__3"


    // $ANTLR start "rule__File__Group__3__Impl"
    // InternalData.g:1365:1: rule__File__Group__3__Impl : ( ( rule__File__NameAssignment_3 ) ) ;
    public final void rule__File__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1369:1: ( ( ( rule__File__NameAssignment_3 ) ) )
            // InternalData.g:1370:1: ( ( rule__File__NameAssignment_3 ) )
            {
            // InternalData.g:1370:1: ( ( rule__File__NameAssignment_3 ) )
            // InternalData.g:1371:2: ( rule__File__NameAssignment_3 )
            {
             before(grammarAccess.getFileAccess().getNameAssignment_3()); 
            // InternalData.g:1372:2: ( rule__File__NameAssignment_3 )
            // InternalData.g:1372:3: rule__File__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__File__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__3__Impl"


    // $ANTLR start "rule__File__Group__4"
    // InternalData.g:1380:1: rule__File__Group__4 : rule__File__Group__4__Impl rule__File__Group__5 ;
    public final void rule__File__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1384:1: ( rule__File__Group__4__Impl rule__File__Group__5 )
            // InternalData.g:1385:2: rule__File__Group__4__Impl rule__File__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__File__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__4"


    // $ANTLR start "rule__File__Group__4__Impl"
    // InternalData.g:1392:1: rule__File__Group__4__Impl : ( ',' ) ;
    public final void rule__File__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1396:1: ( ( ',' ) )
            // InternalData.g:1397:1: ( ',' )
            {
            // InternalData.g:1397:1: ( ',' )
            // InternalData.g:1398:2: ','
            {
             before(grammarAccess.getFileAccess().getCommaKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__4__Impl"


    // $ANTLR start "rule__File__Group__5"
    // InternalData.g:1407:1: rule__File__Group__5 : rule__File__Group__5__Impl rule__File__Group__6 ;
    public final void rule__File__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1411:1: ( rule__File__Group__5__Impl rule__File__Group__6 )
            // InternalData.g:1412:2: rule__File__Group__5__Impl rule__File__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__File__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__5"


    // $ANTLR start "rule__File__Group__5__Impl"
    // InternalData.g:1419:1: rule__File__Group__5__Impl : ( 'ext' ) ;
    public final void rule__File__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1423:1: ( ( 'ext' ) )
            // InternalData.g:1424:1: ( 'ext' )
            {
            // InternalData.g:1424:1: ( 'ext' )
            // InternalData.g:1425:2: 'ext'
            {
             before(grammarAccess.getFileAccess().getExtKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getExtKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__5__Impl"


    // $ANTLR start "rule__File__Group__6"
    // InternalData.g:1434:1: rule__File__Group__6 : rule__File__Group__6__Impl rule__File__Group__7 ;
    public final void rule__File__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1438:1: ( rule__File__Group__6__Impl rule__File__Group__7 )
            // InternalData.g:1439:2: rule__File__Group__6__Impl rule__File__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__File__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__6"


    // $ANTLR start "rule__File__Group__6__Impl"
    // InternalData.g:1446:1: rule__File__Group__6__Impl : ( ':' ) ;
    public final void rule__File__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1450:1: ( ( ':' ) )
            // InternalData.g:1451:1: ( ':' )
            {
            // InternalData.g:1451:1: ( ':' )
            // InternalData.g:1452:2: ':'
            {
             before(grammarAccess.getFileAccess().getColonKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__6__Impl"


    // $ANTLR start "rule__File__Group__7"
    // InternalData.g:1461:1: rule__File__Group__7 : rule__File__Group__7__Impl rule__File__Group__8 ;
    public final void rule__File__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1465:1: ( rule__File__Group__7__Impl rule__File__Group__8 )
            // InternalData.g:1466:2: rule__File__Group__7__Impl rule__File__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__File__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__7"


    // $ANTLR start "rule__File__Group__7__Impl"
    // InternalData.g:1473:1: rule__File__Group__7__Impl : ( ( rule__File__ExtAssignment_7 ) ) ;
    public final void rule__File__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1477:1: ( ( ( rule__File__ExtAssignment_7 ) ) )
            // InternalData.g:1478:1: ( ( rule__File__ExtAssignment_7 ) )
            {
            // InternalData.g:1478:1: ( ( rule__File__ExtAssignment_7 ) )
            // InternalData.g:1479:2: ( rule__File__ExtAssignment_7 )
            {
             before(grammarAccess.getFileAccess().getExtAssignment_7()); 
            // InternalData.g:1480:2: ( rule__File__ExtAssignment_7 )
            // InternalData.g:1480:3: rule__File__ExtAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__File__ExtAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getExtAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__7__Impl"


    // $ANTLR start "rule__File__Group__8"
    // InternalData.g:1488:1: rule__File__Group__8 : rule__File__Group__8__Impl rule__File__Group__9 ;
    public final void rule__File__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1492:1: ( rule__File__Group__8__Impl rule__File__Group__9 )
            // InternalData.g:1493:2: rule__File__Group__8__Impl rule__File__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__File__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__8"


    // $ANTLR start "rule__File__Group__8__Impl"
    // InternalData.g:1500:1: rule__File__Group__8__Impl : ( ',' ) ;
    public final void rule__File__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1504:1: ( ( ',' ) )
            // InternalData.g:1505:1: ( ',' )
            {
            // InternalData.g:1505:1: ( ',' )
            // InternalData.g:1506:2: ','
            {
             before(grammarAccess.getFileAccess().getCommaKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__8__Impl"


    // $ANTLR start "rule__File__Group__9"
    // InternalData.g:1515:1: rule__File__Group__9 : rule__File__Group__9__Impl rule__File__Group__10 ;
    public final void rule__File__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1519:1: ( rule__File__Group__9__Impl rule__File__Group__10 )
            // InternalData.g:1520:2: rule__File__Group__9__Impl rule__File__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__File__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__9"


    // $ANTLR start "rule__File__Group__9__Impl"
    // InternalData.g:1527:1: rule__File__Group__9__Impl : ( 'changed' ) ;
    public final void rule__File__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1531:1: ( ( 'changed' ) )
            // InternalData.g:1532:1: ( 'changed' )
            {
            // InternalData.g:1532:1: ( 'changed' )
            // InternalData.g:1533:2: 'changed'
            {
             before(grammarAccess.getFileAccess().getChangedKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getChangedKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__9__Impl"


    // $ANTLR start "rule__File__Group__10"
    // InternalData.g:1542:1: rule__File__Group__10 : rule__File__Group__10__Impl rule__File__Group__11 ;
    public final void rule__File__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1546:1: ( rule__File__Group__10__Impl rule__File__Group__11 )
            // InternalData.g:1547:2: rule__File__Group__10__Impl rule__File__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__File__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__10"


    // $ANTLR start "rule__File__Group__10__Impl"
    // InternalData.g:1554:1: rule__File__Group__10__Impl : ( ':' ) ;
    public final void rule__File__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1558:1: ( ( ':' ) )
            // InternalData.g:1559:1: ( ':' )
            {
            // InternalData.g:1559:1: ( ':' )
            // InternalData.g:1560:2: ':'
            {
             before(grammarAccess.getFileAccess().getColonKeyword_10()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__10__Impl"


    // $ANTLR start "rule__File__Group__11"
    // InternalData.g:1569:1: rule__File__Group__11 : rule__File__Group__11__Impl rule__File__Group__12 ;
    public final void rule__File__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1573:1: ( rule__File__Group__11__Impl rule__File__Group__12 )
            // InternalData.g:1574:2: rule__File__Group__11__Impl rule__File__Group__12
            {
            pushFollow(FOLLOW_16);
            rule__File__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__11"


    // $ANTLR start "rule__File__Group__11__Impl"
    // InternalData.g:1581:1: rule__File__Group__11__Impl : ( ( rule__File__ChangedAssignment_11 )? ) ;
    public final void rule__File__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1585:1: ( ( ( rule__File__ChangedAssignment_11 )? ) )
            // InternalData.g:1586:1: ( ( rule__File__ChangedAssignment_11 )? )
            {
            // InternalData.g:1586:1: ( ( rule__File__ChangedAssignment_11 )? )
            // InternalData.g:1587:2: ( rule__File__ChangedAssignment_11 )?
            {
             before(grammarAccess.getFileAccess().getChangedAssignment_11()); 
            // InternalData.g:1588:2: ( rule__File__ChangedAssignment_11 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_BOOL) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalData.g:1588:3: rule__File__ChangedAssignment_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__File__ChangedAssignment_11();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFileAccess().getChangedAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__11__Impl"


    // $ANTLR start "rule__File__Group__12"
    // InternalData.g:1596:1: rule__File__Group__12 : rule__File__Group__12__Impl rule__File__Group__13 ;
    public final void rule__File__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1600:1: ( rule__File__Group__12__Impl rule__File__Group__13 )
            // InternalData.g:1601:2: rule__File__Group__12__Impl rule__File__Group__13
            {
            pushFollow(FOLLOW_16);
            rule__File__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__12"


    // $ANTLR start "rule__File__Group__12__Impl"
    // InternalData.g:1608:1: rule__File__Group__12__Impl : ( ( rule__File__Group_12__0 )? ) ;
    public final void rule__File__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1612:1: ( ( ( rule__File__Group_12__0 )? ) )
            // InternalData.g:1613:1: ( ( rule__File__Group_12__0 )? )
            {
            // InternalData.g:1613:1: ( ( rule__File__Group_12__0 )? )
            // InternalData.g:1614:2: ( rule__File__Group_12__0 )?
            {
             before(grammarAccess.getFileAccess().getGroup_12()); 
            // InternalData.g:1615:2: ( rule__File__Group_12__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalData.g:1615:3: rule__File__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__File__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFileAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__12__Impl"


    // $ANTLR start "rule__File__Group__13"
    // InternalData.g:1623:1: rule__File__Group__13 : rule__File__Group__13__Impl ;
    public final void rule__File__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1627:1: ( rule__File__Group__13__Impl )
            // InternalData.g:1628:2: rule__File__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__13"


    // $ANTLR start "rule__File__Group__13__Impl"
    // InternalData.g:1634:1: rule__File__Group__13__Impl : ( '}' ) ;
    public final void rule__File__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1638:1: ( ( '}' ) )
            // InternalData.g:1639:1: ( '}' )
            {
            // InternalData.g:1639:1: ( '}' )
            // InternalData.g:1640:2: '}'
            {
             before(grammarAccess.getFileAccess().getRightCurlyBracketKeyword_13()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__13__Impl"


    // $ANTLR start "rule__File__Group_12__0"
    // InternalData.g:1650:1: rule__File__Group_12__0 : rule__File__Group_12__0__Impl rule__File__Group_12__1 ;
    public final void rule__File__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1654:1: ( rule__File__Group_12__0__Impl rule__File__Group_12__1 )
            // InternalData.g:1655:2: rule__File__Group_12__0__Impl rule__File__Group_12__1
            {
            pushFollow(FOLLOW_17);
            rule__File__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_12__0"


    // $ANTLR start "rule__File__Group_12__0__Impl"
    // InternalData.g:1662:1: rule__File__Group_12__0__Impl : ( ',' ) ;
    public final void rule__File__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1666:1: ( ( ',' ) )
            // InternalData.g:1667:1: ( ',' )
            {
            // InternalData.g:1667:1: ( ',' )
            // InternalData.g:1668:2: ','
            {
             before(grammarAccess.getFileAccess().getCommaKeyword_12_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getCommaKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_12__0__Impl"


    // $ANTLR start "rule__File__Group_12__1"
    // InternalData.g:1677:1: rule__File__Group_12__1 : rule__File__Group_12__1__Impl ;
    public final void rule__File__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1681:1: ( rule__File__Group_12__1__Impl )
            // InternalData.g:1682:2: rule__File__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_12__1"


    // $ANTLR start "rule__File__Group_12__1__Impl"
    // InternalData.g:1688:1: rule__File__Group_12__1__Impl : ( ( rule__File__ModelAssignment_12_1 )* ) ;
    public final void rule__File__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1692:1: ( ( ( rule__File__ModelAssignment_12_1 )* ) )
            // InternalData.g:1693:1: ( ( rule__File__ModelAssignment_12_1 )* )
            {
            // InternalData.g:1693:1: ( ( rule__File__ModelAssignment_12_1 )* )
            // InternalData.g:1694:2: ( rule__File__ModelAssignment_12_1 )*
            {
             before(grammarAccess.getFileAccess().getModelAssignment_12_1()); 
            // InternalData.g:1695:2: ( rule__File__ModelAssignment_12_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalData.g:1695:3: rule__File__ModelAssignment_12_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__File__ModelAssignment_12_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getFileAccess().getModelAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_12__1__Impl"


    // $ANTLR start "rule__Project__NameAssignment_4"
    // InternalData.g:1704:1: rule__Project__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Project__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1708:1: ( ( RULE_STRING ) )
            // InternalData.g:1709:2: ( RULE_STRING )
            {
            // InternalData.g:1709:2: ( RULE_STRING )
            // InternalData.g:1710:3: RULE_STRING
            {
             before(grammarAccess.getProjectAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__NameAssignment_4"


    // $ANTLR start "rule__Project__FilesAssignment_5_4"
    // InternalData.g:1719:1: rule__Project__FilesAssignment_5_4 : ( ruleFile ) ;
    public final void rule__Project__FilesAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1723:1: ( ( ruleFile ) )
            // InternalData.g:1724:2: ( ruleFile )
            {
            // InternalData.g:1724:2: ( ruleFile )
            // InternalData.g:1725:3: ruleFile
            {
             before(grammarAccess.getProjectAccess().getFilesFileParserRuleCall_5_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getFilesFileParserRuleCall_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__FilesAssignment_5_4"


    // $ANTLR start "rule__Project__FoldersAssignment_6_4"
    // InternalData.g:1734:1: rule__Project__FoldersAssignment_6_4 : ( ruleFolder ) ;
    public final void rule__Project__FoldersAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1738:1: ( ( ruleFolder ) )
            // InternalData.g:1739:2: ( ruleFolder )
            {
            // InternalData.g:1739:2: ( ruleFolder )
            // InternalData.g:1740:3: ruleFolder
            {
             before(grammarAccess.getProjectAccess().getFoldersFolderParserRuleCall_6_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFolder();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getFoldersFolderParserRuleCall_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__FoldersAssignment_6_4"


    // $ANTLR start "rule__Folder__NameAssignment_3"
    // InternalData.g:1749:1: rule__Folder__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Folder__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1753:1: ( ( RULE_STRING ) )
            // InternalData.g:1754:2: ( RULE_STRING )
            {
            // InternalData.g:1754:2: ( RULE_STRING )
            // InternalData.g:1755:3: RULE_STRING
            {
             before(grammarAccess.getFolderAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFolderAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__NameAssignment_3"


    // $ANTLR start "rule__Folder__FoldersAssignment_4_4"
    // InternalData.g:1764:1: rule__Folder__FoldersAssignment_4_4 : ( ruleFolder ) ;
    public final void rule__Folder__FoldersAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1768:1: ( ( ruleFolder ) )
            // InternalData.g:1769:2: ( ruleFolder )
            {
            // InternalData.g:1769:2: ( ruleFolder )
            // InternalData.g:1770:3: ruleFolder
            {
             before(grammarAccess.getFolderAccess().getFoldersFolderParserRuleCall_4_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFolder();

            state._fsp--;

             after(grammarAccess.getFolderAccess().getFoldersFolderParserRuleCall_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__FoldersAssignment_4_4"


    // $ANTLR start "rule__Folder__FilesAssignment_5_4"
    // InternalData.g:1779:1: rule__Folder__FilesAssignment_5_4 : ( ruleFile ) ;
    public final void rule__Folder__FilesAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1783:1: ( ( ruleFile ) )
            // InternalData.g:1784:2: ( ruleFile )
            {
            // InternalData.g:1784:2: ( ruleFile )
            // InternalData.g:1785:3: ruleFile
            {
             before(grammarAccess.getFolderAccess().getFilesFileParserRuleCall_5_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getFolderAccess().getFilesFileParserRuleCall_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__FilesAssignment_5_4"


    // $ANTLR start "rule__File__NameAssignment_3"
    // InternalData.g:1794:1: rule__File__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__File__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1798:1: ( ( RULE_STRING ) )
            // InternalData.g:1799:2: ( RULE_STRING )
            {
            // InternalData.g:1799:2: ( RULE_STRING )
            // InternalData.g:1800:3: RULE_STRING
            {
             before(grammarAccess.getFileAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__NameAssignment_3"


    // $ANTLR start "rule__File__ExtAssignment_7"
    // InternalData.g:1809:1: rule__File__ExtAssignment_7 : ( RULE_STRING ) ;
    public final void rule__File__ExtAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1813:1: ( ( RULE_STRING ) )
            // InternalData.g:1814:2: ( RULE_STRING )
            {
            // InternalData.g:1814:2: ( RULE_STRING )
            // InternalData.g:1815:3: RULE_STRING
            {
             before(grammarAccess.getFileAccess().getExtSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getExtSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__ExtAssignment_7"


    // $ANTLR start "rule__File__ChangedAssignment_11"
    // InternalData.g:1824:1: rule__File__ChangedAssignment_11 : ( RULE_BOOL ) ;
    public final void rule__File__ChangedAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1828:1: ( ( RULE_BOOL ) )
            // InternalData.g:1829:2: ( RULE_BOOL )
            {
            // InternalData.g:1829:2: ( RULE_BOOL )
            // InternalData.g:1830:3: RULE_BOOL
            {
             before(grammarAccess.getFileAccess().getChangedBOOLTerminalRuleCall_11_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getChangedBOOLTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__ChangedAssignment_11"


    // $ANTLR start "rule__File__ModelAssignment_12_1"
    // InternalData.g:1839:1: rule__File__ModelAssignment_12_1 : ( ( RULE_ID ) ) ;
    public final void rule__File__ModelAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalData.g:1843:1: ( ( ( RULE_ID ) ) )
            // InternalData.g:1844:2: ( ( RULE_ID ) )
            {
            // InternalData.g:1844:2: ( ( RULE_ID ) )
            // InternalData.g:1845:3: ( RULE_ID )
            {
             before(grammarAccess.getFileAccess().getModelEObjectCrossReference_12_1_0()); 
            // InternalData.g:1846:3: ( RULE_ID )
            // InternalData.g:1847:4: RULE_ID
            {
             before(grammarAccess.getFileAccess().getModelEObjectIDTerminalRuleCall_12_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getModelEObjectIDTerminalRuleCall_12_1_0_1()); 

            }

             after(grammarAccess.getFileAccess().getModelEObjectCrossReference_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__ModelAssignment_12_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000030020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000042L});

}