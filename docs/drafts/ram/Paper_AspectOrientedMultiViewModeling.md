#Aspect-Oriente Multi-View Modeling

*"Reusable Aspect Models (RAM)"* es un enfoque de modelamiento orientado a aspecto multi-vista, que
1. Integración de diagramas de clase, estado y de secuencia por medio de las técnicas de modelado orientado a aspectos.
2. Reutilización de “aspect models” en forma segura y flexible.
3. Soporta la creación de complejas cadenas de dependencia. Esto permite modelar aspectos de funcionalidad compleja, descomponiéndolos en aspectos que proveen una funcionalidad simple.
4. Ejecuta revisiones de consistencia para verificar la correcta composición de aspectos y su reutilización.
5. Define un detallado algoritmo de “weaving” que resuelve la dependencia de aspectos para generar “aspect models” independientes que son aplicados en el modelo final.

Para el *weaving* RAM se basa en el enfoque propuesto por France en [77,77], dicho enfoque sopoerta la composición de modelos que presentan diferentes vistas del mismo concepto. Para que esto sea posible, los elementos del modelo involucrados deben ser del mismo tipo sintáctico, es decir, deben ser intancias del mismo meta-modelo.  Una vista de aspectos puede ddescribir conceptos que no están presentes en el modelo destino y viceversa. En estos casos, los elementos del modelos son incluidos en el *"composed element"*.

El proceso de identificar los elementos del modelo a componer es llamado *"element matching"*. Para soporta en forma automática el *"element matching"*, cada tipo del elemento (the element's meta model class) es asociado con el tipo de firma que determina la unicidad de elementos en el mismo espacio de tipos: dos elementos con firmas equivalentes, representan el mismo concepto y por lo tanto son compuesto.
