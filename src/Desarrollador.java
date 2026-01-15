public class Desarrollador extends Empleado{

    /**
     * Atributos
     */

    private String lenguajePrincipal;

    /** Constructor
     * 
     * @param dni
     * @param nombre
     * @param edad
     * @param salarioBase
     * @param antiguedadAnios
     * @param lenguajePrincipal
     */
    public Desarrollador(String dni, String nombre, int edad, double salarioBase, int antiguedadAnios ,String lenguajePrincipal){
        super(dni, nombre,edad,salarioBase,antiguedadAnios);
        this.lenguajePrincipal = lenguajePrincipal;

    }

    /**  Getter and setters
     * 
     * @return lenguajePrincipal
     */
    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }


    /**
     * Metedodo heredado calcular salario
     * @return devolver salario
     */
    @Override
    public Double calcularSalario(){
        return super.calcularSalario();

    }


}