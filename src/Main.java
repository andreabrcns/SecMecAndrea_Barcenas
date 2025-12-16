/**
 * Clase principal que inicia la aplicación del sistema hospitalario.
 * <p>
 * Esta clase contiene el método main que sirve como punto de entrada
 * de la aplicación. Su única responsabilidad es crear una instancia del
 * controlador e iniciar el flujo del programa siguiendo el patrón MVC
 * (Modelo-Vista-Controlador).
 * </p>
 *
 * @author Andrea Barcenas
 * @version 1.0
 */
public class Main {
    /**
     * Método principal que arranca la aplicación.
     * <p>
     * Crea una instancia del controlador y ejecuta el método iniciar()
     * que pone en marcha toda la lógica de negocio del sistema hospitalario.
     * </p>
     *
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        controlador.iniciar();
    }
}
