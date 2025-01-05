/**
 * generated by Xtext 2.37.0
 */
package org.xtext.example.springgen.springgen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.springgen.springgen.ServerConfiguration;
import org.xtext.example.springgen.springgen.SpringgenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.ServerConfigurationImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.ServerConfigurationImpl#getContextPath <em>Context Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerConfigurationImpl extends MinimalEObjectImpl.Container implements ServerConfiguration
{
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
   * The default value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextPath()
   * @generated
   * @ordered
   */
  protected static final String CONTEXT_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextPath()
   * @generated
   * @ordered
   */
  protected String contextPath = CONTEXT_PATH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServerConfigurationImpl()
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
    return SpringgenPackage.Literals.SERVER_CONFIGURATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpringgenPackage.SERVER_CONFIGURATION__PORT, oldPort, port));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getContextPath()
  {
    return contextPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setContextPath(String newContextPath)
  {
    String oldContextPath = contextPath;
    contextPath = newContextPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringgenPackage.SERVER_CONFIGURATION__CONTEXT_PATH, oldContextPath, contextPath));
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
      case SpringgenPackage.SERVER_CONFIGURATION__PORT:
        return getPort();
      case SpringgenPackage.SERVER_CONFIGURATION__CONTEXT_PATH:
        return getContextPath();
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
      case SpringgenPackage.SERVER_CONFIGURATION__PORT:
        setPort((Integer)newValue);
        return;
      case SpringgenPackage.SERVER_CONFIGURATION__CONTEXT_PATH:
        setContextPath((String)newValue);
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
      case SpringgenPackage.SERVER_CONFIGURATION__PORT:
        setPort(PORT_EDEFAULT);
        return;
      case SpringgenPackage.SERVER_CONFIGURATION__CONTEXT_PATH:
        setContextPath(CONTEXT_PATH_EDEFAULT);
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
      case SpringgenPackage.SERVER_CONFIGURATION__PORT:
        return port != PORT_EDEFAULT;
      case SpringgenPackage.SERVER_CONFIGURATION__CONTEXT_PATH:
        return CONTEXT_PATH_EDEFAULT == null ? contextPath != null : !CONTEXT_PATH_EDEFAULT.equals(contextPath);
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
    result.append(" (port: ");
    result.append(port);
    result.append(", contextPath: ");
    result.append(contextPath);
    result.append(')');
    return result.toString();
  }

} //ServerConfigurationImpl
