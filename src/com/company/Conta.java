package com.company;

public class Conta {
    int numero;
    String dono;
    double saldo;

    //public Conta(){}
    public Conta(int numero, String dono, double saldo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
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

    public void Sacar(double valor){
        if(this.saldo>=valor){
            this.saldo-=valor;
        }
        else{
            System.out.println("O saldo da conta no é suficiente para esa operação");
        }
    }
    public void Transferir(Conta a, Conta b, double valor){
        if(a.saldo >= valor){
            a.saldo -= valor;
            b.saldo+=valor;
        }
        else{
            System.out.println("A sua conta não possui saldo suficiente para realizar a transferência ");
        }

    }
}
