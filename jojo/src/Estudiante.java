/**
 * representa un estudiante en el sistema academico.
 *
 */
public class Estudiante {

    /**
     * Determina si el estudiante aprueba segun su nota final
     *
     * @param notaFinal nota obtenida por el estudiante
     * @return true su la nota es igual o superior a 4.0
     */

    public boolean estaAprobado(double notaFinal) {
        return notaFinal >= 4.0;
    }
}