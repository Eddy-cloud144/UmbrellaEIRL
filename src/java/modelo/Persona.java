
package modelo;

public class Persona {
    private String id;
    private String id_tipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;
    private boolean estado;

    public Persona() {
    }

    public Persona(String id, String id_tipoDocumento, String numeroDocumento, String nombre, String apellido, String direccion, String telefono, String email, boolean estado) {
        this.id = id;
        this.id_tipoDocumento = id_tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_tipoDocumento() {
        return id_tipoDocumento;
    }

    public void setId_tipoDocumento(String id_tipoDocumento) {
        this.id_tipoDocumento = id_tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public int generarEstado(boolean estado){
        
        if(isEstado()){
            return 1;
        }else{
            return 0;
        }
    }
}
