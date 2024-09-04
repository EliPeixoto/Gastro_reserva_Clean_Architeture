package br.com.fiap.gastroreserva.domain;

import br.com.fiap.gastroreserva.entities.Restaurante;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RestauranteTest {

    @Test
    void deveCadastrarRestaurante() {
        Restaurante restaurante = new Restaurante(
                1L,
                "gastroReserva",
                "Endereco",
                "1111111",
                "Restaurante Brasileiro",
                "11 as 00h",
                "Restaurante Gastonomico",
                Arrays.asList("foto1.jpg", "foto2.jpg", "foto3.jpg")
        );

        long id = restaurante.getId();
        String nome = restaurante.getNome();
        String endereco = restaurante.getEndereco();
        String telefone = restaurante.getTelefone();
        String tipoCulinaria = restaurante.getTipoCulinaria();
        String horarioFuncionamento = restaurante.getHorarioFuncionamento();
        String descricao = restaurante.getDescricao();
        List<String> fotosRestaurante = restaurante.getFotos();

        assertEquals(1L, id);
        assertEquals("gastroReserva", nome);
        assertEquals("Endereco", endereco);
        assertEquals("1111111", telefone);
        assertEquals("Restaurante Brasileiro", tipoCulinaria);
        assertEquals("11 as 00h", horarioFuncionamento);
        assertEquals("Restaurante Gastonomico", descricao);
        assertEquals(Arrays.asList("foto1.jpg", "foto2.jpg", "foto3.jpg"), fotosRestaurante);
    }

    @Test
    void deveAlterarNomeDoRestaurante() {
        Restaurante restaurante = new Restaurante();
        restaurante.setNome("Novo nome");
        String nomeRestaurante = restaurante.getNome();
        assertEquals("Novo nome", nomeRestaurante);
    }

    @Test
    void deveAlterarEnderecoDoRestaurante() {
        Restaurante restaurante = new Restaurante();
        restaurante.setEndereco("Novo endereco");
        String endereco = restaurante.getEndereco();
        assertEquals("Novo endereco", endereco);
    }

    @Test
    void deveAlterarTelefoneDoRestaurante() {
        Restaurante restaurante = new Restaurante();
        restaurante.setTelefone("2222222");
        String telefone = restaurante.getTelefone();
        assertEquals("2222222", telefone);
    }

    @Test
    void deveAlterarTipoCulinariaDoRestaurante() {
        Restaurante restaurante = new Restaurante();
        restaurante.setTipoCulinaria("novo Tipo Culinaria");
        assertEquals("novo Tipo Culinaria", restaurante.getTipoCulinaria());
    }

    @Test
    void deveAlterarHorarioDeAtendimentoDoRestaurante() {
        Restaurante restaurante = new Restaurante();
        restaurante.setHorarioFuncionamento("Novo horario de atendimento");
        String horarioFuncionamento = restaurante.getHorarioFuncionamento();
        assertEquals("Novo horario de atendimento", horarioFuncionamento);
    }

    @Test
    void deveAlterarDescricaoDoRestaurante() {
        Restaurante restaurante = new Restaurante();
        restaurante.setDescricao("Nova Descricao do Restaurante");
        String descricao = restaurante.getDescricao();
        assertEquals("Nova Descricao do Restaurante", descricao);
    }

    @Test
    void deveAlterarFotosDoRestaurante() {
        Restaurante restaurante = new Restaurante();
        restaurante.setFotos(Arrays.asList("fotoNova1.jpg", "fotoNova2.jpg", "fotoNova3.jpg"));
        List<String> fotos = restaurante.getFotos();
        assertEquals(Arrays.asList("fotoNova1.jpg", "fotoNova2.jpg", "fotoNova3.jpg"), fotos);
    }

    @Test
    void deveCriarRestauranteSemParametros() {
        Restaurante restaurante = new Restaurante();
        String nome = restaurante.getNome();
        String endereco = restaurante.getEndereco();
        String telefone = restaurante.getTelefone();
        String tipoCulinaria = restaurante.getTipoCulinaria();
        String horarioFuncionamento = restaurante.getHorarioFuncionamento();
        String descricao = restaurante.getDescricao();
        List<String> fotosRestaurante = restaurante.getFotos();

        assertEquals(null, nome);
        assertEquals(null, endereco);
        assertEquals(null, telefone);
        assertEquals(null, tipoCulinaria);
        assertEquals(null, horarioFuncionamento);
        assertEquals(null, descricao);
        assertEquals(null, fotosRestaurante);
    }

    @Test
    void deveRetornarTrueQuandoInformacoesBasicasPreenchidas() {
        Restaurante restaurante = new Restaurante(
                1L,
                "gastroReserva",
                "Endereco",
                "1111111",
                "Restaurante Brasileiro",
                "11 as 00h",
                "Restaurante Gastonomico",
                Arrays.asList("foto1.jpg", "foto2.jpg", "foto3.jpg")
        );

        assertEquals(true, restaurante.isInformacoesBasicasPreenchidas());
    }

    @Test
    void deveRetornarFalseQuandoInformacoesBasicasNaoPreenchidas() {
        Restaurante restaurante = new Restaurante();
        assertEquals(false, restaurante.isInformacoesBasicasPreenchidas());
    }

}
