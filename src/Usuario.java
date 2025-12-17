/**
 * Representa un usuario con acceso al sistema hospitalario.
 * <p>
 * Esta clase extiende de {@link Persona} y añade las credenciales de autenticación
 * necesarias para acceder al sistema. Implementa medidas de seguridad almacenando
 * la contraseña de forma hasheada junto con su salt correspondiente.
 * </p>
 * <p>
 * Sirve como clase base para diferentes tipos de usuarios del sistema como
 * administrativos y personal sanitario, quienes requieren autenticación para
 * realizar sus funciones.
 * </p>
 *
 * @author Andrea Barcenas
 * @version 1.0
 */
public class Usuario extends Persona{
    /**
     * Nombre de usuario único para acceder al sistema.
     * Identifica de forma única al usuario en el proceso de autenticación.
     */
    protected String username;
    /**
     * Contraseña hasheada del usuario.
     * <p>
     * Por seguridad, nunca se almacena la contraseña en texto plano,
     * sino su versión hasheada mediante un algoritmo criptográfico.
     * </p>
     */
    protected String passwordHash;
    /**
     * Salt utilizado en el proceso de hashing de la contraseña.
     * <p>
     * El salt es un valor aleatorio que se añade a la contraseña antes
     * de hashearla, aumentando la seguridad contra ataques de diccionario
     * y tablas rainbow.
     * </p>
     */
    protected String salt;
    /**
     * Crea un nuevo usuario con sus datos personales y credenciales de acceso.
     *
     * @param nombre Nombre completo del usuario
     * @param dni Documento Nacional de Identidad
     * @param email Correo electrónico de contacto
     * @param direccion Dirección postal
     * @param username Nombre de usuario único para el sistema
     * @param passwordHash Contraseña hasheada para autenticación segura
     * @param salt Salt utilizado en el proceso de hashing de la contraseña
     */
    public Usuario(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt) {
        super(nombre, dni, email, direccion);
        this.username = username;
        this.passwordHash = passwordHash;
        this.salt = salt;
    }
    /**
     * Obtiene el nombre de usuario.
     *
     * @return El username del usuario
     */
    public String getUsername() {
        return username;
    }
    /**
     * Establece el nombre de usuario.
     *
     * @param username El nuevo nombre de usuario
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * Obtiene el hash de la contraseña.
     *
     * @return La contraseña hasheada
     */
    public String getPasswordHash() {
        return passwordHash;
    }
    /**
     * Establece el hash de la contraseña.
     * <p>
     * Este método debería usarse únicamente al crear o cambiar la contraseña,
     * asegurándose de hashear la nueva contraseña antes de almacenarla.
     * </p>
     *
     * @param passwordHash El nuevo hash de contraseña
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
    /**
     * Obtiene el salt utilizado en el hashing.
     *
     * @return El salt de la contraseña
     */
    public String getSalt() {
        return salt;
    }
    /**
     * Establece el salt para el hashing de la contraseña.
     *
     * @param salt El nuevo salt
     */

    public void setSalt(String salt) {
        this.salt = salt;
    }
    /**
     * Devuelve una representación en String del usuario.
     * <p>
     * Incluye todos los datos personales heredados de Persona más el username.
     * Por seguridad, no se incluyen el passwordHash ni el salt en la representación.
     * </p>
     *
     * @return String con la información del usuario
     */
    @Override
    public String toString() {
        return super.toString() + ", Username: " + username;
    }
}
