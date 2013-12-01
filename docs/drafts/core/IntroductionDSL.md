#Introducción a los Lenguajes de Especificación de Dominio (DSL)

En todas las ramas de la ciencia y la ingeniería, se pueden distinguir
dos enfoques: genéricos y específicos. Los enfoques
genéricos proporcionan una solución general para los problemas de un
área en particular, pero su solución puede no ser óptima. Un enfoque
específico, proporciona una mejor solución para un conjunto pequeño de
problemas.

En las ciencias de la computación, esta dicotomía existe con los
lenguajes de programación general (GPLs) y los lenguajes de
especificación de dominio (DSLs).

Un **lenguaje de especificación de dominio** (DSL) es un lenguaje de programación o un lenguaje de especificación ejecutable que ofrece, a partir de notaciones y abstracciones adecuadas, un poder de expresividad enfocado y por lo general restringido a un problema de dominio en particular [1].

**Lenguaje de especificación de dominio**, es un lenguaje de programación de computadoras, con expresividad limitada, enfocado en un dominio en particular [2].

De la definición anterior, se pueden destacar 4 elementos:

1. *Lenguaje de programación de computadoras*: Un DSL es usado por
   humanos para instruir a la computadora que realice cierta acción.

2. *Naturaleza del lenguaje*: Un DSL es un lenguaje de programación, y
   como tal, debe tener una sensación de fluidez, en donde la
   expresividad, debe originarse no solo de expresiones individuales, si no
   que también de la forma en que la mismas pueden ser compuestas como
   un conjunto.

3. *Expresividad limitada*: Un lenguaje de programación general
   proporciona muchas capacidades: soporte datos variables, control y
   abstracción de estructuras. Todo esto es útil, pero es más difícil
   de aprender y usar. Un DSL soporta, un conjunto mínimo de
   funcionalidades para soportar un dominio. No se puede construir un
   software entero con un DSL, en lugar de eso el DSL se concentra en
   un aspecto en particular de un sistema.

4. *Enfoque en el dominio*: Un lenguaje limitado, es solamente útil si
   tiene un enfoque claro en un dominio pequeño. El enfoque al
   dominio, es lo que convierte a un lenguaje limitado en algo de
   real valor.

##Lenguajes de programación general vs lenguajes de especificación de dominio

Todos los GPSs, están conformes con las especificaciones de Turing;
por tanto, pueden ser utilizados para implementar cualquier
artefacto compatible con un máquina de Turing.

Entonces, ¿Por qué existen diversos GPLs?
todo depende de la estrategia de ejecución. El código *C* es
compilado a un código nativo eficiente. Mientras que *Ruby* es ejecutado
por una máquina virtual (una combinación entre compiladores e
interpretes).

Las características que ofrecen cada uno de los lenguajes, están
optimizadas para las tareas que son relevantes a sus respectivos
dominios. En *C* se puede manipular la memoria (aspecto importante
para comunicarse con dispositivos de bajo nivel). Por otro lado, en *Ruby*
se pueden utilizar "*closures*" para posponer la implementación de un
comportamiento. La meta-programación de *Ruby*, permite definir DSLs
que son adecuados para el desarrollo de aplicaciones Web (El framework
*Rails* por ejemplo).

Incluso en el campo de los GPLs, existen diferentes
lenguajes, cada uno exponiendo diferentes funcionalidades, ajustadas
a una tarea específica. Entre más específica se vuelve una tarea, es
más adecuado el uso de lenguajes especializados. Un DSL, simplemente
es un lenguaje que está optimizado para una clase de problemas en
particular, llamados dominios.

Los lenguajes de especificación de dominio, sacrifican cierta
flexibilidad para expresar cualquier tipo de programa, en favor de la
productividad y precisión de programas relevantes en un dominio en
particular.  Por tanto, los DSL son restringidos a la creación de
programas correctos.

A continuación se presenta una tabla comparativa entre DSLs y GPLs:

