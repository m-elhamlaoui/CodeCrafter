/*
 * generated by Xtext 2.37.0
 */
package org.xtext.example.springgen.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.springgen.services.SpringGenGrammarAccess;
import org.xtext.example.springgen.springgen.ActionParameter;
import org.xtext.example.springgen.springgen.Controller;
import org.xtext.example.springgen.springgen.CustomAction;
import org.xtext.example.springgen.springgen.CustomQueryMethod;
import org.xtext.example.springgen.springgen.DTO;
import org.xtext.example.springgen.springgen.DatabaseConfiguration;
import org.xtext.example.springgen.springgen.DatabaseRelations;
import org.xtext.example.springgen.springgen.DeleteByMethod;
import org.xtext.example.springgen.springgen.Entity;
import org.xtext.example.springgen.springgen.EntityRelationship;
import org.xtext.example.springgen.springgen.FindByMethod;
import org.xtext.example.springgen.springgen.HttpMethods;
import org.xtext.example.springgen.springgen.Identifier;
import org.xtext.example.springgen.springgen.ListType;
import org.xtext.example.springgen.springgen.ParamTransfer;
import org.xtext.example.springgen.springgen.ProjectConfiguration;
import org.xtext.example.springgen.springgen.Property;
import org.xtext.example.springgen.springgen.RDBMS;
import org.xtext.example.springgen.springgen.Repository;
import org.xtext.example.springgen.springgen.ServerConfiguration;
import org.xtext.example.springgen.springgen.Service;
import org.xtext.example.springgen.springgen.ServiceAction;
import org.xtext.example.springgen.springgen.SetType;
import org.xtext.example.springgen.springgen.SpringBootProject;
import org.xtext.example.springgen.springgen.SpringgenPackage;
import org.xtext.example.springgen.springgen.ValueTypes;

