/**
 */
package cl.uchile.pleiad.textRam;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TReference#isPartialClass <em>Partial Class</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TReference#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTReference()
 * @model
 * @generated
 */
public interface TReference extends TTemporaryProperty
{
  /**
   * Returns the value of the '<em><b>Partial Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partial Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partial Class</em>' attribute.
   * @see #setPartialClass(boolean)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTReference_PartialClass()
   * @model
   * @generated
   */
  boolean isPartialClass();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TReference#isPartialClass <em>Partial Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partial Class</em>' attribute.
   * @see #isPartialClass()
   * @generated
   */
  void setPartialClass(boolean value);

  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(TClass)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTReference_Reference()
   * @model
   * @generated
   */
  TClass getReference();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TReference#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(TClass value);

} // TReference
