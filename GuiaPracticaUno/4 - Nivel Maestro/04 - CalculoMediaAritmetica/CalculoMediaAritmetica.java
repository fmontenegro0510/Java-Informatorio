import java.util.Scanner;
/***
 * Escribir un programa en Java que calcule la media aritmética de un conjunto de
 * números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1, n2, ..., nk son 
 * los números y k es el número total de elementos. Utilicen variables y constantes 
 * según corresponda.
 * https://yosoytuprofe.20minutos.es/2019/04/25/media-aritmetica-estadistica/
 * 
 */

public class CalculoMediaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicitar al usuario los elementos
        System.out.print("Ingresa el número de elementos: ");
        int n = sc.nextInt();
        // Calcular la suma de los elementos
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingresa el ("+i+") número: ");
            double num = sc.nextDouble();
            sum += num;
        }
        // Calcular la media
        double media = sum / n;
        // Mostrar la media
        System.out.println("La media es: " + media);
        sc.close();      

    }
}