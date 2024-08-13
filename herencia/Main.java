import vehiculos.Automovil;
import vehiculos.Vehiculo;

public class Main{
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo("MG", 1998);
        System.out.println(miVehiculo.mostrarDetalles());

        Automovil miAuto = new Automovil("volvo", 2000, "clase 1");
        System.out.println(miAuto.mostrarDetalles());
    }
}