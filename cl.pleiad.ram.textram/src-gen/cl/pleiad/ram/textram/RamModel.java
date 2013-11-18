/**
 */
package cl.pleiad.ram.textram;

import ca.mcgill.cs.sel.ram.Aspect;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ram Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.pleiad.ram.textram.RamModel#getAspects <em>Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.pleiad.ram.textram.TextramPackage#getRamModel()
 * @model
 * @generated
 */
public interface RamModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Aspects</b></em>' containment reference list.
   * The list contents are of type {@link ca.mcgill.cs.sel.ram.Aspect}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aspects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aspects</em>' containment reference list.
   * @see cl.pleiad.ram.textram.TextramPackage#getRamModel_Aspects()
   * @model containment="true"
   * @generated
   */
  EList<Aspect> getAspects();

} // RamModel
