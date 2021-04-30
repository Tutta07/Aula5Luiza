package com.company;

public class contaCorrente extends Conta {
    public final int TOPE = 100;

    public contaCorrente(int numero, String dono, double saldo) {
        super(numero, dono, saldo);
    }

    @Override
    public boolean Sacar(double valor) {
        double dine = super.getSaldo() + TOPE;
        if (dine >= valor) {
            dine = dine - valor;
            super.setSaldo(dine);
            return true;
        }
            return false;
    }

    }

