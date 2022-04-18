package com.sofkau.taller.ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;

        do {
            System.out.println("Ingrese un numero mayor a cero (0):");
            x = scanner.nextInt();
        } while (x < 0);

        System.out.println("El numero ingresado fue: " + x);

        scanner.close();
    }

}
