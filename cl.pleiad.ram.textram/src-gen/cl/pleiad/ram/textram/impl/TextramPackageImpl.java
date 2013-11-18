/**
 */
package cl.pleiad.ram.textram.impl;

import ca.mcgill.cs.sel.ram.RamPackage;

import cl.pleiad.ram.textram.RamModel;
import cl.pleiad.ram.textram.TextramFactory;
import cl.pleiad.ram.textram.TextramPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextramPackageImpl extends EPackageImpl implements TextramPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ramModelEClass = null;

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
   * @see cl.pleiad.ram.textram.TextramPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TextramPackageImpl()
  {
    super(eNS_URI, TextramFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link TextramPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TextramPackage init()
  {
    if (isInited) return (TextramPackage)EPackage.Registry.INSTANCE.getEPackage(TextramPackage.eNS_URI);

    // Obtain or create and register package
    TextramPackageImpl theTextramPackage = (TextramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TextramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TextramPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    RamPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theTextramPackage.createPackageContents();

    // Initialize created meta-data
    theTextramPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTextramPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TextramPackage.eNS_URI, theTextramPackage);
    return theTextramPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRamModel()
  {
    return ramModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRamModel_Aspects()
  {
    return (EReference)ramModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextramFactory getTextramFactory()
  {
    return (TextramFactory)getEFactoryInstance();
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
    ramModelEClass = createEClass(RAM_MODEL);
    createEReference(ramModelEClass, RAM_MODEL__ASPECTS);
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

    // Initialize classes and features; add operations and parameters
    initEClass(ramModelEClass, RamModel.class, "RamModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRamModel_Aspects(), theRamPackage.getAspect(), null, "aspects", null, 0, -1, RamModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //TextramPackageImpl
