package GlowUp;

import java.util.UUID;

public class Fabrica {
    private UUID id =  UUID.randomUUID();
    private String pais;
    private String ciudad;
    private int capacidad;
    private int nivelAutomatizacion;

    public Fabrica() {
    }

    public Fabrica(String pais, String ciudad, int capacidad, int nivelAutomatizacion) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.nivelAutomatizacion = nivelAutomatizacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNivelAutomatizacion() {
        return nivelAutomatizacion;
    }

    public void setNivelAutomatizacion(int nivelAutomatizacion) {
        this.nivelAutomatizacion = nivelAutomatizacion;
    }

    public UUID getId() {
        return id;
    }
}
