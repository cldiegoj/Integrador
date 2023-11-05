package modelo;

/**
 *
 * @author ediso
 */
public class Categoria {
    
    private int idCategoria;
    private String descripcion;
    private String estado;
    
    public Categoria(){
        this.idCategoria = 0;
        this.descripcion = "";
        this.estado = "";
    }

    public Categoria(int idCategoria, String descripcion, String estado) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
     
    
}
