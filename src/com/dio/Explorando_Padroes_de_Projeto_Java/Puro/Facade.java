package com.dio.Explorando_Padroes_de_Projeto_Java.Puro;

public class Facade {
    public void migrarCliente(String nome, String cep){
        CepApi.getInstancia().recuperarCidade(cep);
    }
}
