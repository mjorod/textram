package cl.uchile.pleiad.converter

import ca.mcgill.cs.sel.ram.Aspect
import java.util.Map

class ModelConverterProxy implements IModelConverter {
	
	private static val ModelConverterProxy instance = new ModelConverterProxy
	private val Map<String, Aspect> aspects = newHashMap
	
	private new() {}
	
	def static getInstance() {
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
	}
}