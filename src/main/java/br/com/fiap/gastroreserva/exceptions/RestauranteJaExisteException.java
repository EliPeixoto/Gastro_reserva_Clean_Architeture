package br.com.fiap.gastroreserva.exceptions;

public class RestauranteJaExisteException extends RuntimeException {
    public RestauranteJaExisteException(String mensagem) {
        super(mensagem);
    }
}