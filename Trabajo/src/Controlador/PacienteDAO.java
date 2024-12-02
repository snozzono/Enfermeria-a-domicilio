package Controlador;

import Modelo.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PacienteDAO extends AuxiliarDAO {

    public boolean ingreso(Paciente p) {
        boolean resultado = false;
        try {

            Connection con = Controlador.Conexion.getConexion();
            String query = "insert into tbPaciente (run_pac,nombre_p,diagn, tec_run_tec) values(?,?,?,(SELECT tecnico FROM tbdecisiones WHERE llamado = 1))";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, p.getRun_pac());
            ps.setString(2, p.getNombre_p());
            ps.setString(3, p.getDiagn());
            
            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean modificarReg(Paciente p, String query) {
        boolean resultado = false;

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, p.getNombre_p());
            ps.setString(2, p.getDiagn());
            ps.setInt(3, p.getRun_pac());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean eliminar(int run) throws ClassNotFoundException {
        boolean resultado = false;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Conexion.getConexion();

            String queryEliminarMedicamento = "DELETE FROM tbmedicamento WHERE pac_run_pac IN (SELECT run_pac FROM tbpaciente WHERE pac_run_pac = ?)";
            ps = con.prepareStatement(queryEliminarMedicamento);
            ps.setInt(1, run);
            ps.executeUpdate();  

            String queryEliminarProcedimiento = "DELETE FROM tbprocedimiento WHERE pac_run_pac IN (SELECT run_pac FROM tbpaciente WHERE pac_run_pac = ?)";
            ps = con.prepareStatement(queryEliminarProcedimiento);
            ps.setInt(1, run);
            ps.executeUpdate();  

            String queryEliminarPaciente = "DELETE FROM tbpaciente WHERE run_pac = ?";
            ps = con.prepareStatement(queryEliminarPaciente);
            ps.setInt(1, run);
            ps.executeUpdate();  

        } catch (SQLException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public ArrayList<String> view(String query) {
        ArrayList<String> str = new ArrayList<>();

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int run = rs.getInt("run_pac");
                String nombre = rs.getString("nombre_p");
                String d = rs.getString("diagn");
                String obs = rs.getString("obs");
                int tec = rs.getInt("tec_run_tec");

                str.add(run + ", " + nombre + ", " + d + "," + obs + "," + tec);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return str;
    }
}
