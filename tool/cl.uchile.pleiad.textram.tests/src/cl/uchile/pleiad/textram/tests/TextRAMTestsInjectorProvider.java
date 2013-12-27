package cl.uchile.pleiad.textram.tests;

import com.google.inject.Injector;

import cl.uchile.pleiad.TextRAMInjectorProvider;

/**
 * This class overrides internalCreateInjector method in order to use
 * TextRAMTestsStandaloneSetup. This class must be used for all tests
 * they want to use the RamPackage's parser.
 * @author moliva
 *
 */
public class TextRAMTestsInjectorProvider extends TextRAMInjectorProvider {
	
	@Override
	protected Injector internalCreateInjector() {
	    return new TextRAMTestsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

}
