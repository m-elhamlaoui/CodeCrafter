/**
 * generated by Xtext 2.37.0
 */
package org.xtext.example.springgen.springgen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expose Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.springgen.springgen.ExposeInstruction#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.springgen.springgen.SpringgenPackage#getExposeInstruction()
 * @model
 * @generated
 */
public interface ExposeInstruction extends DockerInstruction
{
  /**
   * Returns the value of the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' attribute.
   * @see #setPort(int)
   * @see org.xtext.example.springgen.springgen.SpringgenPackage#getExposeInstruction_Port()
   * @model
   * @generated
   */
  int getPort();

  /**
   * Sets the value of the '{@link org.xtext.example.springgen.springgen.ExposeInstruction#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
  void setPort(int value);

} // ExposeInstruction
