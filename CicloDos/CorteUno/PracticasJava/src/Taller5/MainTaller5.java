package Taller5;

public class MainTaller5 {
    public static void main(String[] args) {
        Vehiculo miCoche = new Coche("Toyota", "Corolla", 50.0, 4);
        Vehiculo miMoto = new Motocicleta("Yamaha", "R1", 30.0, "Deportivo");
        
        Conductor juan = new ConductorDeCoche("Juan", 30, 5, "Licencia B");
        Conductor ana = new ConductorDeMotocicleta("Ana", 25, 3, "Licencia A");

        // Juan intentando alquilar el coche (Deberia poder)
        AlquilerVehiculo alquiler1 = new AlquilerVehiculo(miCoche, juan);
        alquiler1.realizarAlquiler();

        // Ana intentando alquilar el coche (No deberia poder)
        AlquilerVehiculo alquiler2 = new AlquilerVehiculo(miCoche, ana);
        alquiler2.realizarAlquiler();
    }
}