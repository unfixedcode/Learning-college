package Taller5;

// Clase que junta al conductor y al vehiculo
public class AlquilerVehiculo {
    private Vehiculo vehiculo;
    private Conductor conductor;

    public AlquilerVehiculo(Vehiculo vehiculo, Conductor conductor) {
        this.vehiculo = vehiculo;
        this.conductor = conductor;
    }

    public void realizarAlquiler() {
        conductor.mostrarInformacion();
        vehiculo.mostrarDetalles();
        
        // Aca revisamos si es compatible o no
        if (conductor.puedeConducir(vehiculo)) {
            System.out.println("Todo en orden, alquiler confirmado para " + conductor.nombre);
        } else {
            System.out.println("Lo siento, " + conductor.nombre + " no tiene permiso para manejar un " + vehiculo.tipoDeVehiculo() + ":(");
        }
        System.out.println("-------------------------------------------------");
    }
}