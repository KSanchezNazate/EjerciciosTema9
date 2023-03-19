import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select language / Seleccione idioma: ");
        System.out.println("1. English");
        System.out.println("2. Español");
        int idioma = sc.nextInt();

        Traduccion traduccion;
        switch (idioma) {
            case 1:
                traduccion = new Ingles();
                break;
            case 2:
                traduccion = new Espanol();
                break;
            default:
                System.out.println("Idioma no válido");
                return;
        }

        double distancia = traduccion.introducirDistancia();
        double tiempo = traduccion.introducirTiempo();
        double velocidadMedia = distancia / tiempo;

        traduccion.inicioRespuesta();
        traduccion.finRespuesta(velocidadMedia);
    }

}