import java.time.LocalDate;
/**
 * Clase abstracta que representa una entrada genérica en el historial médico de un paciente.
 * <p>
 * Esta clase sirve como base para diferentes tipos de entradas médicas como
 * pruebas médicas, recetas, diagnósticos, etc. Cada entrada registra información
 * común como la fecha, el médico responsable y la causa que motivó la entrada.
 * </p>
 * <p>
 * Las clases hijas deben implementar el método {@link #getTipo()} para identificar
 * el tipo específico de entrada médica.
 * </p>
 *
 * @author Andrea Barcenas
 * @version 1.0
 */
public abstract class EntradaHistorial {
    /**
     * Fecha en que se registró la entrada en el historial.
     */
    protected LocalDate fecha;
    /**
     * Identificador del médico responsable de la entrada.
     * Puede ser el número de colegiado u otro identificador único.
     */
    protected String idMedico;
    /**
     * Motivo o causa que originó esta entrada en el historial.
     * Por ejemplo: "Dolor de cabeza", "Revisión anual", etc.
     */
    protected String causa;
    /**
     * Crea una nueva entrada para el historial médico.
     *
     * @param fecha Fecha en que se registra la entrada
     * @param idMedico Identificador del médico responsable
     * @param causa Motivo o causa que origina la entrada
     */

    public EntradaHistorial(LocalDate fecha, String idMedico, String causa) {
        this.fecha = fecha;
        this.idMedico = idMedico;
        this.causa = causa;
    }
    /**
     * Obtiene la fecha de la entrada.
     *
     * @return La fecha en que se registró esta entrada
     */
    public LocalDate getFecha() {
        return fecha;
    }
    /**
     * Obtiene el identificador del médico responsable.
     *
     * @return El ID del médico que registró esta entrada
     */
    public String getIdMedico() {
        return idMedico;
    }
    /**
     * Obtiene la causa o motivo de la entrada.
     *
     * @return La causa que motivó el registro de esta entrada
     */
    public String getCausa() {
        return causa;
    }
    /**
     * Obtiene el tipo específico de entrada médica.
     * <p>
     * Este método debe ser implementado por las clases hijas para identificar
     * el tipo concreto de entrada
     * </p>
     *
     * @return Una cadena que identifica el tipo de entrada
     */
    public abstract String getTipo();

}
