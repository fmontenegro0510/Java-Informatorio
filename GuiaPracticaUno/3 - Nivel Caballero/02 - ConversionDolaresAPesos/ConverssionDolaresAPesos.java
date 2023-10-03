import java.util.Scanner;
/***
 * Conversión de dólares a pesos: Escribir un programa en Java que solicite al
 * usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una
 * tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el 
 * usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos.
 */

public class ConversionDolaresAPesos {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final double COEFICIENTE_DOLAR_A_PESO = 20;
        System.out.print("Ingresa el valor en dólares: ");
        double dolares = sc.nextDouble();
        double pesos = dolares * COEFICIENTE_DOLAR_A_PESO;
        System.out.println("El valor en pesos es: " + pesos);
        sc.close();
    }
}