package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProfessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluna aluna1 = new Aluna();
        Aluna aluna2 = new Aluna();
        Aluna aluna3 = new Aluna();
        Aluna aluna4 = new Aluna();

        ArrayList<Aluna> alunas= new ArrayList<Aluna>();
        ArrayList<Aluna> chicas = new ArrayList<Aluna>();
        alunas.add(aluna1);
        alunas.add(aluna2);
        //chicas.add(aluna3);
        //chicas.add(aluna4);
        Professor professor1 = new Professor("Roberto","Informatica","34567891234",4000,alunas);
        //Professor professor2 = new Professor("Andre","Biomecanica","54321678234",5000,chicas);

        System.out.printf("O nome do professor é %s e o seu curso é %s",professor1.getNome(),professor1.getCurso());
        System.out.printf("\nIndique a quantidade de aulas ministradas pelo professor %s: ",professor1.getNome());
        int aulas = sc.nextInt();
        System.out.printf("O salario do professor %s é %.2f: \n",professor1.getNome(), professor1.setSalarioProfessor(aulas));
        System.out.println("Insira o nome da primeira aluna");
        String nome1=sc.next();
        System.out.printf("Insira a primeira nota da aluna %s ", nome1);
        int nota1=sc.nextInt();
        System.out.printf("Insira a segunda nota da aluna %s ", nome1);
        int nota2 = sc.nextInt();
        System.out.println("Insira o nome da segunda aluna");
        String nome2=sc.next();
        System.out.printf("Insira a primeira nota da aluna %s ", nome2);
        int nota3=sc.nextInt();
        System.out.printf("Insira a segunda nota da aluna %s ", nome2);
        int nota4 = sc.nextInt();
        aluna1.setNome(nome1);
        aluna1.setNota1(nota1);
        aluna1.setNota2(nota2);
        aluna2.setNome(nome2);
        aluna2.setNota1(nota3);
        aluna2.setNota2(nota4);

        double media1= aluna1.calcularMedia(nota1,nota2);
        double media2 = aluna2.calcularMedia(nota3,nota4);
        if(media1>=7){
            System.out.printf("A aluna %s esta aprovada com uma media de %.2f\n", aluna1.getNome(),media1);
        }else{
            System.out.printf("A aluna %s esta reprovada",aluna1.getNome());
        }

        if (media2 >= 7) {
            System.out.printf("A aluna %s esta aprovada com uma media de %.2f\n", aluna2.getNome(),media2);
        }
        else{
            System.out.printf("A aluna %s esta reprovada",aluna2.getNome());
        }

    }
}
