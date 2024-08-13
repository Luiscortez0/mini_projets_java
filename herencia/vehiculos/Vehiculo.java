package vehiculos;

public class Vehiculo {
    private String marca;
    private int year;
    //constructor
    public Vehiculo(String marca, int year){
        this.marca = marca;
        this.year = year;
    }
    //mostrar informacion
    public String mostrarDetalles(){
        return "Marca: " + this.marca + "\n year: " + this.year;
    }
    //getters
    public String getMarca(){
        return this.marca;
    }
    public int getYear(){
        return this.year;
    }
    //setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setYear(int year){
        this.year = year;
    }
}
