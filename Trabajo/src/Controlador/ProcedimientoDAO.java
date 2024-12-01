package Controlador;

import Modelo.Procedimiento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProcedimientoDAO extends AuxiliarDAO {

    public boolean ingresarProc(Procedimiento pr) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "insert into tbProcedimiento (id_pr,precio,nombre,descr) values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, pr.getId_pr());
            ps.setInt(2, pr.getPrecio());
            ps.setString(3, pr.getNombre());
            ps.setString(4, pr.getDescr());
            ps.setDate(5, pr.getFecha());
            ps.setBoolean(6, pr.isPago());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProcedimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean eliminarProcedimiento(String run) throws ClassNotFoundException {
        boolean resultado = false;
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Conexion.getConexion();

            // Primero eliminamos las referencias en tbProcedimiento
            String queryEliminarMedicamento = "delete from tbprocedimiento where id_pr=?";
            ps = con.prepareStatement(queryEliminarMedicamento);
            ps.setString(1, run);
            ps.executeUpdate();  // Ejecutamos la eliminación de los procedimientos asociado
            resultado = ps.executeUpdate() == 1;  // Debería eliminar exactamente un registro

        } catch (SQLException ex) {
            Logger.getLogger(ProcedimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean modificarProc(Procedimiento pr) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "update tbProcedimiento set Precio=?,Nombre=?,Descr=? ,fecha=? ,pago=? where Id_pr=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, pr.getId_pr());
            ps.setInt(2, pr.getPrecio());
            ps.setString(3, pr.getNombre());
            ps.setString(4, pr.getDescr());
            ps.setDate(5, pr.getFecha());
            ps.setBoolean(6, pr.isPago());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProcedimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean eliminarProc(String codigo) throws ClassNotFoundException {
        boolean resultado = false;
        try {
            Connection con = Conexion.getConexion();
            String query = "delete from tbProcedimiento where id_pr='" + codigo + "'";
            PreparedStatement ps = con.prepareStatement(query);

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ProcedimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public Procedimiento BuscarProcedimiento(int id) {
        Procedimiento tecnico = new Procedimiento();
        try {
            Connection con = Conexion.getConexion();
            String query = "SELECT id_pr,precio, nombre,descr,pago,fecha FROM tbProcedimiento where pac_run_pac = (SELECT paciente FROM  tbdecisiones)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                tecnico.setId_pr(rs.getInt("id_pr"));
                tecnico.setPrecio(rs.getInt("precio"));
                tecnico.setNombre(rs.getString("nombre"));
                tecnico.setDescr(rs.getString("Descr"));
                tecnico.setPago(rs.getBoolean("pago"));
                tecnico.setFecha(rs.getDate("fecha"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProcedimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tecnico;
    }

    public ArrayList<Procedimiento> obtenerTodos() {
        ArrayList<Procedimiento> tec = new ArrayList<>();
        try {
            Connection con = Conexion.getConexion();
            if (con == null) {
                System.out.println("La conexión no se pudo establecer.");
                return tec;
            }
            String query = "SELECT id_pr,precio, nombre,descr,pago,fecha FROM tbProcedimiento where pac_run_pac = (SELECT paciente FROM  tbdecisiones)";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Procedimiento cc = new Procedimiento(rs.getInt("id_pr"), rs.getInt("precio"), rs.getString("nombre"), rs.getString("descr"), rs.getBoolean("pago"), rs.getDate("fecha"));
                tec.add(cc);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProcedimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tec;
    }
    
    public String view(String query){
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_pr");
                String nombre = rs.getString("nombre");
                String desc = rs.getString("descr");
                int precio = rs.getInt("precio");
                boolean pago = rs.getBoolean("pago");
                Date tomar = rs.getDate("fecha");

                return (id + ", " + nombre + ", " + desc + "," + precio + "," + pago + "," + tomar);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ProcedimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "";
    }

}
