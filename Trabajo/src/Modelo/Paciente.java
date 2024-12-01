
package Modelo;

public class Paciente {
    int run_pac, tec_run_tec;
    String nombre_p, diagn;

    public Paciente(int run_pac, int tec_run_tec, String nombre_p, String diagn) {
        this.run_pac = run_pac;
        this.nombre_p = nombre_p;
        this.diagn = diagn;
        this.tec_run_tec = tec_run_tec;
    }

    public Paciente() {

    }

    public int getTec_run_tec() {
        return tec_run_tec;
    }

    public void setTec_run_tec(int tec_run_tec) {
        this.tec_run_tec = tec_run_tec;
    }

    
    public int getRun_pac() {
        return run_pac;
    }

    public void setRun_pac(int run_pac) {
        this.run_pac = run_pac;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public void setNombre_p(String nombre_p) {
        this.nombre_p = nombre_p;
    }

    public String getDiagn() {
        return diagn;
    }

    public void setDiagn(String diagn) {
        this.diagn = diagn;
    }
    
    
}
