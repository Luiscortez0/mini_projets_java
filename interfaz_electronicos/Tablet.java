class Tablet implements DispositivoElectronico {
    private String modelo;
    private String marca;

    public Tablet(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public void encender() {
        System.out.println("La tablet está encendida.");
    }

    public void apagar() {
        System.out.println("La tablet está apagada.");
    }

    public void reiniciar() {
        System.out.println("La tablet se está reiniciando.");
    }

    public void mostrarInformacion() {
        System.out.println("Tablet - Marca: " + marca + ", Modelo: " + modelo);
    }
}
