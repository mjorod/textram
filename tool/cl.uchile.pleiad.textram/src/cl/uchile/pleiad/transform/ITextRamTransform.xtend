package cl.uchile.pleiad.transform

import cl.uchile.pleiad.textRam.TAspect
import ca.mcgill.cs.sel.ram.Aspect

interface ITextRAMTransform {
	def TAspect transform(Aspect ramAspect);
	def Aspect transform(TAspect textRamAspect);
}