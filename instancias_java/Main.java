public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases
        Suma misuma = new Suma();
        Resta miresta = new Resta();
        Multiplicacion mimultiplicacion = new Multiplicacion();
        Division midivision = new Division();

        // Ejemplos de operaciones
        System.out.println("Suma: " + misuma.sumar(4, 5));
        System.out.println("Resta: " + miresta.restar(10, 3));
        System.out.println("Multiplicación: " + mimultiplicacion.multiplicar(6, 8));
        System.out.println("División: " + midivision.dividir(20, 4));
    }
}