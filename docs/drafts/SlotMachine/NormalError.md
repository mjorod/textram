#Aspecto NormalError

!["Aspecto NormalError"](img/NormalError "Aspecto NormalError")

`




          aspect NormalError dependsOn Betting, Named {
		    structure {
			  class NormalError {
			    +NormalError create(String errorName)
			  }
			  
			  class ReportingInterface {
			    +reportError(NormalError err)
				+clearReport()
			  }
			  
			  /**
			  * Should be called
			  * by user interface
			  */
			  class Machine {
			   +reportError(NormalError err)
			   +clearError()
			   +Machine getMachine()
			  }
			  
			  instantiations {
			    Named     { |Named → NormalError }
				Singleton { |Singleton<|getInstance> → Machine<getMachine> }
			  }
			}
			messageView {
			  message create {
			    >>                 -> targer:NormalError   { e := create(errorName) }
				targer:NormalError -> <<singleton>>Machine { reportError(this) }
			  }
			  
			  message reportError {
			    >>             -> target:Machine         { reportError(err) }
				target:Machine -> target:Machine         { ri := getMyRI }
				target:Machine -> ri: ReportingInterface { reportError(err) } 
			  }
			  
			  message clearError {
			    >>             -> target:Machine        { reportError(err) }
				target:Machine -> target:Machine        { ri := getMyRI }
				target:Machine -> ri:ReportingInterface { clearReport() }
			  }
			}
		  }


`
