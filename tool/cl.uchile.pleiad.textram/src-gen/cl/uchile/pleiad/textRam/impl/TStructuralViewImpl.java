/**
 */
package cl.uchile.pleiad.textRam.impl;

import ca.mcgill.cs.sel.ram.impl.StructuralViewImpl;

import cl.uchile.pleiad.textRam.TAssociation;
import cl.uchile.pleiad.textRam.TStructuralView;
import cl.uchile.pleiad.textRam.TextRamPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TStructural View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TStructuralViewImpl#getTAssociations <em>TAssociations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TStructuralViewImpl extends StructuralViewImpl implements TStructuralView
{
  /**
   * The cached value of the '{@link #getTAssociations() <em>TAssociations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTAssociations()
   * @generated
   * @ordered
   */
  protected EList<TAssociation> tAssociations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TStructuralViewImpl()
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
    return TextRamPackage.Literals.TSTRUCTURAL_VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TAssociation> getTAssociations()
  {
    if (tAssociations == null)
    {
      tAssociations = new EObjectContainmentEList<TAssociation>(TAssociation.class, this, TextRamPackage.TSTRUCTURAL_VIEW__TASSOCIATIONS);
    }
    return tAssociations;
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
      case TextRamPackage.TSTRUCTURAL_VIEW__TASSOCIATIONS:
        return ((InternalEList<?>)getTAssociations()).basicRemove(otherEnd, msgs);
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
      case TextRamPackage.TSTRUCTURAL_VIEW__TASSOCIATIONS:
        return getTAssociations();
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
      case TextRamPackage.TSTRUCTURAL_VIEW__TASSOCIATIONS:
        getTAssociations().clear();
        getTAssociations().addAll((Collection<? extends TAssociation>)newValue);
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
      case TextRamPackage.TSTRUCTURAL_VIEW__TASSOCIATIONS:
        getTAssociations().clear();
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
      case TextRamPackage.TSTRUCTURAL_VIEW__TASSOCIATIONS:
        return tAssociations != null && !tAssociations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TStructuralViewImpl
