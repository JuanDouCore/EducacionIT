package ar.com.juanferrara.domain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CotizacionesService {

    private ArrayList<Cotizacion> cotizaciones = new ArrayList<>();

    public void registrarCotizacion(Vendedor vendedor, Prenda prenda, int cantidad) {

        SimpleDateFormat simpleDateForma = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        Date dateNow = new Date();
        String dateNowString = simpleDateForma.format(dateNow);


        cotizaciones.add(new Cotizacion(
                cotizaciones.size()+1,
                dateNowString,
                cantidad,
                prenda.getPrecio() * cantidad,
                vendedor,
                prenda
        ));

    }

    public List<String> listarCotizaciones(Vendedor vendedor) {
        List<String> cotizacionesVendedor = new ArrayList<>();

        cotizaciones.stream()
                .filter(x -> x.getVendedor().equals(vendedor))
                .forEach(cotizacion -> cotizacionesVendedor.add(cotizacion.toString()));

        return cotizacionesVendedor;
    }
}
