package domain.model;

import java.util.List;
import java.util.Scanner;

public class TorreControl implements AutorizacionesVoladores{

    public void gestionarIngresoVoladores(List<Volador> voladorList) {
        for(Volador volador : voladorList) {
            autorizarVolador(volador);
        }
    }

    @Override
    public void autorizarVolador(Volador volador) {
        if (volador.getTipoVolador().equalsIgnoreCase("AVION")) {
            aprobar(volador);
            asignarPista(1);
        } else {
            System.out.println("El volador de tipo " + volador.getTipoVolador() + " no tiene autorizado aterrizar en la pista 1");
            System.out.println("Lo autoriza a aterrizar en la pista 2? Ingrese si/no");

            Scanner scanner = new Scanner(System.in);
            String autoriza = scanner.next();

            if (autoriza == "si") {
                aprobar(volador);
                asignarPista(2);
            } else {
                rechazar(volador);
            }

        }

    }

    @Override
    public void aprobar(Volador volador) {
        System.out.println("Volador " + volador.getTipoVolador() + " " + volador.getMatricula() + " QUE PROVIENE DE " + volador.getProcedencia() + " ESTA AUTORIZADO A ATERRIZAR.");
    }

    @Override
    public void rechazar(Volador volador) {
        System.out.println("Volador " + volador.getTipoVolador() + " " + volador.getMatricula() + " QUE PROVIENE DE " + volador.getProcedencia() + " ESTA DENEGADO A ATERRIZAR.");
    }

    @Override
    public void asignarPista(int pista) {
        System.out.println("Aterriza en la pista: " + pista);
    }


}
