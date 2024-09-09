package br.com.fiap.gastroreserva.gateways;

import br.com.fiap.gastroreserva.entities.RestauranteEntity;
import br.com.fiap.gastroreserva.interfaces.IDatabaseClient;
import br.com.fiap.gastroreserva.interfaces.IRestauranteGateway;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class RestauranteGateway implements IRestauranteGateway {

    private final IDatabaseClient databaseClient;



    public RestauranteGateway(IDatabaseClient databaseClient){
        this.databaseClient = databaseClient;
    }


    @Override
    public RestauranteEntity ObterRestaurantePorId(String id){
        return this.databaseClient.ObterRestaurantePorId(id);
    }

    @Override
    public void salvar(RestauranteEntity restaurante) {

    }

    @Override
    public boolean existsByNome(String nome) {
        return false;
    }

    @Override
    public Optional<RestauranteEntity> buscarPorId(Long id) {
        return Optional.empty();
    }

    @Override
    public List<RestauranteEntity> buscarTodos() {
        return List.of();
    }
}
