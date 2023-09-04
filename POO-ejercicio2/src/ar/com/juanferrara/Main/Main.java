package ar.com.juanferrara.Main;

import ar.com.juanferrara.domain.Gestores.GestorGolosinas;
import ar.com.juanferrara.domain.Gestores.GestorPedidos;
import ar.com.juanferrara.domain.Golosina.Caramelo;
import ar.com.juanferrara.domain.Golosina.CarameloConRelleno;
import ar.com.juanferrara.domain.Golosina.Chocolate;
import ar.com.juanferrara.domain.Golosina.Golosina;
import ar.com.juanferrara.domain.Pedido.GolosinaPedido;
import ar.com.juanferrara.domain.Pedido.Pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GestorGolosinas gestorGolosinas = new GestorGolosinas();
        GestorPedidos gestorPedidos = new GestorPedidos();

        //agregando golosinas
        Golosina caramelo1 = new Caramelo(1, 100.5, "Un gran caramelo", "asd asd er", "limon", "amarillo");
        Golosina caramelo2 = new Caramelo(41, 200, "Un gran caramelo 2", "asd asd er", "frutilla", "rojo");
        Golosina caramelo3 = new CarameloConRelleno(2, 51.21, "caramello relleno frutilla", "asd asd er", "frutilla", 30);
        Golosina chocolate = new Chocolate(3, 205.21, "Chocolate Arcor", "Muchos ingredientes", "Chocolate negro");

        gestorGolosinas.agregar(caramelo1);
        gestorGolosinas.agregar(caramelo2);
        gestorGolosinas.agregar(caramelo3);
        gestorGolosinas.agregar(chocolate);

        gestorGolosinas.mostrarGolosinas();

        //pedidos
        List<GolosinaPedido> golosinaPedidoList = List.of(
                new GolosinaPedido(caramelo1, 2),
                new GolosinaPedido(caramelo2, 5)

        );
        gestorPedidos.registrarPedido(golosinaPedidoList);

        List<GolosinaPedido> golosinaPedidoList2 = List.of(
                new GolosinaPedido(chocolate, 6),
                new GolosinaPedido(caramelo2, 5)

        );
        gestorPedidos.registrarPedido(golosinaPedidoList2);

        gestorPedidos.mostrarPedidos();

        gestorPedidos.removerPedido(1);

        gestorPedidos.mostrarPedidos();
    }
}