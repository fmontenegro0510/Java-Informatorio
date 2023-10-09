import java.util.Scanner;
/***
 * Convierto lo que me da la gana: 
 * Demuestre cómo convertir un bucle WHILE en un DO WHILE.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        int contador = num;
        //utilizando un ciclo while
        System.out.println("Decrementando el numero " + num + "  utilizando un ciclo while");
        while (contador != 0){
            System.out.println(contador);
            contador--;
        }
        //utilizando un ciclo do while
        System.out.println("Decrementando el numero " + num + "  utilizando un ciclo do while");
        contador = num;
        do{
            System.out.println(contador);
            contador--;
        }while (contador != 0);
        //Explico las diferencias
        System.out.print("La diferencia entre el ciclo while y el do while es que en el primero la secuencia se ejucuta hasta que la condición en el while sea falsa, y en el do while la secuencia se ejecuta y luego se evalual la condición, si esta es verdadera se vuelve a ejecutar la secuencia hasta que sea falsa.");
        sc.close();
    }
}