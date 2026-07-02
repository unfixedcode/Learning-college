package Parcial2;

public class Estudiante {
    private String nombre;
    private int calificacion;

    // Constructor básico
    public Estudiante(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    // Método que tira la descripcion de la nota
    public String obtenerDescripcion() {
        if (calificacion == 10) return "Excelente";
        if (calificacion >= 8) return "Muy bien";
        if (calificacion >= 6) return "Bien";
        if (calificacion >= 4) return "Suficiente";
        return "Insuficiente";
    }

    // Retorna true si saca 6 o mas
    public boolean estaAprobado() {
        return calificacion >= 6;
    }

    // Junta todo en un texto completo y claro
    public String getResumen() {
        String estado = estaAprobado() ? "Aprobado" : "Reprobado";
        String resumen = nombre + " saco un " + calificacion + ": " + obtenerDescripcion() + " — " + estado;
        
        // Y el opcional para puntos extra profe
        if (calificacion == 10) {
            resumen += "\n¡Felicidades, obtuviste la calificacion mas alta!";
        }
        
        return resumen;
    }
}