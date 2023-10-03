import java.util.Scanner;
    /**
     * A function that takes user input for two numbers and prints their sum.
     * Una funcion que toma dos numeros que ingresa el usuario y imprime la suma de ambas
     * @param  args   command line arguments (not used)
     * @return        no return value
     */
public class SumaDeDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro numero");
        int num2 = sc.nextInt();
        System.out.println("La suma de los dos numeros es: " + (num1 + num2));
        sc.close();
    }
}