/**
 */
package cl.uchile.pleiad.textRAM.impl;

import cl.uchile.pleiad.textRAM.*;

import org.eclipse.emf.ecore.EClass;
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
public class TextRAMFactoryImpl extends EFactoryImpl implements TextRAMFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TextRAMFactory init()
  {
    try
    {
      TextRAMFactory theTextRAMFactory = (TextRAMFactory)EPackage.Registry.INSTANCE.getEFactory(TextRAMPackage.eNS_URI);
      if (theTextRAMFactory != null)
      {
        return theTextRAMFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TextRAMFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextRAMFactoryImpl()
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
      case TextRAMPackage.STRUCTURAL_VIEW: return createStructuralView();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructuralView createStructuralView()
  {
    StructuralViewImpl structuralView = new StructuralViewImpl();
    return structuralView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextRAMPackage getTextRAMPackage()
  {
    return (TextRAMPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TextRAMPackage getPackage()
  {
    return TextRAMPackage.eINSTANCE;
  }

} //TextRAMFactoryImpl
