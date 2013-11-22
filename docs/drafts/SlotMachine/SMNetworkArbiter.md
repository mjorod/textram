#Aspecto SMNetworkArbiter

!["Aspecto SMNetworkArbiter"](img/SMNetworkArbiter.png "Aspecto SMNetworkArbiter")

`


         /**
		 * Incomplete in that the map is not filled in. It should be done at instantiation time or configuration time.
		 */
         aspect SMNetworkArbiter extends SMNetwork, dependsOn Map, Named, Singleton {
		   structure {
		     class Arbiter {
		       ~Result notAllowed()
			   +Arbiter getArbiter()
		     }
		   
		     class Command {
		       ~ Result execute()
		     }
		   
		     class Result {}
		     class NotAllowed extends Result {}
		   
		     implementations {
		       Map       { |Key                     -> String;
			               |Value                   -> boolean;
			               |Data                    -> Arbiter
			   }
			   Named     { |Named                   -> Command }
			   Singleton { |Singleton<|getInstance> -> Machine<getArbiter> }
		     }
		   }
		   
		   messageView {
		     message Command.execute affectedBy arbitExec
			 /**
			 * Independent of actual protocols being used. Only assumes that the commands are named differently according to the protocol being used, such that they can be configured unambiguously.
			 */
			 message arbitExec {
			   pointcut {
			     caller:Caller -> target:Command { execute() }
			   }
			   
			   advice {
			     caller:Caller -> target:Command { execute() }
				 target:Command -> target:Command { name := getName() }
				 target:Command -> <<singleton>>Arbiter { allowed := getValue(name) }
				 alt [ allowed ] {}
                 [ else ] {
				   target:Command￼-> ret:NotAllowed { ret := create () }
				 }
			   }
			 }
		   }
		 }

`
