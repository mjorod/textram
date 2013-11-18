/**
 */
package cl.pleiad.ram.textram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cl.pleiad.ram.textram.TextramPackage
 * @generated
 */
public interface TextramFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TextramFactory eINSTANCE = cl.pleiad.ram.textram.impl.TextramFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Ram Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ram Model</em>'.
   * @generated
   */
  RamModel createRamModel();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TextramPackage getTextramPackage();

} //TextramFactory
