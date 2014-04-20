/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ca.mcgill.cs.sel.ram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REnum Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.mcgill.cs.sel.ram.REnumLiteral#getEnum <em>Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.mcgill.cs.sel.ram.RamPackage#getREnumLiteral()
 * @model
 * @generated
 */
public interface REnumLiteral extends NamedElement {
	/**
     * Returns the value of the '<em><b>Enum</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link ca.mcgill.cs.sel.ram.REnum#getLiterals <em>Literals</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enum</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enum</em>' container reference.
     * @see #setEnum(REnum)
     * @see ca.mcgill.cs.sel.ram.RamPackage#getREnumLiteral_Enum()
     * @see ca.mcgill.cs.sel.ram.REnum#getLiterals
     * @model opposite="literals" required="true" transient="false"
     * @generated
     */
    REnum getEnum();

    /**
     * Sets the value of the '{@link ca.mcgill.cs.sel.ram.REnumLiteral#getEnum <em>Enum</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enum</em>' container reference.
     * @see #getEnum()
     * @generated
     */
    void setEnum(REnum value);

} // REnumLiteral
