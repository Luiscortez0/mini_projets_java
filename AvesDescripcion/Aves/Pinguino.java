package Aves;

public class Pinguino extends Ave{
    //constructor
    public Pinguino(String especie, String color){
        super(especie,color);
    }
    public String nadar() {
        return "Nadar: Los pingüinos son nadadores expertos, con cuerpos aerodinámicos y aletas que les permiten"+
               "\n       deslizarse rápidamente bajo el agua, alcanzando velocidades de hasta 20 mph (32 km/h).";
    }   
}
