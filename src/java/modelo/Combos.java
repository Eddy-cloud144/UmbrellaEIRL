package modelo;

import config.UmbrellaDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Combos {

    private String id;
    private String nombre;

    public Combos() {
    }
    
    public Combos(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Combos> cargarCombo(String sql) {
        UmbrellaDB umbrella = new UmbrellaDB();
        ArrayList<Combos> lista=new ArrayList<>();
        try {
            PreparedStatement ps = umbrella.getConexion().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Combos com = new Combos(rs.getString(1), rs.getString(2));
                lista.add(com);
            }
        } catch (Exception e) {
        }
        return lista;
    }
}
