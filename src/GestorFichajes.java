import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;


public class GestorFichajes {



    private Map<String, List<Fichaje>> fichajes;
    public GestorFichajes(){
        fichajes=new HashMap<>();


    }

    public void registrarEntrada(String idEmpleado){
        Fichaje nuevoFichaje1 = new Fichaje("1","1", LocalDateTime.of(2026, 1, 15, 10, 23, 30),
                LocalDateTime.of(2026, 1, 15, 21, 23, 30),"Entrada");


        fichajes.put(idEmpleado,new ArrayList<>());
        fichajes.get(idEmpleado).add(nuevoFichaje1);
        System.out.println("Fichaje registrado exitosamente" + fichajes);

    }
    public void registrarSalida(String idEmpleado){
        Fichaje nuevoFichaje1 = new Fichaje("1","1", LocalDateTime.of(2026, 1, 15, 10, 23, 30),
                LocalDateTime.of(2026, 1, 15, 21, 23, 30),"Salida");


        fichajes.put(idEmpleado,new ArrayList<>());
        fichajes.get(idEmpleado).add(nuevoFichaje1);
        System.out.println("Fichaje registrado exitosamente" + fichajes);

    }

    public List<Fichaje> obtenerFichajesDelDia(String idEmpleado, LocalDateTime fecha){
        List<Fichaje> listaEmpleado = fichajes.get(idEmpleado);
        if(listaEmpleado==null){
            return new ArrayList<>();
        }
          return listaEmpleado;
        }


        public double calcularHorasMensuales(String idEmpleado, int mes, int año){
        List<Fichaje> lista = fichajes.get(idEmpleado);
        if(lista==null){
            return 0;
        }
        double totalHoras= 0;
            LocalDateTime tiempoEntrada= null;

            lista.sort(Comparator.comparing(fichaje -> fichaje.getFechaHoraEntrada() != null ? fichaje.getFechaHoraEntrada() : fichaje.getFechaHoraSalida()));

            for(Fichaje fichaje: lista){
                boolean mismaFecha = fichaje.getFechaHoraEntrada() != null;
                boolean mismoMes = (fichaje.getFechaHoraEntrada().getMonthValue() == mes);
                boolean mismoAño = fichaje.getFechaHoraEntrada().getYear() == año;
                if(mismaFecha && mismoAño && mismoMes){
                    tiempoEntrada = fichaje.getFechaHoraEntrada();
                }else if(mismaFecha && tiempoEntrada != null){
                     Duration duracion = Duration.between(tiempoEntrada, fichaje.getFechaHoraSalida());
                     totalHoras += duracion.toMinutes()/60.0;
                     tiempoEntrada = null;
                }

                }
            return totalHoras;
            }


            public String registarAsistencia(String idEmpleado){
                List<Fichaje> lista = fichajes.get(idEmpleado);
                if (lista==null || lista.isEmpty()){
                    return "No hay registros para el empleado" + idEmpleado;
                }
                System.out.println("Reporte de asistencia para el empleado" + idEmpleado);

                for(Fichaje fichaje: lista){
                    System.out.println("ID: " + fichaje.getIdFichaje());
                    System.out.println("Tipo: " + fichaje.getTipo());
                    System.out.println("Hora: " + fichaje.getFechaHoraEntrada() != null ? fichaje.getFechaHoraEntrada() :  fichaje.getFechaHoraSalida() + "\n");

                }
                return lista.toString();
            }

    }






