package Aves;

public class Canario extends Ave{
    //constructor
    public Canario(String especie, String color){
        super(especie,color);
    }
    public String cantar() {
        return "Cantar: El canto del canario es famoso por su melodía variada y alegre, " + 
               "\n        siendo una de las razones principales de su popularidad como mascota.";
    }    
}
