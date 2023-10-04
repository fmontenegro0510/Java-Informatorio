import java.util.Scanner;
import java.util.ArrayList;
/***
 * A mi me gustan los apres: Escribe un programa que imprima solo los N números 
 * pares, donde los N números son guardados en variables o constantes según 
 * corresponda.
*/

public class MeGustanLosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> pares = new ArrayList<Integer>();
        final int CANT_PARES = 5;
        
        while (pares.size() < CANT_PARES) {
            System.out.print("Introduce un número: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                pares.add(num);
            }
        }
        System.out.println("A mi me gustan los pares: " + pares);
        sc.close();        
    }
}
