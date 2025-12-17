import java.time.LocalDate;
import java.util.List;
/**
 * Representa una receta médica prescrita a un paciente.
 * <p>
 * Esta clase extiende de {@link EntradaHistorial} y registra información específica
 * sobre medicamentos recetados por un médico para tratar una condición o síntoma
 * determinado.
 * </p>
 * <p>
 * Las recetas quedan permanentemente registradas en el historial médico del paciente,
 * permitiendo un seguimiento completo de los tratamientos farmacológicos prescritos.
 * </p>
 *
 * @author Andrea Barcenas
 * @version 1.0
 */
public class Receta extends EntradaHistorial {
    /**
     * Lista de medicamentos prescritos en esta receta.
     * Cada elemento representa un medicamento con su dosificación recomendada.
     */
    private List<String> medicamentos;
    /**
     * Crea una nueva receta médica con todos sus datos.
     *
     * @param fecha Fecha en que se emitió la receta
     * @param idMedico Identificador del médico que prescribe la receta
     * @param causa Motivo, diagnóstico o síntoma que justifica la prescripción
     * @param medicamentos Lista de medicamentos prescritos con sus dosificaciones
     */
    public Receta(LocalDate fecha, String idMedico, String causa, List<String> medicamentos) {
        super(fecha, idMedico, causa);
        this.medicamentos = medicamentos;
    }
    /**
     * Obtiene los medicamentos prescritos como una cadena de texto.
     * <p>
     * Los medicamentos se devuelven separados por comas para facilitar
     * su lectura.
     * </p>
     *
     * @return String con todos los medicamentos separados por comas
     */
    public String getMedicamentos() {
        return String.join(", ", medicamentos);
    }
    /**
     * Obtiene el tipo de entrada del historial.
     * <p>
     * Implementación del método abstracto de EntradaHistorial.
     * </p>
     *
     * @return La cadena "Receta"
     */
    @Override
    public String getTipo() { return "Receta"; }
    /**
     * Devuelve una representación en String de la receta médica.
     * <p>
     * Incluye el tipo de entrada, fecha, causa y la lista completa de
     * medicamentos prescritos en un formato legible.
     * </p>
     *
     * @return String con toda la información de la receta
     */
    @Override
    public String toString() {
        return getTipo() + " - Fecha: " + fecha +
                ", Causa: " + causa +
                ", Medicamentos: [" + getMedicamentos() + "]";
    }
}
