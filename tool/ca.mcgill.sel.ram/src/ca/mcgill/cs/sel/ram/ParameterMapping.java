/**
 */
package ca.mcgill.cs.sel.ram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.mcgill.cs.sel.ram.ParameterMapping#getFromElement <em>From Element</em>}</li>
 *   <li>{@link ca.mcgill.cs.sel.ram.ParameterMapping#getToElement <em>To Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.mcgill.cs.sel.ram.RamPackage#getParameterMapping()
 * @model
 * @generated
 */
public interface ParameterMapping extends Mapping {

    /**
     * Returns the value of the '<em><b>From Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From Element</em>' reference.
     * @see #setFromElement(Parameter)
     * @see ca.mcgill.cs.sel.ram.RamPackage#getParameterMapping_FromElement()
     * @model required="true"
     * @generated
     */
    Parameter getFromElement();

    /**
     * Sets the value of the '{@link ca.mcgill.cs.sel.ram.ParameterMapping#getFromElement <em>From Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From Element</em>' reference.
     * @see #getFromElement()
     * @generated
     */
    void setFromElement(Parameter value);

    /**
     * Returns the value of the '<em><b>To Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>To Element</em>' reference.
     * @see #setToElement(Parameter)
     * @see ca.mcgill.cs.sel.ram.RamPackage#getParameterMapping_ToElement()
     * @model required="true"
     * @generated
     */
    Parameter getToElement();

    /**
     * Sets the value of the '{@link ca.mcgill.cs.sel.ram.ParameterMapping#getToElement <em>To Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To Element</em>' reference.
     * @see #getToElement()
     * @generated
     */
    void setToElement(Parameter value);
} // ParameterMapping
