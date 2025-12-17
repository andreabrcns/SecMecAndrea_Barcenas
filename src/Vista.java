/**
 * Clase Vista del patrón Modelo-Vista-Controlador (MVC).
 * <p>
 * Esta clase se encarga exclusivamente de la presentación de información al usuario.
 * Gestiona toda la salida de datos hacia la consola, manteniendo la separación
 * de responsabilidades establecida por el patrón MVC.
 * </p>
 * <p>
 * La Vista no contiene lógica, únicamente métodos para mostrar
 * información que le es proporcionada por el Controlador.
 * </p>
 *
 * @author Andrea Barcenas
 * @version 1.0
 */
public class Vista {
    /**
     * Imprime un mensaje en la consola.
     * <p>
     * Este método centraliza toda la salida de información del sistema,
     * permitiendo mostrar mensajes, resultados y datos al usuario de forma
     * consistente.
     * </p>
     *
     * @param mensaje El mensaje o información a mostrar en la consola
     */
    public void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
}
