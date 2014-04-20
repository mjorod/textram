/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ca.mcgill.cs.sel.ram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.mcgill.cs.sel.ram.Attribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.mcgill.cs.sel.ram.RamPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends StructuralFeature, TemporaryProperty, MappableElement {
	/**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(PrimitiveType)
     * @see ca.mcgill.cs.sel.ram.RamPackage#getAttribute_Type()
     * @model required="true"
     * @generated
     */
	PrimitiveType getType();

	/**
     * Sets the value of the '{@link ca.mcgill.cs.sel.ram.Attribute#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
	void setType(PrimitiveType value);

} // Attribute
