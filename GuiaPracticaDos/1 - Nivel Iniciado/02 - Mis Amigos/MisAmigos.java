import java.util.Scanner;
/**
 * Mis amigos : Guarde en variables el nombre de N cantidad de amigos, itere sobre
 * esa cantidad mostrando el nombre de cada amigo.
 */
public class MisAmigos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de amigos: ");
        String[] amigos = new String[sc.nextInt()];
        for (int i = 0; i < amigos.length; i++){
            System.out.print("Introduce el nombre del amigo " + (i+1) + ": ");
            amigos[i] = sc.next();            
        }
        for (int i = 0; i < amigos.length; i++){
            System.out.println("Amigo " + (i+1) + ": " + amigos[i]);
        }
        sc.close();
    }    
}