#Aspecto InterceptingReturnsMetering

!["Aspecto InterceptingReturnsMetering"](/img/InterceptingReturnsMetering.png "Aspecto InterceptingReturnsMetering")

`



          aspect InterceptReturnsMetering extends Metering {
		    structure {
		      mandatory {
			    |InterceptReturns
			  }
			  
			  partial class |InterceptReturns {
			    -int  data
				~int  getData()
				~void setData(int data)
				+ * |interceptedMethod(..)
			  }
			  
			  instantiations {
			    Metering {
				  |InterceptStateChange<|modifyData> -> |InterceptReturns<setData>
				}
			  }
			}
			
			messageView {
			  message setData is Setter<data>
		      message setData is Getter<data>

              message |interceptedMethod {
			    pointcut {
			      caller:Caller -> target:|InterceptedReturns { interceptedMethod(..) }
				}
				
				advice {
			      caller:Caller              -> target:|InterceptedReturns { interceptedMethod(..) }
				  target:|InterceptedReturns -> target:|InterceptedReturns { setData(returnvalue) }
				}
			  }
			}
		  }


`
