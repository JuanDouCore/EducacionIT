package ar.com.juanferrara.domain.Gestores;

import ar.com.juanferrara.domain.Golosina.Caramelo;
import ar.com.juanferrara.domain.Golosina.CarameloConRelleno;
import ar.com.juanferrara.domain.Golosina.Chocolate;
import ar.com.juanferrara.domain.Golosina.Golosina;

import java.util.ArrayList;

public class GestorGolosinas {

    private ArrayList<Golosina> golosinas = new ArrayList<>();

    public void agregar(Golosina golosina) { golosinas.add(golosina); }

    public void mostrarGolosinas() {

        System.out.println("Caramelos: ");
        golosinas.stream()
                .filter(golosina -> golosina instanceof Caramelo)
                .forEach(System.out::println);
        System.out.println(" ");

        System.out.println("Caramelos con Relleno: ");
        golosinas.stream()
                .filter(golosina -> golosina instanceof CarameloConRelleno)
                .forEach(System.out::println);
        System.out.println(" ");

        System.out.println("Chocolate: ");
        golosinas.stream()
                .filter(golosina -> golosina instanceof Chocolate)
                .forEach(System.out::println);
    }
}
