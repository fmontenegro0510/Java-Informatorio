/***
 * Menú de opciones : Realice un menú de opciones, donde la opción se guarde en
 * una variable (Sin pedir por teclado), muestre la opción elegida y fuerce su salida 
 * bucle.
 */
public class MenuOpciones2 {
    public static void main(String[] args) {
        int opcionElegida = 0; 
        
        while (opcionElegida != 3) { // El bucle continuará hasta que se elija la opción 3 (Salir)
            // Menú de opciones
            System.out.println("Menú de Opciones:");
            System.out.println("1. Ver perfil");
            System.out.println("2. Configuración");
            System.out.println("3. Salir");
            
            //Defino un arreglo de opciones
            String opciones[] = {"Ver perfil", "Configuración", "Salir"};

            // Asignamos la opción directamente a la variable (sin entrada de teclado)
            opcionElegida = 2; 
            
            // Mostramos la opción elegida
            System.out.println("\nOpción elegida: " + opcionElegida + " - " + opciones[opcionElegida - 1]);
        }
    }
}


//El problema es que al no tener intervencion por parte del usuario, ni por el teclado en tiempo de ejecucion 
//queda en un bucle infinito