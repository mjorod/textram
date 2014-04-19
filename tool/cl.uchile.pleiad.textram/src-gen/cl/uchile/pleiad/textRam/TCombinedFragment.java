/**
 */
package cl.uchile.pleiad.textRam;

import ca.mcgill.cs.sel.ram.InteractionOperatorKind;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCombined Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TCombinedFragment#getInteractionOperator <em>Interaction Operator</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TCombinedFragment#getInteractionConstraint <em>Interaction Constraint</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TCombinedFragment#getContainers <em>Containers</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TCombinedFragment#getElseContainers <em>Else Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTCombinedFragment()
 * @model
 * @generated
 */
public interface TCombinedFragment extends TInteraction
{
  /**
   * Returns the value of the '<em><b>Interaction Operator</b></em>' attribute.
   * The literals are from the enumeration {@link ca.mcgill.cs.sel.ram.InteractionOperatorKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interaction Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interaction Operator</em>' attribute.
   * @see ca.mcgill.cs.sel.ram.InteractionOperatorKind
   * @see #setInteractionOperator(InteractionOperatorKind)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTCombinedFragment_InteractionOperator()
   * @model
   * @generated
   */
  InteractionOperatorKind getInteractionOperator();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TCombinedFragment#getInteractionOperator <em>Interaction Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interaction Operator</em>' attribute.
   * @see ca.mcgill.cs.sel.ram.InteractionOperatorKind
   * @see #getInteractionOperator()
   * @generated
   */
  void setInteractionOperator(InteractionOperatorKind value);

  /**
   * Returns the value of the '<em><b>Interaction Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interaction Constraint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interaction Constraint</em>' attribute.
   * @see #setInteractionConstraint(String)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTCombinedFragment_InteractionConstraint()
   * @model
   * @generated
   */
  String getInteractionConstraint();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TCombinedFragment#getInteractionConstraint <em>Interaction Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interaction Constraint</em>' attribute.
   * @see #getInteractionConstraint()
   * @generated
   */
  void setInteractionConstraint(String value);

  /**
   * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
   * The list contents are of type {@link cl.uchile.pleiad.textRam.TInteraction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Containers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Containers</em>' containment reference list.
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTCombinedFragment_Containers()
   * @model containment="true"
   * @generated
   */
  EList<TInteraction> getContainers();

  /**
   * Returns the value of the '<em><b>Else Containers</b></em>' containment reference list.
   * The list contents are of type {@link cl.uchile.pleiad.textRam.TInteraction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Containers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Containers</em>' containment reference list.
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTCombinedFragment_ElseContainers()
   * @model containment="true"
   * @generated
   */
  EList<TInteraction> getElseContainers();

} // TCombinedFragment
