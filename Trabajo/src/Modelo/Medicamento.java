
package Modelo;

public class Medicamento {
    int id_med, precio, cant;
    String nombre_med;

    public Medicamento(int id_med, int precio, int cant, String nombre_med) {
        this.id_med = id_med;
        this.precio = precio;
        this.cant = cant;
        this.nombre_med = nombre_med;
    }

    public int getId_med() {
        return id_med;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCant() {
        return cant;
    }

    public String getNombre_med() {
        return nombre_med;
    }

    public void setId_med(int id_med) {
        this.id_med = id_med;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public void setNombre_med(String nombre_med) {
        this.nombre_med = nombre_med;
    }
    
    
}
