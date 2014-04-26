package cl.uchile.pleiad.textram.tests

import ca.mcgill.cs.sel.ram.Aspect
import cl.uchile.pleiad.TextRAMTestsInjectorProvider
import cl.uchile.pleiad.textRam.TextRamPackage
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import cl.uchile.pleiad.validation.TextRAMValidator

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(TextRAMTestsInjectorProvider))
class TextRAMStructuralViewValidatorTest {
	
	@Inject extension ParseHelper<Aspect>
	@Inject extension ValidationTestHelper
	
	@Test
	public def testDuplicateAttributes() {
		'''	
		aspect A {
			structure {
				class C {
					int attribute
					boolean attribute
				}
			}
		}
		'''.parse.assertError(
				TextRamPackage.eINSTANCE.TClassMember,
				TextRAMValidator::DUPLICATE_ELEMENT,
				"Duplicate member 'attribute'")				
	}
	
	@Test
	public def testDuplicateClasses() {
		'''
		aspect A {
			structure {
				class C {}
				class C {}
			}
		}
		'''.parse.assertError(
			TextRamPackage.eINSTANCE.TClass,
			TextRAMValidator::DUPLICATE_CLASS,
			"Duplicate class 'C'"
		)
	}
	
	@Test
	public def testDuplicateOperations() {
		'''
		aspect A {
			structure {
				class C {
					+ void operation(int a)
					+ int  operation(int b)
				}	
			}
		}
		'''.parse.assertError(
			TextRamPackage.eINSTANCE.TOperation,
			TextRAMValidator::DUPLICATE_ELEMENT,
			"Duplicate member 'operation'")
	}
	
	
}