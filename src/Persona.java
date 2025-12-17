/**
 * Clase abstracta que representa a una persona en el sistema hospitalario.
 * <p>
 * Esta clase sirve como base para todas las entidades que representan personas
 * en el sistema, como pacientes, usuarios, médicos y administrativos. Contiene
 * los atributos y métodos comunes a todas las personas.
 * </p>
 * <p>
 * Al ser abstracta, no puede ser instanciada directamente, sino que tiene que ser
 * extendida por clases concretas que representen tipos específicos de personas.
 * </p>
 *
 * @author Andrea Barcenas
 * @version 1.0
 */
public abstract class Persona {
    /**
     * Nombre completo de la persona.
     */
    protected String nombre;
    /**
     * Documento Nacional de Identidad de la persona.
     * Debe ser único en el sistema.
     */
    protected String dni;
    /**
     * Dirección de correo electrónico de contacto.
     */
    protected String email;
    /**
     * Dirección postal completa de residencia.
     */
    protected String direccion;
    /**
     * Crea una nueva persona con sus datos personales básicos.
     *
     * @param nombre Nombre completo de la persona
     * @param dni Documento Nacional de Identidad
     * @param email Correo electrónico de contacto
     * @param direccion Dirección postal de residencia
     */
    public Persona(String nombre, String dni, String email, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.direccion = direccion;
    }
    /**
     * Obtiene el nombre de la persona.
     *
     * @return El nombre completo
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre de la persona.
     *
     * @param nombre El nuevo nombre completo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene el DNI de la persona.
     *
     * @return El Documento Nacional de Identidad
     */
    public String getDni() {
        return dni;
    }
    /**
     * Establece el DNI de la persona.
     *
     * @param dni El nuevo Documento Nacional de Identidad
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    /**
     * Obtiene el email de la persona.
     *
     * @return La dirección de correo electrónico
     */
    public String getEmail() {
        return email;
    }
    /**
     * Establece el email de la persona.
     *
     * @param email La nueva dirección de correo electrónico
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Obtiene la dirección de la persona.
     *
     * @return La dirección de residencia
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Establece la dirección postal de la persona.
     *
     * @param direccion La nueva dirección de residencia
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Devuelve una representación en String de los datos personales.
     * <p>
     * Muestra el nombre, DNI, email y dirección de la persona en formato legible.
     * </p>
     *
     * @return String con los datos personales completos
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", DNI: " + dni + ", Email: " + email + ", Dirección: " + direccion;
    }
}
