package Empleados;

public class EmpleadoTiempoCompleto extends Empleado{
    private double bonificacionAnual;

    // Constructor
    public EmpleadoTiempoCompleto(String nombre, int id, double salario, double bonificacionAnual) {
        super(nombre, id, salario);
        this.bonificacionAnual = bonificacionAnual;
    }

    // Getter y Setter para bonificación anual
    public double getBonificacionAnual() {
        return bonificacionAnual;
    }

    public void setBonificacionAnual(double bonificacionAnual) {
        this.bonificacionAnual = bonificacionAnual;
    }

    // Override de calcularSalarioFinal
    @Override
    public double calcularSalarioFinal() {
        return getSalario() + bonificacionAnual;
    }

    // Override de mostrarDetalles
    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + "\nBonificación Anual: " + bonificacionAnual;
    }
}
