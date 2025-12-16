import java.util.ArrayList;
import java.util.List;

public class HistorialMedico {
    private List<EntradaHistorial> entradas;
    public HistorialMedico() {
        this.entradas = new ArrayList<>();
    }

    public List<EntradaHistorial> getEntradas() { return entradas; }

    public void agregarEntrada(EntradaHistorial entrada) {
        this.entradas.add(entrada);
    }
    @Override
    public String toString() {
        return  "Objeto HistorialMedico {\n" +
                " entradas = '" + entradas + "'\n" +
                '}';
    }
}
