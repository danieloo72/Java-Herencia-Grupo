public class Persona{


    private String dni;
    protected String nombre;
    private int fechaNacimiento;
    private int telefono;
    private String email;

    public Persona(String dni, String nombre, int edad, int telefono, int fechaNacimiento, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
    }

    private String getDni(){
        return dni;
    }


    private String getNombre(){
        return nombre;
    }


    private static int edad;

    public void calcularEdad(){
        edad=0;
        int fechaActual=2026;
        edad = fechaActual - fechaNacimiento;
        System.out.println("Edad: " + edad);
    }


    public void presentarse(){
        System.out.println("Hola, soy " + nombre + " con dni: " + dni + " y tengo " + edad + " años.");
    }

}