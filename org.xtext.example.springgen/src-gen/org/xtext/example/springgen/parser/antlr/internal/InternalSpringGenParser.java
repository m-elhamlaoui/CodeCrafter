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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'relation'", "'between'", "'and'", "'config'", "'{'", "'}'", "'server'", "'port'", "'contextPath'", "'database'", "'dbms'", "'name'", "'username'", "'password'", "'entity'", "'inherits'", "'Id'", "'dto'", "'service'", "'pertainingTo'", "'controller'", "'create'", "'entity:'", "'find'", "'delete'", "'operation'", "'returns'", "'raises'", "'implementation'", "'params'", "'('", "')'", "'action'", "'mappedAt'", "':'", "'default'", "'repository'", "'by'", "'customQuery'", "'List<'", "'>'", "'Set<'", "'float'", "'long'", "'int'", "'char'", "'boolean'", "'byte'", "'String'", "'GET'", "'DELETE'", "'POST'", "'PUT'", "'PATCH'", "'MySQL'", "'Postgres'", "'MariaDB'", "'H2'", "'Oracle'", "'ManyToMany'", "'ManyToOne'", "'OneToMany'", "'RequestBody'", "'RequestParam'", "'PathVariable'", "'dockerfile'", "'FROM'", "'RUN'", "'COPY'", "'EXPOSE'", "'ENV'", "'WORKDIR'", "'CMD'", "'angularApp'", "'component'", "'method'", "'module'", "'import'"
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
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__89=89;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

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
    // InternalSpringGen.g:71:1: ruleSpringBootProject returns [EObject current=null] : (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configuration_2_0= ruleProjectConfiguration ) )? ( (lv_elements_3_0= ruleProjectElement ) )* ( (lv_dockerfile_4_0= ruleDockerfile ) )? ( (lv_angularApp_5_0= ruleAngularApp ) )? ) ;
    public final EObject ruleSpringBootProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_configuration_2_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_dockerfile_4_0 = null;

        EObject lv_angularApp_5_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:77:2: ( (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configuration_2_0= ruleProjectConfiguration ) )? ( (lv_elements_3_0= ruleProjectElement ) )* ( (lv_dockerfile_4_0= ruleDockerfile ) )? ( (lv_angularApp_5_0= ruleAngularApp ) )? ) )
            // InternalSpringGen.g:78:2: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configuration_2_0= ruleProjectConfiguration ) )? ( (lv_elements_3_0= ruleProjectElement ) )* ( (lv_dockerfile_4_0= ruleDockerfile ) )? ( (lv_angularApp_5_0= ruleAngularApp ) )? )
            {
            // InternalSpringGen.g:78:2: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configuration_2_0= ruleProjectConfiguration ) )? ( (lv_elements_3_0= ruleProjectElement ) )* ( (lv_dockerfile_4_0= ruleDockerfile ) )? ( (lv_angularApp_5_0= ruleAngularApp ) )? )
            // InternalSpringGen.g:79:3: otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configuration_2_0= ruleProjectConfiguration ) )? ( (lv_elements_3_0= ruleProjectElement ) )* ( (lv_dockerfile_4_0= ruleDockerfile ) )? ( (lv_angularApp_5_0= ruleAngularApp ) )?
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

            // InternalSpringGen.g:139:3: ( (lv_dockerfile_4_0= ruleDockerfile ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==77) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSpringGen.g:140:4: (lv_dockerfile_4_0= ruleDockerfile )
                    {
                    // InternalSpringGen.g:140:4: (lv_dockerfile_4_0= ruleDockerfile )
                    // InternalSpringGen.g:141:5: lv_dockerfile_4_0= ruleDockerfile
                    {

                    					newCompositeNode(grammarAccess.getSpringBootProjectAccess().getDockerfileDockerfileParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_dockerfile_4_0=ruleDockerfile();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSpringBootProjectRule());
                    					}
                    					set(
                    						current,
                    						"dockerfile",
                    						lv_dockerfile_4_0,
                    						"org.xtext.example.springgen.SpringGen.Dockerfile");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSpringGen.g:158:3: ( (lv_angularApp_5_0= ruleAngularApp ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==85) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSpringGen.g:159:4: (lv_angularApp_5_0= ruleAngularApp )
                    {
                    // InternalSpringGen.g:159:4: (lv_angularApp_5_0= ruleAngularApp )
                    // InternalSpringGen.g:160:5: lv_angularApp_5_0= ruleAngularApp
                    {

                    					newCompositeNode(grammarAccess.getSpringBootProjectAccess().getAngularAppAngularAppParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_angularApp_5_0=ruleAngularApp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSpringBootProjectRule());
                    					}
                    					set(
                    						current,
                    						"angularApp",
                    						lv_angularApp_5_0,
                    						"org.xtext.example.springgen.SpringGen.AngularApp");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleSpringBootProject"


    // $ANTLR start "entryRuleProjectElement"
    // InternalSpringGen.g:181:1: entryRuleProjectElement returns [EObject current=null] : iv_ruleProjectElement= ruleProjectElement EOF ;
    public final EObject entryRuleProjectElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectElement = null;


        try {
            // InternalSpringGen.g:181:55: (iv_ruleProjectElement= ruleProjectElement EOF )
            // InternalSpringGen.g:182:2: iv_ruleProjectElement= ruleProjectElement EOF
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
    // InternalSpringGen.g:188:1: ruleProjectElement returns [EObject current=null] : (this_Entity_0= ruleEntity | this_EntityRelationship_1= ruleEntityRelationship | this_DTO_2= ruleDTO | this_Service_3= ruleService | this_Repository_4= ruleRepository | this_Controller_5= ruleController ) ;
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
            // InternalSpringGen.g:194:2: ( (this_Entity_0= ruleEntity | this_EntityRelationship_1= ruleEntityRelationship | this_DTO_2= ruleDTO | this_Service_3= ruleService | this_Repository_4= ruleRepository | this_Controller_5= ruleController ) )
            // InternalSpringGen.g:195:2: (this_Entity_0= ruleEntity | this_EntityRelationship_1= ruleEntityRelationship | this_DTO_2= ruleDTO | this_Service_3= ruleService | this_Repository_4= ruleRepository | this_Controller_5= ruleController )
            {
            // InternalSpringGen.g:195:2: (this_Entity_0= ruleEntity | this_EntityRelationship_1= ruleEntityRelationship | this_DTO_2= ruleDTO | this_Service_3= ruleService | this_Repository_4= ruleRepository | this_Controller_5= ruleController )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 29:
                {
                alt5=3;
                }
                break;
            case 30:
                {
                alt5=4;
                }
                break;
            case 48:
                {
                alt5=5;
                }
                break;
            case 32:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSpringGen.g:196:3: this_Entity_0= ruleEntity
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
                    // InternalSpringGen.g:205:3: this_EntityRelationship_1= ruleEntityRelationship
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
                    // InternalSpringGen.g:214:3: this_DTO_2= ruleDTO
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
                    // InternalSpringGen.g:223:3: this_Service_3= ruleService
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
                    // InternalSpringGen.g:232:3: this_Repository_4= ruleRepository
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
                    // InternalSpringGen.g:241:3: this_Controller_5= ruleController
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
    // InternalSpringGen.g:253:1: entryRuleEntityRelationship returns [EObject current=null] : iv_ruleEntityRelationship= ruleEntityRelationship EOF ;
    public final EObject entryRuleEntityRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityRelationship = null;


        try {
            // InternalSpringGen.g:253:59: (iv_ruleEntityRelationship= ruleEntityRelationship EOF )
            // InternalSpringGen.g:254:2: iv_ruleEntityRelationship= ruleEntityRelationship EOF
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
    // InternalSpringGen.g:260:1: ruleEntityRelationship returns [EObject current=null] : (otherlv_0= 'relation' ( (lv_type_1_0= ruleDatabaseRelations ) ) otherlv_2= 'between' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) ) ;
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
            // InternalSpringGen.g:266:2: ( (otherlv_0= 'relation' ( (lv_type_1_0= ruleDatabaseRelations ) ) otherlv_2= 'between' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalSpringGen.g:267:2: (otherlv_0= 'relation' ( (lv_type_1_0= ruleDatabaseRelations ) ) otherlv_2= 'between' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalSpringGen.g:267:2: (otherlv_0= 'relation' ( (lv_type_1_0= ruleDatabaseRelations ) ) otherlv_2= 'between' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) ) )
            // InternalSpringGen.g:268:3: otherlv_0= 'relation' ( (lv_type_1_0= ruleDatabaseRelations ) ) otherlv_2= 'between' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'and' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityRelationshipAccess().getRelationKeyword_0());
            		
            // InternalSpringGen.g:272:3: ( (lv_type_1_0= ruleDatabaseRelations ) )
            // InternalSpringGen.g:273:4: (lv_type_1_0= ruleDatabaseRelations )
            {
            // InternalSpringGen.g:273:4: (lv_type_1_0= ruleDatabaseRelations )
            // InternalSpringGen.g:274:5: lv_type_1_0= ruleDatabaseRelations
            {

            					newCompositeNode(grammarAccess.getEntityRelationshipAccess().getTypeDatabaseRelationsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
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
            		
            // InternalSpringGen.g:295:3: ( (otherlv_3= RULE_ID ) )
            // InternalSpringGen.g:296:4: (otherlv_3= RULE_ID )
            {
            // InternalSpringGen.g:296:4: (otherlv_3= RULE_ID )
            // InternalSpringGen.g:297:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRelationshipRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_3, grammarAccess.getEntityRelationshipAccess().getSourceEntityCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityRelationshipAccess().getAndKeyword_4());
            		
            // InternalSpringGen.g:312:3: ( (otherlv_5= RULE_ID ) )
            // InternalSpringGen.g:313:4: (otherlv_5= RULE_ID )
            {
            // InternalSpringGen.g:313:4: (otherlv_5= RULE_ID )
            // InternalSpringGen.g:314:5: otherlv_5= RULE_ID
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
    // InternalSpringGen.g:329:1: entryRuleProjectConfiguration returns [EObject current=null] : iv_ruleProjectConfiguration= ruleProjectConfiguration EOF ;
    public final EObject entryRuleProjectConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectConfiguration = null;


        try {
            // InternalSpringGen.g:329:61: (iv_ruleProjectConfiguration= ruleProjectConfiguration EOF )
            // InternalSpringGen.g:330:2: iv_ruleProjectConfiguration= ruleProjectConfiguration EOF
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
    // InternalSpringGen.g:336:1: ruleProjectConfiguration returns [EObject current=null] : (otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerConfiguration ) )? ( (lv_database_3_0= ruleDatabaseConfiguration ) ) otherlv_4= '}' ) ;
    public final EObject ruleProjectConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_server_2_0 = null;

        EObject lv_database_3_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:342:2: ( (otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerConfiguration ) )? ( (lv_database_3_0= ruleDatabaseConfiguration ) ) otherlv_4= '}' ) )
            // InternalSpringGen.g:343:2: (otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerConfiguration ) )? ( (lv_database_3_0= ruleDatabaseConfiguration ) ) otherlv_4= '}' )
            {
            // InternalSpringGen.g:343:2: (otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerConfiguration ) )? ( (lv_database_3_0= ruleDatabaseConfiguration ) ) otherlv_4= '}' )
            // InternalSpringGen.g:344:3: otherlv_0= 'config' otherlv_1= '{' ( (lv_server_2_0= ruleServerConfiguration ) )? ( (lv_database_3_0= ruleDatabaseConfiguration ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectConfigurationAccess().getConfigKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectConfigurationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSpringGen.g:352:3: ( (lv_server_2_0= ruleServerConfiguration ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSpringGen.g:353:4: (lv_server_2_0= ruleServerConfiguration )
                    {
                    // InternalSpringGen.g:353:4: (lv_server_2_0= ruleServerConfiguration )
                    // InternalSpringGen.g:354:5: lv_server_2_0= ruleServerConfiguration
                    {

                    					newCompositeNode(grammarAccess.getProjectConfigurationAccess().getServerServerConfigurationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_11);
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

            // InternalSpringGen.g:371:3: ( (lv_database_3_0= ruleDatabaseConfiguration ) )
            // InternalSpringGen.g:372:4: (lv_database_3_0= ruleDatabaseConfiguration )
            {
            // InternalSpringGen.g:372:4: (lv_database_3_0= ruleDatabaseConfiguration )
            // InternalSpringGen.g:373:5: lv_database_3_0= ruleDatabaseConfiguration
            {

            					newCompositeNode(grammarAccess.getProjectConfigurationAccess().getDatabaseDatabaseConfigurationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
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
    // InternalSpringGen.g:398:1: entryRuleServerConfiguration returns [EObject current=null] : iv_ruleServerConfiguration= ruleServerConfiguration EOF ;
    public final EObject entryRuleServerConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerConfiguration = null;


        try {
            // InternalSpringGen.g:398:60: (iv_ruleServerConfiguration= ruleServerConfiguration EOF )
            // InternalSpringGen.g:399:2: iv_ruleServerConfiguration= ruleServerConfiguration EOF
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
    // InternalSpringGen.g:405:1: ruleServerConfiguration returns [EObject current=null] : (otherlv_0= 'server' otherlv_1= '{' otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) (otherlv_4= 'contextPath' ( (lv_contextPath_5_0= RULE_STRING ) ) )? otherlv_6= '}' ) ;
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
            // InternalSpringGen.g:411:2: ( (otherlv_0= 'server' otherlv_1= '{' otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) (otherlv_4= 'contextPath' ( (lv_contextPath_5_0= RULE_STRING ) ) )? otherlv_6= '}' ) )
            // InternalSpringGen.g:412:2: (otherlv_0= 'server' otherlv_1= '{' otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) (otherlv_4= 'contextPath' ( (lv_contextPath_5_0= RULE_STRING ) ) )? otherlv_6= '}' )
            {
            // InternalSpringGen.g:412:2: (otherlv_0= 'server' otherlv_1= '{' otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) (otherlv_4= 'contextPath' ( (lv_contextPath_5_0= RULE_STRING ) ) )? otherlv_6= '}' )
            // InternalSpringGen.g:413:3: otherlv_0= 'server' otherlv_1= '{' otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) (otherlv_4= 'contextPath' ( (lv_contextPath_5_0= RULE_STRING ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getServerConfigurationAccess().getServerKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getServerConfigurationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getServerConfigurationAccess().getPortKeyword_2());
            		
            // InternalSpringGen.g:425:3: ( (lv_port_3_0= RULE_INT ) )
            // InternalSpringGen.g:426:4: (lv_port_3_0= RULE_INT )
            {
            // InternalSpringGen.g:426:4: (lv_port_3_0= RULE_INT )
            // InternalSpringGen.g:427:5: lv_port_3_0= RULE_INT
            {
            lv_port_3_0=(Token)match(input,RULE_INT,FOLLOW_15); 

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

            // InternalSpringGen.g:443:3: (otherlv_4= 'contextPath' ( (lv_contextPath_5_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSpringGen.g:444:4: otherlv_4= 'contextPath' ( (lv_contextPath_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getServerConfigurationAccess().getContextPathKeyword_4_0());
                    			
                    // InternalSpringGen.g:448:4: ( (lv_contextPath_5_0= RULE_STRING ) )
                    // InternalSpringGen.g:449:5: (lv_contextPath_5_0= RULE_STRING )
                    {
                    // InternalSpringGen.g:449:5: (lv_contextPath_5_0= RULE_STRING )
                    // InternalSpringGen.g:450:6: lv_contextPath_5_0= RULE_STRING
                    {
                    lv_contextPath_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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
    // InternalSpringGen.g:475:1: entryRuleDatabaseConfiguration returns [EObject current=null] : iv_ruleDatabaseConfiguration= ruleDatabaseConfiguration EOF ;
    public final EObject entryRuleDatabaseConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabaseConfiguration = null;


        try {
            // InternalSpringGen.g:475:62: (iv_ruleDatabaseConfiguration= ruleDatabaseConfiguration EOF )
            // InternalSpringGen.g:476:2: iv_ruleDatabaseConfiguration= ruleDatabaseConfiguration EOF
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
    // InternalSpringGen.g:482:1: ruleDatabaseConfiguration returns [EObject current=null] : (otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'name' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'port' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}' ) ;
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
            // InternalSpringGen.g:488:2: ( (otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'name' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'port' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}' ) )
            // InternalSpringGen.g:489:2: (otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'name' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'port' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}' )
            {
            // InternalSpringGen.g:489:2: (otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'name' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'port' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}' )
            // InternalSpringGen.g:490:3: otherlv_0= 'database' otherlv_1= '{' otherlv_2= 'dbms' ( (lv_type_3_0= ruleRDBMS ) ) otherlv_4= 'name' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'port' ( (lv_port_7_0= RULE_INT ) ) otherlv_8= 'username' ( (lv_username_9_0= RULE_ID ) ) otherlv_10= 'password' ( (lv_password_11_0= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDatabaseConfigurationAccess().getDatabaseKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDatabaseConfigurationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getDatabaseConfigurationAccess().getDbmsKeyword_2());
            		
            // InternalSpringGen.g:502:3: ( (lv_type_3_0= ruleRDBMS ) )
            // InternalSpringGen.g:503:4: (lv_type_3_0= ruleRDBMS )
            {
            // InternalSpringGen.g:503:4: (lv_type_3_0= ruleRDBMS )
            // InternalSpringGen.g:504:5: lv_type_3_0= ruleRDBMS
            {

            					newCompositeNode(grammarAccess.getDatabaseConfigurationAccess().getTypeRDBMSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
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
            		
            // InternalSpringGen.g:525:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalSpringGen.g:526:4: (lv_name_5_0= RULE_ID )
            {
            // InternalSpringGen.g:526:4: (lv_name_5_0= RULE_ID )
            // InternalSpringGen.g:527:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_6=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getDatabaseConfigurationAccess().getPortKeyword_6());
            		
            // InternalSpringGen.g:547:3: ( (lv_port_7_0= RULE_INT ) )
            // InternalSpringGen.g:548:4: (lv_port_7_0= RULE_INT )
            {
            // InternalSpringGen.g:548:4: (lv_port_7_0= RULE_INT )
            // InternalSpringGen.g:549:5: lv_port_7_0= RULE_INT
            {
            lv_port_7_0=(Token)match(input,RULE_INT,FOLLOW_20); 

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
            		
            // InternalSpringGen.g:569:3: ( (lv_username_9_0= RULE_ID ) )
            // InternalSpringGen.g:570:4: (lv_username_9_0= RULE_ID )
            {
            // InternalSpringGen.g:570:4: (lv_username_9_0= RULE_ID )
            // InternalSpringGen.g:571:5: lv_username_9_0= RULE_ID
            {
            lv_username_9_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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
            		
            // InternalSpringGen.g:591:3: ( (lv_password_11_0= RULE_ID ) )
            // InternalSpringGen.g:592:4: (lv_password_11_0= RULE_ID )
            {
            // InternalSpringGen.g:592:4: (lv_password_11_0= RULE_ID )
            // InternalSpringGen.g:593:5: lv_password_11_0= RULE_ID
            {
            lv_password_11_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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
    // InternalSpringGen.g:617:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalSpringGen.g:617:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalSpringGen.g:618:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalSpringGen.g:624:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_identifier_5_0= ruleIdentifier ) ) ( (lv_properties_6_0= ruleProperty ) )* ( (lv_repository_7_0= ruleRepository ) )? ( (lv_services_8_0= ruleService ) )* ( (lv_controller_9_0= ruleController ) )? otherlv_10= '}' ) ;
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
            // InternalSpringGen.g:630:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_identifier_5_0= ruleIdentifier ) ) ( (lv_properties_6_0= ruleProperty ) )* ( (lv_repository_7_0= ruleRepository ) )? ( (lv_services_8_0= ruleService ) )* ( (lv_controller_9_0= ruleController ) )? otherlv_10= '}' ) )
            // InternalSpringGen.g:631:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_identifier_5_0= ruleIdentifier ) ) ( (lv_properties_6_0= ruleProperty ) )* ( (lv_repository_7_0= ruleRepository ) )? ( (lv_services_8_0= ruleService ) )* ( (lv_controller_9_0= ruleController ) )? otherlv_10= '}' )
            {
            // InternalSpringGen.g:631:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_identifier_5_0= ruleIdentifier ) ) ( (lv_properties_6_0= ruleProperty ) )* ( (lv_repository_7_0= ruleRepository ) )? ( (lv_services_8_0= ruleService ) )* ( (lv_controller_9_0= ruleController ) )? otherlv_10= '}' )
            // InternalSpringGen.g:632:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_identifier_5_0= ruleIdentifier ) ) ( (lv_properties_6_0= ruleProperty ) )* ( (lv_repository_7_0= ruleRepository ) )? ( (lv_services_8_0= ruleService ) )* ( (lv_controller_9_0= ruleController ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalSpringGen.g:636:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpringGen.g:637:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpringGen.g:637:4: (lv_name_1_0= RULE_ID )
            // InternalSpringGen.g:638:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalSpringGen.g:654:3: (otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSpringGen.g:655:4: otherlv_2= 'inherits' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getInheritsKeyword_2_0());
                    			
                    // InternalSpringGen.g:659:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSpringGen.g:660:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSpringGen.g:660:5: (otherlv_3= RULE_ID )
                    // InternalSpringGen.g:661:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSpringGen.g:677:3: ( (lv_identifier_5_0= ruleIdentifier ) )
            // InternalSpringGen.g:678:4: (lv_identifier_5_0= ruleIdentifier )
            {
            // InternalSpringGen.g:678:4: (lv_identifier_5_0= ruleIdentifier )
            // InternalSpringGen.g:679:5: lv_identifier_5_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getIdentifierIdentifierParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalSpringGen.g:696:3: ( (lv_properties_6_0= ruleProperty ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSpringGen.g:697:4: (lv_properties_6_0= ruleProperty )
            	    {
            	    // InternalSpringGen.g:697:4: (lv_properties_6_0= ruleProperty )
            	    // InternalSpringGen.g:698:5: lv_properties_6_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop9;
                }
            } while (true);

            // InternalSpringGen.g:715:3: ( (lv_repository_7_0= ruleRepository ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==48) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSpringGen.g:716:4: (lv_repository_7_0= ruleRepository )
                    {
                    // InternalSpringGen.g:716:4: (lv_repository_7_0= ruleRepository )
                    // InternalSpringGen.g:717:5: lv_repository_7_0= ruleRepository
                    {

                    					newCompositeNode(grammarAccess.getEntityAccess().getRepositoryRepositoryParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_25);
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

            // InternalSpringGen.g:734:3: ( (lv_services_8_0= ruleService ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSpringGen.g:735:4: (lv_services_8_0= ruleService )
            	    {
            	    // InternalSpringGen.g:735:4: (lv_services_8_0= ruleService )
            	    // InternalSpringGen.g:736:5: lv_services_8_0= ruleService
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getServicesServiceParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_25);
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
            	    break loop11;
                }
            } while (true);

            // InternalSpringGen.g:753:3: ( (lv_controller_9_0= ruleController ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSpringGen.g:754:4: (lv_controller_9_0= ruleController )
                    {
                    // InternalSpringGen.g:754:4: (lv_controller_9_0= ruleController )
                    // InternalSpringGen.g:755:5: lv_controller_9_0= ruleController
                    {

                    					newCompositeNode(grammarAccess.getEntityAccess().getControllerControllerParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_12);
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
    // InternalSpringGen.g:780:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // InternalSpringGen.g:780:51: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalSpringGen.g:781:2: iv_ruleIdentifier= ruleIdentifier EOF
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
    // InternalSpringGen.g:787:1: ruleIdentifier returns [EObject current=null] : (otherlv_0= 'Id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleValueTypes ) ) ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:793:2: ( (otherlv_0= 'Id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleValueTypes ) ) ) )
            // InternalSpringGen.g:794:2: (otherlv_0= 'Id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleValueTypes ) ) )
            {
            // InternalSpringGen.g:794:2: (otherlv_0= 'Id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleValueTypes ) ) )
            // InternalSpringGen.g:795:3: otherlv_0= 'Id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleValueTypes ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIdentifierAccess().getIdKeyword_0());
            		
            // InternalSpringGen.g:799:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpringGen.g:800:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpringGen.g:800:4: (lv_name_1_0= RULE_ID )
            // InternalSpringGen.g:801:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            // InternalSpringGen.g:817:3: ( (lv_type_2_0= ruleValueTypes ) )
            // InternalSpringGen.g:818:4: (lv_type_2_0= ruleValueTypes )
            {
            // InternalSpringGen.g:818:4: (lv_type_2_0= ruleValueTypes )
            // InternalSpringGen.g:819:5: lv_type_2_0= ruleValueTypes
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
    // InternalSpringGen.g:840:1: entryRuleDTO returns [EObject current=null] : iv_ruleDTO= ruleDTO EOF ;
    public final EObject entryRuleDTO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTO = null;


        try {
            // InternalSpringGen.g:840:44: (iv_ruleDTO= ruleDTO EOF )
            // InternalSpringGen.g:841:2: iv_ruleDTO= ruleDTO EOF
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
    // InternalSpringGen.g:847:1: ruleDTO returns [EObject current=null] : (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleDTO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:853:2: ( (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // InternalSpringGen.g:854:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // InternalSpringGen.g:854:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            // InternalSpringGen.g:855:3: otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDTOAccess().getDtoKeyword_0());
            		
            // InternalSpringGen.g:859:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpringGen.g:860:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpringGen.g:860:4: (lv_name_1_0= RULE_ID )
            // InternalSpringGen.g:861:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getDTOAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSpringGen.g:881:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSpringGen.g:882:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalSpringGen.g:882:4: (lv_properties_3_0= ruleProperty )
            	    // InternalSpringGen.g:883:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getDTOAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_27);
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
            	    break loop13;
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
    // InternalSpringGen.g:908:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalSpringGen.g:908:48: (iv_ruleService= ruleService EOF )
            // InternalSpringGen.g:909:2: iv_ruleService= ruleService EOF
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
    // InternalSpringGen.g:915:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}' ) ;
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
            // InternalSpringGen.g:921:2: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}' ) )
            // InternalSpringGen.g:922:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}' )
            {
            // InternalSpringGen.g:922:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}' )
            // InternalSpringGen.g:923:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_actions_5_0= ruleServiceAction ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalSpringGen.g:927:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpringGen.g:928:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpringGen.g:928:4: (lv_name_1_0= RULE_ID )
            // InternalSpringGen.g:929:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

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

            // InternalSpringGen.g:945:3: (otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSpringGen.g:946:4: otherlv_2= 'pertainingTo' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getPertainingToKeyword_2_0());
                    			
                    // InternalSpringGen.g:950:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSpringGen.g:951:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSpringGen.g:951:5: (otherlv_3= RULE_ID )
                    // InternalSpringGen.g:952:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getEntityEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSpringGen.g:968:3: ( (lv_actions_5_0= ruleServiceAction ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==37) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSpringGen.g:969:4: (lv_actions_5_0= ruleServiceAction )
            	    {
            	    // InternalSpringGen.g:969:4: (lv_actions_5_0= ruleServiceAction )
            	    // InternalSpringGen.g:970:5: lv_actions_5_0= ruleServiceAction
            	    {

            	    					newCompositeNode(grammarAccess.getServiceAccess().getActionsServiceActionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    break loop15;
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
    // InternalSpringGen.g:995:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalSpringGen.g:995:51: (iv_ruleController= ruleController EOF )
            // InternalSpringGen.g:996:2: iv_ruleController= ruleController EOF
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
    // InternalSpringGen.g:1002:1: ruleController returns [EObject current=null] : (otherlv_0= 'controller' otherlv_1= '{' ( (lv_baseUrl_2_0= RULE_STRING ) )? ( (lv_customActions_3_0= ruleCustomAction ) )* (otherlv_4= 'create' otherlv_5= 'entity:' ( (lv_createParam_6_0= ruleParamTransfer ) ) )? (otherlv_7= 'find' otherlv_8= 'entity:' ( (lv_findParam_9_0= ruleParamTransfer ) ) )? (otherlv_10= 'delete' otherlv_11= 'entity:' ( (lv_deleteParam_12_0= ruleParamTransfer ) ) )? otherlv_13= '}' ) ;
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
            // InternalSpringGen.g:1008:2: ( (otherlv_0= 'controller' otherlv_1= '{' ( (lv_baseUrl_2_0= RULE_STRING ) )? ( (lv_customActions_3_0= ruleCustomAction ) )* (otherlv_4= 'create' otherlv_5= 'entity:' ( (lv_createParam_6_0= ruleParamTransfer ) ) )? (otherlv_7= 'find' otherlv_8= 'entity:' ( (lv_findParam_9_0= ruleParamTransfer ) ) )? (otherlv_10= 'delete' otherlv_11= 'entity:' ( (lv_deleteParam_12_0= ruleParamTransfer ) ) )? otherlv_13= '}' ) )
            // InternalSpringGen.g:1009:2: (otherlv_0= 'controller' otherlv_1= '{' ( (lv_baseUrl_2_0= RULE_STRING ) )? ( (lv_customActions_3_0= ruleCustomAction ) )* (otherlv_4= 'create' otherlv_5= 'entity:' ( (lv_createParam_6_0= ruleParamTransfer ) ) )? (otherlv_7= 'find' otherlv_8= 'entity:' ( (lv_findParam_9_0= ruleParamTransfer ) ) )? (otherlv_10= 'delete' otherlv_11= 'entity:' ( (lv_deleteParam_12_0= ruleParamTransfer ) ) )? otherlv_13= '}' )
            {
            // InternalSpringGen.g:1009:2: (otherlv_0= 'controller' otherlv_1= '{' ( (lv_baseUrl_2_0= RULE_STRING ) )? ( (lv_customActions_3_0= ruleCustomAction ) )* (otherlv_4= 'create' otherlv_5= 'entity:' ( (lv_createParam_6_0= ruleParamTransfer ) ) )? (otherlv_7= 'find' otherlv_8= 'entity:' ( (lv_findParam_9_0= ruleParamTransfer ) ) )? (otherlv_10= 'delete' otherlv_11= 'entity:' ( (lv_deleteParam_12_0= ruleParamTransfer ) ) )? otherlv_13= '}' )
            // InternalSpringGen.g:1010:3: otherlv_0= 'controller' otherlv_1= '{' ( (lv_baseUrl_2_0= RULE_STRING ) )? ( (lv_customActions_3_0= ruleCustomAction ) )* (otherlv_4= 'create' otherlv_5= 'entity:' ( (lv_createParam_6_0= ruleParamTransfer ) ) )? (otherlv_7= 'find' otherlv_8= 'entity:' ( (lv_findParam_9_0= ruleParamTransfer ) ) )? (otherlv_10= 'delete' otherlv_11= 'entity:' ( (lv_deleteParam_12_0= ruleParamTransfer ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSpringGen.g:1018:3: ( (lv_baseUrl_2_0= RULE_STRING ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSpringGen.g:1019:4: (lv_baseUrl_2_0= RULE_STRING )
                    {
                    // InternalSpringGen.g:1019:4: (lv_baseUrl_2_0= RULE_STRING )
                    // InternalSpringGen.g:1020:5: lv_baseUrl_2_0= RULE_STRING
                    {
                    lv_baseUrl_2_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

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

            // InternalSpringGen.g:1036:3: ( (lv_customActions_3_0= ruleCustomAction ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=61 && LA17_0<=65)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSpringGen.g:1037:4: (lv_customActions_3_0= ruleCustomAction )
            	    {
            	    // InternalSpringGen.g:1037:4: (lv_customActions_3_0= ruleCustomAction )
            	    // InternalSpringGen.g:1038:5: lv_customActions_3_0= ruleCustomAction
            	    {

            	    					newCompositeNode(grammarAccess.getControllerAccess().getCustomActionsCustomActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_31);
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
            	    break loop17;
                }
            } while (true);

            // InternalSpringGen.g:1055:3: (otherlv_4= 'create' otherlv_5= 'entity:' ( (lv_createParam_6_0= ruleParamTransfer ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSpringGen.g:1056:4: otherlv_4= 'create' otherlv_5= 'entity:' ( (lv_createParam_6_0= ruleParamTransfer ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_32); 

                    				newLeafNode(otherlv_4, grammarAccess.getControllerAccess().getCreateKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,34,FOLLOW_33); 

                    				newLeafNode(otherlv_5, grammarAccess.getControllerAccess().getEntityKeyword_4_1());
                    			
                    // InternalSpringGen.g:1064:4: ( (lv_createParam_6_0= ruleParamTransfer ) )
                    // InternalSpringGen.g:1065:5: (lv_createParam_6_0= ruleParamTransfer )
                    {
                    // InternalSpringGen.g:1065:5: (lv_createParam_6_0= ruleParamTransfer )
                    // InternalSpringGen.g:1066:6: lv_createParam_6_0= ruleParamTransfer
                    {

                    						newCompositeNode(grammarAccess.getControllerAccess().getCreateParamParamTransferParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_34);
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

            // InternalSpringGen.g:1084:3: (otherlv_7= 'find' otherlv_8= 'entity:' ( (lv_findParam_9_0= ruleParamTransfer ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSpringGen.g:1085:4: otherlv_7= 'find' otherlv_8= 'entity:' ( (lv_findParam_9_0= ruleParamTransfer ) )
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_32); 

                    				newLeafNode(otherlv_7, grammarAccess.getControllerAccess().getFindKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,34,FOLLOW_33); 

                    				newLeafNode(otherlv_8, grammarAccess.getControllerAccess().getEntityKeyword_5_1());
                    			
                    // InternalSpringGen.g:1093:4: ( (lv_findParam_9_0= ruleParamTransfer ) )
                    // InternalSpringGen.g:1094:5: (lv_findParam_9_0= ruleParamTransfer )
                    {
                    // InternalSpringGen.g:1094:5: (lv_findParam_9_0= ruleParamTransfer )
                    // InternalSpringGen.g:1095:6: lv_findParam_9_0= ruleParamTransfer
                    {

                    						newCompositeNode(grammarAccess.getControllerAccess().getFindParamParamTransferParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_35);
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

            // InternalSpringGen.g:1113:3: (otherlv_10= 'delete' otherlv_11= 'entity:' ( (lv_deleteParam_12_0= ruleParamTransfer ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSpringGen.g:1114:4: otherlv_10= 'delete' otherlv_11= 'entity:' ( (lv_deleteParam_12_0= ruleParamTransfer ) )
                    {
                    otherlv_10=(Token)match(input,36,FOLLOW_32); 

                    				newLeafNode(otherlv_10, grammarAccess.getControllerAccess().getDeleteKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,34,FOLLOW_33); 

                    				newLeafNode(otherlv_11, grammarAccess.getControllerAccess().getEntityKeyword_6_1());
                    			
                    // InternalSpringGen.g:1122:4: ( (lv_deleteParam_12_0= ruleParamTransfer ) )
                    // InternalSpringGen.g:1123:5: (lv_deleteParam_12_0= ruleParamTransfer )
                    {
                    // InternalSpringGen.g:1123:5: (lv_deleteParam_12_0= ruleParamTransfer )
                    // InternalSpringGen.g:1124:6: lv_deleteParam_12_0= ruleParamTransfer
                    {

                    						newCompositeNode(grammarAccess.getControllerAccess().getDeleteParamParamTransferParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
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
    // InternalSpringGen.g:1150:1: entryRuleServiceAction returns [EObject current=null] : iv_ruleServiceAction= ruleServiceAction EOF ;
    public final EObject entryRuleServiceAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceAction = null;


        try {
            // InternalSpringGen.g:1150:54: (iv_ruleServiceAction= ruleServiceAction EOF )
            // InternalSpringGen.g:1151:2: iv_ruleServiceAction= ruleServiceAction EOF
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
    // InternalSpringGen.g:1157:1: ruleServiceAction returns [EObject current=null] : (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleReturnType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}' ) ;
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
            // InternalSpringGen.g:1163:2: ( (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleReturnType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}' ) )
            // InternalSpringGen.g:1164:2: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleReturnType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}' )
            {
            // InternalSpringGen.g:1164:2: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleReturnType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}' )
            // InternalSpringGen.g:1165:3: otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleReturnType ) ) (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )? (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= 'params' otherlv_10= '(' ( (lv_parameters_11_0= ruleActionParameter ) )* otherlv_12= ')' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceActionAccess().getOperationKeyword_0());
            		
            // InternalSpringGen.g:1169:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpringGen.g:1170:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpringGen.g:1170:4: (lv_name_1_0= RULE_ID )
            // InternalSpringGen.g:1171:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceActionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceActionAccess().getReturnsKeyword_3());
            		
            // InternalSpringGen.g:1195:3: ( (lv_returnType_4_0= ruleReturnType ) )
            // InternalSpringGen.g:1196:4: (lv_returnType_4_0= ruleReturnType )
            {
            // InternalSpringGen.g:1196:4: (lv_returnType_4_0= ruleReturnType )
            // InternalSpringGen.g:1197:5: lv_returnType_4_0= ruleReturnType
            {

            					newCompositeNode(grammarAccess.getServiceActionAccess().getReturnTypeReturnTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_38);
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

            // InternalSpringGen.g:1214:3: (otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSpringGen.g:1215:4: otherlv_5= 'raises' ( (lv_exceptionType_6_0= ruleType ) )
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_39); 

                    				newLeafNode(otherlv_5, grammarAccess.getServiceActionAccess().getRaisesKeyword_5_0());
                    			
                    // InternalSpringGen.g:1219:4: ( (lv_exceptionType_6_0= ruleType ) )
                    // InternalSpringGen.g:1220:5: (lv_exceptionType_6_0= ruleType )
                    {
                    // InternalSpringGen.g:1220:5: (lv_exceptionType_6_0= ruleType )
                    // InternalSpringGen.g:1221:6: lv_exceptionType_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getServiceActionAccess().getExceptionTypeTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_40);
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

            // InternalSpringGen.g:1239:3: (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSpringGen.g:1240:4: otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getServiceActionAccess().getImplementationKeyword_6_0());
                    			
                    // InternalSpringGen.g:1244:4: ( (lv_implementation_8_0= RULE_STRING ) )
                    // InternalSpringGen.g:1245:5: (lv_implementation_8_0= RULE_STRING )
                    {
                    // InternalSpringGen.g:1245:5: (lv_implementation_8_0= RULE_STRING )
                    // InternalSpringGen.g:1246:6: lv_implementation_8_0= RULE_STRING
                    {
                    lv_implementation_8_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            otherlv_9=(Token)match(input,41,FOLLOW_42); 

            			newLeafNode(otherlv_9, grammarAccess.getServiceActionAccess().getParamsKeyword_7());
            		
            otherlv_10=(Token)match(input,42,FOLLOW_43); 

            			newLeafNode(otherlv_10, grammarAccess.getServiceActionAccess().getLeftParenthesisKeyword_8());
            		
            // InternalSpringGen.g:1271:3: ( (lv_parameters_11_0= ruleActionParameter ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSpringGen.g:1272:4: (lv_parameters_11_0= ruleActionParameter )
            	    {
            	    // InternalSpringGen.g:1272:4: (lv_parameters_11_0= ruleActionParameter )
            	    // InternalSpringGen.g:1273:5: lv_parameters_11_0= ruleActionParameter
            	    {

            	    					newCompositeNode(grammarAccess.getServiceActionAccess().getParametersActionParameterParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_43);
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
            	    break loop23;
                }
            } while (true);

            otherlv_12=(Token)match(input,43,FOLLOW_12); 

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
    // InternalSpringGen.g:1302:1: entryRuleCustomAction returns [EObject current=null] : iv_ruleCustomAction= ruleCustomAction EOF ;
    public final EObject entryRuleCustomAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomAction = null;


        try {
            // InternalSpringGen.g:1302:53: (iv_ruleCustomAction= ruleCustomAction EOF )
            // InternalSpringGen.g:1303:2: iv_ruleCustomAction= ruleCustomAction EOF
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
    // InternalSpringGen.g:1309:1: ruleCustomAction returns [EObject current=null] : ( ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_parameters_6_0= ruleActionParameter ) )* otherlv_7= '}' ) ;
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
            // InternalSpringGen.g:1315:2: ( ( ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_parameters_6_0= ruleActionParameter ) )* otherlv_7= '}' ) )
            // InternalSpringGen.g:1316:2: ( ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_parameters_6_0= ruleActionParameter ) )* otherlv_7= '}' )
            {
            // InternalSpringGen.g:1316:2: ( ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_parameters_6_0= ruleActionParameter ) )* otherlv_7= '}' )
            // InternalSpringGen.g:1317:3: ( (lv_method_0_0= ruleHttpMethods ) ) otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_parameters_6_0= ruleActionParameter ) )* otherlv_7= '}'
            {
            // InternalSpringGen.g:1317:3: ( (lv_method_0_0= ruleHttpMethods ) )
            // InternalSpringGen.g:1318:4: (lv_method_0_0= ruleHttpMethods )
            {
            // InternalSpringGen.g:1318:4: (lv_method_0_0= ruleHttpMethods )
            // InternalSpringGen.g:1319:5: lv_method_0_0= ruleHttpMethods
            {

            					newCompositeNode(grammarAccess.getCustomActionAccess().getMethodHttpMethodsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
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
            		
            // InternalSpringGen.g:1340:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSpringGen.g:1341:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSpringGen.g:1341:4: (lv_name_2_0= RULE_ID )
            // InternalSpringGen.g:1342:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_45); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSpringGen.g:1362:3: (otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSpringGen.g:1363:4: otherlv_4= 'mappedAt' ( (lv_url_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getCustomActionAccess().getMappedAtKeyword_4_0());
                    			
                    // InternalSpringGen.g:1367:4: ( (lv_url_5_0= RULE_STRING ) )
                    // InternalSpringGen.g:1368:5: (lv_url_5_0= RULE_STRING )
                    {
                    // InternalSpringGen.g:1368:5: (lv_url_5_0= RULE_STRING )
                    // InternalSpringGen.g:1369:6: lv_url_5_0= RULE_STRING
                    {
                    lv_url_5_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

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

            // InternalSpringGen.g:1386:3: ( (lv_parameters_6_0= ruleActionParameter ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSpringGen.g:1387:4: (lv_parameters_6_0= ruleActionParameter )
            	    {
            	    // InternalSpringGen.g:1387:4: (lv_parameters_6_0= ruleActionParameter )
            	    // InternalSpringGen.g:1388:5: lv_parameters_6_0= ruleActionParameter
            	    {

            	    					newCompositeNode(grammarAccess.getCustomActionAccess().getParametersActionParameterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_27);
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
            	    break loop25;
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
    // InternalSpringGen.g:1413:1: entryRuleActionParameter returns [EObject current=null] : iv_ruleActionParameter= ruleActionParameter EOF ;
    public final EObject entryRuleActionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionParameter = null;


        try {
            // InternalSpringGen.g:1413:56: (iv_ruleActionParameter= ruleActionParameter EOF )
            // InternalSpringGen.g:1414:2: iv_ruleActionParameter= ruleActionParameter EOF
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
    // InternalSpringGen.g:1420:1: ruleActionParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleActionParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_defaultValue_4_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:1426:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) )
            // InternalSpringGen.g:1427:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            {
            // InternalSpringGen.g:1427:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            // InternalSpringGen.g:1428:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            {
            // InternalSpringGen.g:1428:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSpringGen.g:1429:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSpringGen.g:1429:4: (lv_name_0_0= RULE_ID )
            // InternalSpringGen.g:1430:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_46); 

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

            otherlv_1=(Token)match(input,46,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getActionParameterAccess().getColonKeyword_1());
            		
            // InternalSpringGen.g:1450:3: ( (lv_type_2_0= ruleType ) )
            // InternalSpringGen.g:1451:4: (lv_type_2_0= ruleType )
            {
            // InternalSpringGen.g:1451:4: (lv_type_2_0= ruleType )
            // InternalSpringGen.g:1452:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getActionParameterAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_47);
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

            // InternalSpringGen.g:1469:3: (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==47) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSpringGen.g:1470:4: otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getActionParameterAccess().getDefaultKeyword_3_0());
                    			
                    // InternalSpringGen.g:1474:4: ( (lv_defaultValue_4_0= RULE_STRING ) )
                    // InternalSpringGen.g:1475:5: (lv_defaultValue_4_0= RULE_STRING )
                    {
                    // InternalSpringGen.g:1475:5: (lv_defaultValue_4_0= RULE_STRING )
                    // InternalSpringGen.g:1476:6: lv_defaultValue_4_0= RULE_STRING
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
    // InternalSpringGen.g:1497:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalSpringGen.g:1497:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalSpringGen.g:1498:2: iv_ruleRepository= ruleRepository EOF
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
    // InternalSpringGen.g:1504:1: ruleRepository returns [EObject current=null] : (otherlv_0= 'repository' otherlv_1= '{' ( (lv_findBy_2_0= ruleFindByMethod ) )* ( (lv_deleteBy_3_0= ruleDeleteByMethod ) )* ( (lv_customQueryMethod_4_0= ruleCustomQueryMethod ) )* otherlv_5= '}' ) ;
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
            // InternalSpringGen.g:1510:2: ( (otherlv_0= 'repository' otherlv_1= '{' ( (lv_findBy_2_0= ruleFindByMethod ) )* ( (lv_deleteBy_3_0= ruleDeleteByMethod ) )* ( (lv_customQueryMethod_4_0= ruleCustomQueryMethod ) )* otherlv_5= '}' ) )
            // InternalSpringGen.g:1511:2: (otherlv_0= 'repository' otherlv_1= '{' ( (lv_findBy_2_0= ruleFindByMethod ) )* ( (lv_deleteBy_3_0= ruleDeleteByMethod ) )* ( (lv_customQueryMethod_4_0= ruleCustomQueryMethod ) )* otherlv_5= '}' )
            {
            // InternalSpringGen.g:1511:2: (otherlv_0= 'repository' otherlv_1= '{' ( (lv_findBy_2_0= ruleFindByMethod ) )* ( (lv_deleteBy_3_0= ruleDeleteByMethod ) )* ( (lv_customQueryMethod_4_0= ruleCustomQueryMethod ) )* otherlv_5= '}' )
            // InternalSpringGen.g:1512:3: otherlv_0= 'repository' otherlv_1= '{' ( (lv_findBy_2_0= ruleFindByMethod ) )* ( (lv_deleteBy_3_0= ruleDeleteByMethod ) )* ( (lv_customQueryMethod_4_0= ruleCustomQueryMethod ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getRepositoryKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSpringGen.g:1520:3: ( (lv_findBy_2_0= ruleFindByMethod ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==35) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSpringGen.g:1521:4: (lv_findBy_2_0= ruleFindByMethod )
            	    {
            	    // InternalSpringGen.g:1521:4: (lv_findBy_2_0= ruleFindByMethod )
            	    // InternalSpringGen.g:1522:5: lv_findBy_2_0= ruleFindByMethod
            	    {

            	    					newCompositeNode(grammarAccess.getRepositoryAccess().getFindByFindByMethodParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_48);
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
            	    break loop27;
                }
            } while (true);

            // InternalSpringGen.g:1539:3: ( (lv_deleteBy_3_0= ruleDeleteByMethod ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==36) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSpringGen.g:1540:4: (lv_deleteBy_3_0= ruleDeleteByMethod )
            	    {
            	    // InternalSpringGen.g:1540:4: (lv_deleteBy_3_0= ruleDeleteByMethod )
            	    // InternalSpringGen.g:1541:5: lv_deleteBy_3_0= ruleDeleteByMethod
            	    {

            	    					newCompositeNode(grammarAccess.getRepositoryAccess().getDeleteByDeleteByMethodParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_49);
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
            	    break loop28;
                }
            } while (true);

            // InternalSpringGen.g:1558:3: ( (lv_customQueryMethod_4_0= ruleCustomQueryMethod ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==50) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSpringGen.g:1559:4: (lv_customQueryMethod_4_0= ruleCustomQueryMethod )
            	    {
            	    // InternalSpringGen.g:1559:4: (lv_customQueryMethod_4_0= ruleCustomQueryMethod )
            	    // InternalSpringGen.g:1560:5: lv_customQueryMethod_4_0= ruleCustomQueryMethod
            	    {

            	    					newCompositeNode(grammarAccess.getRepositoryAccess().getCustomQueryMethodCustomQueryMethodParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_50);
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
            	    break loop29;
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
    // InternalSpringGen.g:1585:1: entryRuleFindByMethod returns [EObject current=null] : iv_ruleFindByMethod= ruleFindByMethod EOF ;
    public final EObject entryRuleFindByMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFindByMethod = null;


        try {
            // InternalSpringGen.g:1585:53: (iv_ruleFindByMethod= ruleFindByMethod EOF )
            // InternalSpringGen.g:1586:2: iv_ruleFindByMethod= ruleFindByMethod EOF
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
    // InternalSpringGen.g:1592:1: ruleFindByMethod returns [EObject current=null] : (otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_propertyType_4_0= ruleValueTypes ) ) ) ;
    public final EObject ruleFindByMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_property_2_0=null;
        Token otherlv_3=null;
        EObject lv_propertyType_4_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:1598:2: ( (otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_propertyType_4_0= ruleValueTypes ) ) ) )
            // InternalSpringGen.g:1599:2: (otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_propertyType_4_0= ruleValueTypes ) ) )
            {
            // InternalSpringGen.g:1599:2: (otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_propertyType_4_0= ruleValueTypes ) ) )
            // InternalSpringGen.g:1600:3: otherlv_0= 'find' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_propertyType_4_0= ruleValueTypes ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getFindByMethodAccess().getFindKeyword_0());
            		
            otherlv_1=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFindByMethodAccess().getByKeyword_1());
            		
            // InternalSpringGen.g:1608:3: ( (lv_property_2_0= RULE_ID ) )
            // InternalSpringGen.g:1609:4: (lv_property_2_0= RULE_ID )
            {
            // InternalSpringGen.g:1609:4: (lv_property_2_0= RULE_ID )
            // InternalSpringGen.g:1610:5: lv_property_2_0= RULE_ID
            {
            lv_property_2_0=(Token)match(input,RULE_ID,FOLLOW_46); 

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

            otherlv_3=(Token)match(input,46,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getFindByMethodAccess().getColonKeyword_3());
            		
            // InternalSpringGen.g:1630:3: ( (lv_propertyType_4_0= ruleValueTypes ) )
            // InternalSpringGen.g:1631:4: (lv_propertyType_4_0= ruleValueTypes )
            {
            // InternalSpringGen.g:1631:4: (lv_propertyType_4_0= ruleValueTypes )
            // InternalSpringGen.g:1632:5: lv_propertyType_4_0= ruleValueTypes
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
    // InternalSpringGen.g:1653:1: entryRuleDeleteByMethod returns [EObject current=null] : iv_ruleDeleteByMethod= ruleDeleteByMethod EOF ;
    public final EObject entryRuleDeleteByMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteByMethod = null;


        try {
            // InternalSpringGen.g:1653:55: (iv_ruleDeleteByMethod= ruleDeleteByMethod EOF )
            // InternalSpringGen.g:1654:2: iv_ruleDeleteByMethod= ruleDeleteByMethod EOF
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
    // InternalSpringGen.g:1660:1: ruleDeleteByMethod returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_propertyType_4_0= ruleValueTypes ) ) ) ;
    public final EObject ruleDeleteByMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_property_2_0=null;
        Token otherlv_3=null;
        EObject lv_propertyType_4_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:1666:2: ( (otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_propertyType_4_0= ruleValueTypes ) ) ) )
            // InternalSpringGen.g:1667:2: (otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_propertyType_4_0= ruleValueTypes ) ) )
            {
            // InternalSpringGen.g:1667:2: (otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_propertyType_4_0= ruleValueTypes ) ) )
            // InternalSpringGen.g:1668:3: otherlv_0= 'delete' otherlv_1= 'by' ( (lv_property_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_propertyType_4_0= ruleValueTypes ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteByMethodAccess().getDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteByMethodAccess().getByKeyword_1());
            		
            // InternalSpringGen.g:1676:3: ( (lv_property_2_0= RULE_ID ) )
            // InternalSpringGen.g:1677:4: (lv_property_2_0= RULE_ID )
            {
            // InternalSpringGen.g:1677:4: (lv_property_2_0= RULE_ID )
            // InternalSpringGen.g:1678:5: lv_property_2_0= RULE_ID
            {
            lv_property_2_0=(Token)match(input,RULE_ID,FOLLOW_46); 

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

            otherlv_3=(Token)match(input,46,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getDeleteByMethodAccess().getColonKeyword_3());
            		
            // InternalSpringGen.g:1698:3: ( (lv_propertyType_4_0= ruleValueTypes ) )
            // InternalSpringGen.g:1699:4: (lv_propertyType_4_0= ruleValueTypes )
            {
            // InternalSpringGen.g:1699:4: (lv_propertyType_4_0= ruleValueTypes )
            // InternalSpringGen.g:1700:5: lv_propertyType_4_0= ruleValueTypes
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
    // InternalSpringGen.g:1721:1: entryRuleCustomQueryMethod returns [EObject current=null] : iv_ruleCustomQueryMethod= ruleCustomQueryMethod EOF ;
    public final EObject entryRuleCustomQueryMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomQueryMethod = null;


        try {
            // InternalSpringGen.g:1721:58: (iv_ruleCustomQueryMethod= ruleCustomQueryMethod EOF )
            // InternalSpringGen.g:1722:2: iv_ruleCustomQueryMethod= ruleCustomQueryMethod EOF
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
    // InternalSpringGen.g:1728:1: ruleCustomQueryMethod returns [EObject current=null] : (otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleCustomQueryMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_query_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSpringGen.g:1734:2: ( (otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalSpringGen.g:1735:2: (otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalSpringGen.g:1735:2: (otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalSpringGen.g:1736:3: otherlv_0= 'customQuery' otherlv_1= '{' ( (lv_query_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomQueryMethodAccess().getCustomQueryKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomQueryMethodAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSpringGen.g:1744:3: ( (lv_query_2_0= RULE_STRING ) )
            // InternalSpringGen.g:1745:4: (lv_query_2_0= RULE_STRING )
            {
            // InternalSpringGen.g:1745:4: (lv_query_2_0= RULE_STRING )
            // InternalSpringGen.g:1746:5: lv_query_2_0= RULE_STRING
            {
            lv_query_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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
    // InternalSpringGen.g:1770:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalSpringGen.g:1770:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalSpringGen.g:1771:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalSpringGen.g:1777:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_defaultValue_4_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:1783:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) )
            // InternalSpringGen.g:1784:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            {
            // InternalSpringGen.g:1784:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            // InternalSpringGen.g:1785:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            {
            // InternalSpringGen.g:1785:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSpringGen.g:1786:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSpringGen.g:1786:4: (lv_name_0_0= RULE_ID )
            // InternalSpringGen.g:1787:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_46); 

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

            otherlv_1=(Token)match(input,46,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
            		
            // InternalSpringGen.g:1807:3: ( (lv_type_2_0= ruleType ) )
            // InternalSpringGen.g:1808:4: (lv_type_2_0= ruleType )
            {
            // InternalSpringGen.g:1808:4: (lv_type_2_0= ruleType )
            // InternalSpringGen.g:1809:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_47);
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

            // InternalSpringGen.g:1826:3: (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSpringGen.g:1827:4: otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getDefaultKeyword_3_0());
                    			
                    // InternalSpringGen.g:1831:4: ( (lv_defaultValue_4_0= RULE_STRING ) )
                    // InternalSpringGen.g:1832:5: (lv_defaultValue_4_0= RULE_STRING )
                    {
                    // InternalSpringGen.g:1832:5: (lv_defaultValue_4_0= RULE_STRING )
                    // InternalSpringGen.g:1833:6: lv_defaultValue_4_0= RULE_STRING
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
    // InternalSpringGen.g:1854:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSpringGen.g:1854:45: (iv_ruleType= ruleType EOF )
            // InternalSpringGen.g:1855:2: iv_ruleType= ruleType EOF
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
    // InternalSpringGen.g:1861:1: ruleType returns [EObject current=null] : (this_ValueTypes_0= ruleValueTypes | this_ListType_1= ruleListType | this_SetType_2= ruleSetType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ValueTypes_0 = null;

        EObject this_ListType_1 = null;

        EObject this_SetType_2 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:1867:2: ( (this_ValueTypes_0= ruleValueTypes | this_ListType_1= ruleListType | this_SetType_2= ruleSetType ) )
            // InternalSpringGen.g:1868:2: (this_ValueTypes_0= ruleValueTypes | this_ListType_1= ruleListType | this_SetType_2= ruleSetType )
            {
            // InternalSpringGen.g:1868:2: (this_ValueTypes_0= ruleValueTypes | this_ListType_1= ruleListType | this_SetType_2= ruleSetType )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
                {
                alt31=1;
                }
                break;
            case 51:
                {
                alt31=2;
                }
                break;
            case 53:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalSpringGen.g:1869:3: this_ValueTypes_0= ruleValueTypes
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
                    // InternalSpringGen.g:1878:3: this_ListType_1= ruleListType
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
                    // InternalSpringGen.g:1887:3: this_SetType_2= ruleSetType
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
    // InternalSpringGen.g:1899:1: entryRuleReturnType returns [EObject current=null] : iv_ruleReturnType= ruleReturnType EOF ;
    public final EObject entryRuleReturnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnType = null;


        try {
            // InternalSpringGen.g:1899:51: (iv_ruleReturnType= ruleReturnType EOF )
            // InternalSpringGen.g:1900:2: iv_ruleReturnType= ruleReturnType EOF
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
    // InternalSpringGen.g:1906:1: ruleReturnType returns [EObject current=null] : (this_ValueTypes_0= ruleValueTypes | this_ListType_1= ruleListType | this_ID_2= RULE_ID ) ;
    public final EObject ruleReturnType() throws RecognitionException {
        EObject current = null;

        Token this_ID_2=null;
        EObject this_ValueTypes_0 = null;

        EObject this_ListType_1 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:1912:2: ( (this_ValueTypes_0= ruleValueTypes | this_ListType_1= ruleListType | this_ID_2= RULE_ID ) )
            // InternalSpringGen.g:1913:2: (this_ValueTypes_0= ruleValueTypes | this_ListType_1= ruleListType | this_ID_2= RULE_ID )
            {
            // InternalSpringGen.g:1913:2: (this_ValueTypes_0= ruleValueTypes | this_ListType_1= ruleListType | this_ID_2= RULE_ID )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
                {
                alt32=1;
                }
                break;
            case 51:
                {
                alt32=2;
                }
                break;
            case RULE_ID:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalSpringGen.g:1914:3: this_ValueTypes_0= ruleValueTypes
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
                    // InternalSpringGen.g:1923:3: this_ListType_1= ruleListType
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
                    // InternalSpringGen.g:1932:3: this_ID_2= RULE_ID
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
    // InternalSpringGen.g:1940:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // InternalSpringGen.g:1940:49: (iv_ruleListType= ruleListType EOF )
            // InternalSpringGen.g:1941:2: iv_ruleListType= ruleListType EOF
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
    // InternalSpringGen.g:1947:1: ruleListType returns [EObject current=null] : (otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:1953:2: ( (otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) )
            // InternalSpringGen.g:1954:2: (otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            {
            // InternalSpringGen.g:1954:2: (otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            // InternalSpringGen.g:1955:3: otherlv_0= 'List<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getListTypeAccess().getListKeyword_0());
            		
            // InternalSpringGen.g:1959:3: ( (lv_type_1_0= ruleType ) )
            // InternalSpringGen.g:1960:4: (lv_type_1_0= ruleType )
            {
            // InternalSpringGen.g:1960:4: (lv_type_1_0= ruleType )
            // InternalSpringGen.g:1961:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getListTypeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_52);
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
    // InternalSpringGen.g:1986:1: entryRuleSetType returns [EObject current=null] : iv_ruleSetType= ruleSetType EOF ;
    public final EObject entryRuleSetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetType = null;


        try {
            // InternalSpringGen.g:1986:48: (iv_ruleSetType= ruleSetType EOF )
            // InternalSpringGen.g:1987:2: iv_ruleSetType= ruleSetType EOF
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
    // InternalSpringGen.g:1993:1: ruleSetType returns [EObject current=null] : (otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) ;
    public final EObject ruleSetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:1999:2: ( (otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) )
            // InternalSpringGen.g:2000:2: (otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            {
            // InternalSpringGen.g:2000:2: (otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            // InternalSpringGen.g:2001:3: otherlv_0= 'Set<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getSetTypeAccess().getSetKeyword_0());
            		
            // InternalSpringGen.g:2005:3: ( (lv_type_1_0= ruleType ) )
            // InternalSpringGen.g:2006:4: (lv_type_1_0= ruleType )
            {
            // InternalSpringGen.g:2006:4: (lv_type_1_0= ruleType )
            // InternalSpringGen.g:2007:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSetTypeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_52);
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
    // InternalSpringGen.g:2032:1: entryRuleValueTypes returns [EObject current=null] : iv_ruleValueTypes= ruleValueTypes EOF ;
    public final EObject entryRuleValueTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueTypes = null;


        try {
            // InternalSpringGen.g:2032:51: (iv_ruleValueTypes= ruleValueTypes EOF )
            // InternalSpringGen.g:2033:2: iv_ruleValueTypes= ruleValueTypes EOF
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
    // InternalSpringGen.g:2039:1: ruleValueTypes returns [EObject current=null] : ( ( (lv_FLOAT_0_0= 'float' ) ) | ( (lv_LONG_1_0= 'long' ) ) | ( (lv_INTEGER_2_0= 'int' ) ) | ( (lv_CHAR_3_0= 'char' ) ) | ( (lv_BOOLEAN_4_0= 'boolean' ) ) | ( (lv_BYTE_5_0= 'byte' ) ) | ( (lv_STRING_6_0= 'String' ) ) ) ;
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
            // InternalSpringGen.g:2045:2: ( ( ( (lv_FLOAT_0_0= 'float' ) ) | ( (lv_LONG_1_0= 'long' ) ) | ( (lv_INTEGER_2_0= 'int' ) ) | ( (lv_CHAR_3_0= 'char' ) ) | ( (lv_BOOLEAN_4_0= 'boolean' ) ) | ( (lv_BYTE_5_0= 'byte' ) ) | ( (lv_STRING_6_0= 'String' ) ) ) )
            // InternalSpringGen.g:2046:2: ( ( (lv_FLOAT_0_0= 'float' ) ) | ( (lv_LONG_1_0= 'long' ) ) | ( (lv_INTEGER_2_0= 'int' ) ) | ( (lv_CHAR_3_0= 'char' ) ) | ( (lv_BOOLEAN_4_0= 'boolean' ) ) | ( (lv_BYTE_5_0= 'byte' ) ) | ( (lv_STRING_6_0= 'String' ) ) )
            {
            // InternalSpringGen.g:2046:2: ( ( (lv_FLOAT_0_0= 'float' ) ) | ( (lv_LONG_1_0= 'long' ) ) | ( (lv_INTEGER_2_0= 'int' ) ) | ( (lv_CHAR_3_0= 'char' ) ) | ( (lv_BOOLEAN_4_0= 'boolean' ) ) | ( (lv_BYTE_5_0= 'byte' ) ) | ( (lv_STRING_6_0= 'String' ) ) )
            int alt33=7;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt33=1;
                }
                break;
            case 55:
                {
                alt33=2;
                }
                break;
            case 56:
                {
                alt33=3;
                }
                break;
            case 57:
                {
                alt33=4;
                }
                break;
            case 58:
                {
                alt33=5;
                }
                break;
            case 59:
                {
                alt33=6;
                }
                break;
            case 60:
                {
                alt33=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalSpringGen.g:2047:3: ( (lv_FLOAT_0_0= 'float' ) )
                    {
                    // InternalSpringGen.g:2047:3: ( (lv_FLOAT_0_0= 'float' ) )
                    // InternalSpringGen.g:2048:4: (lv_FLOAT_0_0= 'float' )
                    {
                    // InternalSpringGen.g:2048:4: (lv_FLOAT_0_0= 'float' )
                    // InternalSpringGen.g:2049:5: lv_FLOAT_0_0= 'float'
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
                    // InternalSpringGen.g:2062:3: ( (lv_LONG_1_0= 'long' ) )
                    {
                    // InternalSpringGen.g:2062:3: ( (lv_LONG_1_0= 'long' ) )
                    // InternalSpringGen.g:2063:4: (lv_LONG_1_0= 'long' )
                    {
                    // InternalSpringGen.g:2063:4: (lv_LONG_1_0= 'long' )
                    // InternalSpringGen.g:2064:5: lv_LONG_1_0= 'long'
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
                    // InternalSpringGen.g:2077:3: ( (lv_INTEGER_2_0= 'int' ) )
                    {
                    // InternalSpringGen.g:2077:3: ( (lv_INTEGER_2_0= 'int' ) )
                    // InternalSpringGen.g:2078:4: (lv_INTEGER_2_0= 'int' )
                    {
                    // InternalSpringGen.g:2078:4: (lv_INTEGER_2_0= 'int' )
                    // InternalSpringGen.g:2079:5: lv_INTEGER_2_0= 'int'
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
                    // InternalSpringGen.g:2092:3: ( (lv_CHAR_3_0= 'char' ) )
                    {
                    // InternalSpringGen.g:2092:3: ( (lv_CHAR_3_0= 'char' ) )
                    // InternalSpringGen.g:2093:4: (lv_CHAR_3_0= 'char' )
                    {
                    // InternalSpringGen.g:2093:4: (lv_CHAR_3_0= 'char' )
                    // InternalSpringGen.g:2094:5: lv_CHAR_3_0= 'char'
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
                    // InternalSpringGen.g:2107:3: ( (lv_BOOLEAN_4_0= 'boolean' ) )
                    {
                    // InternalSpringGen.g:2107:3: ( (lv_BOOLEAN_4_0= 'boolean' ) )
                    // InternalSpringGen.g:2108:4: (lv_BOOLEAN_4_0= 'boolean' )
                    {
                    // InternalSpringGen.g:2108:4: (lv_BOOLEAN_4_0= 'boolean' )
                    // InternalSpringGen.g:2109:5: lv_BOOLEAN_4_0= 'boolean'
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
                    // InternalSpringGen.g:2122:3: ( (lv_BYTE_5_0= 'byte' ) )
                    {
                    // InternalSpringGen.g:2122:3: ( (lv_BYTE_5_0= 'byte' ) )
                    // InternalSpringGen.g:2123:4: (lv_BYTE_5_0= 'byte' )
                    {
                    // InternalSpringGen.g:2123:4: (lv_BYTE_5_0= 'byte' )
                    // InternalSpringGen.g:2124:5: lv_BYTE_5_0= 'byte'
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
                    // InternalSpringGen.g:2137:3: ( (lv_STRING_6_0= 'String' ) )
                    {
                    // InternalSpringGen.g:2137:3: ( (lv_STRING_6_0= 'String' ) )
                    // InternalSpringGen.g:2138:4: (lv_STRING_6_0= 'String' )
                    {
                    // InternalSpringGen.g:2138:4: (lv_STRING_6_0= 'String' )
                    // InternalSpringGen.g:2139:5: lv_STRING_6_0= 'String'
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
    // InternalSpringGen.g:2155:1: entryRuleHttpMethods returns [EObject current=null] : iv_ruleHttpMethods= ruleHttpMethods EOF ;
    public final EObject entryRuleHttpMethods() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpMethods = null;


        try {
            // InternalSpringGen.g:2155:52: (iv_ruleHttpMethods= ruleHttpMethods EOF )
            // InternalSpringGen.g:2156:2: iv_ruleHttpMethods= ruleHttpMethods EOF
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
    // InternalSpringGen.g:2162:1: ruleHttpMethods returns [EObject current=null] : ( ( (lv_GET_0_0= 'GET' ) ) | ( (lv_DELETE_1_0= 'DELETE' ) ) | ( (lv_POST_2_0= 'POST' ) ) | ( (lv_PUT_3_0= 'PUT' ) ) | ( (lv_PATCH_4_0= 'PATCH' ) ) ) ;
    public final EObject ruleHttpMethods() throws RecognitionException {
        EObject current = null;

        Token lv_GET_0_0=null;
        Token lv_DELETE_1_0=null;
        Token lv_POST_2_0=null;
        Token lv_PUT_3_0=null;
        Token lv_PATCH_4_0=null;


        	enterRule();

        try {
            // InternalSpringGen.g:2168:2: ( ( ( (lv_GET_0_0= 'GET' ) ) | ( (lv_DELETE_1_0= 'DELETE' ) ) | ( (lv_POST_2_0= 'POST' ) ) | ( (lv_PUT_3_0= 'PUT' ) ) | ( (lv_PATCH_4_0= 'PATCH' ) ) ) )
            // InternalSpringGen.g:2169:2: ( ( (lv_GET_0_0= 'GET' ) ) | ( (lv_DELETE_1_0= 'DELETE' ) ) | ( (lv_POST_2_0= 'POST' ) ) | ( (lv_PUT_3_0= 'PUT' ) ) | ( (lv_PATCH_4_0= 'PATCH' ) ) )
            {
            // InternalSpringGen.g:2169:2: ( ( (lv_GET_0_0= 'GET' ) ) | ( (lv_DELETE_1_0= 'DELETE' ) ) | ( (lv_POST_2_0= 'POST' ) ) | ( (lv_PUT_3_0= 'PUT' ) ) | ( (lv_PATCH_4_0= 'PATCH' ) ) )
            int alt34=5;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt34=1;
                }
                break;
            case 62:
                {
                alt34=2;
                }
                break;
            case 63:
                {
                alt34=3;
                }
                break;
            case 64:
                {
                alt34=4;
                }
                break;
            case 65:
                {
                alt34=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalSpringGen.g:2170:3: ( (lv_GET_0_0= 'GET' ) )
                    {
                    // InternalSpringGen.g:2170:3: ( (lv_GET_0_0= 'GET' ) )
                    // InternalSpringGen.g:2171:4: (lv_GET_0_0= 'GET' )
                    {
                    // InternalSpringGen.g:2171:4: (lv_GET_0_0= 'GET' )
                    // InternalSpringGen.g:2172:5: lv_GET_0_0= 'GET'
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
                    // InternalSpringGen.g:2185:3: ( (lv_DELETE_1_0= 'DELETE' ) )
                    {
                    // InternalSpringGen.g:2185:3: ( (lv_DELETE_1_0= 'DELETE' ) )
                    // InternalSpringGen.g:2186:4: (lv_DELETE_1_0= 'DELETE' )
                    {
                    // InternalSpringGen.g:2186:4: (lv_DELETE_1_0= 'DELETE' )
                    // InternalSpringGen.g:2187:5: lv_DELETE_1_0= 'DELETE'
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
                    // InternalSpringGen.g:2200:3: ( (lv_POST_2_0= 'POST' ) )
                    {
                    // InternalSpringGen.g:2200:3: ( (lv_POST_2_0= 'POST' ) )
                    // InternalSpringGen.g:2201:4: (lv_POST_2_0= 'POST' )
                    {
                    // InternalSpringGen.g:2201:4: (lv_POST_2_0= 'POST' )
                    // InternalSpringGen.g:2202:5: lv_POST_2_0= 'POST'
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
                    // InternalSpringGen.g:2215:3: ( (lv_PUT_3_0= 'PUT' ) )
                    {
                    // InternalSpringGen.g:2215:3: ( (lv_PUT_3_0= 'PUT' ) )
                    // InternalSpringGen.g:2216:4: (lv_PUT_3_0= 'PUT' )
                    {
                    // InternalSpringGen.g:2216:4: (lv_PUT_3_0= 'PUT' )
                    // InternalSpringGen.g:2217:5: lv_PUT_3_0= 'PUT'
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
                    // InternalSpringGen.g:2230:3: ( (lv_PATCH_4_0= 'PATCH' ) )
                    {
                    // InternalSpringGen.g:2230:3: ( (lv_PATCH_4_0= 'PATCH' ) )
                    // InternalSpringGen.g:2231:4: (lv_PATCH_4_0= 'PATCH' )
                    {
                    // InternalSpringGen.g:2231:4: (lv_PATCH_4_0= 'PATCH' )
                    // InternalSpringGen.g:2232:5: lv_PATCH_4_0= 'PATCH'
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
    // InternalSpringGen.g:2248:1: entryRuleRDBMS returns [EObject current=null] : iv_ruleRDBMS= ruleRDBMS EOF ;
    public final EObject entryRuleRDBMS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRDBMS = null;


        try {
            // InternalSpringGen.g:2248:46: (iv_ruleRDBMS= ruleRDBMS EOF )
            // InternalSpringGen.g:2249:2: iv_ruleRDBMS= ruleRDBMS EOF
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
    // InternalSpringGen.g:2255:1: ruleRDBMS returns [EObject current=null] : ( ( (lv_MYSQL_0_0= 'MySQL' ) ) | ( (lv_POSTGRES_1_0= 'Postgres' ) ) | ( (lv_MARIADB_2_0= 'MariaDB' ) ) | ( (lv_H2_3_0= 'H2' ) ) | ( (lv_ORACLE_4_0= 'Oracle' ) ) ) ;
    public final EObject ruleRDBMS() throws RecognitionException {
        EObject current = null;

        Token lv_MYSQL_0_0=null;
        Token lv_POSTGRES_1_0=null;
        Token lv_MARIADB_2_0=null;
        Token lv_H2_3_0=null;
        Token lv_ORACLE_4_0=null;


        	enterRule();

        try {
            // InternalSpringGen.g:2261:2: ( ( ( (lv_MYSQL_0_0= 'MySQL' ) ) | ( (lv_POSTGRES_1_0= 'Postgres' ) ) | ( (lv_MARIADB_2_0= 'MariaDB' ) ) | ( (lv_H2_3_0= 'H2' ) ) | ( (lv_ORACLE_4_0= 'Oracle' ) ) ) )
            // InternalSpringGen.g:2262:2: ( ( (lv_MYSQL_0_0= 'MySQL' ) ) | ( (lv_POSTGRES_1_0= 'Postgres' ) ) | ( (lv_MARIADB_2_0= 'MariaDB' ) ) | ( (lv_H2_3_0= 'H2' ) ) | ( (lv_ORACLE_4_0= 'Oracle' ) ) )
            {
            // InternalSpringGen.g:2262:2: ( ( (lv_MYSQL_0_0= 'MySQL' ) ) | ( (lv_POSTGRES_1_0= 'Postgres' ) ) | ( (lv_MARIADB_2_0= 'MariaDB' ) ) | ( (lv_H2_3_0= 'H2' ) ) | ( (lv_ORACLE_4_0= 'Oracle' ) ) )
            int alt35=5;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt35=1;
                }
                break;
            case 67:
                {
                alt35=2;
                }
                break;
            case 68:
                {
                alt35=3;
                }
                break;
            case 69:
                {
                alt35=4;
                }
                break;
            case 70:
                {
                alt35=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalSpringGen.g:2263:3: ( (lv_MYSQL_0_0= 'MySQL' ) )
                    {
                    // InternalSpringGen.g:2263:3: ( (lv_MYSQL_0_0= 'MySQL' ) )
                    // InternalSpringGen.g:2264:4: (lv_MYSQL_0_0= 'MySQL' )
                    {
                    // InternalSpringGen.g:2264:4: (lv_MYSQL_0_0= 'MySQL' )
                    // InternalSpringGen.g:2265:5: lv_MYSQL_0_0= 'MySQL'
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
                    // InternalSpringGen.g:2278:3: ( (lv_POSTGRES_1_0= 'Postgres' ) )
                    {
                    // InternalSpringGen.g:2278:3: ( (lv_POSTGRES_1_0= 'Postgres' ) )
                    // InternalSpringGen.g:2279:4: (lv_POSTGRES_1_0= 'Postgres' )
                    {
                    // InternalSpringGen.g:2279:4: (lv_POSTGRES_1_0= 'Postgres' )
                    // InternalSpringGen.g:2280:5: lv_POSTGRES_1_0= 'Postgres'
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
                    // InternalSpringGen.g:2293:3: ( (lv_MARIADB_2_0= 'MariaDB' ) )
                    {
                    // InternalSpringGen.g:2293:3: ( (lv_MARIADB_2_0= 'MariaDB' ) )
                    // InternalSpringGen.g:2294:4: (lv_MARIADB_2_0= 'MariaDB' )
                    {
                    // InternalSpringGen.g:2294:4: (lv_MARIADB_2_0= 'MariaDB' )
                    // InternalSpringGen.g:2295:5: lv_MARIADB_2_0= 'MariaDB'
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
                    // InternalSpringGen.g:2308:3: ( (lv_H2_3_0= 'H2' ) )
                    {
                    // InternalSpringGen.g:2308:3: ( (lv_H2_3_0= 'H2' ) )
                    // InternalSpringGen.g:2309:4: (lv_H2_3_0= 'H2' )
                    {
                    // InternalSpringGen.g:2309:4: (lv_H2_3_0= 'H2' )
                    // InternalSpringGen.g:2310:5: lv_H2_3_0= 'H2'
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
                    // InternalSpringGen.g:2323:3: ( (lv_ORACLE_4_0= 'Oracle' ) )
                    {
                    // InternalSpringGen.g:2323:3: ( (lv_ORACLE_4_0= 'Oracle' ) )
                    // InternalSpringGen.g:2324:4: (lv_ORACLE_4_0= 'Oracle' )
                    {
                    // InternalSpringGen.g:2324:4: (lv_ORACLE_4_0= 'Oracle' )
                    // InternalSpringGen.g:2325:5: lv_ORACLE_4_0= 'Oracle'
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
    // InternalSpringGen.g:2341:1: entryRuleDatabaseRelations returns [EObject current=null] : iv_ruleDatabaseRelations= ruleDatabaseRelations EOF ;
    public final EObject entryRuleDatabaseRelations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabaseRelations = null;


        try {
            // InternalSpringGen.g:2341:58: (iv_ruleDatabaseRelations= ruleDatabaseRelations EOF )
            // InternalSpringGen.g:2342:2: iv_ruleDatabaseRelations= ruleDatabaseRelations EOF
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
    // InternalSpringGen.g:2348:1: ruleDatabaseRelations returns [EObject current=null] : ( ( (lv_MANY_TO_MANY_0_0= 'ManyToMany' ) ) | ( (lv_MANY_TO_ONE_1_0= 'ManyToOne' ) ) | ( (lv_ONE_TO_MANY_2_0= 'OneToMany' ) ) ) ;
    public final EObject ruleDatabaseRelations() throws RecognitionException {
        EObject current = null;

        Token lv_MANY_TO_MANY_0_0=null;
        Token lv_MANY_TO_ONE_1_0=null;
        Token lv_ONE_TO_MANY_2_0=null;


        	enterRule();

        try {
            // InternalSpringGen.g:2354:2: ( ( ( (lv_MANY_TO_MANY_0_0= 'ManyToMany' ) ) | ( (lv_MANY_TO_ONE_1_0= 'ManyToOne' ) ) | ( (lv_ONE_TO_MANY_2_0= 'OneToMany' ) ) ) )
            // InternalSpringGen.g:2355:2: ( ( (lv_MANY_TO_MANY_0_0= 'ManyToMany' ) ) | ( (lv_MANY_TO_ONE_1_0= 'ManyToOne' ) ) | ( (lv_ONE_TO_MANY_2_0= 'OneToMany' ) ) )
            {
            // InternalSpringGen.g:2355:2: ( ( (lv_MANY_TO_MANY_0_0= 'ManyToMany' ) ) | ( (lv_MANY_TO_ONE_1_0= 'ManyToOne' ) ) | ( (lv_ONE_TO_MANY_2_0= 'OneToMany' ) ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt36=1;
                }
                break;
            case 72:
                {
                alt36=2;
                }
                break;
            case 73:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalSpringGen.g:2356:3: ( (lv_MANY_TO_MANY_0_0= 'ManyToMany' ) )
                    {
                    // InternalSpringGen.g:2356:3: ( (lv_MANY_TO_MANY_0_0= 'ManyToMany' ) )
                    // InternalSpringGen.g:2357:4: (lv_MANY_TO_MANY_0_0= 'ManyToMany' )
                    {
                    // InternalSpringGen.g:2357:4: (lv_MANY_TO_MANY_0_0= 'ManyToMany' )
                    // InternalSpringGen.g:2358:5: lv_MANY_TO_MANY_0_0= 'ManyToMany'
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
                    // InternalSpringGen.g:2371:3: ( (lv_MANY_TO_ONE_1_0= 'ManyToOne' ) )
                    {
                    // InternalSpringGen.g:2371:3: ( (lv_MANY_TO_ONE_1_0= 'ManyToOne' ) )
                    // InternalSpringGen.g:2372:4: (lv_MANY_TO_ONE_1_0= 'ManyToOne' )
                    {
                    // InternalSpringGen.g:2372:4: (lv_MANY_TO_ONE_1_0= 'ManyToOne' )
                    // InternalSpringGen.g:2373:5: lv_MANY_TO_ONE_1_0= 'ManyToOne'
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
                    // InternalSpringGen.g:2386:3: ( (lv_ONE_TO_MANY_2_0= 'OneToMany' ) )
                    {
                    // InternalSpringGen.g:2386:3: ( (lv_ONE_TO_MANY_2_0= 'OneToMany' ) )
                    // InternalSpringGen.g:2387:4: (lv_ONE_TO_MANY_2_0= 'OneToMany' )
                    {
                    // InternalSpringGen.g:2387:4: (lv_ONE_TO_MANY_2_0= 'OneToMany' )
                    // InternalSpringGen.g:2388:5: lv_ONE_TO_MANY_2_0= 'OneToMany'
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
    // InternalSpringGen.g:2404:1: entryRuleParamTransfer returns [EObject current=null] : iv_ruleParamTransfer= ruleParamTransfer EOF ;
    public final EObject entryRuleParamTransfer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamTransfer = null;


        try {
            // InternalSpringGen.g:2404:54: (iv_ruleParamTransfer= ruleParamTransfer EOF )
            // InternalSpringGen.g:2405:2: iv_ruleParamTransfer= ruleParamTransfer EOF
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
    // InternalSpringGen.g:2411:1: ruleParamTransfer returns [EObject current=null] : ( ( (lv_REQUEST_BODY_0_0= 'RequestBody' ) ) | ( (lv_REQUEST_PARAM_1_0= 'RequestParam' ) ) | ( (lv_PATH_VARIABLE_2_0= 'PathVariable' ) ) ) ;
    public final EObject ruleParamTransfer() throws RecognitionException {
        EObject current = null;

        Token lv_REQUEST_BODY_0_0=null;
        Token lv_REQUEST_PARAM_1_0=null;
        Token lv_PATH_VARIABLE_2_0=null;


        	enterRule();

        try {
            // InternalSpringGen.g:2417:2: ( ( ( (lv_REQUEST_BODY_0_0= 'RequestBody' ) ) | ( (lv_REQUEST_PARAM_1_0= 'RequestParam' ) ) | ( (lv_PATH_VARIABLE_2_0= 'PathVariable' ) ) ) )
            // InternalSpringGen.g:2418:2: ( ( (lv_REQUEST_BODY_0_0= 'RequestBody' ) ) | ( (lv_REQUEST_PARAM_1_0= 'RequestParam' ) ) | ( (lv_PATH_VARIABLE_2_0= 'PathVariable' ) ) )
            {
            // InternalSpringGen.g:2418:2: ( ( (lv_REQUEST_BODY_0_0= 'RequestBody' ) ) | ( (lv_REQUEST_PARAM_1_0= 'RequestParam' ) ) | ( (lv_PATH_VARIABLE_2_0= 'PathVariable' ) ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt37=1;
                }
                break;
            case 75:
                {
                alt37=2;
                }
                break;
            case 76:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalSpringGen.g:2419:3: ( (lv_REQUEST_BODY_0_0= 'RequestBody' ) )
                    {
                    // InternalSpringGen.g:2419:3: ( (lv_REQUEST_BODY_0_0= 'RequestBody' ) )
                    // InternalSpringGen.g:2420:4: (lv_REQUEST_BODY_0_0= 'RequestBody' )
                    {
                    // InternalSpringGen.g:2420:4: (lv_REQUEST_BODY_0_0= 'RequestBody' )
                    // InternalSpringGen.g:2421:5: lv_REQUEST_BODY_0_0= 'RequestBody'
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
                    // InternalSpringGen.g:2434:3: ( (lv_REQUEST_PARAM_1_0= 'RequestParam' ) )
                    {
                    // InternalSpringGen.g:2434:3: ( (lv_REQUEST_PARAM_1_0= 'RequestParam' ) )
                    // InternalSpringGen.g:2435:4: (lv_REQUEST_PARAM_1_0= 'RequestParam' )
                    {
                    // InternalSpringGen.g:2435:4: (lv_REQUEST_PARAM_1_0= 'RequestParam' )
                    // InternalSpringGen.g:2436:5: lv_REQUEST_PARAM_1_0= 'RequestParam'
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
                    // InternalSpringGen.g:2449:3: ( (lv_PATH_VARIABLE_2_0= 'PathVariable' ) )
                    {
                    // InternalSpringGen.g:2449:3: ( (lv_PATH_VARIABLE_2_0= 'PathVariable' ) )
                    // InternalSpringGen.g:2450:4: (lv_PATH_VARIABLE_2_0= 'PathVariable' )
                    {
                    // InternalSpringGen.g:2450:4: (lv_PATH_VARIABLE_2_0= 'PathVariable' )
                    // InternalSpringGen.g:2451:5: lv_PATH_VARIABLE_2_0= 'PathVariable'
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


    // $ANTLR start "entryRuleDockerfile"
    // InternalSpringGen.g:2467:1: entryRuleDockerfile returns [EObject current=null] : iv_ruleDockerfile= ruleDockerfile EOF ;
    public final EObject entryRuleDockerfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDockerfile = null;


        try {
            // InternalSpringGen.g:2467:51: (iv_ruleDockerfile= ruleDockerfile EOF )
            // InternalSpringGen.g:2468:2: iv_ruleDockerfile= ruleDockerfile EOF
            {
             newCompositeNode(grammarAccess.getDockerfileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDockerfile=ruleDockerfile();

            state._fsp--;

             current =iv_ruleDockerfile; 
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
    // $ANTLR end "entryRuleDockerfile"


    // $ANTLR start "ruleDockerfile"
    // InternalSpringGen.g:2474:1: ruleDockerfile returns [EObject current=null] : (otherlv_0= 'dockerfile' otherlv_1= '{' ( (lv_baseImage_2_0= ruleBaseImage ) ) ( (lv_instructions_3_0= ruleDockerInstruction ) )* otherlv_4= '}' ) ;
    public final EObject ruleDockerfile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_baseImage_2_0 = null;

        EObject lv_instructions_3_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:2480:2: ( (otherlv_0= 'dockerfile' otherlv_1= '{' ( (lv_baseImage_2_0= ruleBaseImage ) ) ( (lv_instructions_3_0= ruleDockerInstruction ) )* otherlv_4= '}' ) )
            // InternalSpringGen.g:2481:2: (otherlv_0= 'dockerfile' otherlv_1= '{' ( (lv_baseImage_2_0= ruleBaseImage ) ) ( (lv_instructions_3_0= ruleDockerInstruction ) )* otherlv_4= '}' )
            {
            // InternalSpringGen.g:2481:2: (otherlv_0= 'dockerfile' otherlv_1= '{' ( (lv_baseImage_2_0= ruleBaseImage ) ) ( (lv_instructions_3_0= ruleDockerInstruction ) )* otherlv_4= '}' )
            // InternalSpringGen.g:2482:3: otherlv_0= 'dockerfile' otherlv_1= '{' ( (lv_baseImage_2_0= ruleBaseImage ) ) ( (lv_instructions_3_0= ruleDockerInstruction ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDockerfileAccess().getDockerfileKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getDockerfileAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSpringGen.g:2490:3: ( (lv_baseImage_2_0= ruleBaseImage ) )
            // InternalSpringGen.g:2491:4: (lv_baseImage_2_0= ruleBaseImage )
            {
            // InternalSpringGen.g:2491:4: (lv_baseImage_2_0= ruleBaseImage )
            // InternalSpringGen.g:2492:5: lv_baseImage_2_0= ruleBaseImage
            {

            					newCompositeNode(grammarAccess.getDockerfileAccess().getBaseImageBaseImageParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_54);
            lv_baseImage_2_0=ruleBaseImage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDockerfileRule());
            					}
            					set(
            						current,
            						"baseImage",
            						lv_baseImage_2_0,
            						"org.xtext.example.springgen.SpringGen.BaseImage");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpringGen.g:2509:3: ( (lv_instructions_3_0= ruleDockerInstruction ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=79 && LA38_0<=84)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSpringGen.g:2510:4: (lv_instructions_3_0= ruleDockerInstruction )
            	    {
            	    // InternalSpringGen.g:2510:4: (lv_instructions_3_0= ruleDockerInstruction )
            	    // InternalSpringGen.g:2511:5: lv_instructions_3_0= ruleDockerInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getDockerfileAccess().getInstructionsDockerInstructionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_54);
            	    lv_instructions_3_0=ruleDockerInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDockerfileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_3_0,
            	    						"org.xtext.example.springgen.SpringGen.DockerInstruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDockerfileAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDockerfile"


    // $ANTLR start "entryRuleBaseImage"
    // InternalSpringGen.g:2536:1: entryRuleBaseImage returns [EObject current=null] : iv_ruleBaseImage= ruleBaseImage EOF ;
    public final EObject entryRuleBaseImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseImage = null;


        try {
            // InternalSpringGen.g:2536:50: (iv_ruleBaseImage= ruleBaseImage EOF )
            // InternalSpringGen.g:2537:2: iv_ruleBaseImage= ruleBaseImage EOF
            {
             newCompositeNode(grammarAccess.getBaseImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseImage=ruleBaseImage();

            state._fsp--;

             current =iv_ruleBaseImage; 
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
    // $ANTLR end "entryRuleBaseImage"


    // $ANTLR start "ruleBaseImage"
    // InternalSpringGen.g:2543:1: ruleBaseImage returns [EObject current=null] : (otherlv_0= 'FROM' ( (lv_image_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleBaseImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_image_1_0=null;


        	enterRule();

        try {
            // InternalSpringGen.g:2549:2: ( (otherlv_0= 'FROM' ( (lv_image_1_0= RULE_STRING ) ) ) )
            // InternalSpringGen.g:2550:2: (otherlv_0= 'FROM' ( (lv_image_1_0= RULE_STRING ) ) )
            {
            // InternalSpringGen.g:2550:2: (otherlv_0= 'FROM' ( (lv_image_1_0= RULE_STRING ) ) )
            // InternalSpringGen.g:2551:3: otherlv_0= 'FROM' ( (lv_image_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getBaseImageAccess().getFROMKeyword_0());
            		
            // InternalSpringGen.g:2555:3: ( (lv_image_1_0= RULE_STRING ) )
            // InternalSpringGen.g:2556:4: (lv_image_1_0= RULE_STRING )
            {
            // InternalSpringGen.g:2556:4: (lv_image_1_0= RULE_STRING )
            // InternalSpringGen.g:2557:5: lv_image_1_0= RULE_STRING
            {
            lv_image_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_image_1_0, grammarAccess.getBaseImageAccess().getImageSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBaseImageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"image",
            						lv_image_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleBaseImage"


    // $ANTLR start "entryRuleDockerInstruction"
    // InternalSpringGen.g:2577:1: entryRuleDockerInstruction returns [EObject current=null] : iv_ruleDockerInstruction= ruleDockerInstruction EOF ;
    public final EObject entryRuleDockerInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDockerInstruction = null;


        try {
            // InternalSpringGen.g:2577:58: (iv_ruleDockerInstruction= ruleDockerInstruction EOF )
            // InternalSpringGen.g:2578:2: iv_ruleDockerInstruction= ruleDockerInstruction EOF
            {
             newCompositeNode(grammarAccess.getDockerInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDockerInstruction=ruleDockerInstruction();

            state._fsp--;

             current =iv_ruleDockerInstruction; 
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
    // $ANTLR end "entryRuleDockerInstruction"


    // $ANTLR start "ruleDockerInstruction"
    // InternalSpringGen.g:2584:1: ruleDockerInstruction returns [EObject current=null] : (this_RunInstruction_0= ruleRunInstruction | this_CopyInstruction_1= ruleCopyInstruction | this_ExposeInstruction_2= ruleExposeInstruction | this_EnvInstruction_3= ruleEnvInstruction | this_WorkdirInstruction_4= ruleWorkdirInstruction | this_CmdInstruction_5= ruleCmdInstruction ) ;
    public final EObject ruleDockerInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_RunInstruction_0 = null;

        EObject this_CopyInstruction_1 = null;

        EObject this_ExposeInstruction_2 = null;

        EObject this_EnvInstruction_3 = null;

        EObject this_WorkdirInstruction_4 = null;

        EObject this_CmdInstruction_5 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:2590:2: ( (this_RunInstruction_0= ruleRunInstruction | this_CopyInstruction_1= ruleCopyInstruction | this_ExposeInstruction_2= ruleExposeInstruction | this_EnvInstruction_3= ruleEnvInstruction | this_WorkdirInstruction_4= ruleWorkdirInstruction | this_CmdInstruction_5= ruleCmdInstruction ) )
            // InternalSpringGen.g:2591:2: (this_RunInstruction_0= ruleRunInstruction | this_CopyInstruction_1= ruleCopyInstruction | this_ExposeInstruction_2= ruleExposeInstruction | this_EnvInstruction_3= ruleEnvInstruction | this_WorkdirInstruction_4= ruleWorkdirInstruction | this_CmdInstruction_5= ruleCmdInstruction )
            {
            // InternalSpringGen.g:2591:2: (this_RunInstruction_0= ruleRunInstruction | this_CopyInstruction_1= ruleCopyInstruction | this_ExposeInstruction_2= ruleExposeInstruction | this_EnvInstruction_3= ruleEnvInstruction | this_WorkdirInstruction_4= ruleWorkdirInstruction | this_CmdInstruction_5= ruleCmdInstruction )
            int alt39=6;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt39=1;
                }
                break;
            case 80:
                {
                alt39=2;
                }
                break;
            case 81:
                {
                alt39=3;
                }
                break;
            case 82:
                {
                alt39=4;
                }
                break;
            case 83:
                {
                alt39=5;
                }
                break;
            case 84:
                {
                alt39=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalSpringGen.g:2592:3: this_RunInstruction_0= ruleRunInstruction
                    {

                    			newCompositeNode(grammarAccess.getDockerInstructionAccess().getRunInstructionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RunInstruction_0=ruleRunInstruction();

                    state._fsp--;


                    			current = this_RunInstruction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSpringGen.g:2601:3: this_CopyInstruction_1= ruleCopyInstruction
                    {

                    			newCompositeNode(grammarAccess.getDockerInstructionAccess().getCopyInstructionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CopyInstruction_1=ruleCopyInstruction();

                    state._fsp--;


                    			current = this_CopyInstruction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSpringGen.g:2610:3: this_ExposeInstruction_2= ruleExposeInstruction
                    {

                    			newCompositeNode(grammarAccess.getDockerInstructionAccess().getExposeInstructionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExposeInstruction_2=ruleExposeInstruction();

                    state._fsp--;


                    			current = this_ExposeInstruction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSpringGen.g:2619:3: this_EnvInstruction_3= ruleEnvInstruction
                    {

                    			newCompositeNode(grammarAccess.getDockerInstructionAccess().getEnvInstructionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnvInstruction_3=ruleEnvInstruction();

                    state._fsp--;


                    			current = this_EnvInstruction_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSpringGen.g:2628:3: this_WorkdirInstruction_4= ruleWorkdirInstruction
                    {

                    			newCompositeNode(grammarAccess.getDockerInstructionAccess().getWorkdirInstructionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkdirInstruction_4=ruleWorkdirInstruction();

                    state._fsp--;


                    			current = this_WorkdirInstruction_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSpringGen.g:2637:3: this_CmdInstruction_5= ruleCmdInstruction
                    {

                    			newCompositeNode(grammarAccess.getDockerInstructionAccess().getCmdInstructionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_CmdInstruction_5=ruleCmdInstruction();

                    state._fsp--;


                    			current = this_CmdInstruction_5;
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
    // $ANTLR end "ruleDockerInstruction"


    // $ANTLR start "entryRuleRunInstruction"
    // InternalSpringGen.g:2649:1: entryRuleRunInstruction returns [EObject current=null] : iv_ruleRunInstruction= ruleRunInstruction EOF ;
    public final EObject entryRuleRunInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunInstruction = null;


        try {
            // InternalSpringGen.g:2649:55: (iv_ruleRunInstruction= ruleRunInstruction EOF )
            // InternalSpringGen.g:2650:2: iv_ruleRunInstruction= ruleRunInstruction EOF
            {
             newCompositeNode(grammarAccess.getRunInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRunInstruction=ruleRunInstruction();

            state._fsp--;

             current =iv_ruleRunInstruction; 
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
    // $ANTLR end "entryRuleRunInstruction"


    // $ANTLR start "ruleRunInstruction"
    // InternalSpringGen.g:2656:1: ruleRunInstruction returns [EObject current=null] : (otherlv_0= 'RUN' ( (lv_command_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleRunInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_command_1_0=null;


        	enterRule();

        try {
            // InternalSpringGen.g:2662:2: ( (otherlv_0= 'RUN' ( (lv_command_1_0= RULE_STRING ) ) ) )
            // InternalSpringGen.g:2663:2: (otherlv_0= 'RUN' ( (lv_command_1_0= RULE_STRING ) ) )
            {
            // InternalSpringGen.g:2663:2: (otherlv_0= 'RUN' ( (lv_command_1_0= RULE_STRING ) ) )
            // InternalSpringGen.g:2664:3: otherlv_0= 'RUN' ( (lv_command_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getRunInstructionAccess().getRUNKeyword_0());
            		
            // InternalSpringGen.g:2668:3: ( (lv_command_1_0= RULE_STRING ) )
            // InternalSpringGen.g:2669:4: (lv_command_1_0= RULE_STRING )
            {
            // InternalSpringGen.g:2669:4: (lv_command_1_0= RULE_STRING )
            // InternalSpringGen.g:2670:5: lv_command_1_0= RULE_STRING
            {
            lv_command_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_command_1_0, grammarAccess.getRunInstructionAccess().getCommandSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRunInstructionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"command",
            						lv_command_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleRunInstruction"


    // $ANTLR start "entryRuleCopyInstruction"
    // InternalSpringGen.g:2690:1: entryRuleCopyInstruction returns [EObject current=null] : iv_ruleCopyInstruction= ruleCopyInstruction EOF ;
    public final EObject entryRuleCopyInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopyInstruction = null;


        try {
            // InternalSpringGen.g:2690:56: (iv_ruleCopyInstruction= ruleCopyInstruction EOF )
            // InternalSpringGen.g:2691:2: iv_ruleCopyInstruction= ruleCopyInstruction EOF
            {
             newCompositeNode(grammarAccess.getCopyInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCopyInstruction=ruleCopyInstruction();

            state._fsp--;

             current =iv_ruleCopyInstruction; 
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
    // $ANTLR end "entryRuleCopyInstruction"


    // $ANTLR start "ruleCopyInstruction"
    // InternalSpringGen.g:2697:1: ruleCopyInstruction returns [EObject current=null] : (otherlv_0= 'COPY' ( (lv_source_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_target_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleCopyInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_source_1_0=null;
        Token otherlv_2=null;
        Token lv_target_3_0=null;


        	enterRule();

        try {
            // InternalSpringGen.g:2703:2: ( (otherlv_0= 'COPY' ( (lv_source_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_target_3_0= RULE_STRING ) ) ) )
            // InternalSpringGen.g:2704:2: (otherlv_0= 'COPY' ( (lv_source_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_target_3_0= RULE_STRING ) ) )
            {
            // InternalSpringGen.g:2704:2: (otherlv_0= 'COPY' ( (lv_source_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_target_3_0= RULE_STRING ) ) )
            // InternalSpringGen.g:2705:3: otherlv_0= 'COPY' ( (lv_source_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_target_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getCopyInstructionAccess().getCOPYKeyword_0());
            		
            // InternalSpringGen.g:2709:3: ( (lv_source_1_0= RULE_STRING ) )
            // InternalSpringGen.g:2710:4: (lv_source_1_0= RULE_STRING )
            {
            // InternalSpringGen.g:2710:4: (lv_source_1_0= RULE_STRING )
            // InternalSpringGen.g:2711:5: lv_source_1_0= RULE_STRING
            {
            lv_source_1_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

            					newLeafNode(lv_source_1_0, grammarAccess.getCopyInstructionAccess().getSourceSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCopyInstructionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,46,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getCopyInstructionAccess().getColonKeyword_2());
            		
            // InternalSpringGen.g:2731:3: ( (lv_target_3_0= RULE_STRING ) )
            // InternalSpringGen.g:2732:4: (lv_target_3_0= RULE_STRING )
            {
            // InternalSpringGen.g:2732:4: (lv_target_3_0= RULE_STRING )
            // InternalSpringGen.g:2733:5: lv_target_3_0= RULE_STRING
            {
            lv_target_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_target_3_0, grammarAccess.getCopyInstructionAccess().getTargetSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCopyInstructionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleCopyInstruction"


    // $ANTLR start "entryRuleExposeInstruction"
    // InternalSpringGen.g:2753:1: entryRuleExposeInstruction returns [EObject current=null] : iv_ruleExposeInstruction= ruleExposeInstruction EOF ;
    public final EObject entryRuleExposeInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExposeInstruction = null;


        try {
            // InternalSpringGen.g:2753:58: (iv_ruleExposeInstruction= ruleExposeInstruction EOF )
            // InternalSpringGen.g:2754:2: iv_ruleExposeInstruction= ruleExposeInstruction EOF
            {
             newCompositeNode(grammarAccess.getExposeInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExposeInstruction=ruleExposeInstruction();

            state._fsp--;

             current =iv_ruleExposeInstruction; 
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
    // $ANTLR end "entryRuleExposeInstruction"


    // $ANTLR start "ruleExposeInstruction"
    // InternalSpringGen.g:2760:1: ruleExposeInstruction returns [EObject current=null] : (otherlv_0= 'EXPOSE' ( (lv_port_1_0= RULE_INT ) ) ) ;
    public final EObject ruleExposeInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_port_1_0=null;


        	enterRule();

        try {
            // InternalSpringGen.g:2766:2: ( (otherlv_0= 'EXPOSE' ( (lv_port_1_0= RULE_INT ) ) ) )
            // InternalSpringGen.g:2767:2: (otherlv_0= 'EXPOSE' ( (lv_port_1_0= RULE_INT ) ) )
            {
            // InternalSpringGen.g:2767:2: (otherlv_0= 'EXPOSE' ( (lv_port_1_0= RULE_INT ) ) )
            // InternalSpringGen.g:2768:3: otherlv_0= 'EXPOSE' ( (lv_port_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getExposeInstructionAccess().getEXPOSEKeyword_0());
            		
            // InternalSpringGen.g:2772:3: ( (lv_port_1_0= RULE_INT ) )
            // InternalSpringGen.g:2773:4: (lv_port_1_0= RULE_INT )
            {
            // InternalSpringGen.g:2773:4: (lv_port_1_0= RULE_INT )
            // InternalSpringGen.g:2774:5: lv_port_1_0= RULE_INT
            {
            lv_port_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_port_1_0, grammarAccess.getExposeInstructionAccess().getPortINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExposeInstructionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_1_0,
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
    // $ANTLR end "ruleExposeInstruction"


    // $ANTLR start "entryRuleEnvInstruction"
    // InternalSpringGen.g:2794:1: entryRuleEnvInstruction returns [EObject current=null] : iv_ruleEnvInstruction= ruleEnvInstruction EOF ;
    public final EObject entryRuleEnvInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvInstruction = null;


        try {
            // InternalSpringGen.g:2794:55: (iv_ruleEnvInstruction= ruleEnvInstruction EOF )
            // InternalSpringGen.g:2795:2: iv_ruleEnvInstruction= ruleEnvInstruction EOF
            {
             newCompositeNode(grammarAccess.getEnvInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvInstruction=ruleEnvInstruction();

            state._fsp--;

             current =iv_ruleEnvInstruction; 
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
    // $ANTLR end "entryRuleEnvInstruction"


    // $ANTLR start "ruleEnvInstruction"
    // InternalSpringGen.g:2801:1: ruleEnvInstruction returns [EObject current=null] : (otherlv_0= 'ENV' ( (lv_key_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEnvInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalSpringGen.g:2807:2: ( (otherlv_0= 'ENV' ( (lv_key_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalSpringGen.g:2808:2: (otherlv_0= 'ENV' ( (lv_key_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalSpringGen.g:2808:2: (otherlv_0= 'ENV' ( (lv_key_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalSpringGen.g:2809:3: otherlv_0= 'ENV' ( (lv_key_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvInstructionAccess().getENVKeyword_0());
            		
            // InternalSpringGen.g:2813:3: ( (lv_key_1_0= RULE_ID ) )
            // InternalSpringGen.g:2814:4: (lv_key_1_0= RULE_ID )
            {
            // InternalSpringGen.g:2814:4: (lv_key_1_0= RULE_ID )
            // InternalSpringGen.g:2815:5: lv_key_1_0= RULE_ID
            {
            lv_key_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_key_1_0, grammarAccess.getEnvInstructionAccess().getKeyIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnvInstructionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSpringGen.g:2831:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalSpringGen.g:2832:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalSpringGen.g:2832:4: (lv_value_2_0= RULE_STRING )
            // InternalSpringGen.g:2833:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getEnvInstructionAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnvInstructionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleEnvInstruction"


    // $ANTLR start "entryRuleWorkdirInstruction"
    // InternalSpringGen.g:2853:1: entryRuleWorkdirInstruction returns [EObject current=null] : iv_ruleWorkdirInstruction= ruleWorkdirInstruction EOF ;
    public final EObject entryRuleWorkdirInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkdirInstruction = null;


        try {
            // InternalSpringGen.g:2853:59: (iv_ruleWorkdirInstruction= ruleWorkdirInstruction EOF )
            // InternalSpringGen.g:2854:2: iv_ruleWorkdirInstruction= ruleWorkdirInstruction EOF
            {
             newCompositeNode(grammarAccess.getWorkdirInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkdirInstruction=ruleWorkdirInstruction();

            state._fsp--;

             current =iv_ruleWorkdirInstruction; 
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
    // $ANTLR end "entryRuleWorkdirInstruction"


    // $ANTLR start "ruleWorkdirInstruction"
    // InternalSpringGen.g:2860:1: ruleWorkdirInstruction returns [EObject current=null] : (otherlv_0= 'WORKDIR' ( (lv_path_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleWorkdirInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;


        	enterRule();

        try {
            // InternalSpringGen.g:2866:2: ( (otherlv_0= 'WORKDIR' ( (lv_path_1_0= RULE_STRING ) ) ) )
            // InternalSpringGen.g:2867:2: (otherlv_0= 'WORKDIR' ( (lv_path_1_0= RULE_STRING ) ) )
            {
            // InternalSpringGen.g:2867:2: (otherlv_0= 'WORKDIR' ( (lv_path_1_0= RULE_STRING ) ) )
            // InternalSpringGen.g:2868:3: otherlv_0= 'WORKDIR' ( (lv_path_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkdirInstructionAccess().getWORKDIRKeyword_0());
            		
            // InternalSpringGen.g:2872:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalSpringGen.g:2873:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalSpringGen.g:2873:4: (lv_path_1_0= RULE_STRING )
            // InternalSpringGen.g:2874:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_path_1_0, grammarAccess.getWorkdirInstructionAccess().getPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkdirInstructionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleWorkdirInstruction"


    // $ANTLR start "entryRuleCmdInstruction"
    // InternalSpringGen.g:2894:1: entryRuleCmdInstruction returns [EObject current=null] : iv_ruleCmdInstruction= ruleCmdInstruction EOF ;
    public final EObject entryRuleCmdInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmdInstruction = null;


        try {
            // InternalSpringGen.g:2894:55: (iv_ruleCmdInstruction= ruleCmdInstruction EOF )
            // InternalSpringGen.g:2895:2: iv_ruleCmdInstruction= ruleCmdInstruction EOF
            {
             newCompositeNode(grammarAccess.getCmdInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCmdInstruction=ruleCmdInstruction();

            state._fsp--;

             current =iv_ruleCmdInstruction; 
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
    // $ANTLR end "entryRuleCmdInstruction"


    // $ANTLR start "ruleCmdInstruction"
    // InternalSpringGen.g:2901:1: ruleCmdInstruction returns [EObject current=null] : (otherlv_0= 'CMD' ( (lv_command_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCmdInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_command_1_0=null;


        	enterRule();

        try {
            // InternalSpringGen.g:2907:2: ( (otherlv_0= 'CMD' ( (lv_command_1_0= RULE_STRING ) ) ) )
            // InternalSpringGen.g:2908:2: (otherlv_0= 'CMD' ( (lv_command_1_0= RULE_STRING ) ) )
            {
            // InternalSpringGen.g:2908:2: (otherlv_0= 'CMD' ( (lv_command_1_0= RULE_STRING ) ) )
            // InternalSpringGen.g:2909:3: otherlv_0= 'CMD' ( (lv_command_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,84,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getCmdInstructionAccess().getCMDKeyword_0());
            		
            // InternalSpringGen.g:2913:3: ( (lv_command_1_0= RULE_STRING ) )
            // InternalSpringGen.g:2914:4: (lv_command_1_0= RULE_STRING )
            {
            // InternalSpringGen.g:2914:4: (lv_command_1_0= RULE_STRING )
            // InternalSpringGen.g:2915:5: lv_command_1_0= RULE_STRING
            {
            lv_command_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_command_1_0, grammarAccess.getCmdInstructionAccess().getCommandSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCmdInstructionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"command",
            						lv_command_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleCmdInstruction"


    // $ANTLR start "entryRuleAngularApp"
    // InternalSpringGen.g:2935:1: entryRuleAngularApp returns [EObject current=null] : iv_ruleAngularApp= ruleAngularApp EOF ;
    public final EObject entryRuleAngularApp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngularApp = null;


        try {
            // InternalSpringGen.g:2935:51: (iv_ruleAngularApp= ruleAngularApp EOF )
            // InternalSpringGen.g:2936:2: iv_ruleAngularApp= ruleAngularApp EOF
            {
             newCompositeNode(grammarAccess.getAngularAppRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAngularApp=ruleAngularApp();

            state._fsp--;

             current =iv_ruleAngularApp; 
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
    // $ANTLR end "entryRuleAngularApp"


    // $ANTLR start "ruleAngularApp"
    // InternalSpringGen.g:2942:1: ruleAngularApp returns [EObject current=null] : (otherlv_0= 'angularApp' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) ( (lv_components_3_0= ruleAngularComponent ) )* ( (lv_services_4_0= ruleAngularService ) )* ( (lv_modules_5_0= ruleAngularModule ) )* otherlv_6= '}' ) ;
    public final EObject ruleAngularApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_6=null;
        EObject lv_components_3_0 = null;

        EObject lv_services_4_0 = null;

        EObject lv_modules_5_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:2948:2: ( (otherlv_0= 'angularApp' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) ( (lv_components_3_0= ruleAngularComponent ) )* ( (lv_services_4_0= ruleAngularService ) )* ( (lv_modules_5_0= ruleAngularModule ) )* otherlv_6= '}' ) )
            // InternalSpringGen.g:2949:2: (otherlv_0= 'angularApp' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) ( (lv_components_3_0= ruleAngularComponent ) )* ( (lv_services_4_0= ruleAngularService ) )* ( (lv_modules_5_0= ruleAngularModule ) )* otherlv_6= '}' )
            {
            // InternalSpringGen.g:2949:2: (otherlv_0= 'angularApp' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) ( (lv_components_3_0= ruleAngularComponent ) )* ( (lv_services_4_0= ruleAngularService ) )* ( (lv_modules_5_0= ruleAngularModule ) )* otherlv_6= '}' )
            // InternalSpringGen.g:2950:3: otherlv_0= 'angularApp' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) ( (lv_components_3_0= ruleAngularComponent ) )* ( (lv_services_4_0= ruleAngularService ) )* ( (lv_modules_5_0= ruleAngularModule ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAngularAppAccess().getAngularAppKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAngularAppAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSpringGen.g:2958:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSpringGen.g:2959:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSpringGen.g:2959:4: (lv_name_2_0= RULE_ID )
            // InternalSpringGen.g:2960:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAngularAppAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAngularAppRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSpringGen.g:2976:3: ( (lv_components_3_0= ruleAngularComponent ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==86) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalSpringGen.g:2977:4: (lv_components_3_0= ruleAngularComponent )
            	    {
            	    // InternalSpringGen.g:2977:4: (lv_components_3_0= ruleAngularComponent )
            	    // InternalSpringGen.g:2978:5: lv_components_3_0= ruleAngularComponent
            	    {

            	    					newCompositeNode(grammarAccess.getAngularAppAccess().getComponentsAngularComponentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_55);
            	    lv_components_3_0=ruleAngularComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAngularAppRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_3_0,
            	    						"org.xtext.example.springgen.SpringGen.AngularComponent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // InternalSpringGen.g:2995:3: ( (lv_services_4_0= ruleAngularService ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==30) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalSpringGen.g:2996:4: (lv_services_4_0= ruleAngularService )
            	    {
            	    // InternalSpringGen.g:2996:4: (lv_services_4_0= ruleAngularService )
            	    // InternalSpringGen.g:2997:5: lv_services_4_0= ruleAngularService
            	    {

            	    					newCompositeNode(grammarAccess.getAngularAppAccess().getServicesAngularServiceParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_56);
            	    lv_services_4_0=ruleAngularService();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAngularAppRule());
            	    					}
            	    					add(
            	    						current,
            	    						"services",
            	    						lv_services_4_0,
            	    						"org.xtext.example.springgen.SpringGen.AngularService");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // InternalSpringGen.g:3014:3: ( (lv_modules_5_0= ruleAngularModule ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==88) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalSpringGen.g:3015:4: (lv_modules_5_0= ruleAngularModule )
            	    {
            	    // InternalSpringGen.g:3015:4: (lv_modules_5_0= ruleAngularModule )
            	    // InternalSpringGen.g:3016:5: lv_modules_5_0= ruleAngularModule
            	    {

            	    					newCompositeNode(grammarAccess.getAngularAppAccess().getModulesAngularModuleParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_57);
            	    lv_modules_5_0=ruleAngularModule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAngularAppRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modules",
            	    						lv_modules_5_0,
            	    						"org.xtext.example.springgen.SpringGen.AngularModule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAngularAppAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAngularApp"


    // $ANTLR start "entryRuleAngularComponent"
    // InternalSpringGen.g:3041:1: entryRuleAngularComponent returns [EObject current=null] : iv_ruleAngularComponent= ruleAngularComponent EOF ;
    public final EObject entryRuleAngularComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngularComponent = null;


        try {
            // InternalSpringGen.g:3041:57: (iv_ruleAngularComponent= ruleAngularComponent EOF )
            // InternalSpringGen.g:3042:2: iv_ruleAngularComponent= ruleAngularComponent EOF
            {
             newCompositeNode(grammarAccess.getAngularComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAngularComponent=ruleAngularComponent();

            state._fsp--;

             current =iv_ruleAngularComponent; 
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
    // $ANTLR end "entryRuleAngularComponent"


    // $ANTLR start "ruleAngularComponent"
    // InternalSpringGen.g:3048:1: ruleAngularComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_selector_3_0= RULE_STRING ) ) ( (lv_templateUrl_4_0= RULE_STRING ) ) ( (lv_styleUrls_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleAngularComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_selector_3_0=null;
        Token lv_templateUrl_4_0=null;
        Token lv_styleUrls_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSpringGen.g:3054:2: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_selector_3_0= RULE_STRING ) ) ( (lv_templateUrl_4_0= RULE_STRING ) ) ( (lv_styleUrls_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalSpringGen.g:3055:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_selector_3_0= RULE_STRING ) ) ( (lv_templateUrl_4_0= RULE_STRING ) ) ( (lv_styleUrls_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalSpringGen.g:3055:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_selector_3_0= RULE_STRING ) ) ( (lv_templateUrl_4_0= RULE_STRING ) ) ( (lv_styleUrls_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalSpringGen.g:3056:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_selector_3_0= RULE_STRING ) ) ( (lv_templateUrl_4_0= RULE_STRING ) ) ( (lv_styleUrls_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAngularComponentAccess().getComponentKeyword_0());
            		
            // InternalSpringGen.g:3060:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpringGen.g:3061:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpringGen.g:3061:4: (lv_name_1_0= RULE_ID )
            // InternalSpringGen.g:3062:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAngularComponentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAngularComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getAngularComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSpringGen.g:3082:3: ( (lv_selector_3_0= RULE_STRING ) )
            // InternalSpringGen.g:3083:4: (lv_selector_3_0= RULE_STRING )
            {
            // InternalSpringGen.g:3083:4: (lv_selector_3_0= RULE_STRING )
            // InternalSpringGen.g:3084:5: lv_selector_3_0= RULE_STRING
            {
            lv_selector_3_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_selector_3_0, grammarAccess.getAngularComponentAccess().getSelectorSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAngularComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"selector",
            						lv_selector_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSpringGen.g:3100:3: ( (lv_templateUrl_4_0= RULE_STRING ) )
            // InternalSpringGen.g:3101:4: (lv_templateUrl_4_0= RULE_STRING )
            {
            // InternalSpringGen.g:3101:4: (lv_templateUrl_4_0= RULE_STRING )
            // InternalSpringGen.g:3102:5: lv_templateUrl_4_0= RULE_STRING
            {
            lv_templateUrl_4_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_templateUrl_4_0, grammarAccess.getAngularComponentAccess().getTemplateUrlSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAngularComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"templateUrl",
            						lv_templateUrl_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSpringGen.g:3118:3: ( (lv_styleUrls_5_0= RULE_STRING ) )
            // InternalSpringGen.g:3119:4: (lv_styleUrls_5_0= RULE_STRING )
            {
            // InternalSpringGen.g:3119:4: (lv_styleUrls_5_0= RULE_STRING )
            // InternalSpringGen.g:3120:5: lv_styleUrls_5_0= RULE_STRING
            {
            lv_styleUrls_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_styleUrls_5_0, grammarAccess.getAngularComponentAccess().getStyleUrlsSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAngularComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"styleUrls",
            						lv_styleUrls_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAngularComponentAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAngularComponent"


    // $ANTLR start "entryRuleAngularService"
    // InternalSpringGen.g:3144:1: entryRuleAngularService returns [EObject current=null] : iv_ruleAngularService= ruleAngularService EOF ;
    public final EObject entryRuleAngularService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngularService = null;


        try {
            // InternalSpringGen.g:3144:55: (iv_ruleAngularService= ruleAngularService EOF )
            // InternalSpringGen.g:3145:2: iv_ruleAngularService= ruleAngularService EOF
            {
             newCompositeNode(grammarAccess.getAngularServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAngularService=ruleAngularService();

            state._fsp--;

             current =iv_ruleAngularService; 
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
    // $ANTLR end "entryRuleAngularService"


    // $ANTLR start "ruleAngularService"
    // InternalSpringGen.g:3151:1: ruleAngularService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleAngularServiceMethod ) )* otherlv_4= '}' ) ;
    public final EObject ruleAngularService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_methods_3_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:3157:2: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleAngularServiceMethod ) )* otherlv_4= '}' ) )
            // InternalSpringGen.g:3158:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleAngularServiceMethod ) )* otherlv_4= '}' )
            {
            // InternalSpringGen.g:3158:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleAngularServiceMethod ) )* otherlv_4= '}' )
            // InternalSpringGen.g:3159:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleAngularServiceMethod ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAngularServiceAccess().getServiceKeyword_0());
            		
            // InternalSpringGen.g:3163:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpringGen.g:3164:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpringGen.g:3164:4: (lv_name_1_0= RULE_ID )
            // InternalSpringGen.g:3165:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAngularServiceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAngularServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getAngularServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSpringGen.g:3185:3: ( (lv_methods_3_0= ruleAngularServiceMethod ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==87) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalSpringGen.g:3186:4: (lv_methods_3_0= ruleAngularServiceMethod )
            	    {
            	    // InternalSpringGen.g:3186:4: (lv_methods_3_0= ruleAngularServiceMethod )
            	    // InternalSpringGen.g:3187:5: lv_methods_3_0= ruleAngularServiceMethod
            	    {

            	    					newCompositeNode(grammarAccess.getAngularServiceAccess().getMethodsAngularServiceMethodParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_58);
            	    lv_methods_3_0=ruleAngularServiceMethod();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAngularServiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"methods",
            	    						lv_methods_3_0,
            	    						"org.xtext.example.springgen.SpringGen.AngularServiceMethod");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAngularServiceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAngularService"


    // $ANTLR start "entryRuleAngularServiceMethod"
    // InternalSpringGen.g:3212:1: entryRuleAngularServiceMethod returns [EObject current=null] : iv_ruleAngularServiceMethod= ruleAngularServiceMethod EOF ;
    public final EObject entryRuleAngularServiceMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngularServiceMethod = null;


        try {
            // InternalSpringGen.g:3212:61: (iv_ruleAngularServiceMethod= ruleAngularServiceMethod EOF )
            // InternalSpringGen.g:3213:2: iv_ruleAngularServiceMethod= ruleAngularServiceMethod EOF
            {
             newCompositeNode(grammarAccess.getAngularServiceMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAngularServiceMethod=ruleAngularServiceMethod();

            state._fsp--;

             current =iv_ruleAngularServiceMethod; 
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
    // $ANTLR end "entryRuleAngularServiceMethod"


    // $ANTLR start "ruleAngularServiceMethod"
    // InternalSpringGen.g:3219:1: ruleAngularServiceMethod returns [EObject current=null] : (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleReturnType ) ) ( (lv_parameters_5_0= ruleActionParameter ) )* otherlv_6= '}' ) ;
    public final EObject ruleAngularServiceMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_returnType_4_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:3225:2: ( (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleReturnType ) ) ( (lv_parameters_5_0= ruleActionParameter ) )* otherlv_6= '}' ) )
            // InternalSpringGen.g:3226:2: (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleReturnType ) ) ( (lv_parameters_5_0= ruleActionParameter ) )* otherlv_6= '}' )
            {
            // InternalSpringGen.g:3226:2: (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleReturnType ) ) ( (lv_parameters_5_0= ruleActionParameter ) )* otherlv_6= '}' )
            // InternalSpringGen.g:3227:3: otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'returns' ( (lv_returnType_4_0= ruleReturnType ) ) ( (lv_parameters_5_0= ruleActionParameter ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,87,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAngularServiceMethodAccess().getMethodKeyword_0());
            		
            // InternalSpringGen.g:3231:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpringGen.g:3232:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpringGen.g:3232:4: (lv_name_1_0= RULE_ID )
            // InternalSpringGen.g:3233:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAngularServiceMethodAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAngularServiceMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getAngularServiceMethodAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getAngularServiceMethodAccess().getReturnsKeyword_3());
            		
            // InternalSpringGen.g:3257:3: ( (lv_returnType_4_0= ruleReturnType ) )
            // InternalSpringGen.g:3258:4: (lv_returnType_4_0= ruleReturnType )
            {
            // InternalSpringGen.g:3258:4: (lv_returnType_4_0= ruleReturnType )
            // InternalSpringGen.g:3259:5: lv_returnType_4_0= ruleReturnType
            {

            					newCompositeNode(grammarAccess.getAngularServiceMethodAccess().getReturnTypeReturnTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
            lv_returnType_4_0=ruleReturnType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAngularServiceMethodRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_4_0,
            						"org.xtext.example.springgen.SpringGen.ReturnType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpringGen.g:3276:3: ( (lv_parameters_5_0= ruleActionParameter ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalSpringGen.g:3277:4: (lv_parameters_5_0= ruleActionParameter )
            	    {
            	    // InternalSpringGen.g:3277:4: (lv_parameters_5_0= ruleActionParameter )
            	    // InternalSpringGen.g:3278:5: lv_parameters_5_0= ruleActionParameter
            	    {

            	    					newCompositeNode(grammarAccess.getAngularServiceMethodAccess().getParametersActionParameterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_parameters_5_0=ruleActionParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAngularServiceMethodRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_5_0,
            	    						"org.xtext.example.springgen.SpringGen.ActionParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAngularServiceMethodAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAngularServiceMethod"


    // $ANTLR start "entryRuleAngularModule"
    // InternalSpringGen.g:3303:1: entryRuleAngularModule returns [EObject current=null] : iv_ruleAngularModule= ruleAngularModule EOF ;
    public final EObject entryRuleAngularModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngularModule = null;


        try {
            // InternalSpringGen.g:3303:54: (iv_ruleAngularModule= ruleAngularModule EOF )
            // InternalSpringGen.g:3304:2: iv_ruleAngularModule= ruleAngularModule EOF
            {
             newCompositeNode(grammarAccess.getAngularModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAngularModule=ruleAngularModule();

            state._fsp--;

             current =iv_ruleAngularModule; 
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
    // $ANTLR end "entryRuleAngularModule"


    // $ANTLR start "ruleAngularModule"
    // InternalSpringGen.g:3310:1: ruleAngularModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleAngularComponent ) )* ( (lv_imports_4_0= ruleAngularModuleImport ) )* ( (lv_providers_5_0= ruleAngularService ) )* otherlv_6= '}' ) ;
    public final EObject ruleAngularModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_declarations_3_0 = null;

        EObject lv_imports_4_0 = null;

        EObject lv_providers_5_0 = null;



        	enterRule();

        try {
            // InternalSpringGen.g:3316:2: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleAngularComponent ) )* ( (lv_imports_4_0= ruleAngularModuleImport ) )* ( (lv_providers_5_0= ruleAngularService ) )* otherlv_6= '}' ) )
            // InternalSpringGen.g:3317:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleAngularComponent ) )* ( (lv_imports_4_0= ruleAngularModuleImport ) )* ( (lv_providers_5_0= ruleAngularService ) )* otherlv_6= '}' )
            {
            // InternalSpringGen.g:3317:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleAngularComponent ) )* ( (lv_imports_4_0= ruleAngularModuleImport ) )* ( (lv_providers_5_0= ruleAngularService ) )* otherlv_6= '}' )
            // InternalSpringGen.g:3318:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleAngularComponent ) )* ( (lv_imports_4_0= ruleAngularModuleImport ) )* ( (lv_providers_5_0= ruleAngularService ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAngularModuleAccess().getModuleKeyword_0());
            		
            // InternalSpringGen.g:3322:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSpringGen.g:3323:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSpringGen.g:3323:4: (lv_name_1_0= RULE_ID )
            // InternalSpringGen.g:3324:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAngularModuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAngularModuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getAngularModuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSpringGen.g:3344:3: ( (lv_declarations_3_0= ruleAngularComponent ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==86) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalSpringGen.g:3345:4: (lv_declarations_3_0= ruleAngularComponent )
            	    {
            	    // InternalSpringGen.g:3345:4: (lv_declarations_3_0= ruleAngularComponent )
            	    // InternalSpringGen.g:3346:5: lv_declarations_3_0= ruleAngularComponent
            	    {

            	    					newCompositeNode(grammarAccess.getAngularModuleAccess().getDeclarationsAngularComponentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_59);
            	    lv_declarations_3_0=ruleAngularComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAngularModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_3_0,
            	    						"org.xtext.example.springgen.SpringGen.AngularComponent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // InternalSpringGen.g:3363:3: ( (lv_imports_4_0= ruleAngularModuleImport ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==89) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalSpringGen.g:3364:4: (lv_imports_4_0= ruleAngularModuleImport )
            	    {
            	    // InternalSpringGen.g:3364:4: (lv_imports_4_0= ruleAngularModuleImport )
            	    // InternalSpringGen.g:3365:5: lv_imports_4_0= ruleAngularModuleImport
            	    {

            	    					newCompositeNode(grammarAccess.getAngularModuleAccess().getImportsAngularModuleImportParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_60);
            	    lv_imports_4_0=ruleAngularModuleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAngularModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_4_0,
            	    						"org.xtext.example.springgen.SpringGen.AngularModuleImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // InternalSpringGen.g:3382:3: ( (lv_providers_5_0= ruleAngularService ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==30) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSpringGen.g:3383:4: (lv_providers_5_0= ruleAngularService )
            	    {
            	    // InternalSpringGen.g:3383:4: (lv_providers_5_0= ruleAngularService )
            	    // InternalSpringGen.g:3384:5: lv_providers_5_0= ruleAngularService
            	    {

            	    					newCompositeNode(grammarAccess.getAngularModuleAccess().getProvidersAngularServiceParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_61);
            	    lv_providers_5_0=ruleAngularService();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAngularModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"providers",
            	    						lv_providers_5_0,
            	    						"org.xtext.example.springgen.SpringGen.AngularService");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAngularModuleAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAngularModule"


    // $ANTLR start "entryRuleAngularModuleImport"
    // InternalSpringGen.g:3409:1: entryRuleAngularModuleImport returns [EObject current=null] : iv_ruleAngularModuleImport= ruleAngularModuleImport EOF ;
    public final EObject entryRuleAngularModuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngularModuleImport = null;


        try {
            // InternalSpringGen.g:3409:60: (iv_ruleAngularModuleImport= ruleAngularModuleImport EOF )
            // InternalSpringGen.g:3410:2: iv_ruleAngularModuleImport= ruleAngularModuleImport EOF
            {
             newCompositeNode(grammarAccess.getAngularModuleImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAngularModuleImport=ruleAngularModuleImport();

            state._fsp--;

             current =iv_ruleAngularModuleImport; 
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
    // $ANTLR end "entryRuleAngularModuleImport"


    // $ANTLR start "ruleAngularModuleImport"
    // InternalSpringGen.g:3416:1: ruleAngularModuleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_module_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAngularModuleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_module_1_0=null;


        	enterRule();

        try {
            // InternalSpringGen.g:3422:2: ( (otherlv_0= 'import' ( (lv_module_1_0= RULE_ID ) ) ) )
            // InternalSpringGen.g:3423:2: (otherlv_0= 'import' ( (lv_module_1_0= RULE_ID ) ) )
            {
            // InternalSpringGen.g:3423:2: (otherlv_0= 'import' ( (lv_module_1_0= RULE_ID ) ) )
            // InternalSpringGen.g:3424:3: otherlv_0= 'import' ( (lv_module_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,89,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAngularModuleImportAccess().getImportKeyword_0());
            		
            // InternalSpringGen.g:3428:3: ( (lv_module_1_0= RULE_ID ) )
            // InternalSpringGen.g:3429:4: (lv_module_1_0= RULE_ID )
            {
            // InternalSpringGen.g:3429:4: (lv_module_1_0= RULE_ID )
            // InternalSpringGen.g:3430:5: lv_module_1_0= RULE_ID
            {
            lv_module_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_module_1_0, grammarAccess.getAngularModuleImportAccess().getModuleIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAngularModuleImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"module",
            						lv_module_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleAngularModuleImport"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0001000164009002L,0x0000000000202000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001000164001002L,0x0000000000202000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007CL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001000164021010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000164021000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x1FC0000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xE000001A00020040L,0x0000000000000003L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xE000001A00020000L,0x0000000000000003L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001800020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1FC8000000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1FE8000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000020010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004001800020000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004001000020000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000020000L,0x00000000001F8000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000040020000L,0x0000000001400000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000040020000L,0x0000000001000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000020000L,0x0000000001000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000020000L,0x0000000000800000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000040020000L,0x0000000002400000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000040020000L,0x0000000002000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000040020000L});

}