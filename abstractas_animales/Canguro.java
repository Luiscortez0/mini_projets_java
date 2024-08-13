class Canguro extends Animal {
    private double altura;
    private String nombre;

    public Canguro(String nombre, double altura) {
        this.nombre = nombre;
        this.altura = altura;
    }

    @Override
    void emitirSonido() {
        System.out.println("El canguro " + nombre + " hace un sonido característico: ¡Click click!");
    }

    @Override
    void dormir() {
        System.out.println("El canguro " + nombre + " está durmiendo. Mide " + altura + " metros.");
    }
}
