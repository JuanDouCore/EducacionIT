package ar.com.juanferrara.desafioeduit3.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;

@Entity
@DiscriminatorValue("E")
public class Empleado extends Persona {

    public Empleado() {
    }

    public Empleado(Long id, Long dni, String nombre, String apellido, int cantVentas, int ultIdVenta) {
        super(id, dni, nombre, apellido);
        this.cantVentas = cantVentas;
        this.ultIdVenta = ultIdVenta;
    }

    public Empleado(Long dni, String nombre, String apellido, int cantVentas, int ultIdVenta) {
        super(dni, nombre, apellido);
        this.cantVentas = cantVentas;
        this.ultIdVenta = ultIdVenta;
    }

    @Column(name = "cant_ventas")
    private int cantVentas;

    @Column(name = "ult_id_venta")
    private int ultIdVenta;

    public int getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }

    public int getUltIdVenta() {
        return ultIdVenta;
    }

    public void setUltIdVenta(int ultIdVenta) {
        this.ultIdVenta = ultIdVenta;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                "cantVentas=" + cantVentas +
                ", ultIdVenta=" + ultIdVenta +
                '}';
    }
}