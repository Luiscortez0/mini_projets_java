import Cursos.*;
public class Main {
    public static void main(String[] args) {
        CursoOnline cursoOnline = new CursoOnline("Programación", "Walter mata", 40, "http://cursojava.com");
        CursoPresencial cursoPresencial = new CursoPresencial("Algebra", "Elizabeth santiago", 30, "Sala 2B");
        CursoHibrido cursoHibrido = new CursoHibrido("Ingles", "Luis Benavides", 50, "http://cursoingles.com", "Sala 2B");

        System.out.println(cursoOnline.mostrarDetalles());
        System.out.println();
        System.out.println(cursoPresencial.mostrarDetalles());
        System.out.println();
        System.out.println(cursoHibrido.mostrarDetalles());
    }
}