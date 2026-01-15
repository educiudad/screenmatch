public class PessoaIdade {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void avaliaIdade(int idade) {
        if (idade < 18) {
            System.out.println("menor de idade");
        } else {
            System.out.println("maior de idade");
        }
    }
}


//VERSAO CORRIGIDA

class IdadePessoa {
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

    public void verificarIdade() {
        if (idade < 18) {
            System.out.println("Menor de idade");
        } else {
            System.out.println("Maior de idade");
        }
    }
}
