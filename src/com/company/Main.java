package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta conta1 = new Conta(2324, "Laura", 2000.23);
        Conta conta2 = new Conta(9092, "George", 123.40);
        Conta conta3 = new Conta(4567, "Margarita", 4000);

        Pessoa pessoa1 = new Pessoa("Laura", "71098862245", "Rua Amalia #123", conta1);
        Pessoa pessoa2 = new Pessoa("George", "06534512389", "Rua do Bomfim #56", conta2);
        Pessoa pessoa3 = new Pessoa("Margarita", "71043276539", "Rua Joao Pereira #456", conta3);



//        System.out.println("Insira o seu nome");
//        String nome = sc.next();
//        System.out.println("Insira o numero da sua conta");
//        int conta = sc.nextInt();
//        String operacao = "";
//        if (pessoa1.getNome().equalsIgnoreCase(nome) || pessoa2.getNome().equalsIgnoreCase(nome) || pessoa3.getNome().equalsIgnoreCase(nome)) {
//            if (pessoa1.getConta().getNumero() == conta || pessoa2.getConta().getNumero() == conta || pessoa3.getConta().getNumero() == conta) {
//                System.out.println("Indique qual operação você vai realizar\n 1. Saque\n 2. Transferência\n ");
//                operacao = sc.next();
//            } else {
//                System.out.println("Essa conta não pertence a este banco");
//            }
//        } else {
//            System.out.println("Você não tem conta neste banco");
//        }
//
//        if (operacao.equalsIgnoreCase("Saque")) {
//            System.out.println("Insira a quantidade que deseja sacar da sua conta");
//            double saque = sc.nextDouble();
//            if (conta1.getNumero() == conta) {
//                conta1.Sacar(saque);
//                System.out.println("Foram debitados da sua conta " + saque + "Reais");
//                System.out.println("Agora a seu saldo é de: " + conta1.getSaldo());
//            } else if (conta2.getNumero() == conta) {
//                conta2.Sacar(saque);
//                System.out.printf("Foram debitados da sua conta %d", +saque + "Reais");
//                System.out.println("Agora a seu saldo é de: " + conta2.getSaldo());
//            } else {
//                conta3.Sacar(saque);
//                System.out.printf("Foram debitados da sua conta %d", +saque + "Reais");
//                System.out.println("Agora a seu saldo é de: " + conta3.getSaldo());
//            }
//
//        } else if (operacao.equalsIgnoreCase("Transferencia")) {
//
//            System.out.println("Insira o numero da conta de destino");
//            int destino = sc.nextInt();
//            System.out.println("Indique o monto a ser transferido");
//            double transferencia = sc.nextDouble();
//
//            if (conta1.getNumero() == conta && conta1.getSaldo() >= transferencia && conta2.getNumero() == destino) {
//                conta1.Transferir(conta1, conta2, transferencia);
//                System.out.println("Foram transferidos da sua conta " + transferencia + " Reais");
//                System.out.println("Agora a seu saldo é de: " + conta1.getSaldo());
//            } else if (conta1.getNumero() == conta && conta1.getSaldo() >= transferencia && conta3.getNumero() == destino) {
//                conta1.Transferir(conta1, conta3, transferencia);
//                System.out.println("Foram transferidos da sua conta " + transferencia + " Reais");
//                System.out.println("Agora a seu saldo é de: " + conta1.getSaldo());
//            } else if (conta2.getNumero() == conta && conta2.getSaldo() >= transferencia && conta2.getNumero() == destino) {
//                conta1.Transferir(conta2, conta3, transferencia);
//                System.out.println("Foram transferidos da sua conta " + transferencia + " Reais");
//                System.out.println("Agora a seu saldo é de: " + conta2.getSaldo());
//            } else if (conta2.getNumero() == conta && conta2.getSaldo() >= transferencia && conta3.getNumero() == destino) {
//                conta1.Transferir(conta2, conta3, transferencia);
//                System.out.println("Foram transferidos da sua conta " + transferencia + " Reais");
//                System.out.println("Agora a seu saldo é de: " + conta2.getSaldo());
//            } else if (conta3.getNumero() == conta && conta3.getSaldo() >= transferencia && conta1.getNumero() == destino) {
//                conta1.Transferir(conta3, conta3, transferencia);
//                System.out.println("Foram transferidos da sua conta " + transferencia + " Reais");
//                System.out.println("Agora a seu saldo é de: " + conta3.getSaldo());
//            } else if (conta3.getNumero() == conta && conta3.getSaldo() >= transferencia && conta2.getNumero() == destino) {
//                conta1.Transferir(conta3, conta3, transferencia);
//                System.out.println("Foram transferidos da sua conta " + transferencia + " Reais");
//                System.out.println("Agora a seu saldo é de: " + conta3.getSaldo());
//            } else {
//                System.out.println("Não é possivel realizar a transferência");
//            }
//
//        }
//        System.out.printf(" %s têm %.2f \n", pessoa1.getNome(), pessoa1.getConta().getSaldo());
//        System.out.printf(" %s têm %.2f \n", pessoa2.getNome(), pessoa2.getConta().getSaldo());
//        System.out.printf(" %s têm %.2f \n", pessoa3.getNome(), pessoa3.getConta().getSaldo());
//
     //CODIGO DE TAINA

        //PESSOA REALIZA SAQUE
        boolean sacar = pessoa1.getConta().Sacarb(200);
        if(sacar == true){
            System.out.println("Saque realizado com sucesso!! ");
        } else {
            System.out.println("Saldo indisponivel!");
        }
        //PESSOA 2 TRANSFERIR DINHERO PARA PESSOA3
        System.out.println("Informe o valor da transferencia: ");
        int valor2 = sc.nextInt();
        boolean sacar1 = pessoa2.getConta().Sacarb(valor2);
        if(sacar1 == true){
            System.out.println("Saque realizado com sucesso!! ");
        } else {
            System.out.println("Saldo indisponivel!");
        }

        //PESSOA 3
        System.out.println("Informe o valor da transferencia: ");
        int valor3 = sc.nextInt();
        boolean sacar2 = pessoa2.getConta().Sacarb(valor3);
        if(sacar2 == true){
            System.out.println("Saque realizado com sucesso!! ");
        } else {
            System.out.println("Saldo indisponivel!");
        }
        //IMPRIMIR OS VALORES
        System.out.printf(" %s têm %.2f \n", pessoa1.getNome(), pessoa1.getConta().getSaldo());
        System.out.printf(" %s têm %.2f \n", pessoa2.getNome(), pessoa2.getConta().getSaldo());
        System.out.printf(" %s têm %.2f \n", pessoa3.getNome(), pessoa3.getConta().getSaldo());



    }
}


