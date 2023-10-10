import java.util.Scanner;

/****
 * Dame los mayores y los menores : Dado un arreglo con valores enteros, realice la
 * búsqueda de ese entero, si encontró el entero mostrarlo por pantalla sino muestre
 * por pantalla que no lo encontró.
 */
// No tiene nada q ver el nombre del problema

public class DameLosMayores {
    
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos elementos tiene el arreglo? ");
        int tamArr = sc.nextInt();

        int arrInt[] = new int[tamArr];

        for (int i = 0; i < tamArr; i++){
            arrInt[i] = (int)(Math.random() * 100);
            System.out.print(arrInt[i] + " ");

        }
        System.out.println("");
        System.out.print("Introduce un número a buscar en el arreglo ");
        int num = sc.nextInt();

        Boolean f = false;

        for (int i = 0; i < tamArr; i++){
            if (arrInt[i] == num){
                f = true;
                System.out.println("El número " + num + " se encuentra en la posicion " + i);
            }
        }
        
        if (!f) { 
            System.out.println("El número " + num + " no se encuentra en el arreglo");
        };
        
        sc.close();


    }

}


