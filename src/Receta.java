import java.time.LocalDate;
import java.util.List;

public class Receta extends EntradaHistorial {
    private List<String> medicamentos;

    public Receta(LocalDate fecha, String idMedico, String causa, List<String> medicamentos) {
        super(fecha, idMedico, causa);
        this.medicamentos = medicamentos;
    }
}
