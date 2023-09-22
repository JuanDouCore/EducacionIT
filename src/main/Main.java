package main;

import domain.model.TorreControl;
import domain.model.Volador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Volador volador1 = new Volador("SD-213", "avion", "Catamarca");
        Volador volador2 = new Volador("LK-213", "avioneta", "Jujuy");
        Volador volador3 = new Volador("RK-221", "jet", "Uruguay");
        Volador volador4 = new Volador("SD-331", "avion", "Mar del plata");

        List<Volador> voladorList = Arrays.asList(volador1, volador2, volador3, volador4);

        TorreControl torreControl = new TorreControl();
        torreControl.gestionarIngresoVoladores(voladorList);
    }
}