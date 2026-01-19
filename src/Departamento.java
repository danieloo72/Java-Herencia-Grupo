import java.util.ArrayList;
import java.util.List;

/**
 * Representa un departamento de la empresa con empleados, jefe y presupuesto.
 */
public class Departamento {

    private String nombre;
    private String jefeDepartamento; // id del manager
    private double presupuestoAnual;
    private List<Empleado> empleados;  // IDs de empleados

    //constructor

    /**
     * Constructor del departamento.
     *
     * @param nombre           El nombre del departamento
     * @param jefeDepartamento El ID del manager del departamento
     * @param presupuestoAnual El presupuesto anual del departamento
     * @param empleados        La lista de empleados del departamento
     */
    public Departamento(String nombre, String jefeDepartamento, double presupuestoAnual, List<Empleado> empleados) {
        this.nombre = nombre;
        this.jefeDepartamento = jefeDepartamento;
        this.presupuestoAnual = presupuestoAnual;
        this.empleados = empleados;
    }

    /**
     * Obtiene el nombre del departamento.
     *
     * @return El nombre del departamento
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del departamento.
     *
     * @param nombre El nuevo nombre del departamento
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el ID del jefe del departamento.
     *
     * @return El ID del manager del departamento
     */
    public String getJefeDepartamento() {
        return jefeDepartamento;
    }

    /**
     * Establece el jefe del departamento.
     *
     * @param jefeDepartamento El ID del nuevo manager del departamento
     */
    public void setJefeDepartamento(String jefeDepartamento) {
        this.jefeDepartamento = jefeDepartamento;
    }

    /**
     * Obtiene el presupuesto anual del departamento.
     *
     * @return El presupuesto anual
     */
    public double getPresupuestoAnual() {
        return presupuestoAnual;
    }

    /**
     * Establece el presupuesto anual del departamento.
     *
     * @param presupuestoAnual El nuevo presupuesto anual
     */
    public void setPresupuestoAnual(double presupuestoAnual) {
        this.presupuestoAnual = presupuestoAnual;
    }

    /**
     * Obtiene la lista de empleados del departamento.
     *
     * @return La lista de empleados
     */
    public List<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * Establece la lista de empleados del departamento.
     *
     * @param empleados La nueva lista de empleados
     */
    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    //metodos

    /**
     * Agrega un empleado al departamento.
     *
     * @param empleado El empleado a agregar
     */
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    /**
     * Calcula la nómina total del departamento sumando los salarios de todos los empleados activos .
     *
     * @return El total de la nómina del departamento
     */
    public double calcularNominaDepartamento() {
        double total = 0;

        for (Empleado e : empleados) {
            if (e.isActivo()) {
                total += e.calcularSalario();
            }
        }

        return total;
    }


    /**
     * Devuelve la lista de IDs de empleados del departamento.
     */
    public List<Empleado> listarEmpleados() {
        return empleados;
    }

}
