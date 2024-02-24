package ar.com.juanferrara.desafioeduit2.repository.impl;

import ar.com.juanferrara.desafioeduit2.entities.Cliente;
import ar.com.juanferrara.desafioeduit2.repository.ClienteRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepositoryImpl  implements ClienteRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
        entityManager.persist(cliente);
        return cliente;
    }

    @Override
    public Cliente findById(Long id) {
        return (Cliente) entityManager.createQuery("SELECT c FROM Cliente c WHERE c.id = :id")
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public Cliente findByDni(Long dni) {
        return (Cliente) entityManager.createQuery("SELECT c FROM Cliente c WHERE c.dni = :dni")
                .setParameter("dni", dni)
                .getSingleResult();
    }

    @Override
    public int getCantidadDeCompras(Long dni) {
        return (Integer) entityManager.createQuery("SELECT c.totalCompras FROM Cliente c WHERE c.dni = :dni")
                .setParameter("dni", dni)
                .getSingleResult();
    }
}
