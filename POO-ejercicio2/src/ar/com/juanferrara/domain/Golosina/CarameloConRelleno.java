package ar.com.juanferrara.domain.Golosina;

public class CarameloConRelleno extends Golosina{

    private String saborRelleno;
    private int cantidadRelleno;

    public CarameloConRelleno(int codigo, double precio, String nombre, String ingredientes, String saborRelleno, int cantidadRelleno) {
        super(codigo, precio, nombre, ingredientes);
        this.saborRelleno = saborRelleno;
        this.cantidadRelleno = cantidadRelleno;
    }

    @Override
    public String toString() {
        return "[" +
                "sabor relleno: " + saborRelleno +
                ", cantidad relleno: " + cantidadRelleno +
                ", codigo: " + codigo +
                ", precio: " + precio +
                ", nombre: " + nombre  +
                ", ingredientes: " + ingredientes +
                ']';
    }
}
