#Propuesta para la sintaxis concreta textual de TextRAM

##Vista estructural

Para ejemplificar la vista estructural se hará uso del aspecto ZeroToManyAssociation

`
aspect ZeroToManyAssociation {
  structure {
    partial class |Data {
     +add(|Associated a) // el nombre del parámetro es opcional
	 +remove(|Associated a)
	 +Set<|Associated> getAssociated()
    }

    class Set {
	  ~Set create()
	  ~add(|Associated a)
	  ~remove(|Associated a)
	  ~delete()
    }

    partial class |Associated {
	}

    associations {
      |Data *--> 1 Set
	  Set --> 0..* |Associated
    }
  }
  
  aspect Observer dependsOn ZeroToManyAssociation {
    structure {
	  partial class |Subject {
        ~void notify()
		+void |m()
      }

      partial class |Observer {
        +void startObserving(|Subject)
		+void stopObserving(|Subject)
		~void |update(|Subject)
      }

      instantiation ZeroToMany {
	    |Data -> |Subject
		|Associated -> |Observer
      }
    }
  }
`
