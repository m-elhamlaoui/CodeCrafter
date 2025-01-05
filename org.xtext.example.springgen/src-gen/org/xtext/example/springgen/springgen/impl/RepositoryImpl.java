/**
 * generated by Xtext 2.37.0
 */
package org.xtext.example.springgen.springgen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.springgen.springgen.CustomQueryMethod;
import org.xtext.example.springgen.springgen.DeleteByMethod;
import org.xtext.example.springgen.springgen.FindByMethod;
import org.xtext.example.springgen.springgen.Repository;
import org.xtext.example.springgen.springgen.SpringgenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.RepositoryImpl#getFindByMethods <em>Find By Methods</em>}</li>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.RepositoryImpl#getDeleteByMethods <em>Delete By Methods</em>}</li>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.RepositoryImpl#getCustomQueryMethods <em>Custom Query Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends ProjectElementImpl implements Repository
{
  /**
   * The cached value of the '{@link #getFindByMethods() <em>Find By Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFindByMethods()
   * @generated
   * @ordered
   */
  protected EList<FindByMethod> findByMethods;

  /**
   * The cached value of the '{@link #getDeleteByMethods() <em>Delete By Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeleteByMethods()
   * @generated
   * @ordered
   */
  protected EList<DeleteByMethod> deleteByMethods;

  /**
   * The cached value of the '{@link #getCustomQueryMethods() <em>Custom Query Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomQueryMethods()
   * @generated
   * @ordered
   */
  protected EList<CustomQueryMethod> customQueryMethods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepositoryImpl()
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
    return SpringgenPackage.Literals.REPOSITORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FindByMethod> getFindByMethods()
  {
    if (findByMethods == null)
    {
      findByMethods = new EObjectContainmentEList<FindByMethod>(FindByMethod.class, this, SpringgenPackage.REPOSITORY__FIND_BY_METHODS);
    }
    return findByMethods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DeleteByMethod> getDeleteByMethods()
  {
    if (deleteByMethods == null)
    {
      deleteByMethods = new EObjectContainmentEList<DeleteByMethod>(DeleteByMethod.class, this, SpringgenPackage.REPOSITORY__DELETE_BY_METHODS);
    }
    return deleteByMethods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CustomQueryMethod> getCustomQueryMethods()
  {
    if (customQueryMethods == null)
    {
      customQueryMethods = new EObjectContainmentEList<CustomQueryMethod>(CustomQueryMethod.class, this, SpringgenPackage.REPOSITORY__CUSTOM_QUERY_METHODS);
    }
    return customQueryMethods;
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
      case SpringgenPackage.REPOSITORY__FIND_BY_METHODS:
        return ((InternalEList<?>)getFindByMethods()).basicRemove(otherEnd, msgs);
      case SpringgenPackage.REPOSITORY__DELETE_BY_METHODS:
        return ((InternalEList<?>)getDeleteByMethods()).basicRemove(otherEnd, msgs);
      case SpringgenPackage.REPOSITORY__CUSTOM_QUERY_METHODS:
        return ((InternalEList<?>)getCustomQueryMethods()).basicRemove(otherEnd, msgs);
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
      case SpringgenPackage.REPOSITORY__FIND_BY_METHODS:
        return getFindByMethods();
      case SpringgenPackage.REPOSITORY__DELETE_BY_METHODS:
        return getDeleteByMethods();
      case SpringgenPackage.REPOSITORY__CUSTOM_QUERY_METHODS:
        return getCustomQueryMethods();
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
      case SpringgenPackage.REPOSITORY__FIND_BY_METHODS:
        getFindByMethods().clear();
        getFindByMethods().addAll((Collection<? extends FindByMethod>)newValue);
        return;
      case SpringgenPackage.REPOSITORY__DELETE_BY_METHODS:
        getDeleteByMethods().clear();
        getDeleteByMethods().addAll((Collection<? extends DeleteByMethod>)newValue);
        return;
      case SpringgenPackage.REPOSITORY__CUSTOM_QUERY_METHODS:
        getCustomQueryMethods().clear();
        getCustomQueryMethods().addAll((Collection<? extends CustomQueryMethod>)newValue);
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
      case SpringgenPackage.REPOSITORY__FIND_BY_METHODS:
        getFindByMethods().clear();
        return;
      case SpringgenPackage.REPOSITORY__DELETE_BY_METHODS:
        getDeleteByMethods().clear();
        return;
      case SpringgenPackage.REPOSITORY__CUSTOM_QUERY_METHODS:
        getCustomQueryMethods().clear();
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
      case SpringgenPackage.REPOSITORY__FIND_BY_METHODS:
        return findByMethods != null && !findByMethods.isEmpty();
      case SpringgenPackage.REPOSITORY__DELETE_BY_METHODS:
        return deleteByMethods != null && !deleteByMethods.isEmpty();
      case SpringgenPackage.REPOSITORY__CUSTOM_QUERY_METHODS:
        return customQueryMethods != null && !customQueryMethods.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RepositoryImpl
