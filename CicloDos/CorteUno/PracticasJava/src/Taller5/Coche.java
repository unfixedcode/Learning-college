package Taller5;

public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca, String modelo, double precioDiario, int numeroDePuertas) {
        super(marca, modelo, precioDiario); // Llama al constructor del padre
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Puertas: " + numeroDePuertas);
    }

    @Override
    public String tipoDeVehiculo() {
        return "Coche";
    }
}