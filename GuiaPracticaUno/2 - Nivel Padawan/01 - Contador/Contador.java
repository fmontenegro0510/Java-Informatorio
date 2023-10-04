import java.util.Scanner;
/**
 * Contador: Se le solicita que guarde un número en un espacio de memoria e
    incremente dicho número 20 veces sin usar asignación. ¿Que operador podría usar
    para hacerlo?
    El operador que se puede utilizar es el operador de incremento. ++

*/
public class Contador{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        System.out.print("Introduce un número");
        int num = sc.nextInt();

        for (int i = 0; i < 20; i++){
            num++;
            System.out.println(num);
        }
        System.out.println("El número icrementado es: " + num);
        sc.close();
    }

}