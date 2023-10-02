import java.util.Scanner;

public class NombreBebida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese el nombre de su última mascota
        System.out.print("Ingresa el nombre de tu última mascota: ");
        String nombreMascota = sc.nextLine();

        // Solicitar al usuario que ingrese el nombre de la última película vista
        System.out.print("Ingresa el nombre de la última película vista: ");
        String nombrePelicula = sc.nextLine();

        // Mostrar el nombre de la próxima bebida con los datos ingresados
        System.out.println("Nombre de la próxima bebida: " + nombreMascota + " " + nombrePelicula);

        sc.close();
    }
}