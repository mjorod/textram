# Metodología 

## Implementación de las nociones semánticas

### Sintaxis concreta y abstracta

La sintaxis concreta de un lenguaje, es la interfaz que utilizan los usuarios para crear programas; la sintaxis abstracta es la representación semántica de dicho lenguaje.

La sintaxis abstracta es una estructura de datos o modelo, que actúa como una API para aplicar herramientas de validación, transformación y generación de código.

Existen dos estrategias para el desarrollo de las sintaxis concretas y abstractas:

Primero definir la sintaxis concreta

:    la sintaxis abstracta es derivada a partir de la sintaxis concreta, ya sea de forma automática o con la ayuda de "hints" en la especificación de la sintaxis concreta.

Primero definir la sintaxis abstracta

:    la sintaxis concreta se define a partir de las especificaciones de la sintaxis abstracta.

También, hay dos técnicas para la creación de la sintaxis abstracta:

1. Parsers: utilizan una definición formal llamada gramática, para poder derivar la sintaxis abstracta a partir de la sintaxis concreta.

2. Proyección: la sintaxis abstracta es generada a partir de acciones realizadas por el usuario en un editor. La sintaxis concreta es dinámica y es generada a partir de los cambios ocurridos en la sintaxis abstracta. La proyección no utiliza gramática.

Los compiladores tradicionales utilizan parsers creados en forma manual, la consecuencia de esto son programas grandes y monolíticos; el árbol de sintaxis abstracta (AST) es generado por medio de recursiones y lectura de un flujo de caracteres de entrada.

"Parser Generator" es una técnica mencionada por [@Fowler2010] en donde el parser se genera en forma automática en base a la especificación de una gramática. Este es el enfoque que utilizan la mayoría de los compiladores actuales.

La siguiente tabla muestra, las diferencias entre ambos enfoques:

--------------------------------------------
 Enfoque                         Ventajas           | Desventajas     |
===================================
 Generador de "parser"        |  El "parser" se genera en forma automática, por tanto disminuye el tiempo de construcción del lenguaje. El desarrollador no tiene que ser un experto en la tecnología que crea parsers. | No ofrece el mismo renfimiento o reporte de errores en comparación con un "parser" hecho a la medida por un experto. |
+------------+------------+------------+
| "Parser" manual | El "parser" manual es más rápido | El desarrollador debe ser un experto para la creación de lenguajes |
+------------+------------+------------+

Xtext es una herramienta que sirve para implementar lenguajes de programación (DSLs o GPLs), dentro del marco de trabajo de Eclipse. Xtext es un generador de "parsers" y ofrece toda la infraestructura para definir restricciones, manejo de tipos, "scoping", generación de código, interpretes, "quickfixes" y todas las características de un lenguaje de programación moderno.

## Xtext

MEJORAR!!! A continuación se explica la filosofía de Xtext con respecto a la generación automática de "parsers", su relación con los modelos semánticos (AST), su integración con el Eclipse Modeling Framework y algunas propiedades importantes de Xtext.

Xtext se apoya en ANTLR [@Antlr] para generar el "parser". ANTLR (pronunciado: "Antler, ANother Tool for Language Recognition") pertence al mundo de Java y permite al modelador especificar la gramática del lenguaje en un simple archivo.

Fowler, menciona el concepto de **modelos semánticos**: modelos de objetos en memoria que un DSL debe popular. El modelo semántico y la sintaxis abstracta son términos equivalentes.

Xtext utiliza EMF Ecore para persistir el modelo semántico en memoria.

### EMF Ecore {-}

"Eclipse Modeling Framework" (EMF) [@Steinberg2009], es el corazón de las herramientas de modelado de Eclipse. EMF expone una amplia variedad de servicios y herramientas para persistir, editar y procesar modelos.

EMF utiliza Ecore para la definición de meta-modelos. Gracias a Ecore, se puede obtener:

