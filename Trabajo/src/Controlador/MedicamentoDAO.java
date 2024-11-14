
package Controlador;

import Modelo.Medicamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MedicamentoDAO {
    
    public boolean ingresarMed(Medicamento med)
    {
        boolean resultado = false;
        try {
            Connection con = controlador.Conexion.getConexion();
            String query = "insert into tbMedicamento (id_med,precio,cant,nombre_med) values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1, med.getId_med());
            ps.setInt(2, med.getPrecio());
            ps.setInt(3, med.getCant());
            ps.setString(4, med.getNombre_med());
            
            resultado = ps.executeUpdate() == 1;
            ps.close();
            
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(MedicamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        return resultado;
    }
    
    public boolean modificarMed(Medicamento med) {
        boolean resultado = false;
        try {
            Connection con = controlador.Conexion.getConexion();
            String query = "update tbMedicamento set Precio=?,Cant=?,Nombre_med=? where Id_med=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, med.getId_med());
            ps.setInt(2, med.getPrecio());
            ps.setInt(3, med.getCant());
            ps.setString(4, med.getNombre_med());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(MedicamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MedicamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
}
