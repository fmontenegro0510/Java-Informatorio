import java.util.Scanner;

/***
 * Ordenarlo todo : Realizar un programa que guarde cierta cantidad de números con
 * punto decimal en un arreglo. Luego, el programa debe ordenar los números de
 * forma ascendente y mostrarlos en pantalla.
 * https://ayudasprogramacionweb.blogspot.com/2012/12/ordenar-cualquier-array-de-numeros-java.html
 */

public class OrdenarloTodo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de números a guardar en el arreglo: ");
        int tamArr = sc.nextInt();
        float arrDecimales[] = new float[tamArr];

        for (int i = 0; i < tamArr; i++){
            System.out.print("Introduce un número: ");
            arrDecimales[i] = sc.nextFloat();
        }

        for (int i = 0; i < tamArr; i++){
            for (int j = i + 1; j < tamArr; j++){
                if (arrDecimales[i] > arrDecimales[j]){
                    float aux = arrDecimales[i];
                    arrDecimales[i] = arrDecimales[j];
                    arrDecimales[j] = aux;
                }
            }
        }
        //mostrar el arreglo ordenado
        System.out.println("El arreglo ordenado es: ");
        for (int i = 0; i < tamArr; i++){
            System.out.println(arrDecimales[i]);
        }
        sc.close();
    }
}