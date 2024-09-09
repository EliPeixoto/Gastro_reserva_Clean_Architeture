package br.com.fiap.gastroreserva.usecases;

import br.com.fiap.gastroreserva.entities.RestauranteEntity;
import br.com.fiap.gastroreserva.exceptions.InformacoesIncompletasException;
import br.com.fiap.gastroreserva.entities.FuncionarioEntity;
import br.com.fiap.gastroreserva.exceptions.PermissaoNegadaException;
import br.com.fiap.gastroreserva.exceptions.RestauranteJaExisteException;
import br.com.fiap.gastroreserva.gateways.RestauranteGateway;
import org.springframework.stereotype.Service;

@Service
public class CadastroRestauranteUseCase {

    private final RestauranteGateway restauranteGateway;
    private final AutenticacaoService autenticacaoService;
    private final EventoCadastroRestaurante eventoCadastroRestaurante;

    public CadastroRestauranteUseCase(RestauranteGateway restauranteGateway, AutenticacaoService autenticacaoService, EventoCadastroRestaurante eventoCadastroRestaurante) {
        this.restauranteGateway = restauranteGateway;
        this.autenticacaoService = autenticacaoService;
        this.eventoCadastroRestaurante = eventoCadastroRestaurante;
    }

    public void executar(RestauranteEntity restaurante, FuncionarioEntity funcionarioEntity) {
        if (!autenticacaoService.temPermissaoParaCadastrarRestaurante(funcionarioEntity)) {
            throw new PermissaoNegadaException("Funcionario não tem permissão para cadastrar restaurante");
        }

        if (restauranteGateway.existsByNome(restaurante.getNome())) {
            throw new RestauranteJaExisteException("Restaurante já cadastrado.");
        }

        if (!restaurante.isInformacoesBasicasPreenchidas()) {
            throw new InformacoesIncompletasException("Informações básicas do restaurante estão incompletas.");
        }

        restauranteGateway.salvar(restaurante);
        eventoCadastroRestaurante.emitirEventoSucesso(restaurante);
    }
}
