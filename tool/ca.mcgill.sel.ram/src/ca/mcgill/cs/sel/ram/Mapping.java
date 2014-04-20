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
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.mcgill.cs.sel.ram.RamPackage#getMapping()
 * @model abstract="true"
 * @generated
 */
public interface Mapping extends EObject {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" required="true"
     *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='null'"
     * @generated
     */
    MappableElement getFromElement();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" required="true"
     *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='null'"
     * @generated
     */
    MappableElement getToElement();

} // Mapping
