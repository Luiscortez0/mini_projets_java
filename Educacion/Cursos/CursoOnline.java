package Cursos;

public class CursoOnline extends Curso{
    private String url;

    // Constructor
    public CursoOnline(String nombre, String profesor, int capacidad, String url) {
        super(nombre, profesor, capacidad);
        this.url = url;
    }

    // Getter y Setter para URL
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // Override del método mostrarDetalles
    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + "\nURL: " + url;
    }
}
