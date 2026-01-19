import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String idProyecto;
    private String nombre;
    private List<String>dessarrolladoresAsignados;
    private double horasEstimadas;
    private double horasReales;
    private String estado; //planificado, en curso o completado

    public Proyecto(String idProyecto, String nombre, List<String> dessarrolladoresAsignados, double horasEstimadas, double horasReales, String estado) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.dessarrolladoresAsignados = new ArrayList<>();
        this.horasEstimadas = horasEstimadas;
        this.horasReales = horasReales;
        this.estado = estado;
    }

    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getDessarrolladoresAsignados() {
        return dessarrolladoresAsignados;
    }

    public void setDessarrolladoresAsignados(List<String> dessarrolladoresAsignados) {
        this.dessarrolladoresAsignados = dessarrolladoresAsignados;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public double getHorasReales() {
        return horasReales;
    }

    public void setHorasReales(double horasReales) {
        this.horasReales = horasReales;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void asignarDesarrolladores(String idDessarrollador) {
        if (!dessarrolladoresAsignados.contains(idDessarrollador)) {
            System.out.println(idDessarrollador + " asignado al proyecto");
            dessarrolladoresAsignados.add(idDessarrollador);
        }else {
            System.out.println("este desarrollador ya estaba asignado al proyecto.");
        }
    }

    public void registrarHoras(String idDesarrollador, double horas) {
        if (dessarrolladoresAsignados.contains(idDesarrollador)) {
            this.horasReales += horas;
            if (estado.equals("PLANIFICADO")) {
                this.estado = "EN CURSO";
            }
        }
    }

    public Double calcularProductividad(){
        if (horasReales == 0){
            return 0.0;
        }else {
            System.out.print("Productividad entre las horas estimadas y las reales: ");
            return (horasEstimadas / horasReales)*100;
        }
    }
}