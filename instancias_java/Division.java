public class Division {
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0; // O podrías manejar esto de otra manera, como lanzar una excepción
        }
        return a / b;
    }
}