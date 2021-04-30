package com.company;

public class Gerente extends funcionario{
    private  int numeroDeFuncionario;

    public int getNumeroDeFuncionario() {
        return numeroDeFuncionario;
    }

    public void setNumeroDeFuncionario(int numeroDeFuncionario) {
        this.numeroDeFuncionario = numeroDeFuncionario;
    }
    public void verInformacoes(){
        super.verInformacoes();
        System.out.println("O numero de funcionarios gerenciados é:" +this.numeroDeFuncionario);
    }
}
