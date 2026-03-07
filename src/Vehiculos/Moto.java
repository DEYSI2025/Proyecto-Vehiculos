package Vehiculos;

public class Moto extends Vehiculo {

    public Moto(String marca, int velocidad) {
        super(marca, velocidad);
    }

    @Override
    public void mover() {
        System.out.println("La moto se mueve rapidamente");
    }
}