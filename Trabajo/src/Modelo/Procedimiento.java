package Modelo;

import java.sql.Date;

public class Procedimiento {

    int id_pr, precio;
    String nombre, descr;
    boolean pago;
    Date fecha;

    public Procedimiento(int id_pr, int precio, String nombre, String desc) {
        this.id_pr = id_pr;
        this.precio = precio;
        this.nombre = nombre;
        this.descr = desc;
    }

    public Procedimiento(int id_pr, int precio, String nombre, String descr, boolean pago, Date fecha) {
        this.id_pr = id_pr;
        this.precio = precio;
        this.nombre = nombre;
        this.descr = descr;
        this.pago = pago;
        this.fecha = fecha;
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

   
    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
