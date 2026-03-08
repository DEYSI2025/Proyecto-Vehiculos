package Vehiculos;

public class Main {

    public static void main(String[] args) {

        Auto auto = new Auto("Toyota", 120, 4);
        Moto moto = new Moto("Yamaha", 150);
        Camion camion = new Camion("Hino", 100, 4000);

        System.out.println(auto.getMarca());
        auto.mover();

        System.out.println(moto.getMarca());
        moto.mover();

        System.out.println(camion.getMarca());
        camion.mover();
        
    }
}