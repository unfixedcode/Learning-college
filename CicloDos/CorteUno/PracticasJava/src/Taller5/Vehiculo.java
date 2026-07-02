package Taller5;

// Clase base para los vehpículos
public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected double precioDiario;

    public Vehiculo(String marca, String modelo, double precioDiario) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioDiario = precioDiario;
    }

    // Método que muestra info basica
    public void mostrarDetalles() {
        System.out.println("Vehiculo: " + marca + " " + modelo + " | Precio/dia: $" + precioDiario);
    }

    // Método abstracto que cambia segun el child
    public abstract String tipoDeVehiculo();
}