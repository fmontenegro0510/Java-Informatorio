import java.util.Scanner;
/***
 * Suma del rango de números : Escribir un programa que encuentre la suma de los
 * números impares en un rango de números enteros guardados en una variable.
 */
public class SumaRangos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el último número: ");
        int num2 = sc.nextInt();
        int sum = 0;
        if  (num1 > num2){
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }else if (num1 == num2){
            System.out.println("La suma de los números impares entre " + num1 + " y " + num2 + " es: 0");
            sc.close();
            return;
        }
        for (int i = num1; i <= num2; i++){
            if (i % 2 != 0){
                sum += i;
            }
        }
        System.out.println("La suma de los números impares entre " + num1 + " y " + num2 + " es: " + sum);
        sc.close();
    }
}
