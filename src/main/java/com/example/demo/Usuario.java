package com.example.demo;

public class Usuario {
    // Atributos
    private String cpf;
    private String tel;
    private String nome;

    public Usuario() {

    }
    public Usuario(String cpf, String tel, String nome) {
        this.cpf = cpf;
        this.tel = tel;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "cpf=" + cpf +
                ", tel=" + tel +
                ", nome='" + nome + '\'' +
                '}';
    }

}
