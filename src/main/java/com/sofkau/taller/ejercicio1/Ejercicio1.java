package com.sofkau.taller;

public class Ejercicio1 {

    public static void main(String[] args) {

        int x = 8;
        int y = 8;

        if (x == y) {
            System.out.println("Los variable tienen el mismo valor");
        } else {
            System.out.println("El numero mayor es: " + buscarMayor(x, y));
        }

    }

    public static int buscarMayor(int x, int y) {
        int mayor = x;
        if (y > x) {
            mayor = y;
        }
        return mayor;
    }

}
