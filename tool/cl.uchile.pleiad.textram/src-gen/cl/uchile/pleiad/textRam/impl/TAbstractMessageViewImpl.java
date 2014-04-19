/**
 */
package cl.uchile.pleiad.textRam.impl;

import ca.mcgill.cs.sel.ram.impl.AbstractMessageViewImpl;

import cl.uchile.pleiad.textRam.TAbstractMessageView;
import cl.uchile.pleiad.textRam.TAbstractMessages;
import cl.uchile.pleiad.textRam.TLifeline;
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
 * An implementation of the model object '<em><b>TAbstract Message View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TAbstractMessageViewImpl#getLifelines <em>Lifelines</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TAbstractMessageViewImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TAbstractMessageViewImpl extends AbstractMessageViewImpl implements TAbstractMessageView
{
  /**
   * The cached value of the '{@link #getLifelines() <em>Lifelines</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLifelines()
   * @generated
   * @ordered
   */
  protected EList<TLifeline> lifelines;

  /**
   * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessages()
   * @generated
   * @ordered
   */
  protected EList<TAbstractMessages> messages;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TAbstractMessageViewImpl()
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
    return TextRamPackage.Literals.TABSTRACT_MESSAGE_VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TLifeline> getLifelines()
  {
    if (lifelines == null)
    {
      lifelines = new EObjectContainmentEList<TLifeline>(TLifeline.class, this, TextRamPackage.TABSTRACT_MESSAGE_VIEW__LIFELINES);
    }
    return lifelines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TAbstractMessages> getMessages()
  {
    if (messages == null)
    {
      messages = new EObjectContainmentEList<TAbstractMessages>(TAbstractMessages.class, this, TextRamPackage.TABSTRACT_MESSAGE_VIEW__MESSAGES);
    }
    return messages;
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
      case TextRamPackage.TABSTRACT_MESSAGE_VIEW__LIFELINES:
        return ((InternalEList<?>)getLifelines()).basicRemove(otherEnd, msgs);
      case TextRamPackage.TABSTRACT_MESSAGE_VIEW__MESSAGES:
        return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
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
      case TextRamPackage.TABSTRACT_MESSAGE_VIEW__LIFELINES:
        return getLifelines();
      case TextRamPackage.TABSTRACT_MESSAGE_VIEW__MESSAGES:
        return getMessages();
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
      case TextRamPackage.TABSTRACT_MESSAGE_VIEW__LIFELINES:
        getLifelines().clear();
        getLifelines().addAll((Collection<? extends TLifeline>)newValue);
        return;
      case TextRamPackage.TABSTRACT_MESSAGE_VIEW__MESSAGES:
        getMessages().clear();
        getMessages().addAll((Collection<? extends TAbstractMessages>)newValue);
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
      case TextRamPackage.TABSTRACT_MESSAGE_VIEW__LIFELINES:
        getLifelines().clear();
        return;
      case TextRamPackage.TABSTRACT_MESSAGE_VIEW__MESSAGES:
        getMessages().clear();
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
      case TextRamPackage.TABSTRACT_MESSAGE_VIEW__LIFELINES:
        return lifelines != null && !lifelines.isEmpty();
      case TextRamPackage.TABSTRACT_MESSAGE_VIEW__MESSAGES:
        return messages != null && !messages.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TAbstractMessageViewImpl
