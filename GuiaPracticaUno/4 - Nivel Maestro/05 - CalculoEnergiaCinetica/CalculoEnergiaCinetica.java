import java.util.Scanner;
/***
 * Escribir un programa en Java que calcule la energía cinética de un objeto 
 * en movimiento, dados su masa y su velocidad. 
 * Utilizar la fórmula: E = (1/2) * m * v^2, 
 * donde E es la energía cinética, m es la masa del objeto y v es la velocidad.
 * Muestre el resultado por pantalla.
 * https://www.ferrovial.com/es/stem/energia-cinetica/#:~:text=Teniendo%20en%20cuenta%20estos%20conceptos,de%20la%20velocidad%20de%20movimiento.
 */

public class CalculoEnergiaCinetica {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la masa del objeto: ");
        double masa = sc.nextDouble();
        System.out.print("Ingrese la velocidad del objeto: ");
        double velocidad = sc.nextDouble();
        double energia = (1/2) * masa * Math.pow(velocidad, 2);
        System.out.println("La energía cinética del objeto es: " + energia);
        sc.close();
    }
}