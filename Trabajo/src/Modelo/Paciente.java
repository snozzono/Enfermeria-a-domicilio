
package Modelo;

public class Paciente {
    int run_pac;
    String nombre_p, diagn, obs;

    public Paciente(int run_pac, String nombre_p, String diagn, String obs) {
        this.run_pac = run_pac;
        this.nombre_p = nombre_p;
        this.diagn = diagn;
        this.obs = obs;
    }

    public Paciente(int run_pac) {
        this.run_pac = run_pac;
    }

    public Paciente() {
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

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
