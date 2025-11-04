package GlowUp;

public class DesarrolladorProducto extends Usuario{
    private String especialidad;

    public DesarrolladorProducto() {
    }

    public DesarrolladorProducto(String nombre, String apellido, String email, String password, String rol, String fechaRegistro, String estadoCuenta, String especialidad) {
        super(nombre, apellido, email, password, rol, fechaRegistro, estadoCuenta);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
