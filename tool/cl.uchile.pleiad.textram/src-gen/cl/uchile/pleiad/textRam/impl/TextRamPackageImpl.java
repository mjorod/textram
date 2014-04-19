/**
 */
package cl.uchile.pleiad.textRam.impl;

import ca.mcgill.cs.sel.ram.RamPackage;

import cl.uchile.pleiad.textRam.OcurrenceType;
import cl.uchile.pleiad.textRam.TAbstractMessage;
import cl.uchile.pleiad.textRam.TAbstractMessageView;
import cl.uchile.pleiad.textRam.TAbstractMessages;
import cl.uchile.pleiad.textRam.TAspect;
import cl.uchile.pleiad.textRam.TAspectMessageView;
import cl.uchile.pleiad.textRam.TAssociation;
import cl.uchile.pleiad.textRam.TAssociationEnd;
import cl.uchile.pleiad.textRam.TAttribute;
import cl.uchile.pleiad.textRam.TClass;
import cl.uchile.pleiad.textRam.TClassMember;
import cl.uchile.pleiad.textRam.TClassifierMapping;
import cl.uchile.pleiad.textRam.TCombinedFragment;
import cl.uchile.pleiad.textRam.TDummyValueSpecification;
import cl.uchile.pleiad.textRam.TInstantiationHeader;
import cl.uchile.pleiad.textRam.TInteraction;
import cl.uchile.pleiad.textRam.TInteractionMessage;
import cl.uchile.pleiad.textRam.TLifeline;
import cl.uchile.pleiad.textRam.TLifelineReferenceType;
import cl.uchile.pleiad.textRam.TLocalAttribute;
import cl.uchile.pleiad.textRam.TMessage;
import cl.uchile.pleiad.textRam.TMessageAssignableFeature;
import cl.uchile.pleiad.textRam.TMessageView;
import cl.uchile.pleiad.textRam.TOcurrence;
import cl.uchile.pleiad.textRam.TOperation;
import cl.uchile.pleiad.textRam.TParameter;
import cl.uchile.pleiad.textRam.TReference;
import cl.uchile.pleiad.textRam.TReturnMessage;
import cl.uchile.pleiad.textRam.TStructuralView;
import cl.uchile.pleiad.textRam.TTemporaryProperty;
import cl.uchile.pleiad.textRam.TTypedElement;
import cl.uchile.pleiad.textRam.TValueSpecification;
import cl.uchile.pleiad.textRam.TextRamFactory;
import cl.uchile.pleiad.textRam.TextRamPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextRamPackageImpl extends EPackageImpl implements TextRamPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tAspectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tStructuralViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tClassMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tAssociationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tAssociationEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tInstantiationHeaderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tClassifierMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tAbstractMessagesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tMessageViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tAspectMessageViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tLifelineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tValueSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tDummyValueSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tTemporaryPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tLocalAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tInteractionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tOcurrenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tInteractionMessageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tCombinedFragmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tAbstractMessageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tReturnMessageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tMessageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tTypedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tMessageAssignableFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tAbstractMessageViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum ocurrenceTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum tLifelineReferenceTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see cl.uchile.pleiad.textRam.TextRamPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TextRamPackageImpl()
  {
    super(eNS_URI, TextRamFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TextRamPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TextRamPackage init()
  {
    if (isInited) return (TextRamPackage)EPackage.Registry.INSTANCE.getEPackage(TextRamPackage.eNS_URI);

    // Obtain or create and register package
    TextRamPackageImpl theTextRamPackage = (TextRamPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TextRamPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TextRamPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    RamPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theTextRamPackage.createPackageContents();

    // Initialize created meta-data
    theTextRamPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTextRamPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TextRamPackage.eNS_URI, theTextRamPackage);
    return theTextRamPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTAspect()
  {
    return tAspectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTAspect_HeaderInstantiations()
  {
    return (EReference)tAspectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTStructuralView()
  {
    return tStructuralViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTStructuralView_TAssociations()
  {
    return (EReference)tStructuralViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTClassMember()
  {
    return tClassMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTClassMember_Static()
  {
    return (EAttribute)tClassMemberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTClassMember_Partial()
  {
    return (EAttribute)tClassMemberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTClassMember_Name()
  {
    return (EAttribute)tClassMemberEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTClass()
  {
    return tClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTClass_PartialSuperType()
  {
    return (EAttribute)tClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTClass_Members()
  {
    return (EReference)tClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTAttribute()
  {
    return tAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTAttribute_Type()
  {
    return (EReference)tAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTOperation()
  {
    return tOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTOperation_Abstract()
  {
    return (EAttribute)tOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTOperation_Visibility()
  {
    return (EAttribute)tOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTOperation_PartialReturnType()
  {
    return (EAttribute)tOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTOperation_ReturnType()
  {
    return (EReference)tOperationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTOperation_Parameters()
  {
    return (EReference)tOperationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTParameter()
  {
    return tParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTParameter_PartialType()
  {
    return (EAttribute)tParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTParameter_Type()
  {
    return (EReference)tParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTParameter_Name()
  {
    return (EAttribute)tParameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTAssociation()
  {
    return tAssociationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTAssociation_FromEnd()
  {
    return (EReference)tAssociationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTAssociation_ReferenceType()
  {
    return (EAttribute)tAssociationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTAssociation_ToEnd()
  {
    return (EReference)tAssociationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTAssociationEnd()
  {
    return tAssociationEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTAssociationEnd_LowerBound()
  {
    return (EAttribute)tAssociationEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTAssociationEnd_UpperBound()
  {
    return (EAttribute)tAssociationEndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTAssociationEnd_ClassReference()
  {
    return (EReference)tAssociationEndEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTInstantiationHeader()
  {
    return tInstantiationHeaderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTInstantiationHeader_Type()
  {
    return (EAttribute)tInstantiationHeaderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTInstantiationHeader_ExternalAspects()
  {
    return (EReference)tInstantiationHeaderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTClassifierMapping()
  {
    return tClassifierMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTClassifierMapping_PartialFromElement()
  {
    return (EAttribute)tClassifierMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTClassifierMapping_FromMembers()
  {
    return (EReference)tClassifierMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTClassifierMapping_PartialToElement()
  {
    return (EAttribute)tClassifierMappingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTClassifierMapping_ToMembers()
  {
    return (EReference)tClassifierMappingEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTAbstractMessages()
  {
    return tAbstractMessagesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTAbstractMessages_Create()
  {
    return (EAttribute)tAbstractMessagesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTAbstractMessages_PartialClass()
  {
    return (EAttribute)tAbstractMessagesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTAbstractMessages_Class()
  {
    return (EReference)tAbstractMessagesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTAbstractMessages_PartialOperation()
  {
    return (EAttribute)tAbstractMessagesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTAbstractMessages_Specifies()
  {
    return (EReference)tAbstractMessagesEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTAbstractMessages_Arguments()
  {
    return (EReference)tAbstractMessagesEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTAbstractMessages_InteractionMessages()
  {
    return (EReference)tAbstractMessagesEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTMessageView()
  {
    return tMessageViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTMessageView_AffectedBy()
  {
    return (EReference)tMessageViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTAspectMessageView()
  {
    return tAspectMessageViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTAspectMessageView_Name()
  {
    return (EAttribute)tAspectMessageViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTLifeline()
  {
    return tLifelineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTLifeline_Static()
  {
    return (EAttribute)tLifelineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTLifeline_ReferenceType()
  {
    return (EAttribute)tLifelineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTLifeline_Represents()
  {
    return (EReference)tLifelineEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTLifeline_LocalProperties()
  {
    return (EReference)tLifelineEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTValueSpecification()
  {
    return tValueSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTDummyValueSpecification()
  {
    return tDummyValueSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTDummyValueSpecification_Dummy()
  {
    return (EAttribute)tDummyValueSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTTemporaryProperty()
  {
    return tTemporaryPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTReference()
  {
    return tReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTReference_PartialClass()
  {
    return (EAttribute)tReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTReference_Reference()
  {
    return (EReference)tReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTLocalAttribute()
  {
    return tLocalAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTLocalAttribute_Type()
  {
    return (EReference)tLocalAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTLocalAttribute_Value()
  {
    return (EAttribute)tLocalAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTInteraction()
  {
    return tInteractionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTOcurrence()
  {
    return tOcurrenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTOcurrence_LeftLifeline()
  {
    return (EReference)tOcurrenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTOcurrence_OcurrenceType()
  {
    return (EAttribute)tOcurrenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTInteractionMessage()
  {
    return tInteractionMessageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTInteractionMessage_LeftLifeline()
  {
    return (EReference)tInteractionMessageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTInteractionMessage_Create()
  {
    return (EAttribute)tInteractionMessageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTInteractionMessage_RightLifeline()
  {
    return (EReference)tInteractionMessageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTInteractionMessage_Message()
  {
    return (EReference)tInteractionMessageEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTCombinedFragment()
  {
    return tCombinedFragmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTCombinedFragment_InteractionOperator()
  {
    return (EAttribute)tCombinedFragmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTCombinedFragment_InteractionConstraint()
  {
    return (EAttribute)tCombinedFragmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTCombinedFragment_Containers()
  {
    return (EReference)tCombinedFragmentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTCombinedFragment_ElseContainers()
  {
    return (EReference)tCombinedFragmentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTAbstractMessage()
  {
    return tAbstractMessageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTAbstractMessage_AssignTo()
  {
    return (EReference)tAbstractMessageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTReturnMessage()
  {
    return tReturnMessageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTMessage()
  {
    return tMessageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTMessage_PartialOperation()
  {
    return (EAttribute)tMessageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTMessage_Signature()
  {
    return (EReference)tMessageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTMessage_Arguments()
  {
    return (EReference)tMessageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTTypedElement()
  {
    return tTypedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTMessageAssignableFeature()
  {
    return tMessageAssignableFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTMessageAssignableFeature_Name()
  {
    return (EAttribute)tMessageAssignableFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTAbstractMessageView()
  {
    return tAbstractMessageViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTAbstractMessageView_Lifelines()
  {
    return (EReference)tAbstractMessageViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTAbstractMessageView_Messages()
  {
    return (EReference)tAbstractMessageViewEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOcurrenceType()
  {
    return ocurrenceTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTLifelineReferenceType()
  {
    return tLifelineReferenceTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextRamFactory getTextRamFactory()
  {
    return (TextRamFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    tAspectEClass = createEClass(TASPECT);
    createEReference(tAspectEClass, TASPECT__HEADER_INSTANTIATIONS);

    tStructuralViewEClass = createEClass(TSTRUCTURAL_VIEW);
    createEReference(tStructuralViewEClass, TSTRUCTURAL_VIEW__TASSOCIATIONS);

    tClassMemberEClass = createEClass(TCLASS_MEMBER);
    createEAttribute(tClassMemberEClass, TCLASS_MEMBER__STATIC);
    createEAttribute(tClassMemberEClass, TCLASS_MEMBER__PARTIAL);
    createEAttribute(tClassMemberEClass, TCLASS_MEMBER__NAME);

    tClassEClass = createEClass(TCLASS);
    createEAttribute(tClassEClass, TCLASS__PARTIAL_SUPER_TYPE);
    createEReference(tClassEClass, TCLASS__MEMBERS);

    tAttributeEClass = createEClass(TATTRIBUTE);
    createEReference(tAttributeEClass, TATTRIBUTE__TYPE);

    tOperationEClass = createEClass(TOPERATION);
    createEAttribute(tOperationEClass, TOPERATION__ABSTRACT);
    createEAttribute(tOperationEClass, TOPERATION__VISIBILITY);
    createEAttribute(tOperationEClass, TOPERATION__PARTIAL_RETURN_TYPE);
    createEReference(tOperationEClass, TOPERATION__RETURN_TYPE);
    createEReference(tOperationEClass, TOPERATION__PARAMETERS);

    tParameterEClass = createEClass(TPARAMETER);
    createEAttribute(tParameterEClass, TPARAMETER__PARTIAL_TYPE);
    createEReference(tParameterEClass, TPARAMETER__TYPE);
    createEAttribute(tParameterEClass, TPARAMETER__NAME);

    tAssociationEClass = createEClass(TASSOCIATION);
    createEReference(tAssociationEClass, TASSOCIATION__FROM_END);
    createEAttribute(tAssociationEClass, TASSOCIATION__REFERENCE_TYPE);
    createEReference(tAssociationEClass, TASSOCIATION__TO_END);

    tAssociationEndEClass = createEClass(TASSOCIATION_END);
    createEAttribute(tAssociationEndEClass, TASSOCIATION_END__LOWER_BOUND);
    createEAttribute(tAssociationEndEClass, TASSOCIATION_END__UPPER_BOUND);
    createEReference(tAssociationEndEClass, TASSOCIATION_END__CLASS_REFERENCE);

    tInstantiationHeaderEClass = createEClass(TINSTANTIATION_HEADER);
    createEAttribute(tInstantiationHeaderEClass, TINSTANTIATION_HEADER__TYPE);
    createEReference(tInstantiationHeaderEClass, TINSTANTIATION_HEADER__EXTERNAL_ASPECTS);

    tClassifierMappingEClass = createEClass(TCLASSIFIER_MAPPING);
    createEAttribute(tClassifierMappingEClass, TCLASSIFIER_MAPPING__PARTIAL_FROM_ELEMENT);
    createEReference(tClassifierMappingEClass, TCLASSIFIER_MAPPING__FROM_MEMBERS);
    createEAttribute(tClassifierMappingEClass, TCLASSIFIER_MAPPING__PARTIAL_TO_ELEMENT);
    createEReference(tClassifierMappingEClass, TCLASSIFIER_MAPPING__TO_MEMBERS);

    tAbstractMessagesEClass = createEClass(TABSTRACT_MESSAGES);
    createEAttribute(tAbstractMessagesEClass, TABSTRACT_MESSAGES__CREATE);
    createEAttribute(tAbstractMessagesEClass, TABSTRACT_MESSAGES__PARTIAL_CLASS);
    createEReference(tAbstractMessagesEClass, TABSTRACT_MESSAGES__CLASS);
    createEAttribute(tAbstractMessagesEClass, TABSTRACT_MESSAGES__PARTIAL_OPERATION);
    createEReference(tAbstractMessagesEClass, TABSTRACT_MESSAGES__SPECIFIES);
    createEReference(tAbstractMessagesEClass, TABSTRACT_MESSAGES__ARGUMENTS);
    createEReference(tAbstractMessagesEClass, TABSTRACT_MESSAGES__INTERACTION_MESSAGES);

    tMessageViewEClass = createEClass(TMESSAGE_VIEW);
    createEReference(tMessageViewEClass, TMESSAGE_VIEW__AFFECTED_BY);

    tAspectMessageViewEClass = createEClass(TASPECT_MESSAGE_VIEW);
    createEAttribute(tAspectMessageViewEClass, TASPECT_MESSAGE_VIEW__NAME);

    tLifelineEClass = createEClass(TLIFELINE);
    createEAttribute(tLifelineEClass, TLIFELINE__STATIC);
    createEAttribute(tLifelineEClass, TLIFELINE__REFERENCE_TYPE);
    createEReference(tLifelineEClass, TLIFELINE__REPRESENTS);
    createEReference(tLifelineEClass, TLIFELINE__LOCAL_PROPERTIES);

    tValueSpecificationEClass = createEClass(TVALUE_SPECIFICATION);

    tDummyValueSpecificationEClass = createEClass(TDUMMY_VALUE_SPECIFICATION);
    createEAttribute(tDummyValueSpecificationEClass, TDUMMY_VALUE_SPECIFICATION__DUMMY);

    tTemporaryPropertyEClass = createEClass(TTEMPORARY_PROPERTY);

    tReferenceEClass = createEClass(TREFERENCE);
    createEAttribute(tReferenceEClass, TREFERENCE__PARTIAL_CLASS);
    createEReference(tReferenceEClass, TREFERENCE__REFERENCE);

    tLocalAttributeEClass = createEClass(TLOCAL_ATTRIBUTE);
    createEReference(tLocalAttributeEClass, TLOCAL_ATTRIBUTE__TYPE);
    createEAttribute(tLocalAttributeEClass, TLOCAL_ATTRIBUTE__VALUE);

    tInteractionEClass = createEClass(TINTERACTION);

    tOcurrenceEClass = createEClass(TOCURRENCE);
    createEReference(tOcurrenceEClass, TOCURRENCE__LEFT_LIFELINE);
    createEAttribute(tOcurrenceEClass, TOCURRENCE__OCURRENCE_TYPE);

    tInteractionMessageEClass = createEClass(TINTERACTION_MESSAGE);
    createEReference(tInteractionMessageEClass, TINTERACTION_MESSAGE__LEFT_LIFELINE);
    createEAttribute(tInteractionMessageEClass, TINTERACTION_MESSAGE__CREATE);
    createEReference(tInteractionMessageEClass, TINTERACTION_MESSAGE__RIGHT_LIFELINE);
    createEReference(tInteractionMessageEClass, TINTERACTION_MESSAGE__MESSAGE);

    tCombinedFragmentEClass = createEClass(TCOMBINED_FRAGMENT);
    createEAttribute(tCombinedFragmentEClass, TCOMBINED_FRAGMENT__INTERACTION_OPERATOR);
    createEAttribute(tCombinedFragmentEClass, TCOMBINED_FRAGMENT__INTERACTION_CONSTRAINT);
    createEReference(tCombinedFragmentEClass, TCOMBINED_FRAGMENT__CONTAINERS);
    createEReference(tCombinedFragmentEClass, TCOMBINED_FRAGMENT__ELSE_CONTAINERS);

    tAbstractMessageEClass = createEClass(TABSTRACT_MESSAGE);
    createEReference(tAbstractMessageEClass, TABSTRACT_MESSAGE__ASSIGN_TO);

    tReturnMessageEClass = createEClass(TRETURN_MESSAGE);

    tMessageEClass = createEClass(TMESSAGE);
    createEAttribute(tMessageEClass, TMESSAGE__PARTIAL_OPERATION);
    createEReference(tMessageEClass, TMESSAGE__SIGNATURE);
    createEReference(tMessageEClass, TMESSAGE__ARGUMENTS);

    tTypedElementEClass = createEClass(TTYPED_ELEMENT);

    tMessageAssignableFeatureEClass = createEClass(TMESSAGE_ASSIGNABLE_FEATURE);
    createEAttribute(tMessageAssignableFeatureEClass, TMESSAGE_ASSIGNABLE_FEATURE__NAME);

    tAbstractMessageViewEClass = createEClass(TABSTRACT_MESSAGE_VIEW);
    createEReference(tAbstractMessageViewEClass, TABSTRACT_MESSAGE_VIEW__LIFELINES);
    createEReference(tAbstractMessageViewEClass, TABSTRACT_MESSAGE_VIEW__MESSAGES);

    // Create enums
    ocurrenceTypeEEnum = createEEnum(OCURRENCE_TYPE);
    tLifelineReferenceTypeEEnum = createEEnum(TLIFELINE_REFERENCE_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    RamPackage theRamPackage = (RamPackage)EPackage.Registry.INSTANCE.getEPackage(RamPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    tAspectEClass.getESuperTypes().add(theRamPackage.getAspect());
    tStructuralViewEClass.getESuperTypes().add(theRamPackage.getStructuralView());
    tClassEClass.getESuperTypes().add(theRamPackage.getClassifier());
    tClassEClass.getESuperTypes().add(theRamPackage.getClass_());
    tClassEClass.getESuperTypes().add(this.getTTypedElement());
    tAttributeEClass.getESuperTypes().add(this.getTClassMember());
    tAttributeEClass.getESuperTypes().add(this.getTTypedElement());
    tOperationEClass.getESuperTypes().add(this.getTClassMember());
    tParameterEClass.getESuperTypes().add(this.getTValueSpecification());
    tAssociationEClass.getESuperTypes().add(this.getTTypedElement());
    tAssociationEClass.getESuperTypes().add(this.getTMessageAssignableFeature());
    tClassifierMappingEClass.getESuperTypes().add(theRamPackage.getClassifierMapping());
    tMessageViewEClass.getESuperTypes().add(this.getTAbstractMessages());
    tAspectMessageViewEClass.getESuperTypes().add(this.getTAbstractMessages());
    tLifelineEClass.getESuperTypes().add(this.getTValueSpecification());
    tLifelineEClass.getESuperTypes().add(this.getTMessageAssignableFeature());
    tDummyValueSpecificationEClass.getESuperTypes().add(this.getTValueSpecification());
    tTemporaryPropertyEClass.getESuperTypes().add(this.getTValueSpecification());
    tTemporaryPropertyEClass.getESuperTypes().add(this.getTMessageAssignableFeature());
    tReferenceEClass.getESuperTypes().add(this.getTTemporaryProperty());
    tLocalAttributeEClass.getESuperTypes().add(this.getTTemporaryProperty());
    tOcurrenceEClass.getESuperTypes().add(this.getTInteraction());
    tInteractionMessageEClass.getESuperTypes().add(this.getTInteraction());
    tCombinedFragmentEClass.getESuperTypes().add(this.getTInteraction());
    tReturnMessageEClass.getESuperTypes().add(this.getTAbstractMessage());
    tMessageEClass.getESuperTypes().add(this.getTAbstractMessage());
    tAbstractMessageViewEClass.getESuperTypes().add(theRamPackage.getAbstractMessageView());

    // Initialize classes and features; add operations and parameters
    initEClass(tAspectEClass, TAspect.class, "TAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTAspect_HeaderInstantiations(), this.getTInstantiationHeader(), null, "headerInstantiations", null, 0, -1, TAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tStructuralViewEClass, TStructuralView.class, "TStructuralView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTStructuralView_TAssociations(), this.getTAssociation(), null, "tAssociations", null, 0, -1, TStructuralView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tClassMemberEClass, TClassMember.class, "TClassMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTClassMember_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, TClassMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTClassMember_Partial(), ecorePackage.getEBoolean(), "partial", null, 0, 1, TClassMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTClassMember_Name(), ecorePackage.getEString(), "name", null, 0, 1, TClassMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tClassEClass, TClass.class, "TClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTClass_PartialSuperType(), ecorePackage.getEBoolean(), "partialSuperType", null, 0, 1, TClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTClass_Members(), this.getTClassMember(), null, "members", null, 0, -1, TClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tAttributeEClass, TAttribute.class, "TAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTAttribute_Type(), theRamPackage.getPrimitiveType(), null, "type", null, 0, 1, TAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tOperationEClass, TOperation.class, "TOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTOperation_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, TOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTOperation_Visibility(), theRamPackage.getVisibility(), "visibility", null, 0, 1, TOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTOperation_PartialReturnType(), ecorePackage.getEBoolean(), "partialReturnType", null, 0, 1, TOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTOperation_ReturnType(), theRamPackage.getType(), null, "returnType", null, 0, 1, TOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTOperation_Parameters(), this.getTParameter(), null, "parameters", null, 0, -1, TOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tParameterEClass, TParameter.class, "TParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTParameter_PartialType(), ecorePackage.getEBoolean(), "partialType", null, 0, 1, TParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTParameter_Type(), theRamPackage.getType(), null, "type", null, 0, 1, TParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, TParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tAssociationEClass, TAssociation.class, "TAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTAssociation_FromEnd(), this.getTAssociationEnd(), null, "fromEnd", null, 0, 1, TAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTAssociation_ReferenceType(), theRamPackage.getReferenceType(), "referenceType", null, 0, 1, TAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTAssociation_ToEnd(), this.getTAssociationEnd(), null, "toEnd", null, 0, 1, TAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tAssociationEndEClass, TAssociationEnd.class, "TAssociationEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTAssociationEnd_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1, TAssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTAssociationEnd_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 0, 1, TAssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTAssociationEnd_ClassReference(), theRamPackage.getClass_(), null, "classReference", null, 0, 1, TAssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tInstantiationHeaderEClass, TInstantiationHeader.class, "TInstantiationHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTInstantiationHeader_Type(), theRamPackage.getInstantiationType(), "type", null, 0, 1, TInstantiationHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTInstantiationHeader_ExternalAspects(), theRamPackage.getAspect(), null, "externalAspects", null, 0, -1, TInstantiationHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tClassifierMappingEClass, TClassifierMapping.class, "TClassifierMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTClassifierMapping_PartialFromElement(), ecorePackage.getEBoolean(), "partialFromElement", null, 0, 1, TClassifierMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTClassifierMapping_FromMembers(), this.getTClassMember(), null, "fromMembers", null, 0, -1, TClassifierMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTClassifierMapping_PartialToElement(), ecorePackage.getEBoolean(), "partialToElement", null, 0, 1, TClassifierMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTClassifierMapping_ToMembers(), this.getTClassMember(), null, "toMembers", null, 0, -1, TClassifierMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tAbstractMessagesEClass, TAbstractMessages.class, "TAbstractMessages", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTAbstractMessages_Create(), ecorePackage.getEBoolean(), "create", null, 0, 1, TAbstractMessages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTAbstractMessages_PartialClass(), ecorePackage.getEBoolean(), "partialClass", null, 0, 1, TAbstractMessages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTAbstractMessages_Class(), this.getTClass(), null, "class", null, 0, 1, TAbstractMessages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTAbstractMessages_PartialOperation(), ecorePackage.getEBoolean(), "partialOperation", null, 0, 1, TAbstractMessages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTAbstractMessages_Specifies(), this.getTOperation(), null, "specifies", null, 0, 1, TAbstractMessages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTAbstractMessages_Arguments(), this.getTParameter(), null, "arguments", null, 0, -1, TAbstractMessages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTAbstractMessages_InteractionMessages(), this.getTInteraction(), null, "interactionMessages", null, 0, -1, TAbstractMessages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tMessageViewEClass, TMessageView.class, "TMessageView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTMessageView_AffectedBy(), this.getTAspectMessageView(), null, "affectedBy", null, 0, -1, TMessageView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tAspectMessageViewEClass, TAspectMessageView.class, "TAspectMessageView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTAspectMessageView_Name(), ecorePackage.getEString(), "name", null, 0, 1, TAspectMessageView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tLifelineEClass, TLifeline.class, "TLifeline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTLifeline_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, TLifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTLifeline_ReferenceType(), this.getTLifelineReferenceType(), "referenceType", null, 0, 1, TLifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTLifeline_Represents(), this.getTTypedElement(), null, "represents", null, 0, 1, TLifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTLifeline_LocalProperties(), this.getTTemporaryProperty(), null, "localProperties", null, 0, -1, TLifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tValueSpecificationEClass, TValueSpecification.class, "TValueSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tDummyValueSpecificationEClass, TDummyValueSpecification.class, "TDummyValueSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTDummyValueSpecification_Dummy(), ecorePackage.getEBoolean(), "dummy", null, 0, 1, TDummyValueSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tTemporaryPropertyEClass, TTemporaryProperty.class, "TTemporaryProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tReferenceEClass, TReference.class, "TReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTReference_PartialClass(), ecorePackage.getEBoolean(), "partialClass", null, 0, 1, TReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTReference_Reference(), this.getTClass(), null, "reference", null, 0, 1, TReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tLocalAttributeEClass, TLocalAttribute.class, "TLocalAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTLocalAttribute_Type(), theRamPackage.getPrimitiveType(), null, "type", null, 0, 1, TLocalAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTLocalAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, TLocalAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tInteractionEClass, TInteraction.class, "TInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tOcurrenceEClass, TOcurrence.class, "TOcurrence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTOcurrence_LeftLifeline(), this.getTLifeline(), null, "leftLifeline", null, 0, 1, TOcurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTOcurrence_OcurrenceType(), this.getOcurrenceType(), "ocurrenceType", null, 0, 1, TOcurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tInteractionMessageEClass, TInteractionMessage.class, "TInteractionMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTInteractionMessage_LeftLifeline(), this.getTLifeline(), null, "leftLifeline", null, 0, 1, TInteractionMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTInteractionMessage_Create(), ecorePackage.getEBoolean(), "create", null, 0, 1, TInteractionMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTInteractionMessage_RightLifeline(), this.getTLifeline(), null, "rightLifeline", null, 0, 1, TInteractionMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTInteractionMessage_Message(), this.getTAbstractMessage(), null, "message", null, 0, 1, TInteractionMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tCombinedFragmentEClass, TCombinedFragment.class, "TCombinedFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTCombinedFragment_InteractionOperator(), theRamPackage.getInteractionOperatorKind(), "interactionOperator", null, 0, 1, TCombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTCombinedFragment_InteractionConstraint(), ecorePackage.getEString(), "interactionConstraint", null, 0, 1, TCombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTCombinedFragment_Containers(), this.getTInteraction(), null, "containers", null, 0, -1, TCombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTCombinedFragment_ElseContainers(), this.getTInteraction(), null, "elseContainers", null, 0, -1, TCombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tAbstractMessageEClass, TAbstractMessage.class, "TAbstractMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTAbstractMessage_AssignTo(), this.getTMessageAssignableFeature(), null, "assignTo", null, 0, 1, TAbstractMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tReturnMessageEClass, TReturnMessage.class, "TReturnMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tMessageEClass, TMessage.class, "TMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTMessage_PartialOperation(), ecorePackage.getEBoolean(), "partialOperation", null, 0, 1, TMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTMessage_Signature(), this.getTOperation(), null, "signature", null, 0, 1, TMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTMessage_Arguments(), this.getTValueSpecification(), null, "arguments", null, 0, -1, TMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tTypedElementEClass, TTypedElement.class, "TTypedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tMessageAssignableFeatureEClass, TMessageAssignableFeature.class, "TMessageAssignableFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTMessageAssignableFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, TMessageAssignableFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tAbstractMessageViewEClass, TAbstractMessageView.class, "TAbstractMessageView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTAbstractMessageView_Lifelines(), this.getTLifeline(), null, "lifelines", null, 0, -1, TAbstractMessageView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTAbstractMessageView_Messages(), this.getTAbstractMessages(), null, "messages", null, 0, -1, TAbstractMessageView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(ocurrenceTypeEEnum, OcurrenceType.class, "OcurrenceType");
    addEEnumLiteral(ocurrenceTypeEEnum, OcurrenceType.ORIGINAL);
    addEEnumLiteral(ocurrenceTypeEEnum, OcurrenceType.DESTRUCTION);

    initEEnum(tLifelineReferenceTypeEEnum, TLifelineReferenceType.class, "TLifelineReferenceType");
    addEEnumLiteral(tLifelineReferenceTypeEEnum, TLifelineReferenceType.REFERENCE);
    addEEnumLiteral(tLifelineReferenceTypeEEnum, TLifelineReferenceType.ASSOCIATION);
    addEEnumLiteral(tLifelineReferenceTypeEEnum, TLifelineReferenceType.ATTRIBUTE);

    // Create resource
    createResource(eNS_URI);
  }

} //TextRamPackageImpl
