package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class EstudianteDAO {
	  	PreparedStatement ps;
	    ResultSet rs;
	    Connection con;
	    Conexion conectar = new Conexion();
	    Estudiante p = new Estudiante();	    
	    public List listar() {
	        List<Estudiante> datos = new ArrayList<>();
	        try {
	            con = conectar.getConnection();
	            ps = con.prepareStatement("select * from estudiantes");
	            rs = ps.executeQuery();
	            while (rs.next()) {
	                Estudiante p = new Estudiante();
	                p.setId(rs.getInt(1));
	                p.setNom(rs.getString(2));
	                p.setApellido(rs.getString(3));
	                p.setCarrera(rs.getString(4));
	                datos.add(p);
	            }
	        } catch (Exception e) {
	        }
	        return datos;
	    }
	    public int agregar(Estudiante p) {  
	        int r=0;
	        String sql="insert into estudiantes(idestudiante,nombre,apellido,carrera)values(?,?,?,?)";
	        try {
	            con = conectar.getConnection();
	            ps = con.prepareStatement(sql);    
	            ps.setInt(1,p.getId());
	            ps.setString(2,p.getNom());
	            ps.setString(3,p.getAp());
	            ps.setString(4,p.getCarrera());
	            r=ps.executeUpdate();    
	            if(r==1){
	                return 1;
	            }
	            else{
	                return 0;
	            }
	        } catch (Exception e) {
	        }  
	        return r;
	    }
	    public int Actualizar(Estudiante per) {  
	        int r=0;
	        String sql="update estudiantes set nombre=?,apellido=?,carrera=? where idestudiante=?";        try {
	            con = conectar.getConnection();
	            ps = con.prepareStatement(sql);            
	            ps.setString(1,per.getNom());
	            ps.setString(2,per.getAp());
	            ps.setString(3,per.getCarrera());
	            ps.setInt(4,per.getId());
	            r=ps.executeUpdate();    
	            if(r==1){
	                return 1;
	            }
	            else{
	                return 0;
	            }
	        } catch (Exception e) {
	        }  
	        return r;
	    }
	    public int Delete(int idestudiante){
	        int r=0;
	        String sql="delete from estudiantes where idestudiante="+idestudiante;
	        try {
	            con=conectar.getConnection();
	            ps=con.prepareStatement(sql);
	            r= ps.executeUpdate();
	        } catch (Exception e) {
	        }
	        return r;
	    }
	}   