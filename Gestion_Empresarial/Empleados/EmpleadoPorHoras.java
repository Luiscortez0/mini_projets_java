package Empleados;

public class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;
    private double tarifaPorHora;

    // Constructor
    public EmpleadoPorHoras(String nombre, int id, double salario, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, id, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    // Getters y Setters para horas trabajadas y tarifa por hora
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    // Override de calcularSalarioFinal
    @Override
    public double calcularSalarioFinal() {
        return horasTrabajadas * tarifaPorHora;
    }

    // Override de mostrarDetalles
    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + "\nHoras Trabajadas: " + horasTrabajadas + "\nTarifa por Hora: " + tarifaPorHora;
    }
}
