/**
 */
package cl.uchile.pleiad.textRam.impl;

import ca.mcgill.cs.sel.ram.InteractionOperatorKind;

import cl.uchile.pleiad.textRam.TCombinedFragment;
import cl.uchile.pleiad.textRam.TInteraction;
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
 * An implementation of the model object '<em><b>TCombined Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TCombinedFragmentImpl#getInteractionOperator <em>Interaction Operator</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TCombinedFragmentImpl#getInteractionConstraint <em>Interaction Constraint</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TCombinedFragmentImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.impl.TCombinedFragmentImpl#getElseContainers <em>Else Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TCombinedFragmentImpl extends TInteractionImpl implements TCombinedFragment
{
  /**
   * The default value of the '{@link #getInteractionOperator() <em>Interaction Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractionOperator()
   * @generated
   * @ordered
   */
  protected static final InteractionOperatorKind INTERACTION_OPERATOR_EDEFAULT = InteractionOperatorKind.ALT;

  /**
   * The cached value of the '{@link #getInteractionOperator() <em>Interaction Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractionOperator()
   * @generated
   * @ordered
   */
  protected InteractionOperatorKind interactionOperator = INTERACTION_OPERATOR_EDEFAULT;

  /**
   * The default value of the '{@link #getInteractionConstraint() <em>Interaction Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractionConstraint()
   * @generated
   * @ordered
   */
  protected static final String INTERACTION_CONSTRAINT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInteractionConstraint() <em>Interaction Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractionConstraint()
   * @generated
   * @ordered
   */
  protected String interactionConstraint = INTERACTION_CONSTRAINT_EDEFAULT;

  /**
   * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainers()
   * @generated
   * @ordered
   */
  protected EList<TInteraction> containers;

  /**
   * The cached value of the '{@link #getElseContainers() <em>Else Containers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseContainers()
   * @generated
   * @ordered
   */
  protected EList<TInteraction> elseContainers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TCombinedFragmentImpl()
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
    return TextRamPackage.Literals.TCOMBINED_FRAGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractionOperatorKind getInteractionOperator()
  {
    return interactionOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInteractionOperator(InteractionOperatorKind newInteractionOperator)
  {
    InteractionOperatorKind oldInteractionOperator = interactionOperator;
    interactionOperator = newInteractionOperator == null ? INTERACTION_OPERATOR_EDEFAULT : newInteractionOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TCOMBINED_FRAGMENT__INTERACTION_OPERATOR, oldInteractionOperator, interactionOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInteractionConstraint()
  {
    return interactionConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInteractionConstraint(String newInteractionConstraint)
  {
    String oldInteractionConstraint = interactionConstraint;
    interactionConstraint = newInteractionConstraint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextRamPackage.TCOMBINED_FRAGMENT__INTERACTION_CONSTRAINT, oldInteractionConstraint, interactionConstraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TInteraction> getContainers()
  {
    if (containers == null)
    {
      containers = new EObjectContainmentEList<TInteraction>(TInteraction.class, this, TextRamPackage.TCOMBINED_FRAGMENT__CONTAINERS);
    }
    return containers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TInteraction> getElseContainers()
  {
    if (elseContainers == null)
    {
      elseContainers = new EObjectContainmentEList<TInteraction>(TInteraction.class, this, TextRamPackage.TCOMBINED_FRAGMENT__ELSE_CONTAINERS);
    }
    return elseContainers;
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
      case TextRamPackage.TCOMBINED_FRAGMENT__CONTAINERS:
        return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
      case TextRamPackage.TCOMBINED_FRAGMENT__ELSE_CONTAINERS:
        return ((InternalEList<?>)getElseContainers()).basicRemove(otherEnd, msgs);
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
      case TextRamPackage.TCOMBINED_FRAGMENT__INTERACTION_OPERATOR:
        return getInteractionOperator();
      case TextRamPackage.TCOMBINED_FRAGMENT__INTERACTION_CONSTRAINT:
        return getInteractionConstraint();
      case TextRamPackage.TCOMBINED_FRAGMENT__CONTAINERS:
        return getContainers();
      case TextRamPackage.TCOMBINED_FRAGMENT__ELSE_CONTAINERS:
        return getElseContainers();
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
      case TextRamPackage.TCOMBINED_FRAGMENT__INTERACTION_OPERATOR:
        setInteractionOperator((InteractionOperatorKind)newValue);
        return;
      case TextRamPackage.TCOMBINED_FRAGMENT__INTERACTION_CONSTRAINT:
        setInteractionConstraint((String)newValue);
        return;
      case TextRamPackage.TCOMBINED_FRAGMENT__CONTAINERS:
        getContainers().clear();
        getContainers().addAll((Collection<? extends TInteraction>)newValue);
        return;
      case TextRamPackage.TCOMBINED_FRAGMENT__ELSE_CONTAINERS:
        getElseContainers().clear();
        getElseContainers().addAll((Collection<? extends TInteraction>)newValue);
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
      case TextRamPackage.TCOMBINED_FRAGMENT__INTERACTION_OPERATOR:
        setInteractionOperator(INTERACTION_OPERATOR_EDEFAULT);
        return;
      case TextRamPackage.TCOMBINED_FRAGMENT__INTERACTION_CONSTRAINT:
        setInteractionConstraint(INTERACTION_CONSTRAINT_EDEFAULT);
        return;
      case TextRamPackage.TCOMBINED_FRAGMENT__CONTAINERS:
        getContainers().clear();
        return;
      case TextRamPackage.TCOMBINED_FRAGMENT__ELSE_CONTAINERS:
        getElseContainers().clear();
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
      case TextRamPackage.TCOMBINED_FRAGMENT__INTERACTION_OPERATOR:
        return interactionOperator != INTERACTION_OPERATOR_EDEFAULT;
      case TextRamPackage.TCOMBINED_FRAGMENT__INTERACTION_CONSTRAINT:
        return INTERACTION_CONSTRAINT_EDEFAULT == null ? interactionConstraint != null : !INTERACTION_CONSTRAINT_EDEFAULT.equals(interactionConstraint);
      case TextRamPackage.TCOMBINED_FRAGMENT__CONTAINERS:
        return containers != null && !containers.isEmpty();
      case TextRamPackage.TCOMBINED_FRAGMENT__ELSE_CONTAINERS:
        return elseContainers != null && !elseContainers.isEmpty();
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
    result.append(" (interactionOperator: ");
    result.append(interactionOperator);
    result.append(", interactionConstraint: ");
    result.append(interactionConstraint);
    result.append(')');
    return result.toString();
  }

} //TCombinedFragmentImpl
