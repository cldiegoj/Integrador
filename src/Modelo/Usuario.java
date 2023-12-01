package Modelo;

/**
 *
 * @author kevfe
 */
public class Usuario {
    //Atributos
    private int usr_cod;
    private String usr_name;
    private String usr_pass;
    private String usr_nom;
    private String usr_ape;
    private String usr_telf;
    private int usr_status;
    private int car_cod; 

    // Constructor vacío
    public Usuario() {
        usr_cod = 0;
        usr_name = "";
        usr_pass = "";
        usr_nom = "";
        usr_ape = "";
        usr_telf = "";
        usr_status = 0;
        car_cod = 0;
    }
    
    //a
    // Constructor con parámetros
    public Usuario(int usr_cod, String usr_name, String usr_pass, String usr_nom, String usr_ape, String usr_telf, int usr_status, int car_cod) {
        this.usr_cod = usr_cod;
        this.usr_name = usr_name;
        this.usr_pass = usr_pass;
        this.usr_nom = usr_nom;
        this.usr_ape = usr_ape;
        this.usr_telf = usr_telf;
        this.usr_status = usr_status;
        this.car_cod = car_cod;
    }

    /**
     * @return the usr_cod
     */
    public int getUsr_cod() {
        return usr_cod;
    }

    /**
     * @param usr_cod the usr_cod to set
     */
    public void setUsr_cod(int usr_cod) {
        this.usr_cod = usr_cod;
    }

    /**
     * @return the usr_name
     */
    public String getUsr_name() {
        return usr_name;
    }

    /**
     * @param usr_name the usr_name to set
     */
    public void setUsr_name(String usr_name) {
        this.usr_name = usr_name;
    }

    /**
     * @return the usr_pass
     */
    public String getUsr_pass() {
        return usr_pass;
    }

    /**
     * @param usr_pass the usr_pass to set
     */
    public void setUsr_pass(String usr_pass) {
        this.usr_pass = usr_pass;
    }

    /**
     * @return the usr_nom
     */
    public String getUsr_nom() {
        return usr_nom;
    }

    /**
     * @param usr_nom the usr_nom to set
     */
    public void setUsr_nom(String usr_nom) {
        this.usr_nom = usr_nom;
    }

    /**
     * @return the usr_ape
     */
    public String getUsr_ape() {
        return usr_ape;
    }

    /**
     * @param usr_ape the usr_ape to set
     */
    public void setUsr_ape(String usr_ape) {
        this.usr_ape = usr_ape;
    }

    /**
     * @return the usr_telf
     */
    public String getUsr_telf() {
        return usr_telf;
    }

    /**
     * @param usr_telf the usr_telf to set
     */
    public void setUsr_telf(String usr_telf) {
        this.usr_telf = usr_telf;
    }

    /**
     * @return the usr_status
     */
    public int getUsr_status() {
        return usr_status;
    }

    /**
     * @param usr_status the usr_status to set
     */
    public void setUsr_status(int usr_status) {
        this.usr_status = usr_status;
    }

    /**
     * @return the car_cod
     */
    public int getCar_cod() {
        return car_cod;
    }

    /**
     * @param car_cod the car_cod to set
     */
    public void setCar_cod(int car_cod) {
        this.car_cod = car_cod;
    }

}