/**
 */
package cl.uchile.pleiad.textRam.impl;

import ca.mcgill.cs.sel.ram.impl.AspectImpl;

import cl.uchile.pleiad.textRam.TAspect;
import cl.uchile.pleiad.textRam.TInstantiationHeader;
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
 * An implementation of the model object '<em><b>TAspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TAspectImpl#getHeaderInstantiations <em>Header Instantiations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TAspectImpl extends AspectImpl implements TAspect
{
  /**
   * The cached value of the '{@link #getHeaderInstantiations() <em>Header Instantiations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeaderInstantiations()
   * @generated
   * @ordered
   */
  protected EList<TInstantiationHeader> headerInstantiations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TAspectImpl()
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
    return TextRamPackage.Literals.TASPECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TInstantiationHeader> getHeaderInstantiations()
  {
    if (headerInstantiations == null)
    {
      headerInstantiations = new EObjectContainmentEList<TInstantiationHeader>(TInstantiationHeader.class, this, TextRamPackage.TASPECT__HEADER_INSTANTIATIONS);
    }
    return headerInstantiations;
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
      case TextRamPackage.TASPECT__HEADER_INSTANTIATIONS:
        return ((InternalEList<?>)getHeaderInstantiations()).basicRemove(otherEnd, msgs);
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
      case TextRamPackage.TASPECT__HEADER_INSTANTIATIONS:
        return getHeaderInstantiations();
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
      case TextRamPackage.TASPECT__HEADER_INSTANTIATIONS:
        getHeaderInstantiations().clear();
        getHeaderInstantiations().addAll((Collection<? extends TInstantiationHeader>)newValue);
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
      case TextRamPackage.TASPECT__HEADER_INSTANTIATIONS:
        getHeaderInstantiations().clear();
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
      case TextRamPackage.TASPECT__HEADER_INSTANTIATIONS:
        return headerInstantiations != null && !headerInstantiations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TAspectImpl
