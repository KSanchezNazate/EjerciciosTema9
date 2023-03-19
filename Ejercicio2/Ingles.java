import java.util.Scanner;

public class Ingles implements Traduccion{
    private Scanner sc = new Scanner(System.in);

    @Override
    public double introducirDistancia() {
        System.out.println("Enter the distance in kilometers:");
        return sc.nextDouble();
    }

    @Override
    public double introducirTiempo() {
        System.out.println("Enter the time in hours:");
        return sc.nextDouble();
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("The average speed is:");
    }

    @Override
    public void finRespuesta(double velocidadMedia) {
        System.out.printf("%.2f kilometers per hour\n", velocidadMedia);
    }
}