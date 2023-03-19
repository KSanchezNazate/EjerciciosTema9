import java.time.LocalDate;

public abstract class Ciclo {
    protected String marca;
    protected String modelo;
    protected LocalDate fechaCompra;

    public Ciclo    (String marca, String modelo, LocalDate fechaCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
    }

    public abstract double calcularPrecioAlquiler();

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }
}