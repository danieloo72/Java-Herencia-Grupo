public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("445","Jose", 23,1000.0,2);
        Desarrollador desarrollador = new Desarrollador("646","Jaime", 40,2000.0,20,"Java", "Senior", 1);
        Manager manager = new Manager("787","Julio", 23,5000.0,5, 8);


        empleado.presentarse();
        empleado.calcularSalario();
        desarrollador.presentarse();
        desarrollador.calcularSalario();
        manager.presentarse();
        manager.calcularSalario();
    }
}