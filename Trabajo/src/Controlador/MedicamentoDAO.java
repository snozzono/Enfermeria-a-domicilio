
package Controlador;

import Modelo.Medicamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    public boolean eliminarMed(String codigo) throws ClassNotFoundException {
        boolean resultado = false;
        try {
            Connection con = Conexion.getConexion();
            String query = "delete from tbMedicamento where id_med='" + codigo + "'";
            PreparedStatement ps = con.prepareStatement(query);

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(MedicamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public ArrayList<Medicamento> obtenerTodos() {
        ArrayList<Medicamento> med = new ArrayList<>();
        try {
            Connection con = Conexion.getConexion();
            String query = "Select * from tbMedicamento";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            Medicamento cc;
            while (rs.next()) {
                cc = new Medicamento(rs.getInt(1), rs.getDouble(2), rs.getString(3), rs.getDate(4));

                med.add(cc);
            }
            ps.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MedicamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return med;
    }

    public Medicamento buscarMed(int id) {
        Medicamento med = null;
        try {
            Connection con = Conexion.getConexion();
            String query = "select id_med from tbMedicamento where id_med=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                med = new Medicamento(rs.getInt("id_med"));
            }
            ps.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return med;
    }
}
