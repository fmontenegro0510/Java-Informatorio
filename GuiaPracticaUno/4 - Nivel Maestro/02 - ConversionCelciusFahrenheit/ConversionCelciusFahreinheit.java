import java.util.Scanner;
/**
 * Conversión de grados Celsius a grados Fahrenheit : Escribir un programa en
 * Java que convierta una temperatura en grados Celsius a grados Fahrenheit.
 * https://www.saberespractico.com/ciencia/como-pasar-de-grados-celsius-a-fahrenheit-y-viceversa/
 */

public class ConversionCelciusFahreinheit {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el valor en grados Celsius: ");
        double gradosCelsius = sc.nextDouble();
        double gradosFahrenheit = (gradosCelsius * 1,8) + 32;
        System.out.println("El valor en grados Fahrenheit es: " + gradosFahrenheit);
        sc.close();
    }

}
