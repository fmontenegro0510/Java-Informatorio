import java.util.Scanner;
/***
 * Escribir un programa en Java que calcule la fuerza centrípeta necesaria 
 * para mantener un objeto en una trayectoria circular, dados su masa, la 
 * velocidad angular y el radio de la trayectoria. Utilizar la fórmula: F_c = m * v^2 / r, donde F_c es la
 * fuerza centrípeta, m es la masa del objeto, v es la velocidad angular y r es el radio
 * de la trayectoria.
 * Muestre el resultado por pantalla.
 * https://www.calcuvio.com/fuerza-centripeta
 * 
 */

public class CalculoFuerzaCentripeta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la masa del objeto: ");
        double masa = sc.nextDouble();
        System.out.print("Ingresa la velocidad angular: ");
        double velocidadAngular = sc.nextDouble();
        System.out.print("Ingresa el radio de la trayectoria: ");
        double radio = sc.nextDouble();
        double fuerzaCentripeta = masa * Math.pow(velocidadAngular, 2) / radio;
        System.out.println("La fuerza centrípeta es: " + fuerzaCentripeta);
        sc.close();
    }

}