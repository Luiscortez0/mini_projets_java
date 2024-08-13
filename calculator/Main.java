import operations.*;
public class Main{
    public static void main(String[] args) {
        //hacer una instancia de la clase
        //la encapsulacion es esconder las variables de las clases
        Calculator miCalculator = new Calculator(0,0);
        //asignar valores con setters
        miCalculator.setN1(15);
        miCalculator.setN2(10);
        //imprimir los resultados de las operaciones
        System.out.println("Suma: " + miCalculator.suma());
        System.out.println("Resta: " + miCalculator.resta());
        System.out.println("Multiplicacion: " + miCalculator.multiplicacion());
        System.out.println("Division: " + miCalculator.division());
        //obtener los valores con getters
        System.out.println("el valor n1 es: " + miCalculator.getN1());
        System.out.println("el valor n2 es: " + miCalculator.getN2());
    }
}