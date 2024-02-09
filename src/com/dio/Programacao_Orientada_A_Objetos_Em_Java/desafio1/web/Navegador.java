package com.dio.Programacao_Orientada_A_Objetos_Em_Java.desafio1.web;

public class Navegador implements Browser{


    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }
}
