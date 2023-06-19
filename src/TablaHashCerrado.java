/**************************************************************
 * Asignatura: Taller de Algoritmos y Estructuras de Datos II
 * Año: 2023
 * Nombre: Ignacio Guerrero
 * Legajo: VINF 012729
 *************************************************************/

import java.util.Arrays;

import static java.lang.Math.pow;

/**
 * Implementación de la clase TablaHash en hashing cerrado, como se solicita en el punto B de la consigna.
 * Se utiliza Lista para almacenar los valores. Debe seleccionar el método para evitar colisiones
 */
public class TablaHashCerrado implements TablaHashInterface {

    int tamanio;
    String exploracion;
    final Hashable[] tabla;


    /**
     * Constructor default de la clase. Exploración lineal (default)
     * Recibe como parámetro el tamaño deseado para la tabla.
     * @param tamanio Tamaño de la tabla. Factor de carga &le; 1.
     */
    public TablaHashCerrado(int tamanio) {
        this.tamanio = tamanio;
        this.exploracion = "Lineal";
        this.tabla = new Hashable[tamanio];
    }

    /**
     * Constructor de la clase.
     * Recibe como parámetros el tamaño deseado para la tabla y el tipo de exploración a utilizar.
     * @param tamanio Tamano de la tabla. Factor de carga &le; 0.5.
     */
    public TablaHashCerrado(int tamanio, String exploracion) {
        this.tamanio = tamanio;
        this.exploracion = exploracion;
        this.tabla = new Hashable[tamanio];
    }

    /**
     * Implementa la función de hash: H(x) = X mod 10.
     * La misma determinará el índice donde almacenar el valor en la tabla.
     *
     * @param numUsuario El número de usuario (entre 0 y 999)
     * @return un índice entre 0 y el tamaño asignado a la tabla.
     */
    public int funcionHash(int numUsuario) {
        return numUsuario % this.tamanio;
    }

    /**
     * Busca un usuario a partir de su numero de usuario.
     *
     * @param numUsuario Número de usuario
     * @return Registro (Hashable) de Usuario
     */
    public Hashable buscar(int numUsuario) {
        int indice = funcionHash(numUsuario);
        int busqueda = this.tamanio;
        int base = 0;

        while (busqueda != 0) {

            if (this.tabla[indice] != null) {
                if (this.tabla[indice].numUsuario() == numUsuario) {
                    return this.tabla[indice];
                }
            }
            switch (this.exploracion) {
                case "Lineal" -> indice = exploracionLineal(indice);
                case "Cuad" -> {
                    indice = exploracionCuadratica(funcionHash(numUsuario), base);
                    base++;
                }
            }
            busqueda--;
        }
        return null;
    }

    public void insertar(Hashable usuario) {
        int indice = funcionHash(usuario.numUsuario());

        if (this.tabla[indice] == null) { // Si el espacio está disponible.
            this.tabla[indice] = usuario;
        } else {
            int base = 0;

            // Manejo de colisiones
            while (this.tabla[indice] != null) {
                switch (this.exploracion) {
                    case "Lineal" -> indice = exploracionLineal(indice);
                    case "Cuad" -> {
                        indice = exploracionCuadratica(funcionHash(usuario.numUsuario()), base);
                        base++;
                    }

                }
            }
            this.tabla[indice] = usuario;
        }
    }

    /**
     * Exploración incremental a partir de un número dado.
     *
     * @param indice Entero obtenido de funcionHash()
     * @return Número entero módulo 'tamanio'
     */
    public int exploracionLineal(int indice) {
        return (indice + 1) % this.tamanio;
    }

    /**
     * Toma el índice actual a la siguiente potencia (mod tamanio)
     *
     * @param hash Obtenido de computar el número de usuario por la funcionHash().
     * @param base i - Entero incremental  partir de 0
     * @return índice + i elevado al cuadrado.
     */
    public int exploracionCuadratica(int hash, int base) {
        return (int) ((pow(hash + base, 2)) % this.tamanio);
    }

    public void eliminar(int numUsuario) {
        int indice = funcionHash(numUsuario);
        int busqueda = this.tamanio;
        int base = 0;

        while (busqueda != 0) {

            if (this.tabla[indice] == null) {
                continue;
            } else if (this.tabla[indice].numUsuario() == numUsuario) {
                this.tabla[indice] = null;
                break;
            }
            switch (this.exploracion) {
                case "Lineal" -> indice = exploracionLineal(indice);
                case "Cuad" -> {
                    indice = exploracionCuadratica(funcionHash(numUsuario), base);
                    base++;
                }
            }
            busqueda--;
        }
//        return null;
    }

    public void mostrarUsuario(Hashable usuario) {
        try {
            System.out.println(usuario.toString());
        } catch (NullPointerException e) {
            System.out.println("Usuario inexistente");
        }
    }

    public void mostrarTabla() {
        int indice = 0;

        for (Hashable usuario : this.tabla) {
            System.out.print(indice + " -> ");
            mostrarUsuario(usuario);
            indice++;
        }
    }


    public void vaciar() {
        Arrays.fill(this.tabla, null);
    }

}