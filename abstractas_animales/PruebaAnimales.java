public class PruebaAnimales {
    public static void main(String[] args) {
        // Crear instancias de cada animal
        Animal leon = new Leon("Simba", "la sabana");
        Animal elefante = new Elefante("Dumbo", 5000);
        Animal canguro = new Canguro("Joey", 1.8);

        // Probar el león
        System.out.println("Pruebas para el León:");
        leon.emitirSonido();
        leon.dormir();
        System.out.println();

        // Probar el elefante
        System.out.println("Pruebas para el Elefante:");
        elefante.emitirSonido();
        elefante.dormir();
        System.out.println();

        // Probar el canguro
        System.out.println("Pruebas para el Canguro:");
        canguro.emitirSonido();
        canguro.dormir();
        System.out.println();
    }
}