- Diferentes representaciones (código Java, XML, UML) del meta-modelo.
- Mecanismos automáticos de transformación entre las diferentes representaciones.
- Clases generadas por EMF.Edit que sirven como punto de partida para la implementación de código y el desarrollo de una aplicación.
- Un editor genérico para la creación, visualización y edición de modelos.
- Una API de consultas para la obtención de la estructura del meta-modelo.
- Mecanismos de reflexión para la manipulación de instancias del meta-modelo.

Los modelos básicos de Ecore son:

1. *EClass*: representa los modelos del lenguaje (elementos de la sintaxis abstracta).
2. *EAtrribute*: describe el estado de un EClass.
3. *EDataType*: indica el tipo de un atributo. Un tipo de dato puede ser primitivo o un tipo de objetos como ser `java.util.Date`.
4. *EReference*: representa asociaciones entre EClases. En forma opcional los EReferences pueden tener semántica de contenedores.
5. *EObject*, representa instancias de EClasses (por ejemplo nodos AST). Cada EObject puede ser contenido de al menos una instancia de EReference.
6. *EPackage*: agrupa clases y tipos de datos relacionados.

![Meta-modelo básico de Ecore](img/EcoreBasicMetamodel.png)

### Sintaxis y Gramática

La gramática (piedra angular de Xtext) es la definición formal de la sintaxis concreta. El objetivo de la gramática es indicar como se mapea la sintaxis concreta con la sintaxis abstracta representada en memoria. El modelo se produce dinámicamente por el "parser" cuando se consume una entrada válida de texto.

### Declaración del lenguaje {-}

El lenguaje se declara en el encabezado de la gramática. Ejemplo:

    grammar cl.pleiad.ram.Textram
	   with org.eclipse.xtext.common.Terminals

En el encabezado también se indica la reutilización de otras gramáticas, por ejemplo: `org.eclipse.xtext.common.Terminals`

### Reglas 

### Terminales {-}

En la primera etapa llamada "*lexing*", una secuencia de caracteres (entrada de texto) es transformada en una secuencia llamada "tokens". Los "tokens" consisten de un o más caracteres y corresponden a una regla "terminal" o "keyword" y por tanto representan un símbolo atómico. Por ejemplo, `ID` es una regla "Terminal" definida en `org.eclipse.xtext.common.Terminals`, su implementación es la siguiente:

    terminal ID:
	  (’^’)?(’a’..’z’|’A’..’Z’|’_’) (’a’..’z’|’A’..’Z’|’_’|’0’..’9’)*;

El orden de las reglas "terminal" es importante para la gramática, ya que se sobre-escriben unas a otras.

##### Tipos de retorno {-}

