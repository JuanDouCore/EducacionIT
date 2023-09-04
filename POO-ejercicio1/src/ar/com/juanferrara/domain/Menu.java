package ar.com.juanferrara.domain;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class Menu {
    private CotizacionesService cotizacionesService = new CotizacionesService();

    private Vendedor vendedorLogged;

    public void lanzarMainMenu() {

        int opcion = 1;

        do {
            Scanner teclado = new Scanner(System.in);

            if(vendedorLogged!=null) {
                mostrarOpcionesPrincipales();

                print("Ingrese opción: ");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        lanzarMenuRegistrarCotizacion();
                        break;
                    case 2:
                        lanzarMenuListarCotizaciones();
                        break;
                    case 3:
                        vendedorLogged = null;
                        break;
                }
            } else {
                logearVendedor();
            }

        } while (opcion != 0);


    }

    private void lanzarMenuListarCotizaciones() {
        Scanner teclado = new Scanner(System.in);

        print("\n\n\n");
        print("Mostrando tus cotizaciones: ");
        cotizacionesService.listarCotizaciones(vendedorLogged).forEach(this::print);
        print("pulse una tecla para volver...");
        teclado.next();
    }

    private void lanzarMenuRegistrarCotizacion() {
        Scanner teclado = new Scanner(System.in);

        print("\n\n\n");
        print("Ingrese nombre prenda: ");
        String nombrePrenda = teclado.next();

        print("Ingrese valor de la prenda: ");
        Double valorPrenda = teclado.nextDouble();

        print("Ingrese cantidad a vender: ");
        int cantidadAVender = teclado.nextInt();

        print("\n\n\n");
        print("Cotizacion cargada con exito");
        print("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#");

        Prenda prenda = new Prenda(nombrePrenda, valorPrenda);
        cotizacionesService.registrarCotizacion(vendedorLogged, prenda, cantidadAVender);
    }

    private void mostrarOpcionesPrincipales() {
        print("1 - Registrar cotizacion");
        print("2 - Mostrar tus cotizaciones");
        print("3 - Cerrar Sesion");
        print("0 - Finalizar el Programa");
    }
    private void logearVendedor() {
        Scanner teclado = new Scanner(System.in);

        print("\n\n\n");
        print("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#");
        print("Centro de cotizaciones - Inicie sesion");
        print("Ingrese su nombre: ");
        String nombre = teclado.next();
        print("Ingrese su apellido: ");
        String apellido = teclado.next();
        print("Ingrese codigo de vendedor: ");
        int codigoVendedor = teclado.nextInt();;
        print("\n\n\n");
        print("Bienvenido " + nombre + " " + apellido);

        vendedorLogged = new Vendedor(nombre, apellido, codigoVendedor);
    }

    private void print(String text) {
        System.out.println(text);
    }
}
