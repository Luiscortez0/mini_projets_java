import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class siceuc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> estudiantes = new HashMap<>();
        Map<Integer, Map<String, Double>> calificaciones = new HashMap<>();
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar información de un estudiante");
            System.out.println("3. Editar calificaciones de un estudiante");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            int op = scanner.nextInt();
            switch (op) {
                case 0: // salir
                    scanner.close();
                    continuar = false;
                break;
                case 1: // agregar estudiante
                    System.out.println("Ingrese el nuevo ID:");
                    int newid = scanner.nextInt();
                    // Verificar si el ID ya existe
                    if (estudiantes.containsKey(newid)) {
                        System.out.println("Error: El ID ingresado ya está en uso.");
                    } else {
                        System.out.println("Ingrese el nombre del estudiante:");
                        scanner.nextLine(); // Limpiar el buffer del scanner
                        String newname = scanner.nextLine();
                        estudiantes.put(newid, newname);
                        calificaciones.put(newid, new HashMap<>()); // Crear un nuevo mapa de calificaciones para el estudiante
                        System.out.println("Estudiante agregado correctamente.");
                    }
                break;
                case 2: // mostrar información de un estudiante
                    System.out.println("Ingresa el ID del estudiante: ");
                    int idEstudiante = scanner.nextInt();
                    String nombreEstudiante = estudiantes.get(idEstudiante);
                    if (nombreEstudiante != null) {
                        System.out.println("Nombre del estudiante: " + nombreEstudiante);
                        System.out.println("Calificaciones:");
                        Map<String, Double> califs = calificaciones.get(idEstudiante);
                        if (califs.isEmpty()) {
                            System.out.println("No hay calificaciones registradas para este estudiante.");
                        } else {
                            for (Map.Entry<String, Double> entry : califs.entrySet()) {
                                System.out.println(entry.getKey() + ": " + entry.getValue());
                            }
                        }
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                break;
                case 3: // editar calificaciones de un estudiante
                    System.out.println("Ingrese el ID del estudiante:");
                    int idEstudianteEditar = scanner.nextInt();
                    String nombreEstudianteEditar = estudiantes.get(idEstudianteEditar);
                    if (nombreEstudianteEditar != null) {
                        System.out.println("Estudiante encontrado: " + nombreEstudianteEditar);
                        System.out.println("Ingrese el nombre de la materia:");
                        scanner.nextLine(); // Limpiar el buffer del scanner
                        String nombreMateria = scanner.nextLine();
                        System.out.println("Ingrese la calificación para " + nombreMateria + ":");
                        double calificacionMateria = scanner.nextDouble();
                        // Obtener el mapa de calificaciones del estudiante
                        Map<String, Double> califsEstudiante = calificaciones.get(idEstudianteEditar);
                        // Agregar la calificación para la materia especificada
                        califsEstudiante.put(nombreMateria, calificacionMateria);
                        System.out.println("Calificación agregada correctamente para " + nombreMateria);
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                break;
                default: // opción errónea
                    System.out.println("Error: Opción inválida");
                break;
            }
        }
    }
}