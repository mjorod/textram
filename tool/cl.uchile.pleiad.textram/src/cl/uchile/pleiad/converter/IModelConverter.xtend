package cl.uchile.pleiad.converter

import ca.mcgill.cs.sel.ram.Aspect

interface IModelConverter {
	def Aspect convertTextRAMModelToRAMModel(Aspect aspect)
}