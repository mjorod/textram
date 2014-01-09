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
					operations {
		        		-  int op()
		        	}        
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
					operations {
		        		-  CA operation()
		        	}
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
					operations {
		        		-  int operation(int parm1)
		        	}        
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
					operations {
		        		-  int operation(int parm1, char parm2, boolean parm3)
		        	}        
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
					operations {
		        		-  int operation(ExistingClass parm1, char parm2, ExistingClass parm3)
		        	}        
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
					attributes {
	        			int myAttr
	        		}
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
					attributes {
						int myAttr
						char MyChar
					}
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
					attributes {
						int myAttr
						char myChar
					}
					operations {
						- boolean myBooleanOper()
					}
				}
			}
		}
		'''.parse.assertNoErrors
	}
	
	
}