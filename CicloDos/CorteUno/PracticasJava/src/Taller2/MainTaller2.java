package Taller2; // Esto porque los trabajos los hice en VS Code y el mismo programa me requirió esto para funcionar bien
public class MainTaller2 {
    public static void main(String[] args) {
        // Producto
        Producto prod1 = new Producto("Televisor Samsung S90D", 1000.000, 10);
        prod1.mostrarInformacion();
        prod1.vender(2);
        prod1.reponer(5);
        
        System.out.println("-----------------"); // Solo es un separador xd

        Estudiante est1 = new Estudiante("Felipe", "101", 4.7);
        est1.evaluarEstado();
        
        Estudiante est2 = new Estudiante("Sofía", "102", 2.5);
        est2.evaluarEstado();
    }
}