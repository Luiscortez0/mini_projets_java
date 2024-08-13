package Cursos;

public class CursoHibrido extends Curso{
    private String url;
    private String sala;

    // Constructor
    public CursoHibrido(String nombre, String profesor, int capacidad, String url, String sala) {
        super(nombre, profesor, capacidad);
        this.url = url;
        this.sala = sala;
    }

    // Getters y Setters para URL y Sala
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    // Override del método mostrarDetalles
    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + "\nURL: " + url + "\nSala: " + sala;
    }
}
