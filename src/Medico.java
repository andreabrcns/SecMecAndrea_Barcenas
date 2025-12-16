/**
 * Representa un médico del sistema hospitalario.
 * <p>
 * Esta clase extiende de PersonalSanitario y añade la especialidad médica
 * como característica propia de la clase. Los médicos son responsables de realizar pruebas,
 * emitir recetas y llevar el seguimiento clínico de los pacientes asignados.
 * </p>
 * <p>
 * Cada médico tiene un número de colegiado único y una especialidad que define
 * su área de expertise médica.
 * </p>
 *
 * @author Andrea Barcenas
 * @version 1.0
 */
public class Medico extends PersonalSanitario{
    /**
     * Especialidad médica del doctor.
     * Define el área de conocimiento y práctica profesional del médico.
     */
    private Especialidad especialidad;
    /**
     * Crea un nuevo médico con todos sus datos personales, de usuario y profesionales.
     *
     * @param nombre Nombre completo del médico
     * @param dni Documento Nacional de Identidad
     * @param email Correo electrónico de contacto
     * @param direccion Dirección postal
     * @param username Nombre de usuario para acceder al sistema
     * @param passwordHash Contraseña hasheada para seguridad
     * @param salt Salt utilizado en el hash de la contraseña
     * @param numeroColegiado Número de colegiado profesional único
     * @param especialidad Especialidad médica del doctor
     */
    public Medico(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String numeroColegiado, Especialidad especialidad) {
        super(nombre, dni, email, direccion, username, passwordHash, salt, numeroColegiado);
        this.especialidad = especialidad;
    }
    /**
     * Obtiene la especialidad médica del doctor.
     *
     * @return La especialidad del médico
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    /**
     * Establece la especialidad médica del doctor.
     *
     * @param especialidad La nueva especialidad del médico
     */
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    /**
     * Devuelve una representación en String del médico.
     * <p>
     * Incluye todos los datos heredados de PersonalSanitario más la especialidad médica.
     * </p>
     *
     * @return String con la información completa del médico
     */
    @Override
    public String toString() {
        return "Médico - " + super.toString() + ", Nº Colegiado: " + numeroColegiado + ", Especialidad: " + especialidad;
    }
}
