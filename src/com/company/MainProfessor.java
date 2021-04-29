package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProfessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluna aluna1 = new Aluna("Maria",6,8);
        Aluna aluna2 = new Aluna("Rosa",8,10);
        Aluna aluna3 = new Aluna("Taina",9,9);
        Aluna aluna4 = new Aluna("Marielen",6,4);
        ArrayList<Aluna> alunas= new ArrayList<Aluna>();
        ArrayList<Aluna> chicas = new ArrayList<Aluna>();
        alunas.add(aluna1);
        alunas.add(aluna2);
        chicas.add(aluna3);
        chicas.add(aluna4);
        Professor professor1 = new Professor("Roberto","Informatica","34567891234",4000,alunas);
        Professor professor2 = new Professor("Andre","Biomecanica","54321678234",5000,chicas);

        System.out.printf("O nome do professor é %s e o seu curso é %s",professor1.getNome(),professor1.getCurso());
    }
}
