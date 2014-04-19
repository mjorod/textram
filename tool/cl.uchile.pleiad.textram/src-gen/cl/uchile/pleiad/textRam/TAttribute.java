/**
 */
package cl.uchile.pleiad.textRam;

import ca.mcgill.cs.sel.ram.PrimitiveType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TAttribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAttribute()
 * @model
 * @generated
 */
public interface TAttribute extends TClassMember, TTypedElement
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
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAttribute_Type()
   * @model
   * @generated
   */
  PrimitiveType getType();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TAttribute#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(PrimitiveType value);

} // TAttribute
