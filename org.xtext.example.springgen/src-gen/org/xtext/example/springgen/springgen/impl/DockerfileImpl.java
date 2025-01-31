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

import org.xtext.example.springgen.springgen.BaseImage;
import org.xtext.example.springgen.springgen.DockerInstruction;
import org.xtext.example.springgen.springgen.Dockerfile;
import org.xtext.example.springgen.springgen.SpringgenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dockerfile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.DockerfileImpl#getBaseImage <em>Base Image</em>}</li>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.DockerfileImpl#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerfileImpl extends MinimalEObjectImpl.Container implements Dockerfile
{
  /**
   * The cached value of the '{@link #getBaseImage() <em>Base Image</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseImage()
   * @generated
   * @ordered
   */
  protected BaseImage baseImage;

  /**
   * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstructions()
   * @generated
   * @ordered
   */
  protected EList<DockerInstruction> instructions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DockerfileImpl()
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
    return SpringgenPackage.Literals.DOCKERFILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BaseImage getBaseImage()
  {
    return baseImage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBaseImage(BaseImage newBaseImage, NotificationChain msgs)
  {
    BaseImage oldBaseImage = baseImage;
    baseImage = newBaseImage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringgenPackage.DOCKERFILE__BASE_IMAGE, oldBaseImage, newBaseImage);
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
  public void setBaseImage(BaseImage newBaseImage)
  {
    if (newBaseImage != baseImage)
    {
      NotificationChain msgs = null;
      if (baseImage != null)
        msgs = ((InternalEObject)baseImage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringgenPackage.DOCKERFILE__BASE_IMAGE, null, msgs);
      if (newBaseImage != null)
        msgs = ((InternalEObject)newBaseImage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringgenPackage.DOCKERFILE__BASE_IMAGE, null, msgs);
      msgs = basicSetBaseImage(newBaseImage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringgenPackage.DOCKERFILE__BASE_IMAGE, newBaseImage, newBaseImage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DockerInstruction> getInstructions()
  {
    if (instructions == null)
    {
      instructions = new EObjectContainmentEList<DockerInstruction>(DockerInstruction.class, this, SpringgenPackage.DOCKERFILE__INSTRUCTIONS);
    }
    return instructions;
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
      case SpringgenPackage.DOCKERFILE__BASE_IMAGE:
        return basicSetBaseImage(null, msgs);
      case SpringgenPackage.DOCKERFILE__INSTRUCTIONS:
        return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
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
      case SpringgenPackage.DOCKERFILE__BASE_IMAGE:
        return getBaseImage();
      case SpringgenPackage.DOCKERFILE__INSTRUCTIONS:
        return getInstructions();
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
      case SpringgenPackage.DOCKERFILE__BASE_IMAGE:
        setBaseImage((BaseImage)newValue);
        return;
      case SpringgenPackage.DOCKERFILE__INSTRUCTIONS:
        getInstructions().clear();
        getInstructions().addAll((Collection<? extends DockerInstruction>)newValue);
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
      case SpringgenPackage.DOCKERFILE__BASE_IMAGE:
        setBaseImage((BaseImage)null);
        return;
      case SpringgenPackage.DOCKERFILE__INSTRUCTIONS:
        getInstructions().clear();
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
      case SpringgenPackage.DOCKERFILE__BASE_IMAGE:
        return baseImage != null;
      case SpringgenPackage.DOCKERFILE__INSTRUCTIONS:
        return instructions != null && !instructions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DockerfileImpl
