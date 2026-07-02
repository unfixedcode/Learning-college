package Taller5;

public class Motocicleta extends Vehiculo {
    private String tipoDeManillar;

    public Motocicleta(String marca, String modelo, double precioDiario, String tipoDeManillar) {
        super(marca, modelo, precioDiario);
        this.tipoDeManillar = tipoDeManillar;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Manillar: " + tipoDeManillar);
    }

    @Override
    public String tipoDeVehiculo() {
        return "Motocicleta";
    }
}