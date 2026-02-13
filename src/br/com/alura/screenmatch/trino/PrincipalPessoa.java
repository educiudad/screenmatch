package br.com.alura.screenmatch.trino;

import br.com.alura.screenmatch.modelos.Filme;

import java.util.ArrayList;

public class PrincipalPessoa {
     public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Maria");
        p1.setIdade(30);
        Pessoa p2 = new Pessoa();
        p2.setNome("ana");
        p2.setIdade(30);
        Pessoa p3 = new Pessoa();
        p3.setNome("luiza");
        p3.setIdade(30);

        ArrayList<Pessoa> listaDePessoa = new ArrayList<>();
        listaDePessoa.add(p1);
        listaDePessoa.add(p2);
        listaDePessoa.add(p3);

        System.out.println("Tamanho da lista "+ listaDePessoa.size());
        System.out.println("Primeira Pessoa: "+ listaDePessoa.get(0).getNome());
        System.out.println("lista de pessoa" + listaDePessoa);
    }
}
