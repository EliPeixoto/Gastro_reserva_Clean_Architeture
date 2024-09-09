package br.com.fiap.gastroreserva.mappers;

import br.com.fiap.gastroreserva.controllers.NovoRestauranteDTO;
import br.com.fiap.gastroreserva.entities.RestauranteEntity;

public class RestauranteMapper {
    public static RestauranteEntity toEntity(NovoRestauranteDTO dto) {
        RestauranteEntity restaurante = new RestauranteEntity();
        restaurante.setNome(dto.getNome());
        restaurante.setEndereco(dto.getEndereco());
        restaurante.setTelefone(dto.getTelefone());
        restaurante.setTipoCulinaria(dto.getTipoCulinaria());
        restaurante.setHorarioFuncionamento(dto.getHorarioFuncionamento());
        restaurante.setDescricao(dto.getDescricao());
        restaurante.setFotos(dto.getFotos());
        return restaurante;
    }
}
