import java.util.Scanner;

public class CalculoDivisibilidad {
    /**
     * 
     * Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
     * sumen, determine si el primer número es divisible por el segundo número y muestre
     * el resultado
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números enteros
        System.out.print("Ingresa el primer número entero: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int numero2 = sc.nextInt();

        // Calcular la suma de los dos números
        int suma = numero1 + numero2;

        // Verificar si el primer número es divisible por el segundo
        boolean esDivisible = (numero1 % numero2 == 0);

        // Mostrar el resultado de la suma y si el primer número es divisible por el segundo
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        if (esDivisible) {  
            System.out.println(numero1 + " es divisible por " + numero2);
        } else {
            System.out.println(numero1 + " no es divisible por " + numero2);
        }

        sc.close();
    }
}
