/**
 */
package dockermetamodel.impl;

import dockermetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerfileGeneratorFactoryImpl extends EFactoryImpl implements DockerfileGeneratorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DockerfileGeneratorFactory init() {
		try {
			DockerfileGeneratorFactory theDockerfileGeneratorFactory = (DockerfileGeneratorFactory) EPackage.Registry.INSTANCE
					.getEFactory(DockerfileGeneratorPackage.eNS_URI);
			if (theDockerfileGeneratorFactory != null) {
				return theDockerfileGeneratorFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DockerfileGeneratorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerfileGeneratorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DockerfileGeneratorPackage.ARGUMENT:
			return createArgument();
		case DockerfileGeneratorPackage.OPTION:
			return createOption();
		case DockerfileGeneratorPackage.INSTRUCTION:
			return createInstruction();
		case DockerfileGeneratorPackage.FROM:
			return createFrom();
		case DockerfileGeneratorPackage.DOCKERFILE:
			return createDockerfile();
		case DockerfileGeneratorPackage.COMMENT:
			return createComment();
		case DockerfileGeneratorPackage.COPY:
			return createCopy();
		case DockerfileGeneratorPackage.RUN:
			return createRun();
		case DockerfileGeneratorPackage.WORKDIR:
			return createWorkdir();
		case DockerfileGeneratorPackage.CMD:
			return createCmd();
		case DockerfileGeneratorPackage.EXPOSE:
			return createExpose();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction createInstruction() {
		InstructionImpl instruction = new InstructionImpl();
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public From createFrom() {
		FromImpl from = new FromImpl();
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dockerfile createDockerfile() {
		DockerfileImpl dockerfile = new DockerfileImpl();
		return dockerfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copy createCopy() {
		CopyImpl copy = new CopyImpl();
		return copy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Run createRun() {
		RunImpl run = new RunImpl();
		return run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workdir createWorkdir() {
		WorkdirImpl workdir = new WorkdirImpl();
		return workdir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cmd createCmd() {
		CmdImpl cmd = new CmdImpl();
		return cmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expose createExpose() {
		ExposeImpl expose = new ExposeImpl();
		return expose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerfileGeneratorPackage getDockerfileGeneratorPackage() {
		return (DockerfileGeneratorPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DockerfileGeneratorPackage getPackage() {
		return DockerfileGeneratorPackage.eINSTANCE;
	}

} //DockerfileGeneratorFactoryImpl
