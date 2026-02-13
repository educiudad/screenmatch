package br.com.alura.screenmatch.trino;

public class ProdutoPerecivel extends Produto{
    public ProdutoPerecivel(String nome, double preco) {
        super(nome, preco);
    }

    private int dataValidade;

}
