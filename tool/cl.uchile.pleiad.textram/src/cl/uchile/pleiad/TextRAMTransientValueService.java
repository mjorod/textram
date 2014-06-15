package cl.uchile.pleiad;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;

import cl.uchile.pleiad.textRam.TOperation;
import cl.uchile.pleiad.textRam.TStructuralView;
import cl.uchile.pleiad.textRam.TextRamPackage;
import ca.mcgill.cs.sel.ram.RamPackage;

public class TextRAMTransientValueService extends DefaultTransientValueService implements ITransientValueService {

	@Override
	public boolean isCheckElementsIndividually(EObject owner,
			EStructuralFeature feature) {
	
		return false;
	}

	@Override
	public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
		if ( owner instanceof TStructuralView && RamPackage.STRUCTURAL_VIEW__TYPES == feature.getFeatureID() ) {
			return true;
		} 

		if ( owner instanceof TOperation && TextRamPackage.TPARAMETER == feature.getFeatureID() ) {
			return true;
		}

		return super.isTransient(owner, feature, index);
	}

}
