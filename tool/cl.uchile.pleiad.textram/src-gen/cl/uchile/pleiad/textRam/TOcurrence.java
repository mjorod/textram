/**
 */
package cl.uchile.pleiad.textRam;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TOcurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TOcurrence#getLeftLifeline <em>Left Lifeline</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TOcurrence#getOcurrenceType <em>Ocurrence Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTOcurrence()
 * @model
 * @generated
 */
public interface TOcurrence extends TInteraction
{
  /**
   * Returns the value of the '<em><b>Left Lifeline</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Lifeline</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Lifeline</em>' reference.
   * @see #setLeftLifeline(TLifeline)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTOcurrence_LeftLifeline()
   * @model
   * @generated
   */
  TLifeline getLeftLifeline();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TOcurrence#getLeftLifeline <em>Left Lifeline</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Lifeline</em>' reference.
   * @see #getLeftLifeline()
   * @generated
   */
  void setLeftLifeline(TLifeline value);

  /**
   * Returns the value of the '<em><b>Ocurrence Type</b></em>' attribute.
   * The literals are from the enumeration {@link cl.uchile.pleiad.textRam.OcurrenceType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ocurrence Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ocurrence Type</em>' attribute.
   * @see cl.uchile.pleiad.textRam.OcurrenceType
   * @see #setOcurrenceType(OcurrenceType)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTOcurrence_OcurrenceType()
   * @model
   * @generated
   */
  OcurrenceType getOcurrenceType();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TOcurrence#getOcurrenceType <em>Ocurrence Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ocurrence Type</em>' attribute.
   * @see cl.uchile.pleiad.textRam.OcurrenceType
   * @see #getOcurrenceType()
   * @generated
   */
  void setOcurrenceType(OcurrenceType value);

} // TOcurrence
