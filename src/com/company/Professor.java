package com.company;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private String curso;
    private String cpf;
    private double salario;
    private ArrayList <Aluna> alunas;

    public Professor(String nome, String curso, String cpf, double salario, ArrayList<Aluna> alunas) {
        this.nome = nome;
        this.curso = curso;
        this.cpf = cpf;
        this.salario = salario;
        this.alunas = alunas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
