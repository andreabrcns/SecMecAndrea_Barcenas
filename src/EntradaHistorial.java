import java.time.LocalDate;

public abstract class EntradaHistorial {
    protected LocalDate fecha;
    protected String idMedico;
    protected String causa;

    public EntradaHistorial(LocalDate fecha, String idMedico, String causa) {
        this.fecha = fecha;
        this.idMedico = idMedico;
        this.causa = causa;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getIdMedico() {
        return idMedico;
    }

    public String getCausa() {
        return causa;
    }
    public abstract String getTipo();

}
