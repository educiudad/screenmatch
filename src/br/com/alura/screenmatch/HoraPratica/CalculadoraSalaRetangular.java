package br.com.alura.screenmatch.HoraPratica;

public class CalculadoraSalaRetangular implements ConversaoFinanceira {

    private int altura;
    private int largura;


    @Override
    public double getcalcularArea(int altura, int largura) {
        return altura * largura;
    }

    @Override
    public double getcalcularPerimetro(int altura, int largura) {
        return 2* (altura + largura);
    }
}
