/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ca.mcgill.cs.sel.ram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.mcgill.cs.sel.ram.MessageEnd#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.mcgill.cs.sel.ram.RamPackage#getMessageEnd()
 * @model abstract="true"
 * @generated
 */
public interface MessageEnd extends EObject {
    /**
     * Returns the value of the '<em><b>Message</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message</em>' reference.
     * @see #setMessage(Message)
     * @see ca.mcgill.cs.sel.ram.RamPackage#getMessageEnd_Message()
     * @model required="true"
     * @generated
     */
    Message getMessage();

    /**
     * Sets the value of the '{@link ca.mcgill.cs.sel.ram.MessageEnd#getMessage <em>Message</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message</em>' reference.
     * @see #getMessage()
     * @generated
     */
    void setMessage(Message value);

} // MessageEnd
