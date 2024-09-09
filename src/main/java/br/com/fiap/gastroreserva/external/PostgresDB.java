package br.com.fiap.gastroreserva.external;

import br.com.fiap.gastroreserva.entities.RestauranteEntity;
import br.com.fiap.gastroreserva.interfaces.IDatabaseClient;

public class PostgresDB implements IDatabaseClient {

    @Override
    public RestauranteEntity ObterRestaurantePorId(String id){
        // TODO codigo postgres para buscar os dados e retornar

        return null;
    }


}
