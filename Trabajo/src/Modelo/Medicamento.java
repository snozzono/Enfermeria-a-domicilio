package Modelo;

import java.sql.Date;

public class Medicamento {

    int id_med, cant;
    String nombre_med;
    Date tomar;

    public Medicamento(int id_med, int cant, String nombre_med, Date tomar) {
        this.id_med = id_med;
        this.cant = cant;
        this.nombre_med = nombre_med;
        this.tomar = tomar;
    }

    public int getId_med() {
        return id_med;
    }

    public int getCant() {
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

    public void setCant(int cant) {
        this.cant = cant;
    }

    public void setNombre_med(String nombre_med) {
        this.nombre_med = nombre_med;
    }

    public void setTomar(Date tomar) {
        this.tomar = tomar;
    }

}
