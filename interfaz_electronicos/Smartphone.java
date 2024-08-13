class Smartphone implements DispositivoElectronico {
    private String modelo;
    private String marca;

    public Smartphone(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public void encender() {
        System.out.println("El smartphone está encendido.");
    }

    public void apagar() {
        System.out.println("El smartphone está apagado.");
    }

    public void reiniciar() {
        System.out.println("El smartphone se está reiniciando.");
    }

    public void mostrarInformacion() {
        System.out.println("Smartphone - Marca: " + marca + ", Modelo: " + modelo);
    }
}
