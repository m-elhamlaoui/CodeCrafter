package org.xtext.example.springgen.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.springgen.services.SpringGenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpringGenParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'relation'", "'between'", "'and'", "'config'", "'{'", "'}'", "'server'", "'port'", "'contextPath'", "'database'", "'dbms'", "'name'", "'username'", "'password'", "'entity'", "'inherits'", "'Id'", "'dto'", "'service'", "'pertainingTo'", "'controller'", "'create'", "'entity:'", "'find'", "'delete'", "'operation'", "'returns'", "'raises'", "'implementation'", "'params'", "'('", "')'", "'action'", "'mappedAt'", "':'", "'default'", "'repository'", "'by'", "'customQuery'", "'List<'", "'>'", "'Set<'", "'float'", "'long'", "'int'", "'char'", "'boolean'", "'byte'", "'String'", "'GET'", "'DELETE'", "'POST'", "'PUT'", "'PATCH'", "'MySQL'", "'Postgres'", "'MariaDB'", "'H2'", "'Oracle'", "'ManyToMany'", "'ManyToOne'", "'OneToMany'", "'RequestBody'", "'RequestParam'", "'PathVariable'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSpringGenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpringGenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpringGenParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSpringGen.g"; }



     	private SpringGenGrammarAccess grammarAccess;

        public InternalSpringGenParser(TokenStream input, SpringGenGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SpringBootProject";
       	}

       	@Override
       	protected SpringGenGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSpringBootProject"
    // InternalSpringGen.g:64:1: entryRuleSpringBootProject returns [EObject current=null] : iv_ruleSpringBootProject= ruleSpringBootProject EOF ;
    public final EObject entryRuleSpringBootProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpringBootProject = null;


        try {
            // InternalSpringGen.g:64:58: (iv_ruleSpringBootProject= ruleSpringBootProject EOF )
            // InternalSpringGen.g:65:2: iv_ruleSpringBootProject= ruleSpringBootProject EOF
            {
             newCompositeNode(grammarAccess.getSpringBootProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpringBootProject=ruleSpringBootProject();

            state._fsp--;

             current =iv_ruleSpringBootProject; 
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
    // $ANTLR end "entryRuleSpringBootProject"


    // $ANTLR start "ruleSpringBootProject"
    // InternalSpringGen.g:71:1: ruleSpringBootProject returns [EObject current=null] : (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configuration_2_0= ruleProjectConfiguration ) )? ( (lv_elements_3_0= ruleProjectElement ) )* ) ;
    public final EObject ruleSpringBootProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_configuration_2_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:77:2: ( (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configuration_2_0= ruleProjectConfiguration ) )? ( (lv_elements_3_0= ruleProjectElement ) )* ) )
            // InternalSpringGen.g:78:2: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configuration_2_0= ruleProjectConfiguration ) )? ( (lv_elements_3_0= ruleProjectElement ) )* )
            {
            // InternalSpringGen.g:78:2: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configuration_2_0= ruleProjectConfiguration ) )? ( (lv_elements_3_0= ruleProjectElement ) )* )
            // InternalSpringGen.g:79:3: otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configuration_2_0= ruleProjectConfiguration ) )? ( (lv_elements_3_0= ruleProjectElement ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSpringBootProjectAccess().getProjectKeyword_0());
            		
            // InternalSpringGen.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpringGen.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpringGen.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalSpringGen.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSpringBootProjectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpringBootProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSpringGen.g:101:3: ( (lv_configuration_2_0= ruleProjectConfiguration ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSpringGen.g:102:4: (lv_configuration_2_0= ruleProjectConfiguration )
                    {
                    // InternalSpringGen.g:102:4: (lv_configuration_2_0= ruleProjectConfiguration )
                    // InternalSpringGen.g:103:5: lv_configuration_2_0= ruleProjectConfiguration
                    {

                    					newCompositeNode(grammarAccess.getSpringBootProjectAccess().getConfigurationProjectConfigurationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_configuration_2_0=ruleProjectConfiguration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSpringBootProjectRule());
                    					}
                    					set(
                    						current,
                    						"configuration",
                    						lv_configuration_2_0,
                    						"org.xtext.example.springgen.SpringGen.ProjectConfiguration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSpringGen.g:120:3: ( (lv_elements_3_0= ruleProjectElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||LA2_0==26||(LA2_0>=29 && LA2_0<=30)||LA2_0==32||LA2_0==48) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSpringGen.g:121:4: (lv_elements_3_0= ruleProjectElement )
            	    {
            	    // InternalSpringGen.g:121:4: (lv_elements_3_0= ruleProjectElement )
            	    // InternalSpringGen.g:122:5: lv_elements_3_0= ruleProjectElement
            	    {

            	    					newCompositeNode(grammarAccess.getSpringBootProjectAccess().getElementsProjectElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_elements_3_0=ruleProjectElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpringBootProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"org.xtext.example.springgen.SpringGen.ProjectElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleSpringBootProject"


    // $ANTLR start "entryRuleProjectElement"
    // InternalSpringGen.g:143:1: entryRuleProjectElement returns [EObject current=null] : iv_ruleProjectElement= ruleProjectElement EOF ;
    public final EObject entryRuleProjectElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectElement = null;


        try {
            // InternalSpringGen.g:143:55: (iv_ruleProjectElement= ruleProjectElement EOF )
            // InternalSpringGen.g:144:2: iv_ruleProjectElement= ruleProjectElement EOF
            {
             newCompositeNode(grammarAccess.getProjectElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectElement=ruleProjectElement();

            state._fsp--;

             current =iv_ruleProjectElement; 
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
    // $ANTLR end "entryRuleProjectElement"


    // $ANTLR start "ruleProjectElement"
    // InternalSpringGen.g:150:1: ruleProjectElement returns [EObject current=null] : (this_Entity_0= ruleEntity | this_EntityRelationship_1= ruleEntityRelationship | this_DTO_2= ruleDTO | this_Service_3= ruleService | this_Repository_4= ruleRepository | this_Controller_5= ruleController ) ;
    public final EObject ruleProjectElement() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_EntityRelationship_1 = null;

        EObject this_DTO_2 = null;

        EObject this_Service_3 = null;

        EObject this_Repository_4 = null;

        EObject this_Controller_5 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:156:2: ( (this_Entity_0= ruleEntity | this_EntityRelationship_1= ruleEntityRelationship | this_DTO_2= ruleDTO | this_Service_3= ruleService | this_Repository_4= ruleRepository | this_Controller_5= ruleController ) )
            // InternalSpringGen.g:157:2: (this_Entity_0= ruleEntity | this_EntityRelationship_1= ruleEntityRelationship | this_DTO_2= ruleDTO | this_Service_3= ruleService | this_Repository_4= ruleRepository | this_Controller_5= ruleController )
            {
            // InternalSpringGen.g:157:2: (this_Entity_0= ruleEntity | this_EntityRelationship_1= ruleEntityRelationship | this_DTO_2= ruleDTO | this_Service_3= ruleService | this_Repository_4= ruleRepository | this_Controller_5= ruleController )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 29:
                {
                alt3=3;
                }
                break;
            case 30:
                {
                alt3=4;
                }
                break;
            case 48:
                {
                alt3=5;
                }
                break;
            case 32:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSpringGen.g:158:3: this_Entity_0= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getProjectElementAccess().getEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_0=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSpringGen.g:167:3: this_EntityRelationship_1= ruleEntityRelationship
                    {

                    			newCompositeNode(grammarAccess.getProjectElementAccess().getEntityRelationshipParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityRelationship_1=ruleEntityRelationship();

                    state._fsp--;


                    			current = this_EntityRelationship_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSpringGen.g:176:3: this_DTO_2= ruleDTO
                    {

                    			newCompositeNode(grammarAccess.getProjectElementAccess().getDTOParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DTO_2=ruleDTO();

                    state._fsp--;


                    			current = this_DTO_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSpringGen.g:185:3: this_Service_3= ruleService
                    {

                    			newCompositeNode(grammarAccess.getProjectElementAccess().getServiceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Service_3=ruleService();

                    state._fsp--;


                    			current = this_Service_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSpringGen.g:194:3: this_Repository_4= ruleRepository
                    {

                    			newCompositeNode(grammarAccess.getProjectElementAccess().getRepositoryParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Repository_4=ruleRepository();

                    state._fsp--;


                    			current = this_Repository_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSpringGen.g:203:3: this_Controller_5= ruleController
                    {

                    			newCompositeNode(grammarAccess.getProjectElementAccess().getControllerParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Controller_5=ruleController();

                    state._fsp--;


                    			current = this_Controller_5;
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
    // $ANTLR end "ruleProjectElement"


    // $ANTLR start "entryRuleEntityRelationship"
    // InternalSpringGen.g:215:1: entryRuleEntityRelationship returns [EObject current=null] : iv_ruleEntityRelationship= ruleEntityRelationship EOF ;
    public final EObject entryRuleEntityRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityRelationship = null;


        try {
            // InternalSpringGen.g:215:59: (iv_ruleEntityRelationship= ruleEntityRelationship EOF )
            // InternalSpringGen.g:216:2: iv_ruleEntityRelationship= ruleEntityRelationship EOF
            {
             newCompositeNode(grammarAccess.getEntityRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityRelationship=ruleEntityRelationship();

            state._fsp--;

             current =iv_ruleEntityRelationship; 
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
    // $ANTLR end "entryRuleEntityRelationship"


    // $ANTLR start "ruleEntityRelationship"
    // InternalSpringGen.g:222:1: ruleEntityRelationship returns [EObject current=null] : (otherlv_0= 'relation' ( (lv_type_1_0= ruleDatabaseRelations ) ) otherlv_2= 'between' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleEntityRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:228:2: ( (otherlv_0= 'relation' ( (lv_type_1_0= ruleDatabaseRelations ) ) otherlv_2= 'between' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalSpringGen.g:229:2: (otherlv_0= 'relation' ( (lv_type_1_0= ruleDatabaseRelations ) ) otherlv_2= 'between' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalSpringGen.g:229:2: (otherlv_0= 'relation' ( (lv_type_1_0= ruleDatabaseRelations ) ) otherlv_2= 'between' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )
            // InternalSpringGen.g:230:3: otherlv_0= 'relation' ( (lv_type_1_0= ruleDatabaseRelations ) ) otherlv_2= 'between' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityRelationshipAccess().getRelationKeyword_0());
            		
            // InternalSpringGen.g:234:3: ( (lv_type_1_0= ruleDatabaseRelations ) )
            // InternalSpringGen.g:235:4: (lv_type_1_0= ruleDatabaseRelations )
            {
            // InternalSpringGen.g:235:4: (lv_type_1_0= ruleDatabaseRelations )
            // InternalSpringGen.g:236:5: lv_type_1_0= ruleDatabaseRelations
            {

            					newCompositeNode(grammarAccess.getEntityRelationshipAccess().getTypeDatabaseRelationsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_1_0=ruleDatabaseRelations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRelationshipRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.example.springgen.SpringGen.DatabaseRelations");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityRelationshipAccess().getBetweenKeyword_2());
            		
            // InternalSpringGen.g:257:3: ( (otherlv_3= RULE_ID ) )
            // InternalSpringGen.g:258:4: (otherlv_3= RULE_ID )
            {
            // InternalSpringGen.g:258:4: (otherlv_3= RULE_ID )
            // InternalSpringGen.g:259:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRelationshipRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_3, grammarAccess.getEntityRelationshipAccess().getSourceEntityCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityRelationshipAccess().getAndKeyword_4());
            		
            // InternalSpringGen.g:274:3: ( (otherlv_5= RULE_ID ) )
            // InternalSpringGen.g:275:4: (otherlv_5= RULE_ID )
            {
            // InternalSpringGen.g:275:4: (otherlv_5= RULE_ID )
            // InternalSpringGen.g:276:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRelationshipRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getEntityRelationshipAccess().getTargetEntityCrossReference_5_0());
            				

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
    // $ANTLR end "ruleEntityRelationship"


    // $ANTLR start "entryRuleProjectConfiguration"
    // InternalSpringGen.g:291:1: entryRuleProjectConfiguration returns [EObject current=null] : iv_ruleProjectConfiguration= ruleProjectConfiguration EOF ;
    public final EObject entryRuleProjectConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectConfiguration = null;


        try {
            // InternalSpringGen.g:291:61: (iv_ruleProjectConfiguration= ruleProjectConfiguration EOF )
            // InternalSpringGen.g:292:2: iv_ruleProjectConfiguration= ruleProjectConfiguration EOF
            {
             newCompositeNode(grammarAccess.getProjectConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectConfiguration=ruleProjectConfiguration();

            state._fsp--;

             current =iv_ruleProjectConfiguration; 
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
    // $ANTLR end "entryRuleProjectConfiguration"


    // $ANTLR start "ruleProjectConfiguration"
    // InternalSpringGen.g:298:1: ruleProjectConfiguration returns [EObject current=null] : (otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerConfiguration ) )? ( (lv_database_3_0= ruleDatabaseConfiguration ) ) otherlv_4= '}' ) ;
    public final EObject ruleProjectConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_server_2_0 = null;

        EObject lv_database_3_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:304:2: ( (otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerConfiguration ) )? ( (lv_database_3_0= ruleDatabaseConfiguration ) ) otherlv_4= '}' ) )
            // InternalSpringGen.g:305:2: (otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerConfiguration ) )? ( (lv_database_3_0= ruleDatabaseConfiguration ) ) otherlv_4= '}' )
            {
            // InternalSpringGen.g:305:2: (otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerConfiguration ) )? ( (lv_database_3_0= ruleDatabaseConfiguration ) ) otherlv_4= '}' )
            // InternalSpringGen.g:306:3: otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerConfiguration ) )? ( (lv_database_3_0= ruleDatabaseConfiguration ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectConfigurationAccess().getConfigKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectConfigurationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSpringGen.g:314:3: ( (lv_server_2_0= ruleServerConfiguration ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSpringGen.g:315:4: (lv_server_2_0= ruleServerConfiguration )
                    {
                    // InternalSpringGen.g:315:4: (lv_server_2_0= ruleServerConfiguration )
                    // InternalSpringGen.g:316:5: lv_server_2_0= ruleServerConfiguration
                    {

                    					newCompositeNode(grammarAccess.getProjectConfigurationAccess().getServerServerConfigurationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_server_2_0=ruleServerConfiguration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProjectConfigurationRule());
                    					}
                    					set(
                    						current,
                    						"server",
                    						lv_server_2_0,
                    						"org.xtext.example.springgen.SpringGen.ServerConfiguration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSpringGen.g:333:3: ( (lv_database_3_0= ruleDatabaseConfiguration ) )
            // InternalSpringGen.g:334:4: (lv_database_3_0= ruleDatabaseConfiguration )
            {
            // InternalSpringGen.g:334:4: (lv_database_3_0= ruleDatabaseConfiguration )
            // InternalSpringGen.g:335:5: lv_database_3_0= ruleDatabaseConfiguration
            {

            					newCompositeNode(grammarAccess.getProjectConfigurationAccess().getDatabaseDatabaseConfigurationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_database_3_0=ruleDatabaseConfiguration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectConfigurationRule());
            					}
            					set(
            						current,
            						"database",
            						lv_database_3_0,
            						"org.xtext.example.springgen.SpringGen.DatabaseConfiguration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProjectConfigurationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleProjectConfiguration"


    // $ANTLR start "entryRuleServerConfiguration"
    // InternalSpringGen.g:360:1: entryRuleServerConfiguration returns [EObject current=null] : iv_ruleServerConfiguration= ruleServerConfiguration EOF ;
    public final EObject entryRuleServerConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerConfiguration = null;


        try {
            // InternalSpringGen.g:360:60: (iv_ruleServerConfiguration= ruleServerConfiguration EOF )
            // InternalSpringGen.g:361:2: iv_ruleServerConfiguration= ruleServerConfiguration EOF
            {
             newCompositeNode(grammarAccess.getServerConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServerConfiguration=ruleServerConfiguration();

            state._fsp--;

             current =iv_ruleServerConfiguration; 
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
    // $ANTLR end "entryRuleServerConfiguration"


    // $ANTLR start "ruleServerConfiguration"
    // InternalSpringGen.g:367:1: ruleServerConfiguration returns [EObject current=null] : (otherlv_0= 'server' otherlv_1= '{' otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) (otherlv_4= 'contextPath' ( (lv_contextPath_5_0= RULE_STRING ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleServerConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_port_3_0=null;
        Token otherlv_4=null;
        Token lv_contextPath_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSpringGen.g:373:2: ( (otherlv_0= 'server' otherlv_1= '{' otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) (otherlv_4= 'contextPath' ( (lv_contextPath_5_0= RULE_STRING ) ) )? otherlv_6= '}' ) )
            // InternalSpringGen.g:374:2: (otherlv_0= 'server' otherlv_1= '{' otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) (otherlv_4= 'contextPath' ( (lv_contextPath_5_0= RULE_STRING ) ) )? otherlv_6= '}' )
            {
            // InternalSpringGen.g:374:2: (otherlv_0= 'server' otherlv_1= '{' otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) (otherlv_4= 'contextPath' ( (lv_contextPath_5_0= RULE_STRING ) ) )? otherlv_6= '}' )
            // InternalSpringGen.g:375:3: otherlv_0= 'server' otherlv_1= '{' otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) (otherlv_4= 'contextPath' ( (lv_contextPath_5_0= RULE_STRING ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getServerConfigurationAccess().getServerKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getServerConfigurationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getServerConfigurationAccess().getPortKeyword_2());
            		
            // InternalSpringGen.g:387:3: ( (lv_port_3_0= RULE_INT ) )
            // InternalSpringGen.g:388:4: (lv_port_3_0= RULE_INT )
            {
            // InternalSpringGen.g:388:4: (lv_port_3_0= RULE_INT )
            // InternalSpringGen.g:389:5: lv_port_3_0= RULE_INT
            {
            lv_port_3_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_port_3_0, grammarAccess.getServerConfigurationAccess().getPortINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServerConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSpringGen.g:405:3: (otherlv_4= 'contextPath' ( (lv_contextPath_5_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSpringGen.g:406:4: otherlv_4= 'contextPath' ( (lv_contextPath_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getServerConfigurationAccess().getContextPathKeyword_4_0());
                    			
                    // InternalSpringGen.g:410:4: ( (lv_contextPath_5_0= RULE_STRING ) )
                    // InternalSpringGen.g:411:5: (lv_contextPath_5_0= RULE_STRING )
                    {
                    // InternalSpringGen.g:411:5: (lv_contextPath_5_0= RULE_STRING )
                    // InternalSpringGen.g:412:6: lv_contextPath_5_0= RULE_STRING
                    {
                    lv_contextPath_5_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_contextPath_5_0, grammarAccess.getServerConfigurationAccess().getContextPathSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServerConfigurationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"contextPath",
                    							lv_contextPath_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getServerConfigurationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleServerConfiguration"


    // $ANTLR start "entryRuleDatabaseConfiguration"
    // InternalSpringGen.g:437:1: entryRuleDatabaseConfiguration returns [EObject current=null] : iv_ruleDatabaseConfiguration= ruleDatabaseConfiguration EOF ;
    public final EObject entryRuleDatabaseConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabaseConfiguration = null;


        try {
            // InternalSpringGen.g:437:62: (iv_ruleDatabaseConfiguration= ruleDatabaseConfiguration EOF )
            // InternalSpringGen.g:438:2: iv_ruleDatabaseConfiguration= ruleDatabaseConfiguration EOF
            {
             newCompositeNode(grammarAccess.getDatabaseConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatabaseConfiguration=ruleDatabaseConfiguration();

            state._fsp--;

             current =iv_ruleDatabaseConfiguration; 
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
    // $ANTLR end "entryRuleDatabaseConfiguration"


    // $ANTLR start "ruleDatabaseConfiguration"
    // InternalSpringGen.g:444:1: ruleDatabaseConfiguration returns [EObject current=null] : (otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'name' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'port' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}' ) ;
    public final EObject ruleDatabaseConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token lv_port_7_0=null;
        Token otherlv_8=null;
        Token lv_username_9_0=null;
        Token otherlv_10=null;
        Token lv_password_11_0=null;
        Token otherlv_12=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:450:2: ( (otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'name' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'port' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}' ) )
            // InternalSpringGen.g:451:2: (otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'name' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'port' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}' )
            {
            // InternalSpringGen.g:451:2: (otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'name' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'port' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}' )
            // InternalSpringGen.g:452:3: otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'name' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'port' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDatabaseConfigurationAccess().getDatabaseKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDatabaseConfigurationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getDatabaseConfigurationAccess().getDbmsKeyword_2());
            		
            // InternalSpringGen.g:464:3: ( (lv_type_3_0= ruleRDBMS ) )
            // InternalSpringGen.g:465:4: (lv_type_3_0= ruleRDBMS )
            {
            // InternalSpringGen.g:465:4: (lv_type_3_0= ruleRDBMS )
            // InternalSpringGen.g:466:5: lv_type_3_0= ruleRDBMS
            {

            					newCompositeNode(grammarAccess.getDatabaseConfigurationAccess().getTypeRDBMSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_type_3_0=ruleRDBMS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseConfigurationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.springgen.SpringGen.RDBMS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getDatabaseConfigurationAccess().getNameKeyword_4());
            		
            // InternalSpringGen.g:487:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalSpringGen.g:488:4: (lv_name_5_0= RULE_ID )
            {
            // InternalSpringGen.g:488:4: (lv_name_5_0= RULE_ID )
            // InternalSpringGen.g:489:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_5_0, grammarAccess.getDatabaseConfigurationAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatabaseConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getDatabaseConfigurationAccess().getPortKeyword_6());
            		
            // InternalSpringGen.g:509:3: ( (lv_port_7_0= RULE_INT ) )
            // InternalSpringGen.g:510:4: (lv_port_7_0= RULE_INT )
            {
            // InternalSpringGen.g:510:4: (lv_port_7_0= RULE_INT )
            // InternalSpringGen.g:511:5: lv_port_7_0= RULE_INT
            {
            lv_port_7_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_port_7_0, grammarAccess.getDatabaseConfigurationAccess().getPortINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatabaseConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getDatabaseConfigurationAccess().getUsernameKeyword_8());
            		
            // InternalSpringGen.g:531:3: ( (lv_username_9_0= RULE_ID ) )
            // InternalSpringGen.g:532:4: (lv_username_9_0= RULE_ID )
            {
            // InternalSpringGen.g:532:4: (lv_username_9_0= RULE_ID )
            // InternalSpringGen.g:533:5: lv_username_9_0= RULE_ID
            {
            lv_username_9_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_username_9_0, grammarAccess.getDatabaseConfigurationAccess().getUsernameIDTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatabaseConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"username",
            						lv_username_9_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_10=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getDatabaseConfigurationAccess().getPasswordKeyword_10());
            		
            // InternalSpringGen.g:553:3: ( (lv_password_11_0= RULE_ID ) )
            // InternalSpringGen.g:554:4: (lv_password_11_0= RULE_ID )
            {
            // InternalSpringGen.g:554:4: (lv_password_11_0= RULE_ID )
            // InternalSpringGen.g:555:5: lv_password_11_0= RULE_ID
            {
            lv_password_11_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_password_11_0, grammarAccess.getDatabaseConfigurationAccess().getPasswordIDTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatabaseConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"password",
            						lv_password_11_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getDatabaseConfigurationAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleDatabaseConfiguration"


    // $ANTLR start "entryRuleEntity"
    // InternalSpringGen.g:579:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalSpringGen.g:579:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalSpringGen.g:580:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalSpringGen.g:586:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_identifier_5_0= ruleIdentifier ) ) ( (lv_properties_6_0= ruleProperty ) )* ( (lv_repository_7_0= ruleRepository ) )? ( (lv_services_8_0= ruleService ) )* ( (lv_controller_9_0= ruleController ) )? otherlv_10= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_10=null;
        EObject lv_identifier_5_0 = null;

        EObject lv_properties_6_0 = null;

        EObject lv_repository_7_0 = null;

        EObject lv_services_8_0 = null;

        EObject lv_controller_9_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:592:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_identifier_5_0= ruleIdentifier ) ) ( (lv_properties_6_0= ruleProperty ) )* ( (lv_repository_7_0= ruleRepository ) )? ( (lv_services_8_0= ruleService ) )* ( (lv_controller_9_0= ruleController ) )? otherlv_10= '}' ) )
            // InternalSpringGen.g:593:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_identifier_5_0= ruleIdentifier ) ) ( (lv_properties_6_0= ruleProperty ) )* ( (lv_repository_7_0= ruleRepository ) )? ( (lv_services_8_0= ruleService ) )* ( (lv_controller_9_0= ruleController ) )? otherlv_10= '}' )
            {
            // InternalSpringGen.g:593:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_identifier_5_0= ruleIdentifier ) ) ( (lv_properties_6_0= ruleProperty ) )* ( (lv_repository_7_0= ruleRepository ) )? ( (lv_services_8_0= ruleService ) )* ( (lv_controller_9_0= ruleController ) )? otherlv_10= '}' )
            // InternalSpringGen.g:594:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_identifier_5_0= ruleIdentifier ) ) ( (lv_properties_6_0= ruleProperty ) )* ( (lv_repository_7_0= ruleRepository ) )? ( (lv_services_8_0= ruleService ) )* ( (lv_controller_9_0= ruleController ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalSpringGen.g:598:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpringGen.g:599:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpringGen.g:599:4: (lv_name_1_0= RULE_ID )
            // InternalSpringGen.g:600:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSpringGen.g:616:3: (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSpringGen.g:617:4: otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getInheritsKeyword_2_0());
                    			
                    // InternalSpringGen.g:621:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSpringGen.g:622:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSpringGen.g:622:5: (otherlv_3= RULE_ID )
                    // InternalSpringGen.g:623:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSpringGen.g:639:3: ( (lv_identifier_5_0= ruleIdentifier ) )
            // InternalSpringGen.g:640:4: (lv_identifier_5_0= ruleIdentifier )
            {
            // InternalSpringGen.g:640:4: (lv_identifier_5_0= ruleIdentifier )
            // InternalSpringGen.g:641:5: lv_identifier_5_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getIdentifierIdentifierParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_identifier_5_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"identifier",
            						lv_identifier_5_0,
            						"org.xtext.example.springgen.SpringGen.Identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpringGen.g:658:3: ( (lv_properties_6_0= ruleProperty ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSpringGen.g:659:4: (lv_properties_6_0= ruleProperty )
            	    {
            	    // InternalSpringGen.g:659:4: (lv_properties_6_0= ruleProperty )
            	    // InternalSpringGen.g:660:5: lv_properties_6_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_properties_6_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_6_0,
            	    						"org.xtext.example.springgen.SpringGen.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalSpringGen.g:677:3: ( (lv_repository_7_0= ruleRepository ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==48) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSpringGen.g:678:4: (lv_repository_7_0= ruleRepository )
                    {
                    // InternalSpringGen.g:678:4: (lv_repository_7_0= ruleRepository )
                    // InternalSpringGen.g:679:5: lv_repository_7_0= ruleRepository
                    {

                    					newCompositeNode(grammarAccess.getEntityAccess().getRepositoryRepositoryParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_repository_7_0=ruleRepository();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityRule());
                    					}
                    					set(
                    						current,
                    						"repository",
                    						lv_repository_7_0,
                    						"org.xtext.example.springgen.SpringGen.Repository");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSpringGen.g:696:3: ( (lv_services_8_0= ruleService ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSpringGen.g:697:4: (lv_services_8_0= ruleService )
            	    {
            	    // InternalSpringGen.g:697:4: (lv_services_8_0= ruleService )
            	    // InternalSpringGen.g:698:5: lv_services_8_0= ruleService
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getServicesServiceParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_services_8_0=ruleService();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"services",
            	    						lv_services_8_0,
            	    						"org.xtext.example.springgen.SpringGen.Service");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalSpringGen.g:715:3: ( (lv_controller_9_0= ruleController ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSpringGen.g:716:4: (lv_controller_9_0= ruleController )
                    {
                    // InternalSpringGen.g:716:4: (lv_controller_9_0= ruleController )
                    // InternalSpringGen.g:717:5: lv_controller_9_0= ruleController
                    {

                    					newCompositeNode(grammarAccess.getEntityAccess().getControllerControllerParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_controller_9_0=ruleController();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityRule());
                    					}
                    					set(
                    						current,
                    						"controller",
                    						lv_controller_9_0,
                    						"org.xtext.example.springgen.SpringGen.Controller");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleIdentifier"
    // InternalSpringGen.g:742:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // InternalSpringGen.g:742:51: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalSpringGen.g:743:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier; 
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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalSpringGen.g:749:1: ruleIdentifier returns [EObject current=null] : (otherlv_0= 'Id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleValueTypes ) ) ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:755:2: ( (otherlv_0= 'Id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleValueTypes ) ) ) )
            // InternalSpringGen.g:756:2: (otherlv_0= 'Id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleValueTypes ) ) )
            {
            // InternalSpringGen.g:756:2: (otherlv_0= 'Id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleValueTypes ) ) )
            // InternalSpringGen.g:757:3: otherlv_0= 'Id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleValueTypes ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIdentifierAccess().getIdKeyword_0());
            		
            // InternalSpringGen.g:761:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpringGen.g:762:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpringGen.g:762:4: (lv_name_1_0= RULE_ID )
            // InternalSpringGen.g:763:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIdentifierAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdentifierRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSpringGen.g:779:3: ( (lv_type_2_0= ruleValueTypes ) )
            // InternalSpringGen.g:780:4: (lv_type_2_0= ruleValueTypes )
            {
            // InternalSpringGen.g:780:4: (lv_type_2_0= ruleValueTypes )
            // InternalSpringGen.g:781:5: lv_type_2_0= ruleValueTypes
            {

            					newCompositeNode(grammarAccess.getIdentifierAccess().getTypeValueTypesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleValueTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIdentifierRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.springgen.SpringGen.ValueTypes");
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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleDTO"
    // InternalSpringGen.g:802:1: entryRuleDTO returns [EObject current=null] : iv_ruleDTO= ruleDTO EOF ;
    public final EObject entryRuleDTO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTO = null;


        try {
            // InternalSpringGen.g:802:44: (iv_ruleDTO= ruleDTO EOF )
            // InternalSpringGen.g:803:2: iv_ruleDTO= ruleDTO EOF
            {
             newCompositeNode(grammarAccess.getDTORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDTO=ruleDTO();

            state._fsp--;

             current =iv_ruleDTO; 
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
    // $ANTLR end "entryRuleDTO"


    // $ANTLR start "ruleDTO"
    // InternalSpringGen.g:809:1: ruleDTO returns [EObject current=null] : (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleDTO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:815:2: ( (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // InternalSpringGen.g:816:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // InternalSpringGen.g:816:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            // InternalSpringGen.g:817:3: otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDTOAccess().getDtoKeyword_0());
            		
            // InternalSpringGen.g:821:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpringGen.g:822:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpringGen.g:822:4: (lv_name_1_0= RULE_ID )
            // InternalSpringGen.g:823:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDTOAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDTORule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getDTOAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSpringGen.g:843:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSpringGen.g:844:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalSpringGen.g:844:4: (lv_properties_3_0= ruleProperty )
            	    // InternalSpringGen.g:845:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getDTOAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_properties_3_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDTORule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_3_0,
            	    						"org.xtext.example.springgen.SpringGen.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDTOAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDTO"


    // $ANTLR start "entryRuleService"
    // InternalSpringGen.g:870:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalSpringGen.g:870:48: (iv_ruleService= ruleService EOF )
            // InternalSpringGen.g:871:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalSpringGen.g:877:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_actions_5_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:883:2: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}' ) )
            // InternalSpringGen.g:884:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}' )
            {
            // InternalSpringGen.g:884:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}' )
            // InternalSpringGen.g:885:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalSpringGen.g:889:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpringGen.g:890:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpringGen.g:890:4: (lv_name_1_0= RULE_ID )
            // InternalSpringGen.g:891:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSpringGen.g:907:3: (otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSpringGen.g:908:4: otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getPertainingToKeyword_2_0());
                    			
                    // InternalSpringGen.g:912:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSpringGen.g:913:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSpringGen.g:913:5: (otherlv_3= RULE_ID )
                    // InternalSpringGen.g:914:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getEntityEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSpringGen.g:930:3: ( (lv_actions_5_0= ruleServiceAction ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSpringGen.g:931:4: (lv_actions_5_0= ruleServiceAction )
            	    {
            	    // InternalSpringGen.g:931:4: (lv_actions_5_0= ruleServiceAction )
            	    // InternalSpringGen.g:932:5: lv_actions_5_0= ruleServiceAction
            	    {

            	    					newCompositeNode(grammarAccess.getServiceAccess().getActionsServiceActionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_actions_5_0=ruleServiceAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_5_0,
            	    						"org.xtext.example.springgen.SpringGen.ServiceAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleController"
    // InternalSpringGen.g:957:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalSpringGen.g:957:51: (iv_ruleController= ruleController EOF )
            // InternalSpringGen.g:958:2: iv_ruleController= ruleController EOF
            {
             newCompositeNode(grammarAccess.getControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleController=ruleController();

            state._fsp--;

             current =iv_ruleController; 
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
    // $ANTLR end "entryRuleController"


    // $ANTLR start "ruleController"
    // InternalSpringGen.g:964:1: ruleController returns [EObject current=null] : (otherlv_0= 'controller' otherlv_1= '{' ( (lv_baseUrl_2_0= RULE_STRING ) )? ( (lv_customActions_3_0= ruleCustomAction ) )* (otherlv_4= 'create' otherlv_5= 'entity:' ( (lv_createParam_6_0= ruleParamTransfer ) ) )? (otherlv_7= 'find' otherlv_8= 'entity:' ( (lv_findParam_9_0= ruleParamTransfer ) ) )? (otherlv_10= 'delete' otherlv_11= 'entity:' ( (lv_deleteParam_12_0= ruleParamTransfer ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_baseUrl_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_customActions_3_0 = null;

        EObject lv_createParam_6_0 = null;

        EObject lv_findParam_9_0 = null;

        EObject lv_deleteParam_12_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:970:2: ( (otherlv_0= 'controller' otherlv_1= '{' ( (lv_baseUrl_2_0= RULE_STRING ) )? ( (lv_customActions_3_0= ruleCustomAction ) )* (otherlv_4= 'create' otherlv_5= 'entity:' ( (lv_createParam_6_0= ruleParamTransfer ) ) )? (otherlv_7= 'find' otherlv_8= 'entity:' ( (lv_findParam_9_0= ruleParamTransfer ) ) )? (otherlv_10= 'delete' otherlv_11= 'entity:' ( (lv_deleteParam_12_0= ruleParamTransfer ) ) )? otherlv_13= '}' ) )
            // InternalSpringGen.g:971:2: (otherlv_0= 'controller' otherlv_1= '{' ( (lv_baseUrl_2_0= RULE_STRING ) )? ( (lv_customActions_3_0= ruleCustomAction ) )* (otherlv_4= 'create' otherlv_5= 'entity:' ( (lv_createParam_6_0= ruleParamTransfer ) ) )? (otherlv_7= 'find' otherlv_8= 'entity:' ( (lv_findParam_9_0= ruleParamTransfer ) ) )? (otherlv_10= 'delete' otherlv_11= 'entity:' ( (lv_deleteParam_12_0= ruleParamTransfer ) ) )? otherlv_13= '}' )
            {
            // InternalSpringGen.g:971:2: (otherlv_0= 'controller' otherlv_1= '{' ( (lv_baseUrl_2_0= RULE_STRING ) )? ( (lv_customActions_3_0= ruleCustomAction ) )* (otherlv_4= 'create' otherlv_5= 'entity:' ( (lv_createParam_6_0= ruleParamTransfer ) ) )? (otherlv_7= 'find' otherlv_8= 'entity:' ( (lv_findParam_9_0= ruleParamTransfer ) ) )? (otherlv_10= 'delete' otherlv_11= 'entity:' ( (lv_deleteParam_12_0= ruleParamTransfer ) ) )? otherlv_13= '}' )
            // InternalSpringGen.g:972:3: otherlv_0= 'controller' otherlv_1= '{' ( (lv_baseUrl_2_0= RULE_STRING ) )? ( (lv_customActions_3_0= ruleCustomAction ) )* (otherlv_4= 'create' otherlv_5= 'entity:' ( (lv_createParam_6_0= ruleParamTransfer ) ) )? (otherlv_7= 'find' otherlv_8= 'entity:' ( (lv_findParam_9_0= ruleParamTransfer ) ) )? (otherlv_10= 'delete' otherlv_11= 'entity:' ( (lv_deleteParam_12_0= ruleParamTransfer ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSpringGen.g:980:3: ( (lv_baseUrl_2_0= RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSpringGen.g:981:4: (lv_baseUrl_2_0= RULE_STRING )
                    {
                    // InternalSpringGen.g:981:4: (lv_baseUrl_2_0= RULE_STRING )
                    // InternalSpringGen.g:982:5: lv_baseUrl_2_0= RULE_STRING
                    {
                    lv_baseUrl_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    					newLeafNode(lv_baseUrl_2_0, grammarAccess.getControllerAccess().getBaseUrlSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getControllerRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"baseUrl",
                    						lv_baseUrl_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalSpringGen.g:998:3: ( (lv_customActions_3_0= ruleCustomAction ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=61 && LA15_0<=65)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSpringGen.g:999:4: (lv_customActions_3_0= ruleCustomAction )
            	    {
            	    // InternalSpringGen.g:999:4: (lv_customActions_3_0= ruleCustomAction )
            	    // InternalSpringGen.g:1000:5: lv_customActions_3_0= ruleCustomAction
            	    {

            	    					newCompositeNode(grammarAccess.getControllerAccess().getCustomActionsCustomActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_customActions_3_0=ruleCustomAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"customActions",
            	    						lv_customActions_3_0,
            	    						"org.xtext.example.springgen.SpringGen.CustomAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalSpringGen.g:1017:3: (otherlv_4= 'create' otherlv_5= 'entity:' ( (lv_createParam_6_0= ruleParamTransfer ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSpringGen.g:1018:4: otherlv_4= 'create' otherlv_5= 'entity:' ( (lv_createParam_6_0= ruleParamTransfer ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_31); 

                    				newLeafNode(otherlv_4, grammarAccess.getControllerAccess().getCreateKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,34,FOLLOW_32); 

                    				newLeafNode(otherlv_5, grammarAccess.getControllerAccess().getEntityKeyword_4_1());
                    			
                    // InternalSpringGen.g:1026:4: ( (lv_createParam_6_0= ruleParamTransfer ) )
                    // InternalSpringGen.g:1027:5: (lv_createParam_6_0= ruleParamTransfer )
                    {
                    // InternalSpringGen.g:1027:5: (lv_createParam_6_0= ruleParamTransfer )
                    // InternalSpringGen.g:1028:6: lv_createParam_6_0= ruleParamTransfer
                    {

                    						newCompositeNode(grammarAccess.getControllerAccess().getCreateParamParamTransferParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_createParam_6_0=ruleParamTransfer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getControllerRule());
                    						}
                    						set(
                    							current,
                    							"createParam",
                    							lv_createParam_6_0,
                    							"org.xtext.example.springgen.SpringGen.ParamTransfer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSpringGen.g:1046:3: (otherlv_7= 'find' otherlv_8= 'entity:' ( (lv_findParam_9_0= ruleParamTransfer ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSpringGen.g:1047:4: otherlv_7= 'find' otherlv_8= 'entity:' ( (lv_findParam_9_0= ruleParamTransfer ) )
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_31); 

                    				newLeafNode(otherlv_7, grammarAccess.getControllerAccess().getFindKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,34,FOLLOW_32); 

                    				newLeafNode(otherlv_8, grammarAccess.getControllerAccess().getEntityKeyword_5_1());
                    			
                    // InternalSpringGen.g:1055:4: ( (lv_findParam_9_0= ruleParamTransfer ) )
                    // InternalSpringGen.g:1056:5: (lv_findParam_9_0= ruleParamTransfer )
                    {
                    // InternalSpringGen.g:1056:5: (lv_findParam_9_0= ruleParamTransfer )
                    // InternalSpringGen.g:1057:6: lv_findParam_9_0= ruleParamTransfer
                    {

                    						newCompositeNode(grammarAccess.getControllerAccess().getFindParamParamTransferParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_findParam_9_0=ruleParamTransfer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getControllerRule());
                    						}
                    						set(
                    							current,
                    							"findParam",
                    							lv_findParam_9_0,
                    							"org.xtext.example.springgen.SpringGen.ParamTransfer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSpringGen.g:1075:3: (otherlv_10= 'delete' otherlv_11= 'entity:' ( (lv_deleteParam_12_0= ruleParamTransfer ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSpringGen.g:1076:4: otherlv_10= 'delete' otherlv_11= 'entity:' ( (lv_deleteParam_12_0= ruleParamTransfer ) )
                    {
                    otherlv_10=(Token)match(input,36,FOLLOW_31); 

                    				newLeafNode(otherlv_10, grammarAccess.getControllerAccess().getDeleteKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,34,FOLLOW_32); 

                    				newLeafNode(otherlv_11, grammarAccess.getControllerAccess().getEntityKeyword_6_1());
                    			
                    // InternalSpringGen.g:1084:4: ( (lv_deleteParam_12_0= ruleParamTransfer ) )
                    // InternalSpringGen.g:1085:5: (lv_deleteParam_12_0= ruleParamTransfer )
                    {
                    // InternalSpringGen.g:1085:5: (lv_deleteParam_12_0= ruleParamTransfer )
                    // InternalSpringGen.g:1086:6: lv_deleteParam_12_0= ruleParamTransfer
                    {

                    						newCompositeNode(grammarAccess.getControllerAccess().getDeleteParamParamTransferParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_deleteParam_12_0=ruleParamTransfer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getControllerRule());
                    						}
                    						set(
                    							current,
                    							"deleteParam",
                    							lv_deleteParam_12_0,
                    							"org.xtext.example.springgen.SpringGen.ParamTransfer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleController"


    // $ANTLR start "entryRuleServiceAction"
    // InternalSpringGen.g:1112:1: entryRuleServiceAction returns [EObject current=null] : iv_ruleServiceAction= ruleServiceAction EOF ;
    public final EObject entryRuleServiceAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceAction = null;


        try {
            // InternalSpringGen.g:1112:54: (iv_ruleServiceAction= ruleServiceAction EOF )
            // InternalSpringGen.g:1113:2: iv_ruleServiceAction= ruleServiceAction EOF
            {
             newCompositeNode(grammarAccess.getServiceActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceAction=ruleServiceAction();

            state._fsp--;

             current =iv_ruleServiceAction; 
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
    // $ANTLR end "entryRuleServiceAction"


    // $ANTLR start "ruleServiceAction"
    // InternalSpringGen.g:1119:1: ruleServiceAction returns [EObject current=null] : (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleReturnType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}' ) ;
    public final EObject ruleServiceAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_implementation_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_returnType_4_0 = null;

        EObject lv_exceptionType_6_0 = null;

        EObject lv_parameters_11_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:1125:2: ( (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleReturnType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}' ) )
            // InternalSpringGen.g:1126:2: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleReturnType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}' )
            {
            // InternalSpringGen.g:1126:2: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleReturnType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}' )
            // InternalSpringGen.g:1127:3: otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleReturnType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceActionAccess().getOperationKeyword_0());
            		
            // InternalSpringGen.g:1131:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpringGen.g:1132:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpringGen.g:1132:4: (lv_name_1_0= RULE_ID )
            // InternalSpringGen.g:1133:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServiceActionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceActionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceActionAccess().getReturnsKeyword_3());
            		
            // InternalSpringGen.g:1157:3: ( (lv_returnType_4_0= ruleReturnType ) )
            // InternalSpringGen.g:1158:4: (lv_returnType_4_0= ruleReturnType )
            {
            // InternalSpringGen.g:1158:4: (lv_returnType_4_0= ruleReturnType )
            // InternalSpringGen.g:1159:5: lv_returnType_4_0= ruleReturnType
            {

            					newCompositeNode(grammarAccess.getServiceActionAccess().getReturnTypeReturnTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_37);
            lv_returnType_4_0=ruleReturnType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceActionRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_4_0,
            						"org.xtext.example.springgen.SpringGen.ReturnType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpringGen.g:1176:3: (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSpringGen.g:1177:4: otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) )
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_38); 

                    				newLeafNode(otherlv_5, grammarAccess.getServiceActionAccess().getRaisesKeyword_5_0());
                    			
                    // InternalSpringGen.g:1181:4: ( (lv_exceptionType_6_0= ruleType ) )
                    // InternalSpringGen.g:1182:5: (lv_exceptionType_6_0= ruleType )
                    {
                    // InternalSpringGen.g:1182:5: (lv_exceptionType_6_0= ruleType )
                    // InternalSpringGen.g:1183:6: lv_exceptionType_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getServiceActionAccess().getExceptionTypeTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_exceptionType_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceActionRule());
                    						}
                    						set(
                    							current,
                    							"exceptionType",
                    							lv_exceptionType_6_0,
                    							"org.xtext.example.springgen.SpringGen.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSpringGen.g:1201:3: (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSpringGen.g:1202:4: otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getServiceActionAccess().getImplementationKeyword_6_0());
                    			
                    // InternalSpringGen.g:1206:4: ( (lv_implementation_8_0= RULE_STRING ) )
                    // InternalSpringGen.g:1207:5: (lv_implementation_8_0= RULE_STRING )
                    {
                    // InternalSpringGen.g:1207:5: (lv_implementation_8_0= RULE_STRING )
                    // InternalSpringGen.g:1208:6: lv_implementation_8_0= RULE_STRING
                    {
                    lv_implementation_8_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    						newLeafNode(lv_implementation_8_0, grammarAccess.getServiceActionAccess().getImplementationSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"implementation",
                    							lv_implementation_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,41,FOLLOW_41); 

            			newLeafNode(otherlv_9, grammarAccess.getServiceActionAccess().getParamsKeyword_7());
            		
            otherlv_10=(Token)match(input,42,FOLLOW_42); 

            			newLeafNode(otherlv_10, grammarAccess.getServiceActionAccess().getLeftParenthesisKeyword_8());
            		
            // InternalSpringGen.g:1233:3: ( (lv_parameters_11_0= ruleActionParameter ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSpringGen.g:1234:4: (lv_parameters_11_0= ruleActionParameter )
            	    {
            	    // InternalSpringGen.g:1234:4: (lv_parameters_11_0= ruleActionParameter )
            	    // InternalSpringGen.g:1235:5: lv_parameters_11_0= ruleActionParameter
            	    {

            	    					newCompositeNode(grammarAccess.getServiceActionAccess().getParametersActionParameterParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_42);
            	    lv_parameters_11_0=ruleActionParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServiceActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_11_0,
            	    						"org.xtext.example.springgen.SpringGen.ActionParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_12=(Token)match(input,43,FOLLOW_11); 

            			newLeafNode(otherlv_12, grammarAccess.getServiceActionAccess().getRightParenthesisKeyword_10());
            		
            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getServiceActionAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleServiceAction"


    // $ANTLR start "entryRuleCustomAction"
    // InternalSpringGen.g:1264:1: entryRuleCustomAction returns [EObject current=null] : iv_ruleCustomAction= ruleCustomAction EOF ;
    public final EObject entryRuleCustomAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomAction = null;


        try {
            // InternalSpringGen.g:1264:53: (iv_ruleCustomAction= ruleCustomAction EOF )
            // InternalSpringGen.g:1265:2: iv_ruleCustomAction= ruleCustomAction EOF
            {
             newCompositeNode(grammarAccess.getCustomActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomAction=ruleCustomAction();

            state._fsp--;

             current =iv_ruleCustomAction; 
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
    // $ANTLR end "entryRuleCustomAction"


    // $ANTLR start "ruleCustomAction"
    // InternalSpringGen.g:1271:1: ruleCustomAction returns [EObject current=null] : ( ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_parameters_6_0= ruleActionParameter ) )* otherlv_7= '}' ) ;
    public final EObject ruleCustomAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_url_5_0=null;
        Token otherlv_7=null;
        EObject lv_method_0_0 = null;

        EObject lv_parameters_6_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:1277:2: ( ( ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_parameters_6_0= ruleActionParameter ) )* otherlv_7= '}' ) )
            // InternalSpringGen.g:1278:2: ( ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_parameters_6_0= ruleActionParameter ) )* otherlv_7= '}' )
            {
            // InternalSpringGen.g:1278:2: ( ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_parameters_6_0= ruleActionParameter ) )* otherlv_7= '}' )
            // InternalSpringGen.g:1279:3: ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_parameters_6_0= ruleActionParameter ) )* otherlv_7= '}'
            {
            // InternalSpringGen.g:1279:3: ( (lv_method_0_0= ruleHttpMethods ) )
            // InternalSpringGen.g:1280:4: (lv_method_0_0= ruleHttpMethods )
            {
            // InternalSpringGen.g:1280:4: (lv_method_0_0= ruleHttpMethods )
            // InternalSpringGen.g:1281:5: lv_method_0_0= ruleHttpMethods
            {

            					newCompositeNode(grammarAccess.getCustomActionAccess().getMethodHttpMethodsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_43);
            lv_method_0_0=ruleHttpMethods();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomActionRule());
            					}
            					set(
            						current,
            						"method",
            						lv_method_0_0,
            						"org.xtext.example.springgen.SpringGen.HttpMethods");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomActionAccess().getActionKeyword_1());
            		
            // InternalSpringGen.g:1302:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSpringGen.g:1303:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSpringGen.g:1303:4: (lv_name_2_0= RULE_ID )
            // InternalSpringGen.g:1304:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCustomActionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_44); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSpringGen.g:1324:3: (otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSpringGen.g:1325:4: otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getCustomActionAccess().getMappedAtKeyword_4_0());
                    			
                    // InternalSpringGen.g:1329:4: ( (lv_url_5_0= RULE_STRING ) )
                    // InternalSpringGen.g:1330:5: (lv_url_5_0= RULE_STRING )
                    {
                    // InternalSpringGen.g:1330:5: (lv_url_5_0= RULE_STRING )
                    // InternalSpringGen.g:1331:6: lv_url_5_0= RULE_STRING
                    {
                    lv_url_5_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    						newLeafNode(lv_url_5_0, grammarAccess.getCustomActionAccess().getUrlSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"url",
                    							lv_url_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSpringGen.g:1348:3: ( (lv_parameters_6_0= ruleActionParameter ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSpringGen.g:1349:4: (lv_parameters_6_0= ruleActionParameter )
            	    {
            	    // InternalSpringGen.g:1349:4: (lv_parameters_6_0= ruleActionParameter )
            	    // InternalSpringGen.g:1350:5: lv_parameters_6_0= ruleActionParameter
            	    {

            	    					newCompositeNode(grammarAccess.getCustomActionAccess().getParametersActionParameterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_parameters_6_0=ruleActionParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCustomActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_6_0,
            	    						"org.xtext.example.springgen.SpringGen.ActionParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCustomActionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCustomAction"


    // $ANTLR start "entryRuleActionParameter"
    // InternalSpringGen.g:1375:1: entryRuleActionParameter returns [EObject current=null] : iv_ruleActionParameter= ruleActionParameter EOF ;
    public final EObject entryRuleActionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionParameter = null;


        try {
            // InternalSpringGen.g:1375:56: (iv_ruleActionParameter= ruleActionParameter EOF )
            // InternalSpringGen.g:1376:2: iv_ruleActionParameter= ruleActionParameter EOF
            {
             newCompositeNode(grammarAccess.getActionParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionParameter=ruleActionParameter();

            state._fsp--;

             current =iv_ruleActionParameter; 
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
    // $ANTLR end "entryRuleActionParameter"


    // $ANTLR start "ruleActionParameter"
    // InternalSpringGen.g:1382:1: ruleActionParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleActionParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_defaultValue_4_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:1388:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) )
            // InternalSpringGen.g:1389:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            {
            // InternalSpringGen.g:1389:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            // InternalSpringGen.g:1390:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            {
            // InternalSpringGen.g:1390:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSpringGen.g:1391:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSpringGen.g:1391:4: (lv_name_0_0= RULE_ID )
            // InternalSpringGen.g:1392:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(lv_name_0_0, grammarAccess.getActionParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getActionParameterAccess().getColonKeyword_1());
            		
            // InternalSpringGen.g:1412:3: ( (lv_type_2_0= ruleType ) )
            // InternalSpringGen.g:1413:4: (lv_type_2_0= ruleType )
            {
            // InternalSpringGen.g:1413:4: (lv_type_2_0= ruleType )
            // InternalSpringGen.g:1414:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getActionParameterAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_46);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.springgen.SpringGen.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpringGen.g:1431:3: (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==47) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSpringGen.g:1432:4: otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getActionParameterAccess().getDefaultKeyword_3_0());
                    			
                    // InternalSpringGen.g:1436:4: ( (lv_defaultValue_4_0= RULE_STRING ) )
                    // InternalSpringGen.g:1437:5: (lv_defaultValue_4_0= RULE_STRING )
                    {
                    // InternalSpringGen.g:1437:5: (lv_defaultValue_4_0= RULE_STRING )
                    // InternalSpringGen.g:1438:6: lv_defaultValue_4_0= RULE_STRING
                    {
                    lv_defaultValue_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_defaultValue_4_0, grammarAccess.getActionParameterAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionParameterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"defaultValue",
                    							lv_defaultValue_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleActionParameter"


    // $ANTLR start "entryRuleRepository"
    // InternalSpringGen.g:1459:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalSpringGen.g:1459:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalSpringGen.g:1460:2: iv_ruleRepository= ruleRepository EOF
            {
             newCompositeNode(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepository=ruleRepository();

            state._fsp--;

             current =iv_ruleRepository; 
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
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // InternalSpringGen.g:1466:1: ruleRepository returns [EObject current=null] : (otherlv_0= 'repository' otherlv_1= '{' ( (lv_findBy_2_0= ruleFindByMethod ) )* ( (lv_deleteBy_3_0= ruleDeleteByMethod ) )* ( (lv_customQueryMethod_4_0= ruleCustomQueryMethod ) )* otherlv_5= '}' ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_findBy_2_0 = null;

        EObject lv_deleteBy_3_0 = null;

        EObject lv_customQueryMethod_4_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:1472:2: ( (otherlv_0= 'repository' otherlv_1= '{' ( (lv_findBy_2_0= ruleFindByMethod ) )* ( (lv_deleteBy_3_0= ruleDeleteByMethod ) )* ( (lv_customQueryMethod_4_0= ruleCustomQueryMethod ) )* otherlv_5= '}' ) )
            // InternalSpringGen.g:1473:2: (otherlv_0= 'repository' otherlv_1= '{' ( (lv_findBy_2_0= ruleFindByMethod ) )* ( (lv_deleteBy_3_0= ruleDeleteByMethod ) )* ( (lv_customQueryMethod_4_0= ruleCustomQueryMethod ) )* otherlv_5= '}' )
            {
            // InternalSpringGen.g:1473:2: (otherlv_0= 'repository' otherlv_1= '{' ( (lv_findBy_2_0= ruleFindByMethod ) )* ( (lv_deleteBy_3_0= ruleDeleteByMethod ) )* ( (lv_customQueryMethod_4_0= ruleCustomQueryMethod ) )* otherlv_5= '}' )
            // InternalSpringGen.g:1474:3: otherlv_0= 'repository' otherlv_1= '{' ( (lv_findBy_2_0= ruleFindByMethod ) )* ( (lv_deleteBy_3_0= ruleDeleteByMethod ) )* ( (lv_customQueryMethod_4_0= ruleCustomQueryMethod ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getRepositoryKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSpringGen.g:1482:3: ( (lv_findBy_2_0= ruleFindByMethod ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==35) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSpringGen.g:1483:4: (lv_findBy_2_0= ruleFindByMethod )
            	    {
            	    // InternalSpringGen.g:1483:4: (lv_findBy_2_0= ruleFindByMethod )
            	    // InternalSpringGen.g:1484:5: lv_findBy_2_0= ruleFindByMethod
            	    {

            	    					newCompositeNode(grammarAccess.getRepositoryAccess().getFindByFindByMethodParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_47);
            	    lv_findBy_2_0=ruleFindByMethod();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"findBy",
            	    						lv_findBy_2_0,
            	    						"org.xtext.example.springgen.SpringGen.FindByMethod");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalSpringGen.g:1501:3: ( (lv_deleteBy_3_0= ruleDeleteByMethod ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==36) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSpringGen.g:1502:4: (lv_deleteBy_3_0= ruleDeleteByMethod )
            	    {
            	    // InternalSpringGen.g:1502:4: (lv_deleteBy_3_0= ruleDeleteByMethod )
            	    // InternalSpringGen.g:1503:5: lv_deleteBy_3_0= ruleDeleteByMethod
            	    {

            	    					newCompositeNode(grammarAccess.getRepositoryAccess().getDeleteByDeleteByMethodParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_48);
            	    lv_deleteBy_3_0=ruleDeleteByMethod();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"deleteBy",
            	    						lv_deleteBy_3_0,
            	    						"org.xtext.example.springgen.SpringGen.DeleteByMethod");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalSpringGen.g:1520:3: ( (lv_customQueryMethod_4_0= ruleCustomQueryMethod ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==50) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSpringGen.g:1521:4: (lv_customQueryMethod_4_0= ruleCustomQueryMethod )
            	    {
            	    // InternalSpringGen.g:1521:4: (lv_customQueryMethod_4_0= ruleCustomQueryMethod )
            	    // InternalSpringGen.g:1522:5: lv_customQueryMethod_4_0= ruleCustomQueryMethod
            	    {

            	    					newCompositeNode(grammarAccess.getRepositoryAccess().getCustomQueryMethodCustomQueryMethodParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_49);
            	    lv_customQueryMethod_4_0=ruleCustomQueryMethod();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"customQueryMethod",
            	    						lv_customQueryMethod_4_0,
            	    						"org.xtext.example.springgen.SpringGen.CustomQueryMethod");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleFindByMethod"
    // InternalSpringGen.g:1547:1: entryRuleFindByMethod returns [EObject current=null] : iv_ruleFindByMethod= ruleFindByMethod EOF ;
    public final EObject entryRuleFindByMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFindByMethod = null;


        try {
            // InternalSpringGen.g:1547:53: (iv_ruleFindByMethod= ruleFindByMethod EOF )
            // InternalSpringGen.g:1548:2: iv_ruleFindByMethod= ruleFindByMethod EOF
            {
             newCompositeNode(grammarAccess.getFindByMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFindByMethod=ruleFindByMethod();

            state._fsp--;

             current =iv_ruleFindByMethod; 
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
    // $ANTLR end "entryRuleFindByMethod"


    // $ANTLR start "ruleFindByMethod"
    // InternalSpringGen.g:1554:1: ruleFindByMethod returns [EObject current=null] : (otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_propertyType_4_0= ruleValueTypes ) ) ) ;
    public final EObject ruleFindByMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_property_2_0=null;
        Token otherlv_3=null;
        EObject lv_propertyType_4_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:1560:2: ( (otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_propertyType_4_0= ruleValueTypes ) ) ) )
            // InternalSpringGen.g:1561:2: (otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_propertyType_4_0= ruleValueTypes ) ) )
            {
            // InternalSpringGen.g:1561:2: (otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_propertyType_4_0= ruleValueTypes ) ) )
            // InternalSpringGen.g:1562:3: otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_propertyType_4_0= ruleValueTypes ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getFindByMethodAccess().getFindKeyword_0());
            		
            otherlv_1=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFindByMethodAccess().getByKeyword_1());
            		
            // InternalSpringGen.g:1570:3: ( (lv_property_2_0= RULE_ID ) )
            // InternalSpringGen.g:1571:4: (lv_property_2_0= RULE_ID )
            {
            // InternalSpringGen.g:1571:4: (lv_property_2_0= RULE_ID )
            // InternalSpringGen.g:1572:5: lv_property_2_0= RULE_ID
            {
            lv_property_2_0=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(lv_property_2_0, grammarAccess.getFindByMethodAccess().getPropertyIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFindByMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"property",
            						lv_property_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getFindByMethodAccess().getColonKeyword_3());
            		
            // InternalSpringGen.g:1592:3: ( (lv_propertyType_4_0= ruleValueTypes ) )
            // InternalSpringGen.g:1593:4: (lv_propertyType_4_0= ruleValueTypes )
            {
            // InternalSpringGen.g:1593:4: (lv_propertyType_4_0= ruleValueTypes )
            // InternalSpringGen.g:1594:5: lv_propertyType_4_0= ruleValueTypes
            {

            					newCompositeNode(grammarAccess.getFindByMethodAccess().getPropertyTypeValueTypesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_propertyType_4_0=ruleValueTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFindByMethodRule());
            					}
            					set(
            						current,
            						"propertyType",
            						lv_propertyType_4_0,
            						"org.xtext.example.springgen.SpringGen.ValueTypes");
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
    // $ANTLR end "ruleFindByMethod"


    // $ANTLR start "entryRuleDeleteByMethod"
    // InternalSpringGen.g:1615:1: entryRuleDeleteByMethod returns [EObject current=null] : iv_ruleDeleteByMethod= ruleDeleteByMethod EOF ;
    public final EObject entryRuleDeleteByMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteByMethod = null;


        try {
            // InternalSpringGen.g:1615:55: (iv_ruleDeleteByMethod= ruleDeleteByMethod EOF )
            // InternalSpringGen.g:1616:2: iv_ruleDeleteByMethod= ruleDeleteByMethod EOF
            {
             newCompositeNode(grammarAccess.getDeleteByMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteByMethod=ruleDeleteByMethod();

            state._fsp--;

             current =iv_ruleDeleteByMethod; 
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
    // $ANTLR end "entryRuleDeleteByMethod"


    // $ANTLR start "ruleDeleteByMethod"
    // InternalSpringGen.g:1622:1: ruleDeleteByMethod returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_propertyType_4_0= ruleValueTypes ) ) ) ;
    public final EObject ruleDeleteByMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_property_2_0=null;
        Token otherlv_3=null;
        EObject lv_propertyType_4_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:1628:2: ( (otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_propertyType_4_0= ruleValueTypes ) ) ) )
            // InternalSpringGen.g:1629:2: (otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_propertyType_4_0= ruleValueTypes ) ) )
            {
            // InternalSpringGen.g:1629:2: (otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_propertyType_4_0= ruleValueTypes ) ) )
            // InternalSpringGen.g:1630:3: otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_propertyType_4_0= ruleValueTypes ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteByMethodAccess().getDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteByMethodAccess().getByKeyword_1());
            		
            // InternalSpringGen.g:1638:3: ( (lv_property_2_0= RULE_ID ) )
            // InternalSpringGen.g:1639:4: (lv_property_2_0= RULE_ID )
            {
            // InternalSpringGen.g:1639:4: (lv_property_2_0= RULE_ID )
            // InternalSpringGen.g:1640:5: lv_property_2_0= RULE_ID
            {
            lv_property_2_0=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(lv_property_2_0, grammarAccess.getDeleteByMethodAccess().getPropertyIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeleteByMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"property",
            						lv_property_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getDeleteByMethodAccess().getColonKeyword_3());
            		
            // InternalSpringGen.g:1660:3: ( (lv_propertyType_4_0= ruleValueTypes ) )
            // InternalSpringGen.g:1661:4: (lv_propertyType_4_0= ruleValueTypes )
            {
            // InternalSpringGen.g:1661:4: (lv_propertyType_4_0= ruleValueTypes )
            // InternalSpringGen.g:1662:5: lv_propertyType_4_0= ruleValueTypes
            {

            					newCompositeNode(grammarAccess.getDeleteByMethodAccess().getPropertyTypeValueTypesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_propertyType_4_0=ruleValueTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteByMethodRule());
            					}
            					set(
            						current,
            						"propertyType",
            						lv_propertyType_4_0,
            						"org.xtext.example.springgen.SpringGen.ValueTypes");
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
    // $ANTLR end "ruleDeleteByMethod"


    // $ANTLR start "entryRuleCustomQueryMethod"
    // InternalSpringGen.g:1683:1: entryRuleCustomQueryMethod returns [EObject current=null] : iv_ruleCustomQueryMethod= ruleCustomQueryMethod EOF ;
    public final EObject entryRuleCustomQueryMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomQueryMethod = null;


        try {
            // InternalSpringGen.g:1683:58: (iv_ruleCustomQueryMethod= ruleCustomQueryMethod EOF )
            // InternalSpringGen.g:1684:2: iv_ruleCustomQueryMethod= ruleCustomQueryMethod EOF
            {
             newCompositeNode(grammarAccess.getCustomQueryMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomQueryMethod=ruleCustomQueryMethod();

            state._fsp--;

             current =iv_ruleCustomQueryMethod; 
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
    // $ANTLR end "entryRuleCustomQueryMethod"


    // $ANTLR start "ruleCustomQueryMethod"
    // InternalSpringGen.g:1690:1: ruleCustomQueryMethod returns [EObject current=null] : (otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleCustomQueryMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_query_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSpringGen.g:1696:2: ( (otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalSpringGen.g:1697:2: (otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalSpringGen.g:1697:2: (otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalSpringGen.g:1698:3: otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomQueryMethodAccess().getCustomQueryKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomQueryMethodAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSpringGen.g:1706:3: ( (lv_query_2_0= RULE_STRING ) )
            // InternalSpringGen.g:1707:4: (lv_query_2_0= RULE_STRING )
            {
            // InternalSpringGen.g:1707:4: (lv_query_2_0= RULE_STRING )
            // InternalSpringGen.g:1708:5: lv_query_2_0= RULE_STRING
            {
            lv_query_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_query_2_0, grammarAccess.getCustomQueryMethodAccess().getQuerySTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomQueryMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"query",
            						lv_query_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomQueryMethodAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleCustomQueryMethod"


    // $ANTLR start "entryRuleProperty"
    // InternalSpringGen.g:1732:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalSpringGen.g:1732:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalSpringGen.g:1733:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalSpringGen.g:1739:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_defaultValue_4_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:1745:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) )
            // InternalSpringGen.g:1746:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            {
            // InternalSpringGen.g:1746:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            // InternalSpringGen.g:1747:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            {
            // InternalSpringGen.g:1747:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSpringGen.g:1748:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSpringGen.g:1748:4: (lv_name_0_0= RULE_ID )
            // InternalSpringGen.g:1749:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
            		
            // InternalSpringGen.g:1769:3: ( (lv_type_2_0= ruleType ) )
            // InternalSpringGen.g:1770:4: (lv_type_2_0= ruleType )
            {
            // InternalSpringGen.g:1770:4: (lv_type_2_0= ruleType )
            // InternalSpringGen.g:1771:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_46);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.springgen.SpringGen.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpringGen.g:1788:3: (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSpringGen.g:1789:4: otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getDefaultKeyword_3_0());
                    			
                    // InternalSpringGen.g:1793:4: ( (lv_defaultValue_4_0= RULE_STRING ) )
                    // InternalSpringGen.g:1794:5: (lv_defaultValue_4_0= RULE_STRING )
                    {
                    // InternalSpringGen.g:1794:5: (lv_defaultValue_4_0= RULE_STRING )
                    // InternalSpringGen.g:1795:6: lv_defaultValue_4_0= RULE_STRING
                    {
                    lv_defaultValue_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_defaultValue_4_0, grammarAccess.getPropertyAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"defaultValue",
                    							lv_defaultValue_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleType"
    // InternalSpringGen.g:1816:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSpringGen.g:1816:45: (iv_ruleType= ruleType EOF )
            // InternalSpringGen.g:1817:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSpringGen.g:1823:1: ruleType returns [EObject current=null] : (this_ValueTypes_0= ruleValueTypes | this_ListType_1= ruleListType | this_SetType_2= ruleSetType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ValueTypes_0 = null;

        EObject this_ListType_1 = null;

        EObject this_SetType_2 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:1829:2: ( (this_ValueTypes_0= ruleValueTypes | this_ListType_1= ruleListType | this_SetType_2= ruleSetType ) )
            // InternalSpringGen.g:1830:2: (this_ValueTypes_0= ruleValueTypes | this_ListType_1= ruleListType | this_SetType_2= ruleSetType )
            {
            // InternalSpringGen.g:1830:2: (this_ValueTypes_0= ruleValueTypes | this_ListType_1= ruleListType | this_SetType_2= ruleSetType )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
                {
                alt29=1;
                }
                break;
            case 51:
                {
                alt29=2;
                }
                break;
            case 53:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalSpringGen.g:1831:3: this_ValueTypes_0= ruleValueTypes
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getValueTypesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueTypes_0=ruleValueTypes();

                    state._fsp--;


                    			current = this_ValueTypes_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSpringGen.g:1840:3: this_ListType_1= ruleListType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getListTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListType_1=ruleListType();

                    state._fsp--;


                    			current = this_ListType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSpringGen.g:1849:3: this_SetType_2= ruleSetType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getSetTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetType_2=ruleSetType();

                    state._fsp--;


                    			current = this_SetType_2;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleReturnType"
    // InternalSpringGen.g:1861:1: entryRuleReturnType returns [EObject current=null] : iv_ruleReturnType= ruleReturnType EOF ;
    public final EObject entryRuleReturnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnType = null;


        try {
            // InternalSpringGen.g:1861:51: (iv_ruleReturnType= ruleReturnType EOF )
            // InternalSpringGen.g:1862:2: iv_ruleReturnType= ruleReturnType EOF
            {
             newCompositeNode(grammarAccess.getReturnTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnType=ruleReturnType();

            state._fsp--;

             current =iv_ruleReturnType; 
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
    // $ANTLR end "entryRuleReturnType"


    // $ANTLR start "ruleReturnType"
    // InternalSpringGen.g:1868:1: ruleReturnType returns [EObject current=null] : (this_ValueTypes_0= ruleValueTypes | this_ListType_1= ruleListType | this_ID_2= RULE_ID ) ;
    public final EObject ruleReturnType() throws RecognitionException {
        EObject current = null;

        Token this_ID_2=null;
        EObject this_ValueTypes_0 = null;

        EObject this_ListType_1 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:1874:2: ( (this_ValueTypes_0= ruleValueTypes | this_ListType_1= ruleListType | this_ID_2= RULE_ID ) )
            // InternalSpringGen.g:1875:2: (this_ValueTypes_0= ruleValueTypes | this_ListType_1= ruleListType | this_ID_2= RULE_ID )
            {
            // InternalSpringGen.g:1875:2: (this_ValueTypes_0= ruleValueTypes | this_ListType_1= ruleListType | this_ID_2= RULE_ID )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
                {
                alt30=1;
                }
                break;
            case 51:
                {
                alt30=2;
                }
                break;
            case RULE_ID:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalSpringGen.g:1876:3: this_ValueTypes_0= ruleValueTypes
                    {

                    			newCompositeNode(grammarAccess.getReturnTypeAccess().getValueTypesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueTypes_0=ruleValueTypes();

                    state._fsp--;


                    			current = this_ValueTypes_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSpringGen.g:1885:3: this_ListType_1= ruleListType
                    {

                    			newCompositeNode(grammarAccess.getReturnTypeAccess().getListTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListType_1=ruleListType();

                    state._fsp--;


                    			current = this_ListType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSpringGen.g:1894:3: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			newLeafNode(this_ID_2, grammarAccess.getReturnTypeAccess().getIDTerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleReturnType"


    // $ANTLR start "entryRuleListType"
    // InternalSpringGen.g:1902:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // InternalSpringGen.g:1902:49: (iv_ruleListType= ruleListType EOF )
            // InternalSpringGen.g:1903:2: iv_ruleListType= ruleListType EOF
            {
             newCompositeNode(grammarAccess.getListTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListType=ruleListType();

            state._fsp--;

             current =iv_ruleListType; 
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
    // $ANTLR end "entryRuleListType"


    // $ANTLR start "ruleListType"
    // InternalSpringGen.g:1909:1: ruleListType returns [EObject current=null] : (otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:1915:2: ( (otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) )
            // InternalSpringGen.g:1916:2: (otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            {
            // InternalSpringGen.g:1916:2: (otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            // InternalSpringGen.g:1917:3: otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getListTypeAccess().getListKeyword_0());
            		
            // InternalSpringGen.g:1921:3: ( (lv_type_1_0= ruleType ) )
            // InternalSpringGen.g:1922:4: (lv_type_1_0= ruleType )
            {
            // InternalSpringGen.g:1922:4: (lv_type_1_0= ruleType )
            // InternalSpringGen.g:1923:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getListTypeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_51);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.example.springgen.SpringGen.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,52,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getListTypeAccess().getGreaterThanSignKeyword_2());
            		

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
    // $ANTLR end "ruleListType"


    // $ANTLR start "entryRuleSetType"
    // InternalSpringGen.g:1948:1: entryRuleSetType returns [EObject current=null] : iv_ruleSetType= ruleSetType EOF ;
    public final EObject entryRuleSetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetType = null;


        try {
            // InternalSpringGen.g:1948:48: (iv_ruleSetType= ruleSetType EOF )
            // InternalSpringGen.g:1949:2: iv_ruleSetType= ruleSetType EOF
            {
             newCompositeNode(grammarAccess.getSetTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetType=ruleSetType();

            state._fsp--;

             current =iv_ruleSetType; 
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
    // $ANTLR end "entryRuleSetType"


    // $ANTLR start "ruleSetType"
    // InternalSpringGen.g:1955:1: ruleSetType returns [EObject current=null] : (otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) ;
    public final EObject ruleSetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:1961:2: ( (otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) )
            // InternalSpringGen.g:1962:2: (otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            {
            // InternalSpringGen.g:1962:2: (otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            // InternalSpringGen.g:1963:3: otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getSetTypeAccess().getSetKeyword_0());
            		
            // InternalSpringGen.g:1967:3: ( (lv_type_1_0= ruleType ) )
            // InternalSpringGen.g:1968:4: (lv_type_1_0= ruleType )
            {
            // InternalSpringGen.g:1968:4: (lv_type_1_0= ruleType )
            // InternalSpringGen.g:1969:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSetTypeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_51);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.example.springgen.SpringGen.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,52,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSetTypeAccess().getGreaterThanSignKeyword_2());
            		

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
    // $ANTLR end "ruleSetType"


    // $ANTLR start "entryRuleValueTypes"
    // InternalSpringGen.g:1994:1: entryRuleValueTypes returns [EObject current=null] : iv_ruleValueTypes= ruleValueTypes EOF ;
    public final EObject entryRuleValueTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueTypes = null;


        try {
            // InternalSpringGen.g:1994:51: (iv_ruleValueTypes= ruleValueTypes EOF )
            // InternalSpringGen.g:1995:2: iv_ruleValueTypes= ruleValueTypes EOF
            {
             newCompositeNode(grammarAccess.getValueTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueTypes=ruleValueTypes();

            state._fsp--;

             current =iv_ruleValueTypes; 
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
    // $ANTLR end "entryRuleValueTypes"


    // $ANTLR start "ruleValueTypes"
    // InternalSpringGen.g:2001:1: ruleValueTypes returns [EObject current=null] : ( ( (lv_FLOAT_0_0= 'float' ) ) | ( (lv_LONG_1_0= 'long' ) ) | ( (lv_INTEGER_2_0= 'int' ) ) | ( (lv_CHAR_3_0= 'char' ) ) | ( (lv_BOOLEAN_4_0= 'boolean' ) ) | ( (lv_BYTE_5_0= 'byte' ) ) | ( (lv_STRING_6_0= 'String' ) ) ) ;
    public final EObject ruleValueTypes() throws RecognitionException {
        EObject current = null;

        Token lv_FLOAT_0_0=null;
        Token lv_LONG_1_0=null;
        Token lv_INTEGER_2_0=null;
        Token lv_CHAR_3_0=null;
        Token lv_BOOLEAN_4_0=null;
        Token lv_BYTE_5_0=null;
        Token lv_STRING_6_0=null;


        	enterRule();

        try {
            // InternalSpringGen.g:2007:2: ( ( ( (lv_FLOAT_0_0= 'float' ) ) | ( (lv_LONG_1_0= 'long' ) ) | ( (lv_INTEGER_2_0= 'int' ) ) | ( (lv_CHAR_3_0= 'char' ) ) | ( (lv_BOOLEAN_4_0= 'boolean' ) ) | ( (lv_BYTE_5_0= 'byte' ) ) | ( (lv_STRING_6_0= 'String' ) ) ) )
            // InternalSpringGen.g:2008:2: ( ( (lv_FLOAT_0_0= 'float' ) ) | ( (lv_LONG_1_0= 'long' ) ) | ( (lv_INTEGER_2_0= 'int' ) ) | ( (lv_CHAR_3_0= 'char' ) ) | ( (lv_BOOLEAN_4_0= 'boolean' ) ) | ( (lv_BYTE_5_0= 'byte' ) ) | ( (lv_STRING_6_0= 'String' ) ) )
            {
            // InternalSpringGen.g:2008:2: ( ( (lv_FLOAT_0_0= 'float' ) ) | ( (lv_LONG_1_0= 'long' ) ) | ( (lv_INTEGER_2_0= 'int' ) ) | ( (lv_CHAR_3_0= 'char' ) ) | ( (lv_BOOLEAN_4_0= 'boolean' ) ) | ( (lv_BYTE_5_0= 'byte' ) ) | ( (lv_STRING_6_0= 'String' ) ) )
            int alt31=7;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt31=1;
                }
                break;
            case 55:
                {
                alt31=2;
                }
                break;
            case 56:
                {
                alt31=3;
                }
                break;
            case 57:
                {
                alt31=4;
                }
                break;
            case 58:
                {
                alt31=5;
                }
                break;
            case 59:
                {
                alt31=6;
                }
                break;
            case 60:
                {
                alt31=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalSpringGen.g:2009:3: ( (lv_FLOAT_0_0= 'float' ) )
                    {
                    // InternalSpringGen.g:2009:3: ( (lv_FLOAT_0_0= 'float' ) )
                    // InternalSpringGen.g:2010:4: (lv_FLOAT_0_0= 'float' )
                    {
                    // InternalSpringGen.g:2010:4: (lv_FLOAT_0_0= 'float' )
                    // InternalSpringGen.g:2011:5: lv_FLOAT_0_0= 'float'
                    {
                    lv_FLOAT_0_0=(Token)match(input,54,FOLLOW_2); 

                    					newLeafNode(lv_FLOAT_0_0, grammarAccess.getValueTypesAccess().getFLOATFloatKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueTypesRule());
                    					}
                    					setWithLastConsumed(current, "FLOAT", lv_FLOAT_0_0, "float");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpringGen.g:2024:3: ( (lv_LONG_1_0= 'long' ) )
                    {
                    // InternalSpringGen.g:2024:3: ( (lv_LONG_1_0= 'long' ) )
                    // InternalSpringGen.g:2025:4: (lv_LONG_1_0= 'long' )
                    {
                    // InternalSpringGen.g:2025:4: (lv_LONG_1_0= 'long' )
                    // InternalSpringGen.g:2026:5: lv_LONG_1_0= 'long'
                    {
                    lv_LONG_1_0=(Token)match(input,55,FOLLOW_2); 

                    					newLeafNode(lv_LONG_1_0, grammarAccess.getValueTypesAccess().getLONGLongKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueTypesRule());
                    					}
                    					setWithLastConsumed(current, "LONG", lv_LONG_1_0, "long");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSpringGen.g:2039:3: ( (lv_INTEGER_2_0= 'int' ) )
                    {
                    // InternalSpringGen.g:2039:3: ( (lv_INTEGER_2_0= 'int' ) )
                    // InternalSpringGen.g:2040:4: (lv_INTEGER_2_0= 'int' )
                    {
                    // InternalSpringGen.g:2040:4: (lv_INTEGER_2_0= 'int' )
                    // InternalSpringGen.g:2041:5: lv_INTEGER_2_0= 'int'
                    {
                    lv_INTEGER_2_0=(Token)match(input,56,FOLLOW_2); 

                    					newLeafNode(lv_INTEGER_2_0, grammarAccess.getValueTypesAccess().getINTEGERIntKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueTypesRule());
                    					}
                    					setWithLastConsumed(current, "INTEGER", lv_INTEGER_2_0, "int");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSpringGen.g:2054:3: ( (lv_CHAR_3_0= 'char' ) )
                    {
                    // InternalSpringGen.g:2054:3: ( (lv_CHAR_3_0= 'char' ) )
                    // InternalSpringGen.g:2055:4: (lv_CHAR_3_0= 'char' )
                    {
                    // InternalSpringGen.g:2055:4: (lv_CHAR_3_0= 'char' )
                    // InternalSpringGen.g:2056:5: lv_CHAR_3_0= 'char'
                    {
                    lv_CHAR_3_0=(Token)match(input,57,FOLLOW_2); 

                    					newLeafNode(lv_CHAR_3_0, grammarAccess.getValueTypesAccess().getCHARCharKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueTypesRule());
                    					}
                    					setWithLastConsumed(current, "CHAR", lv_CHAR_3_0, "char");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSpringGen.g:2069:3: ( (lv_BOOLEAN_4_0= 'boolean' ) )
                    {
                    // InternalSpringGen.g:2069:3: ( (lv_BOOLEAN_4_0= 'boolean' ) )
                    // InternalSpringGen.g:2070:4: (lv_BOOLEAN_4_0= 'boolean' )
                    {
                    // InternalSpringGen.g:2070:4: (lv_BOOLEAN_4_0= 'boolean' )
                    // InternalSpringGen.g:2071:5: lv_BOOLEAN_4_0= 'boolean'
                    {
                    lv_BOOLEAN_4_0=(Token)match(input,58,FOLLOW_2); 

                    					newLeafNode(lv_BOOLEAN_4_0, grammarAccess.getValueTypesAccess().getBOOLEANBooleanKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueTypesRule());
                    					}
                    					setWithLastConsumed(current, "BOOLEAN", lv_BOOLEAN_4_0, "boolean");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalSpringGen.g:2084:3: ( (lv_BYTE_5_0= 'byte' ) )
                    {
                    // InternalSpringGen.g:2084:3: ( (lv_BYTE_5_0= 'byte' ) )
                    // InternalSpringGen.g:2085:4: (lv_BYTE_5_0= 'byte' )
                    {
                    // InternalSpringGen.g:2085:4: (lv_BYTE_5_0= 'byte' )
                    // InternalSpringGen.g:2086:5: lv_BYTE_5_0= 'byte'
                    {
                    lv_BYTE_5_0=(Token)match(input,59,FOLLOW_2); 

                    					newLeafNode(lv_BYTE_5_0, grammarAccess.getValueTypesAccess().getBYTEByteKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueTypesRule());
                    					}
                    					setWithLastConsumed(current, "BYTE", lv_BYTE_5_0, "byte");
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalSpringGen.g:2099:3: ( (lv_STRING_6_0= 'String' ) )
                    {
                    // InternalSpringGen.g:2099:3: ( (lv_STRING_6_0= 'String' ) )
                    // InternalSpringGen.g:2100:4: (lv_STRING_6_0= 'String' )
                    {
                    // InternalSpringGen.g:2100:4: (lv_STRING_6_0= 'String' )
                    // InternalSpringGen.g:2101:5: lv_STRING_6_0= 'String'
                    {
                    lv_STRING_6_0=(Token)match(input,60,FOLLOW_2); 

                    					newLeafNode(lv_STRING_6_0, grammarAccess.getValueTypesAccess().getSTRINGStringKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueTypesRule());
                    					}
                    					setWithLastConsumed(current, "STRING", lv_STRING_6_0, "String");
                    				

                    }


                    }


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
    // $ANTLR end "ruleValueTypes"


    // $ANTLR start "entryRuleHttpMethods"
    // InternalSpringGen.g:2117:1: entryRuleHttpMethods returns [EObject current=null] : iv_ruleHttpMethods= ruleHttpMethods EOF ;
    public final EObject entryRuleHttpMethods() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpMethods = null;


        try {
            // InternalSpringGen.g:2117:52: (iv_ruleHttpMethods= ruleHttpMethods EOF )
            // InternalSpringGen.g:2118:2: iv_ruleHttpMethods= ruleHttpMethods EOF
            {
             newCompositeNode(grammarAccess.getHttpMethodsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHttpMethods=ruleHttpMethods();

            state._fsp--;

             current =iv_ruleHttpMethods; 
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
    // $ANTLR end "entryRuleHttpMethods"


    // $ANTLR start "ruleHttpMethods"
    // InternalSpringGen.g:2124:1: ruleHttpMethods returns [EObject current=null] : ( ( (lv_GET_0_0= 'GET' ) ) | ( (lv_DELETE_1_0= 'DELETE' ) ) | ( (lv_POST_2_0= 'POST' ) ) | ( (lv_PUT_3_0= 'PUT' ) ) | ( (lv_PATCH_4_0= 'PATCH' ) ) ) ;
    public final EObject ruleHttpMethods() throws RecognitionException {
        EObject current = null;

        Token lv_GET_0_0=null;
        Token lv_DELETE_1_0=null;
        Token lv_POST_2_0=null;
        Token lv_PUT_3_0=null;
        Token lv_PATCH_4_0=null;


        	enterRule();

        try {
            // InternalSpringGen.g:2130:2: ( ( ( (lv_GET_0_0= 'GET' ) ) | ( (lv_DELETE_1_0= 'DELETE' ) ) | ( (lv_POST_2_0= 'POST' ) ) | ( (lv_PUT_3_0= 'PUT' ) ) | ( (lv_PATCH_4_0= 'PATCH' ) ) ) )
            // InternalSpringGen.g:2131:2: ( ( (lv_GET_0_0= 'GET' ) ) | ( (lv_DELETE_1_0= 'DELETE' ) ) | ( (lv_POST_2_0= 'POST' ) ) | ( (lv_PUT_3_0= 'PUT' ) ) | ( (lv_PATCH_4_0= 'PATCH' ) ) )
            {
            // InternalSpringGen.g:2131:2: ( ( (lv_GET_0_0= 'GET' ) ) | ( (lv_DELETE_1_0= 'DELETE' ) ) | ( (lv_POST_2_0= 'POST' ) ) | ( (lv_PUT_3_0= 'PUT' ) ) | ( (lv_PATCH_4_0= 'PATCH' ) ) )
            int alt32=5;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt32=1;
                }
                break;
            case 62:
                {
                alt32=2;
                }
                break;
            case 63:
                {
                alt32=3;
                }
                break;
            case 64:
                {
                alt32=4;
                }
                break;
            case 65:
                {
                alt32=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalSpringGen.g:2132:3: ( (lv_GET_0_0= 'GET' ) )
                    {
                    // InternalSpringGen.g:2132:3: ( (lv_GET_0_0= 'GET' ) )
                    // InternalSpringGen.g:2133:4: (lv_GET_0_0= 'GET' )
                    {
                    // InternalSpringGen.g:2133:4: (lv_GET_0_0= 'GET' )
                    // InternalSpringGen.g:2134:5: lv_GET_0_0= 'GET'
                    {
                    lv_GET_0_0=(Token)match(input,61,FOLLOW_2); 

                    					newLeafNode(lv_GET_0_0, grammarAccess.getHttpMethodsAccess().getGETGETKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHttpMethodsRule());
                    					}
                    					setWithLastConsumed(current, "GET", lv_GET_0_0, "GET");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpringGen.g:2147:3: ( (lv_DELETE_1_0= 'DELETE' ) )
                    {
                    // InternalSpringGen.g:2147:3: ( (lv_DELETE_1_0= 'DELETE' ) )
                    // InternalSpringGen.g:2148:4: (lv_DELETE_1_0= 'DELETE' )
                    {
                    // InternalSpringGen.g:2148:4: (lv_DELETE_1_0= 'DELETE' )
                    // InternalSpringGen.g:2149:5: lv_DELETE_1_0= 'DELETE'
                    {
                    lv_DELETE_1_0=(Token)match(input,62,FOLLOW_2); 

                    					newLeafNode(lv_DELETE_1_0, grammarAccess.getHttpMethodsAccess().getDELETEDELETEKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHttpMethodsRule());
                    					}
                    					setWithLastConsumed(current, "DELETE", lv_DELETE_1_0, "DELETE");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSpringGen.g:2162:3: ( (lv_POST_2_0= 'POST' ) )
                    {
                    // InternalSpringGen.g:2162:3: ( (lv_POST_2_0= 'POST' ) )
                    // InternalSpringGen.g:2163:4: (lv_POST_2_0= 'POST' )
                    {
                    // InternalSpringGen.g:2163:4: (lv_POST_2_0= 'POST' )
                    // InternalSpringGen.g:2164:5: lv_POST_2_0= 'POST'
                    {
                    lv_POST_2_0=(Token)match(input,63,FOLLOW_2); 

                    					newLeafNode(lv_POST_2_0, grammarAccess.getHttpMethodsAccess().getPOSTPOSTKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHttpMethodsRule());
                    					}
                    					setWithLastConsumed(current, "POST", lv_POST_2_0, "POST");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSpringGen.g:2177:3: ( (lv_PUT_3_0= 'PUT' ) )
                    {
                    // InternalSpringGen.g:2177:3: ( (lv_PUT_3_0= 'PUT' ) )
                    // InternalSpringGen.g:2178:4: (lv_PUT_3_0= 'PUT' )
                    {
                    // InternalSpringGen.g:2178:4: (lv_PUT_3_0= 'PUT' )
                    // InternalSpringGen.g:2179:5: lv_PUT_3_0= 'PUT'
                    {
                    lv_PUT_3_0=(Token)match(input,64,FOLLOW_2); 

                    					newLeafNode(lv_PUT_3_0, grammarAccess.getHttpMethodsAccess().getPUTPUTKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHttpMethodsRule());
                    					}
                    					setWithLastConsumed(current, "PUT", lv_PUT_3_0, "PUT");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSpringGen.g:2192:3: ( (lv_PATCH_4_0= 'PATCH' ) )
                    {
                    // InternalSpringGen.g:2192:3: ( (lv_PATCH_4_0= 'PATCH' ) )
                    // InternalSpringGen.g:2193:4: (lv_PATCH_4_0= 'PATCH' )
                    {
                    // InternalSpringGen.g:2193:4: (lv_PATCH_4_0= 'PATCH' )
                    // InternalSpringGen.g:2194:5: lv_PATCH_4_0= 'PATCH'
                    {
                    lv_PATCH_4_0=(Token)match(input,65,FOLLOW_2); 

                    					newLeafNode(lv_PATCH_4_0, grammarAccess.getHttpMethodsAccess().getPATCHPATCHKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHttpMethodsRule());
                    					}
                    					setWithLastConsumed(current, "PATCH", lv_PATCH_4_0, "PATCH");
                    				

                    }


                    }


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
    // $ANTLR end "ruleHttpMethods"


    // $ANTLR start "entryRuleRDBMS"
    // InternalSpringGen.g:2210:1: entryRuleRDBMS returns [EObject current=null] : iv_ruleRDBMS= ruleRDBMS EOF ;
    public final EObject entryRuleRDBMS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRDBMS = null;


        try {
            // InternalSpringGen.g:2210:46: (iv_ruleRDBMS= ruleRDBMS EOF )
            // InternalSpringGen.g:2211:2: iv_ruleRDBMS= ruleRDBMS EOF
            {
             newCompositeNode(grammarAccess.getRDBMSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRDBMS=ruleRDBMS();

            state._fsp--;

             current =iv_ruleRDBMS; 
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
    // $ANTLR end "entryRuleRDBMS"


    // $ANTLR start "ruleRDBMS"
    // InternalSpringGen.g:2217:1: ruleRDBMS returns [EObject current=null] : ( ( (lv_MYSQL_0_0= 'MySQL' ) ) | ( (lv_POSTGRES_1_0= 'Postgres' ) ) | ( (lv_MARIADB_2_0= 'MariaDB' ) ) | ( (lv_H2_3_0= 'H2' ) ) | ( (lv_ORACLE_4_0= 'Oracle' ) ) ) ;
    public final EObject ruleRDBMS() throws RecognitionException {
        EObject current = null;

        Token lv_MYSQL_0_0=null;
        Token lv_POSTGRES_1_0=null;
        Token lv_MARIADB_2_0=null;
        Token lv_H2_3_0=null;
        Token lv_ORACLE_4_0=null;


        	enterRule();

        try {
            // InternalSpringGen.g:2223:2: ( ( ( (lv_MYSQL_0_0= 'MySQL' ) ) | ( (lv_POSTGRES_1_0= 'Postgres' ) ) | ( (lv_MARIADB_2_0= 'MariaDB' ) ) | ( (lv_H2_3_0= 'H2' ) ) | ( (lv_ORACLE_4_0= 'Oracle' ) ) ) )
            // InternalSpringGen.g:2224:2: ( ( (lv_MYSQL_0_0= 'MySQL' ) ) | ( (lv_POSTGRES_1_0= 'Postgres' ) ) | ( (lv_MARIADB_2_0= 'MariaDB' ) ) | ( (lv_H2_3_0= 'H2' ) ) | ( (lv_ORACLE_4_0= 'Oracle' ) ) )
            {
            // InternalSpringGen.g:2224:2: ( ( (lv_MYSQL_0_0= 'MySQL' ) ) | ( (lv_POSTGRES_1_0= 'Postgres' ) ) | ( (lv_MARIADB_2_0= 'MariaDB' ) ) | ( (lv_H2_3_0= 'H2' ) ) | ( (lv_ORACLE_4_0= 'Oracle' ) ) )
            int alt33=5;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt33=1;
                }
                break;
            case 67:
                {
                alt33=2;
                }
                break;
            case 68:
                {
                alt33=3;
                }
                break;
            case 69:
                {
                alt33=4;
                }
                break;
            case 70:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalSpringGen.g:2225:3: ( (lv_MYSQL_0_0= 'MySQL' ) )
                    {
                    // InternalSpringGen.g:2225:3: ( (lv_MYSQL_0_0= 'MySQL' ) )
                    // InternalSpringGen.g:2226:4: (lv_MYSQL_0_0= 'MySQL' )
                    {
                    // InternalSpringGen.g:2226:4: (lv_MYSQL_0_0= 'MySQL' )
                    // InternalSpringGen.g:2227:5: lv_MYSQL_0_0= 'MySQL'
                    {
                    lv_MYSQL_0_0=(Token)match(input,66,FOLLOW_2); 

                    					newLeafNode(lv_MYSQL_0_0, grammarAccess.getRDBMSAccess().getMYSQLMySQLKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRDBMSRule());
                    					}
                    					setWithLastConsumed(current, "MYSQL", lv_MYSQL_0_0, "MySQL");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpringGen.g:2240:3: ( (lv_POSTGRES_1_0= 'Postgres' ) )
                    {
                    // InternalSpringGen.g:2240:3: ( (lv_POSTGRES_1_0= 'Postgres' ) )
                    // InternalSpringGen.g:2241:4: (lv_POSTGRES_1_0= 'Postgres' )
                    {
                    // InternalSpringGen.g:2241:4: (lv_POSTGRES_1_0= 'Postgres' )
                    // InternalSpringGen.g:2242:5: lv_POSTGRES_1_0= 'Postgres'
                    {
                    lv_POSTGRES_1_0=(Token)match(input,67,FOLLOW_2); 

                    					newLeafNode(lv_POSTGRES_1_0, grammarAccess.getRDBMSAccess().getPOSTGRESPostgresKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRDBMSRule());
                    					}
                    					setWithLastConsumed(current, "POSTGRES", lv_POSTGRES_1_0, "Postgres");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSpringGen.g:2255:3: ( (lv_MARIADB_2_0= 'MariaDB' ) )
                    {
                    // InternalSpringGen.g:2255:3: ( (lv_MARIADB_2_0= 'MariaDB' ) )
                    // InternalSpringGen.g:2256:4: (lv_MARIADB_2_0= 'MariaDB' )
                    {
                    // InternalSpringGen.g:2256:4: (lv_MARIADB_2_0= 'MariaDB' )
                    // InternalSpringGen.g:2257:5: lv_MARIADB_2_0= 'MariaDB'
                    {
                    lv_MARIADB_2_0=(Token)match(input,68,FOLLOW_2); 

                    					newLeafNode(lv_MARIADB_2_0, grammarAccess.getRDBMSAccess().getMARIADBMariaDBKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRDBMSRule());
                    					}
                    					setWithLastConsumed(current, "MARIADB", lv_MARIADB_2_0, "MariaDB");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSpringGen.g:2270:3: ( (lv_H2_3_0= 'H2' ) )
                    {
                    // InternalSpringGen.g:2270:3: ( (lv_H2_3_0= 'H2' ) )
                    // InternalSpringGen.g:2271:4: (lv_H2_3_0= 'H2' )
                    {
                    // InternalSpringGen.g:2271:4: (lv_H2_3_0= 'H2' )
                    // InternalSpringGen.g:2272:5: lv_H2_3_0= 'H2'
                    {
                    lv_H2_3_0=(Token)match(input,69,FOLLOW_2); 

                    					newLeafNode(lv_H2_3_0, grammarAccess.getRDBMSAccess().getH2H2Keyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRDBMSRule());
                    					}
                    					setWithLastConsumed(current, "H2", lv_H2_3_0, "H2");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSpringGen.g:2285:3: ( (lv_ORACLE_4_0= 'Oracle' ) )
                    {
                    // InternalSpringGen.g:2285:3: ( (lv_ORACLE_4_0= 'Oracle' ) )
                    // InternalSpringGen.g:2286:4: (lv_ORACLE_4_0= 'Oracle' )
                    {
                    // InternalSpringGen.g:2286:4: (lv_ORACLE_4_0= 'Oracle' )
                    // InternalSpringGen.g:2287:5: lv_ORACLE_4_0= 'Oracle'
                    {
                    lv_ORACLE_4_0=(Token)match(input,70,FOLLOW_2); 

                    					newLeafNode(lv_ORACLE_4_0, grammarAccess.getRDBMSAccess().getORACLEOracleKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRDBMSRule());
                    					}
                    					setWithLastConsumed(current, "ORACLE", lv_ORACLE_4_0, "Oracle");
                    				

                    }


                    }


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
    // $ANTLR end "ruleRDBMS"


    // $ANTLR start "entryRuleDatabaseRelations"
    // InternalSpringGen.g:2303:1: entryRuleDatabaseRelations returns [EObject current=null] : iv_ruleDatabaseRelations= ruleDatabaseRelations EOF ;
    public final EObject entryRuleDatabaseRelations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabaseRelations = null;


        try {
            // InternalSpringGen.g:2303:58: (iv_ruleDatabaseRelations= ruleDatabaseRelations EOF )
            // InternalSpringGen.g:2304:2: iv_ruleDatabaseRelations= ruleDatabaseRelations EOF
            {
             newCompositeNode(grammarAccess.getDatabaseRelationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatabaseRelations=ruleDatabaseRelations();

            state._fsp--;

             current =iv_ruleDatabaseRelations; 
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
    // $ANTLR end "entryRuleDatabaseRelations"


    // $ANTLR start "ruleDatabaseRelations"
    // InternalSpringGen.g:2310:1: ruleDatabaseRelations returns [EObject current=null] : ( ( (lv_MANY_TO_MANY_0_0= 'ManyToMany' ) ) | ( (lv_MANY_TO_ONE_1_0= 'ManyToOne' ) ) | ( (lv_ONE_TO_MANY_2_0= 'OneToMany' ) ) ) ;
    public final EObject ruleDatabaseRelations() throws RecognitionException {
        EObject current = null;

        Token lv_MANY_TO_MANY_0_0=null;
        Token lv_MANY_TO_ONE_1_0=null;
        Token lv_ONE_TO_MANY_2_0=null;


        	enterRule();

        try {
            // InternalSpringGen.g:2316:2: ( ( ( (lv_MANY_TO_MANY_0_0= 'ManyToMany' ) ) | ( (lv_MANY_TO_ONE_1_0= 'ManyToOne' ) ) | ( (lv_ONE_TO_MANY_2_0= 'OneToMany' ) ) ) )
            // InternalSpringGen.g:2317:2: ( ( (lv_MANY_TO_MANY_0_0= 'ManyToMany' ) ) | ( (lv_MANY_TO_ONE_1_0= 'ManyToOne' ) ) | ( (lv_ONE_TO_MANY_2_0= 'OneToMany' ) ) )
            {
            // InternalSpringGen.g:2317:2: ( ( (lv_MANY_TO_MANY_0_0= 'ManyToMany' ) ) | ( (lv_MANY_TO_ONE_1_0= 'ManyToOne' ) ) | ( (lv_ONE_TO_MANY_2_0= 'OneToMany' ) ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt34=1;
                }
                break;
            case 72:
                {
                alt34=2;
                }
                break;
            case 73:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalSpringGen.g:2318:3: ( (lv_MANY_TO_MANY_0_0= 'ManyToMany' ) )
                    {
                    // InternalSpringGen.g:2318:3: ( (lv_MANY_TO_MANY_0_0= 'ManyToMany' ) )
                    // InternalSpringGen.g:2319:4: (lv_MANY_TO_MANY_0_0= 'ManyToMany' )
                    {
                    // InternalSpringGen.g:2319:4: (lv_MANY_TO_MANY_0_0= 'ManyToMany' )
                    // InternalSpringGen.g:2320:5: lv_MANY_TO_MANY_0_0= 'ManyToMany'
                    {
                    lv_MANY_TO_MANY_0_0=(Token)match(input,71,FOLLOW_2); 

                    					newLeafNode(lv_MANY_TO_MANY_0_0, grammarAccess.getDatabaseRelationsAccess().getMANY_TO_MANYManyToManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDatabaseRelationsRule());
                    					}
                    					setWithLastConsumed(current, "MANY_TO_MANY", lv_MANY_TO_MANY_0_0, "ManyToMany");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpringGen.g:2333:3: ( (lv_MANY_TO_ONE_1_0= 'ManyToOne' ) )
                    {
                    // InternalSpringGen.g:2333:3: ( (lv_MANY_TO_ONE_1_0= 'ManyToOne' ) )
                    // InternalSpringGen.g:2334:4: (lv_MANY_TO_ONE_1_0= 'ManyToOne' )
                    {
                    // InternalSpringGen.g:2334:4: (lv_MANY_TO_ONE_1_0= 'ManyToOne' )
                    // InternalSpringGen.g:2335:5: lv_MANY_TO_ONE_1_0= 'ManyToOne'
                    {
                    lv_MANY_TO_ONE_1_0=(Token)match(input,72,FOLLOW_2); 

                    					newLeafNode(lv_MANY_TO_ONE_1_0, grammarAccess.getDatabaseRelationsAccess().getMANY_TO_ONEManyToOneKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDatabaseRelationsRule());
                    					}
                    					setWithLastConsumed(current, "MANY_TO_ONE", lv_MANY_TO_ONE_1_0, "ManyToOne");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSpringGen.g:2348:3: ( (lv_ONE_TO_MANY_2_0= 'OneToMany' ) )
                    {
                    // InternalSpringGen.g:2348:3: ( (lv_ONE_TO_MANY_2_0= 'OneToMany' ) )
                    // InternalSpringGen.g:2349:4: (lv_ONE_TO_MANY_2_0= 'OneToMany' )
                    {
                    // InternalSpringGen.g:2349:4: (lv_ONE_TO_MANY_2_0= 'OneToMany' )
                    // InternalSpringGen.g:2350:5: lv_ONE_TO_MANY_2_0= 'OneToMany'
                    {
                    lv_ONE_TO_MANY_2_0=(Token)match(input,73,FOLLOW_2); 

                    					newLeafNode(lv_ONE_TO_MANY_2_0, grammarAccess.getDatabaseRelationsAccess().getONE_TO_MANYOneToManyKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDatabaseRelationsRule());
                    					}
                    					setWithLastConsumed(current, "ONE_TO_MANY", lv_ONE_TO_MANY_2_0, "OneToMany");
                    				

                    }


                    }


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
    // $ANTLR end "ruleDatabaseRelations"


    // $ANTLR start "entryRuleParamTransfer"
    // InternalSpringGen.g:2366:1: entryRuleParamTransfer returns [EObject current=null] : iv_ruleParamTransfer= ruleParamTransfer EOF ;
    public final EObject entryRuleParamTransfer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamTransfer = null;


        try {
            // InternalSpringGen.g:2366:54: (iv_ruleParamTransfer= ruleParamTransfer EOF )
            // InternalSpringGen.g:2367:2: iv_ruleParamTransfer= ruleParamTransfer EOF
            {
             newCompositeNode(grammarAccess.getParamTransferRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamTransfer=ruleParamTransfer();

            state._fsp--;

             current =iv_ruleParamTransfer; 
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
    // $ANTLR end "entryRuleParamTransfer"


    // $ANTLR start "ruleParamTransfer"
    // InternalSpringGen.g:2373:1: ruleParamTransfer returns [EObject current=null] : ( ( (lv_REQUEST_BODY_0_0= 'RequestBody' ) ) | ( (lv_REQUEST_PARAM_1_0= 'RequestParam' ) ) | ( (lv_PATH_VARIABLE_2_0= 'PathVariable' ) ) ) ;
    public final EObject ruleParamTransfer() throws RecognitionException {
        EObject current = null;

        Token lv_REQUEST_BODY_0_0=null;
        Token lv_REQUEST_PARAM_1_0=null;
        Token lv_PATH_VARIABLE_2_0=null;


        	enterRule();

        try {
            // InternalSpringGen.g:2379:2: ( ( ( (lv_REQUEST_BODY_0_0= 'RequestBody' ) ) | ( (lv_REQUEST_PARAM_1_0= 'RequestParam' ) ) | ( (lv_PATH_VARIABLE_2_0= 'PathVariable' ) ) ) )
            // InternalSpringGen.g:2380:2: ( ( (lv_REQUEST_BODY_0_0= 'RequestBody' ) ) | ( (lv_REQUEST_PARAM_1_0= 'RequestParam' ) ) | ( (lv_PATH_VARIABLE_2_0= 'PathVariable' ) ) )
            {
            // InternalSpringGen.g:2380:2: ( ( (lv_REQUEST_BODY_0_0= 'RequestBody' ) ) | ( (lv_REQUEST_PARAM_1_0= 'RequestParam' ) ) | ( (lv_PATH_VARIABLE_2_0= 'PathVariable' ) ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt35=1;
                }
                break;
            case 75:
                {
                alt35=2;
                }
                break;
            case 76:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalSpringGen.g:2381:3: ( (lv_REQUEST_BODY_0_0= 'RequestBody' ) )
                    {
                    // InternalSpringGen.g:2381:3: ( (lv_REQUEST_BODY_0_0= 'RequestBody' ) )
                    // InternalSpringGen.g:2382:4: (lv_REQUEST_BODY_0_0= 'RequestBody' )
                    {
                    // InternalSpringGen.g:2382:4: (lv_REQUEST_BODY_0_0= 'RequestBody' )
                    // InternalSpringGen.g:2383:5: lv_REQUEST_BODY_0_0= 'RequestBody'
                    {
                    lv_REQUEST_BODY_0_0=(Token)match(input,74,FOLLOW_2); 

                    					newLeafNode(lv_REQUEST_BODY_0_0, grammarAccess.getParamTransferAccess().getREQUEST_BODYRequestBodyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParamTransferRule());
                    					}
                    					setWithLastConsumed(current, "REQUEST_BODY", lv_REQUEST_BODY_0_0, "RequestBody");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpringGen.g:2396:3: ( (lv_REQUEST_PARAM_1_0= 'RequestParam' ) )
                    {
                    // InternalSpringGen.g:2396:3: ( (lv_REQUEST_PARAM_1_0= 'RequestParam' ) )
                    // InternalSpringGen.g:2397:4: (lv_REQUEST_PARAM_1_0= 'RequestParam' )
                    {
                    // InternalSpringGen.g:2397:4: (lv_REQUEST_PARAM_1_0= 'RequestParam' )
                    // InternalSpringGen.g:2398:5: lv_REQUEST_PARAM_1_0= 'RequestParam'
                    {
                    lv_REQUEST_PARAM_1_0=(Token)match(input,75,FOLLOW_2); 

                    					newLeafNode(lv_REQUEST_PARAM_1_0, grammarAccess.getParamTransferAccess().getREQUEST_PARAMRequestParamKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParamTransferRule());
                    					}
                    					setWithLastConsumed(current, "REQUEST_PARAM", lv_REQUEST_PARAM_1_0, "RequestParam");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSpringGen.g:2411:3: ( (lv_PATH_VARIABLE_2_0= 'PathVariable' ) )
                    {
                    // InternalSpringGen.g:2411:3: ( (lv_PATH_VARIABLE_2_0= 'PathVariable' ) )
                    // InternalSpringGen.g:2412:4: (lv_PATH_VARIABLE_2_0= 'PathVariable' )
                    {
                    // InternalSpringGen.g:2412:4: (lv_PATH_VARIABLE_2_0= 'PathVariable' )
                    // InternalSpringGen.g:2413:5: lv_PATH_VARIABLE_2_0= 'PathVariable'
                    {
                    lv_PATH_VARIABLE_2_0=(Token)match(input,76,FOLLOW_2); 

                    					newLeafNode(lv_PATH_VARIABLE_2_0, grammarAccess.getParamTransferAccess().getPATH_VARIABLEPathVariableKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParamTransferRule());
                    					}
                    					setWithLastConsumed(current, "PATH_VARIABLE", lv_PATH_VARIABLE_2_0, "PathVariable");
                    				

                    }


                    }


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
    // $ANTLR end "ruleParamTransfer"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0001000164009002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001000164001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007CL});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001000164021010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001000164021000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x1FC0000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0xE000001A00020040L,0x0000000000000003L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xE000001A00020000L,0x0000000000000003L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001800020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1FC8000000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x1FE8000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000020010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0004001800020000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004001000020000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0010000000000000L});

}