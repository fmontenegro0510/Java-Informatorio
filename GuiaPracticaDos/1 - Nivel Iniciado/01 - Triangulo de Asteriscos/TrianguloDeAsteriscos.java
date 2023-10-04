import java.util.Scanner;
/**
 * Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
 * triángulo de asteriscos en la consola. Usar bucles.
 */

public class TrianguloDeAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }
    }
}