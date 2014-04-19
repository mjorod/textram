/**
 */
package cl.uchile.pleiad.textRam;

import ca.mcgill.cs.sel.ram.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TParameter#isPartialType <em>Partial Type</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TParameter#getType <em>Type</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TParameter#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTParameter()
 * @model
 * @generated
 */
public interface TParameter extends TValueSpecification
{
  /**
   * Returns the value of the '<em><b>Partial Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partial Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partial Type</em>' attribute.
   * @see #setPartialType(boolean)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTParameter_PartialType()
   * @model
   * @generated
   */
  boolean isPartialType();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TParameter#isPartialType <em>Partial Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partial Type</em>' attribute.
   * @see #isPartialType()
   * @generated
   */
  void setPartialType(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTParameter_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TParameter#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TParameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // TParameter
