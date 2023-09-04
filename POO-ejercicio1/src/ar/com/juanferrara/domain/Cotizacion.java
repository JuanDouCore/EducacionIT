package ar.com.juanferrara.domain;

public class Cotizacion {


    private int idCotizacion;
    private String fechaYhora;
    private int cantUnidades;
    private double totalCotizacion;
    private Vendedor vendedor;
    private Prenda prenda;

    public Cotizacion(int idCotizacion, String fechaYhora, int cantUnidades, double totalCotizacion, Vendedor vendedor, Prenda prenda) {
        this.idCotizacion = idCotizacion;
        this.fechaYhora = fechaYhora;
        this.cantUnidades = cantUnidades;
        this.totalCotizacion = totalCotizacion;
        this.vendedor = vendedor;
        this.prenda = prenda;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    @Override
    public String toString() {
        return "Cotizacion- " +
                "idCotizacion: " + idCotizacion +
                ", fechaYhora: '" + fechaYhora + '\'' +
                ", cantUnidades: " + cantUnidades +
                ", totalCotizacion: " + totalCotizacion +
                ", vendedor: " + vendedor;
    }
}
