package codeskills.designer.game.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import codeskills.designer.game.services.GameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'levels'", "':'", "'['", "','", "']'", "'}'", "'name'", "'description'", "'reward'", "'groups'", "'achievements'", "'tasks'", "'points'", "'badgePath'", "'notification'", "'message'", "'iconPath'", "'soundPath'", "'query'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGameParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGameParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGameParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGame.g"; }



     	private GameGrammarAccess grammarAccess;

        public InternalGameParser(TokenStream input, GameGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Game";
       	}

       	@Override
       	protected GameGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGame"
    // InternalGame.g:64:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalGame.g:64:45: (iv_ruleGame= ruleGame EOF )
            // InternalGame.g:65:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
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
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalGame.g:71:1: ruleGame returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'levels' otherlv_2= ':' otherlv_3= '[' ( (lv_levels_4_0= ruleLevel ) ) (otherlv_5= ',' ( (lv_levels_6_0= ruleLevel ) ) )* otherlv_7= ']' otherlv_8= '}' ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_levels_4_0 = null;

        EObject lv_levels_6_0 = null;



        	enterRule();

        try {
            // InternalGame.g:77:2: ( (otherlv_0= '{' otherlv_1= 'levels' otherlv_2= ':' otherlv_3= '[' ( (lv_levels_4_0= ruleLevel ) ) (otherlv_5= ',' ( (lv_levels_6_0= ruleLevel ) ) )* otherlv_7= ']' otherlv_8= '}' ) )
            // InternalGame.g:78:2: (otherlv_0= '{' otherlv_1= 'levels' otherlv_2= ':' otherlv_3= '[' ( (lv_levels_4_0= ruleLevel ) ) (otherlv_5= ',' ( (lv_levels_6_0= ruleLevel ) ) )* otherlv_7= ']' otherlv_8= '}' )
            {
            // InternalGame.g:78:2: (otherlv_0= '{' otherlv_1= 'levels' otherlv_2= ':' otherlv_3= '[' ( (lv_levels_4_0= ruleLevel ) ) (otherlv_5= ',' ( (lv_levels_6_0= ruleLevel ) ) )* otherlv_7= ']' otherlv_8= '}' )
            // InternalGame.g:79:3: otherlv_0= '{' otherlv_1= 'levels' otherlv_2= ':' otherlv_3= '[' ( (lv_levels_4_0= ruleLevel ) ) (otherlv_5= ',' ( (lv_levels_6_0= ruleLevel ) ) )* otherlv_7= ']' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGameAccess().getLevelsKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGameAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getGameAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalGame.g:95:3: ( (lv_levels_4_0= ruleLevel ) )
            // InternalGame.g:96:4: (lv_levels_4_0= ruleLevel )
            {
            // InternalGame.g:96:4: (lv_levels_4_0= ruleLevel )
            // InternalGame.g:97:5: lv_levels_4_0= ruleLevel
            {

            					newCompositeNode(grammarAccess.getGameAccess().getLevelsLevelParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_levels_4_0=ruleLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					add(
            						current,
            						"levels",
            						lv_levels_4_0,
            						"codeskills.designer.game.Game.Level");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:114:3: (otherlv_5= ',' ( (lv_levels_6_0= ruleLevel ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGame.g:115:4: otherlv_5= ',' ( (lv_levels_6_0= ruleLevel ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getGameAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalGame.g:119:4: ( (lv_levels_6_0= ruleLevel ) )
            	    // InternalGame.g:120:5: (lv_levels_6_0= ruleLevel )
            	    {
            	    // InternalGame.g:120:5: (lv_levels_6_0= ruleLevel )
            	    // InternalGame.g:121:6: lv_levels_6_0= ruleLevel
            	    {

            	    						newCompositeNode(grammarAccess.getGameAccess().getLevelsLevelParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_levels_6_0=ruleLevel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGameRule());
            	    						}
            	    						add(
            	    							current,
            	    							"levels",
            	    							lv_levels_6_0,
            	    							"codeskills.designer.game.Game.Level");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getGameAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleLevel"
    // InternalGame.g:151:1: entryRuleLevel returns [EObject current=null] : iv_ruleLevel= ruleLevel EOF ;
    public final EObject entryRuleLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevel = null;


        try {
            // InternalGame.g:151:46: (iv_ruleLevel= ruleLevel EOF )
            // InternalGame.g:152:2: iv_ruleLevel= ruleLevel EOF
            {
             newCompositeNode(grammarAccess.getLevelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLevel=ruleLevel();

            state._fsp--;

             current =iv_ruleLevel; 
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
    // $ANTLR end "entryRuleLevel"


    // $ANTLR start "ruleLevel"
    // InternalGame.g:158:1: ruleLevel returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'reward' otherlv_10= ':' ( (lv_reward_11_0= ruleReward ) ) otherlv_12= ',' otherlv_13= 'groups' otherlv_14= ':' otherlv_15= '[' ( (lv_groups_16_0= ruleGroup ) ) (otherlv_17= ',' ( (lv_groups_18_0= ruleGroup ) ) )* otherlv_19= ']' otherlv_20= '}' ) ;
    public final EObject ruleLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_reward_11_0 = null;

        EObject lv_groups_16_0 = null;

        EObject lv_groups_18_0 = null;



        	enterRule();

        try {
            // InternalGame.g:164:2: ( (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'reward' otherlv_10= ':' ( (lv_reward_11_0= ruleReward ) ) otherlv_12= ',' otherlv_13= 'groups' otherlv_14= ':' otherlv_15= '[' ( (lv_groups_16_0= ruleGroup ) ) (otherlv_17= ',' ( (lv_groups_18_0= ruleGroup ) ) )* otherlv_19= ']' otherlv_20= '}' ) )
            // InternalGame.g:165:2: (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'reward' otherlv_10= ':' ( (lv_reward_11_0= ruleReward ) ) otherlv_12= ',' otherlv_13= 'groups' otherlv_14= ':' otherlv_15= '[' ( (lv_groups_16_0= ruleGroup ) ) (otherlv_17= ',' ( (lv_groups_18_0= ruleGroup ) ) )* otherlv_19= ']' otherlv_20= '}' )
            {
            // InternalGame.g:165:2: (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'reward' otherlv_10= ':' ( (lv_reward_11_0= ruleReward ) ) otherlv_12= ',' otherlv_13= 'groups' otherlv_14= ':' otherlv_15= '[' ( (lv_groups_16_0= ruleGroup ) ) (otherlv_17= ',' ( (lv_groups_18_0= ruleGroup ) ) )* otherlv_19= ']' otherlv_20= '}' )
            // InternalGame.g:166:3: otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'reward' otherlv_10= ':' ( (lv_reward_11_0= ruleReward ) ) otherlv_12= ',' otherlv_13= 'groups' otherlv_14= ':' otherlv_15= '[' ( (lv_groups_16_0= ruleGroup ) ) (otherlv_17= ',' ( (lv_groups_18_0= ruleGroup ) ) )* otherlv_19= ']' otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLevelAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLevelAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getLevelAccess().getColonKeyword_2());
            		
            // InternalGame.g:178:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalGame.g:179:4: (lv_name_3_0= RULE_ID )
            {
            // InternalGame.g:179:4: (lv_name_3_0= RULE_ID )
            // InternalGame.g:180:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_3_0, grammarAccess.getLevelAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLevelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getLevelAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getLevelAccess().getDescriptionKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getLevelAccess().getColonKeyword_6());
            		
            // InternalGame.g:208:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalGame.g:209:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalGame.g:209:4: (lv_description_7_0= RULE_STRING )
            // InternalGame.g:210:5: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_description_7_0, grammarAccess.getLevelAccess().getDescriptionSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLevelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getLevelAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getLevelAccess().getRewardKeyword_9());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getLevelAccess().getColonKeyword_10());
            		
            // InternalGame.g:238:3: ( (lv_reward_11_0= ruleReward ) )
            // InternalGame.g:239:4: (lv_reward_11_0= ruleReward )
            {
            // InternalGame.g:239:4: (lv_reward_11_0= ruleReward )
            // InternalGame.g:240:5: lv_reward_11_0= ruleReward
            {

            					newCompositeNode(grammarAccess.getLevelAccess().getRewardRewardParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_reward_11_0=ruleReward();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLevelRule());
            					}
            					set(
            						current,
            						"reward",
            						lv_reward_11_0,
            						"codeskills.designer.game.Game.Reward");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_12, grammarAccess.getLevelAccess().getCommaKeyword_12());
            		
            otherlv_13=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getLevelAccess().getGroupsKeyword_13());
            		
            otherlv_14=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getLevelAccess().getColonKeyword_14());
            		
            otherlv_15=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_15, grammarAccess.getLevelAccess().getLeftSquareBracketKeyword_15());
            		
            // InternalGame.g:273:3: ( (lv_groups_16_0= ruleGroup ) )
            // InternalGame.g:274:4: (lv_groups_16_0= ruleGroup )
            {
            // InternalGame.g:274:4: (lv_groups_16_0= ruleGroup )
            // InternalGame.g:275:5: lv_groups_16_0= ruleGroup
            {

            					newCompositeNode(grammarAccess.getLevelAccess().getGroupsGroupParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_7);
            lv_groups_16_0=ruleGroup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLevelRule());
            					}
            					add(
            						current,
            						"groups",
            						lv_groups_16_0,
            						"codeskills.designer.game.Game.Group");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:292:3: (otherlv_17= ',' ( (lv_groups_18_0= ruleGroup ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGame.g:293:4: otherlv_17= ',' ( (lv_groups_18_0= ruleGroup ) )
            	    {
            	    otherlv_17=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_17, grammarAccess.getLevelAccess().getCommaKeyword_17_0());
            	    			
            	    // InternalGame.g:297:4: ( (lv_groups_18_0= ruleGroup ) )
            	    // InternalGame.g:298:5: (lv_groups_18_0= ruleGroup )
            	    {
            	    // InternalGame.g:298:5: (lv_groups_18_0= ruleGroup )
            	    // InternalGame.g:299:6: lv_groups_18_0= ruleGroup
            	    {

            	    						newCompositeNode(grammarAccess.getLevelAccess().getGroupsGroupParserRuleCall_17_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_groups_18_0=ruleGroup();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLevelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"groups",
            	    							lv_groups_18_0,
            	    							"codeskills.designer.game.Game.Group");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_19=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_19, grammarAccess.getLevelAccess().getRightSquareBracketKeyword_18());
            		
            otherlv_20=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getLevelAccess().getRightCurlyBracketKeyword_19());
            		

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
    // $ANTLR end "ruleLevel"


    // $ANTLR start "entryRuleGroup"
    // InternalGame.g:329:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalGame.g:329:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalGame.g:330:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalGame.g:336:1: ruleGroup returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'reward' otherlv_10= ':' ( (lv_reward_11_0= ruleReward ) ) otherlv_12= ',' otherlv_13= 'achievements' otherlv_14= ':' otherlv_15= '[' ( (lv_achievements_16_0= ruleAchievement ) ) (otherlv_17= ',' ( (lv_achievements_18_0= ruleAchievement ) ) )* otherlv_19= ']' otherlv_20= '}' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_reward_11_0 = null;

        EObject lv_achievements_16_0 = null;

        EObject lv_achievements_18_0 = null;



        	enterRule();

        try {
            // InternalGame.g:342:2: ( (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'reward' otherlv_10= ':' ( (lv_reward_11_0= ruleReward ) ) otherlv_12= ',' otherlv_13= 'achievements' otherlv_14= ':' otherlv_15= '[' ( (lv_achievements_16_0= ruleAchievement ) ) (otherlv_17= ',' ( (lv_achievements_18_0= ruleAchievement ) ) )* otherlv_19= ']' otherlv_20= '}' ) )
            // InternalGame.g:343:2: (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'reward' otherlv_10= ':' ( (lv_reward_11_0= ruleReward ) ) otherlv_12= ',' otherlv_13= 'achievements' otherlv_14= ':' otherlv_15= '[' ( (lv_achievements_16_0= ruleAchievement ) ) (otherlv_17= ',' ( (lv_achievements_18_0= ruleAchievement ) ) )* otherlv_19= ']' otherlv_20= '}' )
            {
            // InternalGame.g:343:2: (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'reward' otherlv_10= ':' ( (lv_reward_11_0= ruleReward ) ) otherlv_12= ',' otherlv_13= 'achievements' otherlv_14= ':' otherlv_15= '[' ( (lv_achievements_16_0= ruleAchievement ) ) (otherlv_17= ',' ( (lv_achievements_18_0= ruleAchievement ) ) )* otherlv_19= ']' otherlv_20= '}' )
            // InternalGame.g:344:3: otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'reward' otherlv_10= ':' ( (lv_reward_11_0= ruleReward ) ) otherlv_12= ',' otherlv_13= 'achievements' otherlv_14= ':' otherlv_15= '[' ( (lv_achievements_16_0= ruleAchievement ) ) (otherlv_17= ',' ( (lv_achievements_18_0= ruleAchievement ) ) )* otherlv_19= ']' otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getColonKeyword_2());
            		
            // InternalGame.g:356:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalGame.g:357:4: (lv_name_3_0= RULE_ID )
            {
            // InternalGame.g:357:4: (lv_name_3_0= RULE_ID )
            // InternalGame.g:358:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_3_0, grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getDescriptionKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getColonKeyword_6());
            		
            // InternalGame.g:386:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalGame.g:387:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalGame.g:387:4: (lv_description_7_0= RULE_STRING )
            // InternalGame.g:388:5: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_description_7_0, grammarAccess.getGroupAccess().getDescriptionSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getGroupAccess().getRewardKeyword_9());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getGroupAccess().getColonKeyword_10());
            		
            // InternalGame.g:416:3: ( (lv_reward_11_0= ruleReward ) )
            // InternalGame.g:417:4: (lv_reward_11_0= ruleReward )
            {
            // InternalGame.g:417:4: (lv_reward_11_0= ruleReward )
            // InternalGame.g:418:5: lv_reward_11_0= ruleReward
            {

            					newCompositeNode(grammarAccess.getGroupAccess().getRewardRewardParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_reward_11_0=ruleReward();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupRule());
            					}
            					set(
            						current,
            						"reward",
            						lv_reward_11_0,
            						"codeskills.designer.game.Game.Reward");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_12, grammarAccess.getGroupAccess().getCommaKeyword_12());
            		
            otherlv_13=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getGroupAccess().getAchievementsKeyword_13());
            		
            otherlv_14=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getGroupAccess().getColonKeyword_14());
            		
            otherlv_15=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_15, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_15());
            		
            // InternalGame.g:451:3: ( (lv_achievements_16_0= ruleAchievement ) )
            // InternalGame.g:452:4: (lv_achievements_16_0= ruleAchievement )
            {
            // InternalGame.g:452:4: (lv_achievements_16_0= ruleAchievement )
            // InternalGame.g:453:5: lv_achievements_16_0= ruleAchievement
            {

            					newCompositeNode(grammarAccess.getGroupAccess().getAchievementsAchievementParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_7);
            lv_achievements_16_0=ruleAchievement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupRule());
            					}
            					add(
            						current,
            						"achievements",
            						lv_achievements_16_0,
            						"codeskills.designer.game.Game.Achievement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:470:3: (otherlv_17= ',' ( (lv_achievements_18_0= ruleAchievement ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGame.g:471:4: otherlv_17= ',' ( (lv_achievements_18_0= ruleAchievement ) )
            	    {
            	    otherlv_17=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_17, grammarAccess.getGroupAccess().getCommaKeyword_17_0());
            	    			
            	    // InternalGame.g:475:4: ( (lv_achievements_18_0= ruleAchievement ) )
            	    // InternalGame.g:476:5: (lv_achievements_18_0= ruleAchievement )
            	    {
            	    // InternalGame.g:476:5: (lv_achievements_18_0= ruleAchievement )
            	    // InternalGame.g:477:6: lv_achievements_18_0= ruleAchievement
            	    {

            	    						newCompositeNode(grammarAccess.getGroupAccess().getAchievementsAchievementParserRuleCall_17_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_achievements_18_0=ruleAchievement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupRule());
            	    						}
            	    						add(
            	    							current,
            	    							"achievements",
            	    							lv_achievements_18_0,
            	    							"codeskills.designer.game.Game.Achievement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_19=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_19, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_18());
            		
            otherlv_20=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_19());
            		

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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleAchievement"
    // InternalGame.g:507:1: entryRuleAchievement returns [EObject current=null] : iv_ruleAchievement= ruleAchievement EOF ;
    public final EObject entryRuleAchievement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAchievement = null;


        try {
            // InternalGame.g:507:52: (iv_ruleAchievement= ruleAchievement EOF )
            // InternalGame.g:508:2: iv_ruleAchievement= ruleAchievement EOF
            {
             newCompositeNode(grammarAccess.getAchievementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAchievement=ruleAchievement();

            state._fsp--;

             current =iv_ruleAchievement; 
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
    // $ANTLR end "entryRuleAchievement"


    // $ANTLR start "ruleAchievement"
    // InternalGame.g:514:1: ruleAchievement returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'reward' otherlv_10= ':' ( (lv_reward_11_0= ruleReward ) ) otherlv_12= ',' otherlv_13= 'tasks' otherlv_14= ':' otherlv_15= '[' ( (lv_tasks_16_0= ruleTask ) ) (otherlv_17= ',' ( (lv_tasks_18_0= ruleTask ) ) )* otherlv_19= ']' otherlv_20= '}' ) ;
    public final EObject ruleAchievement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_reward_11_0 = null;

        EObject lv_tasks_16_0 = null;

        EObject lv_tasks_18_0 = null;



        	enterRule();

        try {
            // InternalGame.g:520:2: ( (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'reward' otherlv_10= ':' ( (lv_reward_11_0= ruleReward ) ) otherlv_12= ',' otherlv_13= 'tasks' otherlv_14= ':' otherlv_15= '[' ( (lv_tasks_16_0= ruleTask ) ) (otherlv_17= ',' ( (lv_tasks_18_0= ruleTask ) ) )* otherlv_19= ']' otherlv_20= '}' ) )
            // InternalGame.g:521:2: (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'reward' otherlv_10= ':' ( (lv_reward_11_0= ruleReward ) ) otherlv_12= ',' otherlv_13= 'tasks' otherlv_14= ':' otherlv_15= '[' ( (lv_tasks_16_0= ruleTask ) ) (otherlv_17= ',' ( (lv_tasks_18_0= ruleTask ) ) )* otherlv_19= ']' otherlv_20= '}' )
            {
            // InternalGame.g:521:2: (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'reward' otherlv_10= ':' ( (lv_reward_11_0= ruleReward ) ) otherlv_12= ',' otherlv_13= 'tasks' otherlv_14= ':' otherlv_15= '[' ( (lv_tasks_16_0= ruleTask ) ) (otherlv_17= ',' ( (lv_tasks_18_0= ruleTask ) ) )* otherlv_19= ']' otherlv_20= '}' )
            // InternalGame.g:522:3: otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'reward' otherlv_10= ':' ( (lv_reward_11_0= ruleReward ) ) otherlv_12= ',' otherlv_13= 'tasks' otherlv_14= ':' otherlv_15= '[' ( (lv_tasks_16_0= ruleTask ) ) (otherlv_17= ',' ( (lv_tasks_18_0= ruleTask ) ) )* otherlv_19= ']' otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAchievementAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAchievementAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAchievementAccess().getColonKeyword_2());
            		
            // InternalGame.g:534:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalGame.g:535:4: (lv_name_3_0= RULE_ID )
            {
            // InternalGame.g:535:4: (lv_name_3_0= RULE_ID )
            // InternalGame.g:536:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_3_0, grammarAccess.getAchievementAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAchievementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getAchievementAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getAchievementAccess().getDescriptionKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getAchievementAccess().getColonKeyword_6());
            		
            // InternalGame.g:564:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalGame.g:565:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalGame.g:565:4: (lv_description_7_0= RULE_STRING )
            // InternalGame.g:566:5: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_description_7_0, grammarAccess.getAchievementAccess().getDescriptionSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAchievementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getAchievementAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getAchievementAccess().getRewardKeyword_9());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getAchievementAccess().getColonKeyword_10());
            		
            // InternalGame.g:594:3: ( (lv_reward_11_0= ruleReward ) )
            // InternalGame.g:595:4: (lv_reward_11_0= ruleReward )
            {
            // InternalGame.g:595:4: (lv_reward_11_0= ruleReward )
            // InternalGame.g:596:5: lv_reward_11_0= ruleReward
            {

            					newCompositeNode(grammarAccess.getAchievementAccess().getRewardRewardParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_reward_11_0=ruleReward();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAchievementRule());
            					}
            					set(
            						current,
            						"reward",
            						lv_reward_11_0,
            						"codeskills.designer.game.Game.Reward");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_12, grammarAccess.getAchievementAccess().getCommaKeyword_12());
            		
            otherlv_13=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getAchievementAccess().getTasksKeyword_13());
            		
            otherlv_14=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getAchievementAccess().getColonKeyword_14());
            		
            otherlv_15=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_15, grammarAccess.getAchievementAccess().getLeftSquareBracketKeyword_15());
            		
            // InternalGame.g:629:3: ( (lv_tasks_16_0= ruleTask ) )
            // InternalGame.g:630:4: (lv_tasks_16_0= ruleTask )
            {
            // InternalGame.g:630:4: (lv_tasks_16_0= ruleTask )
            // InternalGame.g:631:5: lv_tasks_16_0= ruleTask
            {

            					newCompositeNode(grammarAccess.getAchievementAccess().getTasksTaskParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_7);
            lv_tasks_16_0=ruleTask();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAchievementRule());
            					}
            					add(
            						current,
            						"tasks",
            						lv_tasks_16_0,
            						"codeskills.designer.game.Game.Task");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:648:3: (otherlv_17= ',' ( (lv_tasks_18_0= ruleTask ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:649:4: otherlv_17= ',' ( (lv_tasks_18_0= ruleTask ) )
            	    {
            	    otherlv_17=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_17, grammarAccess.getAchievementAccess().getCommaKeyword_17_0());
            	    			
            	    // InternalGame.g:653:4: ( (lv_tasks_18_0= ruleTask ) )
            	    // InternalGame.g:654:5: (lv_tasks_18_0= ruleTask )
            	    {
            	    // InternalGame.g:654:5: (lv_tasks_18_0= ruleTask )
            	    // InternalGame.g:655:6: lv_tasks_18_0= ruleTask
            	    {

            	    						newCompositeNode(grammarAccess.getAchievementAccess().getTasksTaskParserRuleCall_17_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_tasks_18_0=ruleTask();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAchievementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tasks",
            	    							lv_tasks_18_0,
            	    							"codeskills.designer.game.Game.Task");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_19=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_19, grammarAccess.getAchievementAccess().getRightSquareBracketKeyword_18());
            		
            otherlv_20=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getAchievementAccess().getRightCurlyBracketKeyword_19());
            		

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
    // $ANTLR end "ruleAchievement"


    // $ANTLR start "entryRuleReward"
    // InternalGame.g:685:1: entryRuleReward returns [EObject current=null] : iv_ruleReward= ruleReward EOF ;
    public final EObject entryRuleReward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReward = null;


        try {
            // InternalGame.g:685:47: (iv_ruleReward= ruleReward EOF )
            // InternalGame.g:686:2: iv_ruleReward= ruleReward EOF
            {
             newCompositeNode(grammarAccess.getRewardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReward=ruleReward();

            state._fsp--;

             current =iv_ruleReward; 
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
    // $ANTLR end "entryRuleReward"


    // $ANTLR start "ruleReward"
    // InternalGame.g:692:1: ruleReward returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'points' otherlv_2= ':' ( (lv_points_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'badgePath' otherlv_6= ':' ( (lv_badgePath_7_0= RULE_STRING ) ) (otherlv_8= ',' otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotification ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleReward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_points_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_badgePath_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_notification_11_0 = null;



        	enterRule();

        try {
            // InternalGame.g:698:2: ( (otherlv_0= '{' otherlv_1= 'points' otherlv_2= ':' ( (lv_points_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'badgePath' otherlv_6= ':' ( (lv_badgePath_7_0= RULE_STRING ) ) (otherlv_8= ',' otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotification ) ) )? otherlv_12= '}' ) )
            // InternalGame.g:699:2: (otherlv_0= '{' otherlv_1= 'points' otherlv_2= ':' ( (lv_points_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'badgePath' otherlv_6= ':' ( (lv_badgePath_7_0= RULE_STRING ) ) (otherlv_8= ',' otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotification ) ) )? otherlv_12= '}' )
            {
            // InternalGame.g:699:2: (otherlv_0= '{' otherlv_1= 'points' otherlv_2= ':' ( (lv_points_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'badgePath' otherlv_6= ':' ( (lv_badgePath_7_0= RULE_STRING ) ) (otherlv_8= ',' otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotification ) ) )? otherlv_12= '}' )
            // InternalGame.g:700:3: otherlv_0= '{' otherlv_1= 'points' otherlv_2= ':' ( (lv_points_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'badgePath' otherlv_6= ':' ( (lv_badgePath_7_0= RULE_STRING ) ) (otherlv_8= ',' otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotification ) ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getRewardAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRewardAccess().getPointsKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getRewardAccess().getColonKeyword_2());
            		
            // InternalGame.g:712:3: ( (lv_points_3_0= RULE_INT ) )
            // InternalGame.g:713:4: (lv_points_3_0= RULE_INT )
            {
            // InternalGame.g:713:4: (lv_points_3_0= RULE_INT )
            // InternalGame.g:714:5: lv_points_3_0= RULE_INT
            {
            lv_points_3_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_points_3_0, grammarAccess.getRewardAccess().getPointsINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRewardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"points",
            						lv_points_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getRewardAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getRewardAccess().getBadgePathKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getRewardAccess().getColonKeyword_6());
            		
            // InternalGame.g:742:3: ( (lv_badgePath_7_0= RULE_STRING ) )
            // InternalGame.g:743:4: (lv_badgePath_7_0= RULE_STRING )
            {
            // InternalGame.g:743:4: (lv_badgePath_7_0= RULE_STRING )
            // InternalGame.g:744:5: lv_badgePath_7_0= RULE_STRING
            {
            lv_badgePath_7_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_badgePath_7_0, grammarAccess.getRewardAccess().getBadgePathSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRewardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"badgePath",
            						lv_badgePath_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGame.g:760:3: (otherlv_8= ',' otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotification ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGame.g:761:4: otherlv_8= ',' otherlv_9= 'notification' otherlv_10= ':' ( (lv_notification_11_0= ruleNotification ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getRewardAccess().getCommaKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getRewardAccess().getNotificationKeyword_8_1());
                    			
                    otherlv_10=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getRewardAccess().getColonKeyword_8_2());
                    			
                    // InternalGame.g:773:4: ( (lv_notification_11_0= ruleNotification ) )
                    // InternalGame.g:774:5: (lv_notification_11_0= ruleNotification )
                    {
                    // InternalGame.g:774:5: (lv_notification_11_0= ruleNotification )
                    // InternalGame.g:775:6: lv_notification_11_0= ruleNotification
                    {

                    						newCompositeNode(grammarAccess.getRewardAccess().getNotificationNotificationParserRuleCall_8_3_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_notification_11_0=ruleNotification();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRewardRule());
                    						}
                    						set(
                    							current,
                    							"notification",
                    							lv_notification_11_0,
                    							"codeskills.designer.game.Game.Notification");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getRewardAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleReward"


    // $ANTLR start "entryRuleNotification"
    // InternalGame.g:801:1: entryRuleNotification returns [EObject current=null] : iv_ruleNotification= ruleNotification EOF ;
    public final EObject entryRuleNotification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotification = null;


        try {
            // InternalGame.g:801:53: (iv_ruleNotification= ruleNotification EOF )
            // InternalGame.g:802:2: iv_ruleNotification= ruleNotification EOF
            {
             newCompositeNode(grammarAccess.getNotificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotification=ruleNotification();

            state._fsp--;

             current =iv_ruleNotification; 
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
    // $ANTLR end "entryRuleNotification"


    // $ANTLR start "ruleNotification"
    // InternalGame.g:808:1: ruleNotification returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'message' otherlv_2= ':' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'iconPath' otherlv_6= ':' ( (lv_iconPath_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'soundPath' otherlv_10= ':' ( (lv_soundPath_11_0= RULE_STRING ) ) otherlv_12= '}' ) ;
    public final EObject ruleNotification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_message_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_iconPath_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_soundPath_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalGame.g:814:2: ( (otherlv_0= '{' otherlv_1= 'message' otherlv_2= ':' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'iconPath' otherlv_6= ':' ( (lv_iconPath_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'soundPath' otherlv_10= ':' ( (lv_soundPath_11_0= RULE_STRING ) ) otherlv_12= '}' ) )
            // InternalGame.g:815:2: (otherlv_0= '{' otherlv_1= 'message' otherlv_2= ':' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'iconPath' otherlv_6= ':' ( (lv_iconPath_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'soundPath' otherlv_10= ':' ( (lv_soundPath_11_0= RULE_STRING ) ) otherlv_12= '}' )
            {
            // InternalGame.g:815:2: (otherlv_0= '{' otherlv_1= 'message' otherlv_2= ':' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'iconPath' otherlv_6= ':' ( (lv_iconPath_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'soundPath' otherlv_10= ':' ( (lv_soundPath_11_0= RULE_STRING ) ) otherlv_12= '}' )
            // InternalGame.g:816:3: otherlv_0= '{' otherlv_1= 'message' otherlv_2= ':' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'iconPath' otherlv_6= ':' ( (lv_iconPath_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'soundPath' otherlv_10= ':' ( (lv_soundPath_11_0= RULE_STRING ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getNotificationAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNotificationAccess().getMessageKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getNotificationAccess().getColonKeyword_2());
            		
            // InternalGame.g:828:3: ( (lv_message_3_0= RULE_STRING ) )
            // InternalGame.g:829:4: (lv_message_3_0= RULE_STRING )
            {
            // InternalGame.g:829:4: (lv_message_3_0= RULE_STRING )
            // InternalGame.g:830:5: lv_message_3_0= RULE_STRING
            {
            lv_message_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_message_3_0, grammarAccess.getNotificationAccess().getMessageSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNotificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"message",
            						lv_message_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getNotificationAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getNotificationAccess().getIconPathKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getNotificationAccess().getColonKeyword_6());
            		
            // InternalGame.g:858:3: ( (lv_iconPath_7_0= RULE_STRING ) )
            // InternalGame.g:859:4: (lv_iconPath_7_0= RULE_STRING )
            {
            // InternalGame.g:859:4: (lv_iconPath_7_0= RULE_STRING )
            // InternalGame.g:860:5: lv_iconPath_7_0= RULE_STRING
            {
            lv_iconPath_7_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_iconPath_7_0, grammarAccess.getNotificationAccess().getIconPathSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNotificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"iconPath",
            						lv_iconPath_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_25); 

            			newLeafNode(otherlv_8, grammarAccess.getNotificationAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getNotificationAccess().getSoundPathKeyword_9());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getNotificationAccess().getColonKeyword_10());
            		
            // InternalGame.g:888:3: ( (lv_soundPath_11_0= RULE_STRING ) )
            // InternalGame.g:889:4: (lv_soundPath_11_0= RULE_STRING )
            {
            // InternalGame.g:889:4: (lv_soundPath_11_0= RULE_STRING )
            // InternalGame.g:890:5: lv_soundPath_11_0= RULE_STRING
            {
            lv_soundPath_11_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_soundPath_11_0, grammarAccess.getNotificationAccess().getSoundPathSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNotificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"soundPath",
            						lv_soundPath_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getNotificationAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleNotification"


    // $ANTLR start "entryRuleTask"
    // InternalGame.g:914:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalGame.g:914:45: (iv_ruleTask= ruleTask EOF )
            // InternalGame.g:915:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalGame.g:921:1: ruleTask returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'description' otherlv_2= ':' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'query' otherlv_6= ':' ( (lv_queryName_7_0= RULE_STRING ) ) otherlv_8= '}' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_queryName_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalGame.g:927:2: ( (otherlv_0= '{' otherlv_1= 'description' otherlv_2= ':' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'query' otherlv_6= ':' ( (lv_queryName_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            // InternalGame.g:928:2: (otherlv_0= '{' otherlv_1= 'description' otherlv_2= ':' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'query' otherlv_6= ':' ( (lv_queryName_7_0= RULE_STRING ) ) otherlv_8= '}' )
            {
            // InternalGame.g:928:2: (otherlv_0= '{' otherlv_1= 'description' otherlv_2= ':' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'query' otherlv_6= ':' ( (lv_queryName_7_0= RULE_STRING ) ) otherlv_8= '}' )
            // InternalGame.g:929:3: otherlv_0= '{' otherlv_1= 'description' otherlv_2= ':' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'query' otherlv_6= ':' ( (lv_queryName_7_0= RULE_STRING ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskAccess().getDescriptionKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getColonKeyword_2());
            		
            // InternalGame.g:941:3: ( (lv_description_3_0= RULE_STRING ) )
            // InternalGame.g:942:4: (lv_description_3_0= RULE_STRING )
            {
            // InternalGame.g:942:4: (lv_description_3_0= RULE_STRING )
            // InternalGame.g:943:5: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_description_3_0, grammarAccess.getTaskAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getQueryKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getColonKeyword_6());
            		
            // InternalGame.g:971:3: ( (lv_queryName_7_0= RULE_STRING ) )
            // InternalGame.g:972:4: (lv_queryName_7_0= RULE_STRING )
            {
            // InternalGame.g:972:4: (lv_queryName_7_0= RULE_STRING )
            // InternalGame.g:973:5: lv_queryName_7_0= RULE_STRING
            {
            lv_queryName_7_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_queryName_7_0, grammarAccess.getTaskAccess().getQueryNameSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"queryName",
            						lv_queryName_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleTask"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});

}