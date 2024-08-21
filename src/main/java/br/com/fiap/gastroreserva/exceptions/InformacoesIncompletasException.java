package br.com.fiap.gastroreserva.exceptions;

public class InformacoesIncompletasException extends RuntimeException {
    public InformacoesIncompletasException(String mensagem) {
        super(mensagem);
    }
}