@SuppressWarnings("all")
public class SpringGenSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SpringGenGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SpringgenPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SpringgenPackage.ACTION_PARAMETER:
				sequence_ActionParameter(context, (ActionParameter) semanticObject); 
				return; 
			case SpringgenPackage.CONTROLLER:
				sequence_Controller(context, (Controller) semanticObject); 
				return; 
			case SpringgenPackage.CUSTOM_ACTION:
				sequence_CustomAction(context, (CustomAction) semanticObject); 
				return; 
			case SpringgenPackage.CUSTOM_QUERY_METHOD:
				sequence_CustomQueryMethod(context, (CustomQueryMethod) semanticObject); 
				return; 
			case SpringgenPackage.DTO:
				sequence_DTO(context, (DTO) semanticObject); 
				return; 
			case SpringgenPackage.DATABASE_CONFIGURATION:
				sequence_DatabaseConfiguration(context, (DatabaseConfiguration) semanticObject); 
				return; 
			case SpringgenPackage.DATABASE_RELATIONS:
				sequence_DatabaseRelations(context, (DatabaseRelations) semanticObject); 
				return; 
			case SpringgenPackage.DELETE_BY_METHOD:
				sequence_DeleteByMethod(context, (DeleteByMethod) semanticObject); 
				return; 
			case SpringgenPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case SpringgenPackage.ENTITY_RELATIONSHIP:
				sequence_EntityRelationship(context, (EntityRelationship) semanticObject); 
				return; 
			case SpringgenPackage.FIND_BY_METHOD:
				sequence_FindByMethod(context, (FindByMethod) semanticObject); 
				return; 
			case SpringgenPackage.HTTP_METHODS:
				sequence_HttpMethods(context, (HttpMethods) semanticObject); 
				return; 
			case SpringgenPackage.IDENTIFIER:
				sequence_Identifier(context, (Identifier) semanticObject); 
				return; 
			case SpringgenPackage.LIST_TYPE:
				sequence_ListType(context, (ListType) semanticObject); 
				return; 
			case SpringgenPackage.PARAM_TRANSFER:
				sequence_ParamTransfer(context, (ParamTransfer) semanticObject); 
				return; 
			case SpringgenPackage.PROJECT_CONFIGURATION:
				sequence_ProjectConfiguration(context, (ProjectConfiguration) semanticObject); 
				return; 
			case SpringgenPackage.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case SpringgenPackage.RDBMS:
				sequence_RDBMS(context, (RDBMS) semanticObject); 
				return; 
			case SpringgenPackage.REPOSITORY:
				sequence_Repository(context, (Repository) semanticObject); 
				return; 
			case SpringgenPackage.SERVER_CONFIGURATION:
				sequence_ServerConfiguration(context, (ServerConfiguration) semanticObject); 
				return; 
			case SpringgenPackage.SERVICE:
				sequence_Service(context, (Service) semanticObject); 
				return; 
			case SpringgenPackage.SERVICE_ACTION:
				sequence_ServiceAction(context, (ServiceAction) semanticObject); 
				return; 
			case SpringgenPackage.SET_TYPE:
				sequence_SetType(context, (SetType) semanticObject); 
				return; 
			case SpringgenPackage.SPRING_BOOT_PROJECT:
				sequence_SpringBootProject(context, (SpringBootProject) semanticObject); 
				return; 
			case SpringgenPackage.VALUE_TYPES:
				sequence_ValueTypes(context, (ValueTypes) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     ActionParameter returns ActionParameter
	 *
	 * Constraint:
	 *     (name=ID type=Type defaultValue=STRING?)
	 * </pre>
	 */
	protected void sequence_ActionParameter(ISerializationContext context, ActionParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProjectElement returns Controller
	 *     Controller returns Controller
	 *
	 * Constraint:
	 *     (
	 *         (baseUrl=STRING ((createParam=ParamTransfer deleteParam=ParamTransfer) | deleteParam=ParamTransfer)) | 
	 *         (
	 *             ((baseUrl=STRING customActions+=CustomAction+) | customActions+=CustomAction+) 
	 *             ((createParam=ParamTransfer deleteParam=ParamTransfer) | deleteParam=ParamTransfer)
	 *         ) | 
	 *         (
	 *             (
	 *                 (baseUrl=STRING ((customActions+=CustomAction+ createParam=ParamTransfer) | createParam=ParamTransfer)) | 
	 *                 (customActions+=CustomAction+ createParam=ParamTransfer) | 
	 *                 createParam=ParamTransfer
	 *             )? 
	 *             findParam=ParamTransfer 
	 *             deleteParam=ParamTransfer
	 *         ) | 
	 *         (createParam=ParamTransfer deleteParam=ParamTransfer) | 
	 *         deleteParam=ParamTransfer
	 *     )?
	 * </pre>
	 */
	protected void sequence_Controller(ISerializationContext context, Controller semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CustomAction returns CustomAction
	 *
	 * Constraint:
	 *     (method=HttpMethods name=ID url=STRING? parameters+=ActionParameter*)
	 * </pre>
	 */
	protected void sequence_CustomAction(ISerializationContext context, CustomAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     CustomQueryMethod returns CustomQueryMethod
	 *
	 * Constraint:
	 *     query=STRING
	 * </pre>
	 */
	protected void sequence_CustomQueryMethod(ISerializationContext context, CustomQueryMethod semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpringgenPackage.Literals.CUSTOM_QUERY_METHOD__QUERY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringgenPackage.Literals.CUSTOM_QUERY_METHOD__QUERY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCustomQueryMethodAccess().getQuerySTRINGTerminalRuleCall_2_0(), semanticObject.getQuery());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProjectElement returns DTO
	 *     DTO returns DTO
	 *
	 * Constraint:
	 *     (name=ID properties+=Property*)
	 * </pre>
	 */
	protected void sequence_DTO(ISerializationContext context, DTO semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DatabaseConfiguration returns DatabaseConfiguration
	 *
	 * Constraint:
	 *     (type=RDBMS name=ID port=INT username=ID password=ID)
	 * </pre>
	 */
	protected void sequence_DatabaseConfiguration(ISerializationContext context, DatabaseConfiguration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpringgenPackage.Literals.DATABASE_CONFIGURATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringgenPackage.Literals.DATABASE_CONFIGURATION__TYPE));
			if (transientValues.isValueTransient(semanticObject, SpringgenPackage.Literals.DATABASE_CONFIGURATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringgenPackage.Literals.DATABASE_CONFIGURATION__NAME));
			if (transientValues.isValueTransient(semanticObject, SpringgenPackage.Literals.DATABASE_CONFIGURATION__PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringgenPackage.Literals.DATABASE_CONFIGURATION__PORT));
			if (transientValues.isValueTransient(semanticObject, SpringgenPackage.Literals.DATABASE_CONFIGURATION__USERNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringgenPackage.Literals.DATABASE_CONFIGURATION__USERNAME));
			if (transientValues.isValueTransient(semanticObject, SpringgenPackage.Literals.DATABASE_CONFIGURATION__PASSWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringgenPackage.Literals.DATABASE_CONFIGURATION__PASSWORD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDatabaseConfigurationAccess().getTypeRDBMSParserRuleCall_3_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getDatabaseConfigurationAccess().getNameIDTerminalRuleCall_5_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDatabaseConfigurationAccess().getPortINTTerminalRuleCall_7_0(), semanticObject.getPort());
		feeder.accept(grammarAccess.getDatabaseConfigurationAccess().getUsernameIDTerminalRuleCall_9_0(), semanticObject.getUsername());
		feeder.accept(grammarAccess.getDatabaseConfigurationAccess().getPasswordIDTerminalRuleCall_11_0(), semanticObject.getPassword());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DatabaseRelations returns DatabaseRelations
	 *
	 * Constraint:
	 *     (MANY_TO_MANY='ManyToMany' | MANY_TO_ONE='ManyToOne' | ONE_TO_MANY='OneToMany')
	 * </pre>
	 */
	protected void sequence_DatabaseRelations(ISerializationContext context, DatabaseRelations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DeleteByMethod returns DeleteByMethod
	 *
	 * Constraint:
	 *     (property=ID propertyType=ValueTypes)
	 * </pre>
	 */
	protected void sequence_DeleteByMethod(ISerializationContext context, DeleteByMethod semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpringgenPackage.Literals.DELETE_BY_METHOD__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringgenPackage.Literals.DELETE_BY_METHOD__PROPERTY));
			if (transientValues.isValueTransient(semanticObject, SpringgenPackage.Literals.DELETE_BY_METHOD__PROPERTY_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringgenPackage.Literals.DELETE_BY_METHOD__PROPERTY_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeleteByMethodAccess().getPropertyIDTerminalRuleCall_2_0(), semanticObject.getProperty());
		feeder.accept(grammarAccess.getDeleteByMethodAccess().getPropertyTypeValueTypesParserRuleCall_4_0(), semanticObject.getPropertyType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProjectElement returns EntityRelationship
	 *     EntityRelationship returns EntityRelationship
	 *
	 * Constraint:
	 *     (type=DatabaseRelations source=[Entity|ID] target=[Entity|ID])
	 * </pre>
	 */
	protected void sequence_EntityRelationship(ISerializationContext context, EntityRelationship semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpringgenPackage.Literals.ENTITY_RELATIONSHIP__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringgenPackage.Literals.ENTITY_RELATIONSHIP__TYPE));
			if (transientValues.isValueTransient(semanticObject, SpringgenPackage.Literals.ENTITY_RELATIONSHIP__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringgenPackage.Literals.ENTITY_RELATIONSHIP__SOURCE));
			if (transientValues.isValueTransient(semanticObject, SpringgenPackage.Literals.ENTITY_RELATIONSHIP__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringgenPackage.Literals.ENTITY_RELATIONSHIP__TARGET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntityRelationshipAccess().getTypeDatabaseRelationsParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getEntityRelationshipAccess().getSourceEntityIDTerminalRuleCall_3_0_1(), semanticObject.eGet(SpringgenPackage.Literals.ENTITY_RELATIONSHIP__SOURCE, false));
		feeder.accept(grammarAccess.getEntityRelationshipAccess().getTargetEntityIDTerminalRuleCall_5_0_1(), semanticObject.eGet(SpringgenPackage.Literals.ENTITY_RELATIONSHIP__TARGET, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProjectElement returns Entity
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         extends=[Entity|ID]? 
	 *         identifier=Identifier 
	 *         properties+=Property* 
	 *         repository=Repository? 
	 *         services+=Service* 
	 *         controller=Controller?
	 *     )
	 * </pre>
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FindByMethod returns FindByMethod
	 *
	 * Constraint:
	 *     (property=ID propertyType=ValueTypes)
	 * </pre>
	 */
	protected void sequence_FindByMethod(ISerializationContext context, FindByMethod semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpringgenPackage.Literals.FIND_BY_METHOD__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringgenPackage.Literals.FIND_BY_METHOD__PROPERTY));
			if (transientValues.isValueTransient(semanticObject, SpringgenPackage.Literals.FIND_BY_METHOD__PROPERTY_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringgenPackage.Literals.FIND_BY_METHOD__PROPERTY_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFindByMethodAccess().getPropertyIDTerminalRuleCall_2_0(), semanticObject.getProperty());
		feeder.accept(grammarAccess.getFindByMethodAccess().getPropertyTypeValueTypesParserRuleCall_4_0(), semanticObject.getPropertyType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     HttpMethods returns HttpMethods
	 *
	 * Constraint:
	 *     (GET='GET' | DELETE='DELETE' | POST='POST' | PUT='PUT' | PATCH='PATCH')
	 * </pre>
	 */
	protected void sequence_HttpMethods(ISerializationContext context, HttpMethods semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Identifier returns Identifier
	 *
	 * Constraint:
	 *     (name=ID type=ValueTypes)
	 * </pre>
	 */
	protected void sequence_Identifier(ISerializationContext context, Identifier semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpringgenPackage.Literals.IDENTIFIER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringgenPackage.Literals.IDENTIFIER__NAME));
			if (transientValues.isValueTransient(semanticObject, SpringgenPackage.Literals.IDENTIFIER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringgenPackage.Literals.IDENTIFIER__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIdentifierAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getIdentifierAccess().getTypeValueTypesParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Type returns ListType
	 *     ReturnType returns ListType
	 *     ListType returns ListType
	 *
	 * Constraint:
	 *     type=Type
	 * </pre>
	 */
	protected void sequence_ListType(ISerializationContext context, ListType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpringgenPackage.Literals.LIST_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringgenPackage.Literals.LIST_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getListTypeAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ParamTransfer returns ParamTransfer
	 *
	 * Constraint:
	 *     (REQUEST_BODY='RequestBody' | REQUEST_PARAM='RequestParam' | PATH_VARIABLE='PathVariable')
	 * </pre>
	 */
	protected void sequence_ParamTransfer(ISerializationContext context, ParamTransfer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProjectConfiguration returns ProjectConfiguration
	 *
	 * Constraint:
	 *     (server=ServerConfiguration? database=DatabaseConfiguration)
	 * </pre>
	 */
	protected void sequence_ProjectConfiguration(ISerializationContext context, ProjectConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Property returns Property
	 *
	 * Constraint:
	 *     (name=ID type=Type defaultValue=STRING?)
	 * </pre>
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RDBMS returns RDBMS
	 *
	 * Constraint:
	 *     (MYSQL='MySQL' | POSTGRES='Postgres' | MARIADB='MariaDB' | H2='H2' | ORACLE='Oracle')
	 * </pre>
	 */
	protected void sequence_RDBMS(ISerializationContext context, RDBMS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProjectElement returns Repository
	 *     Repository returns Repository
	 *
	 * Constraint:
	 *     (
	 *         (findBy+=FindByMethod* deleteBy+=DeleteByMethod+ customQueryMethod+=CustomQueryMethod+) | 
	 *         (findBy+=FindByMethod* customQueryMethod+=CustomQueryMethod+) | 
	 *         customQueryMethod+=CustomQueryMethod+
	 *     )?
	 * </pre>
	 */
	protected void sequence_Repository(ISerializationContext context, Repository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ServerConfiguration returns ServerConfiguration
	 *
	 * Constraint:
	 *     (port=INT contextPath=STRING?)
	 * </pre>
	 */
	protected void sequence_ServerConfiguration(ISerializationContext context, ServerConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ServiceAction returns ServiceAction
	 *
	 * Constraint:
	 *     (name=ID returnType=ReturnType exceptionType=Type? implementation=STRING? parameters+=ActionParameter*)
	 * </pre>
	 */
	protected void sequence_ServiceAction(ISerializationContext context, ServiceAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProjectElement returns Service
	 *     Service returns Service
	 *
	 * Constraint:
	 *     (name=ID entity=[Entity|ID]? actions+=ServiceAction*)
	 * </pre>
	 */
	protected void sequence_Service(ISerializationContext context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Type returns SetType
	 *     SetType returns SetType
	 *
	 * Constraint:
	 *     type=Type
	 * </pre>
	 */
	protected void sequence_SetType(ISerializationContext context, SetType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpringgenPackage.Literals.SET_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpringgenPackage.Literals.SET_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSetTypeAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SpringBootProject returns SpringBootProject
	 *
	 * Constraint:
	 *     (name=ID configuration=ProjectConfiguration? elements+=ProjectElement*)
	 * </pre>
	 */
	protected void sequence_SpringBootProject(ISerializationContext context, SpringBootProject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Type returns ValueTypes
	 *     ReturnType returns ValueTypes
	 *     ValueTypes returns ValueTypes
	 *
	 * Constraint:
	 *     (
	 *         FLOAT='float' | 
	 *         LONG='long' | 
	 *         INTEGER='int' | 
	 *         CHAR='char' | 
	 *         BOOLEAN='boolean' | 
	 *         BYTE='byte' | 
	 *         STRING='String'
	 *     )
	 * </pre>
	 */
	protected void sequence_ValueTypes(ISerializationContext context, ValueTypes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
