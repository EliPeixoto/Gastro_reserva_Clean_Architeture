/*
package br.com.fiap.gastroreserva.gateways.persistence;

import br.com.fiap.gastroreserva.entities.Restaurante;
import br.com.fiap.gastroreserva.interfaces.RestauranteGateway;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RestauranteGatewayImpl implements RestauranteGateway {
    private final EntityManager entityManager;

    public RestauranteGatewayImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public void salvar(Restaurante restaurante){
        entityManager.persist(restaurante);
    }

    public boolean existsByNome(String nome){
        return entityManager.createQuery("SELECT COUNT(r) FROM Restaurante r WHERE r.nome = :nome", Long.class)
                .setParameter("nome", nome)
                .getSingleResult() > 0;
    }

    @Override
    public Optional<Restaurante> buscarPorId(Long id) {
        return Optional.ofNullable(entityManager.find(Restaurante.class, id));
    }

    @Override
    public List<Restaurante> buscarTodos() {
        return entityManager.createQuery("SELECT r FROM Restaurante r", Restaurante.class)
                .getResultList();
    }
}
*/
