import java.util.Scanner;
/***
 * Inversión de un arreglo: Dado un arreglo de enteros inviertalo, de tal manera que
 * el primer elemento ahora sea el último y así sucesivamente.
 */

public class InversionDeUnArreglo {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de elementos del arreglo: ");
        int num = sc.nextInt();
        int arrInt[] = new int[num];

        for (int i = 0; i < num; i++){
            arrInt[i] = (int)(Math.random() * 100);
        }

        System.out.println("El arreglo original es: ");
        for (int i = 0; i < num; i++){
            System.out.print(arrInt[i] + " ");
        }

        int invertedArrInt[] = new int[num];
        for (int i = 0; i < num; i++){
            invertedArrInt[num - i - 1] = arrInt[i];
        }
        
        System.out.println("\nEl arreglo invertido es: ");
        for (int i = 0; i < num; i++){
            System.out.print(invertedArrInt[i] + " ");
        }

        sc.close();
    }
}