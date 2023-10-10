/***
 * Positivos y divisibles por 7 : Realizar un programa que muestre por pantalla los
 * números enteros positivos que sean divisibles por 7 y que sean menores que 100.
 */
public class PositivosDivisibles {
    public static void main(String[] args){
        System.out.print("Numeros enteros Positivos Menores que 100 y Divisibles por 7: ");
        int num = 0 ;
        while (num < 100){
            if (num % 7 == 0){
                System.out.println(num);
            }
            num++;
        }
    }
}

