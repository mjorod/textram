/**
 */
package cl.uchile.pleiad.textRam;

import ca.mcgill.cs.sel.ram.Classifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TClass#isPartialSuperType <em>Partial Super Type</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TClass#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTClass()
 * @model
 * @generated
 */
public interface TClass extends Classifier, ca.mcgill.cs.sel.ram.Class, TTypedElement
{
  /**
   * Returns the value of the '<em><b>Partial Super Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partial Super Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partial Super Type</em>' attribute.
   * @see #setPartialSuperType(boolean)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTClass_PartialSuperType()
   * @model
   * @generated
   */
  boolean isPartialSuperType();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TClass#isPartialSuperType <em>Partial Super Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partial Super Type</em>' attribute.
   * @see #isPartialSuperType()
   * @generated
   */
  void setPartialSuperType(boolean value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link cl.uchile.pleiad.textRam.TClassMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTClass_Members()
   * @model containment="true"
   * @generated
   */
  EList<TClassMember> getMembers();

} // TClass
