/**
 * Representa un paciente del sistema hospitalario.
 * <p>
 * Esta clase extiende de {@link Persona} y añade funcionalidad específica para
 * la gestión de pacientes, incluyendo su historial médico y el médico asignado
 * para su seguimiento clínico.
 * </p>
 * <p>
 * Cada paciente cuenta con un historial médico que se inicializa automáticamente
 * al crear la instancia, donde se registran todas las pruebas, recetas y otros
 * eventos médicos relevantes.
 * </p>
 *
 * @author Andrea Barcenas
 * @version 1.0
 */
public class Paciente extends Persona{
    /**
     * Historial médico completo del paciente.
     * Contiene todas las entradas médicas como pruebas, recetas y diagnósticos.
     */
    private HistorialMedico historial;
    /**
     * Médico responsable del seguimiento y atención del paciente.
     * Puede ser null si aún no se ha asignado ningún médico.
     */
    private Medico medicoAsignado;
    /**
     * Crea un nuevo paciente con sus datos personales básicos.
     * <p>
     * Al crear el paciente, se inicializa automáticamente su historial médico
     * como una lista vacía lista para recibir nuevas entradas.
     * </p>
     *
     * @param nombre Nombre completo del paciente
     * @param dni Documento Nacional de Identidad
     * @param email Correo electrónico de contacto
     * @param direccion Dirección postal
     */
    public Paciente(String nombre, String dni, String email, String direccion) {
        super(nombre, dni, email, direccion);
        this.historial = new HistorialMedico();
    }
    /**
     * Obtiene el médico asignado al paciente.
     *
     * @return El médico responsable del paciente, o null si no tiene médico asignado
     */
    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }
    /**
     * Asigna un médico responsable al paciente.
     * <p>
     * Este método establece la relación entre el paciente y su médico de referencia,
     * quien será responsable de su seguimiento y atención médica.
     * </p>
     *
     * @param medicoAsignado El médico que será asignado al paciente
     */
    public void setMedicoAsignado(Medico medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }
    /**
     * Obtiene el historial médico completo del paciente.
     *
     * @return El historial médico con todas las entradas registradas
     */
    public HistorialMedico getHistorial() {
        return historial;
    }
    /**
     * Establece o reemplaza el historial médico del paciente.
     *
     * @param historial El nuevo historial médico del paciente
     */
    public void setHistorial(HistorialMedico historial) {
        this.historial = historial;
    }
    /**
     * Devuelve una representación en String del paciente.
     * <p>
     * Incluye todos los datos personales heredados de Persona + la información
     * del médico asignado.
     * </p>
     *
     * @return String con la información completa del paciente
     */
    @Override
    public String toString() {
        return "Paciente - " + super.toString() +
                ", Médico asignado: " + getMedicoAsignado();
    }
}
