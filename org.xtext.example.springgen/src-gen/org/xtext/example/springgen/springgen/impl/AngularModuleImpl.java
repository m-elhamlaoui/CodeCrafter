/**
 * generated by Xtext 2.37.0
 */
package org.xtext.example.springgen.springgen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.springgen.springgen.AngularComponent;
import org.xtext.example.springgen.springgen.AngularModule;
import org.xtext.example.springgen.springgen.AngularModuleImport;
import org.xtext.example.springgen.springgen.AngularService;
import org.xtext.example.springgen.springgen.SpringgenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angular Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.AngularModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.AngularModuleImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.AngularModuleImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.AngularModuleImpl#getProviders <em>Providers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngularModuleImpl extends MinimalEObjectImpl.Container implements AngularModule
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected EList<AngularComponent> declarations;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<AngularModuleImport> imports;

  /**
   * The cached value of the '{@link #getProviders() <em>Providers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProviders()
   * @generated
   * @ordered
   */
  protected EList<AngularService> providers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AngularModuleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SpringgenPackage.Literals.ANGULAR_MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringgenPackage.ANGULAR_MODULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AngularComponent> getDeclarations()
  {
    if (declarations == null)
    {
      declarations = new EObjectContainmentEList<AngularComponent>(AngularComponent.class, this, SpringgenPackage.ANGULAR_MODULE__DECLARATIONS);
    }
    return declarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AngularModuleImport> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<AngularModuleImport>(AngularModuleImport.class, this, SpringgenPackage.ANGULAR_MODULE__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AngularService> getProviders()
  {
    if (providers == null)
    {
      providers = new EObjectContainmentEList<AngularService>(AngularService.class, this, SpringgenPackage.ANGULAR_MODULE__PROVIDERS);
    }
    return providers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SpringgenPackage.ANGULAR_MODULE__DECLARATIONS:
        return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
      case SpringgenPackage.ANGULAR_MODULE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case SpringgenPackage.ANGULAR_MODULE__PROVIDERS:
        return ((InternalEList<?>)getProviders()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SpringgenPackage.ANGULAR_MODULE__NAME:
        return getName();
      case SpringgenPackage.ANGULAR_MODULE__DECLARATIONS:
        return getDeclarations();
      case SpringgenPackage.ANGULAR_MODULE__IMPORTS:
        return getImports();
      case SpringgenPackage.ANGULAR_MODULE__PROVIDERS:
        return getProviders();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpringgenPackage.ANGULAR_MODULE__NAME:
        setName((String)newValue);
        return;
      case SpringgenPackage.ANGULAR_MODULE__DECLARATIONS:
        getDeclarations().clear();
        getDeclarations().addAll((Collection<? extends AngularComponent>)newValue);
        return;
      case SpringgenPackage.ANGULAR_MODULE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends AngularModuleImport>)newValue);
        return;
      case SpringgenPackage.ANGULAR_MODULE__PROVIDERS:
        getProviders().clear();
        getProviders().addAll((Collection<? extends AngularService>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SpringgenPackage.ANGULAR_MODULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SpringgenPackage.ANGULAR_MODULE__DECLARATIONS:
        getDeclarations().clear();
        return;
      case SpringgenPackage.ANGULAR_MODULE__IMPORTS:
        getImports().clear();
        return;
      case SpringgenPackage.ANGULAR_MODULE__PROVIDERS:
        getProviders().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SpringgenPackage.ANGULAR_MODULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SpringgenPackage.ANGULAR_MODULE__DECLARATIONS:
        return declarations != null && !declarations.isEmpty();
      case SpringgenPackage.ANGULAR_MODULE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case SpringgenPackage.ANGULAR_MODULE__PROVIDERS:
        return providers != null && !providers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AngularModuleImpl
