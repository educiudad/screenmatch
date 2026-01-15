public class aluno {
    private  String nome;
    private double nota;
    private double media;
    private int numeroDeNotas;
    private double somaNota;

    public double getSomaNota() {
        return somaNota;
    }

    public double getMedia() {
        return media;
    }

    public int getNumeroDeNotas() {
        return numeroDeNotas;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setNumeroDeNotas(int numeroDeNotas) {
        this.numeroDeNotas = numeroDeNotas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setSomaNota(double somaNota) {
        this.somaNota = somaNota;
    }

    public void mediaAluno(){
        media = somaNota/numeroDeNotas;
    }
}


//RESOLUCAO

class Aluno {

    private String nome;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        return soma / notas.length;
    }
}


//                                      EXERCICIO 2

class Livro {
    private String nome;
    private String autor;

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Autor: " + autor);
    }
}