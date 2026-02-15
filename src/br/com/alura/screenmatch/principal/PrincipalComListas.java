package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

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

        ArrayList<Titulo> lista = new ArrayList<>();
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
    }
}
