package Controlador;

import Modelo.BBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Snozz
 */
public class BBDDDAO {

    public boolean modificarDecisiones(BBDD bd) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "update tbDecisiones set llamado=?,Administrador=?, Medicamento=?, Paciente=?, Procedimiento=?, Tecnico=? where llamado=1";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(0, bd.getLlamado());
            ps.setInt(1, bd.getAdministrador());
            ps.setInt(2, bd.getMedicamento());
            ps.setInt(3, bd.getPaciente());
            ps.setInt(4, bd.getProcedimiento());
            ps.setInt(5, bd.getTecnico());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean modificarAdministrador(BBDD bd) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "update tbDecisiones  set Administrador=? where llamado=1";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, bd.getAdministrador());

            resultado = ps.executeUpdate() == 1;

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean modificarTecnico(BBDD bd) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "update tbDecisiones  set Tecnico=? where llamado=1";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, bd.getTecnico());

            resultado = ps.executeUpdate() == 1;

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean modificarOrigen(BBDD bd) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "update tbDecisiones  set Origen=? where llamado=1";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, bd.getOrigen());

            resultado = ps.executeUpdate() == 1;

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean modificarPaciente(BBDD bd) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "update tbDecisiones  set Paciente=? where llamado=1";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, bd.getPaciente());

            resultado = ps.executeUpdate() == 1;

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
}
