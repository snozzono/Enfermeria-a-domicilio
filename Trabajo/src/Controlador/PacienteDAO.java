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

public class PacienteDAO {

    public boolean ingresarPaciente(Paciente p) {
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

            // Primero eliminamos las referencias en tbProcedimiento
            String queryEliminarMedicamento = "DELETE FROM tbmedicamento WHERE pac_run_pac IN (SELECT run_pac FROM tbpaciente WHERE pac_run_pac = ?)";
            ps = con.prepareStatement(queryEliminarMedicamento);
            ps.setString(1, run);
            ps.executeUpdate();  // Ejecutamos la eliminación de los procedimientos asociado

            // Primero eliminamos las referencias en tbProcedimiento
            String queryEliminarProcedimiento = "DELETE FROM tbprocedimiento WHERE pac_run_pac IN (SELECT run_pac FROM tbpaciente WHERE pac_run_pac = ?)";
            ps = con.prepareStatement(queryEliminarProcedimiento);
            ps.setString(1, run);
            ps.executeUpdate();  // Ejecutamos la eliminación de los procedimientos asociados

            // Luego eliminamos los registros en tbPaciente
            String queryEliminarPaciente = "DELETE FROM tbpaciente WHERE run_pac = ?";
            ps = con.prepareStatement(queryEliminarPaciente);
            ps.setString(1, run);
            ps.executeUpdate();  // Ejecutamos la eliminación de los pacientes asociados

        } catch (SQLException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean modificarPaciente(Paciente pac) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "update tbPaciente set Nombre_p=?,Diagn=? run_pac=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, pac.getRun_pac());
            ps.setString(2, pac.getNombre_p());
            ps.setString(3, pac.getDiagn());

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
            String query = "select run_pac, nombre_p, diagn from tbPaciente where run_pac=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, rut);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                paciente = new Paciente(rs.getInt("run_pac"), rs.getString("nombre_p"), rs.getString("diagn"));
            }
            ps.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return paciente;
    }

    public ArrayList<Paciente> obtenerTodos() {
        ArrayList<Paciente> tec = new ArrayList<>();
        try {
            Connection con = Conexion.getConexion();
            String query = "SELECT run_pac, nombre_p,diagn FROM tbPaciente where tec_run_tec = (SELECT tecnico FROM  tbdecisiones)";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();
            Paciente cc;
            while (rs.next()) {
                cc = new Paciente(rs.getInt("run_pac"), rs.getString("nombre_p"), rs.getString("diagn"));
                tec.add(cc);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tec;
    }
}
