package Controlador;

import Modelo.Administrador;
import Modelo.Tecnico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TecnicoDAO {

    public boolean ingresarTecnico(Tecnico tec) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "insert into tbTecnico (run_tec,usuario,passwrd,admin_id_admin) values(?,?,?,(SELECT administrador FROM tbdecisiones WHERE llamado = 1))";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, tec.getRun_tec());
            ps.setString(2, tec.getUsuario());
            ps.setString(3, tec.getPasswrd());

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

            String queryEliminarPaciente = "DELETE FROM tbpaciente WHERE tec_run_tec = ?";
            ps = con.prepareStatement(queryEliminarPaciente);
            ps.setString(1, run);
            ps.executeUpdate();  


            String queryEliminarTecnico = "DELETE FROM tbTecnico WHERE run_tec = ?";
            ps = con.prepareStatement(queryEliminarTecnico);
            ps.setString(1, run);
            resultado = ps.executeUpdate() == 1; //un cascade deberia bastar, pero no todo está 

        } catch (SQLException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean modificarTecnico(Tecnico tec) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "update tbTecnico set Run_tec=?, Usuario=?,Passwrd=? where Run_tec=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, tec.getRun_tec());
            ps.setString(2, tec.getUsuario());
            ps.setString(3, tec.getPasswrd());
            ps.setInt(4, tec.getRun_tec());
            
            resultado = ps.executeUpdate() == 1;

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
        public boolean modificarTecnicoConRun(Tecnico tec, int run_antiguo) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "update tbTecnico set Run_tec=?, Usuario=?, Passwrd=? where Run_tec=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, tec.getRun_tec());      
            ps.setString(2, tec.getUsuario());
            ps.setString(3, tec.getPasswrd());
            ps.setInt(4, run_antiguo);
            
            resultado = ps.executeUpdate() == 1;

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
                cc = new Tecnico(rs.getInt("run_tec"), rs.getString("usuario"), rs.getString("passwrd"));
                tec.add(cc);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tec;
    }

    public Tecnico ValidarTec(String adm, String pswd) {
        Tecnico tecnico = null;
        try {
            Connection con = Conexion.getConexion();
            String query = "select run_tec, usuario, passwrd from tbTecnico where usuario=? AND passwrd=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, adm);
            ps.setString(2, pswd);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                tecnico = new Tecnico(rs.getInt("run_tec"), rs.getString("usuario"), rs.getString("passwrd"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tecnico;
    }

    public Tecnico BuscarTecnicoPorRut(int run_tec) {
        Tecnico tecnico = null;
        try {
            Connection con = Conexion.getConexion();
            String query = "SELECT run_tec, usuario, passwrd FROM tbTecnico WHERE run_tec=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, run_tec);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                tecnico = new Tecnico();
                tecnico.setRun_tec(rs.getInt("run_tec"));
                tecnico.setUsuario(rs.getString("usuario"));
                tecnico.setPasswrd(rs.getString("passwrd"));
            } 
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tecnico;
    }

}
