package cl.uchile.pleiad.textram.tests

import ca.mcgill.cs.sel.ram.Aspect
import cl.uchile.pleiad.TextRAMTestsInjectorProvider
import cl.uchile.pleiad.validation.TextRAMValidator
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import cl.uchile.pleiad.textRam.TextRamPackage

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(TextRAMTestsInjectorProvider))
class TextRAMMessageViewValidatorTest {
	
	@Inject extension ParseHelper<Aspect>
	@Inject extension ValidationTestHelper
	
	@Test
    def testValidNumberOfArgumentsForOperationOnInteraction() {
		'''
		aspect A {
			structure {
				class C1 { 
					+ void operation()
				}
				class C2 { 
					+ void start(int a, int b, int c)
				}
			}
			
			messages {
				lifelines {
					ref c1:C1
					ref c2:C2
				}
				
				messageView C1.operation() {
					c1 => c2 { start(a, b) }
				}
				
			}
		}
		'''.parse.assertError(
			TextRamPackage.eINSTANCE.TMessage,
			TextRAMValidator::INVALID_ARGUMENTS,
			"Invalid arguments on 'start'"
		)
	}
	
	@Test
	def testValidArgumentsForOverloadedOperationOnInteraction() {
		'''
		aspect A {
			structure {
				class C1 { 
					+ void operation()
				}
				class C2 { 
					+ void start(int a, int b, int c)
					+ void start(boolean x, boolean y)
				}
			}
			
			messages {
				lifelines {
					ref c1:C1
					ref c2:C2
				}
				
				messageView C1.operation() {
					c1 => c2 { start(a, b) }
				}
				
			}
		}
		'''.parse.assertError(
			TextRamPackage.eINSTANCE.TMessage,
			TextRAMValidator::INVALID_ARGUMENTS,
			"Invalid arguments on 'start'"
		)
	}
	
	@Test
	def testArgumentsOnMessageViewHeader() {
		'''
		aspect A {
			structure {
				class C1 { 
					+ void operation(int x, int y)
				}
				class C2 { 
					+ void start(int a, int b, int c)
				}
			}
			
			messages {
				lifelines {
					ref c1:C1
					ref c2:C2
				}
				
				messageView C1.operation(y) {
					c1 => c2 { start(a, b, c) }
				}
				
			}
		}
		'''.parse.assertError(
			TextRamPackage.eINSTANCE.TMessageView,
			TextRAMValidator::INVALID_ARGUMENTS,
			"Invalid arguments on 'operation'"
		)
	}
	
}