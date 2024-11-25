package Controlador;

import Modelo.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import Controlador.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AdministradorDAO {

    public boolean ingresarAdmin(Administrador adm) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "insert into tbAdministrador (id_admin,usuario,passwrd) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, adm.getId_admin());
            ps.setString(2, adm.getUsuario());
            ps.setString(3, adm.getPasswrd());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean modificarAdmin(Administrador adm) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "update tbAministrador set Usuario=?,Passwrd=? where Id_admin=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, adm.getId_admin());
            ps.setString(2, adm.getUsuario());
            ps.setString(3, adm.getPasswrd());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean eliminarAdmin(String codigo) throws ClassNotFoundException {
        boolean resultado = false;
        try {
            Connection con = Conexion.getConexion();
            String query = "delete from tbAministrador where id_admin='" + codigo + "'";
            PreparedStatement ps = con.prepareStatement(query);

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public ArrayList<Administrador> obtenerTodos() {
        ArrayList<Administrador> adm = new ArrayList<>();
        try {
            Connection con = Conexion.getConexion();
            String query = "Select * from tbAdministrador";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            Administrador cc;
            while (rs.next()) {
                cc = new Administrador(rs.getInt(1), rs.getString(2), rs.getString(3));
                adm.add(cc);
            }
            ps.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return adm;
    }

    public Administrador buscarAdm(String adm, String pswd) {
        Administrador administrador = null;
        try {
            Connection con = Conexion.getConexion();
            String query = "SELECT usuario, passwrd FROM tbAdministrador where usuario = ? AND  passwrd = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, adm);
            ps.setString(2, pswd);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                administrador = new Administrador(rs.getString("usuario"), rs.getString("passwrd"));
            }
            ps.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return administrador;
    }
}
