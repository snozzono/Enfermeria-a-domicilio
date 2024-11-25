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
            String query = "insert into tbTecnico (run_tec,usuario,passwrd) values(?,?,?)";
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

    public boolean modificarTecnico(Tecnico tec) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "update tbTecnico set Usuario=?,Passwrd=? where Run_tec=?";
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

    public ArrayList<Tecnico> obtenerTodos() {
        ArrayList<Tecnico> tec = new ArrayList<>();
        try {
            Connection con = Conexion.getConexion();
            String query = "Select * from tbTecnico";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            Tecnico cc;
            while (rs.next()) {
                cc = new Tecnico(rs.getInt(1), rs.getString(2), rs.getString(3));
                tec.add(cc);
            }
            ps.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tec;
    }

    public Tecnico ValidarTec(String adm, String pswd) {
        Tecnico tecnico = null;
        try {
            Connection con = Conexion.getConexion();
            String query = "select usuario, passwrd from tbTecnico where usuario=? AND passwrd=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, adm);
            ps.setString(2, pswd);
            
            ResultSet rs = ps.executeQuery();
                        
            while (rs.next()) {
                tecnico = new Tecnico(rs.getString("usuario"), rs.getString("passwrd"));
            }
            ps.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tecnico;
    }
    
        public Tecnico BuscarTecnicoPorRut(int rut_tec) {
        Tecnico tecnico = null;
        try {
            Connection con = Conexion.getConexion();
            String query = "select run_tec, nombre, passwrd from tbTecnico where run_tec=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, rut_tec);
            
            ResultSet rs = ps.executeQuery();
                        
            if (rs.next()) {
                tecnico.setRun_tec(rut_tec);
                tecnico.setUsuario("nombre");
                tecnico.setPasswrd("passwrd");
            }
            ps.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tecnico;
    }
}
