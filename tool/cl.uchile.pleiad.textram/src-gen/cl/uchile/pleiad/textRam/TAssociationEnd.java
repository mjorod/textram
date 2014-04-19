/**
 */
package cl.uchile.pleiad.textRam;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAssociation End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TAssociationEnd#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TAssociationEnd#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TAssociationEnd#getClassReference <em>Class Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAssociationEnd()
 * @model
 * @generated
 */
public interface TAssociationEnd extends EObject
{
  /**
   * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower Bound</em>' attribute.
   * @see #setLowerBound(int)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAssociationEnd_LowerBound()
   * @model
   * @generated
   */
  int getLowerBound();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TAssociationEnd#getLowerBound <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower Bound</em>' attribute.
   * @see #getLowerBound()
   * @generated
   */
  void setLowerBound(int value);

  /**
   * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Bound</em>' attribute.
   * @see #setUpperBound(int)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAssociationEnd_UpperBound()
   * @model
   * @generated
   */
  int getUpperBound();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TAssociationEnd#getUpperBound <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Bound</em>' attribute.
   * @see #getUpperBound()
   * @generated
   */
  void setUpperBound(int value);

  /**
   * Returns the value of the '<em><b>Class Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Reference</em>' reference.
   * @see #setClassReference(ca.mcgill.cs.sel.ram.Class)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAssociationEnd_ClassReference()
   * @model
   * @generated
   */
  ca.mcgill.cs.sel.ram.Class getClassReference();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TAssociationEnd#getClassReference <em>Class Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Reference</em>' reference.
   * @see #getClassReference()
   * @generated
   */
  void setClassReference(ca.mcgill.cs.sel.ram.Class value);

} // TAssociationEnd
