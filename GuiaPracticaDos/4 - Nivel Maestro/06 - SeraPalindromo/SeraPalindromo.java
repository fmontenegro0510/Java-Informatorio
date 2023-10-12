import java.util.Scanner;

/***
 * Sera Palíndromo?: Dado un arreglo con caracteres (Formando una palabra) indicar
 * si es o no palíndromo.
 * https://www.estandarte.com/noticias/idioma-espanol/que-es-un-palindromo-ejemplos_1723.html
 * 
 * Tener en cuenta que un palíndromo es una palabra que se lee igual de izquierda a derecha
 * otra cuestion es que para el ejercicio planteado solo funciona con palabras, no con frases.
 **/
 
 public class SeraPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la palabra a evaluar si es palindromo");
        String pal = sc.nextLine();
        char[] palArray = pal.toCharArray();
        boolean esPalindromo = true;

        for (int i = 0; i < palArray.length / 2; i++) {
            if (palArray[i] != palArray[palArray.length - 1 - i]) {
                esPalindromo = false;
                break;  
            }            
        }

        if (esPalindromo) {
            System.out.println("Es palindromo");
        }   else {
            System.out.println("No es palindromo");
        }

        sc.close();
    }
 }