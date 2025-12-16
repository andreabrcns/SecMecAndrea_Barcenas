import java.time.LocalDate;
import java.util.List;

public class Receta extends EntradaHistorial {
    private List<String> medicamentos;

    public Receta(LocalDate fecha, String idMedico, String causa, List<String> medicamentos) {
        super(fecha, idMedico, causa);
        this.medicamentos = medicamentos;
    }

    public String getMedicamentos() {
        return String.join(", ", medicamentos);
    }
    @Override
    public String getTipo() { return "Receta"; }

    @Override
    public String toString() {
        return getTipo() + " - Fecha: " + fecha +
                ", Causa: " + causa +
                ", Medicamentos: [" + getMedicamentos() + "]";
    }
}
