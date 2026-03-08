package Vehiculos;

public class Auto extends Vehiculo {

    private int puertas;

    public Auto(String marca, int velocidad, int puertas) {
        super(marca, velocidad);
        this.puertas = puertas;
    }

    @Override
    public void mover() {
        System.out.println("El auto se mueve por la carretera");
    }

}