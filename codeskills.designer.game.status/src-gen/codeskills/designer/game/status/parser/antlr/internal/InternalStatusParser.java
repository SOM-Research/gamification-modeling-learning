package codeskills.designer.game.status.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import codeskills.designer.game.status.services.StatusGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStatusParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_LONG", "RULE_INT", "RULE_ID", "RULE_BOOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'levels'", "':'", "'['", "','", "']'", "'level'", "'groups'", "'group'", "'achievements'", "'achievement'", "'tasks'", "'task'", "'{'", "'complete'", "'date'", "'}'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_BOOL=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_LONG=5;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalStatusParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStatusParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStatusParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStatus.g"; }



     	private StatusGrammarAccess grammarAccess;

        public InternalStatusParser(TokenStream input, StatusGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "S";
       	}

       	@Override
       	protected StatusGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleS"
    // InternalStatus.g:64:1: entryRuleS returns [EObject current=null] : iv_ruleS= ruleS EOF ;
    public final EObject entryRuleS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleS = null;


        try {
            // InternalStatus.g:64:42: (iv_ruleS= ruleS EOF )
            // InternalStatus.g:65:2: iv_ruleS= ruleS EOF
            {
             newCompositeNode(grammarAccess.getSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleS=ruleS();

            state._fsp--;

             current =iv_ruleS; 
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
    // $ANTLR end "entryRuleS"


    // $ANTLR start "ruleS"
    // InternalStatus.g:71:1: ruleS returns [EObject current=null] : (this_GameS_0= ruleGameS | this_LevelS_1= ruleLevelS | this_GroupS_2= ruleGroupS | this_AchievementS_3= ruleAchievementS | this_TaskS_4= ruleTaskS ) ;
    public final EObject ruleS() throws RecognitionException {
        EObject current = null;

        EObject this_GameS_0 = null;

        EObject this_LevelS_1 = null;

        EObject this_GroupS_2 = null;

        EObject this_AchievementS_3 = null;

        EObject this_TaskS_4 = null;



        	enterRule();

        try {
            // InternalStatus.g:77:2: ( (this_GameS_0= ruleGameS | this_LevelS_1= ruleLevelS | this_GroupS_2= ruleGroupS | this_AchievementS_3= ruleAchievementS | this_TaskS_4= ruleTaskS ) )
            // InternalStatus.g:78:2: (this_GameS_0= ruleGameS | this_LevelS_1= ruleLevelS | this_GroupS_2= ruleGroupS | this_AchievementS_3= ruleAchievementS | this_TaskS_4= ruleTaskS )
            {
            // InternalStatus.g:78:2: (this_GameS_0= ruleGameS | this_LevelS_1= ruleLevelS | this_GroupS_2= ruleGroupS | this_AchievementS_3= ruleAchievementS | this_TaskS_4= ruleTaskS )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            case 23:
                {
                alt1=4;
                }
                break;
            case 25:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalStatus.g:79:3: this_GameS_0= ruleGameS
                    {

                    			newCompositeNode(grammarAccess.getSAccess().getGameSParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GameS_0=ruleGameS();

                    state._fsp--;


                    			current = this_GameS_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStatus.g:88:3: this_LevelS_1= ruleLevelS
                    {

                    			newCompositeNode(grammarAccess.getSAccess().getLevelSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LevelS_1=ruleLevelS();

                    state._fsp--;


                    			current = this_LevelS_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalStatus.g:97:3: this_GroupS_2= ruleGroupS
                    {

                    			newCompositeNode(grammarAccess.getSAccess().getGroupSParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GroupS_2=ruleGroupS();

                    state._fsp--;


                    			current = this_GroupS_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalStatus.g:106:3: this_AchievementS_3= ruleAchievementS
                    {

                    			newCompositeNode(grammarAccess.getSAccess().getAchievementSParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AchievementS_3=ruleAchievementS();

                    state._fsp--;


                    			current = this_AchievementS_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalStatus.g:115:3: this_TaskS_4= ruleTaskS
                    {

                    			newCompositeNode(grammarAccess.getSAccess().getTaskSParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskS_4=ruleTaskS();

                    state._fsp--;


                    			current = this_TaskS_4;
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
    // $ANTLR end "ruleS"


    // $ANTLR start "entryRuleGameS"
    // InternalStatus.g:127:1: entryRuleGameS returns [EObject current=null] : iv_ruleGameS= ruleGameS EOF ;
    public final EObject entryRuleGameS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameS = null;


        try {
            // InternalStatus.g:127:46: (iv_ruleGameS= ruleGameS EOF )
            // InternalStatus.g:128:2: iv_ruleGameS= ruleGameS EOF
            {
             newCompositeNode(grammarAccess.getGameSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGameS=ruleGameS();

            state._fsp--;

             current =iv_ruleGameS; 
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
    // $ANTLR end "entryRuleGameS"


    // $ANTLR start "ruleGameS"
    // InternalStatus.g:134:1: ruleGameS returns [EObject current=null] : (otherlv_0= 'game' otherlv_1= 'levels' otherlv_2= ':' otherlv_3= '[' ( (lv_levels_4_0= ruleLevelS ) ) (otherlv_5= ',' ( (lv_levels_6_0= ruleLevelS ) ) )* otherlv_7= ']' ( (lv_signature_8_0= RULE_STRING ) ) ( (lv_created_9_0= RULE_LONG ) ) ( (lv_status_10_0= ruleStatus ) ) ( (lv_currentScore_11_0= RULE_INT ) ) ) ;
    public final EObject ruleGameS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_signature_8_0=null;
        Token lv_created_9_0=null;
        Token lv_currentScore_11_0=null;
        EObject lv_levels_4_0 = null;

        EObject lv_levels_6_0 = null;

        EObject lv_status_10_0 = null;



        	enterRule();

        try {
            // InternalStatus.g:140:2: ( (otherlv_0= 'game' otherlv_1= 'levels' otherlv_2= ':' otherlv_3= '[' ( (lv_levels_4_0= ruleLevelS ) ) (otherlv_5= ',' ( (lv_levels_6_0= ruleLevelS ) ) )* otherlv_7= ']' ( (lv_signature_8_0= RULE_STRING ) ) ( (lv_created_9_0= RULE_LONG ) ) ( (lv_status_10_0= ruleStatus ) ) ( (lv_currentScore_11_0= RULE_INT ) ) ) )
            // InternalStatus.g:141:2: (otherlv_0= 'game' otherlv_1= 'levels' otherlv_2= ':' otherlv_3= '[' ( (lv_levels_4_0= ruleLevelS ) ) (otherlv_5= ',' ( (lv_levels_6_0= ruleLevelS ) ) )* otherlv_7= ']' ( (lv_signature_8_0= RULE_STRING ) ) ( (lv_created_9_0= RULE_LONG ) ) ( (lv_status_10_0= ruleStatus ) ) ( (lv_currentScore_11_0= RULE_INT ) ) )
            {
            // InternalStatus.g:141:2: (otherlv_0= 'game' otherlv_1= 'levels' otherlv_2= ':' otherlv_3= '[' ( (lv_levels_4_0= ruleLevelS ) ) (otherlv_5= ',' ( (lv_levels_6_0= ruleLevelS ) ) )* otherlv_7= ']' ( (lv_signature_8_0= RULE_STRING ) ) ( (lv_created_9_0= RULE_LONG ) ) ( (lv_status_10_0= ruleStatus ) ) ( (lv_currentScore_11_0= RULE_INT ) ) )
            // InternalStatus.g:142:3: otherlv_0= 'game' otherlv_1= 'levels' otherlv_2= ':' otherlv_3= '[' ( (lv_levels_4_0= ruleLevelS ) ) (otherlv_5= ',' ( (lv_levels_6_0= ruleLevelS ) ) )* otherlv_7= ']' ( (lv_signature_8_0= RULE_STRING ) ) ( (lv_created_9_0= RULE_LONG ) ) ( (lv_status_10_0= ruleStatus ) ) ( (lv_currentScore_11_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameSAccess().getGameKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGameSAccess().getLevelsKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGameSAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getGameSAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalStatus.g:158:3: ( (lv_levels_4_0= ruleLevelS ) )
            // InternalStatus.g:159:4: (lv_levels_4_0= ruleLevelS )
            {
            // InternalStatus.g:159:4: (lv_levels_4_0= ruleLevelS )
            // InternalStatus.g:160:5: lv_levels_4_0= ruleLevelS
            {

            					newCompositeNode(grammarAccess.getGameSAccess().getLevelsLevelSParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_levels_4_0=ruleLevelS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameSRule());
            					}
            					add(
            						current,
            						"levels",
            						lv_levels_4_0,
            						"codeskills.designer.game.status.Status.LevelS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStatus.g:177:3: (otherlv_5= ',' ( (lv_levels_6_0= ruleLevelS ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStatus.g:178:4: otherlv_5= ',' ( (lv_levels_6_0= ruleLevelS ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getGameSAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalStatus.g:182:4: ( (lv_levels_6_0= ruleLevelS ) )
            	    // InternalStatus.g:183:5: (lv_levels_6_0= ruleLevelS )
            	    {
            	    // InternalStatus.g:183:5: (lv_levels_6_0= ruleLevelS )
            	    // InternalStatus.g:184:6: lv_levels_6_0= ruleLevelS
            	    {

            	    						newCompositeNode(grammarAccess.getGameSAccess().getLevelsLevelSParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_levels_6_0=ruleLevelS();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGameSRule());
            	    						}
            	    						add(
            	    							current,
            	    							"levels",
            	    							lv_levels_6_0,
            	    							"codeskills.designer.game.status.Status.LevelS");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getGameSAccess().getRightSquareBracketKeyword_6());
            		
            // InternalStatus.g:206:3: ( (lv_signature_8_0= RULE_STRING ) )
            // InternalStatus.g:207:4: (lv_signature_8_0= RULE_STRING )
            {
            // InternalStatus.g:207:4: (lv_signature_8_0= RULE_STRING )
            // InternalStatus.g:208:5: lv_signature_8_0= RULE_STRING
            {
            lv_signature_8_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_signature_8_0, grammarAccess.getGameSAccess().getSignatureSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGameSRule());
            					}
            					setWithLastConsumed(
            						current,
            						"signature",
            						lv_signature_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalStatus.g:224:3: ( (lv_created_9_0= RULE_LONG ) )
            // InternalStatus.g:225:4: (lv_created_9_0= RULE_LONG )
            {
            // InternalStatus.g:225:4: (lv_created_9_0= RULE_LONG )
            // InternalStatus.g:226:5: lv_created_9_0= RULE_LONG
            {
            lv_created_9_0=(Token)match(input,RULE_LONG,FOLLOW_10); 

            					newLeafNode(lv_created_9_0, grammarAccess.getGameSAccess().getCreatedLONGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGameSRule());
            					}
            					setWithLastConsumed(
            						current,
            						"created",
            						lv_created_9_0,
            						"codeskills.designer.game.status.Status.LONG");
            				

            }


            }

            // InternalStatus.g:242:3: ( (lv_status_10_0= ruleStatus ) )
            // InternalStatus.g:243:4: (lv_status_10_0= ruleStatus )
            {
            // InternalStatus.g:243:4: (lv_status_10_0= ruleStatus )
            // InternalStatus.g:244:5: lv_status_10_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getGameSAccess().getStatusStatusParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_11);
            lv_status_10_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameSRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_10_0,
            						"codeskills.designer.game.status.Status.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStatus.g:261:3: ( (lv_currentScore_11_0= RULE_INT ) )
            // InternalStatus.g:262:4: (lv_currentScore_11_0= RULE_INT )
            {
            // InternalStatus.g:262:4: (lv_currentScore_11_0= RULE_INT )
            // InternalStatus.g:263:5: lv_currentScore_11_0= RULE_INT
            {
            lv_currentScore_11_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_currentScore_11_0, grammarAccess.getGameSAccess().getCurrentScoreINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGameSRule());
            					}
            					setWithLastConsumed(
            						current,
            						"currentScore",
            						lv_currentScore_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


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
    // $ANTLR end "ruleGameS"


    // $ANTLR start "entryRuleLevelS"
    // InternalStatus.g:283:1: entryRuleLevelS returns [EObject current=null] : iv_ruleLevelS= ruleLevelS EOF ;
    public final EObject entryRuleLevelS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevelS = null;


        try {
            // InternalStatus.g:283:47: (iv_ruleLevelS= ruleLevelS EOF )
            // InternalStatus.g:284:2: iv_ruleLevelS= ruleLevelS EOF
            {
             newCompositeNode(grammarAccess.getLevelSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLevelS=ruleLevelS();

            state._fsp--;

             current =iv_ruleLevelS; 
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
    // $ANTLR end "entryRuleLevelS"


    // $ANTLR start "ruleLevelS"
    // InternalStatus.g:290:1: ruleLevelS returns [EObject current=null] : (otherlv_0= 'level' ( (otherlv_1= RULE_ID ) ) ( (lv_status_2_0= ruleStatus ) ) ( (lv_isCurrent_3_0= RULE_BOOL ) )? otherlv_4= 'groups' otherlv_5= ':' otherlv_6= '[' ( (lv_groups_7_0= ruleGroupS ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleGroupS ) ) )* otherlv_10= ']' ) ;
    public final EObject ruleLevelS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isCurrent_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_status_2_0 = null;

        EObject lv_groups_7_0 = null;

        EObject lv_groups_9_0 = null;



        	enterRule();

        try {
            // InternalStatus.g:296:2: ( (otherlv_0= 'level' ( (otherlv_1= RULE_ID ) ) ( (lv_status_2_0= ruleStatus ) ) ( (lv_isCurrent_3_0= RULE_BOOL ) )? otherlv_4= 'groups' otherlv_5= ':' otherlv_6= '[' ( (lv_groups_7_0= ruleGroupS ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleGroupS ) ) )* otherlv_10= ']' ) )
            // InternalStatus.g:297:2: (otherlv_0= 'level' ( (otherlv_1= RULE_ID ) ) ( (lv_status_2_0= ruleStatus ) ) ( (lv_isCurrent_3_0= RULE_BOOL ) )? otherlv_4= 'groups' otherlv_5= ':' otherlv_6= '[' ( (lv_groups_7_0= ruleGroupS ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleGroupS ) ) )* otherlv_10= ']' )
            {
            // InternalStatus.g:297:2: (otherlv_0= 'level' ( (otherlv_1= RULE_ID ) ) ( (lv_status_2_0= ruleStatus ) ) ( (lv_isCurrent_3_0= RULE_BOOL ) )? otherlv_4= 'groups' otherlv_5= ':' otherlv_6= '[' ( (lv_groups_7_0= ruleGroupS ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleGroupS ) ) )* otherlv_10= ']' )
            // InternalStatus.g:298:3: otherlv_0= 'level' ( (otherlv_1= RULE_ID ) ) ( (lv_status_2_0= ruleStatus ) ) ( (lv_isCurrent_3_0= RULE_BOOL ) )? otherlv_4= 'groups' otherlv_5= ':' otherlv_6= '[' ( (lv_groups_7_0= ruleGroupS ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleGroupS ) ) )* otherlv_10= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getLevelSAccess().getLevelKeyword_0());
            		
            // InternalStatus.g:302:3: ( (otherlv_1= RULE_ID ) )
            // InternalStatus.g:303:4: (otherlv_1= RULE_ID )
            {
            // InternalStatus.g:303:4: (otherlv_1= RULE_ID )
            // InternalStatus.g:304:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLevelSRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_1, grammarAccess.getLevelSAccess().getLevelLevelCrossReference_1_0());
            				

            }


            }

            // InternalStatus.g:315:3: ( (lv_status_2_0= ruleStatus ) )
            // InternalStatus.g:316:4: (lv_status_2_0= ruleStatus )
            {
            // InternalStatus.g:316:4: (lv_status_2_0= ruleStatus )
            // InternalStatus.g:317:5: lv_status_2_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getLevelSAccess().getStatusStatusParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_status_2_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLevelSRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_2_0,
            						"codeskills.designer.game.status.Status.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStatus.g:334:3: ( (lv_isCurrent_3_0= RULE_BOOL ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_BOOL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalStatus.g:335:4: (lv_isCurrent_3_0= RULE_BOOL )
                    {
                    // InternalStatus.g:335:4: (lv_isCurrent_3_0= RULE_BOOL )
                    // InternalStatus.g:336:5: lv_isCurrent_3_0= RULE_BOOL
                    {
                    lv_isCurrent_3_0=(Token)match(input,RULE_BOOL,FOLLOW_14); 

                    					newLeafNode(lv_isCurrent_3_0, grammarAccess.getLevelSAccess().getIsCurrentBOOLTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLevelSRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"isCurrent",
                    						true,
                    						"codeskills.designer.game.status.Status.BOOL");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getLevelSAccess().getGroupsKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getLevelSAccess().getColonKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getLevelSAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalStatus.g:364:3: ( (lv_groups_7_0= ruleGroupS ) )
            // InternalStatus.g:365:4: (lv_groups_7_0= ruleGroupS )
            {
            // InternalStatus.g:365:4: (lv_groups_7_0= ruleGroupS )
            // InternalStatus.g:366:5: lv_groups_7_0= ruleGroupS
            {

            					newCompositeNode(grammarAccess.getLevelSAccess().getGroupsGroupSParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_7);
            lv_groups_7_0=ruleGroupS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLevelSRule());
            					}
            					add(
            						current,
            						"groups",
            						lv_groups_7_0,
            						"codeskills.designer.game.status.Status.GroupS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStatus.g:383:3: (otherlv_8= ',' ( (lv_groups_9_0= ruleGroupS ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStatus.g:384:4: otherlv_8= ',' ( (lv_groups_9_0= ruleGroupS ) )
            	    {
            	    otherlv_8=(Token)match(input,17,FOLLOW_15); 

            	    				newLeafNode(otherlv_8, grammarAccess.getLevelSAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalStatus.g:388:4: ( (lv_groups_9_0= ruleGroupS ) )
            	    // InternalStatus.g:389:5: (lv_groups_9_0= ruleGroupS )
            	    {
            	    // InternalStatus.g:389:5: (lv_groups_9_0= ruleGroupS )
            	    // InternalStatus.g:390:6: lv_groups_9_0= ruleGroupS
            	    {

            	    						newCompositeNode(grammarAccess.getLevelSAccess().getGroupsGroupSParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_groups_9_0=ruleGroupS();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLevelSRule());
            	    						}
            	    						add(
            	    							current,
            	    							"groups",
            	    							lv_groups_9_0,
            	    							"codeskills.designer.game.status.Status.GroupS");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLevelSAccess().getRightSquareBracketKeyword_9());
            		

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
    // $ANTLR end "ruleLevelS"


    // $ANTLR start "entryRuleGroupS"
    // InternalStatus.g:416:1: entryRuleGroupS returns [EObject current=null] : iv_ruleGroupS= ruleGroupS EOF ;
    public final EObject entryRuleGroupS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupS = null;


        try {
            // InternalStatus.g:416:47: (iv_ruleGroupS= ruleGroupS EOF )
            // InternalStatus.g:417:2: iv_ruleGroupS= ruleGroupS EOF
            {
             newCompositeNode(grammarAccess.getGroupSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupS=ruleGroupS();

            state._fsp--;

             current =iv_ruleGroupS; 
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
    // $ANTLR end "entryRuleGroupS"


    // $ANTLR start "ruleGroupS"
    // InternalStatus.g:423:1: ruleGroupS returns [EObject current=null] : (otherlv_0= 'group' ( (otherlv_1= RULE_ID ) ) ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'achievements' otherlv_4= ':' otherlv_5= '[' ( (lv_achievements_6_0= ruleAchievementS ) ) (otherlv_7= ',' ( (lv_achievements_8_0= ruleAchievementS ) ) )* otherlv_9= ']' ) ;
    public final EObject ruleGroupS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_status_2_0 = null;

        EObject lv_achievements_6_0 = null;

        EObject lv_achievements_8_0 = null;



        	enterRule();

        try {
            // InternalStatus.g:429:2: ( (otherlv_0= 'group' ( (otherlv_1= RULE_ID ) ) ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'achievements' otherlv_4= ':' otherlv_5= '[' ( (lv_achievements_6_0= ruleAchievementS ) ) (otherlv_7= ',' ( (lv_achievements_8_0= ruleAchievementS ) ) )* otherlv_9= ']' ) )
            // InternalStatus.g:430:2: (otherlv_0= 'group' ( (otherlv_1= RULE_ID ) ) ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'achievements' otherlv_4= ':' otherlv_5= '[' ( (lv_achievements_6_0= ruleAchievementS ) ) (otherlv_7= ',' ( (lv_achievements_8_0= ruleAchievementS ) ) )* otherlv_9= ']' )
            {
            // InternalStatus.g:430:2: (otherlv_0= 'group' ( (otherlv_1= RULE_ID ) ) ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'achievements' otherlv_4= ':' otherlv_5= '[' ( (lv_achievements_6_0= ruleAchievementS ) ) (otherlv_7= ',' ( (lv_achievements_8_0= ruleAchievementS ) ) )* otherlv_9= ']' )
            // InternalStatus.g:431:3: otherlv_0= 'group' ( (otherlv_1= RULE_ID ) ) ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'achievements' otherlv_4= ':' otherlv_5= '[' ( (lv_achievements_6_0= ruleAchievementS ) ) (otherlv_7= ',' ( (lv_achievements_8_0= ruleAchievementS ) ) )* otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupSAccess().getGroupKeyword_0());
            		
            // InternalStatus.g:435:3: ( (otherlv_1= RULE_ID ) )
            // InternalStatus.g:436:4: (otherlv_1= RULE_ID )
            {
            // InternalStatus.g:436:4: (otherlv_1= RULE_ID )
            // InternalStatus.g:437:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupSRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_1, grammarAccess.getGroupSAccess().getGroupGroupCrossReference_1_0());
            				

            }


            }

            // InternalStatus.g:448:3: ( (lv_status_2_0= ruleStatus ) )
            // InternalStatus.g:449:4: (lv_status_2_0= ruleStatus )
            {
            // InternalStatus.g:449:4: (lv_status_2_0= ruleStatus )
            // InternalStatus.g:450:5: lv_status_2_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getGroupSAccess().getStatusStatusParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_status_2_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupSRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_2_0,
            						"codeskills.designer.game.status.Status.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getGroupSAccess().getAchievementsKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupSAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getGroupSAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalStatus.g:479:3: ( (lv_achievements_6_0= ruleAchievementS ) )
            // InternalStatus.g:480:4: (lv_achievements_6_0= ruleAchievementS )
            {
            // InternalStatus.g:480:4: (lv_achievements_6_0= ruleAchievementS )
            // InternalStatus.g:481:5: lv_achievements_6_0= ruleAchievementS
            {

            					newCompositeNode(grammarAccess.getGroupSAccess().getAchievementsAchievementSParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_achievements_6_0=ruleAchievementS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupSRule());
            					}
            					add(
            						current,
            						"achievements",
            						lv_achievements_6_0,
            						"codeskills.designer.game.status.Status.AchievementS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStatus.g:498:3: (otherlv_7= ',' ( (lv_achievements_8_0= ruleAchievementS ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalStatus.g:499:4: otherlv_7= ',' ( (lv_achievements_8_0= ruleAchievementS ) )
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_17); 

            	    				newLeafNode(otherlv_7, grammarAccess.getGroupSAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalStatus.g:503:4: ( (lv_achievements_8_0= ruleAchievementS ) )
            	    // InternalStatus.g:504:5: (lv_achievements_8_0= ruleAchievementS )
            	    {
            	    // InternalStatus.g:504:5: (lv_achievements_8_0= ruleAchievementS )
            	    // InternalStatus.g:505:6: lv_achievements_8_0= ruleAchievementS
            	    {

            	    						newCompositeNode(grammarAccess.getGroupSAccess().getAchievementsAchievementSParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_achievements_8_0=ruleAchievementS();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupSRule());
            	    						}
            	    						add(
            	    							current,
            	    							"achievements",
            	    							lv_achievements_8_0,
            	    							"codeskills.designer.game.status.Status.AchievementS");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getGroupSAccess().getRightSquareBracketKeyword_8());
            		

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
    // $ANTLR end "ruleGroupS"


    // $ANTLR start "entryRuleAchievementS"
    // InternalStatus.g:531:1: entryRuleAchievementS returns [EObject current=null] : iv_ruleAchievementS= ruleAchievementS EOF ;
    public final EObject entryRuleAchievementS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAchievementS = null;


        try {
            // InternalStatus.g:531:53: (iv_ruleAchievementS= ruleAchievementS EOF )
            // InternalStatus.g:532:2: iv_ruleAchievementS= ruleAchievementS EOF
            {
             newCompositeNode(grammarAccess.getAchievementSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAchievementS=ruleAchievementS();

            state._fsp--;

             current =iv_ruleAchievementS; 
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
    // $ANTLR end "entryRuleAchievementS"


    // $ANTLR start "ruleAchievementS"
    // InternalStatus.g:538:1: ruleAchievementS returns [EObject current=null] : (otherlv_0= 'achievement' ( (otherlv_1= RULE_ID ) ) ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'tasks' otherlv_4= ':' otherlv_5= '[' ( (lv_tasks_6_0= ruleTaskS ) ) (otherlv_7= ',' ( (lv_tasks_8_0= ruleTaskS ) ) )* otherlv_9= ']' ) ;
    public final EObject ruleAchievementS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_status_2_0 = null;

        EObject lv_tasks_6_0 = null;

        EObject lv_tasks_8_0 = null;



        	enterRule();

        try {
            // InternalStatus.g:544:2: ( (otherlv_0= 'achievement' ( (otherlv_1= RULE_ID ) ) ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'tasks' otherlv_4= ':' otherlv_5= '[' ( (lv_tasks_6_0= ruleTaskS ) ) (otherlv_7= ',' ( (lv_tasks_8_0= ruleTaskS ) ) )* otherlv_9= ']' ) )
            // InternalStatus.g:545:2: (otherlv_0= 'achievement' ( (otherlv_1= RULE_ID ) ) ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'tasks' otherlv_4= ':' otherlv_5= '[' ( (lv_tasks_6_0= ruleTaskS ) ) (otherlv_7= ',' ( (lv_tasks_8_0= ruleTaskS ) ) )* otherlv_9= ']' )
            {
            // InternalStatus.g:545:2: (otherlv_0= 'achievement' ( (otherlv_1= RULE_ID ) ) ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'tasks' otherlv_4= ':' otherlv_5= '[' ( (lv_tasks_6_0= ruleTaskS ) ) (otherlv_7= ',' ( (lv_tasks_8_0= ruleTaskS ) ) )* otherlv_9= ']' )
            // InternalStatus.g:546:3: otherlv_0= 'achievement' ( (otherlv_1= RULE_ID ) ) ( (lv_status_2_0= ruleStatus ) ) otherlv_3= 'tasks' otherlv_4= ':' otherlv_5= '[' ( (lv_tasks_6_0= ruleTaskS ) ) (otherlv_7= ',' ( (lv_tasks_8_0= ruleTaskS ) ) )* otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAchievementSAccess().getAchievementKeyword_0());
            		
            // InternalStatus.g:550:3: ( (otherlv_1= RULE_ID ) )
            // InternalStatus.g:551:4: (otherlv_1= RULE_ID )
            {
            // InternalStatus.g:551:4: (otherlv_1= RULE_ID )
            // InternalStatus.g:552:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAchievementSRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_1, grammarAccess.getAchievementSAccess().getAchievementAchievementCrossReference_1_0());
            				

            }


            }

            // InternalStatus.g:563:3: ( (lv_status_2_0= ruleStatus ) )
            // InternalStatus.g:564:4: (lv_status_2_0= ruleStatus )
            {
            // InternalStatus.g:564:4: (lv_status_2_0= ruleStatus )
            // InternalStatus.g:565:5: lv_status_2_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getAchievementSAccess().getStatusStatusParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_status_2_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAchievementSRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_2_0,
            						"codeskills.designer.game.status.Status.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAchievementSAccess().getTasksKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getAchievementSAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getAchievementSAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalStatus.g:594:3: ( (lv_tasks_6_0= ruleTaskS ) )
            // InternalStatus.g:595:4: (lv_tasks_6_0= ruleTaskS )
            {
            // InternalStatus.g:595:4: (lv_tasks_6_0= ruleTaskS )
            // InternalStatus.g:596:5: lv_tasks_6_0= ruleTaskS
            {

            					newCompositeNode(grammarAccess.getAchievementSAccess().getTasksTaskSParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_tasks_6_0=ruleTaskS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAchievementSRule());
            					}
            					add(
            						current,
            						"tasks",
            						lv_tasks_6_0,
            						"codeskills.designer.game.status.Status.TaskS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStatus.g:613:3: (otherlv_7= ',' ( (lv_tasks_8_0= ruleTaskS ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalStatus.g:614:4: otherlv_7= ',' ( (lv_tasks_8_0= ruleTaskS ) )
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_19); 

            	    				newLeafNode(otherlv_7, grammarAccess.getAchievementSAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalStatus.g:618:4: ( (lv_tasks_8_0= ruleTaskS ) )
            	    // InternalStatus.g:619:5: (lv_tasks_8_0= ruleTaskS )
            	    {
            	    // InternalStatus.g:619:5: (lv_tasks_8_0= ruleTaskS )
            	    // InternalStatus.g:620:6: lv_tasks_8_0= ruleTaskS
            	    {

            	    						newCompositeNode(grammarAccess.getAchievementSAccess().getTasksTaskSParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_tasks_8_0=ruleTaskS();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAchievementSRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tasks",
            	    							lv_tasks_8_0,
            	    							"codeskills.designer.game.status.Status.TaskS");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAchievementSAccess().getRightSquareBracketKeyword_8());
            		

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
    // $ANTLR end "ruleAchievementS"


    // $ANTLR start "entryRuleTaskS"
    // InternalStatus.g:646:1: entryRuleTaskS returns [EObject current=null] : iv_ruleTaskS= ruleTaskS EOF ;
    public final EObject entryRuleTaskS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskS = null;


        try {
            // InternalStatus.g:646:46: (iv_ruleTaskS= ruleTaskS EOF )
            // InternalStatus.g:647:2: iv_ruleTaskS= ruleTaskS EOF
            {
             newCompositeNode(grammarAccess.getTaskSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskS=ruleTaskS();

            state._fsp--;

             current =iv_ruleTaskS; 
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
    // $ANTLR end "entryRuleTaskS"


    // $ANTLR start "ruleTaskS"
    // InternalStatus.g:653:1: ruleTaskS returns [EObject current=null] : (otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) ( (lv_status_2_0= ruleStatus ) ) ) ;
    public final EObject ruleTaskS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_status_2_0 = null;



        	enterRule();

        try {
            // InternalStatus.g:659:2: ( (otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) ( (lv_status_2_0= ruleStatus ) ) ) )
            // InternalStatus.g:660:2: (otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) ( (lv_status_2_0= ruleStatus ) ) )
            {
            // InternalStatus.g:660:2: (otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) ( (lv_status_2_0= ruleStatus ) ) )
            // InternalStatus.g:661:3: otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) ( (lv_status_2_0= ruleStatus ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskSAccess().getTaskKeyword_0());
            		
            // InternalStatus.g:665:3: ( (otherlv_1= RULE_ID ) )
            // InternalStatus.g:666:4: (otherlv_1= RULE_ID )
            {
            // InternalStatus.g:666:4: (otherlv_1= RULE_ID )
            // InternalStatus.g:667:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskSRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_1, grammarAccess.getTaskSAccess().getTaskTaskCrossReference_1_0());
            				

            }


            }

            // InternalStatus.g:678:3: ( (lv_status_2_0= ruleStatus ) )
            // InternalStatus.g:679:4: (lv_status_2_0= ruleStatus )
            {
            // InternalStatus.g:679:4: (lv_status_2_0= ruleStatus )
            // InternalStatus.g:680:5: lv_status_2_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getTaskSAccess().getStatusStatusParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_status_2_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskSRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_2_0,
            						"codeskills.designer.game.status.Status.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleTaskS"


    // $ANTLR start "entryRuleStatus"
    // InternalStatus.g:701:1: entryRuleStatus returns [EObject current=null] : iv_ruleStatus= ruleStatus EOF ;
    public final EObject entryRuleStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatus = null;


        try {
            // InternalStatus.g:701:47: (iv_ruleStatus= ruleStatus EOF )
            // InternalStatus.g:702:2: iv_ruleStatus= ruleStatus EOF
            {
             newCompositeNode(grammarAccess.getStatusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatus=ruleStatus();

            state._fsp--;

             current =iv_ruleStatus; 
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
    // $ANTLR end "entryRuleStatus"


    // $ANTLR start "ruleStatus"
    // InternalStatus.g:708:1: ruleStatus returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'complete' otherlv_2= ':' ( (lv_complete_3_0= RULE_BOOL ) ) otherlv_4= ',' otherlv_5= 'date' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_LONG ) ) otherlv_8= '}' ) ;
    public final EObject ruleStatus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_complete_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_milliseconds_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalStatus.g:714:2: ( (otherlv_0= '{' otherlv_1= 'complete' otherlv_2= ':' ( (lv_complete_3_0= RULE_BOOL ) ) otherlv_4= ',' otherlv_5= 'date' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_LONG ) ) otherlv_8= '}' ) )
            // InternalStatus.g:715:2: (otherlv_0= '{' otherlv_1= 'complete' otherlv_2= ':' ( (lv_complete_3_0= RULE_BOOL ) ) otherlv_4= ',' otherlv_5= 'date' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_LONG ) ) otherlv_8= '}' )
            {
            // InternalStatus.g:715:2: (otherlv_0= '{' otherlv_1= 'complete' otherlv_2= ':' ( (lv_complete_3_0= RULE_BOOL ) ) otherlv_4= ',' otherlv_5= 'date' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_LONG ) ) otherlv_8= '}' )
            // InternalStatus.g:716:3: otherlv_0= '{' otherlv_1= 'complete' otherlv_2= ':' ( (lv_complete_3_0= RULE_BOOL ) ) otherlv_4= ',' otherlv_5= 'date' otherlv_6= ':' ( (lv_milliseconds_7_0= RULE_LONG ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getStatusAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStatusAccess().getCompleteKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getStatusAccess().getColonKeyword_2());
            		
            // InternalStatus.g:728:3: ( (lv_complete_3_0= RULE_BOOL ) )
            // InternalStatus.g:729:4: (lv_complete_3_0= RULE_BOOL )
            {
            // InternalStatus.g:729:4: (lv_complete_3_0= RULE_BOOL )
            // InternalStatus.g:730:5: lv_complete_3_0= RULE_BOOL
            {
            lv_complete_3_0=(Token)match(input,RULE_BOOL,FOLLOW_22); 

            					newLeafNode(lv_complete_3_0, grammarAccess.getStatusAccess().getCompleteBOOLTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatusRule());
            					}
            					setWithLastConsumed(
            						current,
            						"complete",
            						true,
            						"codeskills.designer.game.status.Status.BOOL");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getStatusAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getStatusAccess().getDateKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getStatusAccess().getColonKeyword_6());
            		
            // InternalStatus.g:758:3: ( (lv_milliseconds_7_0= RULE_LONG ) )
            // InternalStatus.g:759:4: (lv_milliseconds_7_0= RULE_LONG )
            {
            // InternalStatus.g:759:4: (lv_milliseconds_7_0= RULE_LONG )
            // InternalStatus.g:760:5: lv_milliseconds_7_0= RULE_LONG
            {
            lv_milliseconds_7_0=(Token)match(input,RULE_LONG,FOLLOW_24); 

            					newLeafNode(lv_milliseconds_7_0, grammarAccess.getStatusAccess().getMillisecondsLONGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatusRule());
            					}
            					setWithLastConsumed(
            						current,
            						"milliseconds",
            						lv_milliseconds_7_0,
            						"codeskills.designer.game.status.Status.LONG");
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getStatusAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleStatus"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});

}