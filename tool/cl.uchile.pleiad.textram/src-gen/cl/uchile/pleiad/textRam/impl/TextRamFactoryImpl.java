/**
 */
package cl.uchile.pleiad.textRam.impl;

import cl.uchile.pleiad.textRam.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextRamFactoryImpl extends EFactoryImpl implements TextRamFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TextRamFactory init()
  {
    try
    {
      TextRamFactory theTextRamFactory = (TextRamFactory)EPackage.Registry.INSTANCE.getEFactory(TextRamPackage.eNS_URI);
      if (theTextRamFactory != null)
      {
        return theTextRamFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TextRamFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextRamFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TextRamPackage.TASPECT: return createTAspect();
      case TextRamPackage.TSTRUCTURAL_VIEW: return createTStructuralView();
      case TextRamPackage.TCLASS_MEMBER: return createTClassMember();
      case TextRamPackage.TCLASS: return createTClass();
      case TextRamPackage.TATTRIBUTE: return createTAttribute();
      case TextRamPackage.TOPERATION: return createTOperation();
      case TextRamPackage.TPARAMETER: return createTParameter();
      case TextRamPackage.TASSOCIATION: return createTAssociation();
      case TextRamPackage.TASSOCIATION_END: return createTAssociationEnd();
      case TextRamPackage.TINSTANTIATION_HEADER: return createTInstantiationHeader();
      case TextRamPackage.TCLASSIFIER_MAPPING: return createTClassifierMapping();
      case TextRamPackage.TABSTRACT_MESSAGES: return createTAbstractMessages();
      case TextRamPackage.TMESSAGE_VIEW: return createTMessageView();
      case TextRamPackage.TASPECT_MESSAGE_VIEW: return createTAspectMessageView();
      case TextRamPackage.TLIFELINE: return createTLifeline();
      case TextRamPackage.TVALUE_SPECIFICATION: return createTValueSpecification();
      case TextRamPackage.TDUMMY_VALUE_SPECIFICATION: return createTDummyValueSpecification();
      case TextRamPackage.TTEMPORARY_PROPERTY: return createTTemporaryProperty();
      case TextRamPackage.TREFERENCE: return createTReference();
      case TextRamPackage.TLOCAL_ATTRIBUTE: return createTLocalAttribute();
      case TextRamPackage.TINTERACTION: return createTInteraction();
      case TextRamPackage.TOCURRENCE: return createTOcurrence();
      case TextRamPackage.TINTERACTION_MESSAGE: return createTInteractionMessage();
      case TextRamPackage.TCOMBINED_FRAGMENT: return createTCombinedFragment();
      case TextRamPackage.TABSTRACT_MESSAGE: return createTAbstractMessage();
      case TextRamPackage.TRETURN_MESSAGE: return createTReturnMessage();
      case TextRamPackage.TMESSAGE: return createTMessage();
      case TextRamPackage.TTYPED_ELEMENT: return createTTypedElement();
      case TextRamPackage.TMESSAGE_ASSIGNABLE_FEATURE: return createTMessageAssignableFeature();
      case TextRamPackage.TABSTRACT_MESSAGE_VIEW: return createTAbstractMessageView();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TextRamPackage.OCURRENCE_TYPE:
        return createOcurrenceTypeFromString(eDataType, initialValue);
      case TextRamPackage.TLIFELINE_REFERENCE_TYPE:
        return createTLifelineReferenceTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TextRamPackage.OCURRENCE_TYPE:
        return convertOcurrenceTypeToString(eDataType, instanceValue);
      case TextRamPackage.TLIFELINE_REFERENCE_TYPE:
        return convertTLifelineReferenceTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TAspect createTAspect()
  {
    TAspectImpl tAspect = new TAspectImpl();
    return tAspect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TStructuralView createTStructuralView()
  {
    TStructuralViewImpl tStructuralView = new TStructuralViewImpl();
    return tStructuralView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TClassMember createTClassMember()
  {
    TClassMemberImpl tClassMember = new TClassMemberImpl();
    return tClassMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TClass createTClass()
  {
    TClassImpl tClass = new TClassImpl();
    return tClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TAttribute createTAttribute()
  {
    TAttributeImpl tAttribute = new TAttributeImpl();
    return tAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TOperation createTOperation()
  {
    TOperationImpl tOperation = new TOperationImpl();
    return tOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TParameter createTParameter()
  {
    TParameterImpl tParameter = new TParameterImpl();
    return tParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TAssociation createTAssociation()
  {
    TAssociationImpl tAssociation = new TAssociationImpl();
    return tAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TAssociationEnd createTAssociationEnd()
  {
    TAssociationEndImpl tAssociationEnd = new TAssociationEndImpl();
    return tAssociationEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TInstantiationHeader createTInstantiationHeader()
  {
    TInstantiationHeaderImpl tInstantiationHeader = new TInstantiationHeaderImpl();
    return tInstantiationHeader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TClassifierMapping createTClassifierMapping()
  {
    TClassifierMappingImpl tClassifierMapping = new TClassifierMappingImpl();
    return tClassifierMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TAbstractMessages createTAbstractMessages()
  {
    TAbstractMessagesImpl tAbstractMessages = new TAbstractMessagesImpl();
    return tAbstractMessages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TMessageView createTMessageView()
  {
    TMessageViewImpl tMessageView = new TMessageViewImpl();
    return tMessageView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TAspectMessageView createTAspectMessageView()
  {
    TAspectMessageViewImpl tAspectMessageView = new TAspectMessageViewImpl();
    return tAspectMessageView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TLifeline createTLifeline()
  {
    TLifelineImpl tLifeline = new TLifelineImpl();
    return tLifeline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TValueSpecification createTValueSpecification()
  {
    TValueSpecificationImpl tValueSpecification = new TValueSpecificationImpl();
    return tValueSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TDummyValueSpecification createTDummyValueSpecification()
  {
    TDummyValueSpecificationImpl tDummyValueSpecification = new TDummyValueSpecificationImpl();
    return tDummyValueSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TTemporaryProperty createTTemporaryProperty()
  {
    TTemporaryPropertyImpl tTemporaryProperty = new TTemporaryPropertyImpl();
    return tTemporaryProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TReference createTReference()
  {
    TReferenceImpl tReference = new TReferenceImpl();
    return tReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TLocalAttribute createTLocalAttribute()
  {
    TLocalAttributeImpl tLocalAttribute = new TLocalAttributeImpl();
    return tLocalAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TInteraction createTInteraction()
  {
    TInteractionImpl tInteraction = new TInteractionImpl();
    return tInteraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TOcurrence createTOcurrence()
  {
    TOcurrenceImpl tOcurrence = new TOcurrenceImpl();
    return tOcurrence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TInteractionMessage createTInteractionMessage()
  {
    TInteractionMessageImpl tInteractionMessage = new TInteractionMessageImpl();
    return tInteractionMessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TCombinedFragment createTCombinedFragment()
  {
    TCombinedFragmentImpl tCombinedFragment = new TCombinedFragmentImpl();
    return tCombinedFragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TAbstractMessage createTAbstractMessage()
  {
    TAbstractMessageImpl tAbstractMessage = new TAbstractMessageImpl();
    return tAbstractMessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TReturnMessage createTReturnMessage()
  {
    TReturnMessageImpl tReturnMessage = new TReturnMessageImpl();
    return tReturnMessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TMessage createTMessage()
  {
    TMessageImpl tMessage = new TMessageImpl();
    return tMessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TTypedElement createTTypedElement()
  {
    TTypedElementImpl tTypedElement = new TTypedElementImpl();
    return tTypedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TMessageAssignableFeature createTMessageAssignableFeature()
  {
    TMessageAssignableFeatureImpl tMessageAssignableFeature = new TMessageAssignableFeatureImpl();
    return tMessageAssignableFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TAbstractMessageView createTAbstractMessageView()
  {
    TAbstractMessageViewImpl tAbstractMessageView = new TAbstractMessageViewImpl();
    return tAbstractMessageView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OcurrenceType createOcurrenceTypeFromString(EDataType eDataType, String initialValue)
  {
    OcurrenceType result = OcurrenceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOcurrenceTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TLifelineReferenceType createTLifelineReferenceTypeFromString(EDataType eDataType, String initialValue)
  {
    TLifelineReferenceType result = TLifelineReferenceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTLifelineReferenceTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextRamPackage getTextRamPackage()
  {
    return (TextRamPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TextRamPackage getPackage()
  {
    return TextRamPackage.eINSTANCE;
  }

} //TextRamFactoryImpl
