/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ca.mcgill.cs.sel.ram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.mcgill.cs.sel.ram.Classifier#getOperations <em>Operations</em>}</li>
 *   <li>{@link ca.mcgill.cs.sel.ram.Classifier#getAssociationEnds <em>Association Ends</em>}</li>
 *   <li>{@link ca.mcgill.cs.sel.ram.Classifier#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.mcgill.cs.sel.ram.RamPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends ObjectType {
    /**
     * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
     * The list contents are of type {@link ca.mcgill.cs.sel.ram.Operation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operations</em>' containment reference list.
     * @see ca.mcgill.cs.sel.ram.RamPackage#getClassifier_Operations()
     * @model containment="true"
     * @generated
     */
    EList<Operation> getOperations();

    /**
     * Returns the value of the '<em><b>Association Ends</b></em>' containment reference list.
     * The list contents are of type {@link ca.mcgill.cs.sel.ram.AssociationEnd}.
     * It is bidirectional and its opposite is '{@link ca.mcgill.cs.sel.ram.AssociationEnd#getClassifier <em>Classifier</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Association Ends</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Association Ends</em>' containment reference list.
     * @see ca.mcgill.cs.sel.ram.RamPackage#getClassifier_AssociationEnds()
     * @see ca.mcgill.cs.sel.ram.AssociationEnd#getClassifier
     * @model opposite="classifier" containment="true"
     * @generated
     */
    EList<AssociationEnd> getAssociationEnds();

    /**
     * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
     * The list contents are of type {@link ca.mcgill.cs.sel.ram.TypeParameter}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type Parameters</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type Parameters</em>' containment reference list.
     * @see ca.mcgill.cs.sel.ram.RamPackage#getClassifier_TypeParameters()
     * @model containment="true"
     * @generated
     */
    EList<TypeParameter> getTypeParameters();

} // Classifier
