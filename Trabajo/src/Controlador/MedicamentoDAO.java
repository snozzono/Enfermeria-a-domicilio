
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
            Connection con = Controlador.Conexion.getConexion();
            String query = "insert into tbMedicamento (id_med,cant,ciclo,nombre_med,tomar) values(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1, med.getId_med());
            ps.setDouble(2, med.getCant());
            ps.setString(3, med.getNombre_med());
            ps.setDate(4, med.getTomar());
            
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
            Connection con = Controlador.Conexion.getConexion();
            String query = "update tbMedicamento set Cant=?,Nombre_med=? ,tomar=?, Ciclo=? where Id_med=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, med.getId_med());
            ps.setDouble(2, med.getCant());
            ps.setString(3, med.getNombre_med());
            ps.setDate(4, med.getTomar());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MedicamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
}
