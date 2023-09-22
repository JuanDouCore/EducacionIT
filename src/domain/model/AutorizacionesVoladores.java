package domain.model;

public interface AutorizacionesVoladores {

    void autorizarVolador(Volador volador);
    void aprobar(Volador volador);
    void rechazar(Volador volador);
    void asignarPista(int pista);
}
