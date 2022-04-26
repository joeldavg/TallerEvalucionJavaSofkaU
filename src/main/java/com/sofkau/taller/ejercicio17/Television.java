package com.sofkau.taller.ejercicio17;

public class Television extends Electrodomestico {

    private Double resolucion = 20D;
    private Boolean sintonizadorTDT = false;

    public Television() {
    }

    public Television(Double precioBase, Double peso) {
        super(precioBase, peso);
    }

    public Television(Double precioBase, String color, Character consumoEnergetico, Double peso, Double resolucion, Boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {
            this.precioBase *= 1.30;
        }
        if (sintonizadorTDT) {
            this.precioBase += 50;
        }
    }

}
