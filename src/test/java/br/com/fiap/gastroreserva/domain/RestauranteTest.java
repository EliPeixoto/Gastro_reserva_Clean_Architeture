package br.com.fiap.gastroreserva.domain;

import br.com.fiap.gastroreserva.entities.Restaurante;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class RestauranteTest {

    @Test
     void deveCadastrarRestaurante(){
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

        assertEquals(1L, restaurante.getId());
        assertEquals("gastroReserva", restaurante.getNome());
        assertEquals("Endereco", restaurante.getEndereco());
        assertEquals("1111111", restaurante.getTelefone());
        assertEquals("Restaurante Brasileiro", restaurante.getTipoCulinaria());
        assertEquals("11 as 00h", restaurante.getHorarioFuncionamento());
        assertEquals("Restaurante Gastonomico", restaurante.getDescricao());
        assertEquals(Arrays.asList("foto1.jpg", "foto2.jpg", "foto3.jpg"), restaurante.getFotos());
    }
}
