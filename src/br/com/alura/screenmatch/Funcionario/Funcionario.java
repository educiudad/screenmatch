package br.com.alura.screenmatch.Funcionario;

public class Funcionario {
    private String  nome;
    protected double salario;
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void calcularBonus(){
        salario += salario*bonus;
    }

}
