class Leon extends Animal {
    private String habitat;
    private String nombre;

    public Leon(String nombre, String habitat) {
        this.nombre = nombre;
        this.habitat = habitat;
    }

    @Override
    void emitirSonido() {
        System.out.println("El león " + nombre + " ruge: ¡Roaaar!");
    }

    @Override
    void dormir() {
        System.out.println("El león " + nombre + " está durmiendo en " + habitat + ".");
    }
}
