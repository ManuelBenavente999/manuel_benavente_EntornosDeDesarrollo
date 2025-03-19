/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author manuel.benavente
 */
public class MBCA_Circulo {

    int id = 1;
    double radio = 12.3;
    String color = "Rojo";

    public MBCA_Circulo(int id, double radio, String color) {
        this.id = id;
        this.radio = radio;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public MBCA_Circulo() {
    }

    @Override
    public String toString() {
        return "MBCA_Circulo{" + "id=" + id + ", radio=" + radio + ", color=" + color + '}';
    }

    public static void main(String[] args) {
    }

}
