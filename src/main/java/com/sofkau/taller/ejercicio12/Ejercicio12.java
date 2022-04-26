package com.sofkau.taller.ejercicio12;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese primera palabra");
        String palabra1 = scanner.nextLine();

        System.out.println("Ingrese primera palabra");
        String palabra2 = scanner.nextLine();

        if (palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println("Las palabras ingresadas son iguales");
        } else {
            String diff = StringUtils.difference(palabra1, palabra2);
            System.out.println("La diferencias entre las palabras: " + diff);
        }

    }

}
