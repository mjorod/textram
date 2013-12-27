package cl.uchile.pleiad.textram.tests

import ca.mcgill.cs.sel.ram.Aspect
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(TextRAMTestsInjectorProvider))
class TextRamParserTest {
	
	@Inject extension ParseHelper<Aspect>
	@Inject extension ValidationTestHelper
	
//	@Test
//	def testNonEmptyAspectIsAllowed() {
//		'''aspect A {}'''.parse.assertError;
//	}

	@Test
	def testEmptyAspect() {
		'''aspect A { structure {  } }'''.parse.assertNoErrors
	}
	
	
}