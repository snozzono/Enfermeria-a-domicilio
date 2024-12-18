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

public class ProcedimientoDAO {

    public boolean ingresarProc(Procedimiento pr) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "insert into tbProcedimiento (id_pr,precio,nombre,descr, fecha, pago ,pac_run_pac) values(?,?,?,?,?,?,(SELECT paciente FROM tbdecisiones WHERE llamado = 1))";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, pr.getId_pr());
            ps.setInt(2, pr.getPrecio());
            ps.setString(3, pr.getNombre());
            ps.setString(4, pr.getDescr());
            ps.setDate(5, pr.getFecha());
            ps.setBoolean(6, pr.isPago());

            resultado = ps.executeUpdate() == 1;

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
        Procedimiento tecnico = null;
        try {
            Connection con = Conexion.getConexion();
            String query = "SELECT id_pr,precio, nombre,descr,pago,fecha FROM tbProcedimiento where pac_run_pac = (SELECT paciente FROM  tbdecisiones) AND id_pr= ?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                tecnico = new Procedimiento();
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

    public Procedimiento ValidarProcedimiento(String nombre, Date fecha) {
        Procedimiento tecnico = null;
        try {
            Connection con = Conexion.getConexion();
            String query = "SELECT precio, fecha FROM tbProcedimiento where pac_run_pac = (SELECT paciente FROM  tbdecisiones) AND nombre = ? AND fecha = ?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, nombre);
            ps.setDate(2, new java.sql.Date(fecha.getTime()));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                tecnico = new Procedimiento(rs.getInt("id_pr"), rs.getInt("precio"), rs.getString("nombre"), rs.getString("Descr"), rs.getBoolean("pago"), rs.getDate("fecha"));
                /*
                tecnico.setId_pr(rs.getInt("id_pr"));
                tecnico.setPrecio(rs.getInt("precio"));
                tecnico.setNombre(rs.getString("nombre"));
                tecnico.setDescr(rs.getString("Descr"));
                tecnico.setPago(rs.getBoolean("pago"));
                tecnico.setFecha(rs.getDate("fecha"));
                 */
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

}
