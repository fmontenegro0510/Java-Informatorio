import java.util.Scanner;
/***
 * Suma de números : Realizar un programa que guarde un número en memoria y 
 * determine si es par o impar.
*/
public class SumaDeEnteros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("El número " + num + " es par");
        }else{
            System.out.println("El número " + num + " es impar");
        }
        sc.close();
    }

}
