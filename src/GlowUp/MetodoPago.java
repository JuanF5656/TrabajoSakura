package GlowUp;

import java.util.UUID;

public class MetodoPago {
    private UUID id =  UUID.randomUUID();
    private String tipo;
    private String titular;
    private double numeroEnmascarado;

    public MetodoPago() {
    }

    public MetodoPago(String tipo, String titular, double numeroEnmascarado) {
        this.tipo = tipo;
        this.titular = titular;
        this.numeroEnmascarado = numeroEnmascarado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getNumeroEnmascarado() {
        return numeroEnmascarado;
    }

    public void setNumeroEnmascarado(double numeroEnmascarado) {
        this.numeroEnmascarado = numeroEnmascarado;
    }

    public UUID getId() {
        return id;
    }
}
