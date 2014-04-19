/**
 */
package cl.uchile.pleiad.textRam;

import ca.mcgill.cs.sel.ram.PrimitiveType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TLocal Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TLocalAttribute#getType <em>Type</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TLocalAttribute#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTLocalAttribute()
 * @model
 * @generated
 */
public interface TLocalAttribute extends TTemporaryProperty
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(PrimitiveType)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTLocalAttribute_Type()
   * @model
   * @generated
   */
  PrimitiveType getType();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TLocalAttribute#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(PrimitiveType value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTLocalAttribute_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TLocalAttribute#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // TLocalAttribute
