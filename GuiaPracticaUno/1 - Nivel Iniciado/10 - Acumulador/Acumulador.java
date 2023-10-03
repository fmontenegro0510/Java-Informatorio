/**
 * Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación 
 * de quince multiplicaciones entre dos números enteros divididos por el número de la 
 * multiplicación. 
*/
import java.util.Scanner;

public class Acumulador{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int cantidad=15;
        
        System.out.print("Ingrese el primer número");
        double numero1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número");
        double numero2 = sc.nextDouble();
        
        int resultado=0;
        
        for (int i=0; i<cantidad ; i++){
            resultado = (numero1 * numero2)/i;        
        }
        
        System.out.print("El resultado es:" resultado);
    }
}
