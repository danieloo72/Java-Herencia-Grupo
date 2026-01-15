import java.util.ArrayList;
import java.util.List;


public class Desarrollador extends Empleado{

    /**
     * Atributos
     */

    private String lenguajePrincipal;
    private String nivel;
    private double horasExtra;

    /** Constructor
     * 
     * @param dni
     * @param nombre
     * @param edad
     * @param salarioBase
     * @param antiguedadAnios
     * @param lenguajePrincipal
     */
    public Desarrollador(String dni, String nombre, int edad, double salarioBase, int antiguedadAnios ,String lenguajePrincipal, String nivel, double horasExtra) {
        super(dni, nombre,edad,salarioBase,antiguedadAnios);
        this.lenguajePrincipal = lenguajePrincipal;
        this.nivel = nivel;
        this.horasExtra = horasExtra;

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

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }


    public double getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(double horasExtra) {
        this.horasExtra = horasExtra;
    }





    @Override
    public Double calcularSalario(){


        switch (nivel){
            case "Mid":
                salarioBase = salarioBase * 1.15 + horasExtra * 20;
                break;
            case "Senior":
                salarioBase = salarioBase * 1.30 + horasExtra * 20;
                break;
            default:
                salarioBase = salarioBase + horasExtra * 20;
                break;


        }


        System.out.println("Salario FINAL: " + salarioBase);

        return salarioBase;
    }


}