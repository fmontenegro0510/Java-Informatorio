import java.util.Scanner;

/***
 * Convierto lo que me da la gana parte 2: Demuestre cómo convertir un bucle
 * WHILE en un bucle FOR.
 * https://www.javamexico.org/foros/comunidad/while_y_conversion_de_estructura
 */

public class ConviertoLoQueMeDaLaGana {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        //utilizando un ciclo for
        System.out.println("Decrementando el numero " + num + "  utilizando un ciclo for");   
        for (int i = num; i > 0; i--){
            System.out.println(i);
        }
        //utilizando un ciclo while
        System.out.println("Decrementando el numero " + num + "  utilizando un ciclo while");
        int i = num;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
        sc.close();
    }
}