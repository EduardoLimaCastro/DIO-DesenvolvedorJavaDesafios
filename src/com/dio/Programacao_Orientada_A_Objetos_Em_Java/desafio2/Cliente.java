package com.dio.Programacao_Orientada_A_Objetos_Em_Java.desafio2;

public class Cliente {
    private String nome;
    private Conta conta;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
