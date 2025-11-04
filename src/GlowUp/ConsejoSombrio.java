package GlowUp;

import java.util.UUID;

public class ConsejoSombrio {
    private UUID id= UUID.randomUUID();
    private String nombreClave;

    public ConsejoSombrio(String nombreClave) {
        this.nombreClave = nombreClave;
    }

    public UUID getId() {
        return id;
    }

    public String getNombreClave() {
        return nombreClave;
    }

    public void setNombreClave(String nombreClave) {
        this.nombreClave = nombreClave;
    }
}
