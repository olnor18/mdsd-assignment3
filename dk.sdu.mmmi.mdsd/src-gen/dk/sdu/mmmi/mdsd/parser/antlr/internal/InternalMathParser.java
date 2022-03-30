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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='", "'-'", "'+'", "'/'", "'*'", "'('", "')'", "'let'", "'in'", "'end'"
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
    public static final int RULE_ML_COMMENT=7;
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
    // InternalMath.g:71:1: ruleMath returns [EObject current=null] : ( (lv_lines_0_0= ruleMathExp ) )+ ;
    public final EObject ruleMath() throws RecognitionException {
        EObject current = null;

        EObject lv_lines_0_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( ( (lv_lines_0_0= ruleMathExp ) )+ )
            // InternalMath.g:78:2: ( (lv_lines_0_0= ruleMathExp ) )+
            {
            // InternalMath.g:78:2: ( (lv_lines_0_0= ruleMathExp ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:79:3: (lv_lines_0_0= ruleMathExp )
            	    {
            	    // InternalMath.g:79:3: (lv_lines_0_0= ruleMathExp )
            	    // InternalMath.g:80:4: lv_lines_0_0= ruleMathExp
            	    {

            	    				newCompositeNode(grammarAccess.getMathAccess().getLinesMathExpParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_lines_0_0=ruleMathExp();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMathRule());
            	    				}
            	    				add(
            	    					current,
            	    					"lines",
            	    					lv_lines_0_0,
            	    					"dk.sdu.mmmi.mdsd.Math.MathExp");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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


    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:100:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMath.g:100:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMath.g:101:2: iv_ruleMathExp= ruleMathExp EOF
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
    // InternalMath.g:107:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'var' ( (lv_value_1_0= ruleAssignment ) ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMath.g:113:2: ( (otherlv_0= 'var' ( (lv_value_1_0= ruleAssignment ) ) ) )
            // InternalMath.g:114:2: (otherlv_0= 'var' ( (lv_value_1_0= ruleAssignment ) ) )
            {
            // InternalMath.g:114:2: (otherlv_0= 'var' ( (lv_value_1_0= ruleAssignment ) ) )
            // InternalMath.g:115:3: otherlv_0= 'var' ( (lv_value_1_0= ruleAssignment ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getVarKeyword_0());
            		
            // InternalMath.g:119:3: ( (lv_value_1_0= ruleAssignment ) )
            // InternalMath.g:120:4: (lv_value_1_0= ruleAssignment )
            {
            // InternalMath.g:120:4: (lv_value_1_0= ruleAssignment )
            // InternalMath.g:121:5: lv_value_1_0= ruleAssignment
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
    // InternalMath.g:142:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalMath.g:142:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalMath.g:143:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalMath.g:149:1: ruleAssignment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:155:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ) )
            // InternalMath.g:156:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) )
            {
            // InternalMath.g:156:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) )
            // InternalMath.g:157:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) )
            {
            // InternalMath.g:157:3: ()
            // InternalMath.g:158:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssignmentAccess().getAssignmentAction_0(),
            					current);
            			

            }

            // InternalMath.g:164:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:165:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:165:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:166:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:186:3: ( (lv_exp_3_0= ruleExp ) )
            // InternalMath.g:187:4: (lv_exp_3_0= ruleExp )
            {
            // InternalMath.g:187:4: (lv_exp_3_0= ruleExp )
            // InternalMath.g:188:5: lv_exp_3_0= ruleExp
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
    // InternalMath.g:209:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:209:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:210:2: iv_ruleExp= ruleExp EOF
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
    // InternalMath.g:216:1: ruleExp returns [EObject current=null] : this_SubAddExp_0= ruleSubAddExp ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject this_SubAddExp_0 = null;



        	enterRule();

        try {
            // InternalMath.g:222:2: (this_SubAddExp_0= ruleSubAddExp )
            // InternalMath.g:223:2: this_SubAddExp_0= ruleSubAddExp
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
    // InternalMath.g:234:1: entryRuleSubAddExp returns [EObject current=null] : iv_ruleSubAddExp= ruleSubAddExp EOF ;
    public final EObject entryRuleSubAddExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAddExp = null;


        try {
            // InternalMath.g:234:50: (iv_ruleSubAddExp= ruleSubAddExp EOF )
            // InternalMath.g:235:2: iv_ruleSubAddExp= ruleSubAddExp EOF
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
    // InternalMath.g:241:1: ruleSubAddExp returns [EObject current=null] : (this_DivMultExp_0= ruleDivMultExp ( ( (otherlv_1= '-' () ) | (otherlv_3= '+' () ) ) ( (lv_right_5_0= ruleDivMultExp ) ) )* ) ;
    public final EObject ruleSubAddExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_DivMultExp_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:247:2: ( (this_DivMultExp_0= ruleDivMultExp ( ( (otherlv_1= '-' () ) | (otherlv_3= '+' () ) ) ( (lv_right_5_0= ruleDivMultExp ) ) )* ) )
            // InternalMath.g:248:2: (this_DivMultExp_0= ruleDivMultExp ( ( (otherlv_1= '-' () ) | (otherlv_3= '+' () ) ) ( (lv_right_5_0= ruleDivMultExp ) ) )* )
            {
            // InternalMath.g:248:2: (this_DivMultExp_0= ruleDivMultExp ( ( (otherlv_1= '-' () ) | (otherlv_3= '+' () ) ) ( (lv_right_5_0= ruleDivMultExp ) ) )* )
            // InternalMath.g:249:3: this_DivMultExp_0= ruleDivMultExp ( ( (otherlv_1= '-' () ) | (otherlv_3= '+' () ) ) ( (lv_right_5_0= ruleDivMultExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getSubAddExpAccess().getDivMultExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_DivMultExp_0=ruleDivMultExp();

            state._fsp--;


            			current = this_DivMultExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:257:3: ( ( (otherlv_1= '-' () ) | (otherlv_3= '+' () ) ) ( (lv_right_5_0= ruleDivMultExp ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=13 && LA3_0<=14)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMath.g:258:4: ( (otherlv_1= '-' () ) | (otherlv_3= '+' () ) ) ( (lv_right_5_0= ruleDivMultExp ) )
            	    {
            	    // InternalMath.g:258:4: ( (otherlv_1= '-' () ) | (otherlv_3= '+' () ) )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==13) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==14) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalMath.g:259:5: (otherlv_1= '-' () )
            	            {
            	            // InternalMath.g:259:5: (otherlv_1= '-' () )
            	            // InternalMath.g:260:6: otherlv_1= '-' ()
            	            {
            	            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            	            						newLeafNode(otherlv_1, grammarAccess.getSubAddExpAccess().getHyphenMinusKeyword_1_0_0_0());
            	            					
            	            // InternalMath.g:264:6: ()
            	            // InternalMath.g:265:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSubAddExpAccess().getSubtractionLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:273:5: (otherlv_3= '+' () )
            	            {
            	            // InternalMath.g:273:5: (otherlv_3= '+' () )
            	            // InternalMath.g:274:6: otherlv_3= '+' ()
            	            {
            	            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            	            						newLeafNode(otherlv_3, grammarAccess.getSubAddExpAccess().getPlusSignKeyword_1_0_1_0());
            	            					
            	            // InternalMath.g:278:6: ()
            	            // InternalMath.g:279:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSubAddExpAccess().getAdditionLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:287:4: ( (lv_right_5_0= ruleDivMultExp ) )
            	    // InternalMath.g:288:5: (lv_right_5_0= ruleDivMultExp )
            	    {
            	    // InternalMath.g:288:5: (lv_right_5_0= ruleDivMultExp )
            	    // InternalMath.g:289:6: lv_right_5_0= ruleDivMultExp
            	    {

            	    						newCompositeNode(grammarAccess.getSubAddExpAccess().getRightDivMultExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
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
            	    break loop3;
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
    // InternalMath.g:311:1: entryRuleDivMultExp returns [EObject current=null] : iv_ruleDivMultExp= ruleDivMultExp EOF ;
    public final EObject entryRuleDivMultExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivMultExp = null;


        try {
            // InternalMath.g:311:51: (iv_ruleDivMultExp= ruleDivMultExp EOF )
            // InternalMath.g:312:2: iv_ruleDivMultExp= ruleDivMultExp EOF
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
    // InternalMath.g:318:1: ruleDivMultExp returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( (otherlv_1= '/' () ) | (otherlv_3= '*' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleDivMultExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:324:2: ( (this_Primary_0= rulePrimary ( ( (otherlv_1= '/' () ) | (otherlv_3= '*' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMath.g:325:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '/' () ) | (otherlv_3= '*' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMath.g:325:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '/' () ) | (otherlv_3= '*' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMath.g:326:3: this_Primary_0= rulePrimary ( ( (otherlv_1= '/' () ) | (otherlv_3= '*' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getDivMultExpAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:334:3: ( ( (otherlv_1= '/' () ) | (otherlv_3= '*' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=15 && LA5_0<=16)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMath.g:335:4: ( (otherlv_1= '/' () ) | (otherlv_3= '*' () ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:335:4: ( (otherlv_1= '/' () ) | (otherlv_3= '*' () ) )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==15) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==16) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalMath.g:336:5: (otherlv_1= '/' () )
            	            {
            	            // InternalMath.g:336:5: (otherlv_1= '/' () )
            	            // InternalMath.g:337:6: otherlv_1= '/' ()
            	            {
            	            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            	            						newLeafNode(otherlv_1, grammarAccess.getDivMultExpAccess().getSolidusKeyword_1_0_0_0());
            	            					
            	            // InternalMath.g:341:6: ()
            	            // InternalMath.g:342:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getDivMultExpAccess().getDivisionLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:350:5: (otherlv_3= '*' () )
            	            {
            	            // InternalMath.g:350:5: (otherlv_3= '*' () )
            	            // InternalMath.g:351:6: otherlv_3= '*' ()
            	            {
            	            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            	            						newLeafNode(otherlv_3, grammarAccess.getDivMultExpAccess().getAsteriskKeyword_1_0_1_0());
            	            					
            	            // InternalMath.g:355:6: ()
            	            // InternalMath.g:356:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getDivMultExpAccess().getMultiplicationLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:364:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMath.g:365:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMath.g:365:5: (lv_right_5_0= rulePrimary )
            	    // InternalMath.g:366:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getDivMultExpAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
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
            	    break loop5;
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
    // InternalMath.g:388:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:388:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:389:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalMath.g:395:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_Let_3= ruleLet ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_VariableUse_2 = null;

        EObject this_Let_3 = null;



        	enterRule();

        try {
            // InternalMath.g:401:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_Let_3= ruleLet ) )
            // InternalMath.g:402:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_Let_3= ruleLet )
            {
            // InternalMath.g:402:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_Let_3= ruleLet )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMath.g:403:3: this_Number_0= ruleNumber
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
                    // InternalMath.g:412:3: this_Parenthesis_1= ruleParenthesis
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
                    // InternalMath.g:421:3: this_VariableUse_2= ruleVariableUse
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
                    // InternalMath.g:430:3: this_Let_3= ruleLet
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Let_3=ruleLet();

                    state._fsp--;


                    			current = this_Let_3;
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
    // InternalMath.g:442:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMath.g:442:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMath.g:443:2: iv_ruleParenthesis= ruleParenthesis EOF
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
    // InternalMath.g:449:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Exp_1 = null;



        	enterRule();

        try {
            // InternalMath.g:455:2: ( (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) )
            // InternalMath.g:456:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            {
            // InternalMath.g:456:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            // InternalMath.g:457:3: otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            this_Exp_1=ruleExp();

            state._fsp--;


            			current = this_Exp_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

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


    // $ANTLR start "entryRuleNumber"
    // InternalMath.g:477:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalMath.g:477:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalMath.g:478:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalMath.g:484:1: ruleNumber returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMath.g:490:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalMath.g:491:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalMath.g:491:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalMath.g:492:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalMath.g:492:3: ()
            // InternalMath.g:493:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumberAction_0(),
            					current);
            			

            }

            // InternalMath.g:499:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalMath.g:500:4: (lv_value_1_0= RULE_INT )
            {
            // InternalMath.g:500:4: (lv_value_1_0= RULE_INT )
            // InternalMath.g:501:5: lv_value_1_0= RULE_INT
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
    // InternalMath.g:521:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:521:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:522:2: iv_ruleVariableUse= ruleVariableUse EOF
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
    // InternalMath.g:528:1: ruleVariableUse returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMath.g:534:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMath.g:535:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMath.g:535:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalMath.g:536:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalMath.g:536:3: ()
            // InternalMath.g:537:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableUseAccess().getVarUseAction_0(),
            					current);
            			

            }

            // InternalMath.g:543:3: ( (otherlv_1= RULE_ID ) )
            // InternalMath.g:544:4: (otherlv_1= RULE_ID )
            {
            // InternalMath.g:544:4: (otherlv_1= RULE_ID )
            // InternalMath.g:545:5: otherlv_1= RULE_ID
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
    // InternalMath.g:560:1: entryRuleLet returns [EObject current=null] : iv_ruleLet= ruleLet EOF ;
    public final EObject entryRuleLet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLet = null;


        try {
            // InternalMath.g:560:44: (iv_ruleLet= ruleLet EOF )
            // InternalMath.g:561:2: iv_ruleLet= ruleLet EOF
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
    // InternalMath.g:567:1: ruleLet returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_value_2_0= ruleAssignment ) ) otherlv_3= 'in' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= 'end' ) ;
    public final EObject ruleLet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalMath.g:573:2: ( ( () otherlv_1= 'let' ( (lv_value_2_0= ruleAssignment ) ) otherlv_3= 'in' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= 'end' ) )
            // InternalMath.g:574:2: ( () otherlv_1= 'let' ( (lv_value_2_0= ruleAssignment ) ) otherlv_3= 'in' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= 'end' )
            {
            // InternalMath.g:574:2: ( () otherlv_1= 'let' ( (lv_value_2_0= ruleAssignment ) ) otherlv_3= 'in' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= 'end' )
            // InternalMath.g:575:3: () otherlv_1= 'let' ( (lv_value_2_0= ruleAssignment ) ) otherlv_3= 'in' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= 'end'
            {
            // InternalMath.g:575:3: ()
            // InternalMath.g:576:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLetAccess().getLetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLetAccess().getLetKeyword_1());
            		
            // InternalMath.g:586:3: ( (lv_value_2_0= ruleAssignment ) )
            // InternalMath.g:587:4: (lv_value_2_0= ruleAssignment )
            {
            // InternalMath.g:587:4: (lv_value_2_0= ruleAssignment )
            // InternalMath.g:588:5: lv_value_2_0= ruleAssignment
            {

            					newCompositeNode(grammarAccess.getLetAccess().getValueAssignmentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_3=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getLetAccess().getInKeyword_3());
            		
            // InternalMath.g:609:3: ( (lv_exp_4_0= ruleExp ) )
            // InternalMath.g:610:4: (lv_exp_4_0= ruleExp )
            {
            // InternalMath.g:610:4: (lv_exp_4_0= ruleExp )
            // InternalMath.g:611:5: lv_exp_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetAccess().getExpExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000A0030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});

}