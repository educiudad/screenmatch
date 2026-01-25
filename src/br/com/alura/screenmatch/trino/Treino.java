package br.com.alura.screenmatch.trino;

public class Treino {
    private int ano;
    private String modelo;
    private double preco1;
    private double preco2;
    private double preco3;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public void setPrecos(double p1, double p2, double p3) {
        preco1 = p1;
        preco2 = p2;
        preco3 = p3;
    }

    public double getMEnorPreco(){
        double menor = preco1;

        if (menor > preco2){
            menor = preco2;
        }
        if (menor > preco3){
            menor = preco3;
        }
        return menor;
    }


    public double getMaiorPreco() {
        double maior = preco1;

        if (preco2 > maior) {
            maior = preco2;
        }

        if (preco3 > maior) {
            maior = preco3;
        }

        return maior;
    }
}
