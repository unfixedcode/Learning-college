package Actividad2;

public class mainVehiculos {
    public static void main(String[] args) {
        
        Coche miCoche = new Coche("Toyota", "Corolla", 2025);
        System.out.println("--- Detalles del carro ---");
        miCoche.mostrarDetalles();
        miCoche.mover();

        System.out.println();

        Bicicleta miBici = new Bicicleta("Trek", "Marx", 2024);
        System.out.println("--- Detalles de la Bicicleta ---");
        miBici.mostrarDetalles();
        miBici.mover();
    }
}