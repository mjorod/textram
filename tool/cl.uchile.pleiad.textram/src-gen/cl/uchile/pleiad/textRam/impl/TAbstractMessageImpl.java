/**
 */
package cl.uchile.pleiad.textRam.impl;

import cl.uchile.pleiad.textRam.TAbstractMessage;
import cl.uchile.pleiad.textRam.TMessageAssignableFeature;
import cl.uchile.pleiad.textRam.TextRamPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAbstract Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TAbstractMessageImpl#getAssignTo <em>Assign To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TAbstractMessageImpl extends MinimalEObjectImpl.Container implements TAbstractMessage
{
  /**
   * The cached value of the '{@link #getAssignTo() <em>Assign To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignTo()
   * @generated
   * @ordered
   */
  protected TMessageAssignableFeature assignTo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TAbstractMessageImpl()
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
    return TextRamPackage.Literals.TABSTRACT_MESSAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TMessageAssignableFeature getAssignTo()
  {
    if (assignTo != null && assignTo.eIsProxy())
    {
      InternalEObject oldAssignTo = (InternalEObject)assignTo;
      assignTo = (TMessageAssignableFeature)eResolveProxy(oldAssignTo);
      if (assignTo != oldAssignTo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextRamPackage.TABSTRACT_MESSAGE__ASSIGN_TO, oldAssignTo, assignTo));
      }
    }
    return assignTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TMessageAssignableFeature basicGetAssignTo()
  {
    return assignTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignTo(TMessageAssignableFeature newAssignTo)
  {
    TMessageAssignableFeature oldAssignTo = assignTo;
    assignTo = newAssignTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TABSTRACT_MESSAGE__ASSIGN_TO, oldAssignTo, assignTo));
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
      case TextRamPackage.TABSTRACT_MESSAGE__ASSIGN_TO:
        if (resolve) return getAssignTo();
        return basicGetAssignTo();
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
      case TextRamPackage.TABSTRACT_MESSAGE__ASSIGN_TO:
        setAssignTo((TMessageAssignableFeature)newValue);
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
      case TextRamPackage.TABSTRACT_MESSAGE__ASSIGN_TO:
        setAssignTo((TMessageAssignableFeature)null);
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
      case TextRamPackage.TABSTRACT_MESSAGE__ASSIGN_TO:
        return assignTo != null;
    }
    return super.eIsSet(featureID);
  }

} //TAbstractMessageImpl
