/**
 */
package cl.uchile.pleiad.textRam.impl;

import cl.uchile.pleiad.textRam.TLifeline;
import cl.uchile.pleiad.textRam.TLifelineReferenceType;
import cl.uchile.pleiad.textRam.TMessageAssignableFeature;
import cl.uchile.pleiad.textRam.TTemporaryProperty;
import cl.uchile.pleiad.textRam.TTypedElement;
import cl.uchile.pleiad.textRam.TextRamPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TLifeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TLifelineImpl#getName <em>Name</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TLifelineImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TLifelineImpl#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TLifelineImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TLifelineImpl#getLocalProperties <em>Local Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TLifelineImpl extends TValueSpecificationImpl implements TLifeline
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
   * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStatic()
   * @generated
   * @ordered
   */
  protected static final boolean STATIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStatic()
   * @generated
   * @ordered
   */
  protected boolean static_ = STATIC_EDEFAULT;

  /**
   * The default value of the '{@link #getReferenceType() <em>Reference Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceType()
   * @generated
   * @ordered
   */
  protected static final TLifelineReferenceType REFERENCE_TYPE_EDEFAULT = TLifelineReferenceType.REFERENCE;

  /**
   * The cached value of the '{@link #getReferenceType() <em>Reference Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceType()
   * @generated
   * @ordered
   */
  protected TLifelineReferenceType referenceType = REFERENCE_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRepresents() <em>Represents</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepresents()
   * @generated
   * @ordered
   */
  protected TTypedElement represents;

  /**
   * The cached value of the '{@link #getLocalProperties() <em>Local Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalProperties()
   * @generated
   * @ordered
   */
  protected EList<TTemporaryProperty> localProperties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TLifelineImpl()
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
    return TextRamPackage.Literals.TLIFELINE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TLIFELINE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStatic()
  {
    return static_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatic(boolean newStatic)
  {
    boolean oldStatic = static_;
    static_ = newStatic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TLIFELINE__STATIC, oldStatic, static_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TLifelineReferenceType getReferenceType()
  {
    return referenceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferenceType(TLifelineReferenceType newReferenceType)
  {
    TLifelineReferenceType oldReferenceType = referenceType;
    referenceType = newReferenceType == null ? REFERENCE_TYPE_EDEFAULT : newReferenceType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TLIFELINE__REFERENCE_TYPE, oldReferenceType, referenceType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TTypedElement getRepresents()
  {
    if (represents != null && represents.eIsProxy())
    {
      InternalEObject oldRepresents = (InternalEObject)represents;
      represents = (TTypedElement)eResolveProxy(oldRepresents);
      if (represents != oldRepresents)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextRamPackage.TLIFELINE__REPRESENTS, oldRepresents, represents));
      }
    }
    return represents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TTypedElement basicGetRepresents()
  {
    return represents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepresents(TTypedElement newRepresents)
  {
    TTypedElement oldRepresents = represents;
    represents = newRepresents;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TLIFELINE__REPRESENTS, oldRepresents, represents));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TTemporaryProperty> getLocalProperties()
  {
    if (localProperties == null)
    {
      localProperties = new EObjectContainmentEList<TTemporaryProperty>(TTemporaryProperty.class, this, TextRamPackage.TLIFELINE__LOCAL_PROPERTIES);
    }
    return localProperties;
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
      case TextRamPackage.TLIFELINE__LOCAL_PROPERTIES:
        return ((InternalEList<?>)getLocalProperties()).basicRemove(otherEnd, msgs);
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
      case TextRamPackage.TLIFELINE__NAME:
        return getName();
      case TextRamPackage.TLIFELINE__STATIC:
        return isStatic();
      case TextRamPackage.TLIFELINE__REFERENCE_TYPE:
        return getReferenceType();
      case TextRamPackage.TLIFELINE__REPRESENTS:
        if (resolve) return getRepresents();
        return basicGetRepresents();
      case TextRamPackage.TLIFELINE__LOCAL_PROPERTIES:
        return getLocalProperties();
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
      case TextRamPackage.TLIFELINE__NAME:
        setName((String)newValue);
        return;
      case TextRamPackage.TLIFELINE__STATIC:
        setStatic((Boolean)newValue);
        return;
      case TextRamPackage.TLIFELINE__REFERENCE_TYPE:
        setReferenceType((TLifelineReferenceType)newValue);
        return;
      case TextRamPackage.TLIFELINE__REPRESENTS:
        setRepresents((TTypedElement)newValue);
        return;
      case TextRamPackage.TLIFELINE__LOCAL_PROPERTIES:
        getLocalProperties().clear();
        getLocalProperties().addAll((Collection<? extends TTemporaryProperty>)newValue);
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
      case TextRamPackage.TLIFELINE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TextRamPackage.TLIFELINE__STATIC:
        setStatic(STATIC_EDEFAULT);
        return;
      case TextRamPackage.TLIFELINE__REFERENCE_TYPE:
        setReferenceType(REFERENCE_TYPE_EDEFAULT);
        return;
      case TextRamPackage.TLIFELINE__REPRESENTS:
        setRepresents((TTypedElement)null);
        return;
      case TextRamPackage.TLIFELINE__LOCAL_PROPERTIES:
        getLocalProperties().clear();
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
      case TextRamPackage.TLIFELINE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TextRamPackage.TLIFELINE__STATIC:
        return static_ != STATIC_EDEFAULT;
      case TextRamPackage.TLIFELINE__REFERENCE_TYPE:
        return referenceType != REFERENCE_TYPE_EDEFAULT;
      case TextRamPackage.TLIFELINE__REPRESENTS:
        return represents != null;
      case TextRamPackage.TLIFELINE__LOCAL_PROPERTIES:
        return localProperties != null && !localProperties.isEmpty();
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
        case TextRamPackage.TLIFELINE__NAME: return TextRamPackage.TMESSAGE_ASSIGNABLE_FEATURE__NAME;
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
        case TextRamPackage.TMESSAGE_ASSIGNABLE_FEATURE__NAME: return TextRamPackage.TLIFELINE__NAME;
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
    result.append(", static: ");
    result.append(static_);
    result.append(", referenceType: ");
    result.append(referenceType);
    result.append(')');
    return result.toString();
  }

} //TLifelineImpl
