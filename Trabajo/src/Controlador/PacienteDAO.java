package Controlador;

import Modelo.Paciente;
import Modelo.Tecnico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class PacienteDAO {

    public boolean ingresarPaciente(Paciente p) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "insert into tbPaciente (run_pac,nombre_p,diagn, tec_run_tec) values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, p.getRun_pac());
            ps.setString(2, p.getNombre_p());
            ps.setString(3, p.getDiagn());
            ps.setInt(4, p.getTec_run_tec());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
   

    public boolean eliminarPaciente(String run) throws ClassNotFoundException {
        boolean resultado = false;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Conexion.getConexion();

            String queryEliminarPaciente = "DELETE FROM tbpaciente WHERE run_pac = ?";
            ps = con.prepareStatement(queryEliminarPaciente);
            ps.setString(1, run);
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean modificarPaciente(Paciente pac, int buffer) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "update tbPaciente set Nombre_p=?, Diagn=?, run_pac=?, tec_run_tec = ? where run_pac = ?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, pac.getNombre_p());
            ps.setString(2, pac.getDiagn());
            ps.setInt(3, pac.getRun_pac());
            ps.setInt(4, pac.getTec_run_tec());
            ps.setInt(5, buffer);

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public Paciente buscarPac(int rut) {
        Paciente paciente = null;
        try {
            Connection con = Conexion.getConexion();
            String query = "select run_pac, nombre_p, diagn, tec_run_tec from tbPaciente where run_pac=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, rut);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                paciente = new Paciente(rs.getInt("run_pac"), rs.getInt("tec_run_tec"), rs.getString("nombre_p"), rs.getString("diagn"));
            }
            ps.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return paciente;
    }
    
        public Paciente ValidarPac(int run_pac, int tec_run_tec) {
        Paciente tecnico = null;
        try {
            Connection con = Conexion.getConexion();
            String query = "select run_pac, tec_run_tec, nombre_p, diagn from tbPaciente where run_pac=? AND tec_run_tec=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, run_pac);
            ps.setInt(2, tec_run_tec);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                tecnico = new Paciente(rs.getInt("run_pac"), rs.getInt("tec_run_tec"), rs.getString("nombre_p"), rs.getString("diagn"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tecnico;
    }

    public ArrayList<Paciente> obtenerTodos() {
        ArrayList<Paciente> tec = new ArrayList<>();
        try {
            Connection con = Conexion.getConexion();
            String query = "SELECT run_pac, nombre_p,diagn, tec_run_tec FROM tbPaciente";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();
            Paciente cc;
            while (rs.next()) {
                cc = new Paciente(rs.getInt("run_pac"), rs.getInt("tec_run_tec"),rs.getString("nombre_p"), rs.getString("diagn"));
                tec.add(cc);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tec;
    }

}
