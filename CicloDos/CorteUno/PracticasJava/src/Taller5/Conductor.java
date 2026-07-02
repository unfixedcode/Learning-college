package Taller5;

// Clase base para conductores
public abstract class Conductor {
    protected String nombre;
    protected int edad;
    protected int experiencia; // Años de exp

    public Conductor(String nombre, int edad, int experiencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.experiencia = experiencia;
    }

    public void mostrarInformacion() {
        System.out.println("Conductor: " + nombre + " | Edad: " + edad + " | Experiencia: " + experiencia + " años");
    }

    // Abstracto para ver si puede manejar el vehiculo o no
    public abstract boolean puedeConducir(Vehiculo vehiculo);
}