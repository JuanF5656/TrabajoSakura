package GlowUp;

import java.util.UUID;

public class Carrito {
    private UUID id= UUID.randomUUID();
    private String fechaCreacion;

    public Carrito() {
    }

    public Carrito(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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
}
