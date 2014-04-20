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
 * A representation of the model object '<em><b>Abstract Message View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.mcgill.cs.sel.ram.AbstractMessageView#getAffectedBy <em>Affected By</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.mcgill.cs.sel.ram.RamPackage#getAbstractMessageView()
 * @model abstract="true"
 * @generated
 */
public interface AbstractMessageView extends EObject {

    /**
     * Returns the value of the '<em><b>Affected By</b></em>' reference list.
     * The list contents are of type {@link ca.mcgill.cs.sel.ram.AspectMessageView}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Affected By</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Affected By</em>' reference list.
     * @see ca.mcgill.cs.sel.ram.RamPackage#getAbstractMessageView_AffectedBy()
     * @model
     * @generated
     */
    EList<AspectMessageView> getAffectedBy();
} // AbstractMessageView
