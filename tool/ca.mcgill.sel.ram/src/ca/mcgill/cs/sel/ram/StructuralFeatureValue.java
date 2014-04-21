/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ca.mcgill.cs.sel.ram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Feature Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.mcgill.cs.sel.ram.StructuralFeatureValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.mcgill.cs.sel.ram.RamPackage#getStructuralFeatureValue()
 * @model
 * @generated
 */
public interface StructuralFeatureValue extends ValueSpecification {
    /**
     * Returns the value of the '<em><b>Value</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' reference.
     * @see #setValue(StructuralFeature)
     * @see ca.mcgill.cs.sel.ram.RamPackage#getStructuralFeatureValue_Value()
     * @model required="true"
     * @generated
     */
    StructuralFeature getValue();

    /**
     * Sets the value of the '{@link ca.mcgill.cs.sel.ram.StructuralFeatureValue#getValue <em>Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' reference.
     * @see #getValue()
     * @generated
     */
    void setValue(StructuralFeature value);

} // StructuralFeatureValue
