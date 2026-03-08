package Vehiculos;

public class Camion extends Vehiculo
{
private int carga;
public Camion (String marca, int velocidad, int carga) {
        super(marca, velocidad);
        this.carga = carga;
    }

    @Override
    public void mover() {
        System.out.println("El camion transporta carga por toda la carretera");
    }




}
