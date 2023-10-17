/***
 * Crear una clase curso, el cual tenga atributos como :
 * a. Nombre
 * b. Si está habilitado o no 
 * c. Descripción 
 * d. Alumnos. 
 * Cree uno o más cursos y asigne a la lista de alumnos, objetos del ejercicio 1.
 * Luego imprima el nombre del curso, su descripción y luego los nombres de los
 * alumnos de dicho curso.
 */

public class Curso{

    //Definimos los atributos como privados
    private String nombre;
    private boolean habilitado;
    private String descripcion;
    private ArrayList<Alumno> alumnos;

    //Creamos el constructor
    public Curso(String nombre, boolean habilitado, String descripcion) {
        this.nombre = nombre;
        this.habilitado = habilitado;
        this.descripcion = descripcion;
        //incializamos el arraylist en vacio
        this.alumnos = new ArrayList<>();
    }

    //Definimos Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Agregar un alumno al arraylist de alumnos
    public void agregarAlumno(Alumno alumno){
        this.alumnos.add(alumno);        
    }

    //Eliminar un alumno del arraylist de alumnos
    public void eliminarAlumno(Alumno alumno) {
        this.alumnos.remove(alumno);
    }

    public void mostrarAlumnos(){
        System.out.println("Alumnos del curso: " + this.nombre);
        //mostramos los alumnos iterando el arraylist
        for (Alumno alumno : this.alumnos) {
            alumno.mostrarDatos();            
        }
    }

    public void eliminarAlumnoxNombre(String nombre){
        for (Alumno alumno : this.alumnos) {
            if(alumno.getNombre().equals(nombre)){
                this.alumnos.remove(alumno);
            }
        }
    }

    public void buscarAlumnoxNombre(String nombre){
        for (Alumno alumno : this.alumnos) {
            if(alumno.getNombre().equals(nombre)){
                alumno.mostrarDatos();
            }
        }
    }

    //Metodo para mostrar los datos del curso
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Habilitado: " + habilitado);
        //mostramos los alumnos iterando el arraylist
        System.out.println("Alumnos del curso: ");
        for (Alumno alumno : this.alumnos) {
            alumno.mostrarDatos();            
        }
    }    
}