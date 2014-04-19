/**
 */
package cl.uchile.pleiad.textRam;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMessage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TMessage#isPartialOperation <em>Partial Operation</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TMessage#getSignature <em>Signature</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TMessage#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTMessage()
 * @model
 * @generated
 */
public interface TMessage extends TAbstractMessage
{
  /**
   * Returns the value of the '<em><b>Partial Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partial Operation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partial Operation</em>' attribute.
   * @see #setPartialOperation(boolean)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTMessage_PartialOperation()
   * @model
   * @generated
   */
  boolean isPartialOperation();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TMessage#isPartialOperation <em>Partial Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partial Operation</em>' attribute.
   * @see #isPartialOperation()
   * @generated
   */
  void setPartialOperation(boolean value);

  /**
   * Returns the value of the '<em><b>Signature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' reference.
   * @see #setSignature(TOperation)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTMessage_Signature()
   * @model
   * @generated
   */
  TOperation getSignature();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TMessage#getSignature <em>Signature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' reference.
   * @see #getSignature()
   * @generated
   */
  void setSignature(TOperation value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' reference list.
   * The list contents are of type {@link cl.uchile.pleiad.textRam.TValueSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' reference list.
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTMessage_Arguments()
   * @model
   * @generated
   */
  EList<TValueSpecification> getArguments();

} // TMessage
