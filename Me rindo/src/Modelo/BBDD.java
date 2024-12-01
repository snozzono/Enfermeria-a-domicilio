package Modelo;

/**
 *
 * @author Snozz
 */
public class BBDD {

    int llamado, administrador, medicamento, paciente, procedimiento, tecnico, origen;

    public BBDD() {
    }

    public BBDD(int llamado, int administrador, int medicamento, int paciente, int procedimiento, int tecnico, int origen) {
        this.llamado = llamado;
        this.administrador = administrador;
        this.medicamento = medicamento;
        this.paciente = paciente;
        this.procedimiento = procedimiento;
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

    public int getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(int medicamento) {
        this.medicamento = medicamento;
    }

    public int getPaciente() {
        return paciente;
    }

    public void setPaciente(int paciente) {
        this.paciente = paciente;
    }

    public int getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(int procedimiento) {
        this.procedimiento = procedimiento;
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
