/*
* generated by Xtext
*/
package cl.pleiad.ram;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class TextramUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return cl.pleiad.ram.ui.internal.TextramActivator.getInstance().getInjector("cl.pleiad.ram.Textram");
	}
	
}
