package cl.uchile.pleiad.transform;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.serializer.impl.Serializer;

import com.google.inject.Guice;
import com.google.inject.Injector;

import cl.uchile.pleiad.textRam.TAspect;
import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.RamPackage;
import ca.mcgill.sel.commons.emf.util.ResourceManager;

public class RamToTextRam {

	public static void main(String[] args) {
		
		String file = "/Users/moliva/touchram/touchram/ca.mcgill.sel.ram.gui/models/reusable_model_library/util/ZeroToMany-Ordered.ram";
		
		if (!EPackage.Registry.INSTANCE.containsKey(RamPackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(RamPackage.eINSTANCE.getNsURI(), ca.mcgill.cs.sel.ram.RamPackage.eINSTANCE);
		}
		
		Aspect ramAspect = (Aspect)ResourceManager.loadModel(file); 
				
		ITextRAMTransform transformer = new TextRAMTransform();
				
		TAspect res =  transformer.transform(ramAspect);
		
		Injector injector = Guice.createInjector(new  cl.uchile.pleiad.TextRAMRuntimeModule());  
		Serializer serializer = injector.getInstance(Serializer.class);  
		
		String str = serializer.serialize(res);
		
		System.out.print(str);
		
	}

}
