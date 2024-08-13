package Cursos;

public class Curso {
    private String nombre;
    private String profesor;
    private int capacidad;

    // Constructor
    public Curso(String nombre, String profesor, int capacidad) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.capacidad = capacidad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    // Método para mostrar detalles
    public String mostrarDetalles() {
        return "Curso: " + nombre + "\nProfesor: " + profesor + "\nCapacidad: " + capacidad;
    }
}
