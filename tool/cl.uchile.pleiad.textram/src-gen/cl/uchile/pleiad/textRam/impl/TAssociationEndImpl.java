/**
 */
package cl.uchile.pleiad.textRam.impl;

import cl.uchile.pleiad.textRam.TAssociationEnd;
import cl.uchile.pleiad.textRam.TextRamPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAssociation End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TAssociationEndImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TAssociationEndImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TAssociationEndImpl#getClassReference <em>Class Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TAssociationEndImpl extends MinimalEObjectImpl.Container implements TAssociationEnd
{
  /**
   * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected static final int LOWER_BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected int lowerBound = LOWER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected static final int UPPER_BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected int upperBound = UPPER_BOUND_EDEFAULT;

  /**
   * The cached value of the '{@link #getClassReference() <em>Class Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassReference()
   * @generated
   * @ordered
   */
  protected ca.mcgill.cs.sel.ram.Class classReference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TAssociationEndImpl()
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
    return TextRamPackage.Literals.TASSOCIATION_END;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLowerBound()
  {
    return lowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowerBound(int newLowerBound)
  {
    int oldLowerBound = lowerBound;
    lowerBound = newLowerBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TASSOCIATION_END__LOWER_BOUND, oldLowerBound, lowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getUpperBound()
  {
    return upperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpperBound(int newUpperBound)
  {
    int oldUpperBound = upperBound;
    upperBound = newUpperBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TASSOCIATION_END__UPPER_BOUND, oldUpperBound, upperBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ca.mcgill.cs.sel.ram.Class getClassReference()
  {
    if (classReference != null && classReference.eIsProxy())
    {
      InternalEObject oldClassReference = (InternalEObject)classReference;
      classReference = (ca.mcgill.cs.sel.ram.Class)eResolveProxy(oldClassReference);
      if (classReference != oldClassReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextRamPackage.TASSOCIATION_END__CLASS_REFERENCE, oldClassReference, classReference));
      }
    }
    return classReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ca.mcgill.cs.sel.ram.Class basicGetClassReference()
  {
    return classReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassReference(ca.mcgill.cs.sel.ram.Class newClassReference)
  {
    ca.mcgill.cs.sel.ram.Class oldClassReference = classReference;
    classReference = newClassReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TASSOCIATION_END__CLASS_REFERENCE, oldClassReference, classReference));
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
      case TextRamPackage.TASSOCIATION_END__LOWER_BOUND:
        return getLowerBound();
      case TextRamPackage.TASSOCIATION_END__UPPER_BOUND:
        return getUpperBound();
      case TextRamPackage.TASSOCIATION_END__CLASS_REFERENCE:
        if (resolve) return getClassReference();
        return basicGetClassReference();
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
      case TextRamPackage.TASSOCIATION_END__LOWER_BOUND:
        setLowerBound((Integer)newValue);
        return;
      case TextRamPackage.TASSOCIATION_END__UPPER_BOUND:
        setUpperBound((Integer)newValue);
        return;
      case TextRamPackage.TASSOCIATION_END__CLASS_REFERENCE:
        setClassReference((ca.mcgill.cs.sel.ram.Class)newValue);
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
      case TextRamPackage.TASSOCIATION_END__LOWER_BOUND:
        setLowerBound(LOWER_BOUND_EDEFAULT);
        return;
      case TextRamPackage.TASSOCIATION_END__UPPER_BOUND:
        setUpperBound(UPPER_BOUND_EDEFAULT);
        return;
      case TextRamPackage.TASSOCIATION_END__CLASS_REFERENCE:
        setClassReference((ca.mcgill.cs.sel.ram.Class)null);
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
      case TextRamPackage.TASSOCIATION_END__LOWER_BOUND:
        return lowerBound != LOWER_BOUND_EDEFAULT;
      case TextRamPackage.TASSOCIATION_END__UPPER_BOUND:
        return upperBound != UPPER_BOUND_EDEFAULT;
      case TextRamPackage.TASSOCIATION_END__CLASS_REFERENCE:
        return classReference != null;
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
    result.append(" (lowerBound: ");
    result.append(lowerBound);
    result.append(", upperBound: ");
    result.append(upperBound);
    result.append(')');
    return result.toString();
  }

} //TAssociationEndImpl
