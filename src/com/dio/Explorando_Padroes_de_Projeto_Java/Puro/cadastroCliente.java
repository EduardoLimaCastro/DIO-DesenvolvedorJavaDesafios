package com.dio.Explorando_Padroes_de_Projeto_Java.Puro;

public class cadastroCliente {
    private cadastroCliente(){
        super();
    }
    public static void gravarCliente(String nome) {
        System.out.println("Cliente salvo no sistema");
    }
}
