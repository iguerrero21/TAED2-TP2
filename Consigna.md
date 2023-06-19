## Objetivo

### General:

Implementar soluciones basadas en funciones hash, haciendo manejo de colisiones y operaciones sobre la tabla resultante.

### Espec�ficos:

Implementar la funci�n hash que permita asignar valores a una estructura de datos (tabla de hash).
Administrar efectivamente el manejo de colisiones, implementando direccionamiento abierto y cerrado utilizando la estructura de datos correspondiente. 

## Situaci�n Problem�tica

Se hace necesario estudiar las tablas de hash para dar soluci�n a diferentes problemas
de almacenamiento y b�squeda r�pida de elementos, ya que es una poderosa
herramienta para gestionar, de forma din�mica, diferentes elementos de distintos tipos
dentro de una organizaci�n.

Para cumplir los objetivos de este trabajo pr�ctico se ha propuesto la siguiente situaci�n
problem�tica:

La biblioteca nacional de Santander es reconocida por tener una de las colecciones de
datos m�s diversas del mundo. La biblioteca ofrece material exclusivo en distintos
formatos, audio, video, papers, revistas y dem�s ejemplares digitales. Cada uno de los
recursos tiene un c�digo formado de 6 n�meros el cual lo diferencia de los dem�s, por
ejemplo: 115269, 111254. Debido a esto, se quiere llevar a cabo un proyecto en el cual
se implemente un sistema de almacenamiento din�mico que permita administrar los
datos de forma eficiente al momento de almacenar, buscar y eliminar datos dentro de
una tabla de hash.

## Consigna

a) Implementar, en el lenguaje de programaci�n Java, la siguiente funci�n hash H(x) = X mod 10, la cual determinar� el �ndice donde almacenar el valor en la tabla.

b) Implementar, en el lenguaje de programaci�n Java, los siguientes m�todos para manejar las colisiones:

- Sondeo lineal.
- Sondeo cuadr�tico.

c) Implementar, en el lenguaje de programaci�n Java, el m�todo para evitar las colisiones basado en hashing abierto. Para esto, debes utilizar una lista para almacenar los valores.

d) Implementar un algoritmo en lenguaje Java donde utilices los m�todos de insertar, buscar y eliminar valores dentro de la tabla hash que permita elegir el m�todo deseado para manejar las colisiones.


## Notas sobre el TP
Para este trabajo pr�ctico no se implement� un men� de opciones, ni la posibilidad de que el usuario final ingrese un n�mero a buscar por consola. 

Los datos de b�squeda y eliminaci�n est�n *hard coded*, de manera que se deber�n cambiar desde el c�digo.
