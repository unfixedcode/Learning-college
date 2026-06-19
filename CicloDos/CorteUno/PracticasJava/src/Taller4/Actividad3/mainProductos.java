package Actividad3;

public class mainProductos {
    public static void main(String[] args) {
        
        // Instancia de ProductoElectrico
        productoElectrico miTele = new productoElectrico("Televisor Samsung 50\"", 1500000.00, 110);
        
        // Instancia de ProductoAlimenticio
        productoAlimenticio miLeche = new productoAlimenticio("Leche Deslactosada", 5000.00, "25-06-2026");

        System.out.println("--- Lista de Productos ---");
        miTele.mostrarDetalles();
        System.out.println();
        miLeche.mostrarDetalles();
    }
}