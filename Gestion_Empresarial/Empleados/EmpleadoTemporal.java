package Empleados;

public class EmpleadoTemporal extends Empleado{
    private String fechaInicio;
    private String fechaFin;

    // Constructor
    public EmpleadoTemporal(String nombre, int id, double salario, String fechaInicio, String fechaFin) {
        super(nombre, id, salario);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Getters y Setters para fecha de inicio y fin
    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    // Override de calcularSalarioFinal (considerando un bonus al finalizar el contrato)
    @Override
    public double calcularSalarioFinal() {
        // Ejemplo: bono del 10% del salario al finalizar el contrato
        return getSalario() * 1.1;
    }

    // Override de mostrarDetalles
    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + "\nFecha de Inicio: " + fechaInicio + "\nFecha de Fin: " + fechaFin;
    }
}
