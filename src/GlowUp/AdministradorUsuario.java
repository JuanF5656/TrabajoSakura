package GlowUp;

public class AdministradorUsuario extends Usuario {
    private int nivelAcceso;

    public AdministradorUsuario() {
    }

    public AdministradorUsuario(String nombre, String apellido, String email, String password, String rol, String fechaRegistro, String estadoCuenta, int nivelAcceso) {
        super(nombre, apellido, email, password, rol, fechaRegistro, estadoCuenta);
        this.nivelAcceso = nivelAcceso;
    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }
}
