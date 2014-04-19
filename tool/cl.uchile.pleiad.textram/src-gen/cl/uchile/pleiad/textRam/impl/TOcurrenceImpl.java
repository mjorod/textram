/**
 */
package cl.uchile.pleiad.textRam.impl;

import cl.uchile.pleiad.textRam.OcurrenceType;
import cl.uchile.pleiad.textRam.TLifeline;
import cl.uchile.pleiad.textRam.TOcurrence;
import cl.uchile.pleiad.textRam.TextRamPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TOcurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TOcurrenceImpl#getLeftLifeline <em>Left Lifeline</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TOcurrenceImpl#getOcurrenceType <em>Ocurrence Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TOcurrenceImpl extends TInteractionImpl implements TOcurrence
{
  /**
   * The cached value of the '{@link #getLeftLifeline() <em>Left Lifeline</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftLifeline()
   * @generated
   * @ordered
   */
  protected TLifeline leftLifeline;

  /**
   * The default value of the '{@link #getOcurrenceType() <em>Ocurrence Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOcurrenceType()
   * @generated
   * @ordered
   */
  protected static final OcurrenceType OCURRENCE_TYPE_EDEFAULT = OcurrenceType.ORIGINAL;

  /**
   * The cached value of the '{@link #getOcurrenceType() <em>Ocurrence Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOcurrenceType()
   * @generated
   * @ordered
   */
  protected OcurrenceType ocurrenceType = OCURRENCE_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TOcurrenceImpl()
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
    return TextRamPackage.Literals.TOCURRENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TLifeline getLeftLifeline()
  {
    if (leftLifeline != null && leftLifeline.eIsProxy())
    {
      InternalEObject oldLeftLifeline = (InternalEObject)leftLifeline;
      leftLifeline = (TLifeline)eResolveProxy(oldLeftLifeline);
      if (leftLifeline != oldLeftLifeline)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextRamPackage.TOCURRENCE__LEFT_LIFELINE, oldLeftLifeline, leftLifeline));
      }
    }
    return leftLifeline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TLifeline basicGetLeftLifeline()
  {
    return leftLifeline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftLifeline(TLifeline newLeftLifeline)
  {
    TLifeline oldLeftLifeline = leftLifeline;
    leftLifeline = newLeftLifeline;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TOCURRENCE__LEFT_LIFELINE, oldLeftLifeline, leftLifeline));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OcurrenceType getOcurrenceType()
  {
    return ocurrenceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOcurrenceType(OcurrenceType newOcurrenceType)
  {
    OcurrenceType oldOcurrenceType = ocurrenceType;
    ocurrenceType = newOcurrenceType == null ? OCURRENCE_TYPE_EDEFAULT : newOcurrenceType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TOCURRENCE__OCURRENCE_TYPE, oldOcurrenceType, ocurrenceType));
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
      case TextRamPackage.TOCURRENCE__LEFT_LIFELINE:
        if (resolve) return getLeftLifeline();
        return basicGetLeftLifeline();
      case TextRamPackage.TOCURRENCE__OCURRENCE_TYPE:
        return getOcurrenceType();
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
      case TextRamPackage.TOCURRENCE__LEFT_LIFELINE:
        setLeftLifeline((TLifeline)newValue);
        return;
      case TextRamPackage.TOCURRENCE__OCURRENCE_TYPE:
        setOcurrenceType((OcurrenceType)newValue);
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
      case TextRamPackage.TOCURRENCE__LEFT_LIFELINE:
        setLeftLifeline((TLifeline)null);
        return;
      case TextRamPackage.TOCURRENCE__OCURRENCE_TYPE:
        setOcurrenceType(OCURRENCE_TYPE_EDEFAULT);
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
      case TextRamPackage.TOCURRENCE__LEFT_LIFELINE:
        return leftLifeline != null;
      case TextRamPackage.TOCURRENCE__OCURRENCE_TYPE:
        return ocurrenceType != OCURRENCE_TYPE_EDEFAULT;
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
    result.append(" (ocurrenceType: ");
    result.append(ocurrenceType);
    result.append(')');
    return result.toString();
  }

} //TOcurrenceImpl
