package Controlador;

import Modelo.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PacienteDAO {
    public boolean ingresarPaciente(Paciente p)
    {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "insert into tbPaciente (run_pac,nombre_p,diagn) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1, p.getRun_pac());
            ps.setString(2, p.getNombre_p());
            ps.setString(3, p.getDiagn());
            
            resultado = ps.executeUpdate() == 1;
            ps.close();
            
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        return resultado;
    }
    
    public boolean modificarPaciente(Paciente pac) {
        boolean resultado = false;
        try {
            Connection con = Controlador.Conexion.getConexion();
            String query = "update tbPaciente set Nombre_p=?,Diagn=? run_pac=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, pac.getRun_pac());
            ps.setString(2, pac.getNombre_p());
            ps.setString(3, pac.getDiagn());

            resultado = ps.executeUpdate() == 1;
            ps.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
        public Paciente buscarPac(int rut) {
            Paciente paciente = null;
        try {
            Connection con = Conexion.getConexion();
            String query = "select run_pac from tbPaciente where run_pac=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, rut);
            
            ResultSet rs = ps.executeQuery();
                        
            while (rs.next()) {
                paciente = new Paciente(rs.getInt("run_pac"));
            }
            ps.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TecnicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return paciente;
    }
    
}
