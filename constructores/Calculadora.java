public class Calculadora{
    double operando1;
    double operando2;
    //constructor
    public Calculadora(double operando1, double operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }
    //sobrecarga
    public Calculadora(double operando1){
        this.operando1 = operando1;
        this.operando2 = -1;
    }

    public double sumar(){
        return this.operando1 + this.operando2;
    }
    //sobrecarga de sumar
    public String sumar(String msg){
        return msg + ":" + (int)(this.operando1 + this.operando2);
    }

    public double sumarDesdeMain(double n1, double n2){
        return n1 + n2;
    }
    //sobrecarga de sumarDesdeMain
    public int sumarDesdeMain(int n1, int n2){
        return n1 + n2;
    }

    //operacion cuadrado
    public double cuadrado(){
        return this.operando1 * this.operando1;
    }

    //peces
    public double times(int times){
        double suma = 0;
        for (int i = 1; i <= times; i++) {
            suma += this.operando1;
        }
        return suma;
    }
}