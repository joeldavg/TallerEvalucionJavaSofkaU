package com.sofkau.taller.ejercicio17;

import java.util.HashMap;
import java.util.Map;

public class Electrodomestico {

    protected Double precioBase = 100D;
    protected String color = "Blanco";
    protected Character consumoEnergetico = 'F';
    protected Double peso = 5D;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precioBase, Double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(Double precioBase, String color, Character consumoEnergetico, Double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    private void comprobarConsumoEnergetico(Character letra) {

    }

    private void comprobarColor(String color) {

    }

    public void precioFinal() {
        precioBase += incrementoPorConsumo() + incrementoPorPeso();
    }

    private Double incrementoPorConsumo() {
        Map<Character, Double> incremento = new HashMap<>();
        incremento.put('A', 100D);
        incremento.put('B', 80D);
        incremento.put('C', 60D);
        incremento.put('D', 50D);
        incremento.put('E', 30D);
        incremento.put('F', 10D);

        return incremento.get(this.consumoEnergetico);
    }

    private Double incrementoPorPeso() {
        Double incremento = 0D;
        if (this.peso >= 0 && this.peso < 20) {
            incremento = 10D;
        } else if (this.peso >= 20 && this.peso < 50) {
            incremento = 50D;
        } else if (this.peso >= 50 && this.peso < 80) {
            incremento = 80D;
        } else {
            incremento = 100D;
        }
        return incremento;
    }

}
