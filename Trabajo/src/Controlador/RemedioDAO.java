package Controlador;

import Modelo.Medicamento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RemedioDAO extends AuxiliarDAO {

    public boolean ingresarMed(Medicamento med) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "insert into tbMedicamento (id_med,cronico,ciclo,nombre_med,tomar) values(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, med.getId_med());
            ps.setBoolean(2, med.isCronico());
            ps.setString(3, med.getNombre_med());
            ps.setDate(4, med.getTomar());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RemedioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean eliminarMedicamento(String run) throws ClassNotFoundException {
        boolean resultado = false;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Conexion.getConexion();

            // Primero eliminamos las referencias en tbProcedimiento
            String queryEliminarMedicamento = "DELETE FROM tbmedicamento WHERE id_med = ?";
            ps = con.prepareStatement(queryEliminarMedicamento);
            ps.setString(1, run);
            resultado = ps.executeUpdate() == 1;  // Debería eliminar exactamente un registro

        } catch (SQLException ex) {
            Logger.getLogger(RemedioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public ArrayList<Medicamento> obtenerTodos() {
        ArrayList<Medicamento> tec = new ArrayList<>();
        try {
            Connection con = Conexion.getConexion();
            String query = "SELECT id_med, cronico, ciclo, nombre_med, tomar FROM tbMedicamento where pac_run_pac = (SELECT paciente FROM  tbdecisiones)";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Medicamento cc = new Medicamento(rs.getInt("id_med"), rs.getBoolean("cronico"), rs.getInt("ciclo"), rs.getString("nombre_med"), rs.getDate("tomar"));
                tec.add(cc);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RemedioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tec;
    }

    public boolean modificarMed(Medicamento med) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "update tbMedicamento set Cant=?,Nombre_med=? ,tomar=?, Ciclo=? where Id_med=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, med.getId_med());
            ps.setBoolean(2, med.isCronico());
            ps.setString(3, med.getNombre_med());
            ps.setDate(4, med.getTomar());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RemedioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public Medicamento BuscarMedicamento(int id) {
        Medicamento med = new Medicamento();
        try {
            Connection con = Conexion.getConexion();
            String query = "SELECT id_med, cant, ciclo, nombre_med, tomar FROM tbMedicamento where id_med=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                med.setCronico(rs.getBoolean("cant"));
                med.setCiclo(rs.getInt("ciclo"));
                med.setId_med(rs.getInt("id_med"));
                med.setNombre_med(rs.getString("nombre_med"));
                med.setTomar(rs.getDate("tomar"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return med;

    }

    public ArrayList<String> view(String query) {
        ArrayList<String> str = new ArrayList<>();

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_med");
                String nombre = rs.getString("nombre_med");
                int p = rs.getInt("pac_run_pac");

                str.add(id + ", " + nombre + ", " + p);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RemedioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return str;
    }

}
