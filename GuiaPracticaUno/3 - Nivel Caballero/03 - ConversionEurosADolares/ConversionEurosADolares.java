import java.util.Scanner;
/**
 * Conversión de euros a dólares: Escribir un programa en Java que solicite al
 * usuario una cantidad en euros y muestre el equivalente en dólares, utilizando una
 * tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y
 * el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares.
 */

public class ConversionEurosADolares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final double COEFICIENTE_EUROS_A_DOLAR = 1.20;
        System.out.print("Ingresa el valor en euros: ");
        double euros = sc.nextDouble();
        double dolares = euros * COEFICIENTE_EUROS_A_DOLAR;
        System.out.println("El valor en dólares es: " + dolares);
        sc.close();
    }

}