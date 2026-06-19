package Actividad1;
public class Perro extends Animal {

    // Constructor que llama al constructor de la clase padre
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    // Sobrescritura de hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println("¡Guau!");
    }
}