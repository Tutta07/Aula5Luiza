package com.company;

public class Conta {
    protected int numero;
    protected String dono;
    protected double saldo;
    protected static int totalDeContas=0;

    public int getTotalDeContas() {
        return Conta.totalDeContas;
    }

    public Conta(int numero, String dono, double saldo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        this.totalDeContas =  Conta.totalDeContas +1;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public  boolean Sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -=valor;
            return true;
        }
        return false;

    }
    public void verInformacoes(){
        System.out.println("--------------INFORMAÇÕES DA CONTA------------");
        System.out.println("O nome do cliente é: "+ this.dono);
        System.out.println("O numero da conta é: "+ this.numero);
        System.out.println("O saldo do cliente é: "+ this.saldo);
    }


}
