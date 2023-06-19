/**************************************************************
 * Asignatura: Taller de Algoritmos y Estructuras de Datos II
 * Año: 2023
 * Nombre: Ignacio Guerrero
 * Legajo: VINF 012729
 *************************************************************/

/**
 * Registro de usuario.
 * Se utiliza un record, en lugar de una clase.
 * @param numUsuario Número de usuario
 * @param nombreUsuario Apellido y Nombre
 */
public record Hashable(int numUsuario, String nombreUsuario) {

    /**
     * Formato para mostrar el record.
     * @return Ej. Usuario 123: Pérez, Juan
     */
    @Override
    public String toString() {
        return "Usuario " + numUsuario +
                ": " + nombreUsuario;
    }
}
