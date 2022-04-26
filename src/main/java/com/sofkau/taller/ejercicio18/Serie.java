package com.sofkau.taller.ejercicio18;

public class Serie implements Entregable<Serie> {

    private String titulo = "";
    private Integer numeroTemporadas = 3;
    private Boolean entregado = false;
    private String genero = "";
    private String creador = "";

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, Integer numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(Integer numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public Boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public void compareTo(Serie serie) {
        System.out.println(this.titulo + " tiene " + this.numeroTemporadas + " temporadas.");
        System.out.println(serie.titulo + " tiene " + serie.numeroTemporadas + " temporadas.");
    }
}
