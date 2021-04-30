package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Criando um cliente
        Pessoas cliente = new Pessoas("Nelismy","34567890213","Rua do barquito");

        //Criando uma conta
        Conta conta = new Conta(2324,"Nelismy",2000);

        //Atribuir conta ao cliente
        cliente.setConta(conta);

        //valor do total de contas
        System.out.println("Total de contas: "+ conta.getTotalDeContas());

        //Criando contaPoupanca
        contaPoupanca poupanca = new contaPoupanca(2324,"Michel",2000,9290);

        //Criando contaCorrente
        contaCorrente corrente = new contaCorrente(5657,"Laura",100);

        // Saques
        poupanca.Sacar(1000);
        corrente.Sacar(100);
        conta.Sacar(500);

        //Visualização das info
        poupanca.verInformacoes();
        corrente.verInformacoes();
        conta.verInformacoes();
    }
}
