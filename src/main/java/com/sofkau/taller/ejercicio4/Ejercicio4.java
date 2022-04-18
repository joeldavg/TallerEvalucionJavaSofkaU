package com.sofkau.taller.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio;
        double precioFinal;

        System.out.println("Ejercicio4, agregar IVA a precio de un producto");

        System.out.println("Ingresar precio del producto:");
        precio = scanner.nextDouble();
        precioFinal = precioConIva(precio);

        System.out.println("El precio del producto con IVA es: " + precioFinal);

        scanner.close();
    }

    public static double precioConIva(double precio) {
        //IVA = 21% , -> 0.21
        final double IVA = 0.21;
        double precioFinal = precio*(1 + IVA);
        return precioFinal;
    }

}
