package ar.com.juanferrara.desafioeduit3.repository;

import ar.com.juanferrara.desafioeduit3.entities.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, Long> {
}