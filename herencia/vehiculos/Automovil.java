package vehiculos;

public class Automovil extends Vehiculo{
    private String modelo;
    //constructor
    public Automovil(String marca, int year, String modelo){
        super(marca, year);
        this.modelo = modelo;
    }
    //getter
    public String getmodelo(){
        return this.modelo;
    }
    //setters
    public void setmodelo(String modelo){
        this.modelo = modelo;
    }
    @Override//annotations
    public String mostrarDetalles(){
        return super.mostrarDetalles() + "\n modelo: " + this.modelo;
    }
}
