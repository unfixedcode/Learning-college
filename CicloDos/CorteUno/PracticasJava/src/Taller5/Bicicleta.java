package Taller5;

public class Bicicleta extends Vehiculo {
    private String tipoDeBicicleta;

    public Bicicleta(String marca, String modelo, double precioDiario, String tipoDeBicicleta) {
        super(marca, modelo, precioDiario);
        this.tipoDeBicicleta = tipoDeBicicleta;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de bici: " + tipoDeBicicleta);
    }

    @Override
    public String tipoDeVehiculo() {
        return "Bicicleta";
    }
}