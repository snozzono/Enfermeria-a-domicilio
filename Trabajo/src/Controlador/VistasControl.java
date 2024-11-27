
package Controlador;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class VistasControl {
    private String user;
    private char[] pass;

    public abstract Object validar(String user, char[] pass);


    
    // estaba probando algo, pero no creo que funcione
    /*public boolean login(String user, char[] pass, Object obj){
        String tipo = obj.getClass().toString() + "DAO";
        
        
        
        
        try {
            Class.forName(tipo);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistasControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }*/
}
