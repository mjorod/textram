/**
 */
package cl.uchile.pleiad.textRam;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TInteraction Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TInteractionMessage#getLeftLifeline <em>Left Lifeline</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TInteractionMessage#isCreate <em>Create</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TInteractionMessage#getRightLifeline <em>Right Lifeline</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TInteractionMessage#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTInteractionMessage()
 * @model
 * @generated
 */
public interface TInteractionMessage extends TInteraction
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
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTInteractionMessage_LeftLifeline()
   * @model
   * @generated
   */
  TLifeline getLeftLifeline();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TInteractionMessage#getLeftLifeline <em>Left Lifeline</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Lifeline</em>' reference.
   * @see #getLeftLifeline()
   * @generated
   */
  void setLeftLifeline(TLifeline value);

  /**
   * Returns the value of the '<em><b>Create</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create</em>' attribute.
   * @see #setCreate(boolean)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTInteractionMessage_Create()
   * @model
   * @generated
   */
  boolean isCreate();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TInteractionMessage#isCreate <em>Create</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create</em>' attribute.
   * @see #isCreate()
   * @generated
   */
  void setCreate(boolean value);

  /**
   * Returns the value of the '<em><b>Right Lifeline</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Lifeline</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Lifeline</em>' reference.
   * @see #setRightLifeline(TLifeline)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTInteractionMessage_RightLifeline()
   * @model
   * @generated
   */
  TLifeline getRightLifeline();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TInteractionMessage#getRightLifeline <em>Right Lifeline</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Lifeline</em>' reference.
   * @see #getRightLifeline()
   * @generated
   */
  void setRightLifeline(TLifeline value);

  /**
   * Returns the value of the '<em><b>Message</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' containment reference.
   * @see #setMessage(TAbstractMessage)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTInteractionMessage_Message()
   * @model containment="true"
   * @generated
   */
  TAbstractMessage getMessage();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TInteractionMessage#getMessage <em>Message</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' containment reference.
   * @see #getMessage()
   * @generated
   */
  void setMessage(TAbstractMessage value);

} // TInteractionMessage
