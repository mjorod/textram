/**
 */
package cl.uchile.pleiad.textRam;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMessage View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TMessageView#getAffectedBy <em>Affected By</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTMessageView()
 * @model
 * @generated
 */
public interface TMessageView extends TAbstractMessages
{
  /**
   * Returns the value of the '<em><b>Affected By</b></em>' reference list.
   * The list contents are of type {@link cl.uchile.pleiad.textRam.TAspectMessageView}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Affected By</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Affected By</em>' reference list.
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTMessageView_AffectedBy()
   * @model
   * @generated
   */
  EList<TAspectMessageView> getAffectedBy();

} // TMessageView
