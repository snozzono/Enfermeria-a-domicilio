
package Modelo;

public class Usuario {
    private int ID;
    private String user;
    private char[] pass;

    public Usuario(int ID, String user, char[] pass) {
        this.ID = ID;
        this.user = user;
        this.pass = pass;
    }

    public int getID() {
        return ID;
    }

    public String getUser() {
        return user;
    }

    public char[] getPass() {
        return pass;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(char[] pass) {
        this.pass = pass;
    }
    
    
}
