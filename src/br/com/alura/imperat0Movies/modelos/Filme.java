package br.com.alura.imperat0Movies.modelos;

import br.com.alura.imperat0Movies.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
  private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
