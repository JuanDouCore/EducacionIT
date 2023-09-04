package ar.com.juanferrara.domain.Pedido;

import ar.com.juanferrara.domain.Golosina.Golosina;

public class GolosinaPedido {

    private Golosina golosina;
    private int cantidad;

    public GolosinaPedido(Golosina golosina, int cantidad) {
        this.golosina = golosina;
        this.cantidad = cantidad;
    }

    public Golosina getGolosina() {
        return golosina;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return golosina.toString();
    }
}
