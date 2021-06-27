
package modelo;


public class Producto {
    private String id_producto;
    private String id_modelo;
    private String id_marca;
    private String nombre_producto;
    private String descripcion;
    private int cantidad_max;
    private int cantidad_min;
    private String unidad_medida;
    private Double costo_unitario;

    public Producto() {
    }

    public Producto(String id_producto, String id_modelo, String id_marca, String nombre_producto, String descripcion, int cantidad_max, int cantidad_min, String unidad_medida, Double costo_unitario) {
        this.id_producto = id_producto;
        this.id_modelo = id_modelo;
        this.id_marca = id_marca;
        this.nombre_producto = nombre_producto;
        this.descripcion = descripcion;
        this.cantidad_max = cantidad_max;
        this.cantidad_min = cantidad_min;
        this.unidad_medida = unidad_medida;
        this.costo_unitario = costo_unitario;
    }

    public Double getCosto_unitario() {
        return costo_unitario;
    }

    public void setCosto_unitario(Double costo_unitario) {
        this.costo_unitario = costo_unitario;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(String id_modelo) {
        this.id_modelo = id_modelo;
    }

    public String getId_marca() {
        return id_marca;
    }

    public void setId_marca(String id_marca) {
        this.id_marca = id_marca;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad_max() {
        return cantidad_max;
    }

    public void setCantidad_max(int cantidad_max) {
        this.cantidad_max = cantidad_max;
    }

    public int getCantidad_min() {
        return cantidad_min;
    }

    public void setCantidad_min(int cantidad_min) {
        this.cantidad_min = cantidad_min;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }
    
    
}
