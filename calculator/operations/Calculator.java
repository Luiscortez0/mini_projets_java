package operations;

public class Calculator {
    private int n1;
    private int n2;
    //crear constructor
    public Calculator(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    //crear clases para las operaciones
    public int suma(){
        return n1+n2;
    }
    public int resta(){
        return n1-n2;
    }
    public int multiplicacion(){
        return n1*n2;
    }
    public double division(){
        if(n2==0){
            System.out.println("Error: base 0");
        }
        return n1/(double) n2;
    }

    //crear setters
    public void setN1(int n1){
        this.n1 = n1;
    }
    public void setN2(int n2){
        this.n2 = n2;
    }

    //crear getters
    public int getN1(){
        return this.n1;
    }
    public int getN2(){
        return this.n2;
    }
}