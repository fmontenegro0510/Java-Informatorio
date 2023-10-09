import java.util.Scanner;

/***
 * Mis amigos y su edad: Guarda en variables el nombre de N cantidad de amigos,
 * itere sobre esa cantidad luego muestre el nombre de cada amigo si y sólo si este
 * amigo es mayor de edad, en caso de ser menor de edad imprima un mensaje 
 * diciendole a ese amigo porque no lo muestra por pantalla.
 */

public class MisAmigosySuEdad {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de amigos: ");
        int cantidadAmigos = scanner.nextInt();
        String[] amigosMayores = new String[cantidadAmigos];
        String[] amigosMenores = new String[cantidadAmigos];
        int mayoresIndex = 0;
        int menoresIndex = 0;

     for (int i = 0; i < cantidadAmigos; i++) {
            System.out.print("Nombre del amigo " + (i + 1) + ": ");
            String nombre = scanner.next();

            System.out.print("Edad de " + nombre + ": ");
            int edad = scanner.nextInt();

            if (edad >= 18) {
                amigosMayores[mayoresIndex++] = nombre;
            } else {
                amigosMenores[menoresIndex++] = nombre;
            }
        }

        System.out.println("\nAmigos mayores de 18 años:");
        for (int i = 0; i < mayoresIndex; i++) {
            System.out.println(amigosMayores[i]);
        }

        System.out.println("\nAmigos menores de 18 años:");
        for (int i = 0; i < menoresIndex; i++) {
            System.out.println(amigosMenores[i]);
        }

        scanner.close();
    }
}



