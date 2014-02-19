package cl.uchile.pleiad.converter

import ca.mcgill.cs.sel.ram.Aspect
import java.util.Map
import cl.uchile.pleiad.generator.StructuralViewGenerator

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
			val generator = new StructuralViewGenerator( textRamAspect )
			
			val Aspect ramAspect = generator.generate
			
			aspects.put(textRamAspect.name, ramAspect)
		}
		
		aspects.get(textRamAspect.name)
	}
}