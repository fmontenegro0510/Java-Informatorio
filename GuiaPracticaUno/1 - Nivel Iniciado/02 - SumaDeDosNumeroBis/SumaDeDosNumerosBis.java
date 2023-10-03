import java.util.Scanner;
    /**
     * Se les solicita que guarden dos números enteros y los sumen. 
     * El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que
     * indique si se trata de un número par o impar.
     *
     * @param  args  the command line arguments
     * @return       no return value
     */
public class SumaDeDosNumerosBis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro numero");
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los dos numeros es: " + suma);
        if (suma % 2 == 0) {
            System.out.println("El resultado es par");
        } else {
            System.out.println("El resultado es impar");
        }
    }
}