/**
 * Clase abstracta que representa al personal sanitario del sistema hospitalario.
 * <p>
 * Esta clase extiende de {@link Usuario} y añade el número de colegiado como
 * atributo distintivo del personal sanitario. Sirve como base para diferentes
 * tipos de profesionales sanitarios como médicos, enfermeros, etc.
 * </p>
 * <p>
 * Al ser abstracta, no puede ser instanciada directamente, sino que debe ser
 * extendida por clases concretas que representen tipos específicos de personal
 * sanitario con sus particularidades profesionales.
 * </p>
 *
 * @author Andrea Barcenas
 * @version 1.0
 */
public abstract class PersonalSanitario extends Usuario{
    /**
     * Número de colegiado profesional.
     * <p>
     * Identificador único que acredita al profesional sanitario ante el colegio
     * profesional correspondiente. Es obligatorio para ejercer la medicina.
     * </p>
     */
    protected String numeroColegiado;
    /**
     * Crea un nuevo miembro del personal sanitario con todos sus datos personales,
     * de usuario y profesionales.
     *
     * @param nombre Nombre completo del profesional sanitario
     * @param dni Documento Nacional de Identidad
     * @param email Correo electrónico de contacto
     * @param direccion Dirección postal
     * @param username Nombre de usuario para acceder al sistema
     * @param passwordHash Contraseña hasheada para seguridad
     * @param salt Salt utilizado en el hash de la contraseña
     * @param numeroColegiado Número de colegiado profesional único
     */
    public PersonalSanitario(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String numeroColegiado) {
        super(nombre, dni, email, direccion, username, passwordHash, salt);
        this.numeroColegiado = numeroColegiado;
    }
    /**
     * Obtiene el número de colegiado del profesional sanitario.
     *
     * @return El número de colegiado
     */
    public String getNumeroColegiado() {
        return numeroColegiado;
    }
    /**
     * Establece el número de colegiado del profesional sanitario.
     *
     * @param numeroColegiado El nuevo número de colegiado
     */
    public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }
}
