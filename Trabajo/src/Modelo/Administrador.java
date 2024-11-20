
package Modelo;

public class Administrador {
    String usuario, passwrd;
    int id_admin;
    public Administrador(int id_admin, String usuario, String passwrd) {
        this.id_admin = id_admin;
        this.usuario = usuario;
        this.passwrd = passwrd;
    }

        public Administrador(String usuario, String passwrd) {
        this.usuario = usuario;
        this.passwrd = passwrd;
    }

    
    public int getId_admin(){
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

    public String getPasswrd() {
        return passwrd;
    }

    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;
    }
    
    
}
