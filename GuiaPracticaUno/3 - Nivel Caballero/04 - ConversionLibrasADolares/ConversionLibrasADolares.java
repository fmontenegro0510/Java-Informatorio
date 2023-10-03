import java.util.Scanner;
/** 
 * Conversión de libras esterlinas a dólares: Escribir un programa en Java que
 * solicite al usuario una cantidad en libras esterlinas y muestre el equivalente en 
 * dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 
 * libra esterlina = 1.40 dólares, y el usuario ingresa 50 libras esterlinas, el programa 
 * deberá mostrar 70 dólares.
*/
public class ConversionLibrasADolares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final double COEFICIENTE_LIBRA_A_DOLAR = 1.40;
        System.out.print("Ingrese el valor en libras esterlinas: ");
        double libras = sc.nextDouble();
        double dolares = libras * COEFICIENTE_LIBRA_A_DOLAR;
        System.out.println("El valor en dolares es: " + dolares);
        sc.close();
    }
}