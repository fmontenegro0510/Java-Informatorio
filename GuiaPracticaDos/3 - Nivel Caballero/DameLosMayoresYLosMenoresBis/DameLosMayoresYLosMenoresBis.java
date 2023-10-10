/***
 * Dame los mayores y los menores : Realizar un programa donde se guarden 5 en
 * un arreglo. Luego, el programa debe mostrar en pantalla el valor máximo y mínimo 
 * de los números ingresados.
 */

public class DameLosMayoresYLosMenoresBis {
    
    public static void main(String[] args) {
        int arr[] = new int[4];
        
        int numMax = 0;
        int numMin = 101;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.print(arr[i] + " ");
            
            if (arr[i] > numMax) {
                numMax = arr[i];
            }else if (arr[i] < numMin) {
                numMin = arr[i];
            }
        }
        
        System.out.println("");
        System.out.println("El numero mayor es: " + numMax);
        System.out.println("El numero menor es: " + numMin);
        
    }
}