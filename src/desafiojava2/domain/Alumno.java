package desafiojava2.domain;

public class Alumno {

    private String nombre;
    private String apellido;
    private int nroExamen;
    private double nota;

    public Alumno(String nombre, String apellido, int nroExamen, double nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroExamen = nroExamen;
        this.nota = nota;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public int getNroExamen() {
        return nroExamen;
    }

    public double getNota() {
        return nota;
    }
}
