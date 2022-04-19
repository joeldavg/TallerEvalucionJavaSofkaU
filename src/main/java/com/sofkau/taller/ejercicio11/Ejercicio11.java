package com.sofkau.taller.ejercicio11;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        //Leer dato consola
        System.out.println("Ingresar frase:");
        String textoUsuario = leerTexto();

        int textoLength = textoUsuario.length();
        Map<Character, Integer> vocales = contarVocales(textoUsuario.toLowerCase());

        System.out.println("La longitud de la frase es: " + textoLength);
        System.out.println("La frase contiene la siguiente cantidad de vocales: " + vocales);
    }

    private static String leerTexto() {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        scanner.close();
        return texto;
    }

    private static Map<Character, Integer> contarVocales(String texto) {

        Map<Character, Integer> vocales = new HashMap<>();
        vocales.put('a', 0);
        vocales.put('e', 0);
        vocales.put('i', 0);
        vocales.put('o', 0);
        vocales.put('u', 0);

        for (int i = 0; i < texto.length(); i++) {
            Character letra = texto.charAt(i);
            CompararLetra(vocales, letra);
        }

        return vocales;
    }

    private static void CompararLetra(Map<Character, Integer> vocales, Character letra) {
        if (vocales.containsKey(letra)) {
            int cantidad = vocales.get(letra);
            vocales.put(letra, ++cantidad);
        }
    }

}
