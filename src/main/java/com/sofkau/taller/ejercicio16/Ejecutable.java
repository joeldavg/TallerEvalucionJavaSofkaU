package com.sofkau.taller.ejercicio16;

import java.time.Period;
import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese edad:");
        Integer edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese sexo:");
        String sexo = scanner.nextLine();
        System.out.println("Ingrese peso:");
        Double peso = Double.parseDouble(scanner.nextLine());
        System.out.println("Ingrese altura:");
        Double altura = Double.parseDouble(scanner.nextLine());

        Persona persona1 = new Persona(nombre, edad, sexo.charAt(0), peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo.charAt(0));
        Persona persona3 = new Persona();

        persona3.setNombre("joel");
        persona3.setEdad(24);
        persona3.setSexo('M');
        persona3.setAltura(1.79);
        persona3.setPeso(69.5);

        comprobarPeso(persona1);
        comprobarPeso(persona2);
        comprobarPeso(persona3);
        comprobarEdad(persona1);
        comprobarEdad(persona2);
        comprobarEdad(persona3);

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
    }

    public static void comprobarPeso(Persona persona) {
        Integer IMC = persona.calcularIMC();
        String mensaje = "Esta por debajo del peso ideal";
        if (IMC == 0) {
            mensaje = "Esta en el peso ideal";
        } else if (IMC == 1) {
            mensaje = "Esta por encima del peso ideal";
        }
        System.out.println(mensaje);
    }

    public static void comprobarEdad(Persona persona) {
        String mensaje = "Es mayour de edad";
        if (!persona.esMayorDeEdad()) {
            mensaje = "Es menor de edad";
        }
        System.out.println(mensaje);
    }

}
