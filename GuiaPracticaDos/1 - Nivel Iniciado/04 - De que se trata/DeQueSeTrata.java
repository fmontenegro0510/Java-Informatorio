import java.util.Scanner;
/***
 * De que se trata esto? : Realizar un programa que guarde un número en memoria y
 * determine si es positivo, negativo o cero.

*/
public class DeQueSeTrata {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("El número " + num + " es positivo");
        } else if (num < 0) {
            System.out.println("El número " + num + " es negativo");
        } else {
            System.out.println("El número " + num + " es cero");
        }
        sc.close();    
    }

}