<table>
  <tr style="border-bottom:1pt solid black;">
    <td></td>
    <td>GPLs</td> 
    <td>DSLs</td>
  </tr>
  <tr>
    <td>Domain</td>
    <td>largo y complejo</td> 
    <td>pequeño y bien definido</td>
  </tr> 
  <tr>
    <td>Tamaño del lenguaje</td>
    <td>largo</td> 
    <td>pequeño</td>
  </tr>
  <tr>
    <td>Completitud de Turing</td>
    <td>Siempre</td> 
    <td>No, por lo general</td>
  </tr> 
  <tr>
    <td>Abstracciones definidas por el usuario</td>
    <td>Sofisticadas</td>   
    <td>Limitadas</td>
  </tr>
  <tr>
    <td>Ejecución</td>
    <td>Por medio de un GPL intermedio</td> 
    <td>Nativa</td>
  </tr>
  <tr>
    <td>Tiempo de vida</td>
    <td>Años/decádas</td> 
    <td>Meses/años (dependiendo del contexto)</td>
  </tr> 
  <tr>
    <td>Diseñado por</td>
    <td>Guru or comité</td> 
    <td>Pocos ingenieros y expertos del dominio</td>
  </tr>
  <tr>
    <td>Evolución</td>
    <td>Lenta y estándard</td> 
    <td>Rápida</td>
  </tr>
  <tr>
    <td>Depreciación/cambios incompatibles</td>
    <td>Imposible, por lo general.</td>
    <td>Factible</td>
  </tr>
</table>

Tabla 1. Comparación entre GPLs y DSLs.

##Ingredientes de un lenguaje de programación

Un DSL y un GPL, deben tener los siguientes ingredientes principales [3]:

1. *Sintaxis concreta*,  define la notación que usarán los usuarios para definir los programas. Es la representación específica del lenguaje a modelar.

2. *Sintaxis abstracta*, es la estructura de datos que persiste la semántica de la información relevante expresada por un programa. Por lo general es un árbol o un gráfico. No debe contener detalles de notación.

3. *Semántica*  describe el significado de los elementos definidos en el lenguaje y el significado de combinar dichos elementos.

La Figura 1, muestra la relación entre los tres ingredientes: la semántica define el significado de la sintaxis abstracta e indirectamente el de la sintaxis concreta; la sintaxis concreta representa la sintaxis abstracta.

!["Figura 1. Ingredientes principales de un lenguaje"](img/IngredientesLenguajeModelado.png "Figura 1. Ingredientes principales de un lenguaje")

##Clasificación de los DSLs:

Los DSLs se pueden clasificar en dos categorías:

1. *DSL externo*, es un lenguaje de programación que se construye, desde cero y tiene una infraestructura independiente para el análisis léxico, técnicas de parseo, interpretación y generación de código. [DSL in Action] (dichos conceptos son abordados en ???) .

2. *DSL interno*, es un lenguaje que utiliza la infraestructura de un
   lenguaje de programación existente; para construir la semántica de
   especificación de dominio encima de él. [DSL in Action]. (ejemplo:
   "Rails en Ruby"). Están embebidos dentro de un lenguaje de
   programación general. Usualmente, el lenguaje "*host*" es de tipos
   dinámicos y la implementación del DSL es basada en
   meta-programación. En clásicas implementaciones de los DSLs
   internos el entorno integrado de desarrollo (IDE) no está al tanto
   de la gramática, restricciones y otras propiedades del DSL.

La construcción de **TextRam**, será basada en un DSL externo. Los
motivos son los siguientes:

1. La construcción de un DSL externo, ofrece libertad sintáctica,
   por tanto el creador del lenguaje puede utilizar la sintaxis que
   más estime conveniente.

2. Los DSLs interns, a veces se apoyan en trucos obscuros del lenguaje
   "host" para producir una sintaxis fluída (Fowler en [2]).

2. En clásicas implementaciones de los DSLs internos, el entorno
   integrado de desarrollo (IDE), no esta al tanto de la gramática y
   otras restricciones propias de un DSL. Por tanto, en caso de error, no puede dar una
   retroalimentación útil al usuario.

3. Uno de los objetivos de mi tesis es convertir la representación
   textual de **TextRam** a dos representaciones: representación
   visual con la ayuda de Graphiz [4] y a la representación de los
   meta-modelos de RAM (Ecore).

##Ingeniería de Software Orientada a Modelos (MDSE)

MDSE es un marco de trabajo conceptual unificado en donde todo el
ciclo de vida del software es visto como un proceso de producción,
refinamiento e integración de modelos [5]. MDSE es una metodología
para aplicar las ventajas del modelado a las actividades de ingeniería
de software. En el contexto del MDSE, el software se obtiene como
resultado de la siguiente ecuación:

> Modelos + Transformaciones = Software [3].

El lenguaje de modelado es la notación por la cual se expresan los
modelos y las transformaciones. El proceso dirigido por modelos define
que tipos de modelos (orden de los mismos y su nivel de abstracción)
son necesarios de acuerdo a un determinado tipo de software.

La definición y el uso de DSLs es un sabor de MDSE: se crean
representaciones formales, procesables por herramientas y específicas
a un aspecto de un sistema de software. Los DSLs, permiten la
definición de una representación concreta de un modelo conceptual.

