package GlowUp;

public class RegistroEsclavos {
    private String ultimoAcceso;
    private int nivelCifrado;

    public RegistroEsclavos(String ultimoAcceso, int nivelCifrado) {
        this.ultimoAcceso = ultimoAcceso;
        this.nivelCifrado = nivelCifrado;
    }

    public RegistroEsclavos() {
    }

    public String getUltimoAcceso() {
        return ultimoAcceso;
    }

    public void setUltimoAcceso(String ultimoAcceso) {
        this.ultimoAcceso = ultimoAcceso;
    }

    public int getNivelCifrado() {
        return nivelCifrado;
    }

    public void setNivelCifrado(int nivelCifrado) {
        this.nivelCifrado = nivelCifrado;
    }
}
