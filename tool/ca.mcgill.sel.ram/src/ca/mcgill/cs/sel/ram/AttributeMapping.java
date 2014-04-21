/**
 */
package ca.mcgill.cs.sel.ram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.mcgill.cs.sel.ram.AttributeMapping#getFromElement <em>From Element</em>}</li>
 *   <li>{@link ca.mcgill.cs.sel.ram.AttributeMapping#getToElement <em>To Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.mcgill.cs.sel.ram.RamPackage#getAttributeMapping()
 * @model
 * @generated
 */
public interface AttributeMapping extends Mapping {

    /**
     * Returns the value of the '<em><b>From Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From Element</em>' reference.
     * @see #setFromElement(Attribute)
     * @see ca.mcgill.cs.sel.ram.RamPackage#getAttributeMapping_FromElement()
     * @model required="true"
     * @generated
     */
    Attribute getFromElement();

    /**
     * Sets the value of the '{@link ca.mcgill.cs.sel.ram.AttributeMapping#getFromElement <em>From Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From Element</em>' reference.
     * @see #getFromElement()
     * @generated
     */
    void setFromElement(Attribute value);

    /**
     * Returns the value of the '<em><b>To Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>To Element</em>' reference.
     * @see #setToElement(Attribute)
     * @see ca.mcgill.cs.sel.ram.RamPackage#getAttributeMapping_ToElement()
     * @model required="true"
     * @generated
     */
    Attribute getToElement();

    /**
     * Sets the value of the '{@link ca.mcgill.cs.sel.ram.AttributeMapping#getToElement <em>To Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To Element</em>' reference.
     * @see #getToElement()
     * @generated
     */
    void setToElement(Attribute value);
} // AttributeMapping
