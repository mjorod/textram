package cl.uchile.pleiad;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain;
import org.eclipse.ocl.examples.pivot.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.examples.pivot.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.examples.pivot.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.examples.xtext.oclinecore.OCLinEcoreStandaloneSetup;

import com.google.inject.Injector;

import ca.mcgill.cs.sel.ram.RamPackage;
import cl.uchile.pleiad.TextRAMStandaloneSetup;

/**
 * This class overrides register method to include manually ca.mcgill.sel.ram.RamPackage
 * @author moliva
 *
 */
public class TextRAMTestsStandaloneSetup extends TextRAMStandaloneSetup {
	
	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		initializeOCL();
		
		return super.createInjectorAndDoEMFRegistration();
	}
	
	@Override
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey(RamPackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(RamPackage.eINSTANCE.getNsURI(), ca.mcgill.cs.sel.ram.RamPackage.eINSTANCE);
		}
		
		super.register(injector);
	}
	
	private static void initializeOCL() {
        // initialize OCL
        // register Pivot globally (resourceSet == null)
        org.eclipse.ocl.examples.pivot.OCL.initialize(null);
        
        String oclDelegateURI = OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT;
        EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
            new OCLInvocationDelegateFactory.Global());
        EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
            new OCLSettingDelegateFactory.Global());
        EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI,
            new OCLValidationDelegateFactory.Global());
        
        OCLinEcoreStandaloneSetup.doSetup();
        
        // install the OCL Standard library
        //
        // using Eclipse Indigo
        //
        // org.eclipse.ocl.examples.library.oclstdlib.OCLstdlib.install();
        // using Eclipse Juno
        //
        org.eclipse.ocl.examples.pivot.model.OCLstdlib.install();
    }
}
