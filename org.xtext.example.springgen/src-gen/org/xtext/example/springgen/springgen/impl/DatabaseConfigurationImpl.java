/**
 * generated by Xtext 2.37.0
 */
package org.xtext.example.springgen.springgen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.springgen.springgen.DatabaseConfiguration;
import org.xtext.example.springgen.springgen.RDBMS;
import org.xtext.example.springgen.springgen.SpringgenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.DatabaseConfigurationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.DatabaseConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.DatabaseConfigurationImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.DatabaseConfigurationImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.DatabaseConfigurationImpl#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseConfigurationImpl extends MinimalEObjectImpl.Container implements DatabaseConfiguration
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected RDBMS type;

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
   * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected static final int PORT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected int port = PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsername()
   * @generated
   * @ordered
   */
  protected static final String USERNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsername()
   * @generated
   * @ordered
   */
  protected String username = USERNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
  protected static final String PASSWORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
  protected String password = PASSWORD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatabaseConfigurationImpl()
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
    return SpringgenPackage.Literals.DATABASE_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RDBMS getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(RDBMS newType, NotificationChain msgs)
  {
    RDBMS oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringgenPackage.DATABASE_CONFIGURATION__TYPE, oldType, newType);
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
  public void setType(RDBMS newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringgenPackage.DATABASE_CONFIGURATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringgenPackage.DATABASE_CONFIGURATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringgenPackage.DATABASE_CONFIGURATION__TYPE, newType, newType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpringgenPackage.DATABASE_CONFIGURATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPort(int newPort)
  {
    int oldPort = port;
    port = newPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringgenPackage.DATABASE_CONFIGURATION__PORT, oldPort, port));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUsername()
  {
    return username;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUsername(String newUsername)
  {
    String oldUsername = username;
    username = newUsername;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringgenPackage.DATABASE_CONFIGURATION__USERNAME, oldUsername, username));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPassword()
  {
    return password;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPassword(String newPassword)
  {
    String oldPassword = password;
    password = newPassword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringgenPackage.DATABASE_CONFIGURATION__PASSWORD, oldPassword, password));
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
      case SpringgenPackage.DATABASE_CONFIGURATION__TYPE:
        return basicSetType(null, msgs);
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
      case SpringgenPackage.DATABASE_CONFIGURATION__TYPE:
        return getType();
      case SpringgenPackage.DATABASE_CONFIGURATION__NAME:
        return getName();
      case SpringgenPackage.DATABASE_CONFIGURATION__PORT:
        return getPort();
      case SpringgenPackage.DATABASE_CONFIGURATION__USERNAME:
        return getUsername();
      case SpringgenPackage.DATABASE_CONFIGURATION__PASSWORD:
        return getPassword();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpringgenPackage.DATABASE_CONFIGURATION__TYPE:
        setType((RDBMS)newValue);
        return;
      case SpringgenPackage.DATABASE_CONFIGURATION__NAME:
        setName((String)newValue);
        return;
      case SpringgenPackage.DATABASE_CONFIGURATION__PORT:
        setPort((Integer)newValue);
        return;
      case SpringgenPackage.DATABASE_CONFIGURATION__USERNAME:
        setUsername((String)newValue);
        return;
      case SpringgenPackage.DATABASE_CONFIGURATION__PASSWORD:
        setPassword((String)newValue);
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
      case SpringgenPackage.DATABASE_CONFIGURATION__TYPE:
        setType((RDBMS)null);
        return;
      case SpringgenPackage.DATABASE_CONFIGURATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SpringgenPackage.DATABASE_CONFIGURATION__PORT:
        setPort(PORT_EDEFAULT);
        return;
      case SpringgenPackage.DATABASE_CONFIGURATION__USERNAME:
        setUsername(USERNAME_EDEFAULT);
        return;
      case SpringgenPackage.DATABASE_CONFIGURATION__PASSWORD:
        setPassword(PASSWORD_EDEFAULT);
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
      case SpringgenPackage.DATABASE_CONFIGURATION__TYPE:
        return type != null;
      case SpringgenPackage.DATABASE_CONFIGURATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SpringgenPackage.DATABASE_CONFIGURATION__PORT:
        return port != PORT_EDEFAULT;
      case SpringgenPackage.DATABASE_CONFIGURATION__USERNAME:
        return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
      case SpringgenPackage.DATABASE_CONFIGURATION__PASSWORD:
        return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
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
    result.append(", port: ");
    result.append(port);
    result.append(", username: ");
    result.append(username);
    result.append(", password: ");
    result.append(password);
    result.append(')');
    return result.toString();
  }

} //DatabaseConfigurationImpl
