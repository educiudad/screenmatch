package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDucacaoEmMinutos();
//    }
//
//
//        public void inclui(Serie s){
//            this.tempoTotal+= s.getDucacaoEmMinutos();
//    }

    public void inclui(Titulo titulo) {
        System.out.println("adicionando tempo total de:" + titulo);
        this.tempoTotal += titulo.getDucacaoEmMinutos();
    }

}



