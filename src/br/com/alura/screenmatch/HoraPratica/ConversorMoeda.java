package br.com.alura.screenmatch.HoraPratica;

public class ConversorMoeda implements onversaoFinanceira {

    private static final double TAXA_DOLAR = 4.95;

    @Override
    public double getconverterDolarParaReal(double valorEmDolar) {
       return valorEmDolar * TAXA_DOLAR;
    }
}
