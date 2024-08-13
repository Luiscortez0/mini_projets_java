class Elefante extends Animal {
    private double peso;
    private String nombre;

    public Elefante(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    void emitirSonido() {
        System.out.println("El elefante " + nombre + " barrita: ¡Prrrrr!");
    }

    @Override
    void dormir() {
        System.out.println("El elefante " + nombre + " está durmiendo. Pesa " + peso + " kg.");
    }
}
