package modelo;

public class Colores 
{
    private String codigo, color;
    private int cantidad;

    public Colores(String codigo, String color, int cantidad) {
        this.codigo = codigo;
        this.color = color;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getColor() {
        return color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
