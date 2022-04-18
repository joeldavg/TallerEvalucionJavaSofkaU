package com.sofkau.taller.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // leer datos desde consola
        System.out.println("Ingrese primer valor:");
        int x = scanner.nextInt();
        System.out.println("Ingrese segundo valor:");
        int y = scanner.nextInt();


        if (x == y) {
            System.out.println("Los variable tienen el mismo valor");
        } else {
            System.out.println("El numero mayor es: " + buscarMayor(x, y));
        }

        scanner.close();
    }


    public static int buscarMayor(int x, int y) {
        int mayor = x;
        if (y > x) {
            mayor = y;
        }
        return mayor;
    }

}
