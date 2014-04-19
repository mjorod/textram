/**
 */
package cl.uchile.pleiad.textRam.util;

import ca.mcgill.cs.sel.ram.AbstractMessageView;
import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.Classifier;
import ca.mcgill.cs.sel.ram.ClassifierMapping;
import ca.mcgill.cs.sel.ram.MappableElement;
import ca.mcgill.cs.sel.ram.Mapping;
import ca.mcgill.cs.sel.ram.NamedElement;
import ca.mcgill.cs.sel.ram.ObjectType;
import ca.mcgill.cs.sel.ram.StructuralView;
import ca.mcgill.cs.sel.ram.Type;

import cl.uchile.pleiad.textRam.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cl.uchile.pleiad.textRam.TextRamPackage
 * @generated
 */
public class TextRamSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TextRamPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextRamSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TextRamPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case TextRamPackage.TASPECT:
      {
        TAspect tAspect = (TAspect)theEObject;
        T result = caseTAspect(tAspect);
        if (result == null) result = caseAspect(tAspect);
        if (result == null) result = caseNamedElement(tAspect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TSTRUCTURAL_VIEW:
      {
        TStructuralView tStructuralView = (TStructuralView)theEObject;
        T result = caseTStructuralView(tStructuralView);
        if (result == null) result = caseStructuralView(tStructuralView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TCLASS_MEMBER:
      {
        TClassMember tClassMember = (TClassMember)theEObject;
        T result = caseTClassMember(tClassMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TCLASS:
      {
        TClass tClass = (TClass)theEObject;
        T result = caseTClass(tClass);
        if (result == null) result = caseClass(tClass);
        if (result == null) result = caseTTypedElement(tClass);
        if (result == null) result = caseClassifier(tClass);
        if (result == null) result = caseObjectType(tClass);
        if (result == null) result = caseType(tClass);
        if (result == null) result = caseMappableElement(tClass);
        if (result == null) result = caseNamedElement(tClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TATTRIBUTE:
      {
        TAttribute tAttribute = (TAttribute)theEObject;
        T result = caseTAttribute(tAttribute);
        if (result == null) result = caseTClassMember(tAttribute);
        if (result == null) result = caseTTypedElement(tAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TOPERATION:
      {
        TOperation tOperation = (TOperation)theEObject;
        T result = caseTOperation(tOperation);
        if (result == null) result = caseTClassMember(tOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TPARAMETER:
      {
        TParameter tParameter = (TParameter)theEObject;
        T result = caseTParameter(tParameter);
        if (result == null) result = caseTValueSpecification(tParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TASSOCIATION:
      {
        TAssociation tAssociation = (TAssociation)theEObject;
        T result = caseTAssociation(tAssociation);
        if (result == null) result = caseTTypedElement(tAssociation);
        if (result == null) result = caseTMessageAssignableFeature(tAssociation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TASSOCIATION_END:
      {
        TAssociationEnd tAssociationEnd = (TAssociationEnd)theEObject;
        T result = caseTAssociationEnd(tAssociationEnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TINSTANTIATION_HEADER:
      {
        TInstantiationHeader tInstantiationHeader = (TInstantiationHeader)theEObject;
        T result = caseTInstantiationHeader(tInstantiationHeader);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TCLASSIFIER_MAPPING:
      {
        TClassifierMapping tClassifierMapping = (TClassifierMapping)theEObject;
        T result = caseTClassifierMapping(tClassifierMapping);
        if (result == null) result = caseClassifierMapping(tClassifierMapping);
        if (result == null) result = caseMapping(tClassifierMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TABSTRACT_MESSAGES:
      {
        TAbstractMessages tAbstractMessages = (TAbstractMessages)theEObject;
        T result = caseTAbstractMessages(tAbstractMessages);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TMESSAGE_VIEW:
      {
        TMessageView tMessageView = (TMessageView)theEObject;
        T result = caseTMessageView(tMessageView);
        if (result == null) result = caseTAbstractMessages(tMessageView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TASPECT_MESSAGE_VIEW:
      {
        TAspectMessageView tAspectMessageView = (TAspectMessageView)theEObject;
        T result = caseTAspectMessageView(tAspectMessageView);
        if (result == null) result = caseTAbstractMessages(tAspectMessageView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TLIFELINE:
      {
        TLifeline tLifeline = (TLifeline)theEObject;
        T result = caseTLifeline(tLifeline);
        if (result == null) result = caseTValueSpecification(tLifeline);
        if (result == null) result = caseTMessageAssignableFeature(tLifeline);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TVALUE_SPECIFICATION:
      {
        TValueSpecification tValueSpecification = (TValueSpecification)theEObject;
        T result = caseTValueSpecification(tValueSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TDUMMY_VALUE_SPECIFICATION:
      {
        TDummyValueSpecification tDummyValueSpecification = (TDummyValueSpecification)theEObject;
        T result = caseTDummyValueSpecification(tDummyValueSpecification);
        if (result == null) result = caseTValueSpecification(tDummyValueSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TTEMPORARY_PROPERTY:
      {
        TTemporaryProperty tTemporaryProperty = (TTemporaryProperty)theEObject;
        T result = caseTTemporaryProperty(tTemporaryProperty);
        if (result == null) result = caseTValueSpecification(tTemporaryProperty);
        if (result == null) result = caseTMessageAssignableFeature(tTemporaryProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TREFERENCE:
      {
        TReference tReference = (TReference)theEObject;
        T result = caseTReference(tReference);
        if (result == null) result = caseTTemporaryProperty(tReference);
        if (result == null) result = caseTValueSpecification(tReference);
        if (result == null) result = caseTMessageAssignableFeature(tReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TLOCAL_ATTRIBUTE:
      {
        TLocalAttribute tLocalAttribute = (TLocalAttribute)theEObject;
        T result = caseTLocalAttribute(tLocalAttribute);
        if (result == null) result = caseTTemporaryProperty(tLocalAttribute);
        if (result == null) result = caseTValueSpecification(tLocalAttribute);
        if (result == null) result = caseTMessageAssignableFeature(tLocalAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TINTERACTION:
      {
        TInteraction tInteraction = (TInteraction)theEObject;
        T result = caseTInteraction(tInteraction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TOCURRENCE:
      {
        TOcurrence tOcurrence = (TOcurrence)theEObject;
        T result = caseTOcurrence(tOcurrence);
        if (result == null) result = caseTInteraction(tOcurrence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TINTERACTION_MESSAGE:
      {
        TInteractionMessage tInteractionMessage = (TInteractionMessage)theEObject;
        T result = caseTInteractionMessage(tInteractionMessage);
        if (result == null) result = caseTInteraction(tInteractionMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TCOMBINED_FRAGMENT:
      {
        TCombinedFragment tCombinedFragment = (TCombinedFragment)theEObject;
        T result = caseTCombinedFragment(tCombinedFragment);
        if (result == null) result = caseTInteraction(tCombinedFragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TABSTRACT_MESSAGE:
      {
        TAbstractMessage tAbstractMessage = (TAbstractMessage)theEObject;
        T result = caseTAbstractMessage(tAbstractMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TRETURN_MESSAGE:
      {
        TReturnMessage tReturnMessage = (TReturnMessage)theEObject;
        T result = caseTReturnMessage(tReturnMessage);
        if (result == null) result = caseTAbstractMessage(tReturnMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TMESSAGE:
      {
        TMessage tMessage = (TMessage)theEObject;
        T result = caseTMessage(tMessage);
        if (result == null) result = caseTAbstractMessage(tMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TTYPED_ELEMENT:
      {
        TTypedElement tTypedElement = (TTypedElement)theEObject;
        T result = caseTTypedElement(tTypedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TMESSAGE_ASSIGNABLE_FEATURE:
      {
        TMessageAssignableFeature tMessageAssignableFeature = (TMessageAssignableFeature)theEObject;
        T result = caseTMessageAssignableFeature(tMessageAssignableFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextRamPackage.TABSTRACT_MESSAGE_VIEW:
      {
        TAbstractMessageView tAbstractMessageView = (TAbstractMessageView)theEObject;
        T result = caseTAbstractMessageView(tAbstractMessageView);
        if (result == null) result = caseAbstractMessageView(tAbstractMessageView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TAspect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TAspect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTAspect(TAspect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TStructural View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TStructural View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTStructuralView(TStructuralView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TClass Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TClass Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTClassMember(TClassMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TClass</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TClass</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTClass(TClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TAttribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TAttribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTAttribute(TAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TOperation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TOperation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTOperation(TOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TParameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TParameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTParameter(TParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TAssociation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TAssociation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTAssociation(TAssociation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TAssociation End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TAssociation End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTAssociationEnd(TAssociationEnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TInstantiation Header</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TInstantiation Header</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTInstantiationHeader(TInstantiationHeader object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TClassifier Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TClassifier Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTClassifierMapping(TClassifierMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TAbstract Messages</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TAbstract Messages</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTAbstractMessages(TAbstractMessages object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TMessage View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TMessage View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTMessageView(TMessageView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TAspect Message View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TAspect Message View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTAspectMessageView(TAspectMessageView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TLifeline</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TLifeline</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTLifeline(TLifeline object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TValue Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TValue Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTValueSpecification(TValueSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TDummy Value Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TDummy Value Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTDummyValueSpecification(TDummyValueSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TTemporary Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TTemporary Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTTemporaryProperty(TTemporaryProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TReference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TReference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTReference(TReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TLocal Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TLocal Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTLocalAttribute(TLocalAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TInteraction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TInteraction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTInteraction(TInteraction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TOcurrence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TOcurrence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTOcurrence(TOcurrence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TInteraction Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TInteraction Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTInteractionMessage(TInteractionMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TCombined Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TCombined Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTCombinedFragment(TCombinedFragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TAbstract Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TAbstract Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTAbstractMessage(TAbstractMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TReturn Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TReturn Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTReturnMessage(TReturnMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TMessage</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TMessage</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTMessage(TMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TTyped Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TTyped Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTTypedElement(TTypedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TMessage Assignable Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TMessage Assignable Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTMessageAssignableFeature(TMessageAssignableFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TAbstract Message View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TAbstract Message View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTAbstractMessageView(TAbstractMessageView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aspect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aspect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAspect(Aspect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structural View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structural View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructuralView(StructuralView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mappable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mappable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappableElement(MappableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectType(ObjectType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassifier(Classifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass(ca.mcgill.cs.sel.ram.Class object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapping(Mapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Classifier Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Classifier Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassifierMapping(ClassifierMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Message View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Message View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractMessageView(AbstractMessageView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //TextRamSwitch
