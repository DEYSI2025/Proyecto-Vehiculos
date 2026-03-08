package Vehiculos;

public abstract class Vehiculo {

    private String marca;
    private int velocidad;

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
/*
en esta clase abstracta no hay implementacion, sin embargo se hace uso de las otras 2 clases con herencia
 */
    public abstract void mover();
}