package cl.uchile.pleiad.textram.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import cl.uchile.pleiad.TextRAMTestsInjectorProvider
import javax.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import ca.mcgill.cs.sel.ram.Aspect
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import ca.mcgill.cs.sel.ram.RamPackage

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(TextRAMTestsInjectorProvider))
class TextRamValidatorTest {
	
	@Inject extension ParseHelper<Aspect>
	@Inject extension ValidationTestHelper
	
	@Test
    def void testDuplicateClasses() {
            val model = '''
			aspect A { 
				structure {
					class C1 { 	}
					class C1 { 	}	
				}
			}
            '''.parse
            
            model.assertError(RamPackage::eINSTANCE.aspect, null,
                    "The 'noTwoClassesWithSameName' constraint is violated on 'ca.mcgill.cs.sel.ram.impl.StructuralViewImpl@2d9b57ca{platform:/resource/TextRAMTest/src/demo.xram#//@structuralView}'"
            )
    }
	
	
}