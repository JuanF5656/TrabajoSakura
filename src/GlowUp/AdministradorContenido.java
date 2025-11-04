package GlowUp;

public class AdministradorContenido extends Usuario {
    private boolean permisosEdicion;


    public AdministradorContenido(String nombre, String apellido, String email, String password, String rol, String fechaRegistro, String estadoCuenta, boolean permisosEdicion) {
        super(nombre, apellido, email, password, rol, fechaRegistro, estadoCuenta);
        this.permisosEdicion = this.permisosEdicion;
    }

    public boolean isPermisosEdicion() {
        return permisosEdicion;
    }

    public void setPermisosEdicion(boolean permisosEdicion) {
        this.permisosEdicion = permisosEdicion;
    }
}
