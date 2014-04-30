package cl.uchile.pleiad.textram.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import cl.uchile.pleiad.TextRAMTestsInjectorProvider
import com.google.inject.Inject
import ca.mcgill.cs.sel.ram.Aspect
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import cl.uchile.pleiad.textRam.TextRamPackage
import cl.uchile.pleiad.validation.TextRAMValidator

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(TextRAMTestsInjectorProvider))
class TextRAMMessageViewValidatorTest {
	
	@Inject extension ParseHelper<Aspect>
	@Inject extension ValidationTestHelper
	
	@Test
	def testIfOperationIsDefinedOnMessageInteraction() {
//		'''
//		aspect A {
//			structuralView {
//				class C1 { 
//					+ void operation() 
//				}
//				class C2 {}
//			}
//			
//			messages {
//				lifelines {
//					ref c1:C1
//					ref c2:C2
//				}
//				
//				messageView C1.operation() {
//					c1 => c2 { operation() }
//				}
//			}
//		}
//		'''.parse.assertNoErrors
//		.parse.assertError(
//				TextRamPackage.eINSTANCE.TMessage,
//				TextRAMValidator::MEMBER_UNDEFINED,
//				"The operation 'undefinedOperation' is undefined")				
	}
	
	
	
}