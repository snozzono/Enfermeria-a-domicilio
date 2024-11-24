package Controlador;

import Modelo.Procedimiento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProcedimientoDAO {

    public boolean ingresarProc(Procedimiento pr) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "insert into tbProcedimiento (id_pr,precio,nombre,descr) values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, pr.getId_pr());
            ps.setInt(2, pr.getPrecio());
            ps.setString(3, pr.getNombre());
            ps.setString(4, pr.getDescr());
            ps.setDate(5, pr.getFecha());
            ps.setBoolean(6, pr.isPago());

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
            String query = "update tbProcedimiento set Precio=?,Nombre=?,Descr=? ,fecha=? ,pago=? where Id_pr=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, pr.getId_pr());
            ps.setInt(2, pr.getPrecio());
            ps.setString(3, pr.getNombre());
            ps.setString(4, pr.getDescr());
            ps.setDate(5, pr.getFecha());
            ps.setBoolean(6, pr.isPago());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProcedimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public ArrayList<Procedimiento> buscarProcedimiento() throws ClassNotFoundException {
        ArrayList<Procedimiento> listaProcedimento = new ArrayList<>();
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "SELECT id_pr, precio"
                    + " nombre, descr"
                    + " pago"
                    + " fecha FROM tbProcedimiento";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Procedimiento procedimiento = new Procedimiento();
                procedimiento.setId_pr(rs.getInt("id_pr"));
                procedimiento.setPrecio(rs.getInt("precio"));
                procedimiento.setNombre(rs.getString("nombre"));
                procedimiento.setDescr(rs.getString("descr"));
                procedimiento.setPago(rs.getBoolean("pago"));
                procedimiento.setFecha(rs.getDate("fecha"));
                listaProcedimento.add(procedimiento);
            }
            con.close();
            ps.close();
            rs.close();
        } catch (SQLException e ) {
                System.out.println("Error SQL al buscar el hincha: " + e.getMessage());
        }
        catch (ClassNotFoundException e) {
            System.out.println("Error al buscar un hincha: " + e.getMessage());
        }
        return listaProcedimento;
    }

}
