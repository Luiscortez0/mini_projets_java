package Aves;

public class Aguila extends Ave{
    //constructor
    public Aguila(String especie, String color){
        super(especie,color);
    }
    public String volarAlto() {
        return "Volar: Las águilas son aves rapaces majestuosas que pueden volar a altitudes impresionantes. "+
               "\n       En promedio, vuelan entre 500 y 10,000 pies (150 a 3,000 metros) sobre el suelo, "+
               "\n       aunque algunas especies han sido avistadas a alturas mucho mayores durante el vuelo migratorio.";
    }    
}
