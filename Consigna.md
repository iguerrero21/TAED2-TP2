## Objetivo

### General:

Implementar soluciones basadas en funciones hash, haciendo manejo de colisiones y operaciones sobre la tabla resultante.

### Específicos:

Implementar la función hash que permita asignar valores a una estructura de datos (tabla de hash).
Administrar efectivamente el manejo de colisiones, implementando direccionamiento abierto y cerrado utilizando la estructura de datos correspondiente. 

## Situación Problemática

Se hace necesario estudiar las tablas de hash para dar solución a diferentes problemas
de almacenamiento y búsqueda rápida de elementos, ya que es una poderosa
herramienta para gestionar, de forma dinámica, diferentes elementos de distintos tipos
dentro de una organización.

Para cumplir los objetivos de este trabajo práctico se ha propuesto la siguiente situación
problemática:

La biblioteca nacional de Santander es reconocida por tener una de las colecciones de
datos más diversas del mundo. La biblioteca ofrece material exclusivo en distintos
formatos, audio, video, papers, revistas y demás ejemplares digitales. Cada uno de los
recursos tiene un código formado de 6 números el cual lo diferencia de los demás, por
ejemplo: 115269, 111254. Debido a esto, se quiere llevar a cabo un proyecto en el cual
se implemente un sistema de almacenamiento dinámico que permita administrar los
datos de forma eficiente al momento de almacenar, buscar y eliminar datos dentro de
una tabla de hash.

## Consigna

a) Implementar, en el lenguaje de programación Java, la siguiente función hash H(x) = X mod 10, la cual determinará el índice donde almacenar el valor en la tabla.

b) Implementar, en el lenguaje de programación Java, los siguientes métodos para manejar las colisiones:

- Sondeo lineal.
- Sondeo cuadrático.

c) Implementar, en el lenguaje de programación Java, el método para evitar las colisiones basado en hashing abierto. Para esto, debes utilizar una lista para almacenar los valores.

d) Implementar un algoritmo en lenguaje Java donde utilices los métodos de insertar, buscar y eliminar valores dentro de la tabla hash que permita elegir el método deseado para manejar las colisiones.


## Notas sobre el TP
Para este trabajo práctico no se implementó un menú de opciones, ni la posibilidad de que el usuario final ingrese un número a buscar por consola. 

Los datos de búsqueda y eliminación están *hard coded*, de manera que se deberán cambiar desde el código.
