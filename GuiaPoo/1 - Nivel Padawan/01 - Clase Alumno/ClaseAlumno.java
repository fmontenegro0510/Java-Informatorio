import Alumno;

//cree 3 objetos de la clase e imprima por pantalla el nombre, apellido y edad de cada uno.


public class ClaseAlumno{

    public static void main(String[] args){

        Alumno a = new Alumno("Juan", "Perez", "01/01/2000", 20);
        System.out.println(a.toString());

        Alumno b = new Alumno("Pedro", "Perez", "01/01/2000", 20);
        System.out.println(b.toString());

        Alumno c = new Alumno("Maria", "Perez", "01/01/2000", 20);
        System.out.println(c.toString());
        
    }



}