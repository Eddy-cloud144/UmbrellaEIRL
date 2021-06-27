
package modelo;

import java.sql.Date;

public class Usuarios {
    private String id_empleado;
    private String id_tipoEmpleado;
    private String nom_usuario;
    private String password;
    private Date fecha;
    private boolean estado;

    public Usuarios() {
    }

    public Usuarios(String id_empleado, String id_tipoEmpleado, String nom_usuario, String password, Date fecha, boolean estado) {
        this.id_empleado = id_empleado;
        this.id_tipoEmpleado = id_tipoEmpleado;
        this.nom_usuario = nom_usuario;
        this.password = password;
        this.fecha = fecha;
        this.estado = estado;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getId_tipoEmpleado() {
        return id_tipoEmpleado;
    }

    public void setId_tipoEmpleado(String id_tipoEmpleado) {
        this.id_tipoEmpleado = id_tipoEmpleado;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
