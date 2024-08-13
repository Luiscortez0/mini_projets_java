class Computadora implements DispositivoElectronico {
    private String modelo;
    private String marca;

    public Computadora(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public void encender() {
        System.out.println("La computadora está encendida.");
    }

    public void apagar() {
        System.out.println("La computadora está apagada.");
    }

    public void reiniciar() {
        System.out.println("La computadora se está reiniciando.");
    }

    public void mostrarInformacion() {
        System.out.println("Computadora - Marca: " + marca + ", Modelo: " + modelo);
    }
}
