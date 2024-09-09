package br.com.fiap.gastroreserva.interfaces;

import br.com.fiap.gastroreserva.entities.RestauranteEntity;

import java.util.List;
import java.util.Optional;


public interface IRestauranteGateway {
    RestauranteEntity ObterRestaurantePorId(String id);
    void salvar(RestauranteEntity restaurante);
    boolean existsByNome(String nome);
    Optional<RestauranteEntity> buscarPorId(Long id);
    List<RestauranteEntity> buscarTodos();
}
