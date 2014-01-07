package cl.uchile.pleiad.textram.tests

import ca.mcgill.cs.sel.ram.Aspect
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import cl.uchile.pleiad.TextRAMTestsInjectorProvider
import org.junit.Before

/*TODO: testAspectModelWithNoNameIsNotAllowed
 *      testAspectModelWithStrangeCharsIsNotAllowed
 *      testClassWithStrangeCharsIsNotAllowed
 *      testClassWithNoNameIsNotAllowed
 *      testPartialClassNamingConvetion
 *      testMethodWithNoNameIsNotAllowed
 */

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(TextRAMTestsInjectorProvider))
class TextRamParserTest {
	
	@Inject extension ParseHelper<Aspect>
	@Inject extension ValidationTestHelper
	
	@Test
	def testEmptyAspectModelWithEmptyStructure() {
		'''aspect A { structure {  } }'''.parse.assertNoErrors
	}
	
	@Test
	def testEmptyAspectModelWithEmptyStructureAndEmptyClasses() {
		'''aspect A { structure { class C1 {} class C2{} } }'''.parse.assertNoErrors
	}
	
	@Test
	def testClassWithOneParameterlessPrivateMethod() {
		'''
		aspect A { 
			structure {
				class C1 {
		        	-  int op()        
		        }	
		    }
		}
		'''.parse.assertNoErrors
	}
	
//	
//	@Test
//	def testClassWithOneParameterlessAspectPrivateMethod() {
//		'''
//		aspect A {
//			structure {
//				class C1 {
//					~ privateAspectMethod()
//				}
//			}
//		}
//		'''.parse.assertNoErrors
//	}
//	
//	@Test
//	def testClassWithAllMethodsModifiers() {
//		'''
//		aspect A {
//			structure {
//				class C1 {
//					+ publicMethod()
//					- privateMethod()
//					~ privateAspectMethod()
//					
//				}
//			}
//		}
//		'''.parse.assertNoErrors
//	}
}