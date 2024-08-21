package br.com.fiap.gastroreserva.usecase;

import br.com.fiap.gastroreserva.entities.Restaurante;
import br.com.fiap.gastroreserva.exceptions.InformacoesIncompletasException;
import br.com.fiap.gastroreserva.interfaces.RestauranteRepository;
import br.com.fiap.gastroreserva.controllers.NovoRestauranteDTO;
import br.com.fiap.gastroreserva.entities.Funcionario;
import br.com.fiap.gastroreserva.exceptions.PermissaoNegadaException;
import br.com.fiap.gastroreserva.exceptions.RestauranteJaExisteException;

public class CadastroRestauranteUseCase {

    private final RestauranteRepository restauranteRepository;
    private final AutenticacaoService autenticacaoService;
    private final EventoCadastroRestaurante eventoCadastroRestaurante;

    public CadastroRestauranteUseCase(RestauranteRepository restauranteRepository, AutenticacaoService autenticacaoService, EventoCadastroRestaurante eventoCadastroRestaurante) {
        this.restauranteRepository = restauranteRepository;
        this.autenticacaoService = autenticacaoService;
        this.eventoCadastroRestaurante = eventoCadastroRestaurante;
    }

    public void executar(NovoRestauranteDTO novoRestauranteDTO, Funcionario funcionario){
        if(!autenticacaoService.temPermissaoParaCadastrarRestaurante(funcionario)){
            throw new PermissaoNegadaException("Funcionario não tem permissão para cadastrar restaurante");
        }

        if(restauranteRepository.existsByNome(novoRestauranteDTO.getNome())){
            throw new RestauranteJaExisteException("Restaurante ja cadastrado.");
        }

        Restaurante restaurante = new Restaurante();
        restaurante.setNome(novoRestauranteDTO.getNome());
        restaurante.setEndereco(novoRestauranteDTO.getEndereco());
        restaurante.setTelefone(novoRestauranteDTO.getTelefone());
        restaurante.setTipoCulinaria(novoRestauranteDTO.getTipoCulinaria());
        restaurante.setHorarioFuncionamento(novoRestauranteDTO.getHorarioFuncionamento());
        restaurante.setDescricao(novoRestauranteDTO.getDescricao());
        restaurante.setFotos(novoRestauranteDTO.getFotos());

        if(!restaurante.isInformacoesBasicasPreenchidas()){
            throw new InformacoesIncompletasException("informacoes basicas do Restaurante estão incompletas");
        }

        restauranteRepository.salvar(restaurante);
        eventoCadastroRestaurante.emitirEventoSucesso(restaurante);
    }
}


