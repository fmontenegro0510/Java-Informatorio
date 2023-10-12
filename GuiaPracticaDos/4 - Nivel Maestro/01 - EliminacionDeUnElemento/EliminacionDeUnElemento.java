import java.util.Scanner;
/***
 * Eliminación de un elemento: Dado un arreglo con valores enteros, realice la
 * búsqueda de ese entero y si lo encuentra eliminarlo, si no lo encuentra informe por
 * pantalla.
 */

public class EliminacionDeUnElemento {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la longitud del arreglo: ");
        int tamArr = sc.nextInt();
        int arrInt[] = new int[tamArr];
        for (int i = 0; i < tamArr; i++){
            arrInt[i] = (int)(Math.random() * 100);
            System.out.print(arrInt[i] + " ");
        }
        System.out.println();
        System.out.print("Introduce el numero a eliminar: ");
        int num = sc.nextInt();
        boolean f = false;
        int cantCoincidencias = 0;
        for (int i = 0; i < tamArr; i++){
            if (arrInt[i] == num){
                f = true;
                System.out.println("El numero " + num + " se encuentra en la posicion " + i);
                cantCoincidencias++;
            }
        }
        
        int nuevoArrInt[] = new int[tamArr - cantCoincidencias];
        
        if (!f ){
            System.out.println("El numero " + num + " no se encuentra en el arreglo");
        } else {
            for (int i = 0, j = 0; i < tamArr; i++){
                if (arrInt[i] != num){
                    nuevoArrInt[j] = arrInt[i];
                    j++;
                }
            }           
        }

        System.out.println("El nuevo arreglo es: ");
        for (int i = 0; i < nuevoArrInt.length; i++){
            System.out.print(nuevoArrInt[i] + " ");
        }

            

        sc.close();
    }
}