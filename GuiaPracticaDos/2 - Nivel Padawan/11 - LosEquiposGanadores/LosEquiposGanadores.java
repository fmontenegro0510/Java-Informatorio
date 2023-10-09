import java.util.Scanner;
/***
 * Los equipos ganadores : Guarde en variables el nombre de 2 equipos de fútbol,
 * luego en otras 2 variables el nombre de los entrenadores y luego guarde el nombre 
 * de los jugadores en distintas variables. Luego muestre un encabezado con el 
 * nombre de cada equipo y por cada equipo muestre los nombres de los jugadores.
 */

//Tomo como escenario para evitar equipos grandes, que son equipos de futbol salon
//integrado por 5 jugadores de cada lado

public class LosEquiposGanadores{
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] Equipo1 = new String[7];
        String[] Equipo2 = new String[7];
        
        System.out.println("Ingrese el nombre del primer equipo");
        String NombreEquipo1 = sc.nextLine();
        
        System.out.println("Ingrese el nombre del Entrenador del primero equipo");
        String EntrenadorEquipo1 = sc.nextLine();
        
        System.out.println("Ingrese el nombre del segundo equipo");
        String NombreEquipo2 = sc.nextLine();
        
        System.out.println("Ingrese el nombre del Entrenador del segundo equipo");
        String EntrenadorEquipo2 = sc.nextLine();
        
        System.out.println("Ingrese el nombre de los jugadores del primer equipo");
        int cont = 1;
        for (int i = 2; i < Equipo1.length; i++){
            System.out.print("Ingrese el jugador N° " + cont +": ");
            Equipo1[i] = sc.nextLine();
            cont++;
        }
        cont=1;
        System.out.println("Ingrese el nombre de los jugadores del segundo equipo");
        for (int i = 2; i < Equipo2.length; i++){
            System.out.print("Ingrese el jugador N° " + cont +": ");
            Equipo2[i] = sc.nextLine();
            cont++;
        }

        System.out.println("-----------------------------------------------" + "\n");
        System.out.println("Equipo 1: " + NombreEquipo1);
        System.out.println("Entrenador del equipo 1: " + EntrenadorEquipo1); 
        System.out.println("Los jugadores de " + NombreEquipo1 + " son: ");
        
        for (int i = 2; i < Equipo1.length; i++){
            System.out.println(Equipo1[i]);
        }

        System.out.println("-----------------------------------------------" + "\n");
        System.out.println("Equipo 2: " + NombreEquipo2);
        System.out.println("Entrenador del equipo 2: " + EntrenadorEquipo2);
        System.out.println("Los jugadores de " + NombreEquipo2 + " son: ");
        
        for (int i = 2; i < Equipo2.length; i++){
            System.out.println(Equipo2[i]);
        }
        
        System.out.println("-----------------------------------------------" + "\n");
        
        sc.close();
    }
}




