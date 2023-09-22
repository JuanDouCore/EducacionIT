package domain.model;

public class Volador {

    private String matricula;
    private String tipoVolador;
    private String procedencia;

    public Volador(String matricula, String tipoVolador, String procedencia) {
        this.matricula = matricula;
        this.tipoVolador = tipoVolador;
        this.procedencia = procedencia;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getTipoVolador() {
        return tipoVolador;
    }

    public String getProcedencia() {
        return procedencia;
    }
}
