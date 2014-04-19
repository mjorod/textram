/**
 */
package cl.uchile.pleiad.textRam.impl;

import cl.uchile.pleiad.textRam.TAspectMessageView;
import cl.uchile.pleiad.textRam.TMessageView;
import cl.uchile.pleiad.textRam.TextRamPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMessage View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TMessageViewImpl#getAffectedBy <em>Affected By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TMessageViewImpl extends TAbstractMessagesImpl implements TMessageView
{
  /**
   * The cached value of the '{@link #getAffectedBy() <em>Affected By</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAffectedBy()
   * @generated
   * @ordered
   */
  protected EList<TAspectMessageView> affectedBy;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TMessageViewImpl()
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
    return TextRamPackage.Literals.TMESSAGE_VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TAspectMessageView> getAffectedBy()
  {
    if (affectedBy == null)
    {
      affectedBy = new EObjectResolvingEList<TAspectMessageView>(TAspectMessageView.class, this, TextRamPackage.TMESSAGE_VIEW__AFFECTED_BY);
    }
    return affectedBy;
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
      case TextRamPackage.TMESSAGE_VIEW__AFFECTED_BY:
        return getAffectedBy();
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
      case TextRamPackage.TMESSAGE_VIEW__AFFECTED_BY:
        getAffectedBy().clear();
        getAffectedBy().addAll((Collection<? extends TAspectMessageView>)newValue);
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
      case TextRamPackage.TMESSAGE_VIEW__AFFECTED_BY:
        getAffectedBy().clear();
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
      case TextRamPackage.TMESSAGE_VIEW__AFFECTED_BY:
        return affectedBy != null && !affectedBy.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TMessageViewImpl
