import Aves.Aguila;
import Aves.Ave;
import Aves.Canario;
import Aves.Pinguino;

public class Main{
    public static void main(String[] args) {
        Ave miAve = new Ave("Perico","Verde");
        System.out.println(miAve.mostrarDetalles());
        System.out.println("\n");

        Aguila miAguila = new Aguila("Aguila","Negro");
        System.out.println(miAguila.mostrarDetalles());
        System.out.println(miAguila.volarAlto());
        System.out.println("\n");

        Canario miCanario = new Canario("Canario","Azul Cielo");
        System.out.println(miCanario.mostrarDetalles());
        System.out.println(miCanario.cantar());
        System.out.println("\n");

        Pinguino miPinguino = new Pinguino("Pinguino","Blanco/Negro");
        System.out.println(miPinguino.mostrarDetalles());
        System.out.println(miPinguino.nadar());
        System.out.println("\n");
    }
}
