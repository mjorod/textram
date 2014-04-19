/**
 */
package cl.uchile.pleiad.textRam;

import ca.mcgill.cs.sel.ram.Aspect;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TAspect#getHeaderInstantiations <em>Header Instantiations</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAspect()
 * @model
 * @generated
 */
public interface TAspect extends Aspect
{
  /**
   * Returns the value of the '<em><b>Header Instantiations</b></em>' containment reference list.
   * The list contents are of type {@link cl.uchile.pleiad.textRam.TInstantiationHeader}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header Instantiations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header Instantiations</em>' containment reference list.
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAspect_HeaderInstantiations()
   * @model containment="true"
   * @generated
   */
  EList<TInstantiationHeader> getHeaderInstantiations();

} // TAspect
