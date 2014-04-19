/**
 */
package cl.uchile.pleiad.textRam;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAbstract Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TAbstractMessage#getAssignTo <em>Assign To</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAbstractMessage()
 * @model
 * @generated
 */
public interface TAbstractMessage extends EObject
{
  /**
   * Returns the value of the '<em><b>Assign To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assign To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign To</em>' reference.
   * @see #setAssignTo(TMessageAssignableFeature)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAbstractMessage_AssignTo()
   * @model
   * @generated
   */
  TMessageAssignableFeature getAssignTo();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TAbstractMessage#getAssignTo <em>Assign To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assign To</em>' reference.
   * @see #getAssignTo()
   * @generated
   */
  void setAssignTo(TMessageAssignableFeature value);

} // TAbstractMessage
