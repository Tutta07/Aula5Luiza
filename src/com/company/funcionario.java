package com.company;

public class funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;
    protected int senha;

    public boolean autenticar(int senha){
        if(this.senha == senha){
            System.out.println("Acesso permitido!");
            return true;
        }
        else {
            System.out.println("Acceso negado!!");
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    public void verInformacoes(){
        System.out.println("--------------INFORMAÇÕES DO FUNCIONARIO------------");
        System.out.println("O nome do funcionario é: "+ this.nome);
        System.out.println("O salario do funcionario é: "+ this.salario);
        System.out.println("O CPF do funcionario é: "+ this.cpf);
    }
}
