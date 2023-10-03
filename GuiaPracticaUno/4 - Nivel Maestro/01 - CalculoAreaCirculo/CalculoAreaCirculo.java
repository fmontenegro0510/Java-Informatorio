/**
 * Escribir un programa en Java que calcule el área 
 * de un círculo con un radio de 5 unidades. 
 * 
 * Area de Un Círculo = π * r²
 * Radio r = 5
 * https://es.onlinemschool.com/math/assistance/figures_area/circle/
 */

public class CalculoAreaCirculo {
    public static void main(String[] args) {
        final double radio = 5;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del circulo con radio 5 es: " + area);
    }
}
