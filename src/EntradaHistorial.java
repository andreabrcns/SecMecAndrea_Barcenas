import java.time.LocalDate;

public abstract class EntradaHistorial {
    protected LocalDate fecha;
    protected String idMedico;
    protected String causa;

    public EntradaHistorial(LocalDate fecha, String idMedico, String causa) {
    }
}
