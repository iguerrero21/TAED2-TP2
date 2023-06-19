/**************************************************************
 * Asignatura: Taller de Algoritmos y Estructuras de Datos II
 * Ano: 2023
 * Nombre: Ignacio Guerrero
 * Legajo: VINF 012729
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
