package cl.uchile.pleiad.textram.tests;

import org.eclipse.emf.ecore.EPackage;

import com.google.inject.Injector;

import cl.uchile.pleiad.TextRAMStandaloneSetup;

/**
 * This class overrides register method to include manually ca.mcgill.sel.ram.RamPackage
 * @author moliva
 *
 */
public class TextRAMTestsStandaloneSetup extends TextRAMStandaloneSetup {
	
	@Override
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey(ca.mcgill.cs.sel.ram.RamPackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(ca.mcgill.cs.sel.ram.RamPackage.eINSTANCE.getNsURI(), ca.mcgill.cs.sel.ram.RamPackage.eINSTANCE);
		}
		
		super.register(injector);
	}
}
