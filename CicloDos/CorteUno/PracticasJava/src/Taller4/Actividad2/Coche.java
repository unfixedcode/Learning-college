package Actividad2;

public class Coche extends Vehiculo {

    public Coche(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void mover() {
        System.out.println("El coche está circulando");
    }
}