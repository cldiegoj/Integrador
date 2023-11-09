package Modelo;

/**
 *
 * @author ediso
 */
public class Producto {
    
    //Atributos
    private int idProducto;
    private String nombre;
    private int cantidad;
    private double precio;
    private String descripcion;
    private int porcentajeIGV;
    private int idCategoria;
    private String estado;
    
    //Contructor
    public Producto(){
        this.idProducto = 0;
        this.nombre = "";
        this.cantidad = 0;
        this.precio = 0.0;
        this.descripcion = "";
        this.porcentajeIGV = 0;
        this.idCategoria = 0;
        this.estado = "";
    }
    //Contructor sobrecargado
    public Producto(int idProducto, String nombre, int cantidad, double precio, String descripcion, int porcentajeIgv, int idCategoria, String estado) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
        this.porcentajeIGV = porcentajeIgv;
        this.idCategoria = idCategoria;
        this.estado = estado;
    }
    
    //Set and get

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPorcentajeIGV() {
        return porcentajeIGV;
    }

    public void setPorcentajeIGV(int porcentajeIgv) {
        this.porcentajeIGV = porcentajeIgv;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
