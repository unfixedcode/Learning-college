package Actividad3;

public class productoAlimenticio extends Producto {
    private String fechaCaducidad;

    public productoAlimenticio(String nombre, double precio, String fechaCaducidad) {
        super(nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto Alimenticio: " + nombre + " | Precio: $" + precio + " | Caduca el: " + fechaCaducidad);
    }
}