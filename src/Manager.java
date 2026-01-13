public class Manager extends Empleado {
    protected int personasACargo;

    public Manager(String dni,String nombre, int edad, double salarioBase, int antiguedadAnios,int personasACargo){
        super(dni, nombre, edad, salarioBase,antiguedadAnios);
        this.personasACargo = personasACargo;

    }

    public int getPersonasACargo() {
        return personasACargo;
    }

    public void setPersonasACargo(int personasACargo) {
        this.personasACargo = personasACargo;
    }

    public Double calcularSalario() {
        return super.calcularSalario();
    }
}