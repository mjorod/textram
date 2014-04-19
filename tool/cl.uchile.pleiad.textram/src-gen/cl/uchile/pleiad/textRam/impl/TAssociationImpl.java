/**
 */
package cl.uchile.pleiad.textRam.impl;

import ca.mcgill.cs.sel.ram.ReferenceType;

import cl.uchile.pleiad.textRam.TAssociation;
import cl.uchile.pleiad.textRam.TAssociationEnd;
import cl.uchile.pleiad.textRam.TMessageAssignableFeature;
import cl.uchile.pleiad.textRam.TextRamPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAssociation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TAssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TAssociationImpl#getFromEnd <em>From End</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TAssociationImpl#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TAssociationImpl#getToEnd <em>To End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TAssociationImpl extends TTypedElementImpl implements TAssociation
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFromEnd() <em>From End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromEnd()
   * @generated
   * @ordered
   */
  protected TAssociationEnd fromEnd;

  /**
   * The default value of the '{@link #getReferenceType() <em>Reference Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceType()
   * @generated
   * @ordered
   */
  protected static final ReferenceType REFERENCE_TYPE_EDEFAULT = ReferenceType.COMPOSITION;

  /**
   * The cached value of the '{@link #getReferenceType() <em>Reference Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceType()
   * @generated
   * @ordered
   */
  protected ReferenceType referenceType = REFERENCE_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getToEnd() <em>To End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToEnd()
   * @generated
   * @ordered
   */
  protected TAssociationEnd toEnd;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TAssociationImpl()
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
    return TextRamPackage.Literals.TASSOCIATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TASSOCIATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TAssociationEnd getFromEnd()
  {
    return fromEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFromEnd(TAssociationEnd newFromEnd, NotificationChain msgs)
  {
    TAssociationEnd oldFromEnd = fromEnd;
    fromEnd = newFromEnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextRamPackage.TASSOCIATION__FROM_END, oldFromEnd, newFromEnd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromEnd(TAssociationEnd newFromEnd)
  {
    if (newFromEnd != fromEnd)
    {
      NotificationChain msgs = null;
      if (fromEnd != null)
        msgs = ((InternalEObject)fromEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextRamPackage.TASSOCIATION__FROM_END, null, msgs);
      if (newFromEnd != null)
        msgs = ((InternalEObject)newFromEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextRamPackage.TASSOCIATION__FROM_END, null, msgs);
      msgs = basicSetFromEnd(newFromEnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TASSOCIATION__FROM_END, newFromEnd, newFromEnd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceType getReferenceType()
  {
    return referenceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferenceType(ReferenceType newReferenceType)
  {
    ReferenceType oldReferenceType = referenceType;
    referenceType = newReferenceType == null ? REFERENCE_TYPE_EDEFAULT : newReferenceType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TASSOCIATION__REFERENCE_TYPE, oldReferenceType, referenceType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TAssociationEnd getToEnd()
  {
    return toEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetToEnd(TAssociationEnd newToEnd, NotificationChain msgs)
  {
    TAssociationEnd oldToEnd = toEnd;
    toEnd = newToEnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextRamPackage.TASSOCIATION__TO_END, oldToEnd, newToEnd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToEnd(TAssociationEnd newToEnd)
  {
    if (newToEnd != toEnd)
    {
      NotificationChain msgs = null;
      if (toEnd != null)
        msgs = ((InternalEObject)toEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextRamPackage.TASSOCIATION__TO_END, null, msgs);
      if (newToEnd != null)
        msgs = ((InternalEObject)newToEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextRamPackage.TASSOCIATION__TO_END, null, msgs);
      msgs = basicSetToEnd(newToEnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TASSOCIATION__TO_END, newToEnd, newToEnd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TextRamPackage.TASSOCIATION__FROM_END:
        return basicSetFromEnd(null, msgs);
      case TextRamPackage.TASSOCIATION__TO_END:
        return basicSetToEnd(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case TextRamPackage.TASSOCIATION__NAME:
        return getName();
      case TextRamPackage.TASSOCIATION__FROM_END:
        return getFromEnd();
      case TextRamPackage.TASSOCIATION__REFERENCE_TYPE:
        return getReferenceType();
      case TextRamPackage.TASSOCIATION__TO_END:
        return getToEnd();
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
      case TextRamPackage.TASSOCIATION__NAME:
        setName((String)newValue);
        return;
      case TextRamPackage.TASSOCIATION__FROM_END:
        setFromEnd((TAssociationEnd)newValue);
        return;
      case TextRamPackage.TASSOCIATION__REFERENCE_TYPE:
        setReferenceType((ReferenceType)newValue);
        return;
      case TextRamPackage.TASSOCIATION__TO_END:
        setToEnd((TAssociationEnd)newValue);
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
      case TextRamPackage.TASSOCIATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TextRamPackage.TASSOCIATION__FROM_END:
        setFromEnd((TAssociationEnd)null);
        return;
      case TextRamPackage.TASSOCIATION__REFERENCE_TYPE:
        setReferenceType(REFERENCE_TYPE_EDEFAULT);
        return;
      case TextRamPackage.TASSOCIATION__TO_END:
        setToEnd((TAssociationEnd)null);
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
      case TextRamPackage.TASSOCIATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TextRamPackage.TASSOCIATION__FROM_END:
        return fromEnd != null;
      case TextRamPackage.TASSOCIATION__REFERENCE_TYPE:
        return referenceType != REFERENCE_TYPE_EDEFAULT;
      case TextRamPackage.TASSOCIATION__TO_END:
        return toEnd != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == TMessageAssignableFeature.class)
    {
      switch (derivedFeatureID)
      {
        case TextRamPackage.TASSOCIATION__NAME: return TextRamPackage.TMESSAGE_ASSIGNABLE_FEATURE__NAME;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == TMessageAssignableFeature.class)
    {
      switch (baseFeatureID)
      {
        case TextRamPackage.TMESSAGE_ASSIGNABLE_FEATURE__NAME: return TextRamPackage.TASSOCIATION__NAME;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", referenceType: ");
    result.append(referenceType);
    result.append(')');
    return result.toString();
  }

} //TAssociationImpl
