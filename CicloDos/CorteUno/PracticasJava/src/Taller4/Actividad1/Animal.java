package Actividad1;
public class Animal {
    // Atributos de la clase base
    protected String nombre;
    protected int edad;

    // Constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Mostrar la información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + " años.");
    }

    // Método que se sobreescribe
    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico");
    }
}