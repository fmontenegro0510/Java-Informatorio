/***
 * Cree uno o más cursos y asigne a la lista de alumnos, objetos del ejercicio 1.
 */

import Alumno;
import Curso;

public class ClaseCurso {
    public static void main(String[] args) {
        //Creamos un objeto de la clase curso
        Curso c1 = new Curso("Java", true, "Java es un lenguaje de programación orientado a objetos");
        Curso c2 = new Curso("Python", true, "Python es un lenguaje de programación orientado a objetos");
        Curso c3 = new Curso("C++", true, "C++ es un lenguaje de programación orientado a objetos");

        //Creamos un objeto de la clase alumno
        Alumno a = new Alumno("Juan", "Perez", "12/12/1990", 20);
        Alumno b = new Alumno("Pedro", "Picapiedra", "30/09/1960", 63);
        Alumno c = new Alumno("Juan Maria", "Traverso", "28/12/1950", 72);
        Alumno d = new Alumno("Ayrton", "Sena", "21/03/1960", 63);
        Alumno e = new Alumno("Carlos", "Reutemann", "12/04/1942", 81);
        Alumno f = new Alumno("Marcos", "Di Palma", "10/12/1972", 51);

        //Asignamos a la lista de alumnos
        c1.agregarAlumno(a);
        c2.agregarAlumno(b);
        c3.agregarAlumno(c);
        c3.agregarAlumno(d);
        C2.agregarAlumno(e);
        C1.agregarAlumno(f);

        //Mostramos los datos del curso
        C1.mostrarAlumnos();
        C2.mostrarAlumnos();
        C3.mostrarAlumnos();
        
    }
}