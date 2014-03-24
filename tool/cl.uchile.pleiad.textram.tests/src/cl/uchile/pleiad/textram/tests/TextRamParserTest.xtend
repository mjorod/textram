package cl.uchile.pleiad.textram.tests

import ca.mcgill.cs.sel.ram.Aspect
import cl.uchile.pleiad.TextRAMTestsInjectorProvider
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith

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
					- int op()
		        }	
		    }
		}
		'''.parse.assertNoErrors
	}
	
	@Test 
	def testOperationWithReturnTypeOfExistingClass() {
		'''
		aspect A { 
			structure {
				class CA {
					
				}
				class C1 {
					- CA operation()
		        }	
		    }
		}
		'''.parse.assertNoErrors
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
	def testClassWithOneAttribute() {
		'''
		aspect A { 
			structure {
				class C1 {
        			int myAttr
		        }
		    }
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def testClassWithMoreThanOneAttribute() {
		'''
		aspect A {
			structure {
				class C1 {
					int myAttr
					char MyChar;
					char MtOtherChar
				}
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def testClassWithAttributesAndOperations() {
		'''
		aspect A {
			structure {
				class C1 {
					int myAttr
					char myChar
					- boolean myBooleanOper()
				}
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def testPartialClassIsValid() {
		'''
		aspect A {
			structure {
				class |Partial {
					
				}
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def testPartialOperationIsValid() {
		'''
		aspect A {
			structure {
				class C1 {
					- int |myPartialMethod()
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