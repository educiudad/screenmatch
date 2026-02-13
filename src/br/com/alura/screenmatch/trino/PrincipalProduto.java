package br.com.alura.screenmatch.trino;

import java.util.ArrayList;

public class PrincipalProduto {
     public static void main(String[] args) {
        Produto produto1 = new Produto("relogio", 100);

        Produto produto2 = new Produto("relogio mais bonito", 300);

        Produto produto3 = new Produto("relogio mais caro", 2000);


        ArrayList<Produto> ListaProdutos = new ArrayList<>();
        ListaProdutos.add(produto1);
        ListaProdutos.add(produto2);
        ListaProdutos.add(produto3);

         System.out.println("tamanho da lista" + ListaProdutos.size());
         System.out.println("prduto indice zero" +  ListaProdutos.get(0).getNome());
         System.out.println(ListaProdutos);
    }
}
