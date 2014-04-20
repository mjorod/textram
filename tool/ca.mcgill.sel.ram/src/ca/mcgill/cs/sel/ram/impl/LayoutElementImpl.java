/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ca.mcgill.cs.sel.ram.impl;

import ca.mcgill.cs.sel.ram.LayoutElement;
import ca.mcgill.cs.sel.ram.RamPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.mcgill.cs.sel.ram.impl.LayoutElementImpl#getX <em>X</em>}</li>
 *   <li>{@link ca.mcgill.cs.sel.ram.impl.LayoutElementImpl#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutElementImpl extends EObjectImpl implements LayoutElement {
    /**
     * The default value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected static final float X_EDEFAULT = 0.0F;
    /**
     * The cached value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected float x = X_EDEFAULT;
    /**
     * The default value of the '{@link #getY() <em>Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY()
     * @generated
     * @ordered
     */
    protected static final float Y_EDEFAULT = 0.0F;
    /**
     * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY()
     * @generated
     * @ordered
     */
    protected float y = Y_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LayoutElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RamPackage.Literals.LAYOUT_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public float getX() {
        return x;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setX(float newX) {
        float oldX = x;
        x = newX;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.LAYOUT_ELEMENT__X, oldX, x));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public float getY() {
        return y;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setY(float newY) {
        float oldY = y;
        y = newY;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RamPackage.LAYOUT_ELEMENT__Y, oldY, y));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RamPackage.LAYOUT_ELEMENT__X:
                return getX();
            case RamPackage.LAYOUT_ELEMENT__Y:
                return getY();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case RamPackage.LAYOUT_ELEMENT__X:
                setX((Float)newValue);
                return;
            case RamPackage.LAYOUT_ELEMENT__Y:
                setY((Float)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case RamPackage.LAYOUT_ELEMENT__X:
                setX(X_EDEFAULT);
                return;
            case RamPackage.LAYOUT_ELEMENT__Y:
                setY(Y_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case RamPackage.LAYOUT_ELEMENT__X:
                return x != X_EDEFAULT;
            case RamPackage.LAYOUT_ELEMENT__Y:
                return y != Y_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (x: ");
        result.append(x);
        result.append(", y: ");
        result.append(y);
        result.append(')');
        return result.toString();
    }

} //LayoutElementImpl
