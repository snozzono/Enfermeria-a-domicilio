package Modelo;

public class Tecnico {

    int run_tec;
    String usuario;
    char [] passwrd;

    public Tecnico(int run_tec, String usuario, char [] passwrd) {
        this.run_tec = run_tec;
        this.usuario = usuario;
        this.passwrd = passwrd;
    }

    public Tecnico(String usuario, char [] passwrd) {
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

    public char[] getPasswrd() {
        return passwrd;
    }

    public void setPasswrd(char[] passwrd) {
        this.passwrd = passwrd;
    }

}
