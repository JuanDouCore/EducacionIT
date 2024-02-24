package ar.com.juanferrara.desafioeduit.repository;

import ar.com.juanferrara.desafioeduit.entities.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long> {
}
