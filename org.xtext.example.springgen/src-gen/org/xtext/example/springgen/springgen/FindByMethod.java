/**
 * generated by Xtext 2.37.0
 */
package org.xtext.example.springgen.springgen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Find By Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.springgen.springgen.FindByMethod#getProperty <em>Property</em>}</li>
 *   <li>{@link org.xtext.example.springgen.springgen.FindByMethod#getPropertyType <em>Property Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.springgen.springgen.SpringgenPackage#getFindByMethod()
 * @model
 * @generated
 */
public interface FindByMethod extends EObject
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' attribute.
   * @see #setProperty(String)
   * @see org.xtext.example.springgen.springgen.SpringgenPackage#getFindByMethod_Property()
   * @model
   * @generated
   */
  String getProperty();

  /**
   * Sets the value of the '{@link org.xtext.example.springgen.springgen.FindByMethod#getProperty <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' attribute.
   * @see #getProperty()
   * @generated
   */
  void setProperty(String value);

  /**
   * Returns the value of the '<em><b>Property Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Type</em>' containment reference.
   * @see #setPropertyType(ValueTypes)
   * @see org.xtext.example.springgen.springgen.SpringgenPackage#getFindByMethod_PropertyType()
   * @model containment="true"
   * @generated
   */
  ValueTypes getPropertyType();

  /**
   * Sets the value of the '{@link org.xtext.example.springgen.springgen.FindByMethod#getPropertyType <em>Property Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Type</em>' containment reference.
   * @see #getPropertyType()
   * @generated
   */
  void setPropertyType(ValueTypes value);

} // FindByMethod
