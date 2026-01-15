public class Produtos {
    private String nome;
    private double preco;


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicardesconto(double preco){
        preco = preco - (preco * 10 / 100);

    }
}

//VERSAO CORRIGIDA

class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual) {
        preco = preco - (preco * percentual / 100);
    }
}