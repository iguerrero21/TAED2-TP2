/**************************************************************
 * Asignatura: Taller de Algoritmos y Estructuras de Datos II
 * Año: 2023
 * Nombre: Ignacio Guerrero
 * Legajo: VINF 012729
 *************************************************************/

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Implementación de la clase TablaHash en hashing abierto, como se solicita en el punto C de la consigna.
 * Se utiliza Lista Encadenada para almacenar los valores.
 */
public class TablaHashAbierto implements TablaHashInterface {

    int tamanio;
    Map<Integer, LinkedList<Hashable>> tabla;

    /**
     * Constructor de la clase.
     * Recibe como parámetro el tamaño deseado para la table.
     */
    public TablaHashAbierto(int tamanio) {
        this.tamanio = tamanio;
        this.tabla = new HashMap<>(this.tamanio);
    }

    /**
     * Implementa la función de hash: H(x) = X mod 'Tamaño de la tabla'.
     * La misma determinará el índice donde almacenar el valor en la tabla.
     *
     * @param numUsuario El número de usuario (entero entre 0 y 999).
     * @return Un índice (int) entre 0 y el tamaño asignado a la tabla.
     */
    public int funcionHash(int numUsuario) {
        return numUsuario % this.tamanio;
    }

    /**
     * Crea una lista encadenada temporal.
     * Copia el contenido de la lista que se encuentra
     * en la tabla en la posición determinada por la función hash.
     * Busca al usuario iterando en dicha lista.
     * @param numUsuario Número de usuario (0 a 999)
     * @return El usuario, si lo encuentra, o null.
     */
    public Hashable buscar(int numUsuario) {
        LinkedList<Hashable> lista;
        lista = this.tabla.get(funcionHash(numUsuario));

        if (lista != null) {
            for (Hashable usuario : lista) {
                if (usuario.numUsuario() == numUsuario) {
                    return usuario;
                }
            }
        }
        return null;
    }

    /**
     * Verifica si el índice que surge de la función hash ya está en uso,
     * si no lo crea, y carga al nuevo usuario.
     * @param usuario Registro del usuario a insertar (Número de usuario (0 a 999), seguido de Apellido y Nombre).
     */
    public void insertar(Hashable usuario) {
        int indice = funcionHash(usuario.numUsuario());
        LinkedList<Hashable> lista;

        if (this.tabla.containsKey(indice)) {
            lista = this.tabla.get(indice);
            if (lista.isEmpty()) {
                lista.add(usuario);
            } else {
                lista.addLast(usuario);
            }
        } else {
            lista = new LinkedList<>();
            lista.add(usuario);
            this.tabla.put(indice, lista);
        }
    }

    /**
     * Elimina un usuario a partir de su número de usuario.
     * @param numUsuario Número de usuario.
     */
    public void eliminar(int numUsuario) {
        LinkedList<Hashable> lista;
        lista = this.tabla.get(funcionHash(numUsuario));

        if (lista != null) {
            for (Hashable usuario : lista) {
                if (usuario.numUsuario() == numUsuario) {
                    lista.remove(usuario);
                    this.tabla.replace(funcionHash(numUsuario), lista);
                }
            }
        }
    }


    public void mostrarUsuario(Hashable usuario) {
        try {
            System.out.println(usuario.toString());
        } catch (NullPointerException e) {
            System.out.println("Usuario inexistente");
        }
    }

//    public void mostrarTabla() {
//        for (Integer indice: tabla.keySet()) {
//            mostrarUsuario(tabla.get(indice));
//        }
//    }

    public void vaciar() {
        this.tabla.clear();
    }

}