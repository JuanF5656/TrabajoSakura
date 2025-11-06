package GlowUp;

import java.util.ArrayList;
import java.util.UUID;

public class Carrito {
    private UUID id= UUID.randomUUID();
    private String fechaCreacion;
    private ArrayList<Producto> productos= new ArrayList<Producto>();

    public Carrito() {
    }

    public Carrito(String fechaCreacion,  ArrayList<Producto> productos) {
        this.fechaCreacion = fechaCreacion;
        this.productos = productos;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public UUID getId() {
        return id;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
