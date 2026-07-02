package Taller5;

public class ConductorDeBicicleta extends Conductor {
    private String nivelDeHabilidad;

    public ConductorDeBicicleta(String nombre, int edad, int experiencia, String nivelDeHabilidad) {
        super(nombre, edad, experiencia);
        this.nivelDeHabilidad = nivelDeHabilidad;
    }

    @Override
    public boolean puedeConducir(Vehiculo vehiculo) {
        return vehiculo.tipoDeVehiculo().equals("Bicicleta");
    }
}