/**
 */
package cl.uchile.pleiad.textRam.impl;

import cl.uchile.pleiad.textRam.TMessage;
import cl.uchile.pleiad.textRam.TOperation;
import cl.uchile.pleiad.textRam.TValueSpecification;
import cl.uchile.pleiad.textRam.TextRamPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMessage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TMessageImpl#isPartialOperation <em>Partial Operation</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TMessageImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TMessageImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TMessageImpl extends TAbstractMessageImpl implements TMessage
{
  /**
   * The default value of the '{@link #isPartialOperation() <em>Partial Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartialOperation()
   * @generated
   * @ordered
   */
  protected static final boolean PARTIAL_OPERATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPartialOperation() <em>Partial Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartialOperation()
   * @generated
   * @ordered
   */
  protected boolean partialOperation = PARTIAL_OPERATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getSignature() <em>Signature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignature()
   * @generated
   * @ordered
   */
  protected TOperation signature;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<TValueSpecification> arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TMessageImpl()
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
    return TextRamPackage.Literals.TMESSAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPartialOperation()
  {
    return partialOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartialOperation(boolean newPartialOperation)
  {
    boolean oldPartialOperation = partialOperation;
    partialOperation = newPartialOperation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TMESSAGE__PARTIAL_OPERATION, oldPartialOperation, partialOperation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TOperation getSignature()
  {
    if (signature != null && signature.eIsProxy())
    {
      InternalEObject oldSignature = (InternalEObject)signature;
      signature = (TOperation)eResolveProxy(oldSignature);
      if (signature != oldSignature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextRamPackage.TMESSAGE__SIGNATURE, oldSignature, signature));
      }
    }
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TOperation basicGetSignature()
  {
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignature(TOperation newSignature)
  {
    TOperation oldSignature = signature;
    signature = newSignature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TMESSAGE__SIGNATURE, oldSignature, signature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TValueSpecification> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectResolvingEList<TValueSpecification>(TValueSpecification.class, this, TextRamPackage.TMESSAGE__ARGUMENTS);
    }
    return arguments;
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
      case TextRamPackage.TMESSAGE__PARTIAL_OPERATION:
        return isPartialOperation();
      case TextRamPackage.TMESSAGE__SIGNATURE:
        if (resolve) return getSignature();
        return basicGetSignature();
      case TextRamPackage.TMESSAGE__ARGUMENTS:
        return getArguments();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TextRamPackage.TMESSAGE__PARTIAL_OPERATION:
        setPartialOperation((Boolean)newValue);
        return;
      case TextRamPackage.TMESSAGE__SIGNATURE:
        setSignature((TOperation)newValue);
        return;
      case TextRamPackage.TMESSAGE__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends TValueSpecification>)newValue);
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
      case TextRamPackage.TMESSAGE__PARTIAL_OPERATION:
        setPartialOperation(PARTIAL_OPERATION_EDEFAULT);
        return;
      case TextRamPackage.TMESSAGE__SIGNATURE:
        setSignature((TOperation)null);
        return;
      case TextRamPackage.TMESSAGE__ARGUMENTS:
        getArguments().clear();
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
      case TextRamPackage.TMESSAGE__PARTIAL_OPERATION:
        return partialOperation != PARTIAL_OPERATION_EDEFAULT;
      case TextRamPackage.TMESSAGE__SIGNATURE:
        return signature != null;
      case TextRamPackage.TMESSAGE__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
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
    result.append(" (partialOperation: ");
    result.append(partialOperation);
    result.append(')');
    return result.toString();
  }

} //TMessageImpl
