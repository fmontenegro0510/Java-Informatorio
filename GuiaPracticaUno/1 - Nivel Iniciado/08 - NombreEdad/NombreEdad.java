import java.util.Scanner;

public class NombreEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese su nombre y apellido
        System.out.print("Ingresa tu nombre y apellido: ");
        String nombreCompleto = sc.nextLine();

        // Solicitar al usuario que ingrese su edad
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        // Mostrar el mensaje con los datos ingresados
        System.out.println("Mi nombre es " + nombreCompleto);
        System.out.println("Mi edad es " + edad);

        sc.close();
    }
}
