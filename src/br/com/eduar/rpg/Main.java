package br.com.eduar.rpg;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Personagens personagen1 = new Personagens("Victor LOpes", 40, 100, 5);
        Personagens personagen2 = new Personagens("Joao gabriel", 20, 120, 1);
        Personagens personagen3 = new Personagens("Eduardo sonego", 15, 200, 3);
        Personagens personagen4 = new Personagens("Eduardo Ciudad", 300, 10000, 0);

        ArrayList<Personagens> personagensJogaveis = new ArrayList<>();

        personagensJogaveis.add(personagen1);
        personagensJogaveis.add(personagen2);
        personagensJogaveis.add(personagen3);
        personagensJogaveis.add(personagen4);

        System.out.println("===== ESCOLHA SEU HERÓI =====");
        System.out.println("1 - Victor LOpes");
        System.out.println("2 - Joao Gabriel");
        System.out.println("3 - Eduardo sonego");




        int escolha = sc.nextInt();


        Personagens jogador = personagensJogaveis.get(escolha - 1);



        ArrayList<Personagens> inimigos = new ArrayList<>();

        for (int i = 0; i < personagensJogaveis.size(); i++) {
            if (i != escolha - 1) {
                inimigos.add(personagensJogaveis.get(i));
            }
        }


        for (Personagens inimigoAtual : inimigos) {

            System.out.println("\n==============================");
            System.out.println("Um novo inimigo apareceu: " + inimigoAtual.getNome());
            System.out.println("==============================");



            inimigoAtual.setVida(inimigoAtual.getVidaMaxima());

            while (jogador.estaVivo() && inimigoAtual.estaVivo()) {

                System.out.println("Sua vida: " + jogador.getVida());
                System.out.println("Vida do inimigo: " + inimigoAtual.getVida());

                System.out.println("1 - Atacar");
                System.out.println("2 - Curar (curas restantes: " + jogador.getcurasRestantes() + ")");

                int acao = sc.nextInt();

                if (acao == 1) {
                    int danoCausado = jogador.atacar(inimigoAtual);
                    System.out.println(jogador.getNome() + " causou " + danoCausado + " de dano");

                } else if (acao == 2) {

                    if (jogador.curar()) {
                        System.out.println("Você se curou!");
                    } else {
                        System.out.println("Sem curas!");
                    }

                } else {
                    System.out.println("Opção inválida");
                    continue;
                }


                if (inimigoAtual.estaVivo()) {
                    int dano = inimigoAtual.atacar(jogador);
                    System.out.println(inimigoAtual.getNome() + " te causou " + dano + " de dano");
                }
            }


            if (!jogador.estaVivo()) {
                System.out.println("\n☠️ VOCÊ FOI DERROTADO MOGGADO PELO MOGGADOR EDUARDO CIUDAD NAO SOBROU NADA!!!!!");
                break;
            } else {
                System.out.println("\nVocê moggou o betinha  " + inimigoAtual.getNome() + "!");
            }
        }


        if (jogador.estaVivo()) {
            System.out.println("\n🏆 Vc moggou todos os betinhas nunca sobra nada");
        }

        sc.close();
    }
}