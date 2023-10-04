import java.util.Scanner;

public class Descontador {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un numero");
            int num = sc.nextInt();
            for (int i = 0; i < 20; i++){
                num--;
                System.out.println(num);
            }
            System.out.println("El numero decrementado es: " + num);
            sc.close();
    }
}