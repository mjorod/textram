#Aspecto DemoNetworkResolution

!["Aspecto DemoNetworkResolution"](/img/DemoNetworkResolution.png "Aspecto DemoNetworkResolution")

En la vista estructural, se puede ver un ejemplo de *herencia*, la clase *OutOfServiceResult* es un subtipo de la clase *Result*

También existe un nuevo *"keyword"*: **implementation** (ver vista estructural)

Observaciones: Sigo teniendo duda con la línea de vida de los diagramas de secuencia.

`



          aspect DemoNetworkResolution extends Demo, SMNetwork, NetworkError, dependsOn Singleton {
            structure {
              class Result {}

              class OutOfServiceResult extends Result {
	  		    +OutOfServiceResult create()
	  		  }

              implementations {
			    Singleton {
			      |Singleton<|getInstance> -> Machine<getMachine>
			    }
			  }
		    }
			
			messageView {
			  message ReceiveCommand affectedBy outOfService
			  message outOfService {
			    pointcut {
			      caller:Caller -> target:NetworkCommandExecutor { receiveCommand(com) }
				}
				
				advice {
			      caller:Caller                 -> target:NetworkCommandExecutor { receiveCommand(com) }
				  target:NetworkCommandExecutor -> <<Singleton>>:Machine         { demo:= isDemoOn }
				  alt [ demo ] {
				    target:NetworkCommandExecutor -> result:OutOfService { result:= create() }
				  }
				  [else] {}
				}
			  }
			  
			  message sendCritical, sendNormal, affectedBy muteError
			  message muteError {
			    pointcut {
				  caller:Caller -> target:NetworkCommandExecutor { sendMessage(res) }
				}

                advice {
			      caller:Caller                 -> target:NetworkCommandExecutor { receiveCommand(com) }
				  target:NetworkCommandExecutor -> <<Singleton>>:Machine         { demo:= isDemoOn }
				  opt [ !demo ] {
				    [*]
				  }
				}
			  }
			}
		  }
		  


`
