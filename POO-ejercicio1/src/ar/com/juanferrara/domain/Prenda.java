package ar.com.juanferrara.domain;

public class Prenda {

    private String nombre;
    private Double precio;

    public Prenda(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " $" + precio;
    }
}
