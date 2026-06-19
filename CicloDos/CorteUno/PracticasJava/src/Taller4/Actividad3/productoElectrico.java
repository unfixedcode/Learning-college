package Actividad3;
public class productoElectrico extends Producto {
    private int voltaje;

    // Constructor que incluye el nuevo atributo
    public productoElectrico(String nombre, double precio, int voltaje) {
        super(nombre, precio); // Llama al constructor de Producto
        this.voltaje = voltaje;
    }

    // Sobrescribimos el método para incluir el voltaje
    @Override
    public void mostrarDetalles() {
        System.out.println("Producto Eléctrico: " + nombre + " | Precio: $" + precio + " | Voltaje: " + voltaje + "V");
    }
}