package GlowUp;

import java.util.UUID;

public class Compra {
    private UUID id = UUID.randomUUID();
    private String fecha;
    private double total;
    private EstadoOrden estado;

    public Compra() {
    }

    public Compra(String fecha, double total, EstadoOrden estado) {
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public EstadoOrden getEstado() {
        return estado;
    }

    public UUID getId() {
        return id;
    }

    public void setEstado(EstadoOrden estado) {
        this.estado = estado;
    }
}
