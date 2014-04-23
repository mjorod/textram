package cl.uchile.pleiad.textram.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import cl.uchile.pleiad.TextRAMTestsInjectorProvider
import org.eclipse.xtext.junit4.XtextRunner
import ca.mcgill.cs.sel.ram.Aspect
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import com.google.inject.Inject
import org.junit.Test

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(TextRAMTestsInjectorProvider))
class TextRAMStructuralViewParserTest {
	
	@Inject extension ParseHelper<Aspect>
	@Inject extension ValidationTestHelper
	
	@Test
	public def testAspectWithOneClassWithoutMembers() {
		'''aspect A { structure {  class C{} } }'''.parse.assertNoErrors
	}
	
	@Test
	public def testAspectWithOneClassWithOnlyAttributes() {
		'''aspect A { 
			structure { 
				class C { 
					int a
					int b
				}
			}
		}'''.parse.assertNoErrors
	}

	@Test
	public def testAspectWithOneClassWithOnlyOperations() {
		'''aspect A { 
			structure { 
				class C { 
					+ int operation()
					- boolean operation2()
				}
			}
		}'''.parse.assertNoErrors
	}
	
	
	
}