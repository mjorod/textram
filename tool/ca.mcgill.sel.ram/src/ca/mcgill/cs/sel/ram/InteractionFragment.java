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
 * A representation of the model object '<em><b>Interaction Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.mcgill.cs.sel.ram.InteractionFragment#getCovered <em>Covered</em>}</li>
 *   <li>{@link ca.mcgill.cs.sel.ram.InteractionFragment#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.mcgill.cs.sel.ram.RamPackage#getInteractionFragment()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validCoveredMultiplicity'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot validCoveredMultiplicity='if not self.oclIsTypeOf(CombinedFragment) and covered->notEmpty() then covered->size() = 1 else true endif' validCoveredMultiplicity$message='\'InteractionFragment may only have one Lifeline it covers (except CombinedFragment)\''"
 * @generated
 */
public interface InteractionFragment extends EObject {

    /**
     * Returns the value of the '<em><b>Covered</b></em>' reference list.
     * The list contents are of type {@link ca.mcgill.cs.sel.ram.Lifeline}.
     * It is bidirectional and its opposite is '{@link ca.mcgill.cs.sel.ram.Lifeline#getCoveredBy <em>Covered By</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Covered</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Covered</em>' reference list.
     * @see ca.mcgill.cs.sel.ram.RamPackage#getInteractionFragment_Covered()
     * @see ca.mcgill.cs.sel.ram.Lifeline#getCoveredBy
     * @model opposite="coveredBy" required="true" ordered="false"
     * @generated
     */
    EList<Lifeline> getCovered();

    /**
     * Returns the value of the '<em><b>Container</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link ca.mcgill.cs.sel.ram.FragmentContainer#getFragments <em>Fragments</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Container</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Container</em>' container reference.
     * @see #setContainer(FragmentContainer)
     * @see ca.mcgill.cs.sel.ram.RamPackage#getInteractionFragment_Container()
     * @see ca.mcgill.cs.sel.ram.FragmentContainer#getFragments
     * @model opposite="fragments" required="true" transient="false"
     * @generated
     */
    FragmentContainer getContainer();

    /**
     * Sets the value of the '{@link ca.mcgill.cs.sel.ram.InteractionFragment#getContainer <em>Container</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container</em>' container reference.
     * @see #getContainer()
     * @generated
     */
    void setContainer(FragmentContainer value);
} // InteractionFragment
