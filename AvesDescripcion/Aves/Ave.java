package Aves;

public class Ave {
    private String especie;
    private String color;
    //constructor
    public Ave(String especie, String color){
        this.especie = especie;
        this.color = color;
    }
    //mostrar informacion
    public String mostrarDetalles(){
        return "Especie: " + this.especie + "\n Color: " + this.color;
    }
    //getters
    public String getEspecie(){
        return this.especie;
    }
    public String getColor(){
        return this.color;
    }
    //setters
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public void setColor(String color){
        this.color = color;
    }
}
