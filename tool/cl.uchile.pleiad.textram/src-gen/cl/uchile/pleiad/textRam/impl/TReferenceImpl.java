/**
 */
package cl.uchile.pleiad.textRam.impl;

import cl.uchile.pleiad.textRam.TClass;
import cl.uchile.pleiad.textRam.TReference;
import cl.uchile.pleiad.textRam.TextRamPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TReference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TReferenceImpl#isPartialClass <em>Partial Class</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TReferenceImpl#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TReferenceImpl extends TTemporaryPropertyImpl implements TReference
{
  /**
   * The default value of the '{@link #isPartialClass() <em>Partial Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartialClass()
   * @generated
   * @ordered
   */
  protected static final boolean PARTIAL_CLASS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPartialClass() <em>Partial Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartialClass()
   * @generated
   * @ordered
   */
  protected boolean partialClass = PARTIAL_CLASS_EDEFAULT;

  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected TClass reference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TReferenceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TextRamPackage.Literals.TREFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPartialClass()
  {
    return partialClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartialClass(boolean newPartialClass)
  {
    boolean oldPartialClass = partialClass;
    partialClass = newPartialClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TREFERENCE__PARTIAL_CLASS, oldPartialClass, partialClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TClass getReference()
  {
    if (reference != null && reference.eIsProxy())
    {
      InternalEObject oldReference = (InternalEObject)reference;
      reference = (TClass)eResolveProxy(oldReference);
      if (reference != oldReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextRamPackage.TREFERENCE__REFERENCE, oldReference, reference));
      }
    }
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TClass basicGetReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(TClass newReference)
  {
    TClass oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TREFERENCE__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TextRamPackage.TREFERENCE__PARTIAL_CLASS:
        return isPartialClass();
      case TextRamPackage.TREFERENCE__REFERENCE:
        if (resolve) return getReference();
        return basicGetReference();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TextRamPackage.TREFERENCE__PARTIAL_CLASS:
        setPartialClass((Boolean)newValue);
        return;
      case TextRamPackage.TREFERENCE__REFERENCE:
        setReference((TClass)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TextRamPackage.TREFERENCE__PARTIAL_CLASS:
        setPartialClass(PARTIAL_CLASS_EDEFAULT);
        return;
      case TextRamPackage.TREFERENCE__REFERENCE:
        setReference((TClass)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TextRamPackage.TREFERENCE__PARTIAL_CLASS:
        return partialClass != PARTIAL_CLASS_EDEFAULT;
      case TextRamPackage.TREFERENCE__REFERENCE:
        return reference != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (partialClass: ");
    result.append(partialClass);
    result.append(')');
    return result.toString();
  }

} //TReferenceImpl
