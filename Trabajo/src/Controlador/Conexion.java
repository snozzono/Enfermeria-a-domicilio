
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion
{
    private static Connection con=null;
    public static Connection getConexion() throws SQLException,ClassNotFoundException{
       if(con==null)
       {
          Class.forName("com.mysql.cj.jdbc.Driver");
          con= DriverManager.getConnection("jdbc:mysql://localhost/bdTrabajo_alt","root","");
        }
        return con;
    }

}
