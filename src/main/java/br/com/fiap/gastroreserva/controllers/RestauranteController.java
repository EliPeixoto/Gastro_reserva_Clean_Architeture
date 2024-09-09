package br.com.fiap.gastroreserva.controllers;

import br.com.fiap.gastroreserva.usecases.CadastroRestauranteUseCase;
import br.com.fiap.gastroreserva.entities.FuncionarioEntity;
import br.com.fiap.gastroreserva.entities.RestauranteEntity;
import br.com.fiap.gastroreserva.mappers.RestauranteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {

    @Autowired
    private CadastroRestauranteUseCase cadastroRestauranteUseCase;

    @PostMapping
    public void cadastrarRestaurante(@RequestBody NovoRestauranteDTO novoRestauranteDTO) {
        FuncionarioEntity funcionarioEntity = novoRestauranteDTO.getFuncionario();
        RestauranteEntity restaurante = RestauranteMapper.toEntity(novoRestauranteDTO);
        cadastroRestauranteUseCase.executar(restaurante, funcionarioEntity);
    }
}
