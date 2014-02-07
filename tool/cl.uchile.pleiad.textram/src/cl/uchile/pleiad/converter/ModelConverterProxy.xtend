package cl.uchile.pleiad.converter

import ca.mcgill.cs.sel.ram.Aspect
import java.util.Map

class ModelConverterProxy implements IModelConverter {
	
<<<<<<< HEAD
	private static val ModelConverterProxy instance = new ModelConverterProxy
	private val Map<String, Aspect> aspects = newHashMap
=======
	private static var ModelConverterProxy instance;
	private var Map<String, Aspect> aspects = newHashMap
>>>>>>> a014222359cdcf28781371da9ca4f2dfb72867b4
	
	private new() {}
	
	def static getInstance() {
<<<<<<< HEAD
		instance
	}
	
	def void reset() {
		aspects.clear
	}
	
	override convertTextRAMModelToRAMModel(Aspect textRamAspect) {
		if (aspects.containsKey(textRamAspect.name) == false) {
			val modelConverter = new ModelConverter
			
			val Aspect ramAspect = modelConverter.convertTextRAMModelToRAMModel(textRamAspect)
			
			aspects.put(textRamAspect.name, ramAspect)
		}
		
		aspects.get(textRamAspect.name)
=======
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
>>>>>>> a014222359cdcf28781371da9ca4f2dfb72867b4
	}
}