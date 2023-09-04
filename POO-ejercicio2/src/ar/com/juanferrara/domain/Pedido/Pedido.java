package ar.com.juanferrara.domain.Pedido;

import java.util.List;

public class Pedido {

    private int id;
    private double costoTotal;
    private List<GolosinaPedido> golosinas;

    public Pedido(int id, double costoTotal, List<GolosinaPedido> golosinas) {
        this.id = id;
        this.costoTotal = costoTotal;
        this.golosinas = golosinas;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "[" +
                "id=" + id +
                ", costoTotal=" + costoTotal +
                ", golosinas=" + golosinas +
                ']';
    }
}
