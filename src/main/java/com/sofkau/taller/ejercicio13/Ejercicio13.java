package com.sofkau.taller.ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio13 {

    public static void main(String[] args) {

        LocalDateTime actual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("(yyyy/MM/dd) (HH:mm:ss)");

        System.out.println("Este programa muestra la fecha y hora actual en el formato (yyyy/MM/dd) (HH:mm:ss)");
        System.out.println(formatter.format(actual));
    }

}
