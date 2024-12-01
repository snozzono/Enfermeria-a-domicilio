/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.BBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Snozz
 */
public class BBDDDAO {

    public BBDD buscar() {
        
        BBDD tecnico = null;
        try {
            Connection con = Conexion.getConexion();
            String query = "SELECT paciente, tecnico, origen FROM tbdecisiones";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                tecnico = new BBDD();
                tecnico.setPaciente(rs.getInt("paciente"));
                tecnico.setTecnico(rs.getInt("tecnico"));
                tecnico.setOrigen(rs.getInt("origen"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tecnico;

    }

    public boolean modificarDecisiones(BBDD bd) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "update tbDecisiones set ,Administrador=?, Paciente=?. Tecnico=? where llamado=1";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, bd.getAdministrador());
            ps.setInt(3, bd.getPaciente());
            ps.setInt(5, bd.getTecnico());

            resultado = ps.executeUpdate() == 1;
            ps.close();

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
