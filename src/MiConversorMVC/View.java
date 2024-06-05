import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public String obtenerUnidadOrigen() {
        System.out.print("Ingrese la unidad de origen (cm/in): ");
        String unidad = scanner.nextLine();
        while (!unidad.equals("cm") && !unidad.equals("in")) {
            System.out.print("Unidad de origen no válida. Ingrese 'cm' o 'in': ");
            unidad = scanner.nextLine();
        }
        return unidad;
    }

    public String obtenerUnidadDestino() {
        System.out.print("Ingrese la unidad de destino (cm/in): ");
        String unidad = scanner.nextLine();
        while (!unidad.equals("cm") && !unidad.equals("in")) {
            System.out.print("Unidad de destino no válida. Ingrese 'cm' o 'in': ");
            unidad = scanner.nextLine();
        }
        return unidad;
    }

    public double obtenerCantidad() {
        System.out.print("Ingrese la cantidad a convertir: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Cantidad no válida. Ingrese un número: ");
            scanner.next(); // Descartar la entrada no válida
        }
        return scanner.nextDouble();
    }

    public void mostrarResultado(double resultado, String unidadDestino) {
        System.out.println("El resultado de la conversión es: " + resultado + " " + unidadDestino);
    }
}