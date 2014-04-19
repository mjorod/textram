/**
 */
package cl.uchile.pleiad.textRam.impl;

import cl.uchile.pleiad.textRam.TAbstractMessage;
import cl.uchile.pleiad.textRam.TInteractionMessage;
import cl.uchile.pleiad.textRam.TLifeline;
import cl.uchile.pleiad.textRam.TextRamPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TInteraction Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TInteractionMessageImpl#getLeftLifeline <em>Left Lifeline</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TInteractionMessageImpl#isCreate <em>Create</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TInteractionMessageImpl#getRightLifeline <em>Right Lifeline</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TInteractionMessageImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TInteractionMessageImpl extends TInteractionImpl implements TInteractionMessage
{
  /**
   * The cached value of the '{@link #getLeftLifeline() <em>Left Lifeline</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftLifeline()
   * @generated
   * @ordered
   */
  protected TLifeline leftLifeline;

  /**
   * The default value of the '{@link #isCreate() <em>Create</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCreate()
   * @generated
   * @ordered
   */
  protected static final boolean CREATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCreate() <em>Create</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCreate()
   * @generated
   * @ordered
   */
  protected boolean create = CREATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRightLifeline() <em>Right Lifeline</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightLifeline()
   * @generated
   * @ordered
   */
  protected TLifeline rightLifeline;

  /**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected TAbstractMessage message;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TInteractionMessageImpl()
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
    return TextRamPackage.Literals.TINTERACTION_MESSAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TLifeline getLeftLifeline()
  {
    if (leftLifeline != null && leftLifeline.eIsProxy())
    {
      InternalEObject oldLeftLifeline = (InternalEObject)leftLifeline;
      leftLifeline = (TLifeline)eResolveProxy(oldLeftLifeline);
      if (leftLifeline != oldLeftLifeline)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextRamPackage.TINTERACTION_MESSAGE__LEFT_LIFELINE, oldLeftLifeline, leftLifeline));
      }
    }
    return leftLifeline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TLifeline basicGetLeftLifeline()
  {
    return leftLifeline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftLifeline(TLifeline newLeftLifeline)
  {
    TLifeline oldLeftLifeline = leftLifeline;
    leftLifeline = newLeftLifeline;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TINTERACTION_MESSAGE__LEFT_LIFELINE, oldLeftLifeline, leftLifeline));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCreate()
  {
    return create;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreate(boolean newCreate)
  {
    boolean oldCreate = create;
    create = newCreate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TINTERACTION_MESSAGE__CREATE, oldCreate, create));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TLifeline getRightLifeline()
  {
    if (rightLifeline != null && rightLifeline.eIsProxy())
    {
      InternalEObject oldRightLifeline = (InternalEObject)rightLifeline;
      rightLifeline = (TLifeline)eResolveProxy(oldRightLifeline);
      if (rightLifeline != oldRightLifeline)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextRamPackage.TINTERACTION_MESSAGE__RIGHT_LIFELINE, oldRightLifeline, rightLifeline));
      }
    }
    return rightLifeline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TLifeline basicGetRightLifeline()
  {
    return rightLifeline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightLifeline(TLifeline newRightLifeline)
  {
    TLifeline oldRightLifeline = rightLifeline;
    rightLifeline = newRightLifeline;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TINTERACTION_MESSAGE__RIGHT_LIFELINE, oldRightLifeline, rightLifeline));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TAbstractMessage getMessage()
  {
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMessage(TAbstractMessage newMessage, NotificationChain msgs)
  {
    TAbstractMessage oldMessage = message;
    message = newMessage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextRamPackage.TINTERACTION_MESSAGE__MESSAGE, oldMessage, newMessage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMessage(TAbstractMessage newMessage)
  {
    if (newMessage != message)
    {
      NotificationChain msgs = null;
      if (message != null)
        msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextRamPackage.TINTERACTION_MESSAGE__MESSAGE, null, msgs);
      if (newMessage != null)
        msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextRamPackage.TINTERACTION_MESSAGE__MESSAGE, null, msgs);
      msgs = basicSetMessage(newMessage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TINTERACTION_MESSAGE__MESSAGE, newMessage, newMessage));
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
      case TextRamPackage.TINTERACTION_MESSAGE__MESSAGE:
        return basicSetMessage(null, msgs);
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
      case TextRamPackage.TINTERACTION_MESSAGE__LEFT_LIFELINE:
        if (resolve) return getLeftLifeline();
        return basicGetLeftLifeline();
      case TextRamPackage.TINTERACTION_MESSAGE__CREATE:
        return isCreate();
      case TextRamPackage.TINTERACTION_MESSAGE__RIGHT_LIFELINE:
        if (resolve) return getRightLifeline();
        return basicGetRightLifeline();
      case TextRamPackage.TINTERACTION_MESSAGE__MESSAGE:
        return getMessage();
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
      case TextRamPackage.TINTERACTION_MESSAGE__LEFT_LIFELINE:
        setLeftLifeline((TLifeline)newValue);
        return;
      case TextRamPackage.TINTERACTION_MESSAGE__CREATE:
        setCreate((Boolean)newValue);
        return;
      case TextRamPackage.TINTERACTION_MESSAGE__RIGHT_LIFELINE:
        setRightLifeline((TLifeline)newValue);
        return;
      case TextRamPackage.TINTERACTION_MESSAGE__MESSAGE:
        setMessage((TAbstractMessage)newValue);
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
      case TextRamPackage.TINTERACTION_MESSAGE__LEFT_LIFELINE:
        setLeftLifeline((TLifeline)null);
        return;
      case TextRamPackage.TINTERACTION_MESSAGE__CREATE:
        setCreate(CREATE_EDEFAULT);
        return;
      case TextRamPackage.TINTERACTION_MESSAGE__RIGHT_LIFELINE:
        setRightLifeline((TLifeline)null);
        return;
      case TextRamPackage.TINTERACTION_MESSAGE__MESSAGE:
        setMessage((TAbstractMessage)null);
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
      case TextRamPackage.TINTERACTION_MESSAGE__LEFT_LIFELINE:
        return leftLifeline != null;
      case TextRamPackage.TINTERACTION_MESSAGE__CREATE:
        return create != CREATE_EDEFAULT;
      case TextRamPackage.TINTERACTION_MESSAGE__RIGHT_LIFELINE:
        return rightLifeline != null;
      case TextRamPackage.TINTERACTION_MESSAGE__MESSAGE:
        return message != null;
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
    result.append(" (create: ");
    result.append(create);
    result.append(')');
    return result.toString();
  }

} //TInteractionMessageImpl
