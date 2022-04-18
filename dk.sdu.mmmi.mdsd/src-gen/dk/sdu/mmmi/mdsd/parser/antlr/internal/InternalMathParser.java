package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'external'", "'('", "','", "')'", "'var'", "'='", "'-'", "'+'", "'/'", "'*'", "'let'", "'in'", "'end'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }



     	private MathGrammarAccess grammarAccess;

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Math";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMath"
    // InternalMath.g:64:1: entryRuleMath returns [EObject current=null] : iv_ruleMath= ruleMath EOF ;
    public final EObject entryRuleMath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMath = null;


        try {
            // InternalMath.g:64:45: (iv_ruleMath= ruleMath EOF )
            // InternalMath.g:65:2: iv_ruleMath= ruleMath EOF
            {
             newCompositeNode(grammarAccess.getMathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMath=ruleMath();

            state._fsp--;

             current =iv_ruleMath; 
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
    // $ANTLR end "entryRuleMath"


    // $ANTLR start "ruleMath"
    // InternalMath.g:71:1: ruleMath returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternal ) )* ( (lv_lines_3_0= ruleMathExp ) )+ ) ;
    public final EObject ruleMath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_externals_2_0 = null;

        EObject lv_lines_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternal ) )* ( (lv_lines_3_0= ruleMathExp ) )+ ) )
            // InternalMath.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternal ) )* ( (lv_lines_3_0= ruleMathExp ) )+ )
            {
            // InternalMath.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternal ) )* ( (lv_lines_3_0= ruleMathExp ) )+ )
            // InternalMath.g:79:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternal ) )* ( (lv_lines_3_0= ruleMathExp ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMathAccess().getProgramKeyword_0());
            		
            // InternalMath.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMathAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMathRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMath.g:101:3: ( (lv_externals_2_0= ruleExternal ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:102:4: (lv_externals_2_0= ruleExternal )
            	    {
            	    // InternalMath.g:102:4: (lv_externals_2_0= ruleExternal )
            	    // InternalMath.g:103:5: lv_externals_2_0= ruleExternal
            	    {

            	    					newCompositeNode(grammarAccess.getMathAccess().getExternalsExternalParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_externals_2_0=ruleExternal();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMathRule());
            	    					}
            	    					add(
            	    						current,
            	    						"externals",
            	    						lv_externals_2_0,
            	    						"dk.sdu.mmmi.mdsd.Math.External");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMath.g:120:3: ( (lv_lines_3_0= ruleMathExp ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMath.g:121:4: (lv_lines_3_0= ruleMathExp )
            	    {
            	    // InternalMath.g:121:4: (lv_lines_3_0= ruleMathExp )
            	    // InternalMath.g:122:5: lv_lines_3_0= ruleMathExp
            	    {

            	    					newCompositeNode(grammarAccess.getMathAccess().getLinesMathExpParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_lines_3_0=ruleMathExp();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMathRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lines",
            	    						lv_lines_3_0,
            	    						"dk.sdu.mmmi.mdsd.Math.MathExp");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


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
    // $ANTLR end "ruleMath"


    // $ANTLR start "entryRuleExternal"
    // InternalMath.g:143:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // InternalMath.g:143:49: (iv_ruleExternal= ruleExternal EOF )
            // InternalMath.g:144:2: iv_ruleExternal= ruleExternal EOF
            {
             newCompositeNode(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternal=ruleExternal();

            state._fsp--;

             current =iv_ruleExternal; 
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
    // $ANTLR end "entryRuleExternal"


    // $ANTLR start "ruleExternal"
    // InternalMath.g:150:1: ruleExternal returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argsType_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_argsType_5_0= RULE_ID ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_argsType_3_0=null;
        Token otherlv_4=null;
        Token lv_argsType_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMath.g:156:2: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argsType_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_argsType_5_0= RULE_ID ) ) )* otherlv_6= ')' ) )
            // InternalMath.g:157:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argsType_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_argsType_5_0= RULE_ID ) ) )* otherlv_6= ')' )
            {
            // InternalMath.g:157:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argsType_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_argsType_5_0= RULE_ID ) ) )* otherlv_6= ')' )
            // InternalMath.g:158:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_argsType_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_argsType_5_0= RULE_ID ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalAccess().getExternalKeyword_0());
            		
            // InternalMath.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMath.g:184:3: ( (lv_argsType_3_0= RULE_ID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMath.g:185:4: (lv_argsType_3_0= RULE_ID )
                    {
                    // InternalMath.g:185:4: (lv_argsType_3_0= RULE_ID )
                    // InternalMath.g:186:5: lv_argsType_3_0= RULE_ID
                    {
                    lv_argsType_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    					newLeafNode(lv_argsType_3_0, grammarAccess.getExternalAccess().getArgsTypeIDTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExternalRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"argsType",
                    						lv_argsType_3_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalMath.g:202:3: (otherlv_4= ',' ( (lv_argsType_5_0= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMath.g:203:4: otherlv_4= ',' ( (lv_argsType_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getExternalAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMath.g:207:4: ( (lv_argsType_5_0= RULE_ID ) )
            	    // InternalMath.g:208:5: (lv_argsType_5_0= RULE_ID )
            	    {
            	    // InternalMath.g:208:5: (lv_argsType_5_0= RULE_ID )
            	    // InternalMath.g:209:6: lv_argsType_5_0= RULE_ID
            	    {
            	    lv_argsType_5_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    						newLeafNode(lv_argsType_5_0, grammarAccess.getExternalAccess().getArgsTypeIDTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExternalRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"argsType",
            	    							lv_argsType_5_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExternalAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleExternal"


    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:234:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMath.g:234:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMath.g:235:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:241:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'var' ( (lv_value_1_0= ruleAssignment ) ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMath.g:247:2: ( (otherlv_0= 'var' ( (lv_value_1_0= ruleAssignment ) ) ) )
            // InternalMath.g:248:2: (otherlv_0= 'var' ( (lv_value_1_0= ruleAssignment ) ) )
            {
            // InternalMath.g:248:2: (otherlv_0= 'var' ( (lv_value_1_0= ruleAssignment ) ) )
            // InternalMath.g:249:3: otherlv_0= 'var' ( (lv_value_1_0= ruleAssignment ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getVarKeyword_0());
            		
            // InternalMath.g:253:3: ( (lv_value_1_0= ruleAssignment ) )
            // InternalMath.g:254:4: (lv_value_1_0= ruleAssignment )
            {
            // InternalMath.g:254:4: (lv_value_1_0= ruleAssignment )
            // InternalMath.g:255:5: lv_value_1_0= ruleAssignment
            {

            					newCompositeNode(grammarAccess.getMathExpAccess().getValueAssignmentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleAssignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathExpRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"dk.sdu.mmmi.mdsd.Math.Assignment");
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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleAssignment"
    // InternalMath.g:276:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalMath.g:276:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalMath.g:277:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMath.g:283:1: ruleAssignment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:289:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ) )
            // InternalMath.g:290:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) )
            {
            // InternalMath.g:290:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) )
            // InternalMath.g:291:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) )
            {
            // InternalMath.g:291:3: ()
            // InternalMath.g:292:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssignmentAccess().getAssignmentAction_0(),
            					current);
            			

            }

            // InternalMath.g:298:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:299:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:299:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:300:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:320:3: ( (lv_exp_3_0= ruleExp ) )
            // InternalMath.g:321:4: (lv_exp_3_0= ruleExp )
            {
            // InternalMath.g:321:4: (lv_exp_3_0= ruleExp )
            // InternalMath.g:322:5: lv_exp_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getExpExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:343:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:343:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:344:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:350:1: ruleExp returns [EObject current=null] : this_SubAddExp_0= ruleSubAddExp ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject this_SubAddExp_0 = null;



        	enterRule();

        try {
            // InternalMath.g:356:2: (this_SubAddExp_0= ruleSubAddExp )
            // InternalMath.g:357:2: this_SubAddExp_0= ruleSubAddExp
            {

            		newCompositeNode(grammarAccess.getExpAccess().getSubAddExpParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_SubAddExp_0=ruleSubAddExp();

            state._fsp--;


            		current = this_SubAddExp_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleSubAddExp"
    // InternalMath.g:368:1: entryRuleSubAddExp returns [EObject current=null] : iv_ruleSubAddExp= ruleSubAddExp EOF ;
    public final EObject entryRuleSubAddExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAddExp = null;


        try {
            // InternalMath.g:368:50: (iv_ruleSubAddExp= ruleSubAddExp EOF )
            // InternalMath.g:369:2: iv_ruleSubAddExp= ruleSubAddExp EOF
            {
             newCompositeNode(grammarAccess.getSubAddExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubAddExp=ruleSubAddExp();

            state._fsp--;

             current =iv_ruleSubAddExp; 
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
    // $ANTLR end "entryRuleSubAddExp"


    // $ANTLR start "ruleSubAddExp"
    // InternalMath.g:375:1: ruleSubAddExp returns [EObject current=null] : (this_DivMultExp_0= ruleDivMultExp ( ( (otherlv_1= '-' () ) | (otherlv_3= '+' () ) ) ( (lv_right_5_0= ruleDivMultExp ) ) )* ) ;
    public final EObject ruleSubAddExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_DivMultExp_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:381:2: ( (this_DivMultExp_0= ruleDivMultExp ( ( (otherlv_1= '-' () ) | (otherlv_3= '+' () ) ) ( (lv_right_5_0= ruleDivMultExp ) ) )* ) )
            // InternalMath.g:382:2: (this_DivMultExp_0= ruleDivMultExp ( ( (otherlv_1= '-' () ) | (otherlv_3= '+' () ) ) ( (lv_right_5_0= ruleDivMultExp ) ) )* )
            {
            // InternalMath.g:382:2: (this_DivMultExp_0= ruleDivMultExp ( ( (otherlv_1= '-' () ) | (otherlv_3= '+' () ) ) ( (lv_right_5_0= ruleDivMultExp ) ) )* )
            // InternalMath.g:383:3: this_DivMultExp_0= ruleDivMultExp ( ( (otherlv_1= '-' () ) | (otherlv_3= '+' () ) ) ( (lv_right_5_0= ruleDivMultExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getSubAddExpAccess().getDivMultExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_DivMultExp_0=ruleDivMultExp();

            state._fsp--;


            			current = this_DivMultExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:391:3: ( ( (otherlv_1= '-' () ) | (otherlv_3= '+' () ) ) ( (lv_right_5_0= ruleDivMultExp ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=18 && LA6_0<=19)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMath.g:392:4: ( (otherlv_1= '-' () ) | (otherlv_3= '+' () ) ) ( (lv_right_5_0= ruleDivMultExp ) )
            	    {
            	    // InternalMath.g:392:4: ( (otherlv_1= '-' () ) | (otherlv_3= '+' () ) )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==18) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==19) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalMath.g:393:5: (otherlv_1= '-' () )
            	            {
            	            // InternalMath.g:393:5: (otherlv_1= '-' () )
            	            // InternalMath.g:394:6: otherlv_1= '-' ()
            	            {
            	            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            	            						newLeafNode(otherlv_1, grammarAccess.getSubAddExpAccess().getHyphenMinusKeyword_1_0_0_0());
            	            					
            	            // InternalMath.g:398:6: ()
            	            // InternalMath.g:399:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSubAddExpAccess().getSubtractionLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:407:5: (otherlv_3= '+' () )
            	            {
            	            // InternalMath.g:407:5: (otherlv_3= '+' () )
            	            // InternalMath.g:408:6: otherlv_3= '+' ()
            	            {
            	            otherlv_3=(Token)match(input,19,FOLLOW_10); 

            	            						newLeafNode(otherlv_3, grammarAccess.getSubAddExpAccess().getPlusSignKeyword_1_0_1_0());
            	            					
            	            // InternalMath.g:412:6: ()
            	            // InternalMath.g:413:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSubAddExpAccess().getAdditionLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:421:4: ( (lv_right_5_0= ruleDivMultExp ) )
            	    // InternalMath.g:422:5: (lv_right_5_0= ruleDivMultExp )
            	    {
            	    // InternalMath.g:422:5: (lv_right_5_0= ruleDivMultExp )
            	    // InternalMath.g:423:6: lv_right_5_0= ruleDivMultExp
            	    {

            	    						newCompositeNode(grammarAccess.getSubAddExpAccess().getRightDivMultExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_right_5_0=ruleDivMultExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubAddExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.DivMultExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "ruleSubAddExp"


    // $ANTLR start "entryRuleDivMultExp"
    // InternalMath.g:445:1: entryRuleDivMultExp returns [EObject current=null] : iv_ruleDivMultExp= ruleDivMultExp EOF ;
    public final EObject entryRuleDivMultExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivMultExp = null;


        try {
            // InternalMath.g:445:51: (iv_ruleDivMultExp= ruleDivMultExp EOF )
            // InternalMath.g:446:2: iv_ruleDivMultExp= ruleDivMultExp EOF
            {
             newCompositeNode(grammarAccess.getDivMultExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivMultExp=ruleDivMultExp();

            state._fsp--;

             current =iv_ruleDivMultExp; 
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
    // $ANTLR end "entryRuleDivMultExp"


    // $ANTLR start "ruleDivMultExp"
    // InternalMath.g:452:1: ruleDivMultExp returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( (otherlv_1= '/' () ) | (otherlv_3= '*' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleDivMultExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:458:2: ( (this_Primary_0= rulePrimary ( ( (otherlv_1= '/' () ) | (otherlv_3= '*' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMath.g:459:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '/' () ) | (otherlv_3= '*' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMath.g:459:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '/' () ) | (otherlv_3= '*' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMath.g:460:3: this_Primary_0= rulePrimary ( ( (otherlv_1= '/' () ) | (otherlv_3= '*' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getDivMultExpAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:468:3: ( ( (otherlv_1= '/' () ) | (otherlv_3= '*' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=20 && LA8_0<=21)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMath.g:469:4: ( (otherlv_1= '/' () ) | (otherlv_3= '*' () ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:469:4: ( (otherlv_1= '/' () ) | (otherlv_3= '*' () ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==20) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==21) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalMath.g:470:5: (otherlv_1= '/' () )
            	            {
            	            // InternalMath.g:470:5: (otherlv_1= '/' () )
            	            // InternalMath.g:471:6: otherlv_1= '/' ()
            	            {
            	            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            	            						newLeafNode(otherlv_1, grammarAccess.getDivMultExpAccess().getSolidusKeyword_1_0_0_0());
            	            					
            	            // InternalMath.g:475:6: ()
            	            // InternalMath.g:476:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getDivMultExpAccess().getDivisionLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:484:5: (otherlv_3= '*' () )
            	            {
            	            // InternalMath.g:484:5: (otherlv_3= '*' () )
            	            // InternalMath.g:485:6: otherlv_3= '*' ()
            	            {
            	            otherlv_3=(Token)match(input,21,FOLLOW_10); 

            	            						newLeafNode(otherlv_3, grammarAccess.getDivMultExpAccess().getAsteriskKeyword_1_0_1_0());
            	            					
            	            // InternalMath.g:489:6: ()
            	            // InternalMath.g:490:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getDivMultExpAccess().getMultiplicationLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:498:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMath.g:499:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMath.g:499:5: (lv_right_5_0= rulePrimary )
            	    // InternalMath.g:500:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getDivMultExpAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDivMultExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "ruleDivMultExp"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:522:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:522:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:523:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:529:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_Let_3= ruleLet | this_ExternalUse_4= ruleExternalUse ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_VariableUse_2 = null;

        EObject this_Let_3 = null;

        EObject this_ExternalUse_4 = null;



        	enterRule();

        try {
            // InternalMath.g:535:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_Let_3= ruleLet | this_ExternalUse_4= ruleExternalUse ) )
            // InternalMath.g:536:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_Let_3= ruleLet | this_ExternalUse_4= ruleExternalUse )
            {
            // InternalMath.g:536:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_Let_3= ruleLet | this_ExternalUse_4= ruleExternalUse )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case 13:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==13) ) {
                    alt9=5;
                }
                else if ( (LA9_3==EOF||(LA9_3>=14 && LA9_3<=16)||(LA9_3>=18 && LA9_3<=21)||(LA9_3>=23 && LA9_3<=24)) ) {
                    alt9=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMath.g:537:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMath.g:546:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMath.g:555:3: this_VariableUse_2= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_2=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMath.g:564:3: this_Let_3= ruleLet
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Let_3=ruleLet();

                    state._fsp--;


                    			current = this_Let_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMath.g:573:3: this_ExternalUse_4= ruleExternalUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getExternalUseParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalUse_4=ruleExternalUse();

                    state._fsp--;


                    			current = this_ExternalUse_4;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMath.g:585:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMath.g:585:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMath.g:586:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMath.g:592:1: ruleParenthesis returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_inner_2_0= ruleExp ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inner_2_0 = null;



        	enterRule();

        try {
            // InternalMath.g:598:2: ( ( () otherlv_1= '(' ( (lv_inner_2_0= ruleExp ) ) otherlv_3= ')' ) )
            // InternalMath.g:599:2: ( () otherlv_1= '(' ( (lv_inner_2_0= ruleExp ) ) otherlv_3= ')' )
            {
            // InternalMath.g:599:2: ( () otherlv_1= '(' ( (lv_inner_2_0= ruleExp ) ) otherlv_3= ')' )
            // InternalMath.g:600:3: () otherlv_1= '(' ( (lv_inner_2_0= ruleExp ) ) otherlv_3= ')'
            {
            // InternalMath.g:600:3: ()
            // InternalMath.g:601:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParenthesisAccess().getParenthesisAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMath.g:611:3: ( (lv_inner_2_0= ruleExp ) )
            // InternalMath.g:612:4: (lv_inner_2_0= ruleExp )
            {
            // InternalMath.g:612:4: (lv_inner_2_0= ruleExp )
            // InternalMath.g:613:5: lv_inner_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getInnerExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_inner_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"inner",
            						lv_inner_2_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleExternalUse"
    // InternalMath.g:638:1: entryRuleExternalUse returns [EObject current=null] : iv_ruleExternalUse= ruleExternalUse EOF ;
    public final EObject entryRuleExternalUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalUse = null;


        try {
            // InternalMath.g:638:52: (iv_ruleExternalUse= ruleExternalUse EOF )
            // InternalMath.g:639:2: iv_ruleExternalUse= ruleExternalUse EOF
            {
             newCompositeNode(grammarAccess.getExternalUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalUse=ruleExternalUse();

            state._fsp--;

             current =iv_ruleExternalUse; 
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
    // $ANTLR end "entryRuleExternalUse"


    // $ANTLR start "ruleExternalUse"
    // InternalMath.g:645:1: ruleExternalUse returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleExp ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleExternalUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:651:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleExp ) ) )* otherlv_6= ')' ) )
            // InternalMath.g:652:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleExp ) ) )* otherlv_6= ')' )
            {
            // InternalMath.g:652:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleExp ) ) )* otherlv_6= ')' )
            // InternalMath.g:653:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleExp ) ) )* otherlv_6= ')'
            {
            // InternalMath.g:653:3: ()
            // InternalMath.g:654:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalUseAccess().getExternalUseAction_0(),
            					current);
            			

            }

            // InternalMath.g:660:3: ( (otherlv_1= RULE_ID ) )
            // InternalMath.g:661:4: (otherlv_1= RULE_ID )
            {
            // InternalMath.g:661:4: (otherlv_1= RULE_ID )
            // InternalMath.g:662:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalUseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_1, grammarAccess.getExternalUseAccess().getRefExternalCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalUseAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMath.g:677:3: ( (lv_parameters_3_0= ruleExp ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||LA10_0==13||LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMath.g:678:4: (lv_parameters_3_0= ruleExp )
                    {
                    // InternalMath.g:678:4: (lv_parameters_3_0= ruleExp )
                    // InternalMath.g:679:5: lv_parameters_3_0= ruleExp
                    {

                    					newCompositeNode(grammarAccess.getExternalUseAccess().getParametersExpParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_parameters_3_0=ruleExp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExternalUseRule());
                    					}
                    					add(
                    						current,
                    						"parameters",
                    						lv_parameters_3_0,
                    						"dk.sdu.mmmi.mdsd.Math.Exp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMath.g:696:3: (otherlv_4= ',' ( (lv_parameters_5_0= ruleExp ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMath.g:697:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleExp ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_10); 

            	    				newLeafNode(otherlv_4, grammarAccess.getExternalUseAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMath.g:701:4: ( (lv_parameters_5_0= ruleExp ) )
            	    // InternalMath.g:702:5: (lv_parameters_5_0= ruleExp )
            	    {
            	    // InternalMath.g:702:5: (lv_parameters_5_0= ruleExp )
            	    // InternalMath.g:703:6: lv_parameters_5_0= ruleExp
            	    {

            	    						newCompositeNode(grammarAccess.getExternalUseAccess().getParametersExpParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_parameters_5_0=ruleExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExternalUseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Exp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExternalUseAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleExternalUse"


    // $ANTLR start "entryRuleNumber"
    // InternalMath.g:729:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalMath.g:729:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalMath.g:730:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMath.g:736:1: ruleNumber returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMath.g:742:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalMath.g:743:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalMath.g:743:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalMath.g:744:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalMath.g:744:3: ()
            // InternalMath.g:745:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumberAction_0(),
            					current);
            			

            }

            // InternalMath.g:751:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalMath.g:752:4: (lv_value_1_0= RULE_INT )
            {
            // InternalMath.g:752:4: (lv_value_1_0= RULE_INT )
            // InternalMath.g:753:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:773:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:773:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:774:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:780:1: ruleVariableUse returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMath.g:786:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMath.g:787:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMath.g:787:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalMath.g:788:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalMath.g:788:3: ()
            // InternalMath.g:789:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableUseAccess().getVarUseAction_0(),
            					current);
            			

            }

            // InternalMath.g:795:3: ( (otherlv_1= RULE_ID ) )
            // InternalMath.g:796:4: (otherlv_1= RULE_ID )
            {
            // InternalMath.g:796:4: (otherlv_1= RULE_ID )
            // InternalMath.g:797:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableUseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getVariableUseAccess().getRefAssignmentCrossReference_1_0());
            				

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
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "entryRuleLet"
    // InternalMath.g:812:1: entryRuleLet returns [EObject current=null] : iv_ruleLet= ruleLet EOF ;
    public final EObject entryRuleLet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLet = null;


        try {
            // InternalMath.g:812:44: (iv_ruleLet= ruleLet EOF )
            // InternalMath.g:813:2: iv_ruleLet= ruleLet EOF
            {
             newCompositeNode(grammarAccess.getLetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLet=ruleLet();

            state._fsp--;

             current =iv_ruleLet; 
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
    // $ANTLR end "entryRuleLet"


    // $ANTLR start "ruleLet"
    // InternalMath.g:819:1: ruleLet returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_value_2_0= ruleAssignment ) ) otherlv_3= 'in' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= 'end' ) ;
    public final EObject ruleLet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalMath.g:825:2: ( ( () otherlv_1= 'let' ( (lv_value_2_0= ruleAssignment ) ) otherlv_3= 'in' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= 'end' ) )
            // InternalMath.g:826:2: ( () otherlv_1= 'let' ( (lv_value_2_0= ruleAssignment ) ) otherlv_3= 'in' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= 'end' )
            {
            // InternalMath.g:826:2: ( () otherlv_1= 'let' ( (lv_value_2_0= ruleAssignment ) ) otherlv_3= 'in' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= 'end' )
            // InternalMath.g:827:3: () otherlv_1= 'let' ( (lv_value_2_0= ruleAssignment ) ) otherlv_3= 'in' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= 'end'
            {
            // InternalMath.g:827:3: ()
            // InternalMath.g:828:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLetAccess().getLetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLetAccess().getLetKeyword_1());
            		
            // InternalMath.g:838:3: ( (lv_value_2_0= ruleAssignment ) )
            // InternalMath.g:839:4: (lv_value_2_0= ruleAssignment )
            {
            // InternalMath.g:839:4: (lv_value_2_0= ruleAssignment )
            // InternalMath.g:840:5: lv_value_2_0= ruleAssignment
            {

            					newCompositeNode(grammarAccess.getLetAccess().getValueAssignmentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_value_2_0=ruleAssignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"dk.sdu.mmmi.mdsd.Math.Assignment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getLetAccess().getInKeyword_3());
            		
            // InternalMath.g:861:3: ( (lv_exp_4_0= ruleExp ) )
            // InternalMath.g:862:4: (lv_exp_4_0= ruleExp )
            {
            // InternalMath.g:862:4: (lv_exp_4_0= ruleExp )
            // InternalMath.g:863:5: lv_exp_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetAccess().getExpExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_exp_4_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_4_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLetAccess().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleLet"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000402030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000040E030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});

}