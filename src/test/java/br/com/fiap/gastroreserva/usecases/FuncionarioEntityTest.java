package br.com.fiap.gastroreserva.usecases;

import br.com.fiap.gastroreserva.entities.FuncionarioEntity;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FuncionarioEntityTest {

    @Test
    void deveCadastrarFuncionario() {
        FuncionarioEntity funcionarioEntity = new FuncionarioEntity(
                1L,
                "nome",
                "cargo",
                Arrays.asList("permissao1", "permissao2", "permissao 3")
        );

        long id = funcionarioEntity.getId();
        String nome = funcionarioEntity.getNome();
        String cargo = funcionarioEntity.getCargo();
        List<String> permissoes = funcionarioEntity.getPermissoes();

        assertEquals(1L, id);
        assertEquals("nome", nome);
        assertEquals("cargo", cargo);
        assertEquals(Arrays.asList("permissao1", "permissao2", "permissao 3"), permissoes);
    }

    @Test
    void deveAlterarNomeFuncionario(){
        FuncionarioEntity funcionarioEntity = new FuncionarioEntity();
        funcionarioEntity.setNome("novo Nome");
        String novoNomeFuncionario = funcionarioEntity.getNome();
        assertEquals("novo Nome", novoNomeFuncionario);
    }

    @Test
    void deveAlterarCargoFuncionario(){
        FuncionarioEntity funcionarioEntity = new FuncionarioEntity();
        funcionarioEntity.setCargo("novo Cargo");
        String novoCargoFuncionario = funcionarioEntity.getCargo();
        assertEquals("novo Cargo", novoCargoFuncionario);
    }

    @Test
    void deveAlterarPermissoesFuncionario(){
        FuncionarioEntity funcionarioEntity = new FuncionarioEntity();
        funcionarioEntity.setPermissoes(Arrays.asList("novaPermissao1", "novaPermissao2", "novaPermissao3"));
        List<String> novaPermissao = funcionarioEntity.getPermissoes();
        assertEquals(Arrays.asList("novaPermissao1", "novaPermissao2", "novaPermissao3"), novaPermissao);
    }

    @Test
    void deveCriarFuncionarioSemParametros(){
        FuncionarioEntity funcionarioEntity = new FuncionarioEntity();
        String nome = funcionarioEntity.getNome();
        String cargo = funcionarioEntity.getCargo();
        List<String> permissoes = funcionarioEntity.getPermissoes();

        assertEquals(null, nome);
        assertEquals(null, cargo);
        assertEquals(null, permissoes);
    }

    @Test
    void deveRetornarTrueQuandoTemPermissao() {
        List<String> permissoes = Arrays.asList("LER", "EDITAR", "DELETAR");
        FuncionarioEntity funcionarioEntity = new FuncionarioEntity(1L, "John Doe", "Manager", permissoes);
        assertTrue(funcionarioEntity.temPermissao("EDITAR"));
    }

    @Test
    void deveRetornarStringCorretaNoToString() {
        List<String> permissoes = Arrays.asList("LER", "EDITAR", "DELETAR");
        FuncionarioEntity funcionarioEntity = new FuncionarioEntity(1L, "John Doe", "Manager", permissoes);
        String stringEsperada = "Funcionario{id=1, nome='John Doe', cargo='Manager', permissoes=[LER, EDITAR, DELETAR]}";
        assertEquals(stringEsperada, funcionarioEntity.toString());
    }

}
