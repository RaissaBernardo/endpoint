package com.example.demo;

public class Usuario {
    // Atributos
    private int cpf;
    private int tel;
    private String nome;

    public Usuario() {

    }
    public Usuario(int cpf, int tel, String nome) {
        this.cpf = cpf;
        this.tel = tel;
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
