public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("445","Jose", 23,1000.0,2);
        Desarrollador desarrollador = new Desarrollador("445","Jose", 40,1000.0,15,"Java");
        Manager manager = new Manager("445","Jose", 23,1000.0,23, 8);

        empleado.presentarse();
        empleado.calcularSalario();
        desarrollador.presentarse();
        desarrollador.calcularSalario();
        manager.presentarse();
        manager.calcularSalario();
    }
}