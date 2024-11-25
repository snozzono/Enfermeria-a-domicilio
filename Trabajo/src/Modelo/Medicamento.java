package Modelo;

import java.sql.Date;

public class Medicamento {

    int id_med;
    double cant;
    String nombre_med;
    Date tomar;

    public Medicamento(int id_med, double cant, String nombre_med, Date tomar) {
        this.id_med = id_med;
        this.cant = cant;
        this.nombre_med = nombre_med;
        this.tomar = tomar;
    }

    public Medicamento(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_med() {
        return id_med;
    }

    public double getCant() {
        return cant;
    }

    public String getNombre_med() {
        return nombre_med;
    }

    public Date getTomar() {
        return tomar;
    }

    public void setId_med(int id_med) {
        this.id_med = id_med;
    }

    public void setCant(double cant) {
        this.cant = cant;
    }

    public void setNombre_med(String nombre_med) {
        this.nombre_med = nombre_med;
    }

    public void setTomar(Date tomar) {
        this.tomar = tomar;
    }

}
