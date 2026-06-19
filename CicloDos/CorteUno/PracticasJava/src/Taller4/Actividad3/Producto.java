package Actividad3;

public class Producto {
    protected String nombre;
    protected double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }
}