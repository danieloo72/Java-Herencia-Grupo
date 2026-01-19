import java.util.Scanner;

public class Main {

    protected static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("=== SISTEMA DE GESTIÓN Y FICHAJE ===");
        System.out.println("1.CONTRATACIÓN" +
                "\n  1.1 Contratar empleado" +
                "\n  1.2 Asignar a departamento" +
                "\n  1.3 Ver contratos activos" +
                "\n" +
                "\n2. FICHAJE" +
                "\n  2.1 Registrar entrada" +
                "\n  2.2 Registrar salida" +
                "\n  2.3 Consultar mis fichajes" +
                "\n  2.4 Reporte mensual de horas" +
                "\n" +
                "\n3. NÓMINAS" +
                "\n  3.1 Calcular salario empleado" +
                "\n  3.2 Calcular nómina total" +
                "\n  3.3 Ver historial de pagos" +
                "\n" +
                "\n4. PROYECTOS" +
                "\n  4.1 Asignar a proyecto" +
                "\n  4.2 Registrar horas proyecto" +
                "\n  4.3 Ver productividad" +
                "\n" +
                "\n5. INFORMES" +
                "\n  5.1 Empleados por departamento" +
                "\n  5.2 Asistencia mensual" +
                "\n  5.3 Horas extras aprobadas" +
                "\n  5.4 Proyectos activos" +
                "\n" +
                "\n6. SALIR");


            int opcion = sc.nextInt();
            System.out.print("Elije una opción: ");

            switch (opcion) {
                case 1.1:
                    registrarFichaje();
                    break;
                case 1.2:
                    ();
                    break;
                case 1.3:

                    break;
                case 2.1:
                    registrarEntrada();
                    break;
                case 2.2:
                    registrarSalida();
                    break;
                case 2.3:
                    obtenerFichajesDelDia();
                    break;
                case 2.4:
                    calcularHorasMensuales();
                    break;
                case 3.1:
                    calcularSalario();
                    break;
                case 3.2:
                    calcularNominaDepartamento();
                    break;
                case 3.3:
                    break;
                case 4.1:
                    asignarDesarrollador();
                    break;
                case 4.2:
                    registrarHoras();
                    break;
                case 4.3:
                    calcularProductividad();
                    break;
                case 5.1:
                    getPersonasACargo();
                    break;
                case 5.2:
                    registrarAsistencia();
                    break;
                case 5.3:
                    aprobarHorasExtra();
                    break;
                case 5.4:
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Está opción no es válida.");
                    break;
            }
    }
}