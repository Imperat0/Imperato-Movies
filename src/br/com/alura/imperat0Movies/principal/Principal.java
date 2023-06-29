package br.com.alura.imperat0Movies.principal;

import br.com.alura.imperat0Movies.calculos.Recomendacao;
import br.com.alura.imperat0Movies.modelos.Episodio;
import br.com.alura.imperat0Movies.modelos.Filme;
import br.com.alura.imperat0Movies.modelos.Serie;
import br.com.alura.imperat0Movies.calculos.CalculadoraDeTempo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Interestelar", 2014);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(12);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar lost " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2022);
        outroFilme.setDuracaoEmMinutos(260);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        Recomendacao recomendacao = new Recomendacao();
        recomendacao.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        recomendacao.filtra(episodio);

        Filme filmeDaniel = new Filme("Corra", 2016);
        filmeDaniel.setDuracaoEmMinutos(200);
        filmeDaniel.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDaniel);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);


    }
}
