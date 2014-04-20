/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ca.mcgill.cs.sel.ram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.mcgill.cs.sel.ram.StateMachine#getStart <em>Start</em>}</li>
 *   <li>{@link ca.mcgill.cs.sel.ram.StateMachine#getStates <em>States</em>}</li>
 *   <li>{@link ca.mcgill.cs.sel.ram.StateMachine#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link ca.mcgill.cs.sel.ram.StateMachine#getSubstitutions <em>Substitutions</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.mcgill.cs.sel.ram.RamPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject {
	/**
     * Returns the value of the '<em><b>Start</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Start</em>' reference.
     * @see #setStart(State)
     * @see ca.mcgill.cs.sel.ram.RamPackage#getStateMachine_Start()
     * @model required="true"
     * @generated
     */
	State getStart();

	/**
     * Sets the value of the '{@link ca.mcgill.cs.sel.ram.StateMachine#getStart <em>Start</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start</em>' reference.
     * @see #getStart()
     * @generated
     */
	void setStart(State value);

	/**
     * Returns the value of the '<em><b>States</b></em>' containment reference list.
     * The list contents are of type {@link ca.mcgill.cs.sel.ram.State}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>States</em>' containment reference list.
     * @see ca.mcgill.cs.sel.ram.RamPackage#getStateMachine_States()
     * @model containment="true"
     * @generated
     */
	EList<State> getStates();

	/**
     * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
     * The list contents are of type {@link ca.mcgill.cs.sel.ram.Transition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Transitions</em>' containment reference list.
     * @see ca.mcgill.cs.sel.ram.RamPackage#getStateMachine_Transitions()
     * @model containment="true"
     * @generated
     */
	EList<Transition> getTransitions();

	/**
     * Returns the value of the '<em><b>Substitutions</b></em>' containment reference list.
     * The list contents are of type {@link ca.mcgill.cs.sel.ram.Substitution}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitutions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Substitutions</em>' containment reference list.
     * @see ca.mcgill.cs.sel.ram.RamPackage#getStateMachine_Substitutions()
     * @model containment="true"
     * @generated
     */
	EList<Substitution> getSubstitutions();

} // StateMachine
