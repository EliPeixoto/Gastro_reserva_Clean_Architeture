package br.com.fiap.gastroreserva.exceptions;

public class PermissaoNegadaException extends RuntimeException {
    public PermissaoNegadaException(String mensagem) {
        super(mensagem);
    }
}