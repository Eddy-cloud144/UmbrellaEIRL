
package modelo;

import config.UmbrellaDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDao {
    UmbrellaDB umbrella=new UmbrellaDB();
    PreparedStatement ps;
    ResultSet rs;
    public Usuarios validar(String user,String pass){
        Usuarios usuario=new Usuarios();
        String sql="select * from acceso where nombre_usuario=? and password=?";
        
        try {
            ps=umbrella.getConexion().prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs=ps.executeQuery();
            
            while(rs.next()){
                usuario.setNom_usuario(rs.getString("nombre_usuario"));
                usuario.setPassword(rs.getString("password"));
            }
        } catch (Exception e) {
        }
        return usuario;
    }
    
    public Usuarios validar(String user){
        Usuarios usuario=new Usuarios();
        String sql="select * from acceso where nombre_usuario=?";
        try {
            ps=umbrella.getConexion().prepareStatement(sql);
            ps.setString(1, user);
            rs=ps.executeQuery();
            while (rs.next()) {                
                usuario.setNom_usuario(rs.getString("nombre_usuario"));
                usuario.setId_tipoEmpleado(rs.getString("password"));
                usuario.setId_tipoEmpleado(rs.getString("id_tipoEmpleado"));
            }
            
        } catch (Exception e) {
        }
        
        return usuario;
    }
    
}
