public class PruebaDispositivos {
    public static void main(String[] args) {
        DispositivoElectronico smartphone = new Smartphone("Galaxy A32", "Samsung");
        DispositivoElectronico tablet = new Tablet("Iphone 15 ProMax", "Apple");
        DispositivoElectronico computadora = new Computadora("ThinkPad X1", "Lenovo");

        // Probar el Smartphone
        System.out.println("Pruebas para el Smartphone:");
        smartphone.encender();
        smartphone.mostrarInformacion();
        smartphone.reiniciar();
        smartphone.apagar();
        System.out.println();

        // Probar la Tablet
        System.out.println("Pruebas para la Tablet:");
        tablet.encender();
        tablet.mostrarInformacion();
        tablet.reiniciar();
        tablet.apagar();
        System.out.println();

        // Probar la Computadora
        System.out.println("Pruebas para la Computadora:");
        computadora.encender();
        computadora.mostrarInformacion();
        computadora.reiniciar();
        computadora.apagar();
        System.out.println();
    }
}
