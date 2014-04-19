/**
 */
package cl.uchile.pleiad.textRam.impl;

import ca.mcgill.cs.sel.ram.Type;
import ca.mcgill.cs.sel.ram.Visibility;

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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TOperation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TOperationImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TOperationImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TOperationImpl#isPartialReturnType <em>Partial Return Type</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TOperationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TOperationImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TOperationImpl extends TClassMemberImpl implements TOperation
{
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
   * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected static final Visibility VISIBILITY_EDEFAULT = Visibility.PUBLIC;

  /**
   * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected Visibility visibility = VISIBILITY_EDEFAULT;

  /**
   * The default value of the '{@link #isPartialReturnType() <em>Partial Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartialReturnType()
   * @generated
   * @ordered
   */
  protected static final boolean PARTIAL_RETURN_TYPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPartialReturnType() <em>Partial Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartialReturnType()
   * @generated
   * @ordered
   */
  protected boolean partialReturnType = PARTIAL_RETURN_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected Type returnType;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<TParameter> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TOperationImpl()
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
    return TextRamPackage.Literals.TOPERATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TOPERATION__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility getVisibility()
  {
    return visibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisibility(Visibility newVisibility)
  {
    Visibility oldVisibility = visibility;
    visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TOPERATION__VISIBILITY, oldVisibility, visibility));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPartialReturnType()
  {
    return partialReturnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartialReturnType(boolean newPartialReturnType)
  {
    boolean oldPartialReturnType = partialReturnType;
    partialReturnType = newPartialReturnType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TOPERATION__PARTIAL_RETURN_TYPE, oldPartialReturnType, partialReturnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getReturnType()
  {
    if (returnType != null && returnType.eIsProxy())
    {
      InternalEObject oldReturnType = (InternalEObject)returnType;
      returnType = (Type)eResolveProxy(oldReturnType);
      if (returnType != oldReturnType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextRamPackage.TOPERATION__RETURN_TYPE, oldReturnType, returnType));
      }
    }
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(Type newReturnType)
  {
    Type oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TOPERATION__RETURN_TYPE, oldReturnType, returnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TParameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<TParameter>(TParameter.class, this, TextRamPackage.TOPERATION__PARAMETERS);
    }
    return parameters;
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
      case TextRamPackage.TOPERATION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case TextRamPackage.TOPERATION__ABSTRACT:
        return isAbstract();
      case TextRamPackage.TOPERATION__VISIBILITY:
        return getVisibility();
      case TextRamPackage.TOPERATION__PARTIAL_RETURN_TYPE:
        return isPartialReturnType();
      case TextRamPackage.TOPERATION__RETURN_TYPE:
        if (resolve) return getReturnType();
        return basicGetReturnType();
      case TextRamPackage.TOPERATION__PARAMETERS:
        return getParameters();
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
      case TextRamPackage.TOPERATION__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case TextRamPackage.TOPERATION__VISIBILITY:
        setVisibility((Visibility)newValue);
        return;
      case TextRamPackage.TOPERATION__PARTIAL_RETURN_TYPE:
        setPartialReturnType((Boolean)newValue);
        return;
      case TextRamPackage.TOPERATION__RETURN_TYPE:
        setReturnType((Type)newValue);
        return;
      case TextRamPackage.TOPERATION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends TParameter>)newValue);
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
      case TextRamPackage.TOPERATION__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case TextRamPackage.TOPERATION__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
        return;
      case TextRamPackage.TOPERATION__PARTIAL_RETURN_TYPE:
        setPartialReturnType(PARTIAL_RETURN_TYPE_EDEFAULT);
        return;
      case TextRamPackage.TOPERATION__RETURN_TYPE:
        setReturnType((Type)null);
        return;
      case TextRamPackage.TOPERATION__PARAMETERS:
        getParameters().clear();
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
      case TextRamPackage.TOPERATION__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case TextRamPackage.TOPERATION__VISIBILITY:
        return visibility != VISIBILITY_EDEFAULT;
      case TextRamPackage.TOPERATION__PARTIAL_RETURN_TYPE:
        return partialReturnType != PARTIAL_RETURN_TYPE_EDEFAULT;
      case TextRamPackage.TOPERATION__RETURN_TYPE:
        return returnType != null;
      case TextRamPackage.TOPERATION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
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
    result.append(" (abstract: ");
    result.append(abstract_);
    result.append(", visibility: ");
    result.append(visibility);
    result.append(", partialReturnType: ");
    result.append(partialReturnType);
    result.append(')');
    return result.toString();
  }

} //TOperationImpl
