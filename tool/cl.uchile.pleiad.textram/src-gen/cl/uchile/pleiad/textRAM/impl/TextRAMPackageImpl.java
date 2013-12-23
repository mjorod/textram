/**
 */
package cl.uchile.pleiad.textRAM.impl;

import ca.mcgill.cs.sel.ram.RamPackage;

import cl.uchile.pleiad.textRAM.StructuralView;
import cl.uchile.pleiad.textRAM.TextRAMFactory;
import cl.uchile.pleiad.textRAM.TextRAMPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextRAMPackageImpl extends EPackageImpl implements TextRAMPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structuralViewEClass = null;

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
   * @see cl.uchile.pleiad.textRAM.TextRAMPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TextRAMPackageImpl()
  {
    super(eNS_URI, TextRAMFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link TextRAMPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TextRAMPackage init()
  {
    if (isInited) return (TextRAMPackage)EPackage.Registry.INSTANCE.getEPackage(TextRAMPackage.eNS_URI);

    // Obtain or create and register package
    TextRAMPackageImpl theTextRAMPackage = (TextRAMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TextRAMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TextRAMPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    RamPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theTextRAMPackage.createPackageContents();

    // Initialize created meta-data
    theTextRAMPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTextRAMPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TextRAMPackage.eNS_URI, theTextRAMPackage);
    return theTextRAMPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_()
  {
    return classEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_Partial()
  {
    return (EAttribute)classEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_Abstract()
  {
    return (EAttribute)classEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructuralView()
  {
    return structuralViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextRAMFactory getTextRAMFactory()
  {
    return (TextRAMFactory)getEFactoryInstance();
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
    classEClass = createEClass(CLASS);
    createEAttribute(classEClass, CLASS__PARTIAL);
    createEAttribute(classEClass, CLASS__ABSTRACT);

    structuralViewEClass = createEClass(STRUCTURAL_VIEW);
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
    classEClass.getESuperTypes().add(theRamPackage.getClassifier());
    structuralViewEClass.getESuperTypes().add(theRamPackage.getStructuralView());

    // Initialize classes and features; add operations and parameters
    initEClass(classEClass, cl.uchile.pleiad.textRAM.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClass_Partial(), ecorePackage.getEBoolean(), "partial", null, 0, 1, cl.uchile.pleiad.textRAM.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClass_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, cl.uchile.pleiad.textRAM.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structuralViewEClass, StructuralView.class, "StructuralView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //TextRAMPackageImpl
