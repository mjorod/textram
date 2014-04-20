/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ca.mcgill.cs.sel.ram.impl;

import ca.mcgill.cs.sel.ram.MappableElement;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ca.mcgill.cs.sel.ram.Mapping;
import ca.mcgill.cs.sel.ram.RamPackage;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.WrappedException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class MappingImpl extends EObjectImpl implements Mapping {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MappingImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return RamPackage.Literals.MAPPING;
    }

    /**
     * The cached invocation delegate for the '{@link #getFromElement() <em>Get From Element</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromElement()
     * @generated
     * @ordered
     */
    protected static final EOperation.Internal.InvocationDelegate GET_FROM_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)RamPackage.Literals.MAPPING.getEOperations().get(0)).getInvocationDelegate();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MappableElement getFromElement() {
        try {
            return (MappableElement)GET_FROM_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
        }
        catch (InvocationTargetException ite) {
            throw new WrappedException(ite);
        }
    }

    /**
     * The cached invocation delegate for the '{@link #getToElement() <em>Get To Element</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToElement()
     * @generated
     * @ordered
     */
    protected static final EOperation.Internal.InvocationDelegate GET_TO_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)RamPackage.Literals.MAPPING.getEOperations().get(1)).getInvocationDelegate();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MappableElement getToElement() {
        try {
            return (MappableElement)GET_TO_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
        }
        catch (InvocationTargetException ite) {
            throw new WrappedException(ite);
        }
    }

} //MappingImpl
