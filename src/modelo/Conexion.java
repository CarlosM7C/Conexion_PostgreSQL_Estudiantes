package modelo;
import java.sql.*;

public class Conexion {
    String url="jdbc:postgresql://localhost:5432/bd_estudiantes";
    String user="postgres",pass="elimora";    
    Connection con;
    public Connection getConnection(){
        try {
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {       
        	
        }
        return con;
    }
    
}