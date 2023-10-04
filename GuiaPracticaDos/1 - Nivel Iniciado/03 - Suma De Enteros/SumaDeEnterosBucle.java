import java.util.Scanner;
/**
 * Suma de números : Realizar un programa que guarde un número en memoria y
 * determine si es par o impar.
 * En este caso particular vamos a hacer restas sucesivas para determinar si el resto
 * es cero o uno.
 */
public class SumaDeEnterosBucle {

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int num = sc.nextInt();
    int resto = num;
        while (resto != 1 && resto != 0){
            resto=resto-2;
        }
        if (resto == 1){
            System.out.println("El número " + num + " es impar");
        } else {
            System.out.println("El número " + num + " es par");
        }

        sc.close();
   }
}