import java.time.LocalDate;

class Empleado extends Persona{

    /**
     * Atributos
     */
    protected double salarioBase;
    protected int antiguedadAnios;
    public String fecha;

    /**
     * Constructor
     * @param dni
     * @param nombre
     * @param edad 
     * @param salarioBase
     * @param antiguedadAnios
     */
    public Empleado(String dni, String nombre, int edad, Double salarioBase, int antiguedadAnios){
        super(dni, nombre, edad);
        this.salarioBase = salarioBase;
        this.antiguedadAnios = antiguedadAnios;
    }

    /**
     * Metodo que calcula el salario anual de un empleado
     * @return el salario base del empleado
     */
    public Double calcularSalario() {
        double salarioAnual = salarioBase * 12;

        System.out.println("Salario base anual: " + salarioAnual);

        return salarioBase;
    }
}