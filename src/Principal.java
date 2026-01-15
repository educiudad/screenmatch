import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefao");
        meuFilme.setAnoLancamento(1978);
        meuFilme.setDucacaoEmMinutos( 180);
        System.out.println("Duracao do filme: " + meuFilme.getDucacaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações;" + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Breaking bad");
        minhaSerie.setAnoLancamento(2008);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(5);
        minhaSerie.setEpisodiosPorTemporada(12);
        minhaSerie.setMinutosPorEpisodio(50);
        System.out.println("Duracao do filme: " + meuFilme.getDucacaoEmMinutos());

    }
}
