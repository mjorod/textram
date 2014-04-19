/**
 */
package cl.uchile.pleiad.textRam;

import ca.mcgill.cs.sel.ram.ReferenceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAssociation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TAssociation#getFromEnd <em>From End</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TAssociation#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TAssociation#getToEnd <em>To End</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAssociation()
 * @model
 * @generated
 */
public interface TAssociation extends TTypedElement, TMessageAssignableFeature
{
  /**
   * Returns the value of the '<em><b>From End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From End</em>' containment reference.
   * @see #setFromEnd(TAssociationEnd)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAssociation_FromEnd()
   * @model containment="true"
   * @generated
   */
  TAssociationEnd getFromEnd();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TAssociation#getFromEnd <em>From End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From End</em>' containment reference.
   * @see #getFromEnd()
   * @generated
   */
  void setFromEnd(TAssociationEnd value);

  /**
   * Returns the value of the '<em><b>Reference Type</b></em>' attribute.
   * The literals are from the enumeration {@link ca.mcgill.cs.sel.ram.ReferenceType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference Type</em>' attribute.
   * @see ca.mcgill.cs.sel.ram.ReferenceType
   * @see #setReferenceType(ReferenceType)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAssociation_ReferenceType()
   * @model
   * @generated
   */
  ReferenceType getReferenceType();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TAssociation#getReferenceType <em>Reference Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference Type</em>' attribute.
   * @see ca.mcgill.cs.sel.ram.ReferenceType
   * @see #getReferenceType()
   * @generated
   */
  void setReferenceType(ReferenceType value);

  /**
   * Returns the value of the '<em><b>To End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To End</em>' containment reference.
   * @see #setToEnd(TAssociationEnd)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAssociation_ToEnd()
   * @model containment="true"
   * @generated
   */
  TAssociationEnd getToEnd();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TAssociation#getToEnd <em>To End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To End</em>' containment reference.
   * @see #getToEnd()
   * @generated
   */
  void setToEnd(TAssociationEnd value);

} // TAssociation
