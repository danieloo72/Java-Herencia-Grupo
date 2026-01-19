import java.time.LocalDate;

public class Manager extends Empleado {
    protected int personasACargo;
    protected String titulo;
    protected double presupuestoGestionado;
    protected int reunionesSemanales;





    public Manager(String dni,String nombre, int edad, double salarioBase, int antiguedadAnios,int personasACargo, String idEmpleado, LocalDate fechaContrartacion, String departamento, double jornadaHoraria, boolean activo, String titulo, double presupuesto, int reunionesSemanales){
        super(dni, nombre, edad, salarioBase,antiguedadAnios, idEmpleado, fechaContrartacion, departamento, jornadaHoraria, activo);
        this.personasACargo = personasACargo;
        this.titulo = titulo;
        this.presupuestoGestionado = presupuesto;
        this.reunionesSemanales = reunionesSemanales;

    }

    public int getPersonasACargo() {
        return personasACargo;
    }

    public void setPersonasACargo(int personasACargo) {
        this.personasACargo = personasACargo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPresupuestoGestionado() {
        return presupuestoGestionado;
    }

    public void setPresupuestoGestionado(double presupuestoGestionado) {
        this.presupuestoGestionado = presupuestoGestionado;
    }

    public int getReunionesSemanales() {
        return reunionesSemanales;
    }

    public void setReunionesSemanales(int reunionesSemanales) {
        this.reunionesSemanales = reunionesSemanales;
    }

    public Double calcularSalario() {
        int plus = 250 * personasACargo;
        double bonus = presupuestoGestionado * 0.2;

        return super.calcularSalario();
    }

    public void aprobarHorasExtra(String idDesarrollador, double horas) {
        if (jornadaHoraria() > 8) {
            System.out.println("Horas extras aprobadas.");
        } else {
            System.out.println("No cumple los requisitos para hacer horas extras.");
        }
    }
}