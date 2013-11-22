#Aspecto Demo

!["Aspecto Demo"](img/demo.png "Aspecto Demo")

Observaciones: ver *** dentro de la línea del pointcut del mensaje: determineNextOutcome

`


          aspect Demo extending Betting {
		    structure {
			  class Random Reels {
			    +int[] spinReels()
              }

              class Machine {
			    -boolean demoMode
				-int[]   nextOutcome
				-int     savedCredits

                +setDemo(boolean on)
				+boolean isDemoOn()
				+int[] nextOutcome()
				+setNextOutcome(int[] Symbol)
              }

              class ReelConfiguration {
			    +int positionForNextSymbol(int reel, Symbol sym)
              }

              instantiations {
			    Singleton {
				  |Singleton<getInstance> -> Machine<getInstance>
				}
              }
            }

            messageView {
			  message getNextOutcome is Getter<nextOutcome>
			  message setNextOutcome is Setter<nextOutcome>

              message setDemo {
			    >> -> setDemo(on) { target:Machine }
				alt [on] {
				  /**
				  * credits := savedCredits
				  */
                  target:Machine -> target:Machine { savedCredits := currentCredits() }
                }

                target:Machine -> target:Machine { setNextOutcome(null) }
			  }
			  
			  message spinReels affectedBy determineNextOutcome

              message determineNextOutcome {
			    pointcut {
				  caller:Caller -> target:RandomReels { result:= spinReels() }
				}

			    advice {
				  caller:Caller      -> target:RandomReels    { result := spinReels() }
				  target:RandomReels -> <<Singleton>>:Machine { outcome:= getNextOutcome() }
				  
				  alt [ outcome != null ] {
				    target:RandomReels -> <<Singleton>>:Machine { setNextOutcome(null) }
					target:RandomReels -> target:RandomReels    { rc:=getMyRC() }

                    loop [ int i = 0, i < 5, i++ ] {
					  target:RandomReels -> rc:ReelConfiguration { result[i]:= getPositionForSymbol(i, outcome[i]) }
                    }
				  }
				  
				}
			  }

              message getPositionForSymbol {
                /*
				* Returns a reel position that has that symbol
				*/
                >> -> getPositionForSymbol(sym)
              }
            }
          }   



`
