package com.sofkau.taller.ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        System.out.println("Texto original: " + texto);

        // reemplazar a -> e
        String nuevoTexto = reemplazarLetra(texto);
        System.out.println("Texto modificado: " + nuevoTexto);

        //leer texto por consola
        System.out.println("Ingrese un texto:");
        String textoUsuario = leer();

        //concatenar
        String textoConcatenado = nuevoTexto.concat(" " + textoUsuario);
        System.out.println("Texto concatenado: " + textoConcatenado);
    }

    private static String leer() {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        scanner.close();
        return texto;
    }

    private static String reemplazarLetra(String texto) {
        String nuevoTexto = texto.replace("a", "e");
        return nuevoTexto;
    }

}
