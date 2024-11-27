package Modelo;

public class Administrador {

    String usuario;
    char[] passwrd;
    int id_admin;

    public Administrador(int id_admin, String usuario, char[] passwrd) {
        this.id_admin = id_admin;
        this.usuario = usuario;
        this.passwrd = passwrd;
    }

    public Administrador(String usuario, char[] passwrd) {
        this.usuario = usuario;
        this.passwrd = passwrd;
    }

    public Administrador() {
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
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
