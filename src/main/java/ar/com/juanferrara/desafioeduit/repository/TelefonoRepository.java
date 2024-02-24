package ar.com.juanferrara.desafioeduit.repository;

import ar.com.juanferrara.desafioeduit.entities.Telefono;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefonoRepository  extends CrudRepository<Telefono, Long> {
}
