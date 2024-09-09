package br.com.fiap.gastroreserva.usecases;

import br.com.fiap.gastroreserva.entities.RestauranteEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class EventoCadastroRestaurante {
    private static final Logger logger = LoggerFactory.getLogger(EventoCadastroRestaurante.class);
    public void emitirEventoSucesso(RestauranteEntity restaurante) {
        logger.info("Evento de sucesso emitido para o restaurante: {}", restaurante.getNome());
    }

    public void emitirEventoFalha(RestauranteEntity restaurante, String motivo) {
        logger.error("Evento de falha emitido para o restaurante: {}. Motivo: {}", restaurante.getNome(), motivo);

    }
}
