package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private String nome;
    private int numero;
    private Serie serie;
    private int totalVisualizaçoes;

    public int getTotalVisualizaçoes() {
        return totalVisualizaçoes;
    }

    public void setTotalVisualizaçoes(int totalVisualizaçoes) {
        this.totalVisualizaçoes = totalVisualizaçoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizaçoes > 100){
            return 4;
        }
        else {
            return 2;
        }

    }
}
