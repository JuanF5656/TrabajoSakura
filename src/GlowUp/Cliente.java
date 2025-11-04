package GlowUp;

import java.util.ArrayList;

public class Cliente extends Usuario {
    private String direccionEnvio;
    private String telefono;
    private ArrayList<MetodoPago> metodosPago;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String email, String password, String rol, String fechaRegistro, String estadoCuenta, String direccionEnvio, String telefono, ArrayList<MetodoPago> metodosPago) {
        super(nombre, apellido, email, password, rol, fechaRegistro, estadoCuenta);
        this.direccionEnvio = direccionEnvio;
        this.telefono = telefono;
        this.metodosPago = metodosPago;
    }
}
