package ar.com.juanferrara.desafioeduit.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "personas")

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "dni")
    private Long dni;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Telefono> telefonos;

    public Persona() {
    }

    public Persona(Long id, Long dni, String nombre, String apellido, String email, List<Telefono> telefonos) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefonos = telefonos;
    }

    public Persona(Long dni, String nombre, String apellido, String email, List<Telefono> telefonos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefonos = telefonos;
    }




    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }
}
