import java.util.Scanner;
/**
 * Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de
 * edad y los nombres de esas personas, luego saque su promedio e imprima por 
 * pantalla el nombre de la persona, su edad. Por último imprimir el promedio 
 * de sus edades.
 */
public class PromedioEdad{
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Tu nombre es " + nombre);
        System.out.println("Tu edad es " + edad);
        System.out.println("Tu promedio de edad es " + (edad/2));
        sc.close();
    }
}