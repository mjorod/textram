package cl.uchile.pleiad.converter

import ca.mcgill.cs.sel.ram.Aspect
import java.util.Map

class ModelConverterProxy implements IModelConverter {
	
	private static var ModelConverterProxy instance;
	private var Map<String, Aspect> aspects = newHashMap
	
	private new() {}
	
	def static getInstance() {
		if (instance == null) { 
			instance = new ModelConverterProxy
		}
		instance
	}
	
//	def reset() {
//		aspects.clear
//	}
	
	override convertTextRAMModelToRAMModel(Aspect aspect) {
		if (aspects.containsKey(aspect.name) == false) {
			val modelConverter = new ModelConverter
			
			val Aspect ramAspect = modelConverter.convertTextRAMModelToRAMModel(aspect)
			
			aspects.put(aspect.name, ramAspect)
		}
		
		aspects.get(aspect.name)
	}
}