package GlowUp;

public class LineaCompra {
    private int cantidad;
    private double precioUnd;
    private double subtotal;

    public LineaCompra() {
    }

    public LineaCompra(int cantidad, double precioUnd, double subtotal) {
        this.cantidad = cantidad;
        this.precioUnd = precioUnd;
        this.subtotal = subtotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnd() {
        return precioUnd;
    }

    public void setPrecioUnd(double precioUnd) {
        this.precioUnd = precioUnd;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
