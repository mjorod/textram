package cl.uchile.pleiad.textram.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import cl.uchile.pleiad.TextRAMTestsInjectorProvider
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import ca.mcgill.cs.sel.ram.Aspect
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(TextRAMTestsInjectorProvider))
class TextRamMessageViewParserTest {
	
	@Inject extension ParseHelper<Aspect>
	@Inject extension ValidationTestHelper
	
//	var structuralView = 'structure {
//		class |Data {
//			+ void add(|Associated a)
//			+ void remove(|Associated a)
//			+ boolean contains(|Associated a)
//			+ boolean create()
//		}    
//		  
//		class |Associated {}
// 
//		class Set {
//			int size
//			+ boolean create() 
//			~ void add(|Associated a)
//			~ boolean contains(|Associated a)
//			~ void remove(|Associated a)    
//			~ void delete()
//		}       
//		              
//		associations {    
//			Data -> 1 Set { mySet }
//			Set -> * |Associated { myAssociated }  
//		}       
//	}' 
//	
//	@Test
//	def testOptCombinedFragment() {
//		'''
//			aspect A {
//				« structuralView »
//			
//				messages {
//					objects {
//						ref target:|Data { boolean ignore }
//						ref newData:|Data
//						mySet:mySet 
//					}
//					
//					messageView Set.create() {
//						>>     => new target { add(|Associated a) : void }
//						target => new mySet { add() }   
//						opt [ 'mySet = null' ] {
//							newData => mySet { create() }
//						}
//					}
//				}
//			}
//		'''.parse.assertNoErrors
//	}
//	
//	@Test
//	def testNestedOptCombinedFragment() {
//		'''
//			aspect A {
//				« structuralView »
//			
//				messages {
//					objects {
//						ref target:|Data { boolean ignore }
//						ref newData:|Data
//						mySet:mySet 
//					}
//					
//					messageView Set.create() {
//						>>     => new target { add(|Associated a) : void }
//						target => new mySet { add() }   
//						opt [ 'mySet = null' ] {
//							newData => mySet { create() }
//							opt [ ' newData != null ' ] {
//								newData => mySet { create() }
//							}
//						}
//					}
//				}
//			}
//		'''.parse.assertNoErrors
//	}
//	
//	@Test
//	def testLoopCombinedFragment() {
//		'''
//			aspect A {
//				« structuralView »
//			
//				messages {
//					lifelines {
//						ref target:|Data { boolean ignore }
//						ref newData:|Data
//						assoc mySet:mySet 
//					}
//					
//					messageView Set.create() {
//						>>     => new target { add(Associated a) : void }
//						target => new mySet { add() }   
//						loop [ 'Observers o : observers' ] {
//							newData => mySet { create() }
//						}
//					}
//				}
//			}
//		'''.parse.assertNoErrors
//	}
	
	@Test
	def void testReturnMessage() {
		'''
		aspect A {
			
			structure {
				class A1 {
					+ void operationA1_1()
					+ void operationA1_2()
					+ int operationA1_3()
				}
				
				class B1 {
					+ int operationB1_1()
				}
			}
			
			messages {
				lifelines {
					ref a1:A1 { int result }
					ref b1:B1
				} 
				
				messageView A1.operationA1_1() {
					a1 => a1 { result := operationA1_3() }
					opt ["result == null"] {
						a1 => b1 { result := operationB1_1() }
					}
					return result
				}
			}
		}
		'''.parse.assertNoErrors
	}
	
}