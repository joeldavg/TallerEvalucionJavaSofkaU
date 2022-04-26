package com.sofkau.taller.ejercicio17;

public class Lavadora extends Electrodomestico {

    private Integer carga = 5;

    public Lavadora() {
    }

    public Lavadora(Double precioBase, Double peso) {
        super(precioBase, peso);
    }

    public Lavadora(Double precioBase, String color, Character consumoEnergetico, Double peso, Integer carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void precioFinal() {
        super.precioFinal();
        if (this.carga > 30) {
            this.precioBase += 50;
        }
7    }

}
