package Taller5;

public class ConductorDeCoche extends Conductor {
    private String licencia;

    public ConductorDeCoche(String nombre, int edad, int experiencia, String licencia) {
        super(nombre, edad, experiencia);
        this.licencia = licencia;
    }

    @Override
    public boolean puedeConducir(Vehiculo vehiculo) {
        // Solo maneja si el vehiculo dice que es coche
        return vehiculo.tipoDeVehiculo().equals("Coche");
    }
}