/**
 */
package cl.uchile.pleiad.textRam;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TClass Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TClassMember#isStatic <em>Static</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TClassMember#isPartial <em>Partial</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TClassMember#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTClassMember()
 * @model
 * @generated
 */
public interface TClassMember extends EObject
{
  /**
   * Returns the value of the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static</em>' attribute.
   * @see #setStatic(boolean)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTClassMember_Static()
   * @model
   * @generated
   */
  boolean isStatic();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TClassMember#isStatic <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static</em>' attribute.
   * @see #isStatic()
   * @generated
   */
  void setStatic(boolean value);

  /**
   * Returns the value of the '<em><b>Partial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partial</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partial</em>' attribute.
   * @see #setPartial(boolean)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTClassMember_Partial()
   * @model
   * @generated
   */
  boolean isPartial();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TClassMember#isPartial <em>Partial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partial</em>' attribute.
   * @see #isPartial()
   * @generated
   */
  void setPartial(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTClassMember_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TClassMember#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // TClassMember