Cada regla "terminal" retorna un valor atómico: un EDataType de Ecore que por defecto es una instancia de ecore::EString. A continuación se presenta un ejemplo que retorna una regla llamada *INT*:

    terminal INT returns ecore::EInt:
	  ('0'..'9')+`

##### Expresiones Backus-Naur extendendidas {-}

Las reglas terminales son descritas por medio de expresiones "Extended Backus-Naur Form" (EBNF).

Cada una de las expresiones definidas por EBNF, posee cuatro posibles cardinalidades:

1. exactamente uno (sin operador, configurado por defecto)
2. uno o más (operador `?`)
3. cualquiera (cero o más, operador `*`)
4. uno o muchos (operador `+`)

##### Rango de caracteres {-}

Un rango de caracteres puede ser declarado con el operador `..`:

    terminal INT returns ecore::EInt: ('0'..'9')+;

En este caso INT retorna un o más caracteres en '0' y '9'

##### "Wildcards" {-}

Para permitir cualquier caracter, se puede utilizar el "wildcard" `.` (punto):

    terminal FOO: 'f' . 'o';

Está regla permite las siguientes expresiones: *foo, f0o, f_o*.

##### "Until Token" {-}

Indica que todo debe ser consumido hasta la aparición del "token":

    terminal ML_COMMENT: '/*' -> '*/';

El ejemplo anterior es un comentario regular de Java.

##### "Negated Token" {-}

Todos los "tokens" pueden ser negados con el uso del signo de admiración:

    terminal BETWEEN_HASHES: '#' (!'#') * '#';

##### Llamada de reglas{-}

Las reglas pueden hacer referencia a otras reglas. Las llamadas a reglas en reglas de "Terminal", solo pueden apuntar a otras reglas de "Terminal":

    terminal WS : (’ ’|’\t’|’\r’|’\n’)+;

##### Alternativas {-}

Permiten definir una lista de opciones válidas. Por ejemplo el la regla del espacio en blanco utiliza una alternativa de la siguiente forma:

    terminal WS : (’ ’|’\t’|’\r’|’\n’)+;
    
##### Grupos{-}

Se llama grupo a la secuencia de "tokens" que se definen uno detrás de otro:

    terminal ASCII : ’0x’ (’0’..’7’) (’0’..’9’|’A’..’F’);

El ejemplo anterior, representa 2 digitos hexadecimales de caracteres ASCII.

##### Fragmentos terminales{-}

Debido a que las reglas terminales son usadas en un contexto sin estado, no es fácil reutilizar partes de su definición. Los fragmentos resuelven este problema.

Los fragmentos permiten los mismos elementos EBNF como reglas terminales, pero no son consumidas por el "lexer". En su lugar son definidas para ser usadas por otras reglas terminales:

    terminal fragment ESCAPED_CHAR : ’\\’ (’n’|’t’|’r’|’\\’);
	terminal STRING :
	  ’"’ ( ESCAPED_CHAR | !(’\\’|’"’) )* ’"’ |
	  "’" ( ESCAPED_CHAR | !(’\\’|"’") )* "’"
    ;


##### Fin de archivo (EOF)

El "token" fin de archivo, puede ser usado para describir que el final del flujo de entrada es valido en un cierto punto de una regla terminal:

    terminal UNCLOSED STRING : ’”’ (!’”’)* EOF;

#### "Parser"

El "parser" es alimentado por una secuencia de terminales y camina a través de las reglas del "parser". Por tanto, las reglas del "parser", a diferencia de las reglas terminales, no producen una terminal atómica, si no que un árbol de "tokens" terminales y no terminales.

Las reglas del "parser" son vistas como un plan para la creación de EObjects que forman el modelo semántico.

Los elementos que están diponibles en las reglas del "parser" así como también en las reglas terminales son:

1. Grupos
2. Alternativas
3. Palabras claves.
4. Reglas de llamada.

A continuación se indica como algunas expresiones indican como construyen directamente el AST:

##### Asignaciones {-}

Las asignaciones son usadas para asignar la información consumida a un aspecto del objeto actual producido. El tipo del objeto actual, es EClass y es específicado por el tipo de retorno de la regla de "parseo". Si no es indicado, es implícito que el nombre del tipo es igual a la regla de asignación. El tipo del aspecto asignado es inferido desde el lado derecho de la asignación.

	Aspect:
		'aspect'
		name=ID
		'{'
			structure=Structure
		'}';

La declaración sintáctica para el aspecto indica que inicia con la palabra clave "aspect" seguido de la asignación `name=ID`

El lado izquierdo se refiere a una característica `name` del objeto actual (que tiene la clase `Aspect` en este caso).

El lado derecho indica que puede ser una regla de llamada, una palabra clave, una referencia cruzada o una alternativa comprometida por la anterior. El tipo de la característica debe ser compatible con el tipo de la expresión de la derecha. Debido a que `ID` retorna un EString, el nombre de la caracterísitica debe ser una EString.

**Operadores de asignación**

1. El signo `=`, es usada para los elementos que toman solo un elemeno.
2. El signo `+=`, espera una lista con múltiples valores y adiciona el valor a dicha lista.
3. El signo `?=` espera un elemento de tipo EBoolean y asigna `true` si el elemento del lado derecho fue consumido.

##### Referencias cruzadas {-}
Xtext permite la definición de referencias cruzadas dentro de la gramática. Ejemplo:

	Instantiation:
		'instantiation' '{'
			
		'}'

instantiations {
            Named     { |Named → NormalError }
            Singleton { |Singleton<|getInstance> → Machine<getMachine> }
          }

target:Machine -> target:Machine         { ri := getMyRI }


### Determinación de alcance y enlazamiento
La **determinación de alcance**, es el mecanismo principal detrás de la visibilidad y la resolución de referencias cruzadas. Desde el momento en que el DSL necesita estructurar el código, se necesita una implementación de la definición de alcance.

Por lo general, le determinación de alcance de una referencia cruzada, depende de:

1. El espacio de nombres en donde viven los elementos.
2. La ubicación dentro de la gran estructura del sitio que contiene la referencia cruzada.
3. Algún aspecto, que no necesariamente es estructural por naturaleza.

La determinación de alcance, también puede ser de ayuda para:
1. Popular el menú del "code-completion" del IDE cuando el usuario presiona `Ctrl-Space` en el sitio referenciado.
2. Validar una referencia existente.

El **enlazamiento** se refiere a la resolución de referencias basadas en el nombre de las mismas. FALTA!!!!!!!!!

### Restricciones
No todos los programas que están conformes con la estructura de un lenguaje (gramática, AS, meta-modelo), son válidos. Las definiciones del lenguaje incluyen restricciones que no pueden ser expresadas solamente por la estructura. Dichas restricciones adicionales son llamadas **restricciones**.

Las restricciones son condiciones "Boolean" que debe ser evaluadas como verdaderas, para poder indicar la validez de un modelo. Un mensaje de error debe ser reportado si la expresión a evaluar es falsa.

Se pueden distinguir dos grandes tipos de restricciones:

1. Restricciones que exigen que los elementos estén bien formados. Ejemplos: unicidad de los nombre en una lista de elementos, todas las variables deben estar definidas antes de utilizarlas.

 2. Sistema de tipos: las reglas de los sistemas de tipos, son diferentes porque verifican la correcta definición de los tipos dentro de un programa. Por ejemplo, el sistema de tipos se asegura que no se pueda asignar un `float` a un `int`.

Las restricciones pueden ser implementadas por cualquier lenguaje o "framework" que pueda consultar un modelo y reportar errores al usuario.

Para definir restricciones eficientes, se debe soportar las siguientes características:
 
1. Debe permitir navegar y filtrar el modelo. Puede ser útil el soporte de "path expressions" (por ejemplo: `aClass.operations.arguments.type` como un mecanismo para buscar el tipo de los argumentos de todas las operaciones de una clase).

2. Se sugiere soportar "higher-order functions", para la escritura de algoritmos genéricos y estrategias transversales.

3. Es útil poder asociar una restricción en forma declarativa con los conceptos del lenguaje (o patrones estructurales) para aquellas instancias que necesiten ser ejecutadas.

### Sistema de tipos
Los sistemas de tipos, implementan cálculo de tipos y verificaciones de tipos.

#### Conceptos básico del sistema de tipos
Para introducir los conceptos básicos del sistema de tipos, se hará uso del AST de la Figura 3.

!["Figura 3. AST de un fragmento de código. Copiado de [@Voelter2013]"](img/TypeSystemBasics.png "Figura 3. AST de un fragmento de código. Copiado de [@Voelter2013]")

El AST de la Figura 3, contiene cajas que representan instancias de los conceptos del lenguaje, las líneas sólidas representan contenedores y las líneas punteadas representan referencias-cruzadas.

Las obligaciones de un sistema de tipos son:

1. *Declarar tipos fijos"*: algunos elementos de los programas tienen tipos fijos. Los mismos no deben ser derivados o calculados. Por lo general permanecen igual y son definidos con anticipación. Algunos ejemplos son:  la constante entera `IntConst` (cuyo tipo es `IntType`), el concepto de raíz cuadrada `sqrt` (cuyo tipo es `double`), así como las declaraciones de tipos por si mismas (el tipo de `IntType` es `IntType`, el tipo de `DoubleType` es `Double-Type`).

2. *Derivar tipos*: para algunos elementos del programa, el tipo debe ser derivado a partir de los tipos de otros elementos. Por ejemplo, el tipo `VarRef` (variable de referencia) es del tipo de la variable referenciada. El tipo de la variable es del tipo de su tipo declarado. Por ejemplo, el tipo de `x` y de la referencia a `x` es `IntType`.

3. *Calcular tipos comunes*: muchos de los sistemas de tipo, tienen alguna especie de jerarquía de tipos. En el ejemplo, `IntType` es un sub-tipo de `DoubleType` (por tanto, `IntType` puede ser usado, siempre que `DoubleType` sea esperado). El sistema de tipos debe soportar la especificación de relación de subtipos.

4. *Verificaciones de tipo*: finalmente, un sistema de tipo debe verificar los errores de tipo y reportarlos al usuario. Para cumplir este objetivo, el lenguaje específica verificaciones del lenguaje, que son revisadas en tiempo de edición por el sistema de tipos, basado en los tipos calculados. En el ejemplo, un error de tipo puede ocurrir si algo con `DoubleType` fuera asignado a una variable `IntType`.


### Inferencia del modelo de Ecore

Como se mencionó en [??] el AST de Xtext es Ecore. Los elementos de Ecore son inferidos a partir de las reglas definidas en la gramática de Xtext. La [tabla](#tablaInferenciaEcore) es un resumen de la inferencia hecha por Xtext a los modelos de Ecore.


| Tipo de regla     | Tipo de retorno | Descripción  |
|:==========+==========+==========+
| Parser                | EPackage           | Creado después de la directiva `generate`. El nombre del paquete se forma a partir de sus parámetros y de su `nsUri`, opcionalmente se puede utilizar un alias. |
+------------+-------------+----------+--------+
| Enum                | Enum                 | Se crea por reglas que utilizan enumeración | 
+------------+-------------+----------+--------+
| Tipo de datos   | EDataType (por defecto es EString) | se crea a partir del tipo de dato de cada regla terminal o de una regla de tipo de dato | 
+------------+-------------+----------+--------+
| Parser               | EAttribute           | Es `EBoolean` si se utiliza el operador `?=` si se utilizan los operadores `=` o `+=` en las reglas terminales, se crea un atributo con un tipo igual al tipo de retorno de la clase llamada |
+----------- +-------------+----------+--------+
| Parser              | EReference         | se crea un `EReference` si hay una regla que llama a otra regla, también se crea una `EReference` por cada asignación de una acción; en ambos casos el tipo será igual al tipo de retorno de la regla llamada. |
+-----------+-------------+----------+--------+

*Tabla inferencia del modelo Ecore* {#tablaInferenciaEcore}




| Tipo de regla | Tipo de retorno  | Descripción                                                |
|:-----------|:-------------|:---------------------------------|
| Parser            | EPackage            | Creado después de la directiva `generate`. El nombre del paquete se forma a partir de sus parámetros y de su `nsUri`, opcionalmente se puede utilizar un alias. |
| Enum             | Enum                  | Se crea por reglas que utilizan enumeración   |
| Tipo de datos | EDataType (por defecto es EString) | EDataType (por defecto es EString) | se crea a partir del tipo de dato de cada regla terminal o de una regla de tipo de dato  |
| Parser            | EAttribute |  Es `EBoolean` si se utiliza el operador `?=` si se utilizan los operadores `=` o `+=` en las reglas terminales, se crea un atributo con un tipo igual al tipo de retorno de la clase llamada |
| Parser            | EReference | se crea un `EReference` si hay una regla que llama a otra regla, también se crea una `EReference` por cada asignación de una acción; en ambos casos el tipo será igual al tipo de retorno de la regla llamada  |
