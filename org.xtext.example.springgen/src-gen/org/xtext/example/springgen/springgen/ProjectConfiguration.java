/**
 * generated by Xtext 2.37.0
 */
package org.xtext.example.springgen.springgen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.springgen.springgen.ProjectConfiguration#getServer <em>Server</em>}</li>
 *   <li>{@link org.xtext.example.springgen.springgen.ProjectConfiguration#getDatabase <em>Database</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.springgen.springgen.SpringgenPackage#getProjectConfiguration()
 * @model
 * @generated
 */
public interface ProjectConfiguration extends EObject
{
  /**
   * Returns the value of the '<em><b>Server</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Server</em>' containment reference.
   * @see #setServer(ServerConfiguration)
   * @see org.xtext.example.springgen.springgen.SpringgenPackage#getProjectConfiguration_Server()
   * @model containment="true"
   * @generated
   */
  ServerConfiguration getServer();

  /**
   * Sets the value of the '{@link org.xtext.example.springgen.springgen.ProjectConfiguration#getServer <em>Server</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Server</em>' containment reference.
   * @see #getServer()
   * @generated
   */
  void setServer(ServerConfiguration value);

  /**
   * Returns the value of the '<em><b>Database</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Database</em>' containment reference.
   * @see #setDatabase(DatabaseConfiguration)
   * @see org.xtext.example.springgen.springgen.SpringgenPackage#getProjectConfiguration_Database()
   * @model containment="true"
   * @generated
   */
  DatabaseConfiguration getDatabase();

  /**
   * Sets the value of the '{@link org.xtext.example.springgen.springgen.ProjectConfiguration#getDatabase <em>Database</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Database</em>' containment reference.
   * @see #getDatabase()
   * @generated
   */
  void setDatabase(DatabaseConfiguration value);

} // ProjectConfiguration
