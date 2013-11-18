package cl.pleiad.ram.serializer;

import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.RamPackage;
import ca.mcgill.cs.sel.ram.StructuralView;
import cl.pleiad.ram.services.TextramGrammarAccess;
import cl.pleiad.ram.textram.RamModel;
import cl.pleiad.ram.textram.TextramPackage;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class TextramSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TextramGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RamPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RamPackage.ASPECT:
				if(context == grammarAccess.getAspectRule()) {
					sequence_Aspect(context, (Aspect) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.CLASS:
				if(context == grammarAccess.getClassRule()) {
					sequence_Class(context, (ca.mcgill.cs.sel.ram.Class) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.STRUCTURAL_VIEW:
				if(context == grammarAccess.getStructuralViewRule()) {
					sequence_StructuralView(context, (StructuralView) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == TextramPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TextramPackage.RAM_MODEL:
				if(context == grammarAccess.getRamModelRule()) {
					sequence_RamModel(context, (RamModel) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=EString structuralView=StructuralView)
	 */
	protected void sequence_Aspect(EObject context, Aspect semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Class(EObject context, ca.mcgill.cs.sel.ram.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     aspects+=Aspect*
	 */
	protected void sequence_RamModel(EObject context, RamModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (classes+=Class?)
	 */
	protected void sequence_StructuralView(EObject context, StructuralView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
