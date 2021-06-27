
package modelo;

/**
 *
 * @author ELOY
 */
public class Area {
    private String id_area;
    private String nom_area;

    public Area() {
    }

    public Area(String id_area, String nom_area) {
        this.id_area = id_area;
        this.nom_area = nom_area;
    }

    public String getNom_area() {
        return nom_area;
    }

    public void setNom_area(String nom_area) {
        this.nom_area = nom_area;
    }

    public String getId_area() {
        return id_area;
    }

    public void setId_area(String id_area) {
        this.id_area = id_area;
    }
    
}
