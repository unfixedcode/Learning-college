package Taller2; // Esto porque los trabajos los hice en VS Code y el mismo programa me requirió esto para funcionar bien
public class Estudiante {
    // Atributos privados para que no los modifiquen desde afguera
    private String nombre;
    private String matricula;
    private double promedio;

    public Estudiante(String nombre, String matricula, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // Acá se evalúa si pasó o no
    public void evaluarEstado() {
        if (promedio >= 3.0) {
            System.out.println(nombre + " está Aprobado");
        } else {
            System.out.println(nombre + " está Reprobada");
        }
    }
}