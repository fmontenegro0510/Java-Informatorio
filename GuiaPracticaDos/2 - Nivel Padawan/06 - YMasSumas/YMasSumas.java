import java.util.Scanner;

/***
 * Y mas… sumas! : Realizar un programa donde se guarde un número entero en una
 * variable y que imprima por pantalla el resultado de la suma de todos los números
 * enteros desde 1 hasta ese número.
 */

public class YMasSumas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println("La suma de los números desde 1 hasta " + num + " es: " + sum);
        sc.close();

    }
}