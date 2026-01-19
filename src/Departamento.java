// Departamento.java
import java.util.ArrayList;
import java.util.List;

/**
 * Departamento de la empresa.
 */
public class Departamento {

    private String nombre;
    private String jefeDepartamento; // id del manager
    private double presupuestoAnual;
    private List<Empleado> empleados;

    /**
     * Constructor (empieza con lista vacía).
     */
    public Departamento(String nombre, String jefeDepartamento, double presupuestoAnual) {
        this.nombre = nombre;
        this.jefeDepartamento = jefeDepartamento;
        this.presupuestoAnual = presupuestoAnual;
        this.empleados = new ArrayList<>();
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getJefeDepartamento() { return jefeDepartamento; }
    public void setJefeDepartamento(String jefeDepartamento) { this.jefeDepartamento = jefeDepartamento; }

    public double getPresupuestoAnual() { return presupuestoAnual; }
    public void setPresupuestoAnual(double presupuestoAnual) { this.presupuestoAnual = presupuestoAnual; }

    public List<Empleado> getEmpleados() { return empleados; }
    public void setEmpleados(List<Empleado> empleados) { this.empleados = empleados; }

    /**
     * Agrega un empleado al departamento.
     */
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    /**
     * Suma el salario anual de los empleados activos.
     */
    public double calcularNominaDepartamento() {
        double total = 0;

        for (Empleado e : empleados) {
            if (e != null && e.isActivo()) {
                total += e.calcularSalario();
            }
        }

        return total;
    }

    /**
     * Devuelve la lista de empleados.
     */
    public List<Empleado> listarEmpleados() {
        return empleados;
    }
}
