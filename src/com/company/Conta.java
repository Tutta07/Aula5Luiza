package com.company;

public class Conta {
    private int numero;
    private String dono;
    private double saldo;

    public Conta(){}
    public Conta(int numero, String dono, double saldo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
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
    public boolean Sacarb(double valor){
        if(this.saldo >= valor){
            this.saldo-=valor;
            return true;
        }
        else
            return false;
    }

    //metodo de taina
    public void Transferencia (double valor){
        this.saldo+=valor;
    }
}
