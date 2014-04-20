/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ca.mcgill.cs.sel.ram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.mcgill.cs.sel.ram.RamPackage
 * @generated
 */
public interface RamFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	RamFactory eINSTANCE = ca.mcgill.cs.sel.ram.impl.RamFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Aspect</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Aspect</em>'.
     * @generated
     */
	Aspect createAspect();

	/**
     * Returns a new object of class '<em>Structural View</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Structural View</em>'.
     * @generated
     */
    StructuralView createStructuralView();

    /**
     * Returns a new object of class '<em>Class</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Class</em>'.
     * @generated
     */
	Class createClass();

	/**
     * Returns a new object of class '<em>Association End</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Association End</em>'.
     * @generated
     */
	AssociationEnd createAssociationEnd();

	/**
     * Returns a new object of class '<em>Association</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Association</em>'.
     * @generated
     */
	Association createAssociation();

	/**
     * Returns a new object of class '<em>Instantiation</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Instantiation</em>'.
     * @generated
     */
	Instantiation createInstantiation();

	/**
     * Returns a new object of class '<em>Operation</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Operation</em>'.
     * @generated
     */
	Operation createOperation();

	/**
     * Returns a new object of class '<em>Attribute</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute</em>'.
     * @generated
     */
	Attribute createAttribute();

	/**
     * Returns a new object of class '<em>Parameter</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Parameter</em>'.
     * @generated
     */
	Parameter createParameter();

	/**
     * Returns a new object of class '<em>RVoid</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>RVoid</em>'.
     * @generated
     */
	RVoid createRVoid();

	/**
     * Returns a new object of class '<em>RBoolean</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>RBoolean</em>'.
     * @generated
     */
	RBoolean createRBoolean();

	/**
     * Returns a new object of class '<em>RInt</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>RInt</em>'.
     * @generated
     */
	RInt createRInt();

	/**
     * Returns a new object of class '<em>RChar</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>RChar</em>'.
     * @generated
     */
	RChar createRChar();

	/**
     * Returns a new object of class '<em>RString</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>RString</em>'.
     * @generated
     */
	RString createRString();

	/**
     * Returns a new object of class '<em>RAny</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>RAny</em>'.
     * @generated
     */
	RAny createRAny();

	/**
     * Returns a new object of class '<em>REnum</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>REnum</em>'.
     * @generated
     */
	REnum createREnum();

	/**
     * Returns a new object of class '<em>REnum Literal</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>REnum Literal</em>'.
     * @generated
     */
	REnumLiteral createREnumLiteral();

	/**
     * Returns a new object of class '<em>Message View</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Message View</em>'.
     * @generated
     */
    MessageView createMessageView();

    /**
     * Returns a new object of class '<em>Message View Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Message View Reference</em>'.
     * @generated
     */
    MessageViewReference createMessageViewReference();

    /**
     * Returns a new object of class '<em>Interaction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction</em>'.
     * @generated
     */
    Interaction createInteraction();

    /**
     * Returns a new object of class '<em>Aspect Message View</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Aspect Message View</em>'.
     * @generated
     */
    AspectMessageView createAspectMessageView();

    /**
     * Returns a new object of class '<em>Lifeline</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Lifeline</em>'.
     * @generated
     */
    Lifeline createLifeline();

    /**
     * Returns a new object of class '<em>Message</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Message</em>'.
     * @generated
     */
    Message createMessage();

    /**
     * Returns a new object of class '<em>Message Occurrence Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Message Occurrence Specification</em>'.
     * @generated
     */
    MessageOccurrenceSpecification createMessageOccurrenceSpecification();

    /**
     * Returns a new object of class '<em>Occurrence Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Occurrence Specification</em>'.
     * @generated
     */
    OccurrenceSpecification createOccurrenceSpecification();

    /**
     * Returns a new object of class '<em>Destruction Occurrence Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Destruction Occurrence Specification</em>'.
     * @generated
     */
    DestructionOccurrenceSpecification createDestructionOccurrenceSpecification();

    /**
     * Returns a new object of class '<em>Combined Fragment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Combined Fragment</em>'.
     * @generated
     */
    CombinedFragment createCombinedFragment();

    /**
     * Returns a new object of class '<em>Original Behavior Execution</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Original Behavior Execution</em>'.
     * @generated
     */
    OriginalBehaviorExecution createOriginalBehaviorExecution();

    /**
     * Returns a new object of class '<em>Execution Statement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Execution Statement</em>'.
     * @generated
     */
    ExecutionStatement createExecutionStatement();

    /**
     * Returns a new object of class '<em>Interaction Operand</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Operand</em>'.
     * @generated
     */
    InteractionOperand createInteractionOperand();

    /**
     * Returns a new object of class '<em>Structural Feature Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Structural Feature Value</em>'.
     * @generated
     */
    StructuralFeatureValue createStructuralFeatureValue();

    /**
     * Returns a new object of class '<em>Parameter Value Mapping</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parameter Value Mapping</em>'.
     * @generated
     */
    ParameterValueMapping createParameterValueMapping();

    /**
     * Returns a new object of class '<em>Parameter Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parameter Value</em>'.
     * @generated
     */
    ParameterValue createParameterValue();

    /**
     * Returns a new object of class '<em>Opaque Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Opaque Expression</em>'.
     * @generated
     */
    OpaqueExpression createOpaqueExpression();

    /**
     * Returns a new object of class '<em>Literal String</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Literal String</em>'.
     * @generated
     */
    LiteralString createLiteralString();

    /**
     * Returns a new object of class '<em>Literal Integer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Literal Integer</em>'.
     * @generated
     */
    LiteralInteger createLiteralInteger();

    /**
     * Returns a new object of class '<em>RSet</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>RSet</em>'.
     * @generated
     */
    RSet createRSet();

    /**
     * Returns a new object of class '<em>RSequence</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>RSequence</em>'.
     * @generated
     */
    RSequence createRSequence();

    /**
     * Returns a new object of class '<em>Layout</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Layout</em>'.
     * @generated
     */
    Layout createLayout();

    /**
     * Returns a new object of class '<em>Layout Element</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Layout Element</em>'.
     * @generated
     */
    LayoutElement createLayoutElement();

    /**
     * Returns a new object of class '<em>Implementation Class</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Implementation Class</em>'.
     * @generated
     */
    ImplementationClass createImplementationClass();

    /**
     * Returns a new object of class '<em>Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reference</em>'.
     * @generated
     */
    Reference createReference();

    /**
     * Returns a new object of class '<em>Gate</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gate</em>'.
     * @generated
     */
    Gate createGate();

    /**
     * Returns a new object of class '<em>Literal Boolean</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Literal Boolean</em>'.
     * @generated
     */
    LiteralBoolean createLiteralBoolean();

    /**
     * Returns a new object of class '<em>Classifier Mapping</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Classifier Mapping</em>'.
     * @generated
     */
    ClassifierMapping createClassifierMapping();

    /**
     * Returns a new object of class '<em>Attribute Mapping</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute Mapping</em>'.
     * @generated
     */
    AttributeMapping createAttributeMapping();

    /**
     * Returns a new object of class '<em>Operation Mapping</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operation Mapping</em>'.
     * @generated
     */
    OperationMapping createOperationMapping();

    /**
     * Returns a new object of class '<em>Parameter Mapping</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parameter Mapping</em>'.
     * @generated
     */
    ParameterMapping createParameterMapping();

    /**
     * Returns a new object of class '<em>State View</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>State View</em>'.
     * @generated
     */
	StateView createStateView();

				/**
     * Returns a new object of class '<em>State Machine</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>State Machine</em>'.
     * @generated
     */
	StateMachine createStateMachine();

				/**
     * Returns a new object of class '<em>Transition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Transition</em>'.
     * @generated
     */
	Transition createTransition();

				/**
     * Returns a new object of class '<em>State</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>State</em>'.
     * @generated
     */
	State createState();

				/**
     * Returns a new object of class '<em>RDouble</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>RDouble</em>'.
     * @generated
     */
    RDouble createRDouble();

                /**
     * Returns a new object of class '<em>RFloat</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>RFloat</em>'.
     * @generated
     */
    RFloat createRFloat();

                /**
     * Returns a new object of class '<em>Constraint</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Constraint</em>'.
     * @generated
     */
	Constraint createConstraint();

																/**
     * Returns a new object of class '<em>Substitution</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Substitution</em>'.
     * @generated
     */
	Substitution createSubstitution();

																/**
     * Returns a new object of class '<em>Transition Substitution</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Transition Substitution</em>'.
     * @generated
     */
	TransitionSubstitution createTransitionSubstitution();

																/**
     * Returns a new object of class '<em>Type Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Type Parameter</em>'.
     * @generated
     */
    TypeParameter createTypeParameter();

                                                                /**
     * Returns a new object of class '<em>RLong</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>RLong</em>'.
     * @generated
     */
    RLong createRLong();

                                                                /**
     * Returns a new object of class '<em>RArray</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>RArray</em>'.
     * @generated
     */
    RArray createRArray();

                                                                /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	RamPackage getRamPackage();

} //RamFactory
