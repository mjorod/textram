/**
 */
package cl.uchile.pleiad.textRAM;

import ca.mcgill.cs.sel.ram.RamPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see cl.uchile.pleiad.textRAM.TextRAMFactory
 * @model kind="package"
 * @generated
 */
public interface TextRAMPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "textRAM";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.uchile.cl/pleiad/TextRAM";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "textRAM";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TextRAMPackage eINSTANCE = cl.uchile.pleiad.textRAM.impl.TextRAMPackageImpl.init();

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRAM.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRAM.impl.ClassImpl
   * @see cl.uchile.pleiad.textRAM.impl.TextRAMPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = RamPackage.CLASSIFIER__NAME;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__OPERATIONS = RamPackage.CLASSIFIER__OPERATIONS;

  /**
   * The feature id for the '<em><b>Partial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__PARTIAL = RamPackage.CLASSIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__ABSTRACT = RamPackage.CLASSIFIER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = RamPackage.CLASSIFIER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link cl.uchile.pleiad.textRAM.impl.StructuralViewImpl <em>Structural View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRAM.impl.StructuralViewImpl
   * @see cl.uchile.pleiad.textRAM.impl.TextRAMPackageImpl#getStructuralView()
   * @generated
   */
  int STRUCTURAL_VIEW = 1;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_VIEW__CLASSES = RamPackage.STRUCTURAL_VIEW__CLASSES;

  /**
   * The feature id for the '<em><b>Associations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_VIEW__ASSOCIATIONS = RamPackage.STRUCTURAL_VIEW__ASSOCIATIONS;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_VIEW__TYPES = RamPackage.STRUCTURAL_VIEW__TYPES;

  /**
   * The number of structural features of the '<em>Structural View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_VIEW_FEATURE_COUNT = RamPackage.STRUCTURAL_VIEW_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRAM.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see cl.uchile.pleiad.textRAM.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRAM.Class#isPartial <em>Partial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partial</em>'.
   * @see cl.uchile.pleiad.textRAM.Class#isPartial()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Partial();

  /**
   * Returns the meta object for the attribute '{@link cl.uchile.pleiad.textRAM.Class#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see cl.uchile.pleiad.textRAM.Class#isAbstract()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Abstract();

  /**
   * Returns the meta object for class '{@link cl.uchile.pleiad.textRAM.StructuralView <em>Structural View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structural View</em>'.
   * @see cl.uchile.pleiad.textRAM.StructuralView
   * @generated
   */
  EClass getStructuralView();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TextRAMFactory getTextRAMFactory();

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
     * The meta object literal for the '{@link cl.uchile.pleiad.textRAM.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRAM.impl.ClassImpl
     * @see cl.uchile.pleiad.textRAM.impl.TextRAMPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Partial</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__PARTIAL = eINSTANCE.getClass_Partial();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__ABSTRACT = eINSTANCE.getClass_Abstract();

    /**
     * The meta object literal for the '{@link cl.uchile.pleiad.textRAM.impl.StructuralViewImpl <em>Structural View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.uchile.pleiad.textRAM.impl.StructuralViewImpl
     * @see cl.uchile.pleiad.textRAM.impl.TextRAMPackageImpl#getStructuralView()
     * @generated
     */
    EClass STRUCTURAL_VIEW = eINSTANCE.getStructuralView();

  }

} //TextRAMPackage
