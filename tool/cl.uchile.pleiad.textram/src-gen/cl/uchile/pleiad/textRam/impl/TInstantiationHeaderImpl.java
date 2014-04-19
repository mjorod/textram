/**
 */
package cl.uchile.pleiad.textRam.impl;

import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.InstantiationType;

import cl.uchile.pleiad.textRam.TInstantiationHeader;
import cl.uchile.pleiad.textRam.TextRamPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TInstantiation Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TInstantiationHeaderImpl#getType <em>Type</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TInstantiationHeaderImpl#getExternalAspects <em>External Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TInstantiationHeaderImpl extends MinimalEObjectImpl.Container implements TInstantiationHeader
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final InstantiationType TYPE_EDEFAULT = InstantiationType.DEPENDS;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected InstantiationType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getExternalAspects() <em>External Aspects</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternalAspects()
   * @generated
   * @ordered
   */
  protected EList<Aspect> externalAspects;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TInstantiationHeaderImpl()
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
    return TextRamPackage.Literals.TINSTANTIATION_HEADER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstantiationType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(InstantiationType newType)
  {
    InstantiationType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TINSTANTIATION_HEADER__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Aspect> getExternalAspects()
  {
    if (externalAspects == null)
    {
      externalAspects = new EObjectResolvingEList<Aspect>(Aspect.class, this, TextRamPackage.TINSTANTIATION_HEADER__EXTERNAL_ASPECTS);
    }
    return externalAspects;
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
      case TextRamPackage.TINSTANTIATION_HEADER__TYPE:
        return getType();
      case TextRamPackage.TINSTANTIATION_HEADER__EXTERNAL_ASPECTS:
        return getExternalAspects();
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
      case TextRamPackage.TINSTANTIATION_HEADER__TYPE:
        setType((InstantiationType)newValue);
        return;
      case TextRamPackage.TINSTANTIATION_HEADER__EXTERNAL_ASPECTS:
        getExternalAspects().clear();
        getExternalAspects().addAll((Collection<? extends Aspect>)newValue);
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
      case TextRamPackage.TINSTANTIATION_HEADER__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case TextRamPackage.TINSTANTIATION_HEADER__EXTERNAL_ASPECTS:
        getExternalAspects().clear();
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
      case TextRamPackage.TINSTANTIATION_HEADER__TYPE:
        return type != TYPE_EDEFAULT;
      case TextRamPackage.TINSTANTIATION_HEADER__EXTERNAL_ASPECTS:
        return externalAspects != null && !externalAspects.isEmpty();
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //TInstantiationHeaderImpl
