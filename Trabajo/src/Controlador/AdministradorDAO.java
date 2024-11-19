package Controlador;

import Modelo.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import Controlador.Conexion;

public class AdministradorDAO {

    public boolean ingresarAdmin(Administrador adm) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "insert into tbAdministrador (id_admin,usuario,passwrd) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, adm.getId_admin());
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

            ps.setString(1, adm.getId_admin());
            ps.setString(2, adm.getUsuario());
            ps.setString(3, adm.getPasswrd());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public boolean eliminarAdmin(String codigo) throws ClassNotFoundException
    {
        boolean resultado=false;
        try {
            Connection con = Conexion.getConexion();
            String query="delete from tbAministrador where id_admin='"+codigo+"'";
            PreparedStatement ps=con.prepareStatement(query);

             
            resultado=ps.executeUpdate()==1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

}
