#Aspecto Blockable

!["Aspecto Blockable"](/img/Blockable.png "Aspecto Blockable")

`
         aspect Blockable dependsOn ??? {
		   mandatory {
		     |Blockable<|ReturnType, |BlockableOperation>
           }

		   structure {
		     /**
		      * Should suspends callers that call
			  * |blockableOperation until continue or skip is called.
			  * If continue is called, the operation call proceeds. If
			  * is called, the operation is not called instead
			  * the value given as a parameter to skip is returned. 
			  */
             partial class |Blockable {
			   mandatory {
			     |ReturnType
			   }

               -boolean blocked
			   -boolean skip
			   +|ReturnType |blockableOperation(..)
			   +block()
			   +continue()
			   +skip(|ReturnType value)
               
             }
		   
           }
         }
		 




`
