import java.util.Scanner;
public class Espanol implements Traduccion{
    private Scanner sc = new Scanner(System.in);

    @Override
    public double introducirDistancia() {
        System.out.println("Introduce la distancia en kilometros:");
        return sc.nextDouble();
    }

    @Override
    public double introducirTiempo() {
        System.out.println("Introduce el tiempo en horas:");
        return sc.nextDouble();
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("La velocidad media es:");
    }

    @Override
    public void finRespuesta(double velocidadMedia) {
        System.out.printf("%.2f kilometros por hora\n", velocidadMedia);
    }
}