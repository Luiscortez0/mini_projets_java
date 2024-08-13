package Cursos;

public class CursoPresencial extends Curso{
    private String sala;

    // Constructor
    public CursoPresencial(String nombre, String profesor, int capacidad, String sala) {
        super(nombre, profesor, capacidad);
        this.sala = sala;
    }

    // Getter y Setter para Sala
    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    // Override del método mostrarDetalles
    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + "\nSala: " + sala;
    }
}
