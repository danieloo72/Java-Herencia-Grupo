import java.time.LocalDate;
import java.time.Period;

class Empleado extends Persona {

    /**
     * Atributos
     */
    protected double salarioBase;      // salario mensual base
    protected int antiguedadAnios;     // se recalcula desde fechaContratacion

    // nuevos atributos
    private String idEmpleado;
    private LocalDate fechaContratacion;
    private String departamento;
    private double jornadaHoraria;     // horas/día (ej: 8.0)
    private boolean activo;

    /**
     * Constructor
     */
    public Empleado(String dni, String nombre, int edad, int telefono, int fechaNacimiento, String email,
                    double salarioBase, int antiguedadAnios, String idEmpleado, LocalDate fechaContratacion, String departamento,
                    double jornadaHoraria, boolean activo) {
        super(dni, nombre, edad, telefono, fechaNacimiento, email);
        this.salarioBase = salarioBase;
        this.antiguedadAnios = antiguedadAnios;
        this.idEmpleado = idEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.departamento = departamento;
        this.jornadaHoraria = jornadaHoraria;
        this.activo = activo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAntiguedadAnios() {
        return antiguedadAnios;
    }

    public void setAntiguedadAnios(int antiguedadAnios) {
        this.antiguedadAnios = antiguedadAnios;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getJornadaHoraria() {
        return jornadaHoraria;
    }

    public void setJornadaHoraria(double jornadaHoraria) {
        this.jornadaHoraria = jornadaHoraria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }


    //metodos
    public int calcularAntiguedad() {
        if (fechaContratacion == null) {
            return 0;
        }
        LocalDate hoy = LocalDate.now();
        if (fechaContratacion.isAfter(hoy)) {
            return 0; // o lanzar excepción si prefieres
        }
        int anios = Period.between(fechaContratacion, hoy).getYears();
        return anios;
    }

    /**
     * Calcula el salario ANUAL incluyendo plus por antigüedad.
     * Plus: 3% por cada año sobre el salario base (mensual).
     */
    public Double calcularSalario() {
        this.antiguedadAnios = calcularAntiguedad();

        double porcentajeAntiguedad = 0.03; // 3% por año
        double salarioMensualConPlus = salarioBase * (1 + porcentajeAntiguedad * antiguedadAnios);

        return salarioMensualConPlus * 12;
    }
}
