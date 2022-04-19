package com.sofkau.taller.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        System.out.println("Este programa imprime por pantalla los números " +
                "\ndesde el numero introducido hasta 1000 con saldos de 2 en 2.");

        System.out.println("\nIntroducir numero: ");
        int numeroUsuario = leerNumero();

        imprimirSaltos2(numeroUsuario);

    }

    private static int leerNumero() {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.close();
        return numero;
    }

    private static void imprimirSaltos2(int numero) {
        do {
            System.out.println(numero);
            numero+=2;
        } while (numero <= 1000);
    }

}
