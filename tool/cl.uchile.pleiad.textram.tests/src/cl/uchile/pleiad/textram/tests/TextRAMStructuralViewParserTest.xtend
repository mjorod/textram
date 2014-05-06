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
	def testOperationWithOneParameter() {
		'''
		aspect A { 
			structure {
				class C1 {
		        	- int operation(int parm1)
		        }	
		    }
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def testOperationWithAListOfParameter() {
		'''
		aspect A { 
			structure {
				class C1 {
					-  int operation(int parm1, char parm2, boolean parm3)        
		        }	
		    }
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def testParameterTypeOfExistingClass() {
		'''
		aspect A { 
			structure {
				class C1 {
	        		-  int operation(ExistingClass parm1, char parm2, ExistingClass parm3)
		        }
				class ExistingClass {
					
				}
		    }
		}
		'''.parse.assertNoErrors
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
	
	@Test
	public def testClassWithMethodsOverloading() {
		'''aspect A { 
			structure { 
				class C { 
					+ int operation(int a1, int b1)
					- int operation(boolean a1)
				}
			}
		}'''.parse.assertNoErrors
	}
	
	@Test
	public def testLayouts() {
		'''aspect A { 
			structure { 
				
				@@x= 123
				@@y= 312
				class C {} 
			}
		}'''.parse.assertNoErrors
	}
	
	@Test
	public def testBidirectionalAssociations() {
		'''
		aspect A {
			structure {
				class A {}
				class B {}
				
				associations {
					A & B { myABBA }
				}
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def testAssociationBetweenClasses() {
		'''
		aspect A {
			structure {
				class From {}
				class To {}

				associations {
		            0..0 From -> 0..1 To { mySubject }
		        }		
			}
		}		
		'''.parse.assertNoErrors
	}
	
	@Test 
	def testValueConverterForManyMultiplicityOnUpperBound() {
		'''
		aspect A {
			structure {
				class From {}
				class To {}

				associations {
		            0..* From -> 0..* To { mySubject }
		        }		
			}
		}		
		'''.parse.assertNoErrors
	}
	
	@Test 
	def testOptionalLowerBoundOnFromAssociation() {
		'''
		aspect A {
			structure {
				class From {}
				class To {}

				associations {
		            1 From -> 1..1 To { mySubject }
		        }		
			}
		}		
		'''.parse.assertNoErrors
	}
	
	@Test 
	def testOptionalLowerBoundOnToAssociation() {
		'''
		aspect A {
			structure {
				class From {}
				class To {}

				associations {
		            1..* From -> 1 To { mySubject }
		        }		
			}
		}		
		'''.parse.assertNoErrors
	}
	
	@Test
	def testAssociationWithoutLowerBoundAndUpperBound() {
		'''
		aspect A {
			structure {
				class From {}
				class To {}

				associations {
		            From -> To { mySubject }
		        }		
			}
		}		
		'''.parse.assertNoErrors
	}
	
	@Test
	def testOneSuperType() {
		'''
		aspect A {
			structure {
				class Super {
					int myInt
				}
				
				class Derived : Super {
					
				}
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def testRSet() {
		'''
		aspect A {
			structure {
				class |MyClass {
					+ Set<String> getStringType()
					+ Set<int> getIntType()
				}
				class AnotherClass {
					+ Set<MyClass> getPartialClass()
				}
			}
		}
		'''.parse.assertNoErrors
	}
	
}