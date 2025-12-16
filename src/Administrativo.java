/**
 * Representa un usuario administrativo del sistema hospitalario.
 * <p>
 * Los administrativos tienen permisos para gestionar la asignación de médicos
 * a pacientes y registrar pruebas médicas en los historiales.
 * </p>
 *
 * @author Andrea Barcenas
 * @version 1.0
 */
public class Administrativo extends Usuario{
    /**
     * Identificador único del administrativo en el sistema.
     */
    private String idAdministrativo;
    /**
     * Crea un nuevo administrativo con todos sus datos personales y de usuario.
     *
     * @param nombre Nombre completo del administrativo
     * @param dni Documento Nacional de Identidad
     * @param email Correo electrónico de contacto
     * @param direccion Dirección postal
     * @param username Nombre de usuario para acceder al sistema
     * @param passwordHash Contraseña hasheada para seguridad
     * @param salt Salt utilizado en el hash de la contraseña
     * @param idAdministrativo Identificador único del administrativo
     */
    public Administrativo(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String idAdministrativo) {
        super(nombre, dni, email, direccion, username, passwordHash, salt);
        this.idAdministrativo = idAdministrativo;
    }
    /**
     * Obtiene el identificador único del administrativo.
     *
     * @return El ID del administrativo
     */
    public String getIdAdministrativo() {
        return idAdministrativo;
    }
    /**
     * Establece el identificador único del administrativo.
     *
     * @param idAdministrativo El nuevo ID del administrativo
     */
    public void setIdAdministrativo(String idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }
    /**
     * Asigna un médico a un paciente específico.
     * <p>
     * Este método establece la relación entre un paciente y su médico responsable,
     * permitiendo un seguimiento médico personalizado.
     * </p>
     *
     * @param paciente El paciente al que se le asignará el médico
     * @param medico El médico que será asignado al paciente
     */
    public void asignarMedico(Paciente paciente, Medico medico) {
        paciente.setMedicoAsignado(medico);
    }
    /**
     * Registra una prueba médica en el historial de un paciente.
     * <p>
     * Agrega la prueba médica realizada al historial clínico del paciente,
     * manteniendo un registro completo de todas las pruebas diagnósticas.
     * </p>
     *
     * @param paciente El paciente al que se le asignará la prueba
     * @param prueba La prueba médica a registrar en el historial
     */
    public void asignarPrueba(Paciente paciente, PruebaMedica prueba) {
        paciente.getHistorial().agregarEntrada(prueba);
    }
    /**
     * Devuelve una representación en String del administrativo.
     * <p>
     * Incluye todos los datos heredados de Usuario más el ID administrativo.
     * </p>
     *
     * @return String con la información completa del administrativo
     */
    @Override
    public String toString() {
        return "Administrativo - " + super.toString() + ", ID: " + idAdministrativo;
    }
}
