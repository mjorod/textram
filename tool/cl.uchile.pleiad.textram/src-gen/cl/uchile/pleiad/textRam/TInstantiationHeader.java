/**
 */
package cl.uchile.pleiad.textRam;

import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.InstantiationType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TInstantiation Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TInstantiationHeader#getType <em>Type</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TInstantiationHeader#getExternalAspects <em>External Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTInstantiationHeader()
 * @model
 * @generated
 */
public interface TInstantiationHeader extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link ca.mcgill.cs.sel.ram.InstantiationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see ca.mcgill.cs.sel.ram.InstantiationType
   * @see #setType(InstantiationType)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTInstantiationHeader_Type()
   * @model
   * @generated
   */
  InstantiationType getType();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TInstantiationHeader#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see ca.mcgill.cs.sel.ram.InstantiationType
   * @see #getType()
   * @generated
   */
  void setType(InstantiationType value);

  /**
   * Returns the value of the '<em><b>External Aspects</b></em>' reference list.
   * The list contents are of type {@link ca.mcgill.cs.sel.ram.Aspect}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>External Aspects</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>External Aspects</em>' reference list.
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTInstantiationHeader_ExternalAspects()
   * @model
   * @generated
   */
  EList<Aspect> getExternalAspects();

} // TInstantiationHeader
