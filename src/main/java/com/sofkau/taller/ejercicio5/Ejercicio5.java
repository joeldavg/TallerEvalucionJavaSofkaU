package com.sofkau.taller.ejercicio5;

public class Ejercicio5 {

    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            i++;
            evaluarNumero(i);
        }
    }

    private static void evaluarNumero(int i) {
        String mensaje = i + ": es impar";
        if (esPar(i)) {
            mensaje = i + ": es par";
        }
        System.out.println(mensaje);
    }

    public static boolean esPar(int x) {
        boolean isPar = x % 2 == 0;

        return isPar;
    }

}
