package GlowUp;

public class LineaCarrito {
    private int Cantidad;
    private double subtotal;

    public LineaCarrito() {
    }

    public LineaCarrito(int cantidad, double subtotal) {
        Cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
