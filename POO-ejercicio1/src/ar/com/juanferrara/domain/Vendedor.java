package ar.com.juanferrara.domain;

public class Vendedor {

    private String nombre, apellido;
    private int codigoVendedor;

    public Vendedor(String nombre, String apellido, int codigoVendedor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoVendedor = codigoVendedor;
    }
}
