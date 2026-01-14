import java.time.LocalDate;
import java.time.LocalDateTime;

public class Fichaje {

    protected String idFichaje;
    protected String idEmpleado;
    protected LocalDateTime fechaHoraEntrada;
    protected LocalDateTime fechaHoraSalida;
    protected String tipo;

    public Fichaje(String idFichaje, String idEmpleado, LocalDateTime fechaHoraEntrada, LocalDateTime fechaHoraSalida, String tipo) {
        this.idFichaje = idFichaje;
        this.idEmpleado = idEmpleado;
        this.fechaHoraEntrada = fechaHoraEntrada;
        this.fechaHoraSalida = fechaHoraSalida;
        this.tipo = tipo;
    }

    public String getIdFichaje() {
        return idFichaje;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public LocalDateTime getFechaHoraEntrada() {
        return fechaHoraEntrada;
    }

    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public String getTipo() {
        return tipo;
    }

    LocalDateTime now = LocalDateTime.now();

    if("ENTRADA".equalsIgnoreCase(tipo)){
        this.fechaHoraEntrada = now;

    }else if("SALIDA".equalsIgnoreCase(tipo)){
        this.fechaHoraSalida = now;
    }

}
