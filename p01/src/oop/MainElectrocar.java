package oop;

public class MainElectrocar {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(23);
        Electrocar.Battery battery = new Electrocar.Battery();
        electrocar.start();

    }
}
