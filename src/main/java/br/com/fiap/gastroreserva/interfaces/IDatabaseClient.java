package br.com.fiap.gastroreserva.interfaces;

import br.com.fiap.gastroreserva.entities.RestauranteEntity;

public interface IDatabaseClient extends IRestauranteGateway{
    RestauranteEntity ObterRestaurantePorId(String id);
}
