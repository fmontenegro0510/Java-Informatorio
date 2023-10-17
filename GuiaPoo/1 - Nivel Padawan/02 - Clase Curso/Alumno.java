/***
 * Crear una clase alumno, el cual tenga atributos como :
 * a. Nombre
 * b. Apellido 
 * c. Fecha de nacimiento 
 * d. Edad
 */

public class Alumno {
    
    //Definimos los atributos como privados
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private int edad;

    //Creamos el constructor
    public Alumno(String nombre, String apellido, String fechaNacimiento, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    //Definimos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    //Setter para el atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Getter para el atributo apellido
    public String getApellido() {
        return apellido;
    }

    //Setter para el atributo apellido
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Getter para el atributo fechaNacimiento
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    //Setter para el atributo fechaNacimiento
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //Getter para el atributo edad
    public int getEdad() {
        return edad;
    }

    //Setter para el atributo edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodo para mostrar los datos del alumno
    // Metodo para mostrar los datos del alumno
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Edad: " + edad);
    }
    
    //metodo toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                "Edad: " + edad;
    }

}