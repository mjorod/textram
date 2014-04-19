/**
 */
package cl.uchile.pleiad.textRam.impl;

import ca.mcgill.cs.sel.ram.Attribute;
import ca.mcgill.cs.sel.ram.Classifier;
import ca.mcgill.cs.sel.ram.RamPackage;

import ca.mcgill.cs.sel.ram.impl.ClassifierImpl;

import cl.uchile.pleiad.textRam.TClass;
import cl.uchile.pleiad.textRam.TClassMember;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TClassImpl#isPartial <em>Partial</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TClassImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TClassImpl#isPartialSuperType <em>Partial Super Type</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TClassImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TClassImpl extends ClassifierImpl implements TClass
{
  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The default value of the '{@link #isPartial() <em>Partial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartial()
   * @generated
   * @ordered
   */
  protected static final boolean PARTIAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPartial() <em>Partial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartial()
   * @generated
   * @ordered
   */
  protected boolean partial = PARTIAL_EDEFAULT;

  /**
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected boolean abstract_ = ABSTRACT_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperTypes()
   * @generated
   * @ordered
   */
  protected EList<Classifier> superTypes;

  /**
   * The default value of the '{@link #isPartialSuperType() <em>Partial Super Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartialSuperType()
   * @generated
   * @ordered
   */
  protected static final boolean PARTIAL_SUPER_TYPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPartialSuperType() <em>Partial Super Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartialSuperType()
   * @generated
   * @ordered
   */
  protected boolean partialSuperType = PARTIAL_SUPER_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<TClassMember> members;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TClassImpl()
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
    return TextRamPackage.Literals.TCLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, TextRamPackage.TCLASS__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPartial()
  {
    return partial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartial(boolean newPartial)
  {
    boolean oldPartial = partial;
    partial = newPartial;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TCLASS__PARTIAL, oldPartial, partial));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(boolean newAbstract)
  {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TCLASS__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Classifier> getSuperTypes()
  {
    if (superTypes == null)
    {
      superTypes = new EObjectResolvingEList<Classifier>(Classifier.class, this, TextRamPackage.TCLASS__SUPER_TYPES);
    }
    return superTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPartialSuperType()
  {
    return partialSuperType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartialSuperType(boolean newPartialSuperType)
  {
    boolean oldPartialSuperType = partialSuperType;
    partialSuperType = newPartialSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TCLASS__PARTIAL_SUPER_TYPE, oldPartialSuperType, partialSuperType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TClassMember> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<TClassMember>(TClassMember.class, this, TextRamPackage.TCLASS__MEMBERS);
    }
    return members;
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
      case TextRamPackage.TCLASS__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case TextRamPackage.TCLASS__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
      case TextRamPackage.TCLASS__ATTRIBUTES:
        return getAttributes();
      case TextRamPackage.TCLASS__PARTIAL:
        return isPartial();
      case TextRamPackage.TCLASS__ABSTRACT:
        return isAbstract();
      case TextRamPackage.TCLASS__SUPER_TYPES:
        return getSuperTypes();
      case TextRamPackage.TCLASS__PARTIAL_SUPER_TYPE:
        return isPartialSuperType();
      case TextRamPackage.TCLASS__MEMBERS:
        return getMembers();
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
      case TextRamPackage.TCLASS__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case TextRamPackage.TCLASS__PARTIAL:
        setPartial((Boolean)newValue);
        return;
      case TextRamPackage.TCLASS__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case TextRamPackage.TCLASS__SUPER_TYPES:
        getSuperTypes().clear();
        getSuperTypes().addAll((Collection<? extends Classifier>)newValue);
        return;
      case TextRamPackage.TCLASS__PARTIAL_SUPER_TYPE:
        setPartialSuperType((Boolean)newValue);
        return;
      case TextRamPackage.TCLASS__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends TClassMember>)newValue);
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
      case TextRamPackage.TCLASS__ATTRIBUTES:
        getAttributes().clear();
        return;
      case TextRamPackage.TCLASS__PARTIAL:
        setPartial(PARTIAL_EDEFAULT);
        return;
      case TextRamPackage.TCLASS__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case TextRamPackage.TCLASS__SUPER_TYPES:
        getSuperTypes().clear();
        return;
      case TextRamPackage.TCLASS__PARTIAL_SUPER_TYPE:
        setPartialSuperType(PARTIAL_SUPER_TYPE_EDEFAULT);
        return;
      case TextRamPackage.TCLASS__MEMBERS:
        getMembers().clear();
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
      case TextRamPackage.TCLASS__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case TextRamPackage.TCLASS__PARTIAL:
        return partial != PARTIAL_EDEFAULT;
      case TextRamPackage.TCLASS__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case TextRamPackage.TCLASS__SUPER_TYPES:
        return superTypes != null && !superTypes.isEmpty();
      case TextRamPackage.TCLASS__PARTIAL_SUPER_TYPE:
        return partialSuperType != PARTIAL_SUPER_TYPE_EDEFAULT;
      case TextRamPackage.TCLASS__MEMBERS:
        return members != null && !members.isEmpty();
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
    if (baseClass == ca.mcgill.cs.sel.ram.Class.class)
    {
      switch (derivedFeatureID)
      {
        case TextRamPackage.TCLASS__ATTRIBUTES: return RamPackage.CLASS__ATTRIBUTES;
        case TextRamPackage.TCLASS__PARTIAL: return RamPackage.CLASS__PARTIAL;
        case TextRamPackage.TCLASS__ABSTRACT: return RamPackage.CLASS__ABSTRACT;
        case TextRamPackage.TCLASS__SUPER_TYPES: return RamPackage.CLASS__SUPER_TYPES;
        default: return -1;
      }
    }
    if (baseClass == TTypedElement.class)
    {
      switch (derivedFeatureID)
      {
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
    if (baseClass == ca.mcgill.cs.sel.ram.Class.class)
    {
      switch (baseFeatureID)
      {
        case RamPackage.CLASS__ATTRIBUTES: return TextRamPackage.TCLASS__ATTRIBUTES;
        case RamPackage.CLASS__PARTIAL: return TextRamPackage.TCLASS__PARTIAL;
        case RamPackage.CLASS__ABSTRACT: return TextRamPackage.TCLASS__ABSTRACT;
        case RamPackage.CLASS__SUPER_TYPES: return TextRamPackage.TCLASS__SUPER_TYPES;
        default: return -1;
      }
    }
    if (baseClass == TTypedElement.class)
    {
      switch (baseFeatureID)
      {
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
    result.append(" (partial: ");
    result.append(partial);
    result.append(", abstract: ");
    result.append(abstract_);
    result.append(", partialSuperType: ");
    result.append(partialSuperType);
    result.append(')');
    return result.toString();
  }

} //TClassImpl
