package com.sofkau.taller.ejercicio17;

public class Ejecutable {

    public static void main(String[] args) {

        Electrodomestico[] electrodomesticos = {
                new Electrodomestico(),
                new Electrodomestico(50.0, 20.0),
                new Electrodomestico(40.0, 30.0),
                new Electrodomestico(),
                new Lavadora(),
                new Lavadora(50.0, 60.0),
                new Lavadora(),
                new Television(),
                new Television(80.0, 45.0),
                new Television()
        };

        int totalElectrodomesticos = 0;
        int totalTelevision = 0;
        int totalLavadora = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            electrodomestico.precioFinal();
            totalElectrodomesticos += electrodomestico.getPrecioBase();
            if (electrodomestico instanceof Lavadora) {
                Lavadora lavadora = (Lavadora) electrodomestico;
                totalLavadora += lavadora.getPrecioBase();
            } else if (electrodomestico instanceof Television) {
                Television television = (Television) electrodomestico;
                totalTelevision += television.getPrecioBase();
            }
        }

        System.out.println("Total Electrodomesticos: " + totalElectrodomesticos);
        System.out.println("Total Television: " + totalTelevision);
        System.out.println("Total Lavadora: " + totalLavadora);

    }


}
