package com.sofkau.taller.ejercicio18;

public interface Entregable<T> {

    public void entregar();
    public void devolver();
    public Boolean isEntregado();
    public void compareTo(T entidad);
}
