package Modelo;

/**
 *
 * @author Snozz
 */
public class BBDD {

    int llamado, administrador, paciente, tecnico, origen;

    public BBDD() {
    }

    public BBDD(int llamado, int administrador, int paciente, int tecnico, int origen) {
        this.llamado = llamado;
        this.administrador = administrador;
        this.paciente = paciente;
        this.tecnico = tecnico;
        this.origen = origen;
    }

    public int getLlamado() {
        return llamado;
    }

    public void setLlamado(int llamado) {
        this.llamado = llamado;
    }

    public int getAdministrador() {
        return administrador;
    }

    public void setAdministrador(int administrador) {
        this.administrador = administrador;
    }

    public int getPaciente() {
        return paciente;
    }

    public void setPaciente(int paciente) {
        this.paciente = paciente;
    }

    public int getTecnico() {
        return tecnico;
    }

    public void setTecnico(int tecnico) {
        this.tecnico = tecnico;
    }

    public int getOrigen() {
        return origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

}
