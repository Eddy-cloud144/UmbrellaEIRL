
package modelo;

import java.sql.Date;

public class Empleado extends Persona{
    private String id_area;
    private Date fecha_nacimiento;
    private String genero;
    
    public Empleado() {
    }

    public Empleado(String id, String id_area,String id_tipoDocumento,String numeroDocumento,String nombre,String apellido,String direccion,String telefono,Date fecha_nacimiento,String email,String genero,boolean estado){
        super(id, id_tipoDocumento, numeroDocumento, nombre, apellido, direccion, telefono, email, estado);
        this.id_area = id_area;
        this.fecha_nacimiento = fecha_nacimiento;
        this.genero = genero;
    }

    public String getId_area() {
        return id_area;
    }

    public void setId_area(String id_area) {
        this.id_area = id_area;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    
    
}
