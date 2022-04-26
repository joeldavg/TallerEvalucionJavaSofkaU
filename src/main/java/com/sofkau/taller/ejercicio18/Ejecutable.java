package com.sofkau.taller.ejercicio18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ejecutable {

    public static void main(String[] args) {

        Serie[] series = {
                new Serie("Dark ", " "),
                new Serie("El juego del Calamar", ""),
                new Serie("Breaking Bad", ""),
                new Serie("La casa de papel", ""),
                new Serie("Stranger Things", 5, "", "")
        };

        Videojuego[] videojuegos = {
                new Videojuego("Divinity: Original Sin 2", 100),
                new Videojuego("Final Fantasy VII", 150),
                new Videojuego("Assassin's Creed IV: Black Flag", 200),
                new Videojuego("Burnout 3: Takedown", 250),
                new Videojuego("League of Legends", 300)
        };

        series[1].entregar();
        series[3].entregar();

        videojuegos[0].entregar();
        videojuegos[2].entregar();
        videojuegos[4].entregar();

        List<Serie> seriesEntregadas = Arrays.stream(series)
                .filter((x) -> x.isEntregado())
                .collect(Collectors.toList());

        List<Videojuego> videojuegosEntregadas = Arrays.stream(videojuegos)
                .filter((x) -> x.isEntregado())
                .collect(Collectors.toList());

        System.out.println("Cantidad series entregadas: "+ seriesEntregadas.size());
        System.out.println(seriesEntregadas);

        System.out.println("Cantidad videojuegos entregadas: "+ videojuegosEntregadas.size());
        System.out.println(videojuegosEntregadas);

    }

}
