package br.com.eduar.rpg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personagens jogador = new Personagens();
        Personagens inimigo = new Personagens();
        Scanner sc = new Scanner(System.in);


        jogador.setNome("Victor Lopes");
        jogador.setDano(10);
        jogador.setVida(40);
        jogador.setcurasRestantes(3);
        inimigo.setNome("Eduardo sonego");
        inimigo.setDano(7);
        inimigo.setVida(90);


        jogador.setVidaMaxima(40);
        inimigo.setVidaMaxima(90);
        while (jogador.estaVivo() && inimigo.estaVivo()) {
            System.out.println("sua vida:" + jogador.getVida());
            System.out.println("vida do seu inimigo:" + inimigo.getVida());


            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Atacar");
            System.out.println("2 - Curar(curas restantes: " + jogador.getcurasRestantes() + ")");
            int escolha = sc.nextInt();


            if (escolha == 1) {
                int danoCausado = jogador.atacar(inimigo);
                System.out.println(
                        jogador.getNome() + " atacou " + inimigo.getNome() + " e causou " + danoCausado + " de dano"
                );

            } else if (escolha == 2) {

                boolean curou = jogador.curar();
                if (curou) {
                    System.out.println("Você se curou!");
                } else {
                    System.out.println("Você não tem mais curas disponíveis!");
                }

            } else {
                System.out.println("Opção inválida");
                continue;
            }

            if(jogador.estaVivo()) {
                int danoInimigo = inimigo.atacar(jogador);
                System.out.println(
                        inimigo.getNome() + " atacou " + jogador.getNome() + " e causou " + danoInimigo + " de dano"
                );
            }

        }

        if  (jogador.estaVivo()) {
            System.out.println("🎉 PARABÉNS! Você venceu a batalha!");
        } else {
            System.out.println("☠️ VOCÊ FOI DERROTADO!");
        }

        sc.close();
    }
}
