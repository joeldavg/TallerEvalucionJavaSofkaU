package com.sofkau.taller.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radio;
        double area;

        System.out.println("Ejecicio 3, calcular area de un circulo");
        System.out.println("Ingrese el radio del circulo:");
        radio = scanner.nextDouble();

        area = areaCiruclo(radio);

        System.out.println("El area del circulo es: " + area);

        scanner.close();
    }

    public static Double areaCiruclo(double radio) {
        double area = Math.PI * (Math.pow(radio, 2));
        return area;
    }

}
