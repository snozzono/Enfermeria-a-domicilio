
package Controlador;

import Modelo.Tecnico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TecnicoDAO {
    public boolean ingresarTecnico(Tecnico tec)
    {
        boolean resultado = false;
        try {
            Connection con = controlador.Conexion.getConexion();
            String query = "insert into tbAdministrador (run_tec,usuario,passwrd) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1, tec.getRun_tec());
            ps.setString(2, tec.getUsuario());
            ps.setString(3, tec.getPasswrd());
            
            resultado = ps.executeUpdate() == 1;
            ps.close();
            
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        return resultado;
    }
    
    public boolean modificarTecnico(Tecnico tec) {
        boolean resultado = false;
        try {
            Connection con = controlador.Conexion.getConexion();
            String query = "update tbTecnico set Usuario=?,Passwrd=? where Run_tec=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, tec.getRun_tec());
            ps.setString(2, tec.getUsuario());
            ps.setString(3, tec.getPasswrd());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
}
