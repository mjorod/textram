/*
 * generated by Xtext
 */
package cl.uchile.pleiad;

import org.eclipse.xtext.conversion.IValueConverterService;

import cl.uchile.pleiad.converter.TextRAMConverter;
import cl.uchile.pleiad.scoping.IModelScopeProvider;
import cl.uchile.pleiad.scoping.ModelScopeProvider;


/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class TextRAMRuntimeModule extends cl.uchile.pleiad.AbstractTextRAMRuntimeModule {
	
	public Class<? extends IModelScopeProvider> bindIModelScopeProvider() {
		  return ModelScopeProvider.class;
	}
	
	@Override
    public Class<? extends IValueConverterService> bindIValueConverterService() {
        return TextRAMConverter.class;
    }
	
}
