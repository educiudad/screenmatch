package br.com.alura.screenmatch.Animal;

public class Animal {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void fazerSom(){
        System.out.println("som");
    }
}
