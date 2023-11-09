package Modelo;

/**
 *
 * @author ediso
 */
public class Proveedor {

    //Atributos
    private int idProveedor;
    private String nombre;
    private String direccion;
    private String telefono;
    private String estado;

    //Constructor
    public Proveedor() {
        this.idProveedor = 0;
        this.nombre = "";
        this.telefono = "";
        this.direccion = "";
        this.estado = "";
    }

    //Constructor sobrecargado
    public Proveedor(int idTenico, String nombre, String apellido, String dni,String fech_tec, String telefono, String direccion, String estado) {
        
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
    }
    /**
     * @return the idTecnico
     */
    public int getIdProveedor() {
        return idProveedor;
    }

    /**
     * @param idTecnico the idTecnico to set
     */
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
