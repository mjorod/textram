/**
 */
package cl.uchile.pleiad.textRam;

import ca.mcgill.cs.sel.ram.AbstractMessageView;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAbstract Message View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TAbstractMessageView#getLifelines <em>Lifelines</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TAbstractMessageView#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAbstractMessageView()
 * @model
 * @generated
 */
public interface TAbstractMessageView extends AbstractMessageView
{
  /**
   * Returns the value of the '<em><b>Lifelines</b></em>' containment reference list.
   * The list contents are of type {@link cl.uchile.pleiad.textRam.TLifeline}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lifelines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lifelines</em>' containment reference list.
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAbstractMessageView_Lifelines()
   * @model containment="true"
   * @generated
   */
  EList<TLifeline> getLifelines();

  /**
   * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
   * The list contents are of type {@link cl.uchile.pleiad.textRam.TAbstractMessages}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Messages</em>' containment reference list.
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAbstractMessageView_Messages()
   * @model containment="true"
   * @generated
   */
  EList<TAbstractMessages> getMessages();

} // TAbstractMessageView
