package com.company;

public class mainFuncionario {
    public static void main(String[] args) {

        //Criando um funcionario
        funcionario FuncionarioLavinia = new funcionario();
        Gerente gerenteBIa = new Gerente();

       FuncionarioLavinia.setNome("Lavinha");
       FuncionarioLavinia.setCpf("23456787654");
       FuncionarioLavinia.setSalario(10000);
       FuncionarioLavinia.setSenha(6543);
      //Imprimir Lavinha
        boolean lavinhaAutorizada = FuncionarioLavinia.autenticar(6543);
        if (lavinhaAutorizada==true){
            FuncionarioLavinia.verInformacoes();
        }


        gerenteBIa.setNome("Bia");
        gerenteBIa.setCpf("78945632165");
        gerenteBIa.setSalario(70000);
        gerenteBIa.setSenha(7654);
        gerenteBIa.setNumeroDeFuncionario(200);
        gerenteBIa.verInformacoes();

        boolean biaAutorizada = FuncionarioLavinia.autenticar(7654);
        if (biaAutorizada==true){
            gerenteBIa.verInformacoes();
        }

    }
}
