
package Modelo;

public class Procedimiento {
    int id_pr, precio;
    String nombre, desc;

    public Procedimiento(int id_pr, int precio, String nombre, String desc) {
        this.id_pr = id_pr;
        this.precio = precio;
        this.nombre = nombre;
        this.desc = desc;
    }

    public int getId_pr() {
        return id_pr;
    }

    public void setId_pr(int id_pr) {
        this.id_pr = id_pr;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
}
