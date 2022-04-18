package com.sofkau.taller.ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        System.out.println(":: Este programa elimina espacios de una frase ::");
        System.out.println("Ingrese frase:");
        String textoUsuario = leerTexto();
        String textoModificado = eliminarEspacios(textoUsuario);
        System.out.println("El texto modificado es: " + textoModificado);
    }

    private static String leerTexto() {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        scanner.close();
        return texto;
    }

    private static String eliminarEspacios(String texto) {
        String nuevoTexto = texto.replace(" ", "");
        return nuevoTexto;
    }

}
