package Actividad2;

public class Bicicleta extends Vehiculo {

    public Bicicleta(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void mover() {
        System.out.println("La bicicleta está pedaleando");
    }
}