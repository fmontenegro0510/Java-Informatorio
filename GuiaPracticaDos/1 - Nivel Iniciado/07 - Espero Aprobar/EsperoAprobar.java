import java.util.Scanner;

/***
 *  Espero aprobar : Escribe un programa que imprima un título para el programa,
 * luego un listado (Seguido, NO con saltos de línea) de las N notas de mis exámenes, 
 * donde los N números son guardados en variables o constantes según corresponda. 
 * Luego obtenga el promedio de esas calificaciones y me diga si aprobé o no y con 
 * cuanto
 */

public class MeGustanLosPares {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del Alumno: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese la cantidad de notas del alumno: " + nombre);
        int cantidadNotas = sc.nextInt();
        
        Integer[] notasSemestre = new Integer[cantidadNotas];
        double promedio = 0;

        for (int i = 0; i < cantidadNotas; i++){
            System.out.print("Introduce la nota " + i + ": ");
            notasSemestre[i] = sc.nextInt();
            promedio += notasSemestre[i];
        }
        System.out.println("El promedio de las notas del alumno " + nombre + " es: " + promedio / cantidadNotas);
        sc.close();
    }
}