package br.com.alura.screenmatch.Funcionario;

public class Desenvolvedor extends Funcionario {

    private double bonus;

    @Override
    public void calcularBonus(){
        salario += salario*bonus;
    }

}
