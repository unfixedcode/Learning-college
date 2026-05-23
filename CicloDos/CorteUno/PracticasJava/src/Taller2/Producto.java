package Taller2; // Esto porque los trabajos los hice en VS Code y el mismo programa me requirió esto para funcionar bien
public class Producto {
    // Atributos del producto
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre; 
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Imprimir
    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
    }

    // Acá se restan unidades al stock
    public void vender(int unidades) {
        if (unidades <= cantidad) {
            cantidad = cantidad - unidades; // Aquí usamos la resta normal, sin el -=
            System.out.println("Venta exitosa. Vendiste: " + unidades);
        } else {
            System.out.println("No hay suficiente stock.");
        }
    }

    // Acá se sumar unidades al stock
    public void reponer(int unidades) {
        cantidad = cantidad + unidades; // Aquí usamos la suma normal
        System.out.println("Se repusieron unidades: " + unidades);
    }
}