import java.util.Scanner;
/***
 * Escribir un programa en Java que calcule la velocidad final de un objeto 
 * en caída libre, dados su velocidad inicial, la aceleración de la gravedad 
 * y el tiempo transcurrido. Utilizar la fórmula: v_f = v_i + g * t, 
 * donde v_f es la velocidad final, v_i es la velocidad inicial, 
 * g es la aceleración de la gravedad y t es el tiempo transcurrido.
 * https://www.educaplus.org/movi/4_2caidalibre.html
 */

public class CalculoVelocidadFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la velocidad inicial: ");
        double velocidadInicial = sc.nextDouble();
        System.out.print("Ingresa la aceleracion de la gravedad: ");
        double aceleracionGravedad = sc.nextDouble();
        System.out.print("Ingresa el tiempo transcurrido: ");
        double tiempoTranscurrido = sc.nextDouble();
        double velocidadFinal = velocidadInicial + aceleracionGravedad * tiempoTranscurrido;
        System.out.println("La velocidad final es: " + velocidadFinal);
        sc.close();
    }
}