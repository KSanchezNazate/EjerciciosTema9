import java.util.Scanner;
import java.time.LocalDate;

public class Ejercicio1 {
    public static void main(String[] args) {
        Ciclo[] ciclos = {
                new Bicicleta("1 Lapierre", "Speed 400", LocalDate.of(2022, 1, 1), 27),
                new Bicicleta("2 Btwin", "Riverside 900", LocalDate.of(2023, 1, 1), 10),
                new Giroscopio("3 Segway", "Nine", LocalDate.of(2023, 1, 1), 40),
                new Giroscopio("4 Weebot", "Echo", LocalDate.of(2022, 1, 1), 35),
                new Segway("5 Immotion", "v8", LocalDate.of(2023, 1, 1), 40, 1.6),
                new Segway("6 Segway", "Ninebot One E+", LocalDate.of(2023, 1, 1), 30, 1.5)
        };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Estos son los ciclos que ofrecemos en alquiler:");
            for (Ciclo ciclo : ciclos) {
                System.out.println("- " + ciclo.getMarca() + " " + ciclo.getModelo() + " (" +
                        LocalDate.now().until(ciclo.getFechaCompra()).getYears() +
                        " año" + (LocalDate.now().until(ciclo.getFechaCompra()).getYears() > 1 ? "s" : "") +
                        ") " +
                        (ciclo instanceof Bicicleta ? ((Bicicleta) ciclo).getNumVelocidades() + " velocidades" :
                                ciclo instanceof Giroscopio ? ((Giroscopio) ciclo).getAutonomiaKm() + " km de autonomía " +
                                        "[1h" + ((Giroscopio) ciclo).getAutonomiaKm() / 22 + " min]" :
                                        ((Segway) ciclo).getAutonomiaKm() + " km de autonomía") +
                        " " + ciclo.calcularPrecioAlquiler() + "€/hora ");
            }

            System.out.println();
            System.out.println("Por favor, seleccione una opción:");
            System.out.println("1. Alquilar un ciclo");
            System.out.println("2. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Por favor, seleccione el ciclo que desea alquilar (1-" + ciclos.length + "):");
                    int indiceCiclo = scanner.nextInt() - 1;
                    System.out.println("Ha alquilado un " + ciclos[indiceCiclo].getMarca() + " " +
                            ciclos[indiceCiclo].getModelo() + " por " +
                            ciclos[indiceCiclo].calcularPrecioAlquiler() + "€/hora.");
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}