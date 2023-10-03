import java.util.Scanner;
/**
 * Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en
 * otro espacio de memoria realice la conversión de esas libras a kilogramos. 
 * Utilice una constante de los valores que no van a cambiar en esta conversión. 
 * Muestre el resultado por pantalla
*/

public class ConversionKilogramos{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu peso en libras: ");
        double libras = sc.nextDouble();
        double kilogramos = libras * 0.45;
        System.out.println("Tu peso en kilogramos es: " + kilogramos);
        sc.close();
    }    


}
