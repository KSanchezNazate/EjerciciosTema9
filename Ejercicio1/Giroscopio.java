import java.time.LocalDate;

public class Giroscopio extends Ciclo {
    private int autonomiaKm;
    private static final double TARIFA_ALQUILER = 29.90;

    public Giroscopio(String marca, String modelo, LocalDate fechaCompra, int autonomiaKm) {
        super(marca, modelo, fechaCompra);
        this.autonomiaKm = autonomiaKm;
    }

    @Override
    public double calcularPrecioAlquiler() {
        return TARIFA_ALQUILER;
    }

    public int getAutonomiaKm() {
        return autonomiaKm;
    }
}