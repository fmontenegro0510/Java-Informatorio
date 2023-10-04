import java.util.Scanner;

/***
 * La suma de los primeros: Realizar un programa que calcule la suma de los 
 * primeros N números naturales, donde N es un número entero guardado en memoria.
 */

public class SumaDeLosPrimeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int cantNumeros = sc.nextInt();
        int sum = 0;
        Integer[] numeros = new Integer[cantNumeros];
        for (int i = 0; i < cantNumeros; i++){
            System.out.print("Introduce un número: ");
            numeros[i] = sc.nextInt();
            sum += numeros[i];            
        }
        for (int i = 0; i < cantNumeros; i++){
            System.out.println("En la posición " + i + " se encuentra el número " + numeros[i]);
        }
        System.out.println("La suma de los numeros (" + cantNumeros + ") es: " + sum);
        sc.close();
    }
}