/**
 */
package cl.uchile.pleiad.textRam;

import ca.mcgill.cs.sel.ram.RamPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cl.uchile.pleiad.textRam.TextRamFactory
 * @model kind="package"
 * @generated
 */
public interface TextRamPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "textRam";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://cl.pleiad.textram/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "textRam";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TextRamPackage eINSTANCE = cl.uchile.pleiad.textRam.impl.TextRamPackageImpl.init();

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TAspectImpl <em>TAspect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TAspectImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTAspect()
   * @generated
   */
  int TASPECT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASPECT__NAME = RamPackage.ASPECT__NAME;

  /**
   * The feature id for the '<em><b>Structural View</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASPECT__STRUCTURAL_VIEW = RamPackage.ASPECT__STRUCTURAL_VIEW;

  /**
   * The feature id for the '<em><b>Mandatory Aspect Parameters</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASPECT__MANDATORY_ASPECT_PARAMETERS = RamPackage.ASPECT__MANDATORY_ASPECT_PARAMETERS;

  /**
   * The feature id for the '<em><b>Message Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASPECT__MESSAGE_VIEWS = RamPackage.ASPECT__MESSAGE_VIEWS;

  /**
   * The feature id for the '<em><b>Instantiations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASPECT__INSTANTIATIONS = RamPackage.ASPECT__INSTANTIATIONS;

  /**
   * The feature id for the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASPECT__LAYOUT = RamPackage.ASPECT__LAYOUT;

  /**
   * The feature id for the '<em><b>State Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASPECT__STATE_VIEWS = RamPackage.ASPECT__STATE_VIEWS;

  /**
   * The feature id for the '<em><b>Header Instantiations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASPECT__HEADER_INSTANTIATIONS = RamPackage.ASPECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>TAspect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASPECT_FEATURE_COUNT = RamPackage.ASPECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TStructuralViewImpl <em>TStructural View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TStructuralViewImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTStructuralView()
   * @generated
   */
  int TSTRUCTURAL_VIEW = 1;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TSTRUCTURAL_VIEW__CLASSES = RamPackage.STRUCTURAL_VIEW__CLASSES;

  /**
   * The feature id for the '<em><b>Associations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TSTRUCTURAL_VIEW__ASSOCIATIONS = RamPackage.STRUCTURAL_VIEW__ASSOCIATIONS;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TSTRUCTURAL_VIEW__TYPES = RamPackage.STRUCTURAL_VIEW__TYPES;

  /**
   * The feature id for the '<em><b>TAssociations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TSTRUCTURAL_VIEW__TASSOCIATIONS = RamPackage.STRUCTURAL_VIEW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>TStructural View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TSTRUCTURAL_VIEW_FEATURE_COUNT = RamPackage.STRUCTURAL_VIEW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TClassMemberImpl <em>TClass Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TClassMemberImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTClassMember()
   * @generated
   */
  int TCLASS_MEMBER = 2;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASS_MEMBER__STATIC = 0;

  /**
   * The feature id for the '<em><b>Partial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASS_MEMBER__PARTIAL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASS_MEMBER__NAME = 2;

  /**
   * The number of structural features of the '<em>TClass Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASS_MEMBER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TClassImpl <em>TClass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TClassImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTClass()
   * @generated
   */
  int TCLASS = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASS__NAME = RamPackage.CLASSIFIER__NAME;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASS__OPERATIONS = RamPackage.CLASSIFIER__OPERATIONS;

  /**
   * The feature id for the '<em><b>Association Ends</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASS__ASSOCIATION_ENDS = RamPackage.CLASSIFIER__ASSOCIATION_ENDS;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASS__TYPE_PARAMETERS = RamPackage.CLASSIFIER__TYPE_PARAMETERS;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASS__ATTRIBUTES = RamPackage.CLASSIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Partial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASS__PARTIAL = RamPackage.CLASSIFIER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASS__ABSTRACT = RamPackage.CLASSIFIER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Super Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASS__SUPER_TYPES = RamPackage.CLASSIFIER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Partial Super Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASS__PARTIAL_SUPER_TYPE = RamPackage.CLASSIFIER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASS__MEMBERS = RamPackage.CLASSIFIER_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>TClass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASS_FEATURE_COUNT = RamPackage.CLASSIFIER_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TAttributeImpl <em>TAttribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TAttributeImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTAttribute()
   * @generated
   */
  int TATTRIBUTE = 4;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TATTRIBUTE__STATIC = TCLASS_MEMBER__STATIC;

  /**
   * The feature id for the '<em><b>Partial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TATTRIBUTE__PARTIAL = TCLASS_MEMBER__PARTIAL;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TATTRIBUTE__NAME = TCLASS_MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TATTRIBUTE__TYPE = TCLASS_MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>TAttribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TATTRIBUTE_FEATURE_COUNT = TCLASS_MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TOperationImpl <em>TOperation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TOperationImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTOperation()
   * @generated
   */
  int TOPERATION = 5;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPERATION__STATIC = TCLASS_MEMBER__STATIC;

  /**
   * The feature id for the '<em><b>Partial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPERATION__PARTIAL = TCLASS_MEMBER__PARTIAL;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPERATION__NAME = TCLASS_MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPERATION__ABSTRACT = TCLASS_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPERATION__VISIBILITY = TCLASS_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Partial Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPERATION__PARTIAL_RETURN_TYPE = TCLASS_MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPERATION__RETURN_TYPE = TCLASS_MEMBER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPERATION__PARAMETERS = TCLASS_MEMBER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>TOperation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPERATION_FEATURE_COUNT = TCLASS_MEMBER_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TValueSpecificationImpl <em>TValue Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TValueSpecificationImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTValueSpecification()
   * @generated
   */
  int TVALUE_SPECIFICATION = 15;

  /**
   * The number of structural features of the '<em>TValue Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TVALUE_SPECIFICATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TParameterImpl <em>TParameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TParameterImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTParameter()
   * @generated
   */
  int TPARAMETER = 6;

  /**
   * The feature id for the '<em><b>Partial Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPARAMETER__PARTIAL_TYPE = TVALUE_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPARAMETER__TYPE = TVALUE_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPARAMETER__NAME = TVALUE_SPECIFICATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>TParameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TPARAMETER_FEATURE_COUNT = TVALUE_SPECIFICATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TTypedElementImpl <em>TTyped Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TTypedElementImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTTypedElement()
   * @generated
   */
  int TTYPED_ELEMENT = 27;

  /**
   * The number of structural features of the '<em>TTyped Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TTYPED_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TAssociationImpl <em>TAssociation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TAssociationImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTAssociation()
   * @generated
   */
  int TASSOCIATION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASSOCIATION__NAME = TTYPED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>From End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASSOCIATION__FROM_END = TTYPED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Reference Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASSOCIATION__REFERENCE_TYPE = TTYPED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>To End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASSOCIATION__TO_END = TTYPED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>TAssociation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASSOCIATION_FEATURE_COUNT = TTYPED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TAssociationEndImpl <em>TAssociation End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TAssociationEndImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTAssociationEnd()
   * @generated
   */
  int TASSOCIATION_END = 8;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASSOCIATION_END__LOWER_BOUND = 0;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASSOCIATION_END__UPPER_BOUND = 1;

  /**
   * The feature id for the '<em><b>Class Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASSOCIATION_END__CLASS_REFERENCE = 2;

  /**
   * The number of structural features of the '<em>TAssociation End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASSOCIATION_END_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TInstantiationHeaderImpl <em>TInstantiation Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TInstantiationHeaderImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTInstantiationHeader()
   * @generated
   */
  int TINSTANTIATION_HEADER = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TINSTANTIATION_HEADER__TYPE = 0;

  /**
   * The feature id for the '<em><b>External Aspects</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TINSTANTIATION_HEADER__EXTERNAL_ASPECTS = 1;

  /**
   * The number of structural features of the '<em>TInstantiation Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TINSTANTIATION_HEADER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TClassifierMappingImpl <em>TClassifier Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TClassifierMappingImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTClassifierMapping()
   * @generated
   */
  int TCLASSIFIER_MAPPING = 10;

  /**
   * The feature id for the '<em><b>Operation Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASSIFIER_MAPPING__OPERATION_MAPPINGS = RamPackage.CLASSIFIER_MAPPING__OPERATION_MAPPINGS;

  /**
   * The feature id for the '<em><b>Attribute Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASSIFIER_MAPPING__ATTRIBUTE_MAPPINGS = RamPackage.CLASSIFIER_MAPPING__ATTRIBUTE_MAPPINGS;

  /**
   * The feature id for the '<em><b>From Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASSIFIER_MAPPING__FROM_ELEMENT = RamPackage.CLASSIFIER_MAPPING__FROM_ELEMENT;

  /**
   * The feature id for the '<em><b>To Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASSIFIER_MAPPING__TO_ELEMENT = RamPackage.CLASSIFIER_MAPPING__TO_ELEMENT;

  /**
   * The feature id for the '<em><b>Partial From Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASSIFIER_MAPPING__PARTIAL_FROM_ELEMENT = RamPackage.CLASSIFIER_MAPPING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>From Members</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASSIFIER_MAPPING__FROM_MEMBERS = RamPackage.CLASSIFIER_MAPPING_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Partial To Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASSIFIER_MAPPING__PARTIAL_TO_ELEMENT = RamPackage.CLASSIFIER_MAPPING_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>To Members</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASSIFIER_MAPPING__TO_MEMBERS = RamPackage.CLASSIFIER_MAPPING_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>TClassifier Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCLASSIFIER_MAPPING_FEATURE_COUNT = RamPackage.CLASSIFIER_MAPPING_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TAbstractMessagesImpl <em>TAbstract Messages</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TAbstractMessagesImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTAbstractMessages()
   * @generated
   */
  int TABSTRACT_MESSAGES = 11;

  /**
   * The feature id for the '<em><b>Create</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABSTRACT_MESSAGES__CREATE = 0;

  /**
   * The feature id for the '<em><b>Partial Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABSTRACT_MESSAGES__PARTIAL_CLASS = 1;

  /**
   * The feature id for the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABSTRACT_MESSAGES__CLASS = 2;

  /**
   * The feature id for the '<em><b>Partial Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABSTRACT_MESSAGES__PARTIAL_OPERATION = 3;

  /**
   * The feature id for the '<em><b>Specifies</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABSTRACT_MESSAGES__SPECIFIES = 4;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABSTRACT_MESSAGES__ARGUMENTS = 5;

  /**
   * The feature id for the '<em><b>Interaction Messages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABSTRACT_MESSAGES__INTERACTION_MESSAGES = 6;

  /**
   * The number of structural features of the '<em>TAbstract Messages</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABSTRACT_MESSAGES_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TMessageViewImpl <em>TMessage View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TMessageViewImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTMessageView()
   * @generated
   */
  int TMESSAGE_VIEW = 12;

  /**
   * The feature id for the '<em><b>Create</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TMESSAGE_VIEW__CREATE = TABSTRACT_MESSAGES__CREATE;

  /**
   * The feature id for the '<em><b>Partial Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TMESSAGE_VIEW__PARTIAL_CLASS = TABSTRACT_MESSAGES__PARTIAL_CLASS;

  /**
   * The feature id for the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TMESSAGE_VIEW__CLASS = TABSTRACT_MESSAGES__CLASS;

  /**
   * The feature id for the '<em><b>Partial Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TMESSAGE_VIEW__PARTIAL_OPERATION = TABSTRACT_MESSAGES__PARTIAL_OPERATION;

  /**
   * The feature id for the '<em><b>Specifies</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TMESSAGE_VIEW__SPECIFIES = TABSTRACT_MESSAGES__SPECIFIES;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TMESSAGE_VIEW__ARGUMENTS = TABSTRACT_MESSAGES__ARGUMENTS;

  /**
   * The feature id for the '<em><b>Interaction Messages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TMESSAGE_VIEW__INTERACTION_MESSAGES = TABSTRACT_MESSAGES__INTERACTION_MESSAGES;

  /**
   * The feature id for the '<em><b>Affected By</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TMESSAGE_VIEW__AFFECTED_BY = TABSTRACT_MESSAGES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>TMessage View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TMESSAGE_VIEW_FEATURE_COUNT = TABSTRACT_MESSAGES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TAspectMessageViewImpl <em>TAspect Message View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TAspectMessageViewImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTAspectMessageView()
   * @generated
   */
  int TASPECT_MESSAGE_VIEW = 13;

  /**
   * The feature id for the '<em><b>Create</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASPECT_MESSAGE_VIEW__CREATE = TABSTRACT_MESSAGES__CREATE;

  /**
   * The feature id for the '<em><b>Partial Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASPECT_MESSAGE_VIEW__PARTIAL_CLASS = TABSTRACT_MESSAGES__PARTIAL_CLASS;

  /**
   * The feature id for the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASPECT_MESSAGE_VIEW__CLASS = TABSTRACT_MESSAGES__CLASS;

  /**
   * The feature id for the '<em><b>Partial Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASPECT_MESSAGE_VIEW__PARTIAL_OPERATION = TABSTRACT_MESSAGES__PARTIAL_OPERATION;

  /**
   * The feature id for the '<em><b>Specifies</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASPECT_MESSAGE_VIEW__SPECIFIES = TABSTRACT_MESSAGES__SPECIFIES;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASPECT_MESSAGE_VIEW__ARGUMENTS = TABSTRACT_MESSAGES__ARGUMENTS;

  /**
   * The feature id for the '<em><b>Interaction Messages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASPECT_MESSAGE_VIEW__INTERACTION_MESSAGES = TABSTRACT_MESSAGES__INTERACTION_MESSAGES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASPECT_MESSAGE_VIEW__NAME = TABSTRACT_MESSAGES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>TAspect Message View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASPECT_MESSAGE_VIEW_FEATURE_COUNT = TABSTRACT_MESSAGES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TLifelineImpl <em>TLifeline</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TLifelineImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTLifeline()
   * @generated
   */
  int TLIFELINE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TLIFELINE__NAME = TVALUE_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TLIFELINE__STATIC = TVALUE_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Reference Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TLIFELINE__REFERENCE_TYPE = TVALUE_SPECIFICATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Represents</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TLIFELINE__REPRESENTS = TVALUE_SPECIFICATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Local Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TLIFELINE__LOCAL_PROPERTIES = TVALUE_SPECIFICATION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>TLifeline</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TLIFELINE_FEATURE_COUNT = TVALUE_SPECIFICATION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TDummyValueSpecificationImpl <em>TDummy Value Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TDummyValueSpecificationImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTDummyValueSpecification()
   * @generated
   */
  int TDUMMY_VALUE_SPECIFICATION = 16;

  /**
   * The feature id for the '<em><b>Dummy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TDUMMY_VALUE_SPECIFICATION__DUMMY = TVALUE_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>TDummy Value Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TDUMMY_VALUE_SPECIFICATION_FEATURE_COUNT = TVALUE_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TTemporaryPropertyImpl <em>TTemporary Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TTemporaryPropertyImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTTemporaryProperty()
   * @generated
   */
  int TTEMPORARY_PROPERTY = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TTEMPORARY_PROPERTY__NAME = TVALUE_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>TTemporary Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TTEMPORARY_PROPERTY_FEATURE_COUNT = TVALUE_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TReferenceImpl <em>TReference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TReferenceImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTReference()
   * @generated
   */
  int TREFERENCE = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREFERENCE__NAME = TTEMPORARY_PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Partial Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREFERENCE__PARTIAL_CLASS = TTEMPORARY_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREFERENCE__REFERENCE = TTEMPORARY_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>TReference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREFERENCE_FEATURE_COUNT = TTEMPORARY_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TLocalAttributeImpl <em>TLocal Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TLocalAttributeImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTLocalAttribute()
   * @generated
   */
  int TLOCAL_ATTRIBUTE = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TLOCAL_ATTRIBUTE__NAME = TTEMPORARY_PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TLOCAL_ATTRIBUTE__TYPE = TTEMPORARY_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TLOCAL_ATTRIBUTE__VALUE = TTEMPORARY_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>TLocal Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TLOCAL_ATTRIBUTE_FEATURE_COUNT = TTEMPORARY_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TInteractionImpl <em>TInteraction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TInteractionImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTInteraction()
   * @generated
   */
  int TINTERACTION = 20;

  /**
   * The number of structural features of the '<em>TInteraction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TINTERACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TOcurrenceImpl <em>TOcurrence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TOcurrenceImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTOcurrence()
   * @generated
   */
  int TOCURRENCE = 21;

  /**
   * The feature id for the '<em><b>Left Lifeline</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOCURRENCE__LEFT_LIFELINE = TINTERACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ocurrence Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOCURRENCE__OCURRENCE_TYPE = TINTERACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>TOcurrence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOCURRENCE_FEATURE_COUNT = TINTERACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TInteractionMessageImpl <em>TInteraction Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TInteractionMessageImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTInteractionMessage()
   * @generated
   */
  int TINTERACTION_MESSAGE = 22;

  /**
   * The feature id for the '<em><b>Left Lifeline</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TINTERACTION_MESSAGE__LEFT_LIFELINE = TINTERACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Create</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TINTERACTION_MESSAGE__CREATE = TINTERACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Lifeline</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TINTERACTION_MESSAGE__RIGHT_LIFELINE = TINTERACTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Message</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TINTERACTION_MESSAGE__MESSAGE = TINTERACTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>TInteraction Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TINTERACTION_MESSAGE_FEATURE_COUNT = TINTERACTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TCombinedFragmentImpl <em>TCombined Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TCombinedFragmentImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTCombinedFragment()
   * @generated
   */
  int TCOMBINED_FRAGMENT = 23;

  /**
   * The feature id for the '<em><b>Interaction Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMBINED_FRAGMENT__INTERACTION_OPERATOR = TINTERACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Interaction Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMBINED_FRAGMENT__INTERACTION_CONSTRAINT = TINTERACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Containers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMBINED_FRAGMENT__CONTAINERS = TINTERACTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Else Containers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMBINED_FRAGMENT__ELSE_CONTAINERS = TINTERACTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>TCombined Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TCOMBINED_FRAGMENT_FEATURE_COUNT = TINTERACTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TAbstractMessageImpl <em>TAbstract Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TAbstractMessageImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTAbstractMessage()
   * @generated
   */
  int TABSTRACT_MESSAGE = 24;

  /**
   * The feature id for the '<em><b>Assign To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABSTRACT_MESSAGE__ASSIGN_TO = 0;

  /**
   * The number of structural features of the '<em>TAbstract Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABSTRACT_MESSAGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TReturnMessageImpl <em>TReturn Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TReturnMessageImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTReturnMessage()
   * @generated
   */
  int TRETURN_MESSAGE = 25;

  /**
   * The feature id for the '<em><b>Assign To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRETURN_MESSAGE__ASSIGN_TO = TABSTRACT_MESSAGE__ASSIGN_TO;

  /**
   * The number of structural features of the '<em>TReturn Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRETURN_MESSAGE_FEATURE_COUNT = TABSTRACT_MESSAGE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TMessageImpl <em>TMessage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TMessageImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTMessage()
   * @generated
   */
  int TMESSAGE = 26;

  /**
   * The feature id for the '<em><b>Assign To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TMESSAGE__ASSIGN_TO = TABSTRACT_MESSAGE__ASSIGN_TO;

  /**
   * The feature id for the '<em><b>Partial Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TMESSAGE__PARTIAL_OPERATION = TABSTRACT_MESSAGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Signature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TMESSAGE__SIGNATURE = TABSTRACT_MESSAGE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TMESSAGE__ARGUMENTS = TABSTRACT_MESSAGE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>TMessage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TMESSAGE_FEATURE_COUNT = TABSTRACT_MESSAGE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TMessageAssignableFeatureImpl <em>TMessage Assignable Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TMessageAssignableFeatureImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTMessageAssignableFeature()
   * @generated
   */
  int TMESSAGE_ASSIGNABLE_FEATURE = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TMESSAGE_ASSIGNABLE_FEATURE__NAME = 0;

  /**
   * The number of structural features of the '<em>TMessage Assignable Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TMESSAGE_ASSIGNABLE_FEATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.impl.TAbstractMessageViewImpl <em>TAbstract Message View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.impl.TAbstractMessageViewImpl
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTAbstractMessageView()
   * @generated
   */
  int TABSTRACT_MESSAGE_VIEW = 29;

  /**
   * The feature id for the '<em><b>Affected By</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABSTRACT_MESSAGE_VIEW__AFFECTED_BY = RamPackage.ABSTRACT_MESSAGE_VIEW__AFFECTED_BY;

  /**
   * The feature id for the '<em><b>Lifelines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABSTRACT_MESSAGE_VIEW__LIFELINES = RamPackage.ABSTRACT_MESSAGE_VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Messages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABSTRACT_MESSAGE_VIEW__MESSAGES = RamPackage.ABSTRACT_MESSAGE_VIEW_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>TAbstract Message View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABSTRACT_MESSAGE_VIEW_FEATURE_COUNT = RamPackage.ABSTRACT_MESSAGE_VIEW_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.OcurrenceType <em>Ocurrence Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.OcurrenceType
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getOcurrenceType()
   * @generated
   */
  int OCURRENCE_TYPE = 30;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRam.TLifelineReferenceType <em>TLifeline Reference Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRam.TLifelineReferenceType
   * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTLifelineReferenceType()
   * @generated
   */
  int TLIFELINE_REFERENCE_TYPE = 31;


  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TAspect <em>TAspect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TAspect</em>'.
   * @see cl.uchile.pleiad.textRam.TAspect
   * @generated
   */
  EClass getTAspect();

  /**
   * Returns the meta object for the containment reference list '{@link cl.uchile.pleiad.textRam.TAspect#getHeaderInstantiations <em>Header Instantiations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Header Instantiations</em>'.
   * @see cl.uchile.pleiad.textRam.TAspect#getHeaderInstantiations()
   * @see #getTAspect()
   * @generated
   */
  EReference getTAspect_HeaderInstantiations();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TStructuralView <em>TStructural View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TStructural View</em>'.
   * @see cl.uchile.pleiad.textRam.TStructuralView
   * @generated
   */
  EClass getTStructuralView();

  /**
   * Returns the meta object for the containment reference list '{@link cl.uchile.pleiad.textRam.TStructuralView#getTAssociations <em>TAssociations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>TAssociations</em>'.
   * @see cl.uchile.pleiad.textRam.TStructuralView#getTAssociations()
   * @see #getTStructuralView()
   * @generated
   */
  EReference getTStructuralView_TAssociations();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TClassMember <em>TClass Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TClass Member</em>'.
   * @see cl.uchile.pleiad.textRam.TClassMember
   * @generated
   */
  EClass getTClassMember();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TClassMember#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see cl.uchile.pleiad.textRam.TClassMember#isStatic()
   * @see #getTClassMember()
   * @generated
   */
  EAttribute getTClassMember_Static();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TClassMember#isPartial <em>Partial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partial</em>'.
   * @see cl.uchile.pleiad.textRam.TClassMember#isPartial()
   * @see #getTClassMember()
   * @generated
   */
  EAttribute getTClassMember_Partial();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TClassMember#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cl.uchile.pleiad.textRam.TClassMember#getName()
   * @see #getTClassMember()
   * @generated
   */
  EAttribute getTClassMember_Name();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TClass <em>TClass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TClass</em>'.
   * @see cl.uchile.pleiad.textRam.TClass
   * @generated
   */
  EClass getTClass();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TClass#isPartialSuperType <em>Partial Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partial Super Type</em>'.
   * @see cl.uchile.pleiad.textRam.TClass#isPartialSuperType()
   * @see #getTClass()
   * @generated
   */
  EAttribute getTClass_PartialSuperType();

  /**
   * Returns the meta object for the containment reference list '{@link cl.uchile.pleiad.textRam.TClass#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see cl.uchile.pleiad.textRam.TClass#getMembers()
   * @see #getTClass()
   * @generated
   */
  EReference getTClass_Members();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TAttribute <em>TAttribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TAttribute</em>'.
   * @see cl.uchile.pleiad.textRam.TAttribute
   * @generated
   */
  EClass getTAttribute();

  /**
   * Returns the meta object for the reference '{@link cl.uchile.pleiad.textRam.TAttribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see cl.uchile.pleiad.textRam.TAttribute#getType()
   * @see #getTAttribute()
   * @generated
   */
  EReference getTAttribute_Type();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TOperation <em>TOperation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TOperation</em>'.
   * @see cl.uchile.pleiad.textRam.TOperation
   * @generated
   */
  EClass getTOperation();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TOperation#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see cl.uchile.pleiad.textRam.TOperation#isAbstract()
   * @see #getTOperation()
   * @generated
   */
  EAttribute getTOperation_Abstract();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TOperation#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see cl.uchile.pleiad.textRam.TOperation#getVisibility()
   * @see #getTOperation()
   * @generated
   */
  EAttribute getTOperation_Visibility();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TOperation#isPartialReturnType <em>Partial Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partial Return Type</em>'.
   * @see cl.uchile.pleiad.textRam.TOperation#isPartialReturnType()
   * @see #getTOperation()
   * @generated
   */
  EAttribute getTOperation_PartialReturnType();

  /**
   * Returns the meta object for the reference '{@link cl.uchile.pleiad.textRam.TOperation#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Return Type</em>'.
   * @see cl.uchile.pleiad.textRam.TOperation#getReturnType()
   * @see #getTOperation()
   * @generated
   */
  EReference getTOperation_ReturnType();

  /**
   * Returns the meta object for the containment reference list '{@link cl.uchile.pleiad.textRam.TOperation#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see cl.uchile.pleiad.textRam.TOperation#getParameters()
   * @see #getTOperation()
   * @generated
   */
  EReference getTOperation_Parameters();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TParameter <em>TParameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TParameter</em>'.
   * @see cl.uchile.pleiad.textRam.TParameter
   * @generated
   */
  EClass getTParameter();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TParameter#isPartialType <em>Partial Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partial Type</em>'.
   * @see cl.uchile.pleiad.textRam.TParameter#isPartialType()
   * @see #getTParameter()
   * @generated
   */
  EAttribute getTParameter_PartialType();

  /**
   * Returns the meta object for the reference '{@link cl.uchile.pleiad.textRam.TParameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see cl.uchile.pleiad.textRam.TParameter#getType()
   * @see #getTParameter()
   * @generated
   */
  EReference getTParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cl.uchile.pleiad.textRam.TParameter#getName()
   * @see #getTParameter()
   * @generated
   */
  EAttribute getTParameter_Name();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TAssociation <em>TAssociation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TAssociation</em>'.
   * @see cl.uchile.pleiad.textRam.TAssociation
   * @generated
   */
  EClass getTAssociation();

  /**
   * Returns the meta object for the containment reference '{@link cl.uchile.pleiad.textRam.TAssociation#getFromEnd <em>From End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From End</em>'.
   * @see cl.uchile.pleiad.textRam.TAssociation#getFromEnd()
   * @see #getTAssociation()
   * @generated
   */
  EReference getTAssociation_FromEnd();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TAssociation#getReferenceType <em>Reference Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference Type</em>'.
   * @see cl.uchile.pleiad.textRam.TAssociation#getReferenceType()
   * @see #getTAssociation()
   * @generated
   */
  EAttribute getTAssociation_ReferenceType();

  /**
   * Returns the meta object for the containment reference '{@link cl.uchile.pleiad.textRam.TAssociation#getToEnd <em>To End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To End</em>'.
   * @see cl.uchile.pleiad.textRam.TAssociation#getToEnd()
   * @see #getTAssociation()
   * @generated
   */
  EReference getTAssociation_ToEnd();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TAssociationEnd <em>TAssociation End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TAssociation End</em>'.
   * @see cl.uchile.pleiad.textRam.TAssociationEnd
   * @generated
   */
  EClass getTAssociationEnd();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TAssociationEnd#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower Bound</em>'.
   * @see cl.uchile.pleiad.textRam.TAssociationEnd#getLowerBound()
   * @see #getTAssociationEnd()
   * @generated
   */
  EAttribute getTAssociationEnd_LowerBound();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TAssociationEnd#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper Bound</em>'.
   * @see cl.uchile.pleiad.textRam.TAssociationEnd#getUpperBound()
   * @see #getTAssociationEnd()
   * @generated
   */
  EAttribute getTAssociationEnd_UpperBound();

  /**
   * Returns the meta object for the reference '{@link cl.uchile.pleiad.textRam.TAssociationEnd#getClassReference <em>Class Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Class Reference</em>'.
   * @see cl.uchile.pleiad.textRam.TAssociationEnd#getClassReference()
   * @see #getTAssociationEnd()
   * @generated
   */
  EReference getTAssociationEnd_ClassReference();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TInstantiationHeader <em>TInstantiation Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TInstantiation Header</em>'.
   * @see cl.uchile.pleiad.textRam.TInstantiationHeader
   * @generated
   */
  EClass getTInstantiationHeader();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TInstantiationHeader#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see cl.uchile.pleiad.textRam.TInstantiationHeader#getType()
   * @see #getTInstantiationHeader()
   * @generated
   */
  EAttribute getTInstantiationHeader_Type();

  /**
   * Returns the meta object for the reference list '{@link cl.uchile.pleiad.textRam.TInstantiationHeader#getExternalAspects <em>External Aspects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>External Aspects</em>'.
   * @see cl.uchile.pleiad.textRam.TInstantiationHeader#getExternalAspects()
   * @see #getTInstantiationHeader()
   * @generated
   */
  EReference getTInstantiationHeader_ExternalAspects();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TClassifierMapping <em>TClassifier Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TClassifier Mapping</em>'.
   * @see cl.uchile.pleiad.textRam.TClassifierMapping
   * @generated
   */
  EClass getTClassifierMapping();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TClassifierMapping#isPartialFromElement <em>Partial From Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partial From Element</em>'.
   * @see cl.uchile.pleiad.textRam.TClassifierMapping#isPartialFromElement()
   * @see #getTClassifierMapping()
   * @generated
   */
  EAttribute getTClassifierMapping_PartialFromElement();

  /**
   * Returns the meta object for the reference list '{@link cl.uchile.pleiad.textRam.TClassifierMapping#getFromMembers <em>From Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>From Members</em>'.
   * @see cl.uchile.pleiad.textRam.TClassifierMapping#getFromMembers()
   * @see #getTClassifierMapping()
   * @generated
   */
  EReference getTClassifierMapping_FromMembers();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TClassifierMapping#isPartialToElement <em>Partial To Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partial To Element</em>'.
   * @see cl.uchile.pleiad.textRam.TClassifierMapping#isPartialToElement()
   * @see #getTClassifierMapping()
   * @generated
   */
  EAttribute getTClassifierMapping_PartialToElement();

  /**
   * Returns the meta object for the reference list '{@link cl.uchile.pleiad.textRam.TClassifierMapping#getToMembers <em>To Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>To Members</em>'.
   * @see cl.uchile.pleiad.textRam.TClassifierMapping#getToMembers()
   * @see #getTClassifierMapping()
   * @generated
   */
  EReference getTClassifierMapping_ToMembers();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TAbstractMessages <em>TAbstract Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TAbstract Messages</em>'.
   * @see cl.uchile.pleiad.textRam.TAbstractMessages
   * @generated
   */
  EClass getTAbstractMessages();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TAbstractMessages#isCreate <em>Create</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Create</em>'.
   * @see cl.uchile.pleiad.textRam.TAbstractMessages#isCreate()
   * @see #getTAbstractMessages()
   * @generated
   */
  EAttribute getTAbstractMessages_Create();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TAbstractMessages#isPartialClass <em>Partial Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partial Class</em>'.
   * @see cl.uchile.pleiad.textRam.TAbstractMessages#isPartialClass()
   * @see #getTAbstractMessages()
   * @generated
   */
  EAttribute getTAbstractMessages_PartialClass();

  /**
   * Returns the meta object for the reference '{@link cl.uchile.pleiad.textRam.TAbstractMessages#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Class</em>'.
   * @see cl.uchile.pleiad.textRam.TAbstractMessages#getClass_()
   * @see #getTAbstractMessages()
   * @generated
   */
  EReference getTAbstractMessages_Class();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TAbstractMessages#isPartialOperation <em>Partial Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partial Operation</em>'.
   * @see cl.uchile.pleiad.textRam.TAbstractMessages#isPartialOperation()
   * @see #getTAbstractMessages()
   * @generated
   */
  EAttribute getTAbstractMessages_PartialOperation();

  /**
   * Returns the meta object for the reference '{@link cl.uchile.pleiad.textRam.TAbstractMessages#getSpecifies <em>Specifies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Specifies</em>'.
   * @see cl.uchile.pleiad.textRam.TAbstractMessages#getSpecifies()
   * @see #getTAbstractMessages()
   * @generated
   */
  EReference getTAbstractMessages_Specifies();

  /**
   * Returns the meta object for the reference list '{@link cl.uchile.pleiad.textRam.TAbstractMessages#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Arguments</em>'.
   * @see cl.uchile.pleiad.textRam.TAbstractMessages#getArguments()
   * @see #getTAbstractMessages()
   * @generated
   */
  EReference getTAbstractMessages_Arguments();

  /**
   * Returns the meta object for the containment reference list '{@link cl.uchile.pleiad.textRam.TAbstractMessages#getInteractionMessages <em>Interaction Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interaction Messages</em>'.
   * @see cl.uchile.pleiad.textRam.TAbstractMessages#getInteractionMessages()
   * @see #getTAbstractMessages()
   * @generated
   */
  EReference getTAbstractMessages_InteractionMessages();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TMessageView <em>TMessage View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TMessage View</em>'.
   * @see cl.uchile.pleiad.textRam.TMessageView
   * @generated
   */
  EClass getTMessageView();

  /**
   * Returns the meta object for the reference list '{@link cl.uchile.pleiad.textRam.TMessageView#getAffectedBy <em>Affected By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Affected By</em>'.
   * @see cl.uchile.pleiad.textRam.TMessageView#getAffectedBy()
   * @see #getTMessageView()
   * @generated
   */
  EReference getTMessageView_AffectedBy();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TAspectMessageView <em>TAspect Message View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TAspect Message View</em>'.
   * @see cl.uchile.pleiad.textRam.TAspectMessageView
   * @generated
   */
  EClass getTAspectMessageView();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TAspectMessageView#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cl.uchile.pleiad.textRam.TAspectMessageView#getName()
   * @see #getTAspectMessageView()
   * @generated
   */
  EAttribute getTAspectMessageView_Name();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TLifeline <em>TLifeline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TLifeline</em>'.
   * @see cl.uchile.pleiad.textRam.TLifeline
   * @generated
   */
  EClass getTLifeline();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TLifeline#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see cl.uchile.pleiad.textRam.TLifeline#isStatic()
   * @see #getTLifeline()
   * @generated
   */
  EAttribute getTLifeline_Static();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TLifeline#getReferenceType <em>Reference Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference Type</em>'.
   * @see cl.uchile.pleiad.textRam.TLifeline#getReferenceType()
   * @see #getTLifeline()
   * @generated
   */
  EAttribute getTLifeline_ReferenceType();

  /**
   * Returns the meta object for the reference '{@link cl.uchile.pleiad.textRam.TLifeline#getRepresents <em>Represents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Represents</em>'.
   * @see cl.uchile.pleiad.textRam.TLifeline#getRepresents()
   * @see #getTLifeline()
   * @generated
   */
  EReference getTLifeline_Represents();

  /**
   * Returns the meta object for the containment reference list '{@link cl.uchile.pleiad.textRam.TLifeline#getLocalProperties <em>Local Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Local Properties</em>'.
   * @see cl.uchile.pleiad.textRam.TLifeline#getLocalProperties()
   * @see #getTLifeline()
   * @generated
   */
  EReference getTLifeline_LocalProperties();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TValueSpecification <em>TValue Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TValue Specification</em>'.
   * @see cl.uchile.pleiad.textRam.TValueSpecification
   * @generated
   */
  EClass getTValueSpecification();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TDummyValueSpecification <em>TDummy Value Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TDummy Value Specification</em>'.
   * @see cl.uchile.pleiad.textRam.TDummyValueSpecification
   * @generated
   */
  EClass getTDummyValueSpecification();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TDummyValueSpecification#isDummy <em>Dummy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dummy</em>'.
   * @see cl.uchile.pleiad.textRam.TDummyValueSpecification#isDummy()
   * @see #getTDummyValueSpecification()
   * @generated
   */
  EAttribute getTDummyValueSpecification_Dummy();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TTemporaryProperty <em>TTemporary Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TTemporary Property</em>'.
   * @see cl.uchile.pleiad.textRam.TTemporaryProperty
   * @generated
   */
  EClass getTTemporaryProperty();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TReference <em>TReference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TReference</em>'.
   * @see cl.uchile.pleiad.textRam.TReference
   * @generated
   */
  EClass getTReference();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TReference#isPartialClass <em>Partial Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partial Class</em>'.
   * @see cl.uchile.pleiad.textRam.TReference#isPartialClass()
   * @see #getTReference()
   * @generated
   */
  EAttribute getTReference_PartialClass();

  /**
   * Returns the meta object for the reference '{@link cl.uchile.pleiad.textRam.TReference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see cl.uchile.pleiad.textRam.TReference#getReference()
   * @see #getTReference()
   * @generated
   */
  EReference getTReference_Reference();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TLocalAttribute <em>TLocal Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TLocal Attribute</em>'.
   * @see cl.uchile.pleiad.textRam.TLocalAttribute
   * @generated
   */
  EClass getTLocalAttribute();

  /**
   * Returns the meta object for the reference '{@link cl.uchile.pleiad.textRam.TLocalAttribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see cl.uchile.pleiad.textRam.TLocalAttribute#getType()
   * @see #getTLocalAttribute()
   * @generated
   */
  EReference getTLocalAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TLocalAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see cl.uchile.pleiad.textRam.TLocalAttribute#getValue()
   * @see #getTLocalAttribute()
   * @generated
   */
  EAttribute getTLocalAttribute_Value();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TInteraction <em>TInteraction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TInteraction</em>'.
   * @see cl.uchile.pleiad.textRam.TInteraction
   * @generated
   */
  EClass getTInteraction();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TOcurrence <em>TOcurrence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TOcurrence</em>'.
   * @see cl.uchile.pleiad.textRam.TOcurrence
   * @generated
   */
  EClass getTOcurrence();

  /**
   * Returns the meta object for the reference '{@link cl.uchile.pleiad.textRam.TOcurrence#getLeftLifeline <em>Left Lifeline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Left Lifeline</em>'.
   * @see cl.uchile.pleiad.textRam.TOcurrence#getLeftLifeline()
   * @see #getTOcurrence()
   * @generated
   */
  EReference getTOcurrence_LeftLifeline();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TOcurrence#getOcurrenceType <em>Ocurrence Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ocurrence Type</em>'.
   * @see cl.uchile.pleiad.textRam.TOcurrence#getOcurrenceType()
   * @see #getTOcurrence()
   * @generated
   */
  EAttribute getTOcurrence_OcurrenceType();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TInteractionMessage <em>TInteraction Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TInteraction Message</em>'.
   * @see cl.uchile.pleiad.textRam.TInteractionMessage
   * @generated
   */
  EClass getTInteractionMessage();

  /**
   * Returns the meta object for the reference '{@link cl.uchile.pleiad.textRam.TInteractionMessage#getLeftLifeline <em>Left Lifeline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Left Lifeline</em>'.
   * @see cl.uchile.pleiad.textRam.TInteractionMessage#getLeftLifeline()
   * @see #getTInteractionMessage()
   * @generated
   */
  EReference getTInteractionMessage_LeftLifeline();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TInteractionMessage#isCreate <em>Create</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Create</em>'.
   * @see cl.uchile.pleiad.textRam.TInteractionMessage#isCreate()
   * @see #getTInteractionMessage()
   * @generated
   */
  EAttribute getTInteractionMessage_Create();

  /**
   * Returns the meta object for the reference '{@link cl.uchile.pleiad.textRam.TInteractionMessage#getRightLifeline <em>Right Lifeline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Right Lifeline</em>'.
   * @see cl.uchile.pleiad.textRam.TInteractionMessage#getRightLifeline()
   * @see #getTInteractionMessage()
   * @generated
   */
  EReference getTInteractionMessage_RightLifeline();

  /**
   * Returns the meta object for the containment reference '{@link cl.uchile.pleiad.textRam.TInteractionMessage#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Message</em>'.
   * @see cl.uchile.pleiad.textRam.TInteractionMessage#getMessage()
   * @see #getTInteractionMessage()
   * @generated
   */
  EReference getTInteractionMessage_Message();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TCombinedFragment <em>TCombined Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TCombined Fragment</em>'.
   * @see cl.uchile.pleiad.textRam.TCombinedFragment
   * @generated
   */
  EClass getTCombinedFragment();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TCombinedFragment#getInteractionOperator <em>Interaction Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interaction Operator</em>'.
   * @see cl.uchile.pleiad.textRam.TCombinedFragment#getInteractionOperator()
   * @see #getTCombinedFragment()
   * @generated
   */
  EAttribute getTCombinedFragment_InteractionOperator();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TCombinedFragment#getInteractionConstraint <em>Interaction Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interaction Constraint</em>'.
   * @see cl.uchile.pleiad.textRam.TCombinedFragment#getInteractionConstraint()
   * @see #getTCombinedFragment()
   * @generated
   */
  EAttribute getTCombinedFragment_InteractionConstraint();

  /**
   * Returns the meta object for the containment reference list '{@link cl.uchile.pleiad.textRam.TCombinedFragment#getContainers <em>Containers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Containers</em>'.
   * @see cl.uchile.pleiad.textRam.TCombinedFragment#getContainers()
   * @see #getTCombinedFragment()
   * @generated
   */
  EReference getTCombinedFragment_Containers();

  /**
   * Returns the meta object for the containment reference list '{@link cl.uchile.pleiad.textRam.TCombinedFragment#getElseContainers <em>Else Containers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Else Containers</em>'.
   * @see cl.uchile.pleiad.textRam.TCombinedFragment#getElseContainers()
   * @see #getTCombinedFragment()
   * @generated
   */
  EReference getTCombinedFragment_ElseContainers();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TAbstractMessage <em>TAbstract Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TAbstract Message</em>'.
   * @see cl.uchile.pleiad.textRam.TAbstractMessage
   * @generated
   */
  EClass getTAbstractMessage();

  /**
   * Returns the meta object for the reference '{@link cl.uchile.pleiad.textRam.TAbstractMessage#getAssignTo <em>Assign To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Assign To</em>'.
   * @see cl.uchile.pleiad.textRam.TAbstractMessage#getAssignTo()
   * @see #getTAbstractMessage()
   * @generated
   */
  EReference getTAbstractMessage_AssignTo();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TReturnMessage <em>TReturn Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TReturn Message</em>'.
   * @see cl.uchile.pleiad.textRam.TReturnMessage
   * @generated
   */
  EClass getTReturnMessage();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TMessage <em>TMessage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TMessage</em>'.
   * @see cl.uchile.pleiad.textRam.TMessage
   * @generated
   */
  EClass getTMessage();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TMessage#isPartialOperation <em>Partial Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partial Operation</em>'.
   * @see cl.uchile.pleiad.textRam.TMessage#isPartialOperation()
   * @see #getTMessage()
   * @generated
   */
  EAttribute getTMessage_PartialOperation();

  /**
   * Returns the meta object for the reference '{@link cl.uchile.pleiad.textRam.TMessage#getSignature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signature</em>'.
   * @see cl.uchile.pleiad.textRam.TMessage#getSignature()
   * @see #getTMessage()
   * @generated
   */
  EReference getTMessage_Signature();

  /**
   * Returns the meta object for the reference list '{@link cl.uchile.pleiad.textRam.TMessage#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Arguments</em>'.
   * @see cl.uchile.pleiad.textRam.TMessage#getArguments()
   * @see #getTMessage()
   * @generated
   */
  EReference getTMessage_Arguments();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TTypedElement <em>TTyped Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TTyped Element</em>'.
   * @see cl.uchile.pleiad.textRam.TTypedElement
   * @generated
   */
  EClass getTTypedElement();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TMessageAssignableFeature <em>TMessage Assignable Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TMessage Assignable Feature</em>'.
   * @see cl.uchile.pleiad.textRam.TMessageAssignableFeature
   * @generated
   */
  EClass getTMessageAssignableFeature();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRam.TMessageAssignableFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cl.uchile.pleiad.textRam.TMessageAssignableFeature#getName()
   * @see #getTMessageAssignableFeature()
   * @generated
   */
  EAttribute getTMessageAssignableFeature_Name();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRam.TAbstractMessageView <em>TAbstract Message View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TAbstract Message View</em>'.
   * @see cl.uchile.pleiad.textRam.TAbstractMessageView
   * @generated
   */
  EClass getTAbstractMessageView();

  /**
   * Returns the meta object for the containment reference list '{@link cl.uchile.pleiad.textRam.TAbstractMessageView#getLifelines <em>Lifelines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lifelines</em>'.
   * @see cl.uchile.pleiad.textRam.TAbstractMessageView#getLifelines()
   * @see #getTAbstractMessageView()
   * @generated
   */
  EReference getTAbstractMessageView_Lifelines();

  /**
   * Returns the meta object for the containment reference list '{@link cl.uchile.pleiad.textRam.TAbstractMessageView#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Messages</em>'.
   * @see cl.uchile.pleiad.textRam.TAbstractMessageView#getMessages()
   * @see #getTAbstractMessageView()
   * @generated
   */
  EReference getTAbstractMessageView_Messages();

  /**
   * Returns the meta object for enum '{@link cl.uchile.pleiad.textRam.OcurrenceType <em>Ocurrence Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Ocurrence Type</em>'.
   * @see cl.uchile.pleiad.textRam.OcurrenceType
   * @generated
   */
  EEnum getOcurrenceType();

  /**
   * Returns the meta object for enum '{@link cl.uchile.pleiad.textRam.TLifelineReferenceType <em>TLifeline Reference Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>TLifeline Reference Type</em>'.
   * @see cl.uchile.pleiad.textRam.TLifelineReferenceType
   * @generated
   */
  EEnum getTLifelineReferenceType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TextRamFactory getTextRamFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TAspectImpl <em>TAspect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TAspectImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTAspect()
     * @generated
     */
    EClass TASPECT = eINSTANCE.getTAspect();

    /**
     * The meta object literal for the '<em><b>Header Instantiations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASPECT__HEADER_INSTANTIATIONS = eINSTANCE.getTAspect_HeaderInstantiations();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TStructuralViewImpl <em>TStructural View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TStructuralViewImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTStructuralView()
     * @generated
     */
    EClass TSTRUCTURAL_VIEW = eINSTANCE.getTStructuralView();

    /**
     * The meta object literal for the '<em><b>TAssociations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TSTRUCTURAL_VIEW__TASSOCIATIONS = eINSTANCE.getTStructuralView_TAssociations();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TClassMemberImpl <em>TClass Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TClassMemberImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTClassMember()
     * @generated
     */
    EClass TCLASS_MEMBER = eINSTANCE.getTClassMember();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCLASS_MEMBER__STATIC = eINSTANCE.getTClassMember_Static();

    /**
     * The meta object literal for the '<em><b>Partial</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCLASS_MEMBER__PARTIAL = eINSTANCE.getTClassMember_Partial();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCLASS_MEMBER__NAME = eINSTANCE.getTClassMember_Name();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TClassImpl <em>TClass</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TClassImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTClass()
     * @generated
     */
    EClass TCLASS = eINSTANCE.getTClass();

    /**
     * The meta object literal for the '<em><b>Partial Super Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCLASS__PARTIAL_SUPER_TYPE = eINSTANCE.getTClass_PartialSuperType();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TCLASS__MEMBERS = eINSTANCE.getTClass_Members();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TAttributeImpl <em>TAttribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TAttributeImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTAttribute()
     * @generated
     */
    EClass TATTRIBUTE = eINSTANCE.getTAttribute();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TATTRIBUTE__TYPE = eINSTANCE.getTAttribute_Type();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TOperationImpl <em>TOperation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TOperationImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTOperation()
     * @generated
     */
    EClass TOPERATION = eINSTANCE.getTOperation();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOPERATION__ABSTRACT = eINSTANCE.getTOperation_Abstract();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOPERATION__VISIBILITY = eINSTANCE.getTOperation_Visibility();

    /**
     * The meta object literal for the '<em><b>Partial Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOPERATION__PARTIAL_RETURN_TYPE = eINSTANCE.getTOperation_PartialReturnType();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOPERATION__RETURN_TYPE = eINSTANCE.getTOperation_ReturnType();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOPERATION__PARAMETERS = eINSTANCE.getTOperation_Parameters();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TParameterImpl <em>TParameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TParameterImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTParameter()
     * @generated
     */
    EClass TPARAMETER = eINSTANCE.getTParameter();

    /**
     * The meta object literal for the '<em><b>Partial Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TPARAMETER__PARTIAL_TYPE = eINSTANCE.getTParameter_PartialType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TPARAMETER__TYPE = eINSTANCE.getTParameter_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TPARAMETER__NAME = eINSTANCE.getTParameter_Name();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TAssociationImpl <em>TAssociation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TAssociationImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTAssociation()
     * @generated
     */
    EClass TASSOCIATION = eINSTANCE.getTAssociation();

    /**
     * The meta object literal for the '<em><b>From End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASSOCIATION__FROM_END = eINSTANCE.getTAssociation_FromEnd();

    /**
     * The meta object literal for the '<em><b>Reference Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASSOCIATION__REFERENCE_TYPE = eINSTANCE.getTAssociation_ReferenceType();

    /**
     * The meta object literal for the '<em><b>To End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASSOCIATION__TO_END = eINSTANCE.getTAssociation_ToEnd();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TAssociationEndImpl <em>TAssociation End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TAssociationEndImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTAssociationEnd()
     * @generated
     */
    EClass TASSOCIATION_END = eINSTANCE.getTAssociationEnd();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASSOCIATION_END__LOWER_BOUND = eINSTANCE.getTAssociationEnd_LowerBound();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASSOCIATION_END__UPPER_BOUND = eINSTANCE.getTAssociationEnd_UpperBound();

    /**
     * The meta object literal for the '<em><b>Class Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASSOCIATION_END__CLASS_REFERENCE = eINSTANCE.getTAssociationEnd_ClassReference();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TInstantiationHeaderImpl <em>TInstantiation Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TInstantiationHeaderImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTInstantiationHeader()
     * @generated
     */
    EClass TINSTANTIATION_HEADER = eINSTANCE.getTInstantiationHeader();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TINSTANTIATION_HEADER__TYPE = eINSTANCE.getTInstantiationHeader_Type();

    /**
     * The meta object literal for the '<em><b>External Aspects</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TINSTANTIATION_HEADER__EXTERNAL_ASPECTS = eINSTANCE.getTInstantiationHeader_ExternalAspects();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TClassifierMappingImpl <em>TClassifier Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TClassifierMappingImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTClassifierMapping()
     * @generated
     */
    EClass TCLASSIFIER_MAPPING = eINSTANCE.getTClassifierMapping();

    /**
     * The meta object literal for the '<em><b>Partial From Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCLASSIFIER_MAPPING__PARTIAL_FROM_ELEMENT = eINSTANCE.getTClassifierMapping_PartialFromElement();

    /**
     * The meta object literal for the '<em><b>From Members</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TCLASSIFIER_MAPPING__FROM_MEMBERS = eINSTANCE.getTClassifierMapping_FromMembers();

    /**
     * The meta object literal for the '<em><b>Partial To Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCLASSIFIER_MAPPING__PARTIAL_TO_ELEMENT = eINSTANCE.getTClassifierMapping_PartialToElement();

    /**
     * The meta object literal for the '<em><b>To Members</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TCLASSIFIER_MAPPING__TO_MEMBERS = eINSTANCE.getTClassifierMapping_ToMembers();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TAbstractMessagesImpl <em>TAbstract Messages</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TAbstractMessagesImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTAbstractMessages()
     * @generated
     */
    EClass TABSTRACT_MESSAGES = eINSTANCE.getTAbstractMessages();

    /**
     * The meta object literal for the '<em><b>Create</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABSTRACT_MESSAGES__CREATE = eINSTANCE.getTAbstractMessages_Create();

    /**
     * The meta object literal for the '<em><b>Partial Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABSTRACT_MESSAGES__PARTIAL_CLASS = eINSTANCE.getTAbstractMessages_PartialClass();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABSTRACT_MESSAGES__CLASS = eINSTANCE.getTAbstractMessages_Class();

    /**
     * The meta object literal for the '<em><b>Partial Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABSTRACT_MESSAGES__PARTIAL_OPERATION = eINSTANCE.getTAbstractMessages_PartialOperation();

    /**
     * The meta object literal for the '<em><b>Specifies</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABSTRACT_MESSAGES__SPECIFIES = eINSTANCE.getTAbstractMessages_Specifies();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABSTRACT_MESSAGES__ARGUMENTS = eINSTANCE.getTAbstractMessages_Arguments();

    /**
     * The meta object literal for the '<em><b>Interaction Messages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABSTRACT_MESSAGES__INTERACTION_MESSAGES = eINSTANCE.getTAbstractMessages_InteractionMessages();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TMessageViewImpl <em>TMessage View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TMessageViewImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTMessageView()
     * @generated
     */
    EClass TMESSAGE_VIEW = eINSTANCE.getTMessageView();

    /**
     * The meta object literal for the '<em><b>Affected By</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TMESSAGE_VIEW__AFFECTED_BY = eINSTANCE.getTMessageView_AffectedBy();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TAspectMessageViewImpl <em>TAspect Message View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TAspectMessageViewImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTAspectMessageView()
     * @generated
     */
    EClass TASPECT_MESSAGE_VIEW = eINSTANCE.getTAspectMessageView();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASPECT_MESSAGE_VIEW__NAME = eINSTANCE.getTAspectMessageView_Name();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TLifelineImpl <em>TLifeline</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TLifelineImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTLifeline()
     * @generated
     */
    EClass TLIFELINE = eINSTANCE.getTLifeline();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TLIFELINE__STATIC = eINSTANCE.getTLifeline_Static();

    /**
     * The meta object literal for the '<em><b>Reference Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TLIFELINE__REFERENCE_TYPE = eINSTANCE.getTLifeline_ReferenceType();

    /**
     * The meta object literal for the '<em><b>Represents</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TLIFELINE__REPRESENTS = eINSTANCE.getTLifeline_Represents();

    /**
     * The meta object literal for the '<em><b>Local Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TLIFELINE__LOCAL_PROPERTIES = eINSTANCE.getTLifeline_LocalProperties();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TValueSpecificationImpl <em>TValue Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TValueSpecificationImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTValueSpecification()
     * @generated
     */
    EClass TVALUE_SPECIFICATION = eINSTANCE.getTValueSpecification();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TDummyValueSpecificationImpl <em>TDummy Value Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TDummyValueSpecificationImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTDummyValueSpecification()
     * @generated
     */
    EClass TDUMMY_VALUE_SPECIFICATION = eINSTANCE.getTDummyValueSpecification();

    /**
     * The meta object literal for the '<em><b>Dummy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TDUMMY_VALUE_SPECIFICATION__DUMMY = eINSTANCE.getTDummyValueSpecification_Dummy();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TTemporaryPropertyImpl <em>TTemporary Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TTemporaryPropertyImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTTemporaryProperty()
     * @generated
     */
    EClass TTEMPORARY_PROPERTY = eINSTANCE.getTTemporaryProperty();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TReferenceImpl <em>TReference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TReferenceImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTReference()
     * @generated
     */
    EClass TREFERENCE = eINSTANCE.getTReference();

    /**
     * The meta object literal for the '<em><b>Partial Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TREFERENCE__PARTIAL_CLASS = eINSTANCE.getTReference_PartialClass();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TREFERENCE__REFERENCE = eINSTANCE.getTReference_Reference();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TLocalAttributeImpl <em>TLocal Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TLocalAttributeImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTLocalAttribute()
     * @generated
     */
    EClass TLOCAL_ATTRIBUTE = eINSTANCE.getTLocalAttribute();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TLOCAL_ATTRIBUTE__TYPE = eINSTANCE.getTLocalAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TLOCAL_ATTRIBUTE__VALUE = eINSTANCE.getTLocalAttribute_Value();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TInteractionImpl <em>TInteraction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TInteractionImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTInteraction()
     * @generated
     */
    EClass TINTERACTION = eINSTANCE.getTInteraction();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TOcurrenceImpl <em>TOcurrence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TOcurrenceImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTOcurrence()
     * @generated
     */
    EClass TOCURRENCE = eINSTANCE.getTOcurrence();

    /**
     * The meta object literal for the '<em><b>Left Lifeline</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOCURRENCE__LEFT_LIFELINE = eINSTANCE.getTOcurrence_LeftLifeline();

    /**
     * The meta object literal for the '<em><b>Ocurrence Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOCURRENCE__OCURRENCE_TYPE = eINSTANCE.getTOcurrence_OcurrenceType();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TInteractionMessageImpl <em>TInteraction Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TInteractionMessageImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTInteractionMessage()
     * @generated
     */
    EClass TINTERACTION_MESSAGE = eINSTANCE.getTInteractionMessage();

    /**
     * The meta object literal for the '<em><b>Left Lifeline</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TINTERACTION_MESSAGE__LEFT_LIFELINE = eINSTANCE.getTInteractionMessage_LeftLifeline();

    /**
     * The meta object literal for the '<em><b>Create</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TINTERACTION_MESSAGE__CREATE = eINSTANCE.getTInteractionMessage_Create();

    /**
     * The meta object literal for the '<em><b>Right Lifeline</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TINTERACTION_MESSAGE__RIGHT_LIFELINE = eINSTANCE.getTInteractionMessage_RightLifeline();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TINTERACTION_MESSAGE__MESSAGE = eINSTANCE.getTInteractionMessage_Message();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TCombinedFragmentImpl <em>TCombined Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TCombinedFragmentImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTCombinedFragment()
     * @generated
     */
    EClass TCOMBINED_FRAGMENT = eINSTANCE.getTCombinedFragment();

    /**
     * The meta object literal for the '<em><b>Interaction Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMBINED_FRAGMENT__INTERACTION_OPERATOR = eINSTANCE.getTCombinedFragment_InteractionOperator();

    /**
     * The meta object literal for the '<em><b>Interaction Constraint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCOMBINED_FRAGMENT__INTERACTION_CONSTRAINT = eINSTANCE.getTCombinedFragment_InteractionConstraint();

    /**
     * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TCOMBINED_FRAGMENT__CONTAINERS = eINSTANCE.getTCombinedFragment_Containers();

    /**
     * The meta object literal for the '<em><b>Else Containers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TCOMBINED_FRAGMENT__ELSE_CONTAINERS = eINSTANCE.getTCombinedFragment_ElseContainers();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TAbstractMessageImpl <em>TAbstract Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TAbstractMessageImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTAbstractMessage()
     * @generated
     */
    EClass TABSTRACT_MESSAGE = eINSTANCE.getTAbstractMessage();

    /**
     * The meta object literal for the '<em><b>Assign To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABSTRACT_MESSAGE__ASSIGN_TO = eINSTANCE.getTAbstractMessage_AssignTo();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TReturnMessageImpl <em>TReturn Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TReturnMessageImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTReturnMessage()
     * @generated
     */
    EClass TRETURN_MESSAGE = eINSTANCE.getTReturnMessage();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TMessageImpl <em>TMessage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TMessageImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTMessage()
     * @generated
     */
    EClass TMESSAGE = eINSTANCE.getTMessage();

    /**
     * The meta object literal for the '<em><b>Partial Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TMESSAGE__PARTIAL_OPERATION = eINSTANCE.getTMessage_PartialOperation();

    /**
     * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TMESSAGE__SIGNATURE = eINSTANCE.getTMessage_Signature();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TMESSAGE__ARGUMENTS = eINSTANCE.getTMessage_Arguments();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TTypedElementImpl <em>TTyped Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TTypedElementImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTTypedElement()
     * @generated
     */
    EClass TTYPED_ELEMENT = eINSTANCE.getTTypedElement();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TMessageAssignableFeatureImpl <em>TMessage Assignable Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TMessageAssignableFeatureImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTMessageAssignableFeature()
     * @generated
     */
    EClass TMESSAGE_ASSIGNABLE_FEATURE = eINSTANCE.getTMessageAssignableFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TMESSAGE_ASSIGNABLE_FEATURE__NAME = eINSTANCE.getTMessageAssignableFeature_Name();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.impl.TAbstractMessageViewImpl <em>TAbstract Message View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.impl.TAbstractMessageViewImpl
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTAbstractMessageView()
     * @generated
     */
    EClass TABSTRACT_MESSAGE_VIEW = eINSTANCE.getTAbstractMessageView();

    /**
     * The meta object literal for the '<em><b>Lifelines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABSTRACT_MESSAGE_VIEW__LIFELINES = eINSTANCE.getTAbstractMessageView_Lifelines();

    /**
     * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABSTRACT_MESSAGE_VIEW__MESSAGES = eINSTANCE.getTAbstractMessageView_Messages();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.OcurrenceType <em>Ocurrence Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.OcurrenceType
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getOcurrenceType()
     * @generated
     */
    EEnum OCURRENCE_TYPE = eINSTANCE.getOcurrenceType();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRam.TLifelineReferenceType <em>TLifeline Reference Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRam.TLifelineReferenceType
     * @see cl.uchile.pleiad.textRam.impl.TextRamPackageImpl#getTLifelineReferenceType()
     * @generated
     */
    EEnum TLIFELINE_REFERENCE_TYPE = eINSTANCE.getTLifelineReferenceType();

  }

} //TextRamPackage
