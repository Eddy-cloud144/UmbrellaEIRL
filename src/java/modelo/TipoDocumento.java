
package modelo;


public class TipoDocumento {
    private String id_tipoDocumento;
    private String nom_documento;

    public TipoDocumento() {
    }
    
    public TipoDocumento(String id_tipoDocumento, String nom_documento) {
        this.id_tipoDocumento = id_tipoDocumento;
        this.nom_documento = nom_documento;
    }

    public String getId_tipoDocumento() {
        return id_tipoDocumento;
    }

    public void setId_tipoDocumento(String id_tipoDocumento) {
        this.id_tipoDocumento = id_tipoDocumento;
    }

    public String getNom_documento() {
        return nom_documento;
    }

    public void setNom_documento(String nom_documento) {
        this.nom_documento = nom_documento;
    }
    
}

