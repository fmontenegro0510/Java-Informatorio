import java.util.Scanner;
/***
 * Conversión de bitcoins a dólares: Escribir un programa 
 * en Java que solicite al usuario una cantidad en bitcoins 
 * y muestre el equivalente en dólares, utilizando una tasa 
 * de cambio fija. Por ejemplo, si la tasa de cambio es de 
 * 1 bitcoin = 50000 dólares, y el usuario ingresa 0.5 bitcoins, 
 * el programa deberá mostrar 25000 dólares.
 */

public class ConversionBitcoinsADolares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final double COEFICIENTE_BITCOIN_A_DOLAR = 50000;
        System.out.print("Ingresa el valor en bitcoins: ");
        double bitcoins = sc.nextDouble();
        double dolares = bitcoins * COEFICIENTE_BITCOIN_A_DOLAR;
        System.out.println("El valor en dólares es: " + dolares);
        sc.close();
    }

}

