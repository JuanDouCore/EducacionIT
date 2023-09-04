package ar.com.juanferrara.domain.Golosina;

public class Golosina {

    protected int codigo;
    protected double precio;
    protected String nombre;
    protected String ingredientes;

    public Golosina(int codigo, double precio, String nombre, String ingredientes) {
        this.codigo = codigo;
        this.precio = precio;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }
}
