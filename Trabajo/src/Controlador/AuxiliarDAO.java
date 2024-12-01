package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AuxiliarDAO {

    public boolean modificar(Object obj, String query, String user, String pass, int ID) {
        boolean resultado = false;

        try {
            Connection con = Controlador.Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setInt(3, ID);

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(obj.getClass().getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public ArrayList<Integer> selectSearch(boolean crit, int ID, String n, String query, String tipo_id, Object obj) {
        ArrayList<Integer> hits = new ArrayList<>();
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(query);
            if (ID != -1) {
                ps.setInt(1, ID);
            }
            else if(!"".equals(n)){
                ps.setString(1, n);
            }
            else {
                ps.setBoolean(1, crit);
            }
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int hit = rs.getInt(tipo_id);
                hits.add(hit);
            }
            ps.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(obj.getClass().getName()).log(Level.SEVERE, null, ex);
        }
        return hits;
    }

    public ArrayList dupla(ArrayList arr) {

        for (int i = 1; i < arr.size(); i++) {
            for (int c = 0; c < arr.size(); c++) {
                if (arr.get(c) == arr.get(i)) {
                    arr.remove(c);
                }
            }

        }

        return arr;
    }

    public int validar(String user, char[] pswd, String query, Object obj) {
        try {
            String str;
            str = new String(pswd);

            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, str);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(obj.getClass().getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int buscar(int ID, String query, Object obj) {
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, ID);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(obj.getClass().getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

}
