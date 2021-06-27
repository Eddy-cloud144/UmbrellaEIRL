
package modelo;

public class Proveedor extends Persona{
    private String ruc;
    private String razon_social;
    private String web;

    public Proveedor() {
    }

    public Proveedor(String id, String id_tipoDocumento, String numeroDocumento, String nombre, String apellido, String direccion, String telefono, String email, boolean estado,String ruc, String razon_social, String web) {
        super(id, id_tipoDocumento, numeroDocumento, nombre, apellido, direccion, telefono, email, estado);
        this.ruc = ruc;
        this.razon_social = razon_social;
        this.web = web;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
    
    
}
