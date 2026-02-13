package br.com.alura.screenmatch.trino;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String  toString(){
       return "nome: " + this.nome + " idade: " + this.idade;
    }
}
