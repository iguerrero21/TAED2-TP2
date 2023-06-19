/**************************************************************
 * Asignatura: Taller de Algoritmos y Estructuras de Datos II
 * Año: 2023
 * @author: Ignacio Guerrero
 *************************************************************/

/**
 * Interface de Tabla Hash
 */
public interface TablaHashInterface {


    int funcionHash(int numUsuario);

    Hashable buscar(int numUsuario);

    void eliminar(int numUsuario);

    void insertar(Hashable usuario);

    void vaciar();

    void mostrarUsuario(Hashable usuario);

}
