import java.util.Scanner;

/***
 * Restalos, prohibido menores a ceros : Cree dos arreglos con números decimales,
 * luego recortarlos y reste ambos arreglos el resultado aplicarlos a un tercer arreglo, si
 * la resta da negativo entonces guarde 0.
 */


public class Restalo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño del arreglo: ");
        int tamArr = sc.nextInt();
        float arrDecimalesUno[] = new float[tamArr];
        float arrDecimalesDos[] = new float[tamArr];

        System.out.print("Agregamos valores al primer arreglo:");
        for (int i = 0; i < tamArr; i++){
            System.out.print("Introduce un número para la posición [" + i + "]: ");
            arrDecimalesUno[i] = sc.nextFloat();
        }

        System.out.print("Agregamos valores al segundo arreglo:");
        for (int i = 0; i < tamArr; i++){
            System.out.print("Introduce un número para la posición [" + i + "]: ");
            arrDecimalesDos[i] = sc.nextFloat();
        }

        //Recorro el arreglo uno y recorto el valor decimal de cada posicion
        int nuevoArrayIntUno[] = new int[tamArr];
        for (int i = 0; i < tamArr; i++){
            nuevoArrayIntUno[i] = (int) arrDecimalesUno[i];
        }

        //Recorro el arreglo dos y recorto el valor decimal de cada posicion
        int nuevoArrayIntDos[] = new int[tamArr];
        for (int i = 0; i < tamArr; i++){
            nuevoArrayIntDos[i] = (int) arrDecimalesDos[i];
        }

        //Lo muestro por pantalla
        int tercerArreglo[] = new int[tamArr];
        for (int i = 0; i < tamArr; i++){
            if(nuevoArrayIntUno[i] - nuevoArrayIntDos[i] < 0){
                tercerArreglo[i] = 0;
            }else{
                tercerArreglo[i] = (nuevoArrayIntUno[i] - nuevoArrayIntDos[i]);
            }
        }

        //Lo muestro por pantalla
        System.out.println("-----------------------Mostramos el arreglo uno-----------------------");
        for (int i = 0; i < tamArr; i++){
            System.out.println(nuevoArrayIntUno[i]);
        }

        //Lo muestro por pantalla
        System.out.println("-----------------------Mostramos el arreglo dos-----------------------");
        for (int i = 0; i < tamArr; i++){
            System.out.println(nuevoArrayIntDos[i]);
        }

        //Lo muestro por pantalla
        System.out.println("-----------------------Mostramos el tercer arreglo-----------------------");
        for (int i = 0; i < tamArr; i++){
            System.out.println(tercerArreglo[i]);
        }

        sc.close();
        
    }
}
