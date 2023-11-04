
package modelo;

public class Usuario {
    private int IDusuario;
    private String usu_dni;
    private String usu_nombre;
    private String usu_correo;
    private String usu_contra;
    private String usu_tipo;

    public Usuario() {
    }

    public Usuario(int IDusuario, String usu_dni, String usu_nombre, String usu_correo, String usu_contra, String usu_tipo) {
        this.IDusuario = IDusuario;
        this.usu_dni = usu_dni;
        this.usu_nombre = usu_nombre;
        this.usu_correo = usu_correo;
        this.usu_contra = usu_contra;
        this.usu_tipo = usu_tipo;
    }

    
    public String getUsu_tipo() {
        return usu_tipo;
    }

    public void setUsu_tipo(String usu_tipo) {
        this.usu_tipo = usu_tipo;
    }

    public String getUsu_dni() {
        return usu_dni;
    }

    public void setUsu_dni(String usu_dni) {
        this.usu_dni = usu_dni;
    }

    public String getUsu_nombre() {
        return usu_nombre;
    }

    public void setUsu_nombre(String usu_nombre) {
        this.usu_nombre = usu_nombre;
    }

    public String getUsu_correo() {
        return usu_correo;
    }

    public void setUsu_correo(String usu_correo) {
        this.usu_correo = usu_correo;
    }

    public String getUsu_contra() {
        return usu_contra;
    }

    public void setUsu_contra(String usu_contra) {
        this.usu_contra = usu_contra;
    }

    public int getIDusuario() {
        return IDusuario;
    }

    public void setIDusuario(int IDusuario) {
        this.IDusuario = IDusuario;
    }
}

