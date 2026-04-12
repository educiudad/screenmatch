package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        var filmeEduardo = new Filme("wiplash", 2014);
        filmeEduardo.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2009);
        outroFilme.avalia(7);
        Filme meuFilme = new Filme("O poderoso chefao", 1980);
        meuFilme.avalia(8);
        Serie minhaSerie = new Serie("Breaking bad", 2008);

            Filme f1 = filmeEduardo;

        List<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeEduardo);
        lista.add(minhaSerie);

        for(Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Calssificação: " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorARtistas = new ArrayList<>();
        buscaPorARtistas.add("aDam Sandler");
        buscaPorARtistas.add("toreto");
        buscaPorARtistas.add("the rock");System.out.println("Busca por artistas: " + buscaPorARtistas);

        Collections.sort(buscaPorARtistas);
        System.out.println("depoi da ordenação: " + buscaPorARtistas);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo :: getAnoLancamento));
        System.out.println("Ordenando por ano de lançamento");
        System.out.println(lista);
    }
}
