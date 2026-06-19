package Actividad1;
public class MainAnimales {
    public static void main(String[] args) {
        // Crear una instancia de Perro
        Perro miPerro = new Perro("Firulais", 3);
        System.out.println("--- Información del Perro ---");
        miPerro.mostrarInformacion();
        miPerro.hacerSonido();

        System.out.println();

        // Crear una instancia de Gato
        Gato miGato = new Gato("Michi", 2);
        System.out.println("--- Información del Gato ---");
        miGato.mostrarInformacion();
        miGato.hacerSonido();
    }
}