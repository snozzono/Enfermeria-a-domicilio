/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.test;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Snozz
 */
public class VentanaPrincipalIngresar {

    Connection con;
    Statement instruccion;
    ResultSet datos;

    public boolean Conectarse(String user, String contraseña) {

        try {
            String strccon = "jdbc:mysql://localhost/bdTrabajo";
            con = DriverManager.getConnection(strccon, user, contraseña);
            instruccion = con.createStatement();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No existe el usuario");
            return false;
        }
    }
}
