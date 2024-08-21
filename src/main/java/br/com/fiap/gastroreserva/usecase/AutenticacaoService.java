package br.com.fiap.gastroreserva.usecase;

import br.com.fiap.gastroreserva.entities.Funcionario;
public class AutenticacaoService {
    public boolean temPermissaoParaCadastrarRestaurante(Funcionario funcionario) {
        return funcionario.temPermissao("CADASTRAR_RESTAURANTE");
    }
}
