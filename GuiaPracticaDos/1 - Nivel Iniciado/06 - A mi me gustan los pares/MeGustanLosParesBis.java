import java.util.Scanner;

/***
 * A mi me gustan los apres: Escribe un programa que imprima solo los N números 
 * pares, donde los N números son guardados en variables o constantes según 
 * corresponda.
*/

public class MeGustanLosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int CANT_PARES = 5;
        Integer[] numeros = new Integer[CANT_PARES];
        
        while (numeros.length < CANT_PARES) {
            System.out.print("Introduce un número: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                numeros[numeros.length] = num;
            }
        }

        for (int i = 0; i < CANT_PARES; i++){
            System.out.println("En la posición " + i + " se encuentra el número " + numeros[i]);
        }
        sc.close();        
    }
}