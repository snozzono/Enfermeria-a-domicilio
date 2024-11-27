package Controlador;

import Modelo.Administrador;
import Modelo.Tecnico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TecnicoDAO extends VistasControl{

    public boolean ingresarTecnico(Tecnico tec) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "insert into tbTecnico (run_tec,usuario,passwrd,admin_id_admin) values(?,?,?,(SELECT administrador FROM tbdecisiones WHERE llamado = 1))";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, tec.getRun_tec());
            ps.setString(2, tec.getUsuario());
            ps.setString(3, Arrays.toString(tec.getPasswrd()));

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean eliminarTecnico(String run) throws ClassNotFoundException {
        boolean resultado = false;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Conexion.getConexion();

            // Primero eliminamos las referencias en tbProcedimiento
            String queryEliminarMedicamento = "DELETE FROM tbmedicamento WHERE pac_run_pac IN (SELECT run_pac FROM tbpaciente WHERE tec_run_tec = ?)";
            ps = con.prepareStatement(queryEliminarMedicamento);
            ps.setString(1, run);
            ps.executeUpdate();  // Ejecutamos la eliminación de los procedimientos asociado

            // Primero eliminamos las referencias en tbProcedimiento
            String queryEliminarProcedimiento = "DELETE FROM tbprocedimiento WHERE pac_run_pac IN (SELECT run_pac FROM tbpaciente WHERE tec_run_tec = ?)";
            ps = con.prepareStatement(queryEliminarProcedimiento);
            ps.setString(1, run);
            ps.executeUpdate();  // Ejecutamos la eliminación de los procedimientos asociados

            // Luego eliminamos los registros en tbPaciente
            String queryEliminarPaciente = "DELETE FROM tbpaciente WHERE tec_run_tec = ?";
            ps = con.prepareStatement(queryEliminarPaciente);
            ps.setString(1, run);
            ps.executeUpdate();  // Ejecutamos la eliminación de los pacientes asociados

            // Finalmente, eliminamos al técnico
            String queryEliminarTecnico = "DELETE FROM tbTecnico WHERE run_tec = ?";
            ps = con.prepareStatement(queryEliminarTecnico);
            ps.setString(1, run);
            resultado = ps.executeUpdate() == 1;  // Debería eliminar exactamente un registro

        } catch (SQLException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean modificarTecnico(Tecnico tec) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "update tbTecnico set Usuario=?,Passwrd=? where Run_tec=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, tec.getRun_tec());
            ps.setString(2, tec.getUsuario());
            ps.setString(3, Arrays.toString(tec.getPasswrd()));

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public ArrayList<Tecnico> obtenerTodos() {
        ArrayList<Tecnico> tec = new ArrayList<>();
        try {
            Connection con = Conexion.getConexion();
            String query = "SELECT run_tec, usuario,passwrd FROM tbTecnico where admin_id_admin = (SELECT administrador FROM  tbdecisiones)";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();
            Tecnico cc;
            while (rs.next()) {
                cc = new Tecnico(rs.getInt("run_tec"), rs.getString("usuario"), rs.getString("passwrd").toCharArray());
                tec.add(cc);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tec;
    }

    @Override
    public Tecnico validar(String adm, char[] pswd) {
        Tecnico tecnico = null;
        try {
            String str;
            str = new String(pswd);
            
            Connection con = Conexion.getConexion();
            String query = "select run_tec, usuario, passwrd from tbTecnico where usuario=? AND passwrd=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, adm);
            ps.setString(2, str);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                tecnico = new Tecnico(rs.getInt("run_tec"), rs.getString("usuario"), rs.getString("passwrd").toCharArray());
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tecnico;
    }

    public Tecnico BuscarTecnicoPorRut(int run_tec) {
        Tecnico tecnico = new Tecnico();
        try {
            Connection con = Conexion.getConexion();
            String query = "select run_tec, usuario, passwrd from tbTecnico where run_tec=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, run_tec);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                tecnico.setRun_tec(rs.getInt("run_tec"));
                tecnico.setUsuario(rs.getString("usuario"));
                tecnico.setPasswrd(rs.getString("passwrd").toCharArray());
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tecnico;
    }
}
