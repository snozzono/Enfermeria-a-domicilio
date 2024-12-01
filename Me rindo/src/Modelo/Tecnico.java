package Modelo;

public class Tecnico {

    int run_tec;
    String usuario, passwrd;

    public Tecnico(int run_tec, String usuario, String passwrd) {
        this.run_tec = run_tec;
        this.usuario = usuario;
        this.passwrd = passwrd;
    }

    public Tecnico(String usuario, String passwrd) {
        this.usuario = usuario;
        this.passwrd = passwrd;
    }

    public Tecnico() {
    }

    public int getRun_tec() {
        return run_tec;
    }

    public void setRun_tec(int run_tec) {
        this.run_tec = run_tec;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPasswrd() {
        return passwrd;
    }

    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;
    }

}
