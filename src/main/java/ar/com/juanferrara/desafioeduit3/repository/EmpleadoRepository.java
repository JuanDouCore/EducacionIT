package ar.com.juanferrara.desafioeduit3.repository;

import ar.com.juanferrara.desafioeduit3.entities.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {
}