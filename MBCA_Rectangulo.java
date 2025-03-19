/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author manuel.benavente
 */
public class MBCA_Rectangulo {
    int id = 1;
    double ladoA = 12.3;
    double ladoB = 6.1;
    String color = "Amarillo";

    public MBCA_Rectangulo() {
    }

    public int getId() {
        return id;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rectangulo_MBCA{" + "id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", color=" + color + '}';
    }

}
