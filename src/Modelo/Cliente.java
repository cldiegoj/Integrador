package Modelo;

/**
 *
 * @author ediso
 */
public class Cliente {

    //Atributos
    private int idCliente;
    private String nombre;
    private String DNI;
    private String telefono;
    private String estado;

    //Constructor
    public Cliente() {
        this.idCliente = 0;
        this.nombre = "";
        this.DNI = "";
        this.telefono = "";
        this.estado = "";
    }

    //Constructor sobrecargado
    public Cliente(int idCliente, String nombre, String dni, String telefono, String direccion, String estado) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.DNI = dni;
        this.telefono = telefono;
        this.estado = estado;
    }

    //metodos set and get
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setCedula(String dni) {
        this.DNI = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
