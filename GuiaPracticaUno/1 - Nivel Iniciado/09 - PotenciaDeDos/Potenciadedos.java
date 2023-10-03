import java.util.Scanner;
/**
 * Potencia de 2 y 3: Se le solicita que guarde en un espacio de memoria un número y 
 * luego haga la potencia de ese número al cuadrado y al cubo.
 */

public class PotenciaDeDos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Solicitar al usuario la base
    System.out.println("Ingrese un número entero, para la base");
    double numero = sc.nextDouble();
    
    // Calcular la potencia al cuadrado y al cubo
    double cuadrado = Math.pow(numero, 2);
    double cubo = Math.pow(numero, 3);
    
    // Mostrar los resultados
    System.out.println("El número al cuadrado es: " + cuadrado);
    System.out.println("El número al cubo es: " + cubo);
    
    sc.close();
  }
}