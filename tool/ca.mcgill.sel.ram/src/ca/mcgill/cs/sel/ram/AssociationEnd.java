/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ca.mcgill.cs.sel.ram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.mcgill.cs.sel.ram.AssociationEnd#isNavigable <em>Navigable</em>}</li>
 *   <li>{@link ca.mcgill.cs.sel.ram.AssociationEnd#getAssoc <em>Assoc</em>}</li>
 *   <li>{@link ca.mcgill.cs.sel.ram.AssociationEnd#getClassifier <em>Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.mcgill.cs.sel.ram.RamPackage#getAssociationEnd()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueName='self.classifier.associationEnds->select(associationEnd : AssociationEnd | associationEnd.name <> null and associationEnd.name <> \'\')->isUnique(name)' uniqueName$message='\'AssociationEnds of a class must be unique\''"
 * @generated
 */
public interface AssociationEnd extends Property {
	/**
     * Returns the value of the '<em><b>Navigable</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Navigable</em>' attribute.
     * @see #setNavigable(boolean)
     * @see ca.mcgill.cs.sel.ram.RamPackage#getAssociationEnd_Navigable()
     * @model default="true"
     * @generated
     */
	boolean isNavigable();

	/**
     * Sets the value of the '{@link ca.mcgill.cs.sel.ram.AssociationEnd#isNavigable <em>Navigable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Navigable</em>' attribute.
     * @see #isNavigable()
     * @generated
     */
	void setNavigable(boolean value);

	/**
     * Returns the value of the '<em><b>Assoc</b></em>' reference.
     * It is bidirectional and its opposite is '{@link ca.mcgill.cs.sel.ram.Association#getEnds <em>Ends</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assoc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Assoc</em>' reference.
     * @see #setAssoc(Association)
     * @see ca.mcgill.cs.sel.ram.RamPackage#getAssociationEnd_Assoc()
     * @see ca.mcgill.cs.sel.ram.Association#getEnds
     * @model opposite="ends" required="true"
     * @generated
     */
	Association getAssoc();

	/**
     * Sets the value of the '{@link ca.mcgill.cs.sel.ram.AssociationEnd#getAssoc <em>Assoc</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Assoc</em>' reference.
     * @see #getAssoc()
     * @generated
     */
	void setAssoc(Association value);

	/**
     * Returns the value of the '<em><b>Classifier</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link ca.mcgill.cs.sel.ram.Classifier#getAssociationEnds <em>Association Ends</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Classifier</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Classifier</em>' container reference.
     * @see #setClassifier(Classifier)
     * @see ca.mcgill.cs.sel.ram.RamPackage#getAssociationEnd_Classifier()
     * @see ca.mcgill.cs.sel.ram.Classifier#getAssociationEnds
     * @model opposite="associationEnds" required="true" transient="false"
     * @generated
     */
    Classifier getClassifier();

    /**
     * Sets the value of the '{@link ca.mcgill.cs.sel.ram.AssociationEnd#getClassifier <em>Classifier</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Classifier</em>' container reference.
     * @see #getClassifier()
     * @generated
     */
    void setClassifier(Classifier value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" required="true"
     *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.assoc.ends->select(end : AssociationEnd | end <> self)->at(1).classifier'"
     * @generated
     */
    Type getType();

} // AssociationEnd
