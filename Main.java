/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author manuel.benavente
 */
public class Main {

    public static void main(String[] args) {
        // @Auth
        // @version 1
        // Instanciamos un cuadrado y un cirulo
        MBCA_Circulo circulo1 = new MBCA_Circulo(1, 3, "verde");
        MBCA_Rectangulo cuadrado1 = new MBCA_Rectangulo(1, 3, 3, "rojo");

        double area1 = areacuadrado(cuadrado1);

        double area2 = areacirculo(circulo1);

        double diferencia = calculodiferenciaareas(area1, area2);

        // Imprimir datos
        System.out.println("Cuadrado: " + cuadrado1);
        System.out.println("Circulo: " + circulo1);
        System.out.println("Diferencia: " + diferencia);
    }

    public static double calculodiferenciaareas(double area1, double area2) {
        // Diferencia entre areas de cuadrado y circulo
        double diferencia = area1 - area2;
        System.out.println("Diferencia áreas: " + diferencia);
        return diferencia;
        // Esta clase nos permite calcular la diferencia de areas entre el rectangulo y
        // el circulo haciendo la resta entre ellos y mostrandonos el resultado
    }

    public static double areacirculo(MBCA_Circulo circulo1) {
        // Calcula area circulo pi*R2
        double radio1 = circulo1.getRadio();
        double area2 = radio1 * 3.14;
        System.out.println("Area circulo: " + area2);
        return area2;
        // Esta clase nos obitene el radio del circulo y calcula el area haciendo la
        // operacion radio * PI, luego muestra en pantalla el resultado

    }

    public static double areacuadrado(MBCA_Rectangulo cuadrado1) {
        // Calcula area cuadrado LadoA + LadoB
        double ladoA = cuadrado1.getLadoA();
        double ladoB = cuadrado1.getLadoB();
        double area1 = ladoA * ladoB;
        System.out.println("Area cuadrado: " + area1);
        return area1;
        // Esta clase nos obtiene los lados a y b del rectangulo y calcula el area
        // haciendo la
        // operacion ladoA * ladoB, luego muestra en pantalla el resultado

    }

}
