import java.time.LocalDate;
/**
 * Representa una prueba médica realizada a un paciente.
 * <p>
 * Esta clase extiende de {@link EntradaHistorial} y registra información específica
 * sobre pruebas diagnósticas realizadas al paciente, incluyendo el tipo de prueba
 * y sus resultados.
 * </p>
 * <p>
 * Las pruebas médicas son fundamentales para el diagnóstico y seguimiento de
 * enfermedades, quedando registradas permanentemente en el historial médico del paciente.
 * </p>
 *
 * @author Andrea Barcenas
 * @version 1.0
 */
public class PruebaMedica extends EntradaHistorial {
    /**
     * Tipo de prueba médica realizada.
     * Define la categoría diagnóstica (TAC, radiografía, análisis de sangre, etc.).
     */
    private TipoPrueba tipoPrueba;
    /**
     * Resultado o conclusión de la prueba médica.
     * Contiene el diagnóstico obtenido tras realizar la prueba.
     */
    private String resultado;
    /**
     * Crea una nueva prueba médica con todos sus datos.
     *
     * @param fecha Fecha en que se realizó la prueba
     * @param idMedico Identificador del médico que solicitó/realizó la prueba
     * @param causa Motivo o síntoma que motivó la realización de la prueba
     * @param tipoPrueba Tipo de prueba médica realizada
     * @param resultado Resultado o conclusión obtenida de la prueba
     */
    public PruebaMedica(LocalDate fecha, String idMedico, String causa, TipoPrueba tipoPrueba, String resultado) {
        super(fecha, idMedico, causa);
        this.tipoPrueba = tipoPrueba;
        this.resultado = resultado;
    }
    /**
     * Obtiene el tipo de prueba médica realizada.
     *
     * @return El tipo de prueba (TAC, radiografía, etc.)
     */
    public TipoPrueba getTipoPrueba() {
        return tipoPrueba;
    }
    /**
     * Obtiene el resultado de la prueba médica.
     *
     * @return El resultado o conclusión de la prueba
     */
    public String getResultado() {
        return resultado;
    }
    /**
     * Obtiene el tipo de entrada del historial.
     * <p>
     * Implementación del método abstracto de {@link EntradaHistorial}.
     * </p>
     *
     * @return La cadena "Prueba Médica"
     */
    @Override
    public String getTipo() { return "Prueba Médica"; }
    /**
     * Devuelve una representación en String de la prueba médica.
     * <p>
     * Incluye el tipo de entrada, fecha, tipo de prueba, causa y resultado.
     * </p>
     *
     * @return String con toda la información de la prueba médica
     */
    @Override
    public String toString() {
        return getTipo() + " - Fecha: " + fecha + ", Tipo: " + tipoPrueba +
                ", Causa: " + causa + ", Resultado: " + resultado;
    }

}
