
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class UmbrellaDB {
    private Connection con=null;
    private String cadena="jdbc:mysql://localhost/umbrella?user=root&password=";

    public UmbrellaDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(cadena);
            System.out.println("Conexión: Correcto");
        } catch (Exception e) {
            System.out.println("Conexión: Incorrecta\n Error: "+e.getMessage());
        }
    }
    public Connection getConexion(){
        return con;
    }
    
    public void cerraUmbrella(){
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    
}
