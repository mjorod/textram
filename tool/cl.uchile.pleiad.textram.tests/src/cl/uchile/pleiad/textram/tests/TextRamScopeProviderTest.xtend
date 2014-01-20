package cl.uchile.pleiad.textram.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import cl.uchile.pleiad.TextRAMTestsInjectorProvider
import ca.mcgill.cs.sel.ram.Aspect
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import com.google.inject.Provider
import org.eclipse.emf.ecore.resource.ResourceSet
import static extension org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(TextRAMTestsInjectorProvider))
class TextRamScopeProviderTest {
	
	@Inject extension ParseHelper<Aspect>
	@Inject extension ValidationTestHelper
	//@Inject extension IScopeProvider
	
	@Inject Provider<ResourceSet> resourceSetProvider;
	
	
	 @Test 
	 def void testScopeForExternalAspect() {
     	val resourceSet = resourceSetProvider.get
     	
     	val first = 
     	'''
     	aspect ExternalAspect {
			structure {
				class ExternalClass { }
				class SecondExternalClass { }
			}
		}
     	'''.parse(resourceSet)
     	
     	val second = 
     	'''
		aspect Aspect {
			structure {
				class MyClass { }
			}
			instantiations {
				ExternalAspect {
					ExternalClass -> MyClass
				}
			}
		}
     	'''.parse(resourceSet)
     	
     	first.assertNoErrors
     	second.assertNoErrors
     	
     	second.instantiations.head.externalAspect.assertSame(first)
     	second.instantiations.head.externalAspect.structuralView.classes.head.assertSame(first.structuralView.classes.head)
     	
     }
	
	
	
}