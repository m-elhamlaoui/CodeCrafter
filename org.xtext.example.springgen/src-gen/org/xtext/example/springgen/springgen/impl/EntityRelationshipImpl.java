/**
 * generated by Xtext 2.37.0
 */
package org.xtext.example.springgen.springgen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.springgen.springgen.DatabaseRelations;
import org.xtext.example.springgen.springgen.Entity;
import org.xtext.example.springgen.springgen.EntityRelationship;
import org.xtext.example.springgen.springgen.SpringgenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.EntityRelationshipImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.EntityRelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.example.springgen.springgen.impl.EntityRelationshipImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityRelationshipImpl extends ProjectElementImpl implements EntityRelationship
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DatabaseRelations type;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected Entity source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Entity target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityRelationshipImpl()
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
    return SpringgenPackage.Literals.ENTITY_RELATIONSHIP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DatabaseRelations getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(DatabaseRelations newType, NotificationChain msgs)
  {
    DatabaseRelations oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringgenPackage.ENTITY_RELATIONSHIP__TYPE, oldType, newType);
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
  public void setType(DatabaseRelations newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringgenPackage.ENTITY_RELATIONSHIP__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringgenPackage.ENTITY_RELATIONSHIP__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringgenPackage.ENTITY_RELATIONSHIP__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (Entity)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpringgenPackage.ENTITY_RELATIONSHIP__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSource(Entity newSource)
  {
    Entity oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringgenPackage.ENTITY_RELATIONSHIP__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (Entity)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpringgenPackage.ENTITY_RELATIONSHIP__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTarget(Entity newTarget)
  {
    Entity oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringgenPackage.ENTITY_RELATIONSHIP__TARGET, oldTarget, target));
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
      case SpringgenPackage.ENTITY_RELATIONSHIP__TYPE:
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
      case SpringgenPackage.ENTITY_RELATIONSHIP__TYPE:
        return getType();
      case SpringgenPackage.ENTITY_RELATIONSHIP__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case SpringgenPackage.ENTITY_RELATIONSHIP__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
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
      case SpringgenPackage.ENTITY_RELATIONSHIP__TYPE:
        setType((DatabaseRelations)newValue);
        return;
      case SpringgenPackage.ENTITY_RELATIONSHIP__SOURCE:
        setSource((Entity)newValue);
        return;
      case SpringgenPackage.ENTITY_RELATIONSHIP__TARGET:
        setTarget((Entity)newValue);
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
      case SpringgenPackage.ENTITY_RELATIONSHIP__TYPE:
        setType((DatabaseRelations)null);
        return;
      case SpringgenPackage.ENTITY_RELATIONSHIP__SOURCE:
        setSource((Entity)null);
        return;
      case SpringgenPackage.ENTITY_RELATIONSHIP__TARGET:
        setTarget((Entity)null);
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
      case SpringgenPackage.ENTITY_RELATIONSHIP__TYPE:
        return type != null;
      case SpringgenPackage.ENTITY_RELATIONSHIP__SOURCE:
        return source != null;
      case SpringgenPackage.ENTITY_RELATIONSHIP__TARGET:
        return target != null;
    }
    return super.eIsSet(featureID);
  }

} //EntityRelationshipImpl
