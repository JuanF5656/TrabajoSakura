package GlowUp;

import java.util.UUID;

public class TrabajadorEsclavizado {
    private UUID id =  UUID.randomUUID();
    private String nombre;
    private String paisOrigen;
    private String edad;
    private String fechaCaptura;
    private String salud;
    private Fabrica asignadoA;

    public TrabajadorEsclavizado(String nombre, String paisOrigen, String edad, String fechaCaptura, String salud, Fabrica asignadoA) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.edad = edad;
        this.fechaCaptura = fechaCaptura;
        this.salud = salud;
        this.asignadoA = asignadoA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFechaCaptura() {
        return fechaCaptura;
    }

    public void setFechaCaptura(String fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    public Fabrica getAsignadoA() {
        return asignadoA;
    }

    public void setAsignadoA(Fabrica asignadoA) {
        this.asignadoA = asignadoA;
    }

    public UUID getId() {
        return id;
    }
}
