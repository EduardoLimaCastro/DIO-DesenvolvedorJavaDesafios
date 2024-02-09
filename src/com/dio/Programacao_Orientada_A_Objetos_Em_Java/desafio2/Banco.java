package com.dio.Programacao_Orientada_A_Objetos_Em_Java.desafio2;

import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
