package br.com.eduar.rpg;

import java.util.ArrayList;

public class ArrayPersonagens {
    public static void main(String[] args) {
    Personagens personagen1 = new Personagens("Victor LOpes", 30, 100, 5);
    Personagens personagen2 = new Personagens("Joao gabriel", 50, 120, 1);
    Personagens personagen3 = new Personagens("Eduardo sonego", 15, 200, 3);

        ArrayList<Personagens> personagensJogaveis = new ArrayList<>();

        personagensJogaveis.add(personagen1);
        personagensJogaveis.add(personagen2);
        personagensJogaveis.add(personagen3);
    }

}
