package cl.uchile.pleiad.generator

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.RamFactory

class RamGenerator {
	
	private Aspect ramAspect
	private Aspect textRamAspect
	
	new(Aspect textRamAspect) {
		this.textRamAspect = textRamAspect
		
		ramAspect = RamFactory.eINSTANCE.createAspect => [
			name = textRamAspect.name
		]
		
		ramAspect.structuralView = generateStructuralView(this.ramAspect, this.textRamAspect)
		ramAspect.messageViews.addAll(generateMessageView(this.ramAspect, this.textRamAspect))
	}
	
	def generateMessageView(Aspect aspect, Aspect aspect2) {
		new MessageViewsGenerator( this.textRamAspect, this.ramAspect  ).messagesView
	}
	
	def getRamAspect() {
		ramAspect
	}
	
	private def generateStructuralView(Aspect aspect, Aspect aspect2) {
		new StructuralViewGenerator( this.textRamAspect, this.ramAspect ).structuralView
	}
	
	
	
}