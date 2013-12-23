/**
 */
package cl.uchile.pleiad.textRAM;

import ca.mcgill.cs.sel.ram.RamPackage;

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
   * The meta object id for the '{@link cl.uchile.pleiad.textRAM.impl.StructuralViewImpl <em>Structural View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.uchile.pleiad.textRAM.impl.StructuralViewImpl
   * @see cl.uchile.pleiad.textRAM.impl.TextRAMPackageImpl#getStructuralView()
   * @generated
   */
  int STRUCTURAL_VIEW = 0;

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
