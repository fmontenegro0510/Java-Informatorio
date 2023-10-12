import java.util.Scanner;

/****
 * Mis amigos, su edad y el mayor : Guarda en un arreglo una N cantidad de amigos,
 * itere sobre esa cantidad mostrando el nombre de cada amigo si y sólo si este amigo 
 * es mayor de edad, en caso de ser menor de edad imprima un mensaje diciendole a 
 * ese amigo porque no lo muestra por pantalla. Pero a su vez, encuentre al amigo que 
 * mayor edad tenga, muestre un mensaje por pantalla del nombre de esa persona y su 
 * edad.
 */

public class MisAmigosSuEdad {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de amigos: ");
        int cantidadAmigos = sc.nextInt();
        String amigosMayores[] = new String[cantidadAmigos];
        String amigosMenores[] = new String[cantidadAmigos];
        int indiceMayores=0;
        int indiceMenores=0;

        for (int i = 0; i < cantidadAmigos; i++){
            System.out.print("Introduce el nombre del amigo " + (i+1) + ": ");
            String nombre = sc.next();
            System.out.print("Edad de " + nombre + ": ");
            int edad = sc.nextInt();
                if (edad >= 18){
                    amigosMayores[indiceMayores]=nombre;
                    indiceMayores++;
                } else {
                    amigosMenores[indiceMenores]=nombre;
                    indiceMenores++;    
                }                
            }
        

        System.out.println("\nAmigos mayores de 18:");        
        for (int i = 0; i < indiceMayores; i++){
            System.out.println(amigosMayores[i]);
        }

        System.out.println("\nAmigos menores de 18:");
        for (int i = 0; i < indiceMenores; i++){
            System.out.println(amigosMenores[i]);
        }

        sc.close();
    }

}
