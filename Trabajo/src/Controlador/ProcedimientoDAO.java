
package Controlador;

import Modelo.Procedimiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProcedimientoDAO {
    public boolean ingresarProc(Procedimiento pr)
    {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "insert into tbProcedimiento (id_pr,precio,nombre,desc) values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1, pr.getId_pr());
            ps.setInt(2, pr.getPrecio());
            ps.setString(3, pr.getNombre());
            ps.setString(4, pr.getDesc());
            
            resultado = ps.executeUpdate() == 1;
            ps.close();
            
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(ProcedimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        return resultado;
    }
    
    public boolean modificarProc(Procedimiento pr) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "update tbProcedimiento set Precio=?,Nombre=?,Desc=? where Id_pr=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, pr.getId_pr());
            ps.setInt(2, pr.getPrecio());
            ps.setString(3, pr.getNombre());
            ps.setString(4, pr.getDesc());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ProcedimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProcedimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
}
