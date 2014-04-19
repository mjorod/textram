/**
 */
package cl.uchile.pleiad.textRam.impl;

import ca.mcgill.cs.sel.ram.impl.ClassifierMappingImpl;

import cl.uchile.pleiad.textRam.TClassMember;
import cl.uchile.pleiad.textRam.TClassifierMapping;
import cl.uchile.pleiad.textRam.TextRamPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TClassifier Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TClassifierMappingImpl#isPartialFromElement <em>Partial From Element</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TClassifierMappingImpl#getFromMembers <em>From Members</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TClassifierMappingImpl#isPartialToElement <em>Partial To Element</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TClassifierMappingImpl#getToMembers <em>To Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TClassifierMappingImpl extends ClassifierMappingImpl implements TClassifierMapping
{
  /**
   * The default value of the '{@link #isPartialFromElement() <em>Partial From Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartialFromElement()
   * @generated
   * @ordered
   */
  protected static final boolean PARTIAL_FROM_ELEMENT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPartialFromElement() <em>Partial From Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartialFromElement()
   * @generated
   * @ordered
   */
  protected boolean partialFromElement = PARTIAL_FROM_ELEMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getFromMembers() <em>From Members</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromMembers()
   * @generated
   * @ordered
   */
  protected EList<TClassMember> fromMembers;

  /**
   * The default value of the '{@link #isPartialToElement() <em>Partial To Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartialToElement()
   * @generated
   * @ordered
   */
  protected static final boolean PARTIAL_TO_ELEMENT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPartialToElement() <em>Partial To Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartialToElement()
   * @generated
   * @ordered
   */
  protected boolean partialToElement = PARTIAL_TO_ELEMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getToMembers() <em>To Members</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToMembers()
   * @generated
   * @ordered
   */
  protected EList<TClassMember> toMembers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TClassifierMappingImpl()
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
    return TextRamPackage.Literals.TCLASSIFIER_MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPartialFromElement()
  {
    return partialFromElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartialFromElement(boolean newPartialFromElement)
  {
    boolean oldPartialFromElement = partialFromElement;
    partialFromElement = newPartialFromElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TCLASSIFIER_MAPPING__PARTIAL_FROM_ELEMENT, oldPartialFromElement, partialFromElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TClassMember> getFromMembers()
  {
    if (fromMembers == null)
    {
      fromMembers = new EObjectResolvingEList<TClassMember>(TClassMember.class, this, TextRamPackage.TCLASSIFIER_MAPPING__FROM_MEMBERS);
    }
    return fromMembers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPartialToElement()
  {
    return partialToElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartialToElement(boolean newPartialToElement)
  {
    boolean oldPartialToElement = partialToElement;
    partialToElement = newPartialToElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TCLASSIFIER_MAPPING__PARTIAL_TO_ELEMENT, oldPartialToElement, partialToElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TClassMember> getToMembers()
  {
    if (toMembers == null)
    {
      toMembers = new EObjectResolvingEList<TClassMember>(TClassMember.class, this, TextRamPackage.TCLASSIFIER_MAPPING__TO_MEMBERS);
    }
    return toMembers;
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
      case TextRamPackage.TCLASSIFIER_MAPPING__PARTIAL_FROM_ELEMENT:
        return isPartialFromElement();
      case TextRamPackage.TCLASSIFIER_MAPPING__FROM_MEMBERS:
        return getFromMembers();
      case TextRamPackage.TCLASSIFIER_MAPPING__PARTIAL_TO_ELEMENT:
        return isPartialToElement();
      case TextRamPackage.TCLASSIFIER_MAPPING__TO_MEMBERS:
        return getToMembers();
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
      case TextRamPackage.TCLASSIFIER_MAPPING__PARTIAL_FROM_ELEMENT:
        setPartialFromElement((Boolean)newValue);
        return;
      case TextRamPackage.TCLASSIFIER_MAPPING__FROM_MEMBERS:
        getFromMembers().clear();
        getFromMembers().addAll((Collection<? extends TClassMember>)newValue);
        return;
      case TextRamPackage.TCLASSIFIER_MAPPING__PARTIAL_TO_ELEMENT:
        setPartialToElement((Boolean)newValue);
        return;
      case TextRamPackage.TCLASSIFIER_MAPPING__TO_MEMBERS:
        getToMembers().clear();
        getToMembers().addAll((Collection<? extends TClassMember>)newValue);
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
      case TextRamPackage.TCLASSIFIER_MAPPING__PARTIAL_FROM_ELEMENT:
        setPartialFromElement(PARTIAL_FROM_ELEMENT_EDEFAULT);
        return;
      case TextRamPackage.TCLASSIFIER_MAPPING__FROM_MEMBERS:
        getFromMembers().clear();
        return;
      case TextRamPackage.TCLASSIFIER_MAPPING__PARTIAL_TO_ELEMENT:
        setPartialToElement(PARTIAL_TO_ELEMENT_EDEFAULT);
        return;
      case TextRamPackage.TCLASSIFIER_MAPPING__TO_MEMBERS:
        getToMembers().clear();
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
      case TextRamPackage.TCLASSIFIER_MAPPING__PARTIAL_FROM_ELEMENT:
        return partialFromElement != PARTIAL_FROM_ELEMENT_EDEFAULT;
      case TextRamPackage.TCLASSIFIER_MAPPING__FROM_MEMBERS:
        return fromMembers != null && !fromMembers.isEmpty();
      case TextRamPackage.TCLASSIFIER_MAPPING__PARTIAL_TO_ELEMENT:
        return partialToElement != PARTIAL_TO_ELEMENT_EDEFAULT;
      case TextRamPackage.TCLASSIFIER_MAPPING__TO_MEMBERS:
        return toMembers != null && !toMembers.isEmpty();
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
    result.append(" (partialFromElement: ");
    result.append(partialFromElement);
    result.append(", partialToElement: ");
    result.append(partialToElement);
    result.append(')');
    return result.toString();
  }

} //TClassifierMappingImpl
