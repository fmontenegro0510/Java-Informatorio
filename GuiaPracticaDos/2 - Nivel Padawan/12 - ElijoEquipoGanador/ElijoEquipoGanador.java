import java.util.Scanner;
/***
* Yo elijo el equipo ganador : Modifique el ejercicio anterior en donde usted debe 
* crear un menú de opciones en donde en ese menú de opciones debe elegir qué 
* equipo de fútbol quiere saber la información del el ejercicio 11.
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

        System.out.println("------------------------------------------------" + "\n");
        System.out.println("Que equipo desea ver?");
        System.out.println("Ingrese una opción");
        System.out.println("------------------------------------------------" + "\n");
        System.out.println("1. " + NombreEquipo1);
        System.out.println("2. " + NombreEquipo2);
        System.out.println("------------------------------------------------" + "\n");

        int eleccion = sc.nextInt();

        if (eleccion == 1){
            System.out.println(NombreEquipo1);
            System.out.println("------------------------------------------------");
            System.out.println("Entrenador: " + EntrenadorEquipo1); 
            System.out.println("Los jugadores de " + NombreEquipo1 + " son: ");
            for (int i = 2; i < Equipo1.length; i++){
                System.out.println(Equipo1[i]);
            }
        }else if (eleccion == 2){
            System.out.println(NombreEquipo2);
            System.out.println("------------------------------------------------");
            System.out.println("Entrenador: " + EntrenadorEquipo2); 
            System.out.println("Los jugadores de " + NombreEquipo2 + " son: ");
            for (int i = 2; i < Equipo2.length; i++){
                System.out.println(Equipo2[i]);
            }
        }

        sc.close();
    }
}




