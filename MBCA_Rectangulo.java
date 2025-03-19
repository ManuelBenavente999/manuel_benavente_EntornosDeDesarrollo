/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author manuel.benavente
 */
public class MBCA_Rectangulo {
    // @Auth
    // @version 1
    // Atributos
    int id;
    double LadoA;
    double LadoB;
    String Color;

    // Constructor por defecto
    public MBCA_Rectangulo() {
    }

    // Constructor con todos los argumentos
    public MBCA_Rectangulo(int id, double LadoA, double LadoB, String Color) {
        this.id = id;
        this.LadoA = LadoA;
        this.LadoB = LadoB;
        this.Color = Color;
    }

    // Metodos Getter y Setter
    public int getId() {
        return id;
    }

    public double getLadoA() {
        return LadoA;
    }

    public double getLadoB() {
        return LadoB;
    }

    public String getColor() {
        return Color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLadoA(double ladoA) {
        this.LadoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.LadoB = ladoB;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "MBCA_Rectangulo{" + "id=" + id + ", ladoA=" + LadoA + ", ladoB=" + LadoB + ", color=" + Color + '}';
    }

    // Clase publica estatica de area cuadrado
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
