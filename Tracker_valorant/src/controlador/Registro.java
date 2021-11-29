package controlador;

import Modelo.Jugador;
import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author isaac serrano
 * @version 23/11/2021
 */
public class Registro {
    
    public boolean agregar(Jugador jugador){
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            
            
            String query = "INSERT INTO jugador(nombre,rango,kills,muerte,baneado) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, jugador.getNombre());
            stmt.setString(2, jugador.getRango());
            stmt.setDouble(3, jugador.getKills());
            stmt.setDouble(4, jugador.getMuerte());
            stmt.setBoolean(5, jugador.isBaneado());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar Jugador");
            return false;
        } catch(Exception e){
            System.out.println("Error al agregar Jugador");
            return false;
        }
    }
    public boolean eliminar(int idjugador){
               
        try {
            
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            
            String query = "DELETE FROM jugador WHERE idjugador=?;";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1,idjugador);
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch(SQLException e){
        System.out.println("Error SQL al eliminar Jugador");
        return false;
        }
    }
    
    public boolean Actualizar(Jugador jugador)
{        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
                                    
            String query = "UPDATE jugador SET nombre=?, rango=?, kills=?, muerte=?, baneado=? WHERE idjugador=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, jugador.getNombre());
            stmt.setString(2, jugador.getRango());
            stmt.setDouble(3, jugador.getKills());
            stmt.setDouble(4, jugador.getMuerte());
            stmt.setBoolean(5, jugador.isBaneado());
            stmt.setInt(6, jugador.getIdjugador());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error SQL al Actualizar Jugador");
            return false;
        } catch(Exception e){
            System.out.println("Error al Actualizar Jugador");
            return false;
        }
    }
    
    public List<Jugador> buscarTodos(){
        
        List<Jugador> lista = new ArrayList<>();
        
        try {
            
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "SELECT * FROM jugador order by nombre";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                Jugador jugador = new Jugador();
                jugador.setIdjugador(rs.getInt("idjugador"));
                jugador.setNombre(rs.getString("nombre"));
                jugador.setRango(rs.getString("rango"));
                jugador.setKills(rs.getDouble("kills"));
                jugador.setMuerte(rs.getDouble("muerte"));
                jugador.setBaneado(rs.getBoolean("baneado"));
                
                lista.add(jugador);
            }
            rs.close();
            stmt.close();
            cnx.close();
            
        } catch (Exception e) {
            System.out.println("Error SQL al listar todos los jugadores" + e.getMessage());
        }
        return lista;
    }
    
    public Jugador buscarPorId(int idjugador){
        Jugador jugador = new Jugador();
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "SELECT * FROM jugador WHERE idjugador=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1,idjugador);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                jugador.setIdjugador(rs.getInt("idjugador"));
                jugador.setNombre(rs.getString("nombre"));
                jugador.setRango(rs.getString("rango"));
                jugador.setKills(rs.getDouble("kills"));
                jugador.setMuerte(rs.getDouble("muerte"));
                jugador.setBaneado(rs.getBoolean("baneado"));                                
            }
            rs.close();
            stmt.close();
            cnx.close();
            
        } catch (Exception e) {
            System.out.println("Error SQL al listar jugador por id" + e.getMessage());
        }
        return jugador;
    }   
    
    public boolean buscarJugador(List<Jugador> lista, String nombre){
        for (Jugador jugador : lista) {
            if (jugador.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
            
        }
        return false;
    }
    
    //IMPLEMENTACION EN SIGUIENTE VERSION DE FILTROS
    
//    public Jugador buscarPorKills(int kills){
//        Jugador jugador = new Jugador();
//        
//        try {
//            Conexion con = new Conexion();
//            Connection cnx = con.obtenerConexion();
//            
//            String query = "SELECT * FROM jugador WHERE kills=?";
//            PreparedStatement stmt = cnx.prepareStatement(query);
//            stmt.setInt(4,kills);
//            ResultSet rs = stmt.executeQuery();
//            
//            if (rs.next()) {
//                jugador.setIdjugador(rs.getInt("idjugador"));
//                jugador.setNombre(rs.getString("nombre"));
//                jugador.setRango(rs.getString("rango"));
//                jugador.setKills(rs.getInt("kills"));
//                jugador.setMuerte(rs.getInt("muerte"));
//                jugador.setBaneado(rs.getBoolean("baneado"));                                
//            }
//            rs.close();
//            stmt.close();
//            cnx.close();
//            
//        } catch (Exception e) {
//            System.out.println("Error SQL al listar jugador por kills");
//        }
//        return jugador;
//    }
//    public Jugador buscarPorNombre(String nombre){
//        Jugador jugador = new Jugador();
//        
//        try {
//            Conexion con = new Conexion();
//            Connection cnx = con.obtenerConexion();
//            
//            String query = "SELECT * FROM jugador WHERE nombre= '?' ";
//            PreparedStatement stmt = cnx.prepareStatement(query);
//            stmt.setString(2, nombre);
//            
//            ResultSet rs = stmt.executeQuery();
//            
//            if (rs.next()) {
//                jugador.setIdjugador(rs.getInt("idjugador"));
//                jugador.setNombre(rs.getString("nombre"));
//                jugador.setRango(rs.getString("rango"));
//                jugador.setKills(rs.getInt("kills"));
//                jugador.setMuerte(rs.getInt("muerte"));
//                jugador.setBaneado(rs.getBoolean("baneado"));                                
//            }
//            rs.close();
//            stmt.close();
//            cnx.close();
//            
//        } catch (Exception e) {
//            System.out.println("Error SQL al listar jugador por nombre");
//        }
//        return jugador;
//    }
//    public Jugador buscarPorRango(String rango){
//        Jugador jugador = new Jugador();
//        
//        try {
//            Conexion con = new Conexion();
//            Connection cnx = con.obtenerConexion();
//            
//            String query = "SELECT * FROM jugador WHERE rango=?";
//            PreparedStatement stmt = cnx.prepareStatement(query);
//            stmt.setString(3, rango);
//            ResultSet rs = stmt.executeQuery();
//            
//            if (rs.next()) {
//                jugador.setIdjugador(rs.getInt("idjugador"));
//                jugador.setNombre(rs.getString("nombre"));
//                jugador.setRango(rs.getString("rango"));
//                jugador.setKills(rs.getInt("kills"));
//                jugador.setMuerte(rs.getInt("muerte"));
//                jugador.setBaneado(rs.getBoolean("baneado"));                                
//            }
//            rs.close();
//            stmt.close();
//            cnx.close();
//            
//        } catch (Exception e) {
//            System.out.println("Error SQL al listar jugador por rango");
//        }
//        return jugador;
//    }
//    public Jugador buscarPorMuerte(int muerte){
//        Jugador jugador = new Jugador();
//        
//        try {
//            Conexion con = new Conexion();
//            Connection cnx = con.obtenerConexion();
//            
//            String query = "SELECT * FROM jugador WHERE muerte=?";
//            PreparedStatement stmt = cnx.prepareStatement(query);
//            stmt.setInt(5, muerte);
//            ResultSet rs = stmt.executeQuery();
//            
//            if (rs.next()) {
//                jugador.setIdjugador(rs.getInt("idjugador"));
//                jugador.setNombre(rs.getString("nombre"));
//                jugador.setRango(rs.getString("rango"));
//                jugador.setKills(rs.getInt("kills"));
//                jugador.setMuerte(rs.getInt("muerte"));
//                jugador.setBaneado(rs.getBoolean("baneado"));                                
//            }
//            rs.close();
//            stmt.close();
//            cnx.close();
//            
//        } catch (Exception e) {
//            System.out.println("Error SQL al listar jugador por muerte");
//        }
//        return jugador;
//    }
    
    
    
}
