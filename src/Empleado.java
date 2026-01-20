// Empleado.java
import java.time.LocalDate;

/**
 * Empleado de la empresa (hereda de Persona  ).
 */
public class Empleado extends Persona {

    // Atributos
    private double salarioBase;       // mensual
    private int antiguedadAnios;      // se calcula con fechaContratacion
    private String idEmpleado;
    private LocalDate fechaContratacion;
    private String departamento;
    private double jornadaHoraria;    // horas/día
    private boolean activo;

    /**
     * Constructor.
     */
    public Empleado(String dni, String nombre, int edad, int telefono, int fechaNacimiento, String email,
                    double salarioBase, String idEmpleado, LocalDate fechaContratacion, String departamento,
                    double jornadaHoraria, boolean activo) {
        super(dni, nombre, edad, telefono, fechaNacimiento, email);
        this.salarioBase = salarioBase;
        this.idEmpleado = idEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.departamento = departamento;
        this.jornadaHoraria = jornadaHoraria;
        this.activo = activo;

        // calcular antigüedad al crear
        this.antiguedadAnios = calcularAntiguedad();
    }

    // Getters y setters
    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }

    public int getAntiguedadAnios() { return antiguedadAnios; }

    public String getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(String idEmpleado) { this.idEmpleado = idEmpleado; }

    public LocalDate getFechaContratacion() { return fechaContratacion; }
    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
        this.antiguedadAnios = calcularAntiguedad();
    }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public double getJornadaHoraria() { return jornadaHoraria; }
    public void setJornadaHoraria(double jornadaHoraria) { this.jornadaHoraria = jornadaHoraria; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }

    /**
     * Calcula años de antigüedad (simple).
     */
    public int calcularAntiguedad() {
        if (fechaContratacion == null) return 0;

        LocalDate hoy = LocalDate.now();
        int anios = hoy.getYear() - fechaContratacion.getYear();

        // si aún no llegó el aniversario este año, resta 1
        if (hoy.getDayOfYear() < fechaContratacion.getDayOfYear()) {
            anios--;
        }

        if (anios < 0) anios = 0;
        return anios;
    }

    /**
     * Calcula salario ANUAL con plus de antigüedad (3% por año).
     */
    public double calcularSalario() {
        antiguedadAnios = calcularAntiguedad();

        double plus = 1 + (0.03 * antiguedadAnios); // 3% por año
        double mensualConPlus = salarioBase * plus;

        return mensualConPlus * 12;
    }
}
