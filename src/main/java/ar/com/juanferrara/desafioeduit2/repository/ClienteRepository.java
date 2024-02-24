package ar.com.juanferrara.desafioeduit2.repository;

import ar.com.juanferrara.desafioeduit2.entities.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository {

    Cliente save(Cliente cliente);
    Cliente findById(Long id);
    Cliente findByDni(Long dni);
    int getCantidadDeCompras(Long dni);
}
