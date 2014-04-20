/**
 */
package ca.mcgill.cs.sel.ram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RArray</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.mcgill.cs.sel.ram.RArray#getSize <em>Size</em>}</li>
 *   <li>{@link ca.mcgill.cs.sel.ram.RArray#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.mcgill.cs.sel.ram.RamPackage#getRArray()
 * @model
 * @generated
 */
public interface RArray extends PrimitiveType {
    /**
     * Returns the value of the '<em><b>Size</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Size</em>' attribute.
     * @see #setSize(int)
     * @see ca.mcgill.cs.sel.ram.RamPackage#getRArray_Size()
     * @model default="-1" required="true"
     * @generated
     */
    int getSize();

    /**
     * Sets the value of the '{@link ca.mcgill.cs.sel.ram.RArray#getSize <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Size</em>' attribute.
     * @see #getSize()
     * @generated
     */
    void setSize(int value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(ObjectType)
     * @see ca.mcgill.cs.sel.ram.RamPackage#getRArray_Type()
     * @model required="true"
     * @generated
     */
    ObjectType getType();

    /**
     * Sets the value of the '{@link ca.mcgill.cs.sel.ram.RArray#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(ObjectType value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" required="true"
     *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if (self.type <> null and self.type.name <> null) then if (self.type.oclIsTypeOf(RArray)) then self.type.name.substring(1, self.type.name.indexOf(\'[\') -1) else self.type.name endif + \'[\' + if (self.size >= 0) then self.size.toString() else \'\' endif + \']\' + if (self.type.oclIsTypeOf(RArray)) then self.type.name.substring(self.type.name.indexOf(\'[\'), self.type.name.size()) else \'\' endif else null endif'"
     * @generated
     */
    String getName();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" required="true"
     *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\'java.lang.reflect.Array\''"
     * @generated
     */
    String getInstanceClassName();

} // RArray
