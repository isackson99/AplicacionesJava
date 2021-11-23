package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author isaac
 */
public class Conexion {
    

    public Connection obtenerConexion(){
        
        Connection connection = null;        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/valorant_tracker", "root", "");
            System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexion (Estoy en la clase conexion)" + e.getMessage());
        }        
        return connection;
    }
    
//    public static void main(String[] args) {
//        Conexion con = new Conexion();
//        con.obtenerConexion();
//    }
}

