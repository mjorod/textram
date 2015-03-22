package cl.uchile.pleiad.generator

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.RamFactory
import cl.uchile.pleiad.textRam.TAspect

class RamGenerator {
	
	private Aspect ramAspect
	private TAspect textRamAspect
	
	new(TAspect textRamAspect) {
		this.textRamAspect = textRamAspect
		
		ramAspect = RamFactory.eINSTANCE.createAspect => [
			name = textRamAspect.name
		]
		
		ramAspect.structuralView = generateStructuralView(this.textRamAspect, ramAspect)
		ramAspect.messageViews.addAll(generateMessageView(this.textRamAspect, this.ramAspect))
	}
	
	def generateMessageView(TAspect from, Aspect to) {
		new MessageViewsGenerator( from, to ).messagesView
	}
	
	def getRamAspect() {
		ramAspect
	} 
	
	private def generateStructuralView(TAspect from, Aspect to) {
		new StructuralViewGenerator(from, to).structuralView
	}
	
	
	
}