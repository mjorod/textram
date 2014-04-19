/**
 */
package cl.uchile.pleiad.textRam;

import ca.mcgill.cs.sel.ram.StructuralView;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TStructural View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TStructuralView#getTAssociations <em>TAssociations</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTStructuralView()
 * @model
 * @generated
 */
public interface TStructuralView extends StructuralView
{
  /**
   * Returns the value of the '<em><b>TAssociations</b></em>' containment reference list.
   * The list contents are of type {@link cl.uchile.pleiad.textRam.TAssociation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>TAssociations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>TAssociations</em>' containment reference list.
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTStructuralView_TAssociations()
   * @model containment="true"
   * @generated
   */
  EList<TAssociation> getTAssociations();

} // TStructuralView
