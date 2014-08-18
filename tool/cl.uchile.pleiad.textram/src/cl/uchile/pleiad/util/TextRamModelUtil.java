package cl.uchile.pleiad.util;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.serializer.impl.Serializer;

import com.google.inject.Guice;
import com.google.inject.Injector;

import cl.uchile.pleiad.textRam.TAspect;
import cl.uchile.pleiad.textRam.TInstantiationHeader;
import cl.uchile.pleiad.transform.ITextRAMTransform;
import cl.uchile.pleiad.transform.TextRAMTransform;
import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.Instantiation;
import ca.mcgill.cs.sel.ram.InstantiationType;
import ca.mcgill.cs.sel.ram.RamPackage;
import ca.mcgill.sel.commons.emf.util.ResourceManager;

public class TextRamModelUtil {

	private TextRamModelUtil() {}
	
	public static Aspect loadModelFromFile(String file) {
		if (!EPackage.Registry.INSTANCE.containsKey(RamPackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(RamPackage.eINSTANCE.getNsURI(), ca.mcgill.cs.sel.ram.RamPackage.eINSTANCE);
		}
		
		Aspect res = (Aspect)ResourceManager.loadModel(file);
		
		return res;
	}
	
	public static TAspect transformToTextRamAspect( Aspect ramAspect ) {
		ITextRAMTransform transformer = new TextRAMTransform();
		
		TAspect res =  transformer.transform(ramAspect);
		
		return res;
	}
	
	public static String serialize(TAspect a) {
		Injector injector = Guice.createInjector(new  cl.uchile.pleiad.TextRAMRuntimeModule());  
		Serializer serializer = injector.getInstance(Serializer.class);  
		
		String res = serializer.serialize(a);
		
		return res;
	}
	
	public static Set<TAspect> transformExtendedAspects( Aspect aspect ) {
		Set<TAspect> res = new HashSet<TAspect>();
		
		for ( Instantiation instantiation : aspect.getInstantiations()) {
			//if ( instantiation.getType() == InstantiationType.EXTENDS ) {
				Aspect externalAspect = instantiation.getExternalAspect();
				
				// If it was already added, it not necessary to search for extended aspects of that aspect again
				// this prevents infinite loops in case of cyclic dependencies between aspects
				if (res.add( transformToTextRamAspect( externalAspect )) ) {
					res.addAll(  transformExtendedAspects( externalAspect ) );
				}
			//}
		}
		
		return res;
	}
	
	public static Set<TAspect> collectExtendedAspects( TAspect aspect ) {
		Set<TAspect> res = new HashSet<TAspect>();
		
		for ( TInstantiationHeader instantiation : aspect.getHeaderInstantiations() ) {
			for ( TAspect externalAspect : instantiation.getExternalAspects() ) {
				
				// If it was already added, it not necessary to search for extended aspects of that aspect again
				// this prevents infinite loops in case of cyclic dependencies between aspects
				if (res.add( externalAspect ) ) {
					res.addAll(  collectExtendedAspects( externalAspect ) );
				}
			}
		}
		
		return res;
	}
	
}
