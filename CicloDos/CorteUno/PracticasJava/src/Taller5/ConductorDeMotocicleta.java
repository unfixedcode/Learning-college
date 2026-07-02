package Taller5;

public class ConductorDeMotocicleta extends Conductor {
    private String licenciaMoto;

    public ConductorDeMotocicleta(String nombre, int edad, int experiencia, String licenciaMoto) {
        super(nombre, edad, experiencia);
        this.licenciaMoto = licenciaMoto;
    }

    @Override
    public boolean puedeConducir(Vehiculo vehiculo) {
        return vehiculo.tipoDeVehiculo().equals("Motocicleta");
    }
}