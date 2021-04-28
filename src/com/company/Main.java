package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    Conta conta1 = new Conta(2324,"Laura",2000.23);
    Conta conta2 = new Conta(9092,"George",123.40);
    Conta conta3 = new Conta(4567,"Margarita",4000);

	Pessoa pessoa1= new Pessoa("Laura","71098862245","Rua Amalia #123",conta1);
	Pessoa pessoa2 = new Pessoa("George","06534512389","Rua do Bomfim #56",conta2);
	Pessoa pessoa3 = new Pessoa("Margarita","71043276539","Rua Joao Pereira #456",conta3);

        System.out.println("Insira a quantidade que deseja sacar da sua conta");
        double saque = sc.nextDouble();
        System.out.println("Insira o numero da sua conta");
        double conta = sc.nextInt();
        System.out.println("Insira o seu nome");
        String nome= sc.next();

        if(pessoa1.getNome().equalsIgnoreCase(nome) || pessoa2.getNome().equalsIgnoreCase(nome) || pessoa3.getNome().equalsIgnoreCase(nome)){
            if (conta1.numero==conta){
                conta1.Sacar(saque);
                System.out.println("Foram debitados da sua conta " +saque);
                System.out.println("Agora a seu saldo é de: " + conta1.saldo);
            }
            else if (conta2.numero==conta){
                conta2.Sacar(saque);
                System.out.printf("Foram debitados da sua conta %d", +saque);
                System.out.println("Agora a seu saldo é de: " + conta2.saldo);
            }
            else if (conta3.numero==conta){
                conta3.Sacar(saque);
                System.out.printf("Foram debitados da sua conta %d", +saque);
                System.out.println("Agora a seu saldo é de: " + conta3.saldo);
            }
            else {
                System.out.println("O seu número de conta esta errado");
            }

        }
        else{
            System.out.println("Você não possui conta neste banco");
        }

    }
}
