import java.time.LocalDate;

public class Bicicleta extends Ciclo {
    private int numVelocidades;

    public Bicicleta(String marca, String modelo, LocalDate fechaCompra, int numVelocidades) {
        super(marca, modelo, fechaCompra);
        this.numVelocidades = numVelocidades;
    }

    @Override
    public double calcularPrecioAlquiler() {
        return 4.90;
    }

    public int getNumVelocidades() {
        return numVelocidades;
    }
}