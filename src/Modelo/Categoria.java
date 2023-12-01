package Modelo;

public class Categoria {
    private int cat_cod;
    private String cat_nom;
    private String cat_des;

    public Categoria(String cat_nom, String cat_des) {
        this.cat_nom = cat_nom;
        this.cat_des = cat_des;
    }

    public int getCat_cod() {
        return cat_cod;
    }

    public void setCat_cod(int cat_cod) {
        this.cat_cod = cat_cod;
    }

    public String getCat_nom() {
        return cat_nom;
    }

    public void setCat_nom(String cat_nom) {
        this.cat_nom = cat_nom;
    }

    public String getCat_des() {
        return cat_des;
    }

    public void setCat_des(String cat_des) {
        this.cat_des = cat_des;
    }
}
