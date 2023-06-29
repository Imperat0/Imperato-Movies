package br.com.alura.imperat0Movies.excecao;

public class ErroDeConversaoDeAnoException extends RuntimeException{
    public String mensagem;
    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
