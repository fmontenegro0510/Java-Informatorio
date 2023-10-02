public class CaracteresNombre {
    /**
     * Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre,y luego imprimirlos por pantalla. 
     * ¿Por qué no puede usar "" en el char? 
     * Cada caracter se representa entre comillas simples ('') para indicar que es un carácter individual en lugar de una cadena de caracteres.
     * En caso que se quiera representar un nombre completo como una cadena de caracteres, puedes usar comillas dobles ("").
     */
    public static void main(String[] args) {
        char primerCaracter = 'J';
        char segundoCaracter = 'o';
        char tercerCaracter = 'h';
        char cuartoCaracter = 'n';
        
        // Imprimir los caracteres por pantalla
        System.out.println("Mi nombre es: " + primerCaracter + segundoCaracter + tercerCaracter + cuartoCaracter);
    }
}
