package cl.uchile.pleiad.serializer;

import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.RamPackage;
import cl.uchile.pleiad.services.TextRAMGrammarAccess;
import cl.uchile.pleiad.textRAM.StructuralView;
import cl.uchile.pleiad.textRAM.TextRAMPackage;
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
public class TextRAMSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TextRAMGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RamPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RamPackage.ASPECT:
				if(context == grammarAccess.getAspectRule()) {
					sequence_Aspect(context, (Aspect) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == TextRAMPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TextRAMPackage.STRUCTURAL_VIEW:
				if(context == grammarAccess.getStructuralViewRule()) {
					sequence_StructuralView(context, (StructuralView) semanticObject); 
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
	 *     {StructuralView}
	 */
	protected void sequence_StructuralView(EObject context, StructuralView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
