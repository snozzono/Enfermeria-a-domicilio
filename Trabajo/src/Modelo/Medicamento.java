package Modelo;

import java.sql.Date;

public class Medicamento {

    int id_med, ciclo;
    boolean cronico;
    String nombre_med;
    Date tomar;

    public Medicamento(int id_med, boolean cronico, int ciclo, String nombre_med, Date tomar) {
        this.id_med = id_med;
        this.cronico = cronico;
        this.ciclo = ciclo;
        this.nombre_med = nombre_med;
        this.tomar = tomar;
    }

    public Medicamento() {
    }

    public int getId_med() {
        return id_med;
    }

    public boolean isCronico() {
        return cronico;
    }

    public void setCronico(boolean cronico) {
        this.cronico = cronico;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
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

    public void setNombre_med(String nombre_med) {
        this.nombre_med = nombre_med;
    }

    public void setTomar(Date tomar) {
        this.tomar = tomar;
    }

}
