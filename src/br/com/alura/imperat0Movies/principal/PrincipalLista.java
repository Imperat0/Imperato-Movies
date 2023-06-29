package br.com.alura.imperat0Movies.principal;

import br.com.alura.imperat0Movies.modelos.Filme;
import br.com.alura.imperat0Movies.modelos.Serie;
import br.com.alura.imperat0Movies.modelos.Titulo;

import java.util.*;

public class PrincipalLista {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Interestelar ", 2018);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar ", 2022);
        outroFilme.avalia(9);
        Filme filmeDaniel = new Filme("Corra ", 2017);
        filmeDaniel.avalia(6);
        Serie lost = new Serie("Lost ", 2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDaniel);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação" + filme.getClassificacao());
            }

            ArrayList<String> buscaPorArtista = new ArrayList<>();
            buscaPorArtista.add("Adam Sandler");
            buscaPorArtista.add("Tim");
            buscaPorArtista.add("Leonardo");
            System.out.println(buscaPorArtista);

            Collections.sort(buscaPorArtista);
            System.out.println("Depois da ordenação");
            System.out.println(buscaPorArtista);
            System.out.println("lista");

            Collections.sort(lista);
            System.out.println(lista);
            lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
            System.out.println("Ordenando por ano");

        }
    }
}
