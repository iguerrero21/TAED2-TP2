/**************************************************************
 * Asignatura: Taller de Algoritmos y Estructuras de Datos II
 * Año: 2023
 * Nombre: Ignacio Guerrero
 * Legajo: VINF 012729
 *************************************************************/


public class Main {

    public static void main(String[] args) {

        // Lista de registros de ejemplo.
        Hashable[] usuarios = new Hashable[] {
                new Hashable(342, "Gómez, Horacio"),
                new Hashable(792, "Villarreal, Florencia"),
                new Hashable(455, "Tavares, Lilian"),
                new Hashable(166, "Onetti, Juan Martín"),
                new Hashable(567, "Monges, Lautaro"),
                new Hashable(419, "Dansigg, Clara"),
                new Hashable(500, "Troncoso, María Luz"),
                new Hashable(599, "Tejedor, Cecilia"),
                new Hashable(688, "Santini, Emilio"),
                new Hashable(778, "Goldstein, David")
        };

        /* Creamos las tablas de hash */

        // Tabla de Hashing Abierto
        TablaHashAbierto tablaA = new TablaHashAbierto(10);
        // Tabla de Hashing Cerrado y exploración Lineal (Default)
        TablaHashCerrado tablaCLin = new TablaHashCerrado(10);
        // Tabla de Hashing Cerrado y exploración Cuadrática.
        // Tamaño determinado por número primo (23) y factor de carga 0.5
        TablaHashCerrado tablaCCuad = new TablaHashCerrado(23, "Cuad");


        // Carga de registros de ejemplo en tablas de hash
        for (Hashable usuario: usuarios) {
            tablaA.insertar(new Hashable(usuario.numUsuario(), usuario.nombreUsuario()));
            tablaCLin.insertar(new Hashable(usuario.numUsuario(), usuario.nombreUsuario()));
            tablaCCuad.insertar(new Hashable(usuario.numUsuario(), usuario.nombreUsuario()));
        }

        // Se muestra la tabla completa para verificar la carga correcta de los usuarios (debugging)
        System.out.println("Tabla de usuarios. Exploración Lineal.");
        tablaCLin.mostrarTabla();

        System.out.println();

        System.out.println("Tabla de usuarios. Exploración Cuadrática.");
        tablaCCuad.mostrarTabla();

        /*
         * Para este trabajo práctico no se implementó un menú de opciones,
         * ni la posibilidad de que el usuario final ingrese un número a buscar por consola.
         * Los datos están "Hard coded", de manera que se deberán cambiar los datos a
         * buscar desde el código.
         */
        System.out.println();
        System.out.println("Búsqueda de usuarios individuales en las tres tablas");
        tablaA.mostrarUsuario(tablaA.buscar(599));
        tablaCLin.mostrarUsuario(tablaCLin.buscar(778));
        tablaCCuad.mostrarUsuario(tablaCLin.buscar(419));

        System.out.println();
        System.out.println("Se eliminan los usuarios individuales en las tres tablas");
        tablaA.eliminar(599);
        tablaCLin.eliminar(778);
        tablaCCuad.eliminar(419);

        System.out.println();
        System.out.println("Nueva búsqueda de usuarios recién eliminados");
        tablaA.mostrarUsuario(tablaA.buscar(559));
        tablaCLin.mostrarUsuario(tablaCLin.buscar(778));
        tablaCCuad.mostrarUsuario(tablaCCuad.buscar(419));
    }
}
