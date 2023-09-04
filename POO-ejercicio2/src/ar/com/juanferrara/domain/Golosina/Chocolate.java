package ar.com.juanferrara.domain.Golosina;

public class Chocolate extends Golosina{

    private String tipoChocolate;

    public Chocolate(int codigo, double precio, String nombre, String ingredientes, String tipoChocolate) {
        super(codigo, precio, nombre, ingredientes);
        this.tipoChocolate = tipoChocolate;
    }

    @Override
    public String toString() {
        return "[" +
                "tipo:" + tipoChocolate +
                ", codigo: " + codigo +
                ", precio: " + precio +
                ", nombre: " + nombre  +
                ", ingredientes: " + ingredientes +
                ']';
    }
}
