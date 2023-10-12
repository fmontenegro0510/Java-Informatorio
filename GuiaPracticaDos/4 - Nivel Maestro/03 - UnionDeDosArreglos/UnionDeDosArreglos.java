import java.util.Scanner;

/****
 * Unión de dos arreglos : Dado dos arreglos con cualquier tipo de valor (Ya sea
 * String, Char, Integer, etc), realice la unión de ambos arreglos en un tercer arreglo.
 */

public class UnionDeDosArreglos {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la longitud del primer arreglo: ");
        int tamArr1 = sc.nextInt();
        System.out.print("Introduce la longitud del segundo arreglo: ");
        int tamArr2 = sc.nextInt();
        
        int arrInt1[] = new int[tamArr1];
        int arrInt2[] = new int[tamArr2];
        
        for (int i = 0; i < tamArr1; i++){
            arrInt1[i] = (int)(Math.random() * 100);
            System.out.print(arrInt1[i] + " ");
        }
        
        System.out.println();
        for (int i = 0; i < tamArr2; i++){
            arrInt2[i] = (int)(Math.random() * 100);
            System.out.print(arrInt2[i] + " ");
        }
        
        System.out.println();
        int arrInt3[] = new int[tamArr1 + tamArr2];
        for (int i = 0; i < arrInt1.length; i++){
            arrInt3[i] = arrInt1[i];        
        }
        for (int i = 0; i < arrInt2.length; i++){
            arrInt3[arrInt1.length + i] = arrInt2[i];        
        }
        
        System.out.println("El nuevo arreglo es: ");
        for (int i = 0; i < arrInt3.length; i++){
            System.out.print(arrInt3[i] + " ");
        }
                
        sc.close();
    }
}