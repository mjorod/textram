/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ca.mcgill.cs.sel.ram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.mcgill.cs.sel.ram.Transition#getEndState <em>End State</em>}</li>
 *   <li>{@link ca.mcgill.cs.sel.ram.Transition#getStartState <em>Start State</em>}</li>
 *   <li>{@link ca.mcgill.cs.sel.ram.Transition#getSignature <em>Signature</em>}</li>
 *   <li>{@link ca.mcgill.cs.sel.ram.Transition#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.mcgill.cs.sel.ram.RamPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
     * Returns the value of the '<em><b>End State</b></em>' reference.
     * It is bidirectional and its opposite is '{@link ca.mcgill.cs.sel.ram.State#getIncomings <em>Incomings</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>End State</em>' reference.
     * @see #setEndState(State)
     * @see ca.mcgill.cs.sel.ram.RamPackage#getTransition_EndState()
     * @see ca.mcgill.cs.sel.ram.State#getIncomings
     * @model opposite="incomings" required="true"
     * @generated
     */
	State getEndState();

	/**
     * Sets the value of the '{@link ca.mcgill.cs.sel.ram.Transition#getEndState <em>End State</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>End State</em>' reference.
     * @see #getEndState()
     * @generated
     */
	void setEndState(State value);

	/**
     * Returns the value of the '<em><b>Start State</b></em>' reference.
     * It is bidirectional and its opposite is '{@link ca.mcgill.cs.sel.ram.State#getOutgoings <em>Outgoings</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Start State</em>' reference.
     * @see #setStartState(State)
     * @see ca.mcgill.cs.sel.ram.RamPackage#getTransition_StartState()
     * @see ca.mcgill.cs.sel.ram.State#getOutgoings
     * @model opposite="outgoings" required="true"
     * @generated
     */
	State getStartState();

	/**
     * Sets the value of the '{@link ca.mcgill.cs.sel.ram.Transition#getStartState <em>Start State</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start State</em>' reference.
     * @see #getStartState()
     * @generated
     */
	void setStartState(State value);

	/**
     * Returns the value of the '<em><b>Signature</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Signature</em>' reference.
     * @see #setSignature(Operation)
     * @see ca.mcgill.cs.sel.ram.RamPackage#getTransition_Signature()
     * @model
     * @generated
     */
	Operation getSignature();

	/**
     * Sets the value of the '{@link ca.mcgill.cs.sel.ram.Transition#getSignature <em>Signature</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Signature</em>' reference.
     * @see #getSignature()
     * @generated
     */
	void setSignature(Operation value);

	/**
     * Returns the value of the '<em><b>Guard</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Guard</em>' containment reference.
     * @see #setGuard(Constraint)
     * @see ca.mcgill.cs.sel.ram.RamPackage#getTransition_Guard()
     * @model containment="true"
     * @generated
     */
	Constraint getGuard();

	/**
     * Sets the value of the '{@link ca.mcgill.cs.sel.ram.Transition#getGuard <em>Guard</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Guard</em>' containment reference.
     * @see #getGuard()
     * @generated
     */
	void setGuard(Constraint value);

} // Transition
