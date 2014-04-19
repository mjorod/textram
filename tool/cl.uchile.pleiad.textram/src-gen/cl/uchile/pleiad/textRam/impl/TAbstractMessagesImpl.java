/**
 */
package cl.uchile.pleiad.textRam.impl;

import cl.uchile.pleiad.textRam.TAbstractMessages;
import cl.uchile.pleiad.textRam.TClass;
import cl.uchile.pleiad.textRam.TInteraction;
import cl.uchile.pleiad.textRam.TOperation;
import cl.uchile.pleiad.textRam.TParameter;
import cl.uchile.pleiad.textRam.TextRamPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAbstract Messages</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TAbstractMessagesImpl#isCreate <em>Create</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TAbstractMessagesImpl#isPartialClass <em>Partial Class</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TAbstractMessagesImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TAbstractMessagesImpl#isPartialOperation <em>Partial Operation</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TAbstractMessagesImpl#getSpecifies <em>Specifies</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TAbstractMessagesImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TAbstractMessagesImpl#getInteractionMessages <em>Interaction Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TAbstractMessagesImpl extends MinimalEObjectImpl.Container implements TAbstractMessages
{
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
   * The default value of the '{@link #isPartialClass() <em>Partial Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartialClass()
   * @generated
   * @ordered
   */
  protected static final boolean PARTIAL_CLASS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPartialClass() <em>Partial Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartialClass()
   * @generated
   * @ordered
   */
  protected boolean partialClass = PARTIAL_CLASS_EDEFAULT;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected TClass class_;

  /**
   * The default value of the '{@link #isPartialOperation() <em>Partial Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartialOperation()
   * @generated
   * @ordered
   */
  protected static final boolean PARTIAL_OPERATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPartialOperation() <em>Partial Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartialOperation()
   * @generated
   * @ordered
   */
  protected boolean partialOperation = PARTIAL_OPERATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getSpecifies() <em>Specifies</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecifies()
   * @generated
   * @ordered
   */
  protected TOperation specifies;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<TParameter> arguments;

  /**
   * The cached value of the '{@link #getInteractionMessages() <em>Interaction Messages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractionMessages()
   * @generated
   * @ordered
   */
  protected EList<TInteraction> interactionMessages;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TAbstractMessagesImpl()
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
    return TextRamPackage.Literals.TABSTRACT_MESSAGES;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TABSTRACT_MESSAGES__CREATE, oldCreate, create));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPartialClass()
  {
    return partialClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartialClass(boolean newPartialClass)
  {
    boolean oldPartialClass = partialClass;
    partialClass = newPartialClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TABSTRACT_MESSAGES__PARTIAL_CLASS, oldPartialClass, partialClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TClass getClass_()
  {
    if (class_ != null && class_.eIsProxy())
    {
      InternalEObject oldClass = (InternalEObject)class_;
      class_ = (TClass)eResolveProxy(oldClass);
      if (class_ != oldClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextRamPackage.TABSTRACT_MESSAGES__CLASS, oldClass, class_));
      }
    }
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TClass basicGetClass()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(TClass newClass)
  {
    TClass oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TABSTRACT_MESSAGES__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPartialOperation()
  {
    return partialOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartialOperation(boolean newPartialOperation)
  {
    boolean oldPartialOperation = partialOperation;
    partialOperation = newPartialOperation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TABSTRACT_MESSAGES__PARTIAL_OPERATION, oldPartialOperation, partialOperation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TOperation getSpecifies()
  {
    if (specifies != null && specifies.eIsProxy())
    {
      InternalEObject oldSpecifies = (InternalEObject)specifies;
      specifies = (TOperation)eResolveProxy(oldSpecifies);
      if (specifies != oldSpecifies)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextRamPackage.TABSTRACT_MESSAGES__SPECIFIES, oldSpecifies, specifies));
      }
    }
    return specifies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TOperation basicGetSpecifies()
  {
    return specifies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpecifies(TOperation newSpecifies)
  {
    TOperation oldSpecifies = specifies;
    specifies = newSpecifies;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TABSTRACT_MESSAGES__SPECIFIES, oldSpecifies, specifies));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TParameter> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectResolvingEList<TParameter>(TParameter.class, this, TextRamPackage.TABSTRACT_MESSAGES__ARGUMENTS);
    }
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TInteraction> getInteractionMessages()
  {
    if (interactionMessages == null)
    {
      interactionMessages = new EObjectContainmentEList<TInteraction>(TInteraction.class, this, TextRamPackage.TABSTRACT_MESSAGES__INTERACTION_MESSAGES);
    }
    return interactionMessages;
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
      case TextRamPackage.TABSTRACT_MESSAGES__INTERACTION_MESSAGES:
        return ((InternalEList<?>)getInteractionMessages()).basicRemove(otherEnd, msgs);
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
      case TextRamPackage.TABSTRACT_MESSAGES__CREATE:
        return isCreate();
      case TextRamPackage.TABSTRACT_MESSAGES__PARTIAL_CLASS:
        return isPartialClass();
      case TextRamPackage.TABSTRACT_MESSAGES__CLASS:
        if (resolve) return getClass_();
        return basicGetClass();
      case TextRamPackage.TABSTRACT_MESSAGES__PARTIAL_OPERATION:
        return isPartialOperation();
      case TextRamPackage.TABSTRACT_MESSAGES__SPECIFIES:
        if (resolve) return getSpecifies();
        return basicGetSpecifies();
      case TextRamPackage.TABSTRACT_MESSAGES__ARGUMENTS:
        return getArguments();
      case TextRamPackage.TABSTRACT_MESSAGES__INTERACTION_MESSAGES:
        return getInteractionMessages();
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
      case TextRamPackage.TABSTRACT_MESSAGES__CREATE:
        setCreate((Boolean)newValue);
        return;
      case TextRamPackage.TABSTRACT_MESSAGES__PARTIAL_CLASS:
        setPartialClass((Boolean)newValue);
        return;
      case TextRamPackage.TABSTRACT_MESSAGES__CLASS:
        setClass((TClass)newValue);
        return;
      case TextRamPackage.TABSTRACT_MESSAGES__PARTIAL_OPERATION:
        setPartialOperation((Boolean)newValue);
        return;
      case TextRamPackage.TABSTRACT_MESSAGES__SPECIFIES:
        setSpecifies((TOperation)newValue);
        return;
      case TextRamPackage.TABSTRACT_MESSAGES__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends TParameter>)newValue);
        return;
      case TextRamPackage.TABSTRACT_MESSAGES__INTERACTION_MESSAGES:
        getInteractionMessages().clear();
        getInteractionMessages().addAll((Collection<? extends TInteraction>)newValue);
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
      case TextRamPackage.TABSTRACT_MESSAGES__CREATE:
        setCreate(CREATE_EDEFAULT);
        return;
      case TextRamPackage.TABSTRACT_MESSAGES__PARTIAL_CLASS:
        setPartialClass(PARTIAL_CLASS_EDEFAULT);
        return;
      case TextRamPackage.TABSTRACT_MESSAGES__CLASS:
        setClass((TClass)null);
        return;
      case TextRamPackage.TABSTRACT_MESSAGES__PARTIAL_OPERATION:
        setPartialOperation(PARTIAL_OPERATION_EDEFAULT);
        return;
      case TextRamPackage.TABSTRACT_MESSAGES__SPECIFIES:
        setSpecifies((TOperation)null);
        return;
      case TextRamPackage.TABSTRACT_MESSAGES__ARGUMENTS:
        getArguments().clear();
        return;
      case TextRamPackage.TABSTRACT_MESSAGES__INTERACTION_MESSAGES:
        getInteractionMessages().clear();
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
      case TextRamPackage.TABSTRACT_MESSAGES__CREATE:
        return create != CREATE_EDEFAULT;
      case TextRamPackage.TABSTRACT_MESSAGES__PARTIAL_CLASS:
        return partialClass != PARTIAL_CLASS_EDEFAULT;
      case TextRamPackage.TABSTRACT_MESSAGES__CLASS:
        return class_ != null;
      case TextRamPackage.TABSTRACT_MESSAGES__PARTIAL_OPERATION:
        return partialOperation != PARTIAL_OPERATION_EDEFAULT;
      case TextRamPackage.TABSTRACT_MESSAGES__SPECIFIES:
        return specifies != null;
      case TextRamPackage.TABSTRACT_MESSAGES__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
      case TextRamPackage.TABSTRACT_MESSAGES__INTERACTION_MESSAGES:
        return interactionMessages != null && !interactionMessages.isEmpty();
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
    result.append(", partialClass: ");
    result.append(partialClass);
    result.append(", partialOperation: ");
    result.append(partialOperation);
    result.append(')');
    return result.toString();
  }

} //TAbstractMessagesImpl
