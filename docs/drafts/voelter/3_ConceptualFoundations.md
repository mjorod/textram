#Conceptos básicos

##1. Programas, lenguajes y dominios

`P` es un conjunto de todos los programas. Un *programa* `P` es la representación *conceptual* de alguna *computación* que se ejecuta en una computadora universal (máquina de Turing). Un *lenguaje* `L` define la estructura y la notación para *expresar* o *codificar* programas de `P`. Por tanto, un programa *p* en `P` puede tener una expresión en `L`, el cual vamos a denotar como `pl`.

Existen diferentes lenguajes *l1* y *l2* que expresan el *mismo* programa conceptual *p* en diferentes formas *p1* y  *p2* (por ejemplo `factorial` puede ser expresado en Java y Lisp). Algunos lenguajes pueden ser mejores en expresar ciertos programas de `P` (el programa puede ser más corto, más legible y más fácil de analizar)

###Dominios
Existen dos enfoques para definir un dominio:

1. Enfoque *inductivo*, o "*bottom-up*": el dominio se define en términos de un software existente, usado para resolver una clase particular de problemas o productos. Por tanto el dominio `D` es identificado como un conjunto de programas que tienen características en común o propósitos similares.

2. Enfoque *deductivo*, o "*top-down*": un dominio es considerado como el cuerpo de conocimiento acerca del mundo real. Desde esta perspectiva, un dominio `D` es el cuerpo de conocimiento por el cual necesitamos proveer alguna forma de apoyo por medio de software. La dificultad de este enfoque, consiste en conocer en forma precisa el dominio e identificar los programas interesantes dentro del dominio.

*TextRam* utilizará el enfoque inductivo, debido a que el problema a resolver ya está identificado en el meta-modelo de RAM.

Un dominio `D` es un conjunto de programas *PD*. Pueden existir múltiples lenguajes con los cuales podemos expresar programas `PD`. Posiblemente `PD` puede ser parcialmente expresado en el lenguaje *l*. Los programas relevantes al dominio *PD* y los programas expresados en un lenguaje *PL* son un subconjunto de todos los programas `P`. Ver la figura 3.1

!["Figura 3.1"](img/Figure_3_1 "Figura 3.1")

###Lenguajes de especificación de dominio
Un *lenguaje de especificación de dominio* *lD* para un dominio `D` es un lenguaje que se *especializa* para codificar programas desde `PD`. Esto es posible por medio de la definición de abstracciones adecuadas al dominio, evitando detalles que son irrelevantes a programas `D`.

Para encontrar la regularidad en un dominio no regular, es necesario un enfoque interactivo que evolucione el lenguaje, mientras el entendimiento del dominio se convierte más y más refinado durante el tiempo.

Un DSL para un dominio tipicamente representa una explicación o interpretación del dominio, y por lo general requiere resolver "*trade-offs*" por medio aproximaciones. En la Figura 3.2 se visualiza como `L1` y `L2` se aproximan al domino `D`

!["Figura 3.2"](img/Figure_3_2.png "Figura 3.2")

##2. Propósito del Modelo
No es una tarea trivial decidir que abstracciones deben de ser definidas en un lenguaje particular para `D`. Dicha decisión se debe basar en el *propósito del modelo*

El propósito del modelo de RAM, es definir aspectos reutilizansdafjaskfjaskl

##3. Estructura de los programas y lenguajes

###Sintaxis concreta
Es la notación con la que el usuario interactua mientras edita el programa. Puede ser textual, simbólica, tabular o gráfica (o una combinación de las mismas).


###Sintaxis abstracta
Es una estrucura de datos que representa la semántica relevante de los datos expresados por el programa. No contiene detalles de notación como palabras claves, símbolos, espacios en blanco, posiciones, tamaños, colores, etc. La sintaxis abstracta es utilizada para analizar el procesamiento de los programas.
**Metamodeo ver el librito verde**

La definición de un lenguaje incluye las sintaxis concreta y textual, como también reglas convertir un notación de una a otra.

Los sistemas basados en **parseo**, mapean la sintaxis concreta a la sintaxis abstracta. El usuario interactua con un flujo de carácteres, y el parseador deriva la sintaxis abstracta depor medio del uso de una gramática y reglas de mapeo.

En los editores de **proyección**, La sintaxis concreta es una mera proyección, que cambia directamente la sintaxis abstracta.

La sintaxis abstracta de lso programas son principalmente árboles de programa llamados *elementos*

En los sistemas basados en *parseo*, una gramática especifica una serie de "*tokens*" y palabras que contruyen la estructura válida de un programa. Un parseador es generado a partir de esta gramática. Un parseador es un programa que reconoce programa válidos en su forma textual y crea el árbol de la sintaxis abstracta. La Figura 3.14 ilustra como el usuario solo interactúa como la sintaxis concreta, y el el árbol de la sintaxis abstracta es construído con la información del texto.

Los editores de *proyección* trabajan sin gramáticas o parseadores. Un lenguaje es especificado por la definición del árbol de sintaxis abstracta, definiendo reglas de proyección que crean la sintaxis concreta de los conceptos del lenguaje definidos en la sintaxis abstracta. Las reglas de proyección crean una representación textual del programa. El usuaruo lee y escribe programas, por medio de esta notación de proyección. Los prgoramas son almacenados como árboles de sintaxis abstracto, usualmente en XML. Ver sección 7. En la figura 3.15 el usuario visualiza la sintaxis concreta, pero todos los gestos de edición influencian directamente el *AST*. El *AST* no es extraído de la sintaxis concreta, lo cual quiere decir que la sintaxis concreta no debe ser parseada.




