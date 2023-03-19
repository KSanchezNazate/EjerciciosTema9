import java.time.LocalDate;

public class Segway extends Ciclo {
    private double autonomiaKm;
    private double alturaMinima;

    public Segway(String marca, String modelo, LocalDate fechaCompra, double autonomiaKm, double alturaMinima) {
        super(marca, modelo, fechaCompra);
        this.autonomiaKm = autonomiaKm;
        this.alturaMinima = alturaMinima;
    }

    @Override
    public double calcularPrecioAlquiler() {
        double precioBase = 18.90;
        if (alturaMinima > 1.5) {
            precioBase += 5.0;
        }
        if (autonomiaKm > 30.0) {
            precioBase += 3.0;
        }
        return precioBase;
    }

    public double getAutonomiaKm() {
        return autonomiaKm;
    }

    public double getAlturaMinima() {
        return alturaMinima;
    }
}