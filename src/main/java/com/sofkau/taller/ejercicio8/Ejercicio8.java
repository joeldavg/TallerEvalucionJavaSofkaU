package com.sofkau.taller.ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        mostrarDias();
        String diaUsuario = leerDia();
        String mensaje = "";
        switch (diaUsuario) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                mensaje = diaUsuario.concat(" es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                mensaje = diaUsuario.concat(" no es un dia laboral");
                break;
            default:
                mensaje = diaUsuario.concat(" no es un dia de semana");
        }

        System.out.println(mensaje);

    }

    private static String leerDia() {
        Scanner scanner = new Scanner(System.in);
        String dia = scanner.next().toLowerCase();
        scanner.close();
        return dia;
    }

    public static void mostrarDias() {
        System.out.println(":: Dias de la semana ::");
        System.out.println("Escriba un dia para determinar si es laboral: \n" +
                "lunes, martes, miercoles, jueves, viernes, sabado y domingo");
    }

}
