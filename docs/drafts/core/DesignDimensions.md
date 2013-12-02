#Dimensiones de diseño

Los DSLs son herramientas poderosas en la ingeniería de software, porque ante un problema en particular ofrecen una solución a la medida. El diseño de un DSL viene con un alto grado de libertad, que hace díficil encontrar un nivel correcto de abstración, una cobertura adecuada del dominio en estudio y consistencia entre elementos.

Para enfrentar dichos retos, Voelter propone un "framework" para describir y caracterizar los DSL. Dicho "framework" identifica 7 dimensiones, para un correcto diseño de un DSL:

1. Expresividad
2. Cobertura
3. Semánticas
4. Separación de preocupaciones
5. Completitud
6. Modularización del lenguaje
7. Sintaxis.

##Expresividad
Los DSLs son mucho más expresivos que los GPLs. El aumento de la expresividad, tiene como resultado: programas más cortos y mayor disponibilidad de herramientas para el proceso de la semántica.

Por lo general, los programas cortos, son de más fácil lectura y escritura, por tanto más eficientes dentro del ámbito de la ingeniería de software. 

Los DSLs pueden ser optimizados para los casos comunes y pueden requerir código escrito en GPLs para cubir los casos de borde.

Los DSLs son más abstractos que los GPLs: evitar describir detalles que son irrelevantes al propósito del modelo. El motor de ejecución rellena los detalles faltantes para hacer el programa ejecutable en una plataforma específica. Los buenos DSLs son *declarativos*: proporcionan abstracciones linguisticas para conoceptos relevantes del dominio que permiten "entender" la semántica del dominio sin análsis sofisticado del código.

La expresividad viene con una desventaja: antes de poder escribir programas concisos, los usuarios tienen que aprender el lenguaje. Esta tarea puede separarse en el aprendizaje del dominio, y el aprendizaje de la sintaxis del lenguaje.  Para persona que ya conocen el dominio el aprendizaje de la sintaxis puede simplicaficarse con el uso de un buen IDE ("code completion, quick fixes") y con una buena documentación basada en ejemplos. Si el dominio es soportado por un lenguaje bien definido, este puede servir como buen punto de referencia para el dominio en si mismo. Aprender el dominio puede ser simplificado con el trabajo de un buen DSL.

###Linguistica vs. Abstracciones dentro del lenguaje.
Existen dos formas para definir abstracciones. Las abstracciones pueden ser construídas dentro del lenguajes (abstracciones linguisticas), o pueden se expresadas por conceptos disponibles dentro del lenguajes (abstracciones dentro del lenguajes). DSLs por lo general se apoyan en las abstracciones linguisticas, en cambio los GPLS se apoyan en abstracciones dentro del lenguaje.

**Abtracción linguistica** Un concepto de dominio específico puede ser modelado con la ayuda de una abstracción existente, o puede introducirse una nueva abstracción para dicho concepto. No se requiere de relevancia semántica o patrones para expresar los programas dentro de un dominio en particular.

`
    int[] arr = ...                                             int[] arr = ...
	for (int i = 0; i<arr.size(); i++) {               OrderedList<int> l = ...
	  sum += arr[i];                                        for (int i=0; i<arr.size(); i++) {
	}                                                                 l.add( arr[i] );
	                                                                }

`
