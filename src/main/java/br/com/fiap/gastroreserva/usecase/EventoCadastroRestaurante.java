package br.com.fiap.gastroreserva.usecase;

import br.com.fiap.gastroreserva.entities.Restaurante;

public class EventoCadastroRestaurante {
    public void emitirEventoSucesso(Restaurante restaurante) {
        System.out.println("Evento de sucesso emitido para o restaurante: " + restaurante.getNome());
    }

    public void emitirEventoFalha(Restaurante restaurante, String motivo) {
        System.out.println("Evento de falha emitido para o restaurante: " + restaurante.getNome() + ". Motivo: " + motivo);

    }
}
