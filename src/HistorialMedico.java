import java.util.ArrayList;
import java.util.List;
/**
 * Representa el historial médico completo de un paciente.
 * <p>
 * Esta clase gestiona todas las entradas médicas de un paciente, incluyendo
 * pruebas médicas, recetas, diagnósticos y otros registros clínicos. Permite
 * mantener un seguimiento cronológico y organizado de toda la información médica.
 * </p>
 * <p>
 * El historial se inicializa automáticamente como una lista vacía y puede ir
 * creciendo conforme se agregan nuevas entradas médicas.
 * </p>
 *
 * @author Andrea Barcenas
 * @version 1.0
 * @see EntradaHistorial
 * @see Paciente
 */
public class HistorialMedico {
    /**
     * Lista que almacena todas las entradas del historial médico.
     * Incluye pruebas médicas, recetas y otros registros clínicos ordenados cronológicamente.
     */
    private List<EntradaHistorial> entradas;
    /**
     * Crea un nuevo historial médico vacío.
     * <p>
     * Inicializa la lista de entradas como un ArrayList vacío, listo para
     * recibir nuevas entradas médicas conforme se vayan registrando.
     * </p>
     */
    public HistorialMedico() {
        this.entradas = new ArrayList<>();
    }
    /**
     * Obtiene la lista completa de entradas del historial médico.
     *
     * @return Lista con todas las entradas médicas registradas
     */
    public List<EntradaHistorial> getEntradas() { return entradas; }
    /**
     * Agrega una nueva entrada al historial médico.
     * <p>
     * Este método permite añadir cualquier tipo de entrada médica
     * (pruebas, recetas, etc.) al historial del paciente, manteniendo
     * un registro completo de su evolución clínica.
     * </p>
     *
     * @param entrada La entrada médica a agregar al historial
     */
    public void agregarEntrada(EntradaHistorial entrada) {
        this.entradas.add(entrada);
    }
    /**
     * Devuelve una representación en String del historial médico.
     * <p>
     * Muestra el objeto HistorialMedico con todas sus entradas en formato legible.
     * </p>
     *
     * @return String con la representación del historial médico
     */
    @Override
    public String toString() {
        return  "Objeto HistorialMedico {\n" +
                " entradas = '" + entradas + "'\n" +
                '}';
    }
}
