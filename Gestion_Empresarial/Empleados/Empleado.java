package Empleados;

public class Empleado {
    private String nombre;
    private int id;
    private double salario;

    // Constructor
    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para calcular el salario final (será sobrescrito en las subclases)
    public double calcularSalarioFinal() {
        return salario;
    }

    // Método para mostrar detalles del empleado
    public String mostrarDetalles() {
        return "Nombre: " + nombre + "\nID: " + id + "\nSalario: " + salario;
    }
}
