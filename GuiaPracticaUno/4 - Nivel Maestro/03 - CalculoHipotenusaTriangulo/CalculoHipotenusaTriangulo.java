import java.util.Scanner;
/**
 * Cálculo de la hipotenusa de un triángulo:
 * Escribir un programa en Java que calcule la hipotenusa de un triángulo rectángulo,
 * dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la
 * hipotenusa, a y b son los catetos.
 * https://www.teoremadepitagorasonline.com/
 */

public class CalculoHipotenusaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        // Solicitar al usuario los catetos
        System.out.print("Ingresa el valor del cateto a: ");
        double a = sc.nextDouble();
        System.out.print("Ingresa el valor del cateto b: ");
        double b = sc.nextDouble();
        // Calcular la hipotenusa
        double h = Math.sqrt(a * a + b * b);
        // Mostrar la hipotenusa
        System.out.println("La hipotenusa del triángulo es: " + h);
        sc.close();
    }
}