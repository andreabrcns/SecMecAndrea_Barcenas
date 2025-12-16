import java.time.LocalDate;
import java.util.Arrays;

public class Controlador {

    /**
     * Inicia la simulación.
     * Crea instancias de administrativos, médicos y pacientes, estableciendo
     * las relaciones entre ellos, realizando pruebas y mostrando el resultado
     * a través de la vista.
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
                TipoPrueba.PRUEBA_ESFUERZO,
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
        miVista.imprimir("\nAdministrativo ha asignado prueba médica...");

        // Imprimo historial de Paciente
        miVista.imprimir("\nMédico realiza pruebas...");
        miVista.imprimir(testPruebaMedica1.toString());

        miVista.imprimir("\nMédico receta en base al resultado de las pruebas...");
        miVista.imprimir(testReceta1.toString());

        // Agregar receta al historial también
        testPaciente1.getHistorial().agregarEntrada(testReceta1);

        // Imprimir historial completo de paciente
        miVista.imprimir("--- Historial completo del paciente ---");
        miVista.imprimir(testPaciente1.getHistorial().toString());
    }
}
