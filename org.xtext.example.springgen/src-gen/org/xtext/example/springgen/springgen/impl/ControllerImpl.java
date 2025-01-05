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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.springgen.springgen.Controller;
import org.xtext.example.springgen.springgen.CustomAction;
import org.xtext.example.springgen.springgen.ParamTransfer;
import org.xtext.example.springgen.springgen.SpringgenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.ControllerImpl#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.ControllerImpl#getCustomActions <em>Custom Actions</em>}</li>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.ControllerImpl#getCreateParam <em>Create Param</em>}</li>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.ControllerImpl#getFindParam <em>Find Param</em>}</li>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.ControllerImpl#getDeleteParam <em>Delete Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerImpl extends ProjectElementImpl implements Controller
{
  /**
   * The default value of the '{@link #getBaseUrl() <em>Base Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseUrl()
   * @generated
   * @ordered
   */
  protected static final String BASE_URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBaseUrl() <em>Base Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseUrl()
   * @generated
   * @ordered
   */
  protected String baseUrl = BASE_URL_EDEFAULT;

  /**
   * The cached value of the '{@link #getCustomActions() <em>Custom Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomActions()
   * @generated
   * @ordered
   */
  protected EList<CustomAction> customActions;

  /**
   * The cached value of the '{@link #getCreateParam() <em>Create Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreateParam()
   * @generated
   * @ordered
   */
  protected ParamTransfer createParam;

  /**
   * The cached value of the '{@link #getFindParam() <em>Find Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFindParam()
   * @generated
   * @ordered
   */
  protected ParamTransfer findParam;

  /**
   * The cached value of the '{@link #getDeleteParam() <em>Delete Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeleteParam()
   * @generated
   * @ordered
   */
  protected ParamTransfer deleteParam;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControllerImpl()
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
    return SpringgenPackage.Literals.CONTROLLER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBaseUrl()
  {
    return baseUrl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBaseUrl(String newBaseUrl)
  {
    String oldBaseUrl = baseUrl;
    baseUrl = newBaseUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringgenPackage.CONTROLLER__BASE_URL, oldBaseUrl, baseUrl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CustomAction> getCustomActions()
  {
    if (customActions == null)
    {
      customActions = new EObjectContainmentEList<CustomAction>(CustomAction.class, this, SpringgenPackage.CONTROLLER__CUSTOM_ACTIONS);
    }
    return customActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParamTransfer getCreateParam()
  {
    return createParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateParam(ParamTransfer newCreateParam, NotificationChain msgs)
  {
    ParamTransfer oldCreateParam = createParam;
    createParam = newCreateParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringgenPackage.CONTROLLER__CREATE_PARAM, oldCreateParam, newCreateParam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCreateParam(ParamTransfer newCreateParam)
  {
    if (newCreateParam != createParam)
    {
      NotificationChain msgs = null;
      if (createParam != null)
        msgs = ((InternalEObject)createParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringgenPackage.CONTROLLER__CREATE_PARAM, null, msgs);
      if (newCreateParam != null)
        msgs = ((InternalEObject)newCreateParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringgenPackage.CONTROLLER__CREATE_PARAM, null, msgs);
      msgs = basicSetCreateParam(newCreateParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringgenPackage.CONTROLLER__CREATE_PARAM, newCreateParam, newCreateParam));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParamTransfer getFindParam()
  {
    return findParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFindParam(ParamTransfer newFindParam, NotificationChain msgs)
  {
    ParamTransfer oldFindParam = findParam;
    findParam = newFindParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringgenPackage.CONTROLLER__FIND_PARAM, oldFindParam, newFindParam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFindParam(ParamTransfer newFindParam)
  {
    if (newFindParam != findParam)
    {
      NotificationChain msgs = null;
      if (findParam != null)
        msgs = ((InternalEObject)findParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringgenPackage.CONTROLLER__FIND_PARAM, null, msgs);
      if (newFindParam != null)
        msgs = ((InternalEObject)newFindParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringgenPackage.CONTROLLER__FIND_PARAM, null, msgs);
      msgs = basicSetFindParam(newFindParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringgenPackage.CONTROLLER__FIND_PARAM, newFindParam, newFindParam));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParamTransfer getDeleteParam()
  {
    return deleteParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeleteParam(ParamTransfer newDeleteParam, NotificationChain msgs)
  {
    ParamTransfer oldDeleteParam = deleteParam;
    deleteParam = newDeleteParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringgenPackage.CONTROLLER__DELETE_PARAM, oldDeleteParam, newDeleteParam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDeleteParam(ParamTransfer newDeleteParam)
  {
    if (newDeleteParam != deleteParam)
    {
      NotificationChain msgs = null;
      if (deleteParam != null)
        msgs = ((InternalEObject)deleteParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringgenPackage.CONTROLLER__DELETE_PARAM, null, msgs);
      if (newDeleteParam != null)
        msgs = ((InternalEObject)newDeleteParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringgenPackage.CONTROLLER__DELETE_PARAM, null, msgs);
      msgs = basicSetDeleteParam(newDeleteParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringgenPackage.CONTROLLER__DELETE_PARAM, newDeleteParam, newDeleteParam));
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
      case SpringgenPackage.CONTROLLER__CUSTOM_ACTIONS:
        return ((InternalEList<?>)getCustomActions()).basicRemove(otherEnd, msgs);
      case SpringgenPackage.CONTROLLER__CREATE_PARAM:
        return basicSetCreateParam(null, msgs);
      case SpringgenPackage.CONTROLLER__FIND_PARAM:
        return basicSetFindParam(null, msgs);
      case SpringgenPackage.CONTROLLER__DELETE_PARAM:
        return basicSetDeleteParam(null, msgs);
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
      case SpringgenPackage.CONTROLLER__BASE_URL:
        return getBaseUrl();
      case SpringgenPackage.CONTROLLER__CUSTOM_ACTIONS:
        return getCustomActions();
      case SpringgenPackage.CONTROLLER__CREATE_PARAM:
        return getCreateParam();
      case SpringgenPackage.CONTROLLER__FIND_PARAM:
        return getFindParam();
      case SpringgenPackage.CONTROLLER__DELETE_PARAM:
        return getDeleteParam();
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
      case SpringgenPackage.CONTROLLER__BASE_URL:
        setBaseUrl((String)newValue);
        return;
      case SpringgenPackage.CONTROLLER__CUSTOM_ACTIONS:
        getCustomActions().clear();
        getCustomActions().addAll((Collection<? extends CustomAction>)newValue);
        return;
      case SpringgenPackage.CONTROLLER__CREATE_PARAM:
        setCreateParam((ParamTransfer)newValue);
        return;
      case SpringgenPackage.CONTROLLER__FIND_PARAM:
        setFindParam((ParamTransfer)newValue);
        return;
      case SpringgenPackage.CONTROLLER__DELETE_PARAM:
        setDeleteParam((ParamTransfer)newValue);
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
      case SpringgenPackage.CONTROLLER__BASE_URL:
        setBaseUrl(BASE_URL_EDEFAULT);
        return;
      case SpringgenPackage.CONTROLLER__CUSTOM_ACTIONS:
        getCustomActions().clear();
        return;
      case SpringgenPackage.CONTROLLER__CREATE_PARAM:
        setCreateParam((ParamTransfer)null);
        return;
      case SpringgenPackage.CONTROLLER__FIND_PARAM:
        setFindParam((ParamTransfer)null);
        return;
      case SpringgenPackage.CONTROLLER__DELETE_PARAM:
        setDeleteParam((ParamTransfer)null);
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
      case SpringgenPackage.CONTROLLER__BASE_URL:
        return BASE_URL_EDEFAULT == null ? baseUrl != null : !BASE_URL_EDEFAULT.equals(baseUrl);
      case SpringgenPackage.CONTROLLER__CUSTOM_ACTIONS:
        return customActions != null && !customActions.isEmpty();
      case SpringgenPackage.CONTROLLER__CREATE_PARAM:
        return createParam != null;
      case SpringgenPackage.CONTROLLER__FIND_PARAM:
        return findParam != null;
      case SpringgenPackage.CONTROLLER__DELETE_PARAM:
        return deleteParam != null;
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
    result.append(" (baseUrl: ");
    result.append(baseUrl);
    result.append(')');
    return result.toString();
  }

} //ControllerImpl
