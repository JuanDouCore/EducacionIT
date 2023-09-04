package ar.com.juanferrara.domain.Gestores;

import ar.com.juanferrara.domain.Golosina.Golosina;
import ar.com.juanferrara.domain.Pedido.GolosinaPedido;
import ar.com.juanferrara.domain.Pedido.Pedido;

import java.util.ArrayList;
import java.util.List;

public class GestorPedidos {

    private List<Pedido> pedidos = new ArrayList<>();

    public void registrarPedido(List<GolosinaPedido> golosinas){
        int id = pedidos.size()+1;

        double costoTotal = 0;
        for (int i = 0; i < golosinas.size(); i++) {
            costoTotal+=golosinas.get(i).getGolosina().getPrecio()*golosinas.get(i).getCantidad();
        }

        pedidos.add(new Pedido(id, costoTotal, golosinas));
    }

    public void removerPedido(int id) {
        for (int i = 0; i < pedidos.size(); i++) {
            if(pedidos.get(i).getId() == id) {
                pedidos.remove(id);
                break;
            }
        }
    }

    public void mostrarPedidos() {
        System.out.println("Pedidos: ");
        pedidos.forEach(System.out::println);
    }
}
