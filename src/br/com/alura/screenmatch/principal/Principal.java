package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefao", 1980);
        //meuFilme.setAnoLancamento(1978);
        meuFilme.setDucacaoEmMinutos( 180);
        System.out.println("Duracao do filme: " + meuFilme.getDucacaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        Filme outroFilme = new Filme("Avatar", 2009);

        //outroFilme.setAnoLancamento(2009);
        outroFilme.setDucacaoEmMinutos(200);

        System.out.println("Total de avaliações;" + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie minhaSerie = new Serie("Breaking bad", 2008);

        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(5);
        minhaSerie.setEpisodiosPorTemporada(12);
        minhaSerie.setMinutosPorEpisodio(50);
        System.out.println("Duracao para maratonar Breaking bad: " + minhaSerie.getDucacaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizaçoes(300);
        filtro.filtra(episodio);

        //Filme filmeEduardo = new Filme();
        var filmeEduardo = new Filme("wiplash", 2014);
        //filmeEduardo.setNome("Wiplash");
        //filmeEduardo.setAnoLancamento(2014);
        filmeEduardo.setDucacaoEmMinutos(200);
        filmeEduardo.avalia(10);

        ArrayList<Filme> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeEduardo);

        System.out.println("tamanho da lista "+ lista.size());
        System.out.println("Primeiro filme "+ lista.get(0).getNome());
        System.out.println("Primeiro filme "+ lista.get(0).toString());
        System.out.println(lista);


    }
}
