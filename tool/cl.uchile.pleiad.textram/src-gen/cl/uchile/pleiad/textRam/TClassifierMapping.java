/**
 */
package cl.uchile.pleiad.textRam;

import ca.mcgill.cs.sel.ram.ClassifierMapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TClassifier Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TClassifierMapping#isPartialFromElement <em>Partial From Element</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TClassifierMapping#getFromMembers <em>From Members</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TClassifierMapping#isPartialToElement <em>Partial To Element</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TClassifierMapping#getToMembers <em>To Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTClassifierMapping()
 * @model
 * @generated
 */
public interface TClassifierMapping extends ClassifierMapping
{
  /**
   * Returns the value of the '<em><b>Partial From Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partial From Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partial From Element</em>' attribute.
   * @see #setPartialFromElement(boolean)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTClassifierMapping_PartialFromElement()
   * @model
   * @generated
   */
  boolean isPartialFromElement();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TClassifierMapping#isPartialFromElement <em>Partial From Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partial From Element</em>' attribute.
   * @see #isPartialFromElement()
   * @generated
   */
  void setPartialFromElement(boolean value);

  /**
   * Returns the value of the '<em><b>From Members</b></em>' reference list.
   * The list contents are of type {@link cl.uchile.pleiad.textRam.TClassMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Members</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Members</em>' reference list.
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTClassifierMapping_FromMembers()
   * @model
   * @generated
   */
  EList<TClassMember> getFromMembers();

  /**
   * Returns the value of the '<em><b>Partial To Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partial To Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partial To Element</em>' attribute.
   * @see #setPartialToElement(boolean)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTClassifierMapping_PartialToElement()
   * @model
   * @generated
   */
  boolean isPartialToElement();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TClassifierMapping#isPartialToElement <em>Partial To Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partial To Element</em>' attribute.
   * @see #isPartialToElement()
   * @generated
   */
  void setPartialToElement(boolean value);

  /**
   * Returns the value of the '<em><b>To Members</b></em>' reference list.
   * The list contents are of type {@link cl.uchile.pleiad.textRam.TClassMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Members</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Members</em>' reference list.
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTClassifierMapping_ToMembers()
   * @model
   * @generated
   */
  EList<TClassMember> getToMembers();

} // TClassifierMapping
