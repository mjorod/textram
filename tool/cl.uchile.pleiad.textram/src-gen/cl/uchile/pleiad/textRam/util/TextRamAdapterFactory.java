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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cl.uchile.pleiad.textRam.TextRamPackage
 * @generated
 */
public class TextRamAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TextRamPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextRamAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TextRamPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextRamSwitch<Adapter> modelSwitch =
    new TextRamSwitch<Adapter>()
    {
      @Override
      public Adapter caseTAspect(TAspect object)
      {
        return createTAspectAdapter();
      }
      @Override
      public Adapter caseTStructuralView(TStructuralView object)
      {
        return createTStructuralViewAdapter();
      }
      @Override
      public Adapter caseTClassMember(TClassMember object)
      {
        return createTClassMemberAdapter();
      }
      @Override
      public Adapter caseTClass(TClass object)
      {
        return createTClassAdapter();
      }
      @Override
      public Adapter caseTAttribute(TAttribute object)
      {
        return createTAttributeAdapter();
      }
      @Override
      public Adapter caseTOperation(TOperation object)
      {
        return createTOperationAdapter();
      }
      @Override
      public Adapter caseTParameter(TParameter object)
      {
        return createTParameterAdapter();
      }
      @Override
      public Adapter caseTAssociation(TAssociation object)
      {
        return createTAssociationAdapter();
      }
      @Override
      public Adapter caseTAssociationEnd(TAssociationEnd object)
      {
        return createTAssociationEndAdapter();
      }
      @Override
      public Adapter caseTInstantiationHeader(TInstantiationHeader object)
      {
        return createTInstantiationHeaderAdapter();
      }
      @Override
      public Adapter caseTClassifierMapping(TClassifierMapping object)
      {
        return createTClassifierMappingAdapter();
      }
      @Override
      public Adapter caseTAbstractMessages(TAbstractMessages object)
      {
        return createTAbstractMessagesAdapter();
      }
      @Override
      public Adapter caseTMessageView(TMessageView object)
      {
        return createTMessageViewAdapter();
      }
      @Override
      public Adapter caseTAspectMessageView(TAspectMessageView object)
      {
        return createTAspectMessageViewAdapter();
      }
      @Override
      public Adapter caseTLifeline(TLifeline object)
      {
        return createTLifelineAdapter();
      }
      @Override
      public Adapter caseTValueSpecification(TValueSpecification object)
      {
        return createTValueSpecificationAdapter();
      }
      @Override
      public Adapter caseTDummyValueSpecification(TDummyValueSpecification object)
      {
        return createTDummyValueSpecificationAdapter();
      }
      @Override
      public Adapter caseTTemporaryProperty(TTemporaryProperty object)
      {
        return createTTemporaryPropertyAdapter();
      }
      @Override
      public Adapter caseTReference(TReference object)
      {
        return createTReferenceAdapter();
      }
      @Override
      public Adapter caseTLocalAttribute(TLocalAttribute object)
      {
        return createTLocalAttributeAdapter();
      }
      @Override
      public Adapter caseTInteraction(TInteraction object)
      {
        return createTInteractionAdapter();
      }
      @Override
      public Adapter caseTOcurrence(TOcurrence object)
      {
        return createTOcurrenceAdapter();
      }
      @Override
      public Adapter caseTInteractionMessage(TInteractionMessage object)
      {
        return createTInteractionMessageAdapter();
      }
      @Override
      public Adapter caseTCombinedFragment(TCombinedFragment object)
      {
        return createTCombinedFragmentAdapter();
      }
      @Override
      public Adapter caseTAbstractMessage(TAbstractMessage object)
      {
        return createTAbstractMessageAdapter();
      }
      @Override
      public Adapter caseTReturnMessage(TReturnMessage object)
      {
        return createTReturnMessageAdapter();
      }
      @Override
      public Adapter caseTMessage(TMessage object)
      {
        return createTMessageAdapter();
      }
      @Override
      public Adapter caseTTypedElement(TTypedElement object)
      {
        return createTTypedElementAdapter();
      }
      @Override
      public Adapter caseTMessageAssignableFeature(TMessageAssignableFeature object)
      {
        return createTMessageAssignableFeatureAdapter();
      }
      @Override
      public Adapter caseTAbstractMessageView(TAbstractMessageView object)
      {
        return createTAbstractMessageViewAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseAspect(Aspect object)
      {
        return createAspectAdapter();
      }
      @Override
      public Adapter caseStructuralView(StructuralView object)
      {
        return createStructuralViewAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseMappableElement(MappableElement object)
      {
        return createMappableElementAdapter();
      }
      @Override
      public Adapter caseObjectType(ObjectType object)
      {
        return createObjectTypeAdapter();
      }
      @Override
      public Adapter caseClassifier(Classifier object)
      {
        return createClassifierAdapter();
      }
      @Override
      public Adapter caseClass(ca.mcgill.cs.sel.ram.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseMapping(Mapping object)
      {
        return createMappingAdapter();
      }
      @Override
      public Adapter caseClassifierMapping(ClassifierMapping object)
      {
        return createClassifierMappingAdapter();
      }
      @Override
      public Adapter caseAbstractMessageView(AbstractMessageView object)
      {
        return createAbstractMessageViewAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TAspect <em>TAspect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TAspect
   * @generated
   */
  public Adapter createTAspectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TStructuralView <em>TStructural View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TStructuralView
   * @generated
   */
  public Adapter createTStructuralViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TClassMember <em>TClass Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TClassMember
   * @generated
   */
  public Adapter createTClassMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TClass <em>TClass</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TClass
   * @generated
   */
  public Adapter createTClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TAttribute <em>TAttribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TAttribute
   * @generated
   */
  public Adapter createTAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TOperation <em>TOperation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TOperation
   * @generated
   */
  public Adapter createTOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TParameter <em>TParameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TParameter
   * @generated
   */
  public Adapter createTParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TAssociation <em>TAssociation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TAssociation
   * @generated
   */
  public Adapter createTAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TAssociationEnd <em>TAssociation End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TAssociationEnd
   * @generated
   */
  public Adapter createTAssociationEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TInstantiationHeader <em>TInstantiation Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TInstantiationHeader
   * @generated
   */
  public Adapter createTInstantiationHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TClassifierMapping <em>TClassifier Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TClassifierMapping
   * @generated
   */
  public Adapter createTClassifierMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TAbstractMessages <em>TAbstract Messages</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TAbstractMessages
   * @generated
   */
  public Adapter createTAbstractMessagesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TMessageView <em>TMessage View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TMessageView
   * @generated
   */
  public Adapter createTMessageViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TAspectMessageView <em>TAspect Message View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TAspectMessageView
   * @generated
   */
  public Adapter createTAspectMessageViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TLifeline <em>TLifeline</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TLifeline
   * @generated
   */
  public Adapter createTLifelineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TValueSpecification <em>TValue Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TValueSpecification
   * @generated
   */
  public Adapter createTValueSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TDummyValueSpecification <em>TDummy Value Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TDummyValueSpecification
   * @generated
   */
  public Adapter createTDummyValueSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TTemporaryProperty <em>TTemporary Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TTemporaryProperty
   * @generated
   */
  public Adapter createTTemporaryPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TReference <em>TReference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TReference
   * @generated
   */
  public Adapter createTReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TLocalAttribute <em>TLocal Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TLocalAttribute
   * @generated
   */
  public Adapter createTLocalAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TInteraction <em>TInteraction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TInteraction
   * @generated
   */
  public Adapter createTInteractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TOcurrence <em>TOcurrence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TOcurrence
   * @generated
   */
  public Adapter createTOcurrenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TInteractionMessage <em>TInteraction Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TInteractionMessage
   * @generated
   */
  public Adapter createTInteractionMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TCombinedFragment <em>TCombined Fragment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TCombinedFragment
   * @generated
   */
  public Adapter createTCombinedFragmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TAbstractMessage <em>TAbstract Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TAbstractMessage
   * @generated
   */
  public Adapter createTAbstractMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TReturnMessage <em>TReturn Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TReturnMessage
   * @generated
   */
  public Adapter createTReturnMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TMessage <em>TMessage</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TMessage
   * @generated
   */
  public Adapter createTMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TTypedElement <em>TTyped Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TTypedElement
   * @generated
   */
  public Adapter createTTypedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TMessageAssignableFeature <em>TMessage Assignable Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TMessageAssignableFeature
   * @generated
   */
  public Adapter createTMessageAssignableFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cl.uchile.pleiad.textRam.TAbstractMessageView <em>TAbstract Message View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cl.uchile.pleiad.textRam.TAbstractMessageView
   * @generated
   */
  public Adapter createTAbstractMessageViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.mcgill.cs.sel.ram.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.mcgill.cs.sel.ram.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.mcgill.cs.sel.ram.Aspect <em>Aspect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.mcgill.cs.sel.ram.Aspect
   * @generated
   */
  public Adapter createAspectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.mcgill.cs.sel.ram.StructuralView <em>Structural View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.mcgill.cs.sel.ram.StructuralView
   * @generated
   */
  public Adapter createStructuralViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.mcgill.cs.sel.ram.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.mcgill.cs.sel.ram.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.mcgill.cs.sel.ram.MappableElement <em>Mappable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.mcgill.cs.sel.ram.MappableElement
   * @generated
   */
  public Adapter createMappableElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.mcgill.cs.sel.ram.ObjectType <em>Object Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.mcgill.cs.sel.ram.ObjectType
   * @generated
   */
  public Adapter createObjectTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.mcgill.cs.sel.ram.Classifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.mcgill.cs.sel.ram.Classifier
   * @generated
   */
  public Adapter createClassifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.mcgill.cs.sel.ram.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.mcgill.cs.sel.ram.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.mcgill.cs.sel.ram.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.mcgill.cs.sel.ram.Mapping
   * @generated
   */
  public Adapter createMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.mcgill.cs.sel.ram.ClassifierMapping <em>Classifier Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.mcgill.cs.sel.ram.ClassifierMapping
   * @generated
   */
  public Adapter createClassifierMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.mcgill.cs.sel.ram.AbstractMessageView <em>Abstract Message View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.mcgill.cs.sel.ram.AbstractMessageView
   * @generated
   */
  public Adapter createAbstractMessageViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TextRamAdapterFactory
