package br.com.fiap.gastroreserva.domain;

import br.com.fiap.gastroreserva.entities.Funcionario;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FuncionarioTest {

    @Test
    void deveCadastrarFuncionario() {
        Funcionario funcionario = new Funcionario(
                1L,
                "nome",
                "cargo",
                Arrays.asList("permissao1", "permissao2", "permissao 3")
        );

        long id = funcionario.getId();
        String nome = funcionario.getNome();
        String cargo = funcionario.getCargo();
        List<String> permissoes = funcionario.getPermissoes();

        assertEquals(1L, id);
        assertEquals("nome", nome);
        assertEquals("cargo", cargo);
        assertEquals(Arrays.asList("permissao1", "permissao2", "permissao 3"), permissoes);
    }

    @Test
    void deveAlterarNomeFuncionario(){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("novo Nome");
        String novoNomeFuncionario = funcionario.getNome();
        assertEquals("novo Nome", novoNomeFuncionario);
    }

    @Test
    void deveAlterarCargoFuncionario(){
        Funcionario funcionario = new Funcionario();
        funcionario.setCargo("novo Cargo");
        String novoCargoFuncionario = funcionario.getCargo();
        assertEquals("novo Cargo", novoCargoFuncionario);
    }

    @Test
    void deveAlterarPermissoesFuncionario(){
        Funcionario funcionario = new Funcionario();
        funcionario.setPermissoes(Arrays.asList("novaPermissao1", "novaPermissao2", "novaPermissao3"));
        List<String> novaPermissao = funcionario.getPermissoes();
        assertEquals(Arrays.asList("novaPermissao1", "novaPermissao2", "novaPermissao3"), novaPermissao);
    }

    @Test
    void deveCriarFuncionarioSemParametros(){
        Funcionario funcionario = new Funcionario();
        String nome = funcionario.getNome();
        String cargo = funcionario.getCargo();
        List<String> permissoes = funcionario.getPermissoes();

        assertEquals(null, nome);
        assertEquals(null, cargo);
        assertEquals(null, permissoes);
    }

    @Test
    void deveRetornarTrueQuandoTemPermissao() {
        List<String> permissoes = Arrays.asList("LER", "EDITAR", "DELETAR");
        Funcionario funcionario = new Funcionario(1L, "John Doe", "Manager", permissoes);
        assertTrue(funcionario.temPermissao("EDITAR"));
    }

    @Test
    void deveRetornarStringCorretaNoToString() {
        List<String> permissoes = Arrays.asList("LER", "EDITAR", "DELETAR");
        Funcionario funcionario = new Funcionario(1L, "John Doe", "Manager", permissoes);
        String stringEsperada = "Funcionario{id=1, nome='John Doe', cargo='Manager', permissoes=[LER, EDITAR, DELETAR]}";
        assertEquals(stringEsperada, funcionario.toString());
    }

}
