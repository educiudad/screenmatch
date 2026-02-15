package br.com.eduar.rpg;

public class Personagens {
    private String nome;
    private int vida;
    private int dano;
    private int vidaMaxima;
    private int curasRestantes;

    public Personagens(String nome, int dano, int vidaMaxima, int curasRestantes){
        this.nome = nome;
        this.dano = dano;
        this.vidaMaxima = vidaMaxima;
        this.curasRestantes = curasRestantes;
        this.vida = vidaMaxima; // obrigatório
    }

    public String getNome() {
        return nome;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public void setcurasRestantes(int curasRestantes) {
        this.curasRestantes = curasRestantes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public int getDano() {
        return dano;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getcurasRestantes() {
        return curasRestantes;
    }

    public void receberDano(int danoRecebido) {
        this.vida -= danoRecebido;

        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    public int atacar(Personagens alvo) {
        alvo.receberDano(this.dano);
        return this.dano;
    }

    public boolean estaVivo() {
        if (this.vida > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean curar() {
        if (curasRestantes > 0) {
            int valorCura = 50;
            this.vida += valorCura;

            if (this.vida > this.vidaMaxima) {
                this.vida = this.vidaMaxima;
            }

            curasRestantes--;
            return true;
        } else {
            return false;
        }
    }


    public int getVidaMaxima() {
        return vidaMaxima;
    }
}




