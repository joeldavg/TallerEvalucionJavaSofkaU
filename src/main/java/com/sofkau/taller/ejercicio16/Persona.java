package com.sofkau.taller.ejercicio16;

import java.util.Random;

public class Persona {

    private String nombre = "";
    private Integer edad = 0;
    private String DNI;
    private Sexo sexo = Sexo.H;
    private Double peso = 0d;
    private Double altura = 0d;

    public Persona() {
        this.DNI = this.generarDNI(numeroDNI());
    }

    public Persona(String nombre, int edad, Character sexo) {
        this.nombre = nombre;
        this.edad = edad;
        setSexo(sexo);
        this.DNI = this.generarDNI(numeroDNI());
    }

    public Persona(String nombre, Integer edad, Character sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        setSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.DNI = this.generarDNI(numeroDNI());
    }

    public Integer calcularIMC() {
        double IMC = this.peso / Math.pow(this.altura, 2);
        Integer valor = 1;
        if (IMC < 20) {
            valor = -1;
        } else if (IMC >= 20 && IMC <= 25) {
            valor = 0;
        }
        return valor;
    }

    public Boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSexo(Character sexo) {
        this.sexo = Sexo.H;
        if (sexo.equals('m') || sexo.equals('M')) {
            this.sexo = Sexo.M;
        }
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer numeroDNI() {
        Random random = new Random();
        int dni = random.nextInt(99_999_999);
        return dni;
    }

    public String generarDNI(Integer dni) {
        Integer letraDNI = dni % 23;
        String listaLetras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String valorDNI = String.valueOf(dni) + listaLetras.charAt(letraDNI);
        return valorDNI;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
