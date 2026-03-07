package Vehiculos;

public class Main {

    public static void main(String[] args) {

        Auto auto = new Auto("Toyota", 120, 4);
        Moto moto = new Moto("Yamaha", 150);

        System.out.println(auto.getMarca());
        auto.mover();

        System.out.println(moto.getMarca());
        moto.mover();
    }
}