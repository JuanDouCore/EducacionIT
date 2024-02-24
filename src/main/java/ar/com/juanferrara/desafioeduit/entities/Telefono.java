package ar.com.juanferrara.desafioeduit.entities;

import ch.qos.logback.core.net.server.Client;
import jakarta.persistence.*;

@Entity
@Table(name = "telefonos")


public class Telefono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "dni_persona")
    private Persona persona;

    @Column(name = "numero")
    private int numero;

    @Column(name = "tipo")
    private String tipo;

    public Telefono() {
    }

    public Telefono(Long id, int numero, String tipo) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
    }

    public Telefono(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
