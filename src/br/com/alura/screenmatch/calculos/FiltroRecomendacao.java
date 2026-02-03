package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {



    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("esta entre os favoritos");
        } else if (classificavel.getClassificacao() >= 3) {
            System.out.println("muito bem avaliado");
        }else {
            System.out.println("coloca pra assistir depois");
        }
    }
}
