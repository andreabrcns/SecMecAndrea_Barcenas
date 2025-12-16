import java.time.LocalDate;
import java.util.Arrays;
/**
 * Controlador principal de la aplicación siguiendo el patrón MVC.
 * <p>
 * Esta clase actúa como intermediario entre el modelo (entidades) y la vista,
 * gestionando la lógica de negocio y el flujo de la aplicación. Se encarga de
 * coordinar la creación de usuarios, pacientes, asignación de médicos y gestión
 * de historiales médicos.
 * </p>
 *
 * @author Andrea Barcenas
 * @version 1.0
 */
public class Controlador {

    /**
     * Inicia la simulación del sistema hospitalario.
     * <p>
     * Este método ejecuta un flujo completo de prueba que incluye:
     * </p>
     * <ul>
     *   <li>Creación de un administrativo y un médico</li>
     *   <li>Registro de un nuevo paciente</li>
     *   <li>Asignación del médico al paciente</li>
     *   <li>Registro de pruebas médicas en el historial</li>
     *   <li>Emisión de recetas médicas</li>
     *   <li>Visualización del historial médico completo</li>
     * </ul>
     * <p>
     * Todos los mensajes y resultados se muestran a través de la vista,
     * manteniendo la separación de responsabilidades del patrón MVC.
     * </p>
     */
    public void iniciar() {
        Vista miVista = new Vista();

        // Crear Admin y Médico
        Administrativo testAdmin1 = new Administrativo(
                "Administrativo 1",
                "123456789A",
                "administrador1@secmed.com",
                "C/Capitan 24",
                "user.Administrador1",
                "contraseñaAdministrador1",
                "sal",
                "idAdministrador1_001"
        );

        Medico testMedico1 = new Medico(
                "Sandra Fernández",
                "123456789B",
                "sandra_fernandez@secmed.com",
                "C/Santiago Rusiñol 3",
                "user.SandraFernandez",
                "contraseñaSandraFernandez",
                "sal",
                "N.Colegiado_01",
                Especialidad.PEDIATRIA
        );

        // Imprimir Administrador y Médico
        miVista.imprimir("\nUsuarios creados: ");
        miVista.imprimir(testAdmin1.toString());
        miVista.imprimir(testMedico1.toString());

        // Crear Paciente
        Paciente testPaciente1 = new Paciente("Andrea", "54901205K", "andrea_barcenas@gmail.com", "C/Alejandro Sureda 1");

        // Imprimir Paciente
        miVista.imprimir("\nPaciente creado: ");
//        miVista.imprimir(testPaciente1.toString());

        // Asigno la relación médico-paciente con el usuario Administrador
        testAdmin1.asignarMedico(testPaciente1, testMedico1);
        miVista.imprimir(testPaciente1.toString());

        // Creo historial de Paciente
        PruebaMedica testPruebaMedica1 = new PruebaMedica(
                LocalDate.now(),
                testMedico1.getNumeroColegiado(),
                "Dolor de pecho al respirar",
                TipoPrueba.TAC,
                "Infección en los pulmones"
        );

        Receta testReceta1 = new Receta(
                LocalDate.now(),
                testMedico1.getNumeroColegiado(),
                "Dolor de pecho al respirar",
                Arrays.asList("Antibiótico para la infección", "Ibuprofeno 500mg")
        );

        // Admin asigna pruebas médicas
        testAdmin1.asignarPrueba(testPaciente1, testPruebaMedica1);
        miVista.imprimir("\nAdministrativo 1 ha asignado una prueba médica...");

        // Imprimo historial de Paciente
        miVista.imprimir("\nEl médico realiza las pruebas...");
        miVista.imprimir(testPruebaMedica1.toString());

        miVista.imprimir("\nEl médico receta en base al resultado de las pruebas...");
        miVista.imprimir(testReceta1.toString());

        // Agregar receta al historial también
        testPaciente1.getHistorial().agregarEntrada(testReceta1);

        // Imprimir historial completo de paciente
        miVista.imprimir("--- Historial completo del paciente ---");
        miVista.imprimir(testPaciente1.getHistorial().toString());
    }
}
