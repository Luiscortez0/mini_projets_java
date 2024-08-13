public class Main {
    public static void main(String[] args) {
        Calculadora miCalc2 = new Calculadora(4,5);
        Calculadora miCalc1 = new Calculadora(4);
        System.out.println(miCalc1.times(3));
        System.out.println(miCalc1.cuadrado());
        System.out.println(miCalc2.times(2));
        System.out.println(miCalc2.sumar());
    }
}