MDSE proporciona una visión exhaustiva para el desarrollo de
sistemas. La Figura 2, muestra una vistazo de los principales aspectos
considerados en MDSE y resume como los diferentes problemas son
resueltos en el ámbito del MDSE, de acuerdo a las siguientes
dimensiones ortogonáles: conceptulización (columnas) e
implementación (filas).

!["Figura 2. Visión general de la metodología MDSE"](img/VistazoMDSE.png
 "Figura 2. Visión general de la metodología MDSE")

El problema de *implementación* se resuelve con el pareo de modelos a
un existente o futuro sistema en ejecución. Por tanto, consiste en la
definición de tres conceptos:

1. El nivel de modelamiento: lugar de definición de modelos.
2. El nivel de realización: lugar de implementación de soluciones, a
   través de artefactos que son usados dentro de sistemas en ejecución
   (código en caso de software)
3. Nivel de automatización: resultado del "mapeo" entre los niveles de
   modelamiento y realización.

Los problemas de *conceptualización*, están orientados a definir
modelos conpctuales para describir la realidad. Esto puede ser
aplicado a varios niveles:

1. Nivel de aplicación: lugar en donde los modelos de las aplicaciones
   son definas, las reglas de transformación son aplicadas, y los
   componentes del sistema en ejecución son generados.
2. Nivel del dominio de aplicación: define el lenguaje de
   modelamiento, trasformaciones, y plataformas de implementación para
   un dominio específico.
3. Nivel meta: la conceptualización de los modelos y transformaciones
   son definidos.

El flujo principal del MDSE, es desde los modelos de aplicación hasta
ejecutar la realización, a través de transformaciones del modelo. Esto
permite, la reutilización de modelos y ejecución de sistemas en
diferentes plataformas. Por tanto, en el nivel de realzación el
software en ejecución se apota de una plataforma específica (definida
para un dominio de aplicación específico) para su ejecución.

Para que esto sea posible, los modelos son especificados de acuerdo a
un lenguaje de modelado, a su vez definido de acuerdo de un lenguaje
de meta-modelado. Las ejecuciones de transformación sond definidas
basdas en un conjunto de reglas de transformación, definidsa isando un
lenguaje espcífico de transformación.

Los modelos juegan un papel importante en MDSE, una consecuencia de
esto que para definir un modelo, los modelos se pueden representar asi
mismos como instancia de de modelos más abstractos. Por tanto, de la
mosma forma que se define un modelo como una abstarcción de un
fenomeno de la vida real, se puede definir un *meta-modelo* (otra
abstracción), resaltando propiedades del modelo en cuestión. Los
meta-modelos, constituyen la definición de un lenguaje de modelado,
debido a que proveen una forma de describir toda una clase de modelos
que pueden ser representados por el lengueje.

Por tanto, se pueden definir modelos de la realidad, y luego modelos
que describen modelos (meta-modelos) y modelos recursivos que
describen los meta-modelos (llamados meta-meta-modelos). En teoría, se
pueden definir instancias infinitas de nivelos de meta-modelos, pero
en la práctica, se ha demostrado que los meta-modelos se pueden
definir asi mismos, y por tanto usualmentr no tiene sentido ir más
alla de ese nivel de abstracción. En cualquier nivel, se considera que
el meta-modelado, se puede decir que un modelos está conforme a su
meta-modelo en la forma que un progama de coputación está conforme con
la gramática del lenguaje de programación del cual fue escrito.

La figura 3, muestra un ejemplo completo de meta-modelado.

!["Modelado, metamodelos y meta-meta-modelos"](img/Modelos_MetaModelos.png
 "Modelado, metamodelos y meta-meta-modelos")

Los meta-modelos pueden ser útiles para:

1. Definir nuevos lenguajes para el modelado o programación.
2. Definir nuevos lenguajes de modelado para intercambiar y almacenar
   información.
3. Definir nuevas propiedades y funcionalidades que pueden ser
   asociadas a información existente (meta-data)-

#Referencias

1. VAN DEURSEN, A., KLINT, P., AND VISSER, J. 2000. Domain-specific
   languages: An annotated bibliography. ACM SIGPLAN Notices 35, 6
   (June), 26–36.

2. M. FOWLER. Domain-Specific Languages, Addison Wesley, 2010.

3. BOBADILLA M., CABOT J., WIMMER M., Model-Driven Software Engineering in Practice, Morgan & Claypool Publishers, 2012

4. http://www.graphviz.org/

5. SCHMIDT, D.C.: Model-driven engineering. IEEE Computer 39, 41–47 (2006) 
