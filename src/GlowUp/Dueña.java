package GlowUp;

public class Dueña extends Usuario {
    private String claveMaestra;
    private String fechaCoronacion;

    public Dueña(String nombre, String apellido, String email, String password, String rol, String fechaRegistro, String estadoCuenta, String claveMaestra, String fechaCoronacion) {
        super(nombre, apellido, email, password, rol, fechaRegistro, estadoCuenta);
        this.claveMaestra = claveMaestra;
        this.fechaCoronacion = fechaCoronacion;
    }

    public String getClaveMaestra() {
        return claveMaestra;
    }

    public void setClaveMaestra(String claveMaestra) {
        this.claveMaestra = claveMaestra;
    }

    public String getFechaCoronacion() {
        return fechaCoronacion;
    }

    public void setFechaCoronacion(String fechaCoronacion) {
        this.fechaCoronacion = fechaCoronacion;
    }
}
