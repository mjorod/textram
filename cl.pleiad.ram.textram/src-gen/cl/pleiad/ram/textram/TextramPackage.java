/**
 */
package cl.pleiad.ram.textram;

import org.eclipse.emf.ecore.EClass;
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
 * @see cl.pleiad.ram.textram.TextramFactory
 * @model kind="package"
 * @generated
 */
public interface TextramPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "textram";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.pleiad.cl/ram/Textram";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "textram";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TextramPackage eINSTANCE = cl.pleiad.ram.textram.impl.TextramPackageImpl.init();

  /**
   * The meta object id for the '{@link cl.pleiad.ram.textram.impl.RamModelImpl <em>Ram Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cl.pleiad.ram.textram.impl.RamModelImpl
   * @see cl.pleiad.ram.textram.impl.TextramPackageImpl#getRamModel()
   * @generated
   */
  int RAM_MODEL = 0;

  /**
   * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAM_MODEL__ASPECTS = 0;

  /**
   * The number of structural features of the '<em>Ram Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAM_MODEL_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link cl.pleiad.ram.textram.RamModel <em>Ram Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ram Model</em>'.
   * @see cl.pleiad.ram.textram.RamModel
   * @generated
   */
  EClass getRamModel();

  /**
   * Returns the meta object for the containment reference list '{@link cl.pleiad.ram.textram.RamModel#getAspects <em>Aspects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Aspects</em>'.
   * @see cl.pleiad.ram.textram.RamModel#getAspects()
   * @see #getRamModel()
   * @generated
   */
  EReference getRamModel_Aspects();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TextramFactory getTextramFactory();

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
     * The meta object literal for the '{@link cl.pleiad.ram.textram.impl.RamModelImpl <em>Ram Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cl.pleiad.ram.textram.impl.RamModelImpl
     * @see cl.pleiad.ram.textram.impl.TextramPackageImpl#getRamModel()
     * @generated
     */
    EClass RAM_MODEL = eINSTANCE.getRamModel();

    /**
     * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RAM_MODEL__ASPECTS = eINSTANCE.getRamModel_Aspects();

  }

} //TextramPackage
