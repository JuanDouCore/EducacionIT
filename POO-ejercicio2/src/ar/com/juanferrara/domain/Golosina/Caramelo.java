package ar.com.juanferrara.domain.Golosina;

public class Caramelo extends Golosina
{
    private String sabor;
    private String color;

    public Caramelo(int codigo, double precio, String nombre, String ingredientes, String sabor, String color) {
        super(codigo, precio, nombre, ingredientes);
        this.sabor = sabor;
        this.color = color;
    }

    @Override
    public String toString() {
        return "[" +
                "sabor: " + sabor +
                ", color: " + color +
                ", codigo: " + codigo +
                ", precio: " + precio +
                ", nombre: " + nombre  +
                ", ingredientes: " + ingredientes +
                ']';
    }
}
