package cl.uchile.pleiad.textram.tests

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.InstantiationType
import cl.uchile.pleiad.TextRAMTestsInjectorProvider
import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(TextRAMTestsInjectorProvider))
class TextRamScopeProviderTest {
	
	@Inject extension ParseHelper<Aspect>
	@Inject extension ValidationTestHelper
	//@Inject extension IScopeProvider
	
	@Inject Provider<ResourceSet> resourceSetProvider;
	
	
	 @Test 
	 def void testBindPartialClass() {
     	val resourceSet = resourceSetProvider.get
     	
     	val first = 
     	'''
		aspect ExternalAspect {
			structure {
				class |ExternalClass { }
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
					|ExternalClass -> MyClass 
				}
			}
		}
     	'''.parse(resourceSet)
     	
     	first.assertNoErrors
     	second.assertNoErrors
     	
     	second.instantiations.head.externalAspect.assertSame(first)
     	second.instantiations.head.externalAspect.structuralView.classes.head.assertSame(first.structuralView.classes.head)
     }

 	@Test 
	def void testInstantiationExtension() {
		val resourceSet = resourceSetProvider.get
		
		val first = 
		'''
		aspect ExternalAspect {
			structure {
				class |ExternalClass { 
					- int   nonPartialMethod()
					- int   |partialMethod(int parm1)
					+ float publicMethod(float f1)
					~ void intraAspectMethod()
					int attribute
				}
				class SecondExternalClass { }
			}
		}
		'''.parse(resourceSet)
		
		val second = 
		'''
		aspect Aspect {
			structure {
				class MyClass { 
					- int   innerNonPartialMethod()
					- int   |innerPartialMethod(int parm1)
					+ float innerPublicMethod(float f1)
					~ void innerIntraAspectMethod()
					int innerAttribute
				}
			}
			instantiations {
				extends ExternalAspect {
					|ExternalClass<nonPartialMethod, |partialMethod, publicMethod, intraAspectMethod, attribute> -> MyClass<innerNonPartialMethod, |innerPartialMethod, innerPublicMethod, innerIntraAspectMethod, innerAttribute>
				}
			}
		}
		'''.parse(resourceSet)
		
		first.assertNoErrors
		second.assertNoErrors
		
		second.instantiations.head.type.assertSame( InstantiationType.EXTENDS )
	}
	
	@Test 
	def void testInstantiationCustomization() {
		val resourceSet = resourceSetProvider.get
		
		val first = 
		'''
		aspect ExternalAspect {
			structure {
				class |ExternalClass { 
					- int   nonPartialMethod()
					- int   |partialMethod(int parm1)
					+ float publicMethod(float f1)
					~ void intraAspectMethod()
					int attribute
				}
				class SecondExternalClass { }
			}
		}
		'''.parse(resourceSet)
		
		val second = 
		'''
		aspect Aspect {
			structure {
				class MyClass { 
					- int   innerNonPartialMethod()
					- int   |innerPartialMethod(int parm1)
					+ float innerPublicMethod(float f1)
					~ void innerIntraAspectMethod()
					int innerAttribute
				}
			}
			instantiations {
				dependsOn ExternalAspect {
					|ExternalClass<publicMethod> -> MyClass<innerPublicMethod>
				}
			}
		}
		'''.parse(resourceSet)
		
		first.assertNoErrors
		second.assertNoErrors
		
		second.instantiations.head.type.assertSame( InstantiationType.DEPENDS )
	} 
     
}