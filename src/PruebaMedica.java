import java.time.LocalDate;

public class PruebaMedica extends EntradaHistorial {
    private TipoPrueba tipoPrueba;
    private String resultado;

    public PruebaMedica(LocalDate fecha, String idMedico, String causa, TipoPrueba tipoPrueba, String resultado) {
        super(fecha, idMedico, causa);
        this.tipoPrueba = tipoPrueba;
        this.resultado = resultado;
    }

    public TipoPrueba getTipoPrueba() {
        return tipoPrueba;
    }
    public String getResultado() {
        return resultado;
    }
    @Override
    public String getTipo() { return "Prueba Médica"; }

    @Override
    public String toString() {
        return getTipo() + " - Fecha: " + fecha + ", Tipo: " + tipoPrueba +
                ", Causa: " + causa + ", Resultado: " + resultado;
    }

}
