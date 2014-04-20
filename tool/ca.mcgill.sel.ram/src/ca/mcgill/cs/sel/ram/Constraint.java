/**
 */
package ca.mcgill.cs.sel.ram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.mcgill.cs.sel.ram.Constraint#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.mcgill.cs.sel.ram.RamPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
     * Returns the value of the '<em><b>Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Specification</em>' containment reference.
     * @see #setSpecification(ValueSpecification)
     * @see ca.mcgill.cs.sel.ram.RamPackage#getConstraint_Specification()
     * @model containment="true" required="true"
     * @generated
     */
	ValueSpecification getSpecification();

	/**
     * Sets the value of the '{@link ca.mcgill.cs.sel.ram.Constraint#getSpecification <em>Specification</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Specification</em>' containment reference.
     * @see #getSpecification()
     * @generated
     */
	void setSpecification(ValueSpecification value);

} // Constraint
