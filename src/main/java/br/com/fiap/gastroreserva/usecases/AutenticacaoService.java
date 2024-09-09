package br.com.fiap.gastroreserva.usecases;

import br.com.fiap.gastroreserva.entities.FuncionarioEntity;
import org.springframework.stereotype.Service;

@Service
public class AutenticacaoService {
    public boolean temPermissaoParaCadastrarRestaurante(FuncionarioEntity funcionarioEntity) {
        return funcionarioEntity.temPermissao("CADASTRAR_RESTAURANTE");
    }
}
