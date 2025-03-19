
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author manuel.benavente
 */
public class MBCA_Circulo {
    // @Auth
    // @version 1
    // Atributos
    int Id;
    double Radio;
    String Color;

    // Metodos Getter y Setter
    public int getId() {
        return Id;
    }

    public double getRadio() {
        return Radio;
    }

    public String getColor() {
        return Color;
    }

    public void setId(int id) {
        this.Id = Id;
    }

    public void setRadio(double radio) {
        this.Radio = Radio;
    }

    public void setColor(String color) {
        this.Color = Color;
    }

    // Constructor por defecto
    public MBCA_Circulo() {
    }

    // Constructor con todos los argumentos
    public MBCA_Circulo(int id, double Radio, String Color) {
        this.Id = Id;
        this.Radio = Radio;
        this.Color = Color;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "MBCA_Circulo{" + "id=" + Id + ", radio=" + Radio + ", color=" + Color + '}';
    }

    // Clase publica estatica de area cuadrado
    public static double areacirculo(MBCA_Circulo circulo1) {
        // Calcula area circulo pi*R2
        double radio1 = circulo1.getRadio();
        double area2 = radio1 * 3.14;
        System.out.println("Area circulo: " + area2);
        return area2;
    }
    // Esta clase nos obitene el radio del circulo y calcula el area haciendo la
    // operacion radio * PI, luego muestra en pantalla el resultado

}
