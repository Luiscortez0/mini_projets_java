import Empleados.*;
public class Main {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto empTiempoCompleto = new EmpleadoTiempoCompleto("Luis", 1, 2500, 5000);
        EmpleadoPorHoras empPorHoras = new EmpleadoPorHoras("Carlos", 2, 0, 100, 20);
        EmpleadoTemporal empTemporal = new EmpleadoTemporal("Cortez", 3, 2000, "2024-01-01", "2024-06-30");

        System.out.println(empTiempoCompleto.mostrarDetalles());
        System.out.println("Salario Final: " + empTiempoCompleto.calcularSalarioFinal());
        System.out.println();

        System.out.println(empPorHoras.mostrarDetalles());
        System.out.println("Salario Final: " + empPorHoras.calcularSalarioFinal());
        System.out.println();

        System.out.println(empTemporal.mostrarDetalles());
        System.out.println("Salario Final: " + empTemporal.calcularSalarioFinal());
    }
}
