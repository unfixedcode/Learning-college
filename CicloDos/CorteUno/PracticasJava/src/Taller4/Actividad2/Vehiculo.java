package Actividad2;
public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    public Vehiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void mostrarDetalles() {
        System.out.println("Vehículo -> Marca: " + marca + ", Modelo: " + modelo + ", Año: " + ano);
    }

    public void mover() {
        System.out.println("El vehículo se mueve");
    }
}