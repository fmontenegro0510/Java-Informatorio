import java.util.Scanner;
/**
 * Obtener porcentaje : Dados dos números, uno real y el otro entero. Obtenga el
 * porcentaje que indique el segundo número del primer número.
 */

public class ObtenerPorcentaje {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer número (real): ");
        double num1 = sc.nextDouble();
        System.out.print("Ingresa el segundo número (entero): ");
        int num2 = sc.nextInt();
        System.out.println("El porcentaje de " + num1 + " es: " + (num1 * num2 / 100));
        sc.close();
    }

}