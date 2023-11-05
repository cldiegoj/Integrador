package modelo;

/**
 *
 * @author ediso
 */
public class Tecnicos {

    //Atributos
    private int idTecnico;
    private String nombre;
    private String apellido;
    private String DNI;
    private String Fech_tec;
    private String direccion;
    private String telefono;
    private String estado;

    //Constructor
    public Tecnicos() {
        this.idTecnico = 0;
        this.nombre = "";
        this.apellido = "";
        this.DNI = "";
        this.Fech_tec="";
        this.telefono = "";
        this.direccion = "";
        this.estado = "";
    }

    //Constructor sobrecargado
    public Tecnicos(int idTenico, String nombre, String apellido, String dni,String fech_tec, String telefono, String direccion, String estado) {
        this.idTecnico = idTenico;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = dni;
        this.Fech_tec = fech_tec;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
    }
    /**
     * @return the idTecnico
     */
    public int getIdTecnico() {
        return idTecnico;
    }

    /**
     * @param idTecnico the idTecnico to set
     */
    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the Fech_tec
     */
    public String getFech_tec() {
        return Fech_tec;
    }

    /**
     * @param Fech_tec the Fech_tec to set
     */
    public void setFech_tec(String Fech_tec) {
        this.Fech_tec = Fech_tec;
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
