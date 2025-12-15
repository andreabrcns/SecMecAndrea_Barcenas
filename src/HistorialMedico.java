import java.util.ArrayList;
import java.util.List;

public class HistorialMedico {
    private List<EntradaHistorial> entradas;
    public HistorialMedico() {
        this.entradas = new ArrayList<>();
    }

    public List<EntradaHistorial> getEntradas() { return entradas; }
}
