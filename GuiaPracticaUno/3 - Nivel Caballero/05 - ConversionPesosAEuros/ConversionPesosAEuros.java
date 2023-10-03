import java.util.Scanner;
/** 
 * Escribir un programa en Java que solicite al usuario una cantidad 
 * en pesos y muestre el equivalente en euros, utilizando una tasa de 
 * cambio fija. Por ejemplo, si la tasa de cambio es de 
 * 1 euro = 20 pesos, y el usuario 
 * ingresa 5000 pesos, el programa deberá mostrar 250 euros
*/

public class ConversionPesosAEuros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final double COEFICIENTE_PESO_A_EURO = 20;
        System.out.print("Ingresa el valor en pesos: ");
        double pesos = sc.nextDouble();
        double euros = pesos * COEFICIENTE_PESO_A_EURO;
        System.out.println("El valor en euros es: " + euros);
        sc.close();
    }
}