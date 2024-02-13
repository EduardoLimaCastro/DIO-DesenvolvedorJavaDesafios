package com.dio.Explorando_Padroes_de_Projeto_Java.Puro;

public class CepApi {
    private static class CepHolder {
        public static CepApi instancia = new CepApi();
    }

    private CepApi() {
        super();
    }
    public static CepApi getInstancia() {

        return CepApi.CepHolder.instancia;
    }

    public String recuperarCidade(String cep) {
        return "Recife";
    }

}
