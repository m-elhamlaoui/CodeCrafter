/**
 */
package dockermetamodel.provider;

import dockermetamodel.util.DockerfileGeneratorAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerfileGeneratorItemProviderAdapterFactory extends DockerfileGeneratorAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerfileGeneratorItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockermetamodel.Argument} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentItemProvider argumentItemProvider;

	/**
	 * This creates an adapter for a {@link dockermetamodel.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArgumentAdapter() {
		if (argumentItemProvider == null) {
			argumentItemProvider = new ArgumentItemProvider(this);
		}

		return argumentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockermetamodel.Option} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionItemProvider optionItemProvider;

	/**
	 * This creates an adapter for a {@link dockermetamodel.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOptionAdapter() {
		if (optionItemProvider == null) {
			optionItemProvider = new OptionItemProvider(this);
		}

		return optionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockermetamodel.Instruction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionItemProvider instructionItemProvider;

	/**
	 * This creates an adapter for a {@link dockermetamodel.Instruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInstructionAdapter() {
		if (instructionItemProvider == null) {
			instructionItemProvider = new InstructionItemProvider(this);
		}

		return instructionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockermetamodel.From} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FromItemProvider fromItemProvider;

	/**
	 * This creates an adapter for a {@link dockermetamodel.From}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFromAdapter() {
		if (fromItemProvider == null) {
			fromItemProvider = new FromItemProvider(this);
		}

		return fromItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockermetamodel.Dockerfile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerfileItemProvider dockerfileItemProvider;

	/**
	 * This creates an adapter for a {@link dockermetamodel.Dockerfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDockerfileAdapter() {
		if (dockerfileItemProvider == null) {
			dockerfileItemProvider = new DockerfileItemProvider(this);
		}

		return dockerfileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockermetamodel.Comment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentItemProvider commentItemProvider;

	/**
	 * This creates an adapter for a {@link dockermetamodel.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommentAdapter() {
		if (commentItemProvider == null) {
			commentItemProvider = new CommentItemProvider(this);
		}

		return commentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockermetamodel.Copy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CopyItemProvider copyItemProvider;

	/**
	 * This creates an adapter for a {@link dockermetamodel.Copy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCopyAdapter() {
		if (copyItemProvider == null) {
			copyItemProvider = new CopyItemProvider(this);
		}

		return copyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockermetamodel.Run} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunItemProvider runItemProvider;

	/**
	 * This creates an adapter for a {@link dockermetamodel.Run}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRunAdapter() {
		if (runItemProvider == null) {
			runItemProvider = new RunItemProvider(this);
		}

		return runItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockermetamodel.Workdir} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkdirItemProvider workdirItemProvider;

	/**
	 * This creates an adapter for a {@link dockermetamodel.Workdir}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkdirAdapter() {
		if (workdirItemProvider == null) {
			workdirItemProvider = new WorkdirItemProvider(this);
		}

		return workdirItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockermetamodel.Cmd} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmdItemProvider cmdItemProvider;

	/**
	 * This creates an adapter for a {@link dockermetamodel.Cmd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCmdAdapter() {
		if (cmdItemProvider == null) {
			cmdItemProvider = new CmdItemProvider(this);
		}

		return cmdItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link dockermetamodel.Expose} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExposeItemProvider exposeItemProvider;

	/**
	 * This creates an adapter for a {@link dockermetamodel.Expose}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExposeAdapter() {
		if (exposeItemProvider == null) {
			exposeItemProvider = new ExposeItemProvider(this);
		}

		return exposeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (argumentItemProvider != null)
			argumentItemProvider.dispose();
		if (optionItemProvider != null)
			optionItemProvider.dispose();
		if (instructionItemProvider != null)
			instructionItemProvider.dispose();
		if (fromItemProvider != null)
			fromItemProvider.dispose();
		if (dockerfileItemProvider != null)
			dockerfileItemProvider.dispose();
		if (commentItemProvider != null)
			commentItemProvider.dispose();
		if (copyItemProvider != null)
			copyItemProvider.dispose();
		if (runItemProvider != null)
			runItemProvider.dispose();
		if (workdirItemProvider != null)
			workdirItemProvider.dispose();
		if (cmdItemProvider != null)
			cmdItemProvider.dispose();
		if (exposeItemProvider != null)
			exposeItemProvider.dispose();
	}

}
