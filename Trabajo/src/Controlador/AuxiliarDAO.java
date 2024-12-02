package Controlador;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AuxiliarDAO {
    
    public boolean modificarUser(Object obj, String query, String user, String pass, int ID) {
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
            } else if (!"".equals(n)) {
                ps.setString(1, n);
            } else {
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

    public boolean eliminar(ArrayList<Integer> arr, Object obj, String query) {
        boolean resultado = false;

        try {
            Connection con = Conexion.getConexion();
            
            PreparedStatement ps = null;
            
            for (int i = 0; i < arr.size(); i++) {
                ps = con.prepareStatement(query);
                ps.setInt(1, arr.get(i));
                
                resultado = ps.executeUpdate() == 1;
            }
            
            ps.close();
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(obj.getClass().getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
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

    public int validarUser(String user, char[] pswd, String query, Object obj) {
        int r = -1;

        try {
            String str;
            str = new String(pswd);

            Connection con = Conexion.getConexion();

            PreparedStatement ps = con.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

            ps.setString(1, user);
            ps.setString(2, str);

            ResultSet rs = ps.executeQuery();

            rs.beforeFirst();

            while (rs.next()) {
                r = rs.getInt(1);
            }

            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(obj.getClass().getName()).log(Level.SEVERE, null, ex);
        }

        return r;
    }

    public int buscar(int ID, String query, Object obj, String cod) {
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(query);

            if (ID == -1) {
                ps.setString(1, cod);
            }

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

    public String aCSV(String str) {
        if (str == null) {
            str = "";
        } else if (str.contains(",") || str.contains("\n") || str.startsWith("\"") || str.contains(";")) {
            str = "\"" + str.replace("\"", "\"\"") + "\"";
        }

        return str;
    }

    public void exportar(String query, String path) throws IOException {
        try {
            ArrayList<String> col = new ArrayList<>();
            ArrayList<String> row = new ArrayList<>();

            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rmeta = rs.getMetaData();

            int colN = rmeta.getColumnCount();

            for (int i = 1; i <= colN; i++) {
                String str = aCSV(rmeta.getColumnName(i));
                col.add(str);
            }

            try (FileWriter fw = new FileWriter(path)) {

                fw.write(String.join(";", col) + "\n");

                while (rs.next()) {
                    row.clear();

                    for (int i = 1; i <= colN; i++) {
                        String str = aCSV(rs.getString(i));

                        row.add(str);
                    }

                    fw.write(String.join(";", row) + "\n");

                }

            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AuxiliarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